package org.telegram.p009ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.DialogInterface;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1069ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.AutoDeleteMessagesActivity;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.RadioCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.BulletinFactory;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.StickerImageView;
import org.telegram.p009ui.UsersSelectActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_setDefaultHistoryTTL;

public class AutoDeleteMessagesActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    RadioCellInternal afterOneDay;
    RadioCellInternal afterOneMonth;
    RadioCellInternal afterOneWeek;
    LinearLayout checkBoxContainer;
    RadioCellInternal customTimeButton;
    RadioCellInternal offCell;
    ArrayList<RadioCellInternal> arrayList = new ArrayList<>();
    public int startFromTtl = 0;

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    @Override
    public boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.startFromTtl = globalTTl;
        if (globalTTl < 0) {
            this.startFromTtl = 0;
        }
        getUserConfig().loadGlobalTTl();
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(C1010R.C1011drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("AutoDeleteMessages", C1010R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new C1069ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    AutoDeleteMessagesActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        ScrollView scrollView = new ScrollView(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        frameLayout2.addView(scrollView);
        FrameLayout frameLayout3 = new FrameLayout(context);
        StickerImageView stickerImageView = new StickerImageView(context, this.currentAccount);
        stickerImageView.setStickerNum(10);
        frameLayout3.addView(stickerImageView, LayoutHelper.createFrame(130, 130, 17));
        linearLayout.addView(frameLayout3, LayoutHelper.createLinear(-1, 170));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.checkBoxContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        this.checkBoxContainer.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        linearLayout.addView(this.checkBoxContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(getContext());
        headerCell.setText(LocaleController.getString("MessageLifetime", C1010R.string.MessageLifetime));
        this.checkBoxContainer.addView(headerCell);
        RadioCellInternal radioCellInternal = new RadioCellInternal(this, getContext());
        this.offCell = radioCellInternal;
        radioCellInternal.setText(LocaleController.getString("ShortMessageLifetimeForever", C1010R.string.ShortMessageLifetimeForever), false, true);
        RadioCellInternal radioCellInternal2 = this.offCell;
        radioCellInternal2.time = 0;
        this.checkBoxContainer.addView(radioCellInternal2);
        RadioCellInternal radioCellInternal3 = new RadioCellInternal(this, getContext());
        this.afterOneDay = radioCellInternal3;
        radioCellInternal3.setText(LocaleController.getString("AutoDeleteAfter1Day", C1010R.string.AutoDeleteAfter1Day), false, true);
        RadioCellInternal radioCellInternal4 = this.afterOneDay;
        radioCellInternal4.time = 1440;
        this.checkBoxContainer.addView(radioCellInternal4);
        RadioCellInternal radioCellInternal5 = new RadioCellInternal(this, getContext());
        this.afterOneWeek = radioCellInternal5;
        radioCellInternal5.setText(LocaleController.getString("AutoDeleteAfter1Week", C1010R.string.AutoDeleteAfter1Week), false, true);
        RadioCellInternal radioCellInternal6 = this.afterOneWeek;
        radioCellInternal6.time = 10080;
        this.checkBoxContainer.addView(radioCellInternal6);
        RadioCellInternal radioCellInternal7 = new RadioCellInternal(this, getContext());
        this.afterOneMonth = radioCellInternal7;
        radioCellInternal7.setText(LocaleController.getString("AutoDeleteAfter1Month", C1010R.string.AutoDeleteAfter1Month), false, true);
        RadioCellInternal radioCellInternal8 = this.afterOneMonth;
        radioCellInternal8.time = 44640;
        this.checkBoxContainer.addView(radioCellInternal8);
        RadioCellInternal radioCellInternal9 = new RadioCellInternal(this, getContext());
        this.customTimeButton = radioCellInternal9;
        radioCellInternal9.setText(LocaleController.getString("SetCustomTime", C1010R.string.SetCustomTime), false, false);
        this.customTimeButton.hideRadioButton();
        this.checkBoxContainer.addView(this.customTimeButton);
        this.arrayList.add(this.offCell);
        this.arrayList.add(this.afterOneDay);
        this.arrayList.add(this.afterOneWeek);
        this.arrayList.add(this.afterOneMonth);
        this.arrayList.add(this.customTimeButton);
        updateItems();
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        textInfoPrivacyCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString("GlobalAutoDeleteInfo", C1010R.string.GlobalAutoDeleteInfo), new RunnableC12502()));
        linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
        selectDate(this.startFromTtl, false);
        return this.fragmentView;
    }

    public class RunnableC12502 implements Runnable {
        RunnableC12502() {
        }

        @Override
        public void run() {
            UsersSelectActivity usersSelectActivity = new UsersSelectActivity(1);
            usersSelectActivity.setTtlPeriod(AutoDeleteMessagesActivity.this.getSelectedTime());
            usersSelectActivity.setDelegate(new UsersSelectActivity.FilterUsersActivityDelegate() {
                @Override
                public final void didSelectChats(ArrayList arrayList, int i) {
                    AutoDeleteMessagesActivity.RunnableC12502.this.lambda$run$1(arrayList, i);
                }
            });
            AutoDeleteMessagesActivity.this.presentFragment(usersSelectActivity);
        }

        public void lambda$run$1(final ArrayList arrayList, int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AutoDeleteMessagesActivity.RunnableC12502.this.lambda$run$0(arrayList);
                }
            }, 100L);
        }

        public void lambda$run$0(ArrayList arrayList) {
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                AutoDeleteMessagesActivity.this.getMessagesController().setDialogHistoryTTL(((Long) arrayList.get(i)).longValue(), AutoDeleteMessagesActivity.this.getSelectedTime() * 60);
            }
            if (AutoDeleteMessagesActivity.this.getSelectedTime() > 0) {
                BulletinFactory.m13of(AutoDeleteMessagesActivity.this).createSimpleBulletin(C1010R.raw.fire_on, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", C1010R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(AutoDeleteMessagesActivity.this.getSelectedTime() * 60), LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size()))))).show();
            } else {
                BulletinFactory.m13of(AutoDeleteMessagesActivity.this).createSimpleBulletin(C1010R.raw.fire_off, LocaleController.formatString("AutodeleteTimerDisabledForChats", C1010R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size())))).show();
            }
        }
    }

    private void updateItems() {
        for (int i = 0; i < this.arrayList.size(); i++) {
            this.arrayList.get(i).setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor("windowBackgroundWhite"), Theme.getColor("listSelectorSDK21")));
            this.arrayList.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AutoDeleteMessagesActivity.this.lambda$updateItems$2(view);
                }
            });
        }
    }

    public class C12513 implements AlertsCreator.ScheduleDatePickerDelegate {
        C12513() {
        }

        @Override
        public void didSelectDate(boolean z, final int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AutoDeleteMessagesActivity.C12513.this.lambda$didSelectDate$0(i);
                }
            }, 50L);
        }

        public void lambda$didSelectDate$0(int i) {
            AutoDeleteMessagesActivity.this.selectDate(i, true);
        }
    }

    public void lambda$updateItems$2(final View view) {
        if (view == this.customTimeButton) {
            AlertsCreator.createAutoDeleteDatePickerDialog(getContext(), 1, null, new C12513());
            return;
        }
        int i = ((RadioCellInternal) view).time;
        if (getSelectedTime() == 0 && i > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setTitle(LocaleController.getString("MessageLifetime", C1010R.string.MessageLifetime));
            builder.setMessage(LocaleController.formatString("AutoDeleteConfirmMessage", C1010R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i * 60)));
            builder.setNegativeButton(LocaleController.getString("Cancel", C1010R.string.Cancel), AutoDeleteMessagesActivity$$ExternalSyntheticLambda1.INSTANCE);
            builder.setPositiveButton(LocaleController.getString("Enable", C1010R.string.Enable), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    AutoDeleteMessagesActivity.this.lambda$updateItems$1(view, dialogInterface, i2);
                }
            });
            builder.show();
            return;
        }
        selectRadioButton(view, true);
    }

    public void lambda$updateItems$1(View view, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        selectRadioButton(view, true);
    }

    public int getSelectedTime() {
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i).isChecked()) {
                return this.arrayList.get(i).time;
            }
        }
        return this.startFromTtl;
    }

    public void selectDate(int i, boolean z) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
        TransitionManager.beginDelayedTransition(this.checkBoxContainer, transitionSet);
        for (int i2 = 0; i2 < this.arrayList.size(); i2++) {
            if (this.arrayList.get(i2).time == i) {
                selectRadioButton(this.arrayList.get(i2), z);
                return;
            }
        }
        int i3 = 0;
        while (i3 < this.arrayList.size()) {
            if (this.arrayList.get(i3).custom) {
                this.checkBoxContainer.removeView(this.arrayList.get(i3));
                this.arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        int size = this.arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= this.arrayList.size()) {
                break;
            } else if (i < this.arrayList.get(i4).time) {
                size = i4 + 1;
                break;
            } else {
                i4++;
            }
        }
        RadioCellInternal radioCellInternal = new RadioCellInternal(this, getContext());
        radioCellInternal.custom = true;
        radioCellInternal.time = i;
        radioCellInternal.setText(LocaleController.formatString("AutoDeleteAfterShort", C1010R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i * 60)), false, true);
        this.arrayList.add(size, radioCellInternal);
        this.checkBoxContainer.addView(radioCellInternal, size);
        updateItems();
        selectRadioButton(radioCellInternal, z);
    }

    private void selectRadioButton(View view, boolean z) {
        int i;
        for (int i2 = 0; i2 < this.arrayList.size(); i2++) {
            if (this.arrayList.get(i2) == view) {
                this.arrayList.get(i2).setChecked(true, this.fragmentBeginToShow);
            } else {
                this.arrayList.get(i2).setChecked(false, this.fragmentBeginToShow);
            }
        }
        if (!z || (i = ((RadioCellInternal) view).time) <= 0) {
            return;
        }
        BulletinFactory.m13of(this).createSimpleBulletin(C1010R.raw.fire_on, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", C1010R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i * 60)))).show();
    }

    public class RadioCellInternal extends RadioCell {
        boolean custom;
        int time;

        public RadioCellInternal(AutoDeleteMessagesActivity autoDeleteMessagesActivity, Context context) {
            super(context);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i).isChecked()) {
                if (this.arrayList.get(i).time != this.startFromTtl) {
                    this.startFromTtl = this.arrayList.get(i).time;
                    TLRPC$TL_messages_setDefaultHistoryTTL tLRPC$TL_messages_setDefaultHistoryTTL = new TLRPC$TL_messages_setDefaultHistoryTTL();
                    tLRPC$TL_messages_setDefaultHistoryTTL.period = this.arrayList.get(i).time * 60;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_setDefaultHistoryTTL, new RequestDelegate(this) {
                        @Override
                        public void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        }
                    });
                    getUserConfig().setGlobalTtl(this.startFromTtl);
                    NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                    return;
                }
                return;
            }
        }
    }
}
