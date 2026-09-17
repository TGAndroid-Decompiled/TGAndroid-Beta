package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cy0 implements Runnable {
    public final int f32969a;
    public final PrivacySettingsActivity f32970b;

    public cy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f32969a = i10;
        this.f32970b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f32969a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f32970b;
                privacySettingsActivity.f31238a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f32970b.f31242c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f32970b;
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(privacySettingsActivity2.getParentActivity(), null);
                wbVar.d(R.raw.email_check_inbox, new String[0]);
                wbVar.f29623b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
