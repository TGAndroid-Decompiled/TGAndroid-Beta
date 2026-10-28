package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ox0 implements Runnable {
    public final int f42246a;
    public final PrivacySettingsActivity f42247b;

    public ox0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f42246a = i10;
        this.f42247b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f42246a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f42247b;
                privacySettingsActivity.f35959a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f42247b.f35963c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f42247b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f35028b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.qc.g(privacySettingsActivity2, ybVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.A0();
                return;
        }
    }
}
