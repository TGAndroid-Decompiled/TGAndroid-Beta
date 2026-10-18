package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gx0 implements Runnable {
    public final int f37334a;
    public final PrivacySettingsActivity f37335b;

    public gx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f37334a = i10;
        this.f37335b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37334a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f37335b;
                privacySettingsActivity.f33555a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f37335b.f33559c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f37335b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f32599b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
