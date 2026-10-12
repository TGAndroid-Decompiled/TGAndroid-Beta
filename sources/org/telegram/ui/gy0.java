package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gy0 implements Runnable {
    public final int f36541a;
    public final PrivacySettingsActivity f36542b;

    public gy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f36541a = i10;
        this.f36542b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36541a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f36542b;
                privacySettingsActivity.f32515a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f36542b.f32519c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f36542b;
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(privacySettingsActivity2.getParentActivity(), null);
                acVar.d(R.raw.email_check_inbox, new String[0]);
                acVar.f23513b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
