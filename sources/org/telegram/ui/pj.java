package org.telegram.ui;
public final class pj implements Runnable {
    public final bn f50891a;

    public pj(bn bnVar) {
        this.f50891a = bnVar;
    }

    @Override
    public final void run() {
        String G;
        bn bnVar = this.f50891a;
        org.telegram.messenger.gj gjVar = bnVar.f46228v5;
        if (gjVar != null && bnVar.f46106l9 != null) {
            int max = Math.max(0, gjVar.f24213k.ttl_period - (bnVar.getConnectionsManager().getCurrentTime() - bnVar.f46228v5.f24213k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.hd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            bnVar.f46106l9.setSubtext(org.telegram.messenger.hd.a0(null, null, 2131753850, G));
            org.telegram.messenger.g0.h3(bnVar.f46119m9, 1000L);
        }
    }
}
