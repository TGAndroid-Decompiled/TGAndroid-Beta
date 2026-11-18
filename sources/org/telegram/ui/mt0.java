package org.telegram.ui;
public final class mt0 implements Runnable {
    public final int f49970a;
    public final PrivacySettingsActivity f49971b;

    public mt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f49970a = i7;
        this.f49971b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f49970a;
        PrivacySettingsActivity privacySettingsActivity = this.f49971b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f43492a.f();
                privacySettingsActivity.S = true;
                return;
            case 1:
                privacySettingsActivity.f43496c.dismiss();
                return;
            default:
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(privacySettingsActivity.getParentActivity(), null);
                obVar.d(2131624009, new String[0]);
                obVar.f38055b.setText(org.telegram.messenger.gd.M0(2131742553, null));
                org.telegram.ui.Components.gc.g(privacySettingsActivity, obVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
