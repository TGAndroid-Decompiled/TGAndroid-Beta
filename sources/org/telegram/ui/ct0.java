package org.telegram.ui;
public final class ct0 implements Runnable {
    public final int f44432a;
    public final PrivacySettingsActivity f44433b;

    public ct0(PrivacySettingsActivity privacySettingsActivity, int i3) {
        this.f44432a = i3;
        this.f44433b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i3 = this.f44432a;
        PrivacySettingsActivity privacySettingsActivity = this.f44433b;
        switch (i3) {
            case 0:
                privacySettingsActivity.f41704a.f();
                privacySettingsActivity.S = true;
                return;
            case 1:
                privacySettingsActivity.f41708c.dismiss();
                return;
            default:
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(privacySettingsActivity.getParentActivity(), null);
                ibVar.d(2131624008, new String[0]);
                ibVar.f34651b.setText(org.telegram.messenger.bd.M0(2131742821, null));
                org.telegram.ui.Components.ac.g(privacySettingsActivity, ibVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
