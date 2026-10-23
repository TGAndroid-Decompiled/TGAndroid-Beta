package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ex0 implements Runnable {
    public final int f36822a;
    public final PrivacySettingsActivity f36823b;

    public ex0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f36822a = i10;
        this.f36823b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36822a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f36823b;
                privacySettingsActivity.f33572a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f36823b.f33576c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f36823b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f32629b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
