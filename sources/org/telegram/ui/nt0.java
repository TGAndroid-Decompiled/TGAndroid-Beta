package org.telegram.ui;
public final class nt0 implements Runnable {
    public final int f48233a;
    public final PrivacySettingsActivity f48234b;

    public nt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f48233a = i7;
        this.f48234b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f48233a;
        PrivacySettingsActivity privacySettingsActivity = this.f48234b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f41684a.f();
                privacySettingsActivity.R = true;
                return;
            case 1:
                privacySettingsActivity.f41688c.dismiss();
                return;
            default:
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(privacySettingsActivity.getParentActivity(), null);
                kbVar.d(2131624008, new String[0]);
                kbVar.f35292b.setText(org.telegram.messenger.id.M0(2131742811, null));
                org.telegram.ui.Components.cc.g(privacySettingsActivity, kbVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
