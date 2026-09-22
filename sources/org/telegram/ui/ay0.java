package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ay0 implements Runnable {
    public final int f31989a;
    public final PrivacySettingsActivity f31990b;

    public ay0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f31989a = i10;
        this.f31990b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f31989a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f31990b;
                privacySettingsActivity.f31222a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f31990b.f31226c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f31990b;
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(privacySettingsActivity2.getParentActivity(), null);
                wbVar.d(R.raw.email_check_inbox, new String[0]);
                wbVar.f29679b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.oc.g(privacySettingsActivity2, wbVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
