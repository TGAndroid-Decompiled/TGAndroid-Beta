package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gy0 implements Runnable {
    public final int f36327a;
    public final PrivacySettingsActivity f36328b;

    public gy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f36327a = i10;
        this.f36328b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36327a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f36328b;
                privacySettingsActivity.f32217a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f36328b.f32221c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f36328b;
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(privacySettingsActivity2.getParentActivity(), null);
                acVar.d(R.raw.email_check_inbox, new String[0]);
                acVar.f23192b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.sc.g(privacySettingsActivity2, acVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
