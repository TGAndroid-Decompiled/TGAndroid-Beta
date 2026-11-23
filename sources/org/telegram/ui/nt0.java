package org.telegram.ui;
public final class nt0 implements Runnable {
    public final int f50322a;
    public final PrivacySettingsActivity f50323b;

    public nt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f50322a = i7;
        this.f50323b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f50322a;
        PrivacySettingsActivity privacySettingsActivity = this.f50323b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f43502a.f();
                privacySettingsActivity.S = true;
                return;
            case 1:
                privacySettingsActivity.f43506c.dismiss();
                return;
            default:
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(privacySettingsActivity.getParentActivity(), null);
                obVar.d(2131624009, new String[0]);
                obVar.f38124b.setText(org.telegram.messenger.hd.N0(2131742547, null));
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
