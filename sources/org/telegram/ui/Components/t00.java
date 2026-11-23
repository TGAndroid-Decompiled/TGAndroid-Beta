package org.telegram.ui.Components;
public final class t00 implements Runnable {
    public final FragmentContextView f39743a;

    public t00(FragmentContextView fragmentContextView) {
        this.f39743a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f39743a;
        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
        if (fragmentContextView.f33000h0 != null && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.messenger.t3 groupCall = fragmentContextView.f33005n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f26950b.schedule_date - g2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                n6 n6Var = fragmentContextView.f33003k0;
                if (!fragmentContextView.f33002j0) {
                    j02 = org.telegram.messenger.hd.N0(2131743195, null);
                }
                n6Var.t(j02, true, true);
                org.telegram.messenger.g0.h3(fragmentContextView.f33006n0, 1000L);
                fragmentContextView.f33012s.invalidate();
                return;
            }
            fragmentContextView.f33001i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        fragmentContextView.m0 = false;
    }
}
