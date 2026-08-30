package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gx0 implements Runnable {
    public final int f34696a;
    public final PrivacySettingsActivity f34697b;

    public gx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f34696a = i10;
        this.f34697b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f34696a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f34697b;
                privacySettingsActivity.f32018a.l();
                privacySettingsActivity.O = true;
                return;
            case 1:
                this.f34697b.f32020c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f34697b;
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(privacySettingsActivity2.getParentActivity(), null);
                qbVar.d(R.raw.email_check_inbox, new String[0]);
                qbVar.f28100b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.ic.g(privacySettingsActivity2, qbVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
