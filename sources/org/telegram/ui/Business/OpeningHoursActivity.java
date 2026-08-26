package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class OpeningHoursActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public String currentTimezoneId;
    public ArrayList[] currentValue;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public boolean enabled;
    public UniversalRecyclerView listView;
    public String timezoneId;
    public ArrayList[] value;
    public boolean valueSet;

    public final class Period {
        public int end;
        public int start;

        public Period(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public static String timeToString(int i) {
            int i2 = i % 60;
            Calendar calendar = Calendar.getInstance();
            calendar.set(0, 0, 0, ((i - i2) / 60) % 24, i2);
            String str = LocaleController.getInstance().getFormatterConstDay().format(calendar.getTime());
            return i > 1440 ? LocaleController.formatString(R.string.BusinessHoursNextDay, str) : str;
        }

        public final String toString() {
            return timeToString(this.start) + " - " + timeToString(this.end);
        }
    }

    public OpeningHoursActivity() {
        super(null);
        this.currentValue = null;
        this.value = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static ArrayList[] getDaysHours(ArrayList arrayList) {
        int i;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i2 = 0; i2 < 7; i2++) {
            arrayListArr[i2] = new ArrayList();
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i3);
            int i4 = tL_businessWeeklyOpen.start_minute;
            int i5 = i4 % 1440;
            arrayListArr[(i4 / 1440) % 7].add(new Period(i5, (tL_businessWeeklyOpen.end_minute - i4) + i5));
        }
        int i6 = 0;
        while (i6 < 7) {
            int i7 = i6 * 1440;
            int i8 = i6 + 1;
            int i9 = i8 * 1440;
            int i10 = i7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
                if (tL_businessWeeklyOpen2.start_minute <= i10 && (i = tL_businessWeeklyOpen2.end_minute) >= i10) {
                    i10 = i + 1;
                }
            }
            if (i10 >= i9) {
                int i12 = (i6 + 6) % 7;
                if (!arrayListArr[i12].isEmpty() && ((Period) zziq.m(1, arrayListArr[i12])).end >= 1440) {
                    ((Period) zziq.m(1, arrayListArr[i12])).end = 1439;
                }
                int iMin = Math.min((i10 - i7) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i6 + 8) % 7];
                if (iMin >= 1440 && !arrayList2.isEmpty() && ((Period) arrayList2.get(0)).start < iMin - 1440) {
                    iMin = ((Period) arrayList2.get(0)).start + 1439;
                }
                arrayListArr[i6].clear();
                arrayListArr[i6].add(new Period(0, iMin));
            } else {
                int i13 = i8 % 7;
                if (!arrayListArr[i6].isEmpty() && !arrayListArr[i13].isEmpty()) {
                    Period period = (Period) zziq.m(1, arrayListArr[i6]);
                    Period period2 = (Period) arrayListArr[i13].get(0);
                    int i14 = period.end;
                    if (i14 > 1440 && i14 - 1439 == period2.start) {
                        period.end = 1439;
                        period2.start = 0;
                    }
                }
            }
            i6 = i8;
        }
        return arrayListArr;
    }

    public static String getPeriodsValue(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (isFull(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String string = "";
        for (int i = 0; i < arrayList.size(); i++) {
            Period period = (Period) arrayList.get(i);
            if (i > 0) {
                string = zzhr.m(string, "\n");
            }
            StringBuilder sbM = Log.m(string);
            sbM.append(Period.timeToString(period.start));
            sbM.append(" - ");
            sbM.append(Period.timeToString(period.end));
            string = sbM.toString();
        }
        return string;
    }

    public static boolean isFull(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Period period = (Period) arrayList.get(i2);
            if (i < period.start) {
                return false;
            }
            i = period.end;
        }
        return i == 1439 || i == 1440;
    }

    public static String toString(int i, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] daysHours = getDaysHours(tL_businessWorkHours.weekly_open);
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb.append("\n");
        }
        for (int i2 = 0; i2 < 7; i2++) {
            ArrayList arrayList = daysHours[i2];
            String displayName = DayOfWeek.values()[i2].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb.append(": ");
            if (isFull(arrayList)) {
                sb.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    Period period = (Period) arrayList.get(i3);
                    sb.append(Period.timeToString(period.start));
                    sb.append(" - ");
                    sb.append(Period.timeToString(period.end));
                }
            }
            sb.append("\n");
        }
        TLRPC.TL_timezone tL_timezoneFindTimezone = TimezonesController.getInstance(i).findTimezone(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / 1000) - (tL_timezoneFindTimezone == null ? 0 : tL_timezoneFindTimezone.utc_offset)) / 60 != 0 && tL_timezoneFindTimezone != null) {
            int i4 = R.string.BusinessHoursCopyFooter;
            TimezonesController.getInstance(i);
            sb.append(LocaleController.formatString(i4, tL_timezoneFindTimezone.name + ", " + TimezonesController.getTimezoneOffsetName(tL_timezoneFindTimezone)));
        }
        return sb.toString();
    }

    public final void adaptPrevDay(int i) {
        if ((this.value[i].isEmpty() ? null : (Period) zziq.m(1, this.value[i])) == null) {
            return;
        }
        int i2 = (i + 6) % 7;
        Period period = this.value[i2].isEmpty() ? null : (Period) zziq.m(1, this.value[i2]);
        if (period == null || period.end <= 1439) {
            return;
        }
        period.end = 1439;
        if (period.start >= 1439) {
            this.value[i2].remove(period);
        }
        View viewFindViewByItemId = this.listView.findViewByItemId(i2);
        if (viewFindViewByItemId instanceof NotificationsCheckCell) {
            ((NotificationsCheckCell) viewFindViewByItemId).setValue(getPeriodsValue(this.value[i2]));
        } else {
            this.listView.adapter.update(true);
        }
    }

    public final void checkDone$3(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 10));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone$3(false);
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(Theme.getColor(null, i2, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new CallLogActivity$$ExternalSyntheticLambda3(this, 9), new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 21), null, getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        universalRecyclerView2.adapter.applyBackground = false;
        frameLayout.addView(universalRecyclerView2, LayoutHelper.createFrame(-1.0f, -1));
        ActionBar actionBar = this.actionBar;
        UniversalRecyclerView universalRecyclerView3 = this.listView;
        actionBar.getClass();
        actionBar.setAdaptiveBackground(universalRecyclerView3, true, i2, Theme.key_actionBarDefault);
        setValue$4();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue$4();
            return;
        }
        if (i == NotificationCenter.timezonesUpdated) {
            if (this.currentValue == null) {
                this.timezoneId = TimezonesController.getInstance(this.currentAccount).getSystemTimezoneId();
            }
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
                return;
            }
            universalAdapter.update(true);
        }
    }

    public final void fillItems$4(ArrayList arrayList) {
        int i = R.string.BusinessHours;
        String string = LocaleController.getString(i);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i2 = R.raw.biz_clock;
        UItem uItem = new UItem(2);
        uItem.text = string;
        uItem.animatedText = string2;
        uItem.iconResId = i2;
        arrayList.add(uItem);
        UItem uItemAsCheck = UItem.asCheck(-1, LocaleController.getString(R.string.BusinessHoursShow));
        uItemAsCheck.setChecked(this.enabled);
        arrayList.add(uItemAsCheck);
        arrayList.add(UItem.asShadow(-100, null));
        if (!this.enabled) {
            return;
        }
        String string3 = LocaleController.getString(i);
        UItem uItem2 = new UItem(0);
        uItem2.text = string3;
        arrayList.add(uItem2);
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.value;
            if (i3 >= arrayListArr.length) {
                arrayList.add(UItem.asShadow(-101, null));
                arrayList.add(UItem.asButton(LocaleController.getString(R.string.BusinessHoursTimezone), TimezonesController.getInstance(this.currentAccount).getTimezoneName(this.timezoneId, false), -2));
                arrayList.add(UItem.asShadow(-102, null));
                return;
            }
            if (arrayListArr[i3] == null) {
                arrayListArr[i3] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i3].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String periodsValue = getPeriodsValue(this.value[i3]);
            UItem uItem3 = new UItem(5);
            uItem3.id = i3;
            uItem3.text = str;
            uItem3.subtext = periodsValue;
            uItem3.setChecked(!this.value[i3].isEmpty());
            arrayList.add(uItem3);
            i3++;
        }
    }

    public final boolean hasChanges() {
        if ((this.currentValue != null) != this.enabled || !TextUtils.equals(this.currentTimezoneId, this.timezoneId)) {
            return true;
        }
        if (this.currentValue != null && this.enabled) {
            if (this.value == null) {
                return true;
            }
            int i = 0;
            while (true) {
                ArrayList[] arrayListArr = this.currentValue;
                if (i >= arrayListArr.length) {
                    break;
                }
                if (arrayListArr[i].size() != this.value[i].size()) {
                    return true;
                }
                for (int i2 = 0; i2 < this.value[i].size(); i2++) {
                    Period period = (Period) this.currentValue[i].get(i2);
                    Period period2 = (Period) this.value[i].get(i2);
                    if (period.start != period2.start || period.end != period2.end) {
                        return true;
                    }
                }
                i++;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$onClick$3(View view, String str) {
        TimezonesController timezonesController = TimezonesController.getInstance(this.currentAccount);
        this.timezoneId = str;
        ((TextCell) view).setValue(timezonesController.getTimezoneName(str, false), true);
        checkDone$3(true);
    }

    public final void lambda$processDone$1$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tL_error);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
            if (this.isFinished || this.finishing) {
                return;
            }
            finishFragment();
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        this.doneButtonDrawable.animateToProgress(0.0f);
        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(this), null);
    }

    @Override
    public final boolean onFragmentCreate() {
        TimezonesController.getInstance(this.currentAccount).load();
        this.timezoneId = TimezonesController.getInstance(this.currentAccount).getSystemTimezoneId();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        processDone$4();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public final void processDone$4() {
        if (this.doneButtonDrawable.progress > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            finishFragment();
            return;
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.value;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i = 0; i < arrayListArr.length; i++) {
                if (arrayListArr[i] != null) {
                    for (int i2 = 0; i2 < arrayListArr[i].size(); i2++) {
                        Period period = (Period) arrayListArr[i].get(i2);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i3 = i * 1440;
                        tL_businessWeeklyOpen.start_minute = period.start + i3;
                        tL_businessWeeklyOpen.end_minute = i3 + period.end;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.enabled && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.timezoneId;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (userFull != null) {
                userFull.flags2 |= 1;
                userFull.business_work_hours = tL_businessWorkHours;
            }
        } else if (userFull != null) {
            userFull.flags2 &= -2;
            userFull.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new CallLogActivity$$ExternalSyntheticLambda1(this, 10));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void setValue$4() {
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        boolean z = tL_businessWorkHours != null;
        this.enabled = z;
        if (!z) {
            String systemTimezoneId = TimezonesController.getInstance(this.currentAccount).getSystemTimezoneId();
            this.timezoneId = systemTimezoneId;
            this.currentTimezoneId = systemTimezoneId;
            this.currentValue = null;
            this.value = new ArrayList[7];
            int i = 0;
            while (true) {
                ArrayList[] arrayListArr = this.value;
                if (i >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i] = new ArrayList();
                if (i >= 0 && i < 5) {
                    this.value[i].add(new Period(0, 1439));
                }
                i++;
            }
        } else {
            String str = tL_businessWorkHours.timezone_id;
            this.timezoneId = str;
            this.currentTimezoneId = str;
            this.currentValue = getDaysHours(tL_businessWorkHours.weekly_open);
            this.value = getDaysHours(userFull.business_work_hours.weekly_open);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        checkDone$3(false);
        this.valueSet = true;
    }
}
