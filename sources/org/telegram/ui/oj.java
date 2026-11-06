package org.telegram.ui;
public final class oj implements Runnable {
    public final an f48393a;

    public oj(an anVar) {
        this.f48393a = anVar;
    }

    @Override
    public final void run() {
        String G;
        an anVar = this.f48393a;
        org.telegram.messenger.ij ijVar = anVar.f43941t5;
        if (ijVar != null && anVar.f43796h9 != null) {
            int max = Math.max(0, ijVar.f23237k.ttl_period - (anVar.getConnectionsManager().getCurrentTime() - anVar.f43941t5.f23237k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.hd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            anVar.f43796h9.setSubtext(org.telegram.messenger.hd.a0(null, null, 2131753853, G));
            org.telegram.messenger.g0.i3(anVar.f43809i9, 1000L);
        }
    }
}
