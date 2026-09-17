package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class by0 implements Runnable {
    public final int f34971a;
    public final PrivacySettingsActivity f34972b;

    public by0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f34971a = i10;
        this.f34972b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f34971a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f34972b;
                privacySettingsActivity.f33870a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f34972b.f33874c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f34972b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f32904b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
