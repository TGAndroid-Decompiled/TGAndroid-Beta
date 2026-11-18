package org.telegram.ui.Components;
public final class r00 implements Runnable {
    public final FragmentContextView f38962a;

    public r00(FragmentContextView fragmentContextView) {
        this.f38962a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j02;
        FragmentContextView fragmentContextView = this.f38962a;
        org.telegram.ui.ActionBar.h2 h2Var = fragmentContextView.h;
        if (fragmentContextView.f32964h0 != null && (h2Var instanceof org.telegram.ui.bn)) {
            org.telegram.messenger.t3 groupCall = fragmentContextView.f32969n.getGroupCall();
            if (groupCall != null && groupCall.j()) {
                int currentTime = groupCall.f26935b.schedule_date - h2Var.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j02 = org.telegram.messenger.gd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j02 = org.telegram.messenger.g0.j0(currentTime);
                }
                m6 m6Var = fragmentContextView.f32967k0;
                if (!fragmentContextView.f32966j0) {
                    j02 = org.telegram.messenger.gd.M0(2131743203, null);
                }
                m6Var.t(j02, true, true);
                org.telegram.messenger.g0.h3(fragmentContextView.f32970n0, 1000L);
                fragmentContextView.f32976s.invalidate();
                return;
            }
            fragmentContextView.f32965i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        fragmentContextView.m0 = false;
    }
}
