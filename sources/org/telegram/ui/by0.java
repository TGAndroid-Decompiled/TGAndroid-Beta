package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class by0 implements Runnable {
    public final int f32576a;
    public final PrivacySettingsActivity f32577b;

    public by0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f32576a = i10;
        this.f32577b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f32576a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f32577b;
                privacySettingsActivity.f31530a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f32577b.f31534c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f32577b;
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(privacySettingsActivity2.getParentActivity(), null);
                xbVar.d(R.raw.email_check_inbox, new String[0]);
                xbVar.f30299b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.pc.g(privacySettingsActivity2, xbVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
