package org.telegram.ui;
public final class qj implements Runnable {
    public final cn f49059a;

    public qj(cn cnVar) {
        this.f49059a = cnVar;
    }

    @Override
    public final void run() {
        String G;
        cn cnVar = this.f49059a;
        org.telegram.messenger.ij ijVar = cnVar.f44669t5;
        if (ijVar != null && cnVar.f44548j9 != null) {
            int max = Math.max(0, ijVar.f23266k.ttl_period - (cnVar.getConnectionsManager().getCurrentTime() - cnVar.f44669t5.f23266k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.id.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            cnVar.f44548j9.setSubtext(org.telegram.messenger.id.a0(null, null, 2131753853, G));
            org.telegram.messenger.g0.i3(cnVar.f44562k9, 1000L);
        }
    }
}
