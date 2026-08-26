package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BatteryDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;

public final class LaunchActivity$$ExternalSyntheticLambda27 implements Utilities.Callback {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda27(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        BaseFragment lastFragment;
        LaunchActivity launchActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.actionBarLayout != null && zBooleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.actionBarLayout.getLastFragment()) != null && !(lastFragment instanceof LiteModeSettingsActivity)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    BulletinFactory bulletinFactoryOf = BulletinFactory.of(lastFragment);
                    BatteryDrawable batteryDrawable = new BatteryDrawable(batteryLevel / 100.0f, lastFragment.getThemedColor(Theme.key_dialogSwipeRemove));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String string2 = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string3 = LocaleController.getString(R.string.Disable);
                    LaunchActivity$$ExternalSyntheticLambda20 launchActivity$$ExternalSyntheticLambda20 = new LaunchActivity$$ExternalSyntheticLambda20(launchActivity, 7);
                    bulletinFactoryOf.getClass();
                    Context context = bulletinFactoryOf.getContext();
                    Theme.ResourcesProvider resourcesProvider = bulletinFactoryOf.resourcesProvider;
                    Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(context, resourcesProvider);
                    twoLineLottieLayout.imageView.setImageDrawable(batteryDrawable);
                    twoLineLottieLayout.titleTextView.setText(string);
                    twoLineLottieLayout.subtitleTextView.setText(string2);
                    Bulletin.UndoButton undoButton = new Bulletin.UndoButton(bulletinFactoryOf.getContext(), resourcesProvider, true, false);
                    TextView textView = undoButton.undoTextView;
                    if (textView != null) {
                        textView.setText(string3);
                    }
                    undoButton.undoAction = launchActivity$$ExternalSyntheticLambda20;
                    twoLineLottieLayout.setButton(undoButton);
                    Bulletin bulletinCreate = bulletinFactoryOf.create(twoLineLottieLayout, 2750);
                    bulletinCreate.duration = 5000;
                    bulletinCreate.show();
                    break;
                }
                break;
            default:
                MessagesController.getInstance(launchActivity.currentAccount).openApp((TLRPC.User) obj, 0);
                break;
        }
    }
}
