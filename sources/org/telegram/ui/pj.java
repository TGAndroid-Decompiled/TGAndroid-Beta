package org.telegram.ui;
public final class pj implements Runnable {
    public final bn f50842a;

    public pj(bn bnVar) {
        this.f50842a = bnVar;
    }

    @Override
    public final void run() {
        String G;
        bn bnVar = this.f50842a;
        org.telegram.messenger.fj fjVar = bnVar.f46201v5;
        if (fjVar != null && bnVar.f46079l9 != null) {
            int max = Math.max(0, fjVar.f23965k.ttl_period - (bnVar.getConnectionsManager().getCurrentTime() - bnVar.f46201v5.f23965k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.gd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            bnVar.f46079l9.setSubtext(org.telegram.messenger.gd.a0(null, null, 2131753851, G));
            org.telegram.messenger.g0.h3(bnVar.f46092m9, 1000L);
        }
    }
}
