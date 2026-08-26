package org.telegram.ui;

import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.HintsController$Hint;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class MainTabsActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final MainTabsActivity f$0;

    public MainTabsActivity$$ExternalSyntheticLambda6(MainTabsActivity mainTabsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = mainTabsActivity;
    }

    @Override
    public final void run() {
        GlassTabView[] glassTabViewArr;
        switch (this.$r8$classId) {
            case 0:
                MainTabsActivity mainTabsActivity = this.f$0;
                if (mainTabsActivity.getParentActivity() != null && (glassTabViewArr = mainTabsActivity.tabs) != null) {
                    GlassTabView glassTabView = glassTabViewArr[4];
                    float width = ((glassTabView.getWidth() / 2.0f) + (mainTabsActivity.contentView.getWidth() - ((glassTabView.getX() + mainTabsActivity.tabsView.getX()) + glassTabView.getWidth()))) / AndroidUtilities.density;
                    HintView2 hintView2 = new HintView2(mainTabsActivity.getParentActivity(), 3);
                    mainTabsActivity.accountSwitchHint = hintView2;
                    hintView2.setTranslationY(AndroidUtilities.dp(4.0f) + (-mainTabsActivity.navigationBarHeight));
                    mainTabsActivity.accountSwitchHint.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    mainTabsActivity.accountSwitchHint.setMultilineText(false);
                    mainTabsActivity.accountSwitchHint.setCloseButton();
                    mainTabsActivity.accountSwitchHint.setText(LocaleController.getString(R.string.SwitchAccountHint));
                    mainTabsActivity.accountSwitchHint.setJoint(1.0f, (-width) + 7.33f);
                    mainTabsActivity.contentView.addView(mainTabsActivity.accountSwitchHint, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    HintView2 hintView3 = mainTabsActivity.accountSwitchHint;
                    hintView3.onHidden = new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 3);
                    hintView3.duration = 8000L;
                    hintView3.show();
                    HintsController$Hint.AccountSwitchHint.increment();
                    break;
                }
                break;
            case 1:
                this.f$0.lambda$openCallsSelector$5();
                break;
            case 2:
                this.f$0.lambda$openCallsSelector$6();
                break;
            case 3:
                AndroidUtilities.removeFromParent(this.f$0.accountSwitchHint);
                break;
            case 4:
                this.f$0.lambda$openAccountSelector$9();
                break;
            case 5:
                MainTabsActivity mainTabsActivity2 = this.f$0;
                mainTabsActivity2.getClass();
                new NewContactBottomSheet(mainTabsActivity2.getParentActivity(), mainTabsActivity2).show();
                break;
            case 6:
                MainTabsActivity mainTabsActivity3 = this.f$0;
                mainTabsActivity3.getClass();
                mainTabsActivity3.presentFragment(new CallLogActivity(zzkw.m("needFinishFragment", false)));
                break;
            default:
                MainTabsActivity mainTabsActivity4 = this.f$0;
                mainTabsActivity4.getClass();
                mainTabsActivity4.presentFragment(new CallLogActivity.AnonymousClass9(zzkw.m("isCall", true), mainTabsActivity4.getCurrentAccount(), mainTabsActivity4));
                break;
        }
    }
}
