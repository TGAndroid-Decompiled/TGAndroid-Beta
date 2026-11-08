package org.telegram.ui;
public final class oj implements Runnable {
    public final an f48415a;

    public oj(an anVar) {
        this.f48415a = anVar;
    }

    @Override
    public final void run() {
        String G;
        an anVar = this.f48415a;
        org.telegram.messenger.ij ijVar = anVar.f43971t5;
        if (ijVar != null && anVar.f43826h9 != null) {
            int max = Math.max(0, ijVar.f23262k.ttl_period - (anVar.getConnectionsManager().getCurrentTime() - anVar.f43971t5.f23262k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.id.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            anVar.f43826h9.setSubtext(org.telegram.messenger.id.a0(null, null, 2131753853, G));
            org.telegram.messenger.g0.i3(anVar.f43839i9, 1000L);
        }
    }
}
