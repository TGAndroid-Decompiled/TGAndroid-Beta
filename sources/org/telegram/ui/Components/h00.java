package org.telegram.ui.Components;
public final class h00 implements Runnable {
    public final FragmentContextView f34060a;

    public h00(FragmentContextView fragmentContextView) {
        this.f34060a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f34060a;
        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
        if (fragmentContextView.f31388g0 != null && (f2Var instanceof org.telegram.ui.an)) {
            org.telegram.messenger.r3 groupCall = fragmentContextView.f31394n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f25222b.schedule_date - f2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                i6 i6Var = fragmentContextView.f31391j0;
                if (!fragmentContextView.f31390i0) {
                    j02 = org.telegram.messenger.id.M0(2131743443, null);
                }
                i6Var.t(j02, true, true);
                org.telegram.messenger.g0.i3(fragmentContextView.m0, 1000L);
                fragmentContextView.f31401s.invalidate();
                return;
            }
            fragmentContextView.f31389h0 = false;
            fragmentContextView.f31393l0 = false;
            return;
        }
        fragmentContextView.f31393l0 = false;
    }
}
