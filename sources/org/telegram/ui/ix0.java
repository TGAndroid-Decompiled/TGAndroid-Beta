package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ix0 implements Runnable {
    public final int f37947a;
    public final PrivacySettingsActivity f37948b;

    public ix0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f37947a = i10;
        this.f37948b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37947a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f37948b;
                privacySettingsActivity.f34549a.l();
                privacySettingsActivity.O = true;
                return;
            case 1:
                this.f37948b.f34551c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f37948b;
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(privacySettingsActivity2.getParentActivity(), null);
                qbVar.d(R.raw.email_check_inbox, new String[0]);
                qbVar.f30359b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
