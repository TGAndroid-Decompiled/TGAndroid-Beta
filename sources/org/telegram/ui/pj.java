package org.telegram.ui;
public final class pj implements Runnable {
    public final bn f50887a;

    public pj(bn bnVar) {
        this.f50887a = bnVar;
    }

    @Override
    public final void run() {
        String G;
        bn bnVar = this.f50887a;
        org.telegram.messenger.fj fjVar = bnVar.f46224v5;
        if (fjVar != null && bnVar.f46102l9 != null) {
            int max = Math.max(0, fjVar.f23993k.ttl_period - (bnVar.getConnectionsManager().getCurrentTime() - bnVar.f46224v5.f23993k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.gd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            bnVar.f46102l9.setSubtext(org.telegram.messenger.gd.a0(null, null, 2131753850, G));
            org.telegram.messenger.g0.h3(bnVar.f46115m9, 1000L);
        }
    }
}
