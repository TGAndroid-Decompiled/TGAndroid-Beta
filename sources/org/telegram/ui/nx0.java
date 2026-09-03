package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nx0 implements Runnable {
    public final int f39475a;
    public final PrivacySettingsActivity f39476b;

    public nx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f39475a = i10;
        this.f39476b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f39475a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f39476b;
                privacySettingsActivity.f34549a.l();
                privacySettingsActivity.O = true;
                return;
            case 1:
                this.f39476b.f34551c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f39476b;
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(privacySettingsActivity2.getParentActivity(), null);
                qbVar.d(R.raw.email_check_inbox, new String[0]);
                qbVar.f30375b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
