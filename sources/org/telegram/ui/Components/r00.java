package org.telegram.ui.Components;
public final class r00 implements Runnable {
    public final FragmentContextView f39141a;

    public r00(FragmentContextView fragmentContextView) {
        this.f39141a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f39141a;
        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
        if (fragmentContextView.f33064h0 != null && (g2Var instanceof org.telegram.ui.bn)) {
            org.telegram.messenger.t3 groupCall = fragmentContextView.f33069n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f27034b.schedule_date - g2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.gd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                m6 m6Var = fragmentContextView.f33067k0;
                if (!fragmentContextView.f33066j0) {
                    j02 = org.telegram.messenger.gd.N0(2131743190, null);
                }
                m6Var.t(j02, true, true);
                org.telegram.messenger.g0.h3(fragmentContextView.f33070n0, 1000L);
                fragmentContextView.f33076s.invalidate();
                return;
            }
            fragmentContextView.f33065i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        fragmentContextView.m0 = false;
    }
}
