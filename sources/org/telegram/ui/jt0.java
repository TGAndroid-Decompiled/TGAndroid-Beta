package org.telegram.ui;
public final class jt0 implements Runnable {
    public final int f48413a;
    public final PrivacySettingsActivity f48414b;

    public jt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f48413a = i7;
        this.f48414b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i7 = this.f48413a;
        PrivacySettingsActivity privacySettingsActivity = this.f48414b;
        switch (i7) {
            case 0:
                privacySettingsActivity.f43047a.f();
                privacySettingsActivity.S = true;
                return;
            case 1:
                privacySettingsActivity.f43051c.dismiss();
                return;
            default:
                org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(privacySettingsActivity.getParentActivity(), null);
                fbVar.d(2131624009, new String[0]);
                fbVar.f34556b.setText(org.telegram.messenger.hd.M0(2131742811, null));
                org.telegram.ui.Components.xb.g(privacySettingsActivity, fbVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
