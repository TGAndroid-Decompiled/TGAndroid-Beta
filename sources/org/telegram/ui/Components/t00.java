package org.telegram.ui.Components;
public final class t00 implements Runnable {
    public final FragmentContextView f39751a;

    public t00(FragmentContextView fragmentContextView) {
        this.f39751a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f39751a;
        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
        if (fragmentContextView.f32997h0 != null && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.messenger.t3 groupCall = fragmentContextView.f33002n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f26963b.schedule_date - g2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.gd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                n6 n6Var = fragmentContextView.f33000k0;
                if (!fragmentContextView.f32999j0) {
                    j02 = org.telegram.messenger.gd.N0(2131743197, null);
                }
                n6Var.t(j02, true, true);
                org.telegram.messenger.g0.h3(fragmentContextView.f33003n0, 1000L);
                fragmentContextView.f33009s.invalidate();
                return;
            }
            fragmentContextView.f32998i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        fragmentContextView.m0 = false;
    }
}
