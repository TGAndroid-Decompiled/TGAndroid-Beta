package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mx0 implements Runnable {
    public final int f41719a;
    public final PrivacySettingsActivity f41720b;

    public mx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f41719a = i10;
        this.f41720b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41719a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f41720b;
                privacySettingsActivity.f35935a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f41720b.f35939c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f41720b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f35001b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
