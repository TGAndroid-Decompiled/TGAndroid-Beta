package org.telegram.ui.Components;
public final class c00 implements Runnable {
    public final FragmentContextView f32492a;

    public c00(FragmentContextView fragmentContextView) {
        this.f32492a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f32492a;
        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
        if (fragmentContextView.f31460h0 != null && (d2Var instanceof org.telegram.ui.wm)) {
            org.telegram.messenger.r3 groupCall = fragmentContextView.f31465n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f25049b.schedule_date - d2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.bd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                g6 g6Var = fragmentContextView.f31463k0;
                if (!fragmentContextView.f31462j0) {
                    j02 = org.telegram.messenger.bd.M0(2131743450, null);
                }
                g6Var.t(j02, true, true);
                org.telegram.messenger.g0.i3(fragmentContextView.f31466n0, 1000L);
                fragmentContextView.f31472s.invalidate();
                return;
            }
            fragmentContextView.f31461i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        fragmentContextView.m0 = false;
    }
}
