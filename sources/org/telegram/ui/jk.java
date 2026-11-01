package org.telegram.ui;
public final class jk implements Runnable {
    public final un f38404a;

    public jk(un unVar) {
        this.f38404a = unVar;
    }

    @Override
    public final void run() {
        String G;
        un unVar = this.f38404a;
        org.telegram.messenger.kj kjVar = unVar.f42232t5;
        if (kjVar != null && unVar.f42087h9 != null) {
            int max = Math.max(0, kjVar.f16690k.ttl_period - (unVar.getConnectionsManager().getCurrentTime() - unVar.f42232t5.f16690k.date));
            if (max < 86400) {
                G = org.telegram.messenger.i0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.dd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            unVar.f42087h9.setSubtext(org.telegram.messenger.dd.a0(null, null, 2131753853, G));
            org.telegram.messenger.i0.h3(unVar.f42099i9, 1000L);
        }
    }
}
