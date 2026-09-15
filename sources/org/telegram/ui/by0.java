package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class by0 implements Runnable {
    public final int f32597a;
    public final PrivacySettingsActivity f32598b;

    public by0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f32597a = i10;
        this.f32598b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f32597a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f32598b;
                privacySettingsActivity.f31224a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f32598b.f31228c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f32598b;
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(privacySettingsActivity2.getParentActivity(), null);
                wbVar.d(R.raw.email_check_inbox, new String[0]);
                wbVar.f29682b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
