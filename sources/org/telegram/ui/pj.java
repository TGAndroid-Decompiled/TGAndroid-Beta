package org.telegram.ui;
public final class pj implements Runnable {
    public final bn f50859a;

    public pj(bn bnVar) {
        this.f50859a = bnVar;
    }

    @Override
    public final void run() {
        String G;
        bn bnVar = this.f50859a;
        org.telegram.messenger.gj gjVar = bnVar.f46181v5;
        if (gjVar != null && bnVar.f46059l9 != null) {
            int max = Math.max(0, gjVar.f24177k.ttl_period - (bnVar.getConnectionsManager().getCurrentTime() - bnVar.f46181v5.f24177k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.hd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            bnVar.f46059l9.setSubtext(org.telegram.messenger.hd.a0(null, null, 2131753850, G));
            org.telegram.messenger.g0.h3(bnVar.f46072m9, 1000L);
        }
    }
}
