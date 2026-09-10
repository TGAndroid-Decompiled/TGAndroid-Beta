package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cy0 implements Runnable {
    public final int f31788a;
    public final PrivacySettingsActivity f31789b;

    public cy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f31788a = i10;
        this.f31789b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f31788a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f31789b;
                privacySettingsActivity.f30337a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f31789b.f30341c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f31789b;
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(privacySettingsActivity2.getParentActivity(), null);
                xbVar.d(R.raw.email_check_inbox, new String[0]);
                xbVar.f29000b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.pc.g(privacySettingsActivity2, xbVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
