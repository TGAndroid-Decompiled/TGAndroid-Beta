package org.telegram.ui.Components;
public final class h00 implements Runnable {
    public final FragmentContextView f34113a;

    public h00(FragmentContextView fragmentContextView) {
        this.f34113a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f34113a;
        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
        if (fragmentContextView.f31393g0 != null && (f2Var instanceof org.telegram.ui.cn)) {
            org.telegram.messenger.r3 groupCall = fragmentContextView.f31399n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f25222b.schedule_date - f2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                i6 i6Var = fragmentContextView.f31396j0;
                if (!fragmentContextView.f31395i0) {
                    j02 = org.telegram.messenger.id.M0(2131743440, null);
                }
                i6Var.t(j02, true, true);
                org.telegram.messenger.g0.i3(fragmentContextView.m0, 1000L);
                fragmentContextView.f31406s.invalidate();
                return;
            }
            fragmentContextView.f31394h0 = false;
            fragmentContextView.f31398l0 = false;
            return;
        }
        fragmentContextView.f31398l0 = false;
    }
}
