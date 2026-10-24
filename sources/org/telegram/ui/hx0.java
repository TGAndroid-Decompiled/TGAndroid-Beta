package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hx0 implements Runnable {
    public final int f38068a;
    public final PrivacySettingsActivity f38069b;

    public hx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f38068a = i10;
        this.f38069b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38068a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f38069b;
                privacySettingsActivity.f33871a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f38069b.f33875c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f38069b;
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(privacySettingsActivity2.getParentActivity(), null);
                wbVar.d(R.raw.email_check_inbox, new String[0]);
                wbVar.f32176b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
