package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_account_updateBusinessWorkHours;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_businessWeeklyOpen;
import org.telegram.tgnet.TLRPC$TL_businessWorkHours;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$UserFull;
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
    public ArrayList<Period>[] currentValue = null;
    public ArrayList<Period>[] value = {new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (OpeningHoursActivity.this.onBackPressed()) {
                        OpeningHoursActivity.this.finishFragment();
                    }
                } else if (i == 1) {
                    OpeningHoursActivity.this.processDone();
                }
            }
        });
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(mutate, new CircularProgressDrawable(Theme.getColor(i)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
        checkDone(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                OpeningHoursActivity.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                OpeningHoursActivity.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null, getResourceProvider());
        this.listView = universalRecyclerView;
        frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
        setValue();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public boolean hasChanges() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Business.OpeningHoursActivity.hasChanges():boolean");
    }

    private void checkDone(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean hasChanges = hasChanges();
        this.doneButton.setEnabled(hasChanges);
        if (z) {
            this.doneButton.animate().alpha(hasChanges ? 1.0f : 0.0f).scaleX(hasChanges ? 1.0f : 0.0f).scaleY(hasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(hasChanges ? 1.0f : 0.0f);
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
        } else if (i == NotificationCenter.timezonesUpdated) {
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
        TLRPC$UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC$TL_businessWorkHours tLRPC$TL_businessWorkHours = userFull.business_work_hours;
        boolean z = tLRPC$TL_businessWorkHours != null;
        this.enabled = z;
        if (z) {
            String str = tLRPC$TL_businessWorkHours.timezone_id;
            this.timezoneId = str;
            this.currentTimezoneId = str;
            this.currentValue = getDaysHours(tLRPC$TL_businessWorkHours.weekly_open);
            this.value = getDaysHours(userFull.business_work_hours.weekly_open);
        } else {
            String systemTimezoneId = TimezonesController.getInstance(this.currentAccount).getSystemTimezoneId();
            this.timezoneId = systemTimezoneId;
            this.currentTimezoneId = systemTimezoneId;
            this.currentValue = null;
            this.value = new ArrayList[7];
            int i = 0;
            while (true) {
                ArrayList<Period>[] arrayListArr = this.value;
                if (i >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i] = new ArrayList<>();
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

    public static ArrayList<TLRPC$TL_businessWeeklyOpen> adaptWeeklyOpen(ArrayList<TLRPC$TL_businessWeeklyOpen> arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList<TLRPC$TL_businessWeeklyOpen> arrayList3 = new ArrayList<>(arrayList2.size());
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen = (TLRPC$TL_businessWeeklyOpen) arrayList2.get(i2);
            TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen2 = new TLRPC$TL_businessWeeklyOpen();
            if (i != 0) {
                int i3 = tLRPC$TL_businessWeeklyOpen.start_minute;
                int i4 = i3 % 1440;
                int i5 = tLRPC$TL_businessWeeklyOpen.end_minute;
                int i6 = (i5 - i3) + i4;
                if (i4 == 0 && (i6 == 1440 || i6 == 1439)) {
                    tLRPC$TL_businessWeeklyOpen2.start_minute = i3;
                    tLRPC$TL_businessWeeklyOpen2.end_minute = i5;
                    arrayList3.add(tLRPC$TL_businessWeeklyOpen2);
                }
            }
            tLRPC$TL_businessWeeklyOpen2.start_minute = tLRPC$TL_businessWeeklyOpen.start_minute + i;
            tLRPC$TL_businessWeeklyOpen2.end_minute = tLRPC$TL_businessWeeklyOpen.end_minute + i;
            arrayList3.add(tLRPC$TL_businessWeeklyOpen2);
            int i7 = tLRPC$TL_businessWeeklyOpen2.start_minute;
            if (i7 < 0) {
                int i8 = tLRPC$TL_businessWeeklyOpen2.end_minute;
                if (i8 < 0) {
                    tLRPC$TL_businessWeeklyOpen2.start_minute = i7 + 10080;
                    tLRPC$TL_businessWeeklyOpen2.end_minute = i8 + 10080;
                } else {
                    tLRPC$TL_businessWeeklyOpen2.start_minute = 0;
                    TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen3 = new TLRPC$TL_businessWeeklyOpen();
                    tLRPC$TL_businessWeeklyOpen3.start_minute = tLRPC$TL_businessWeeklyOpen.start_minute + 10080 + i;
                    tLRPC$TL_businessWeeklyOpen3.end_minute = 10079;
                    arrayList3.add(tLRPC$TL_businessWeeklyOpen3);
                }
            } else {
                int i9 = tLRPC$TL_businessWeeklyOpen2.end_minute;
                if (i9 > 10080) {
                    if (i7 > 10080) {
                        tLRPC$TL_businessWeeklyOpen2.start_minute = i7 - 10080;
                        tLRPC$TL_businessWeeklyOpen2.end_minute = i9 - 10080;
                    } else {
                        tLRPC$TL_businessWeeklyOpen2.end_minute = 10079;
                        TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen4 = new TLRPC$TL_businessWeeklyOpen();
                        tLRPC$TL_businessWeeklyOpen4.start_minute = 0;
                        tLRPC$TL_businessWeeklyOpen4.end_minute = (tLRPC$TL_businessWeeklyOpen.end_minute + i) - 10079;
                        arrayList3.add(tLRPC$TL_businessWeeklyOpen4);
                    }
                }
            }
        }
        Collections.sort(arrayList3, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$adaptWeeklyOpen$0;
                lambda$adaptWeeklyOpen$0 = OpeningHoursActivity.lambda$adaptWeeklyOpen$0((TLRPC$TL_businessWeeklyOpen) obj, (TLRPC$TL_businessWeeklyOpen) obj2);
                return lambda$adaptWeeklyOpen$0;
            }
        });
        return arrayList3;
    }

    public static int lambda$adaptWeeklyOpen$0(TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen, TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen2) {
        return tLRPC$TL_businessWeeklyOpen.start_minute - tLRPC$TL_businessWeeklyOpen2.start_minute;
    }

    public static ArrayList<Period>[] getDaysHours(ArrayList<TLRPC$TL_businessWeeklyOpen> arrayList) {
        int i;
        ArrayList<Period>[] arrayListArr = new ArrayList[7];
        for (int i2 = 0; i2 < 7; i2++) {
            arrayListArr[i2] = new ArrayList<>();
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen = arrayList.get(i3);
            int i4 = tLRPC$TL_businessWeeklyOpen.start_minute;
            int i5 = i4 % 1440;
            arrayListArr[(i4 / 1440) % 7].add(new Period(i5, (tLRPC$TL_businessWeeklyOpen.end_minute - i4) + i5));
        }
        int i6 = 0;
        while (i6 < 7) {
            int i7 = i6 * 1440;
            int i8 = i6 + 1;
            int i9 = i8 * 1440;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen2 = arrayList.get(i10);
                if (tLRPC$TL_businessWeeklyOpen2.start_minute <= i7 && (i = tLRPC$TL_businessWeeklyOpen2.end_minute) >= i7) {
                    i7 = i + 1;
                }
            }
            if (i7 >= i9) {
                int i11 = ((i6 + 7) - 1) % 7;
                if (!arrayListArr[i11].isEmpty() && arrayListArr[i11].get(arrayListArr[i11].size() - 1).end >= 1440) {
                    arrayListArr[i11].get(arrayListArr[i11].size() - 1).end = 1439;
                }
                arrayListArr[i6].clear();
                arrayListArr[i6].add(new Period(0, 1439));
            } else {
                int i12 = i8 % 7;
                if (!arrayListArr[i6].isEmpty() && !arrayListArr[i12].isEmpty()) {
                    Period period = arrayListArr[i6].get(arrayListArr[i6].size() - 1);
                    Period period2 = arrayListArr[i12].get(0);
                    int i13 = period.end;
                    if (i13 > 1440 && (i13 - 1440) + 1 == period2.start) {
                        period.end = 1439;
                        period2.start = 0;
                    }
                }
            }
            i6 = i8;
        }
        return arrayListArr;
    }

    public static ArrayList<TLRPC$TL_businessWeeklyOpen> fromDaysHours(ArrayList<Period>[] arrayListArr) {
        ArrayList<TLRPC$TL_businessWeeklyOpen> arrayList = new ArrayList<>();
        if (arrayListArr != null) {
            for (int i = 0; i < arrayListArr.length; i++) {
                if (arrayListArr[i] != null) {
                    for (int i2 = 0; i2 < arrayListArr[i].size(); i2++) {
                        Period period = arrayListArr[i].get(i2);
                        TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen = new TLRPC$TL_businessWeeklyOpen();
                        int i3 = i * 1440;
                        tLRPC$TL_businessWeeklyOpen.start_minute = period.start + i3;
                        tLRPC$TL_businessWeeklyOpen.end_minute = i3 + period.end;
                        arrayList.add(tLRPC$TL_businessWeeklyOpen);
                    }
                }
            }
        }
        return arrayList;
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
        TLRPC$UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TLRPC$TL_account_updateBusinessWorkHours tLRPC$TL_account_updateBusinessWorkHours = new TLRPC$TL_account_updateBusinessWorkHours();
        ArrayList<TLRPC$TL_businessWeeklyOpen> fromDaysHours = fromDaysHours(this.value);
        if (this.enabled && !fromDaysHours.isEmpty()) {
            TLRPC$TL_businessWorkHours tLRPC$TL_businessWorkHours = new TLRPC$TL_businessWorkHours();
            tLRPC$TL_businessWorkHours.timezone_id = this.timezoneId;
            tLRPC$TL_businessWorkHours.weekly_open.addAll(fromDaysHours);
            tLRPC$TL_account_updateBusinessWorkHours.flags |= 1;
            tLRPC$TL_account_updateBusinessWorkHours.business_work_hours = tLRPC$TL_businessWorkHours;
            if (userFull != null) {
                userFull.flags2 |= 1;
                userFull.business_work_hours = tLRPC$TL_businessWorkHours;
            }
        } else if (userFull != null) {
            userFull.flags2 &= -2;
            userFull.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_updateBusinessWorkHours, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                OpeningHoursActivity.this.lambda$processDone$2(tLObject, tLRPC$TL_error);
            }
        });
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public void lambda$processDone$2(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                OpeningHoursActivity.this.lambda$processDone$1(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$processDone$1(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            if (getContext() == null) {
                return;
            }
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        } else if (this.isFinished || this.finishing) {
        } else {
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
            String format = LocaleController.getInstance().formatterConstDay.format(calendar.getTime());
            return (i <= 1440 || !z) ? format : LocaleController.formatString(R.string.BusinessHoursNextDay, format);
        }
    }

    public static boolean isFull(ArrayList<Period> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Period period = arrayList.get(i2);
            if (i < period.start) {
                return false;
            }
            i = period.end;
        }
        return i == 1439 || i == 1440;
    }

    private String getPeriodsValue(ArrayList<Period> arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (isFull(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = BuildConfig.APP_CENTER_HASH;
        for (int i = 0; i < arrayList.size(); i++) {
            Period period = arrayList.get(i);
            if (i > 0) {
                str = str + "\n";
            }
            str = str + Period.timeToString(period.start) + " - " + Period.timeToString(period.end);
        }
        return str;
    }

    private int maxPeriodsFor(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 7; i3++) {
            ArrayList<Period>[] arrayListArr = this.value;
            if (arrayListArr[i3] != null) {
                i2 += Math.max(1, arrayListArr[i3].size());
            }
        }
        return 28 - i2;
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.BusinessHoursInfo), R.raw.biz_clock));
        arrayList.add(UItem.asCheck(-1, LocaleController.getString(R.string.BusinessHoursShow)).setChecked(this.enabled));
        arrayList.add(UItem.asShadow(-100, null));
        if (!this.enabled) {
            return;
        }
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessHours)));
        int i = 0;
        while (true) {
            ArrayList<Period>[] arrayListArr = this.value;
            if (i < arrayListArr.length) {
                if (arrayListArr[i] == null) {
                    arrayListArr[i] = new ArrayList<>();
                }
                String displayName = DayOfWeek.values()[i].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                arrayList.add(UItem.asButtonCheck(i, displayName.substring(0, 1).toUpperCase() + displayName.substring(1), getPeriodsValue(this.value[i])).setChecked(!this.value[i].isEmpty()));
                i++;
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
        } else if (i2 == -2) {
            presentFragment(new TimezoneSelector().setValue(this.timezoneId).whenSelected(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    OpeningHoursActivity.this.lambda$onClick$3(view, (String) obj);
                }
            }));
        } else if (uItem.viewType == 4 && i2 >= 0 && i2 < this.value.length) {
            if (!LocaleController.isRTL ? f < ((float) (view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) : f > ((float) AndroidUtilities.dp(76.0f))) {
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
            int i3 = ((uItem.id + 7) - 1) % 7;
            int i4 = 0;
            for (int i5 = 0; i5 < this.value[i3].size(); i5++) {
                if (this.value[i3].get(i5).end > i4) {
                    i4 = this.value[i3].get(i5).end;
                }
            }
            int max = Math.max(0, (i4 + 1) - 1440);
            int i6 = (uItem.id + 1) % 7;
            int i7 = 1440;
            for (int i8 = 0; i8 < this.value[i6].size(); i8++) {
                if (this.value[i6].get(i8).start < i7) {
                    i7 = this.value[i6].get(i8).start;
                }
            }
            int i9 = (i7 + 1440) - 1;
            CharSequence charSequence = uItem.text;
            ArrayList<Period>[] arrayListArr = this.value;
            int i10 = uItem.id;
            presentFragment(new OpeningHoursDayActivity(charSequence, arrayListArr[i10], max, i9, maxPeriodsFor(i10)).onApplied(new Runnable() {
                @Override
                public final void run() {
                    OpeningHoursActivity.this.lambda$onClick$4();
                }
            }).onDone(new Runnable() {
                @Override
                public final void run() {
                    OpeningHoursActivity.this.lambda$onClick$5(uItem);
                }
            }));
        }
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
            ArrayList<Period>[] arrayListArr = this.value;
            period = arrayListArr[i].get(arrayListArr[i].size() - 1);
        }
        if (period == null) {
            return;
        }
        int i2 = ((i + 7) - 1) % 7;
        if (!this.value[i2].isEmpty()) {
            ArrayList<Period>[] arrayListArr2 = this.value;
            period2 = arrayListArr2[i2].get(arrayListArr2[i2].size() - 1);
        }
        if (period2 == null || period2.end <= 1439) {
            return;
        }
        period2.end = 1439;
        if (period2.start >= 1439) {
            this.value[i2].remove(period2);
        }
        View findViewByItemId = this.listView.findViewByItemId(i2);
        if (findViewByItemId instanceof NotificationsCheckCell) {
            ((NotificationsCheckCell) findViewByItemId).setValue(getPeriodsValue(this.value[i2]));
        } else {
            this.listView.adapter.update(true);
        }
    }
}
