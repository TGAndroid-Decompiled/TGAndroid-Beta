package org.telegram.ui;
public final class lt0 implements Runnable {
    public final int f47583a;
    public final PrivacySettingsActivity f47584b;

    public lt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f47583a = i7;
        this.f47584b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f47583a;
        PrivacySettingsActivity privacySettingsActivity = this.f47584b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f41677a.f();
                privacySettingsActivity.R = true;
                return;
            case 1:
                privacySettingsActivity.f41681c.dismiss();
                return;
            default:
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(privacySettingsActivity.getParentActivity(), null);
                kbVar.d(2131624008, new String[0]);
                kbVar.f35269b.setText(org.telegram.messenger.id.M0(2131742814, null));
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
