package org.telegram.ui;
public final class lt0 implements Runnable {
    public final int f49840a;
    public final PrivacySettingsActivity f49841b;

    public lt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f49840a = i7;
        this.f49841b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f49840a;
        PrivacySettingsActivity privacySettingsActivity = this.f49841b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f43618a.f();
                privacySettingsActivity.S = true;
                return;
            case 1:
                privacySettingsActivity.f43622c.dismiss();
                return;
            default:
                org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(privacySettingsActivity.getParentActivity(), null);
                nbVar.d(2131624009, new String[0]);
                nbVar.f37752b.setText(org.telegram.messenger.gd.N0(2131742540, null));
                org.telegram.ui.Components.fc.g(privacySettingsActivity, nbVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
