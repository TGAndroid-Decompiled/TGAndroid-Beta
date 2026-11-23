package org.telegram.ui;
public final class mt0 implements Runnable {
    public final int f49989a;
    public final PrivacySettingsActivity f49990b;

    public mt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f49989a = i7;
        this.f49990b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f49989a;
        PrivacySettingsActivity privacySettingsActivity = this.f49990b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f43537a.f();
                privacySettingsActivity.S = true;
                return;
            case 1:
                privacySettingsActivity.f43541c.dismiss();
                return;
            default:
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(privacySettingsActivity.getParentActivity(), null);
                obVar.d(2131624009, new String[0]);
                obVar.f38158b.setText(org.telegram.messenger.hd.N0(2131742545, null));
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
