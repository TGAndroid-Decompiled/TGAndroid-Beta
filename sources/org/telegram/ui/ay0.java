package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ay0 implements Runnable {
    public final int f32200a;
    public final PrivacySettingsActivity f32201b;

    public ay0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f32200a = i10;
        this.f32201b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f32200a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f32201b;
                privacySettingsActivity.f31469a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f32201b.f31473c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f32201b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f30530b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.qc.g(privacySettingsActivity2, ybVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
