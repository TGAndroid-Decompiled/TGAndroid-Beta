package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.StickerImageView;

public final class AutoDeleteMessagesActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public RadioCellInternal afterOneDay;
    public RadioCellInternal afterOneMonth;
    public RadioCellInternal afterOneWeek;
    public final ArrayList arrayList;
    public LinearLayout checkBoxContainer;
    public RadioCellInternal customTimeButton;
    public RadioCellInternal offCell;
    public int startFromTtl;

    public final class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override
        public final void run() {
            UsersSelectActivity usersSelectActivity = new UsersSelectActivity();
            AutoDeleteMessagesActivity autoDeleteMessagesActivity = AutoDeleteMessagesActivity.this;
            usersSelectActivity.ttlPeriod = autoDeleteMessagesActivity.getSelectedTime();
            usersSelectActivity.delegate = new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 16);
            autoDeleteMessagesActivity.presentFragment(usersSelectActivity);
        }
    }

    public final class AnonymousClass4 implements RequestDelegate {
        @Override
        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        }
    }

    public final class RadioCellInternal extends RadioCell {
        public boolean custom;
        public int time;
    }

    public AutoDeleteMessagesActivity() {
        super(null);
        this.arrayList = new ArrayList();
        this.startFromTtl = 0;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(getParentActivity());
        SectionsScrollView sectionsScrollView = new SectionsScrollView(getParentActivity(), gLIconSettingsView, this.resourceProvider, true);
        gLIconSettingsView.setOrientation(1);
        sectionsScrollView.addView(gLIconSettingsView);
        frameLayout.addView(sectionsScrollView);
        this.actionBar.setAdaptiveBackground(sectionsScrollView);
        FrameLayout frameLayout2 = new FrameLayout(context);
        StickerImageView stickerImageView = new StickerImageView(context, this.currentAccount);
        stickerImageView.setStickerNum(10);
        frameLayout2.addView(stickerImageView, LayoutHelper.createFrame(130, 130, 17));
        frameLayout2.setTag(-33024);
        gLIconSettingsView.addView(frameLayout2, LayoutHelper.createLinear(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.checkBoxContainer = linearLayout;
        linearLayout.setOrientation(1);
        this.checkBoxContainer.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        gLIconSettingsView.addView(this.checkBoxContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(getParentActivity());
        headerCell.setText(LocaleController.getString(R.string.MessageLifetime));
        this.checkBoxContainer.addView(headerCell);
        RadioCellInternal radioCellInternal = new RadioCellInternal(getParentActivity(), null);
        this.offCell = radioCellInternal;
        radioCellInternal.setText(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        RadioCellInternal radioCellInternal2 = this.offCell;
        radioCellInternal2.time = 0;
        this.checkBoxContainer.addView(radioCellInternal2);
        RadioCellInternal radioCellInternal3 = new RadioCellInternal(getParentActivity(), null);
        this.afterOneDay = radioCellInternal3;
        radioCellInternal3.setText(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        RadioCellInternal radioCellInternal4 = this.afterOneDay;
        radioCellInternal4.time = 1440;
        this.checkBoxContainer.addView(radioCellInternal4);
        RadioCellInternal radioCellInternal5 = new RadioCellInternal(getParentActivity(), null);
        this.afterOneWeek = radioCellInternal5;
        radioCellInternal5.setText(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        RadioCellInternal radioCellInternal6 = this.afterOneWeek;
        radioCellInternal6.time = 10080;
        this.checkBoxContainer.addView(radioCellInternal6);
        RadioCellInternal radioCellInternal7 = new RadioCellInternal(getParentActivity(), null);
        this.afterOneMonth = radioCellInternal7;
        radioCellInternal7.setText(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        RadioCellInternal radioCellInternal8 = this.afterOneMonth;
        radioCellInternal8.time = 44640;
        this.checkBoxContainer.addView(radioCellInternal8);
        RadioCellInternal radioCellInternal9 = new RadioCellInternal(getParentActivity(), null);
        this.customTimeButton = radioCellInternal9;
        radioCellInternal9.setText(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.customTimeButton.radioButton.setVisibility(8);
        this.checkBoxContainer.addView(this.customTimeButton);
        ArrayList arrayList = this.arrayList;
        arrayList.add(this.offCell);
        arrayList.add(this.afterOneDay);
        arrayList.add(this.afterOneWeek);
        arrayList.add(this.afterOneMonth);
        arrayList.add(this.customTimeButton);
        updateItems();
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        textInfoPrivacyCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new AnonymousClass2()));
        gLIconSettingsView.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
        selectDate(this.startFromTtl, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    public final int getSelectedTime() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.arrayList;
            if (i >= arrayList.size()) {
                return this.startFromTtl;
            }
            if (((RadioCellInternal) arrayList.get(i)).radioButton.isChecked) {
                return ((RadioCellInternal) arrayList.get(i)).time;
            }
            i++;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
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
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.arrayList;
            if (i >= arrayList.size()) {
                return;
            }
            if (((RadioCellInternal) arrayList.get(i)).radioButton.isChecked) {
                if (((RadioCellInternal) arrayList.get(i)).time != this.startFromTtl) {
                    this.startFromTtl = ((RadioCellInternal) arrayList.get(i)).time;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((RadioCellInternal) arrayList.get(i)).time * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new AnonymousClass4());
                    getUserConfig().setGlobalTtl(this.startFromTtl);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void selectDate(int i, boolean z) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
        TransitionManager.beginDelayedTransition(this.checkBoxContainer, transitionSet);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.arrayList;
            if (i2 >= arrayList.size()) {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    if (((RadioCellInternal) arrayList.get(i3)).custom) {
                        this.checkBoxContainer.removeView((View) arrayList.get(i3));
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                int size = arrayList.size();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i < ((RadioCellInternal) arrayList.get(i4)).time) {
                        size = i4 + 1;
                        break;
                    }
                }
                RadioCellInternal radioCellInternal = new RadioCellInternal(getParentActivity(), null);
                radioCellInternal.custom = true;
                radioCellInternal.time = i;
                radioCellInternal.setText(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i * 60)), false, true);
                arrayList.add(size, radioCellInternal);
                this.checkBoxContainer.addView(radioCellInternal, size);
                updateItems();
                selectRadioButton(radioCellInternal, z);
                return;
            }
            if (((RadioCellInternal) arrayList.get(i2)).time == i) {
                selectRadioButton((View) arrayList.get(i2), z);
                return;
            }
            i2++;
        }
    }

    public final void selectRadioButton(View view, boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.arrayList;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) == view) {
                ((RadioCellInternal) arrayList.get(i2)).radioButton.setChecked(true, this.fragmentBeginToShow);
            } else {
                ((RadioCellInternal) arrayList.get(i2)).radioButton.setChecked(false, this.fragmentBeginToShow);
            }
            i2++;
        }
        if (!z || (i = ((RadioCellInternal) view).time) <= 0) {
            return;
        }
        BulletinFactory.of(this).createSimpleBulletinWithIconSize(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i * 60)))).show();
    }

    public final void updateItems() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.arrayList;
            if (i >= arrayList.size()) {
                return;
            }
            ((RadioCellInternal) arrayList.get(i)).setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, Theme.key_listSelector, false)));
            ((RadioCellInternal) arrayList.get(i)).setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 8));
            i++;
        }
    }
}
