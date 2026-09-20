package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class by0 implements Runnable {
    public final int f32556a;
    public final PrivacySettingsActivity f32557b;

    public by0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f32556a = i10;
        this.f32557b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f32556a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f32557b;
                privacySettingsActivity.f31509a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f32557b.f31513c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f32557b;
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(privacySettingsActivity2.getParentActivity(), null);
                xbVar.d(R.raw.email_check_inbox, new String[0]);
                xbVar.f30222b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
