package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cy0 implements Runnable {
    public final int f36579a;
    public final PrivacySettingsActivity f36580b;

    public cy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f36579a = i10;
        this.f36580b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36579a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f36580b;
                privacySettingsActivity.f34034a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f36580b.f34038c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f36580b;
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(privacySettingsActivity2.getParentActivity(), null);
                acVar.d(R.raw.email_check_inbox, new String[0]);
                acVar.f24276b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.sc.g(privacySettingsActivity2, acVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
