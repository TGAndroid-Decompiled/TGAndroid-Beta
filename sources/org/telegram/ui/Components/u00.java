package org.telegram.ui.Components;
public final class u00 implements Runnable {
    public final FragmentContextView f30788a;

    public u00(FragmentContextView fragmentContextView) {
        this.f30788a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f30788a;
        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
        if (fragmentContextView.f24041g0 != null && (k2Var instanceof org.telegram.ui.un)) {
            org.telegram.messenger.u3 groupCall = fragmentContextView.f24047n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f18361b.schedule_date - k2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.dd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.i0.j0(currentTime);
                }
                e6 e6Var = fragmentContextView.f24044j0;
                if (!fragmentContextView.f24043i0) {
                    j02 = org.telegram.messenger.dd.L0(2131743466, null);
                }
                e6Var.t(j02, true, true);
                org.telegram.messenger.i0.h3(fragmentContextView.m0, 1000L);
                fragmentContextView.f24054s.invalidate();
                return;
            }
            fragmentContextView.f24042h0 = false;
            fragmentContextView.f24046l0 = false;
            return;
        }
        fragmentContextView.f24046l0 = false;
    }
}
