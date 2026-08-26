package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.browser.Browser;

public final class SettingsActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final SettingsActivity f$0;

    public SettingsActivity$$ExternalSyntheticLambda5(SettingsActivity settingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = settingsActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$3$8$1();
                break;
            case 1:
                SettingsActivity settingsActivity = this.f$0;
                settingsActivity.getClass();
                settingsActivity.presentFragment(new ActionIntroActivity(3));
                break;
            case 2:
                this.f$0.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                SettingsActivity settingsActivity2 = this.f$0;
                settingsActivity2.getClass();
                settingsActivity2.presentFragment(new TwoStepVerificationSetupActivity(8, null));
                break;
            case 4:
                this.f$0.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                this.f$0.lambda$createView$4$8$1();
                break;
            default:
                SettingsActivity settingsActivity3 = this.f$0;
                Browser.openUrl(settingsActivity3.getParentActivity(), settingsActivity3.getMessagesController().premiumManageSubscriptionUrl);
                settingsActivity3.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
        }
    }
}
