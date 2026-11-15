package org.telegram.ui.Components;
public final class k00 implements Runnable {
    public final FragmentContextView f36219a;

    public k00(FragmentContextView fragmentContextView) {
        this.f36219a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f36219a;
        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
        if (fragmentContextView.f32567h0 != null && (e2Var instanceof org.telegram.ui.an)) {
            org.telegram.messenger.r3 groupCall = fragmentContextView.f32572n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f26208b.schedule_date - e2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                g6 g6Var = fragmentContextView.f32570k0;
                if (!fragmentContextView.f32569j0) {
                    j02 = org.telegram.messenger.hd.M0(2131743440, null);
                }
                g6Var.t(j02, true, true);
                org.telegram.messenger.g0.i3(fragmentContextView.f32573n0, 1000L);
                fragmentContextView.f32579s.invalidate();
                return;
            }
            fragmentContextView.f32568i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        fragmentContextView.m0 = false;
    }
}
