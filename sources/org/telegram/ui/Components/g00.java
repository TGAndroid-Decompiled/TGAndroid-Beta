package org.telegram.ui.Components;
public final class g00 implements Runnable {
    public final FragmentContextView f33707a;

    public g00(FragmentContextView fragmentContextView) {
        this.f33707a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f33707a;
        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
        if (fragmentContextView.f31404g0 != null && (f2Var instanceof org.telegram.ui.cn)) {
            org.telegram.messenger.r3 groupCall = fragmentContextView.f31410n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f25226b.schedule_date - f2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                h6 h6Var = fragmentContextView.f31407j0;
                if (!fragmentContextView.f31406i0) {
                    j02 = org.telegram.messenger.id.M0(2131743440, null);
                }
                h6Var.t(j02, true, true);
                org.telegram.messenger.g0.i3(fragmentContextView.m0, 1000L);
                fragmentContextView.f31417s.invalidate();
                return;
            }
            fragmentContextView.f31405h0 = false;
            fragmentContextView.f31409l0 = false;
            return;
        }
        fragmentContextView.f31409l0 = false;
    }
}
