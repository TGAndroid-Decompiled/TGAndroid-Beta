package org.telegram.ui;
public final class oj implements Runnable {
    public final an f48421a;

    public oj(an anVar) {
        this.f48421a = anVar;
    }

    @Override
    public final void run() {
        String G;
        an anVar = this.f48421a;
        org.telegram.messenger.ij ijVar = anVar.f43965t5;
        if (ijVar != null && anVar.f43820h9 != null) {
            int max = Math.max(0, ijVar.f23244k.ttl_period - (anVar.getConnectionsManager().getCurrentTime() - anVar.f43965t5.f23244k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.hd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            anVar.f43820h9.setSubtext(org.telegram.messenger.hd.a0(null, null, 2131753853, G));
            org.telegram.messenger.g0.i3(anVar.f43833i9, 1000L);
        }
    }
}
