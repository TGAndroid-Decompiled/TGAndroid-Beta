package org.telegram.ui;
public final class qj implements Runnable {
    public final cn f49068a;

    public qj(cn cnVar) {
        this.f49068a = cnVar;
    }

    @Override
    public final void run() {
        String G;
        cn cnVar = this.f49068a;
        org.telegram.messenger.ij ijVar = cnVar.f44628t5;
        if (ijVar != null && cnVar.f44507j9 != null) {
            int max = Math.max(0, ijVar.f23262k.ttl_period - (cnVar.getConnectionsManager().getCurrentTime() - cnVar.f44628t5.f23262k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.id.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            cnVar.f44507j9.setSubtext(org.telegram.messenger.id.a0(null, null, 2131753853, G));
            org.telegram.messenger.g0.i3(cnVar.f44521k9, 1000L);
        }
    }
}
