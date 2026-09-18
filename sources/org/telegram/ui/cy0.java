package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cy0 implements Runnable {
    public final int f32973a;
    public final PrivacySettingsActivity f32974b;

    public cy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f32973a = i10;
        this.f32974b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f32973a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f32974b;
                privacySettingsActivity.f31242a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f32974b.f31246c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f32974b;
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(privacySettingsActivity2.getParentActivity(), null);
                wbVar.d(R.raw.email_check_inbox, new String[0]);
                wbVar.f29626b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
