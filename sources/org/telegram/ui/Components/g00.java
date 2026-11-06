package org.telegram.ui.Components;
public final class g00 implements Runnable {
    public final FragmentContextView f33701a;

    public g00(FragmentContextView fragmentContextView) {
        this.f33701a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f33701a;
        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
        if (fragmentContextView.f31383g0 != null && (f2Var instanceof org.telegram.ui.an)) {
            org.telegram.messenger.r3 groupCall = fragmentContextView.f31389n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f25201b.schedule_date - f2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                i6 i6Var = fragmentContextView.f31386j0;
                if (!fragmentContextView.f31385i0) {
                    j02 = org.telegram.messenger.hd.M0(2131743441, null);
                }
                i6Var.t(j02, true, true);
                org.telegram.messenger.g0.i3(fragmentContextView.m0, 1000L);
                fragmentContextView.f31396s.invalidate();
                return;
            }
            fragmentContextView.f31384h0 = false;
            fragmentContextView.f31388l0 = false;
            return;
        }
        fragmentContextView.f31388l0 = false;
    }
}
