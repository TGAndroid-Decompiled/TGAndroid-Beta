package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;

public final class SettingsActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final SettingsActivity f$0;

    public SettingsActivity$$ExternalSyntheticLambda4(SettingsActivity settingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = settingsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SettingsActivity settingsActivity = this.f$0;
                settingsActivity.listView.postOnAnimation(new SettingsActivity$$ExternalSyntheticLambda4(settingsActivity, 2));
                break;
            case 1:
                Browser.openUrl(this.f$0.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            case 2:
                this.f$0.blur3_InvalidateBlur$9();
                break;
            case 3:
                this.f$0.listView.adapter.update(true);
                break;
            default:
                this.f$0.lambda$createView$1$5$2();
                break;
        }
    }
}
