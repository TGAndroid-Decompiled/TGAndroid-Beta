package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class OpeningHoursActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public String currentTimezoneId;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    public boolean enabled;
    private UniversalRecyclerView listView;
    public String timezoneId;
    private boolean valueSet;
    public ArrayList[] currentValue = null;
    public ArrayList[] value = {new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (OpeningHoursActivity.this.onBackPressed(true)) {
                        OpeningHoursActivity.this.finishFragment();
                    }
                } else if (i == 1) {
                    OpeningHoursActivity.this.processDone();
                }
            }
        });
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(i)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        checkDone(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView, true);
        setValue();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public boolean hasChanges() {
        if ((this.currentValue != null) != this.enabled || !TextUtils.equals(this.currentTimezoneId, this.timezoneId)) {
            return true;
        }
        if (this.currentValue != null && this.enabled) {
            if (this.value == null) {
                return true;
            }
            int i = 0;
            loop0: while (true) {
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
                        break loop0;
                    }
                }
                i++;
            }
            return true;
        }
        return false;
    }

    private void checkDone(boolean z) {
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
    public boolean onFragmentCreate() {
        TimezonesController.getInstance(this.currentAccount).load();
        this.timezoneId = TimezonesController.getInstance(this.currentAccount).getSystemTimezoneId();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        processDone();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue();
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

    private void setValue() {
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
        if (z) {
            String str = tL_businessWorkHours.timezone_id;
            this.timezoneId = str;
            this.currentTimezoneId = str;
            this.currentValue = getDaysHours(tL_businessWorkHours.weekly_open);
            this.value = getDaysHours(userFull.business_work_hours.weekly_open);
        } else {
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
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        checkDone(false);
        this.valueSet = true;
    }

    public static java.util.ArrayList adaptWeeklyOpen(java.util.ArrayList r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Business.OpeningHoursActivity.adaptWeeklyOpen(java.util.ArrayList, int):java.util.ArrayList");
    }

    public static int lambda$adaptWeeklyOpen$0(TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen, TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2) {
        return tL_businessWeeklyOpen.start_minute - tL_businessWeeklyOpen2.start_minute;
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
            int i7 = i6 + 1;
            int i8 = i7 * 1440;
            int i9 = i6 * 1440;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i10);
                if (tL_businessWeeklyOpen2.start_minute <= i9 && (i = tL_businessWeeklyOpen2.end_minute) >= i9) {
                    i9 = i + 1;
                }
            }
            if (i9 >= i8) {
                int i11 = (i6 + 6) % 7;
                if (!arrayListArr[i11].isEmpty()) {
                    if (((Period) arrayListArr[i11].get(r10.size() - 1)).end >= 1440) {
                        ((Period) arrayListArr[i11].get(r6.size() - 1)).end = 1439;
                    }
                }
                int iMin = Math.min((i9 - r4) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i6 + 8) % 7];
                if (iMin >= 1440 && !arrayList2.isEmpty() && ((Period) arrayList2.get(0)).start < iMin - 1440) {
                    iMin = ((Period) arrayList2.get(0)).start + 1439;
                }
                arrayListArr[i6].clear();
                arrayListArr[i6].add(new Period(0, iMin));
            } else {
                int i12 = i7 % 7;
                if (!arrayListArr[i6].isEmpty() && !arrayListArr[i12].isEmpty()) {
                    Period period = (Period) arrayListArr[i6].get(r3.size() - 1);
                    Period period2 = (Period) arrayListArr[i12].get(0);
                    int i13 = period.end;
                    if (i13 > 1440 && i13 - 1439 == period2.start) {
                        period.end = 1439;
                        period2.start = 0;
                    }
                }
            }
            i6 = i7;
        }
        return arrayListArr;
    }

    public static ArrayList fromDaysHours(ArrayList[] arrayListArr) {
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
        return arrayList;
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
        for (int i2 = 0; i2 < daysHours.length; i2++) {
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
            sb.append(LocaleController.formatString(R.string.BusinessHoursCopyFooter, TimezonesController.getInstance(i).getTimezoneName(tL_timezoneFindTimezone, true)));
        }
        return sb.toString();
    }

    public void processDone() {
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            finishFragment();
            return;
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList arrayListFromDaysHours = fromDaysHours(this.value);
        if (this.enabled && !arrayListFromDaysHours.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.timezoneId;
            tL_businessWorkHours.weekly_open.addAll(arrayListFromDaysHours);
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$processDone$2(tLObject, tL_error);
            }
        });
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public void lambda$processDone$2(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processDone$1(tL_error, tLObject);
            }
        });
    }

    public void lambda$processDone$1(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tL_error);
        } else {
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                if (getContext() == null) {
                    return;
                }
                this.doneButtonDrawable.animateToProgress(0.0f);
                BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
                return;
            }
            if (this.isFinished || this.finishing) {
                return;
            }
            finishFragment();
        }
    }

    public static class Period {
        public int end;
        public int start;

        public Period(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public String toString() {
            return timeToString(this.start) + " - " + timeToString(this.end);
        }

        public static String timeToString(int i) {
            return timeToString(i, true);
        }

        public static String timeToString(int i, boolean z) {
            int i2 = i % 60;
            Calendar calendar = Calendar.getInstance();
            calendar.set(0, 0, 0, ((i - i2) / 60) % 24, i2);
            String str = LocaleController.getInstance().getFormatterConstDay().format(calendar.getTime());
            return (i <= 1440 || !z) ? str : LocaleController.formatString(R.string.BusinessHoursNextDay, str);
        }
    }

    public static boolean is24x7(TL_account.TL_businessWorkHours tL_businessWorkHours) {
        if (tL_businessWorkHours == null || tL_businessWorkHours.weekly_open.isEmpty()) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < tL_businessWorkHours.weekly_open.size(); i2++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = tL_businessWorkHours.weekly_open.get(i2);
            if (tL_businessWeeklyOpen.start_minute > i + 1) {
                return false;
            }
            i = tL_businessWeeklyOpen.end_minute;
        }
        return i >= 10079;
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

    private String getPeriodsValue(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (isFull(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            Period period = (Period) arrayList.get(i);
            if (i > 0) {
                str = str + "\n";
            }
            str = str + Period.timeToString(period.start) + " - " + Period.timeToString(period.end);
        }
        return str;
    }

    private int maxPeriodsFor(int i) {
        int iMax = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            ArrayList arrayList = this.value[i2];
            if (arrayList != null) {
                iMax += Math.max(1, arrayList.size());
            }
        }
        return 28 - iMax;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        int i = R.string.BusinessHours;
        arrayList.add(UItem.asTopView(LocaleController.getString(i), LocaleController.getString(R.string.BusinessHoursInfo), R.raw.biz_clock));
        arrayList.add(UItem.asCheck(-1, LocaleController.getString(R.string.BusinessHoursShow)).setChecked(this.enabled));
        arrayList.add(UItem.asShadow(-100, null));
        if (!this.enabled) {
            return;
        }
        arrayList.add(UItem.asHeader(LocaleController.getString(i)));
        int i2 = 0;
        while (true) {
            ArrayList[] arrayListArr = this.value;
            if (i2 < arrayListArr.length) {
                if (arrayListArr[i2] == null) {
                    arrayListArr[i2] = new ArrayList();
                }
                String displayName = DayOfWeek.values()[i2].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                arrayList.add(UItem.asButtonCheck(i2, displayName.substring(0, 1).toUpperCase() + displayName.substring(1), getPeriodsValue(this.value[i2])).setChecked(!this.value[i2].isEmpty()));
                i2++;
            } else {
                arrayList.add(UItem.asShadow(-101, null));
                arrayList.add(UItem.asButton(-2, LocaleController.getString(R.string.BusinessHoursTimezone), TimezonesController.getInstance(this.currentAccount).getTimezoneName(this.timezoneId, false)));
                arrayList.add(UItem.asShadow(-102, null));
                return;
            }
        }
    }

    public void onClick(final UItem uItem, final View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == -1) {
            boolean z = !this.enabled;
            this.enabled = z;
            ((TextCheckCell) view).setChecked(z);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == -2) {
            presentFragment(new TimezoneSelector().setValue(this.timezoneId).whenSelected(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onClick$3(view, (String) obj);
                }
            }));
            return;
        }
        if (uItem.viewType != 5 || i2 < 0 || i2 >= this.value.length) {
            return;
        }
        if (!LocaleController.isRTL ? f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : f <= AndroidUtilities.dp(76.0f)) {
            if (this.value[uItem.id].isEmpty()) {
                ((NotificationsCheckCell) view).setChecked(true);
                this.value[uItem.id].add(new Period(0, 1439));
                adaptPrevDay(uItem.id);
            } else {
                this.value[uItem.id].clear();
                ((NotificationsCheckCell) view).setChecked(false);
            }
            ((NotificationsCheckCell) view).setValue(getPeriodsValue(this.value[uItem.id]));
            checkDone(true);
            return;
        }
        int i3 = (uItem.id + 6) % 7;
        int i4 = 0;
        for (int i5 = 0; i5 < this.value[i3].size(); i5++) {
            if (((Period) this.value[i3].get(i5)).end > i4) {
                i4 = ((Period) this.value[i3].get(i5)).end;
            }
        }
        int iMax = Math.max(0, i4 - 1439);
        int i6 = (uItem.id + 1) % 7;
        int i7 = 1440;
        for (int i8 = 0; i8 < this.value[i6].size(); i8++) {
            if (((Period) this.value[i6].get(i8)).start < i7) {
                i7 = ((Period) this.value[i6].get(i8)).start;
            }
        }
        int i9 = i7 + 1439;
        CharSequence charSequence = uItem.text;
        ArrayList[] arrayListArr = this.value;
        int i10 = uItem.id;
        presentFragment(new OpeningHoursDayActivity(charSequence, arrayListArr[i10], iMax, i9, maxPeriodsFor(i10)).onApplied(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onClick$4();
            }
        }).onDone(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onClick$5(uItem);
            }
        }));
    }

    public void lambda$onClick$3(View view, String str) {
        TimezonesController timezonesController = TimezonesController.getInstance(this.currentAccount);
        this.timezoneId = str;
        ((TextCell) view).setValue(timezonesController.getTimezoneName(str, false), true);
        checkDone(true);
    }

    public void lambda$onClick$4() {
        this.listView.adapter.update(true);
        checkDone(true);
    }

    public void lambda$onClick$5(UItem uItem) {
        adaptPrevDay(uItem.id);
    }

    private void adaptPrevDay(int i) {
        Period period;
        Period period2 = null;
        if (this.value[i].isEmpty()) {
            period = null;
        } else {
            ArrayList arrayList = this.value[i];
            period = (Period) arrayList.get(arrayList.size() - 1);
        }
        if (period == null) {
            return;
        }
        int i2 = (i + 6) % 7;
        if (!this.value[i2].isEmpty()) {
            ArrayList arrayList2 = this.value[i2];
            period2 = (Period) arrayList2.get(arrayList2.size() - 1);
        }
        if (period2 == null || period2.end <= 1439) {
            return;
        }
        period2.end = 1439;
        if (period2.start >= 1439) {
            this.value[i2].remove(period2);
        }
        View viewFindViewByItemId = this.listView.findViewByItemId(i2);
        if (viewFindViewByItemId instanceof NotificationsCheckCell) {
            ((NotificationsCheckCell) viewFindViewByItemId).setValue(getPeriodsValue(this.value[i2]));
        } else {
            this.listView.adapter.update(true);
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
