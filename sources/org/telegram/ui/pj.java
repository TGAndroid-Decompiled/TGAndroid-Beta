package org.telegram.ui;
public final class pj implements Runnable {
    public final bn f51031a;

    public pj(bn bnVar) {
        this.f51031a = bnVar;
    }

    @Override
    public final void run() {
        String G;
        bn bnVar = this.f51031a;
        org.telegram.messenger.fj fjVar = bnVar.f46396v5;
        if (fjVar != null && bnVar.f46274l9 != null) {
            int max = Math.max(0, fjVar.f24073k.ttl_period - (bnVar.getConnectionsManager().getCurrentTime() - bnVar.f46396v5.f24073k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.gd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            bnVar.f46274l9.setSubtext(org.telegram.messenger.gd.a0(null, null, 2131753850, G));
            org.telegram.messenger.g0.h3(bnVar.f46287m9, 1000L);
        }
    }
}
