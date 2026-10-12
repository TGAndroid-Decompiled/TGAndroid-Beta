package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cy0 implements Runnable {
    public final int f36581a;
    public final PrivacySettingsActivity f36582b;

    public cy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f36581a = i10;
        this.f36582b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36581a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f36582b;
                privacySettingsActivity.f34036a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f36582b.f34040c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f36582b;
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(privacySettingsActivity2.getParentActivity(), null);
                acVar.d(R.raw.email_check_inbox, new String[0]);
                acVar.f24277b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
