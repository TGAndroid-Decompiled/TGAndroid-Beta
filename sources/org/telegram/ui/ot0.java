package org.telegram.ui;
public final class ot0 implements Runnable {
    public final int f48577a;
    public final PrivacySettingsActivity f48578b;

    public ot0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f48577a = i7;
        this.f48578b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f48577a;
        PrivacySettingsActivity privacySettingsActivity = this.f48578b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f41675a.f();
                privacySettingsActivity.R = true;
                return;
            case 1:
                privacySettingsActivity.f41679c.dismiss();
                return;
            default:
                org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(privacySettingsActivity.getParentActivity(), null);
                jbVar.d(2131624008, new String[0]);
                jbVar.f34883b.setText(org.telegram.messenger.id.M0(2131742811, null));
                org.telegram.ui.Components.bc.g(privacySettingsActivity, jbVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
