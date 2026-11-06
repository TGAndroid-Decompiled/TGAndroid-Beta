package org.telegram.ui;
public final class kt0 implements Runnable {
    public final int f47285a;
    public final PrivacySettingsActivity f47286b;

    public kt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f47285a = i7;
        this.f47286b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f47285a;
        PrivacySettingsActivity privacySettingsActivity = this.f47286b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f41649a.f();
                privacySettingsActivity.R = true;
                return;
            case 1:
                privacySettingsActivity.f41653c.dismiss();
                return;
            default:
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(privacySettingsActivity.getParentActivity(), null);
                kbVar.d(2131624008, new String[0]);
                kbVar.f35249b.setText(org.telegram.messenger.hd.M0(2131742812, null));
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
