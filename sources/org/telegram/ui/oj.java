package org.telegram.ui;
public final class oj implements Runnable {
    public final an f49977a;

    public oj(an anVar) {
        this.f49977a = anVar;
    }

    @Override
    public final void run() {
        String G;
        an anVar = this.f49977a;
        org.telegram.messenger.gj gjVar = anVar.f45382u5;
        if (gjVar != null && anVar.f45262k9 != null) {
            int max = Math.max(0, gjVar.f23817k.ttl_period - (anVar.getConnectionsManager().getCurrentTime() - anVar.f45382u5.f23817k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.hd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            anVar.f45262k9.setSubtext(org.telegram.messenger.hd.a0(null, null, 2131753853, G));
            org.telegram.messenger.g0.i3(anVar.f45274l9, 1000L);
        }
    }
}
