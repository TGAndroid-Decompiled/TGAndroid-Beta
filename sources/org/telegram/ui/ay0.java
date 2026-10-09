package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ay0 implements Runnable {
    public final int f36074a;
    public final PrivacySettingsActivity f36075b;

    public ay0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f36074a = i10;
        this.f36075b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f36074a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f36075b;
                privacySettingsActivity.f34197a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f36075b.f34201c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f36075b;
                org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(privacySettingsActivity2.getParentActivity(), null);
                bcVar.d(R.raw.email_check_inbox, new String[0]);
                bcVar.f24967b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.tc.g(privacySettingsActivity2, bcVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
