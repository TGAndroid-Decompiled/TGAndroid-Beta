package org.telegram.ui.Components;
public final class t00 implements Runnable {
    public final FragmentContextView f39698a;

    public t00(FragmentContextView fragmentContextView) {
        this.f39698a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f39698a;
        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
        if (fragmentContextView.f32966h0 != null && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.messenger.t3 groupCall = fragmentContextView.f32971n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f26914b.schedule_date - g2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                n6 n6Var = fragmentContextView.f32969k0;
                if (!fragmentContextView.f32968j0) {
                    j02 = org.telegram.messenger.hd.N0(2131743197, null);
                }
                n6Var.t(j02, true, true);
                org.telegram.messenger.g0.h3(fragmentContextView.f32972n0, 1000L);
                fragmentContextView.f32978s.invalidate();
                return;
            }
            fragmentContextView.f32967i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        fragmentContextView.m0 = false;
    }
}
