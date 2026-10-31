package org.telegram.ui;
public final class jk implements Runnable {
    public final un f38537a;

    public jk(un unVar) {
        this.f38537a = unVar;
    }

    @Override
    public final void run() {
        String G;
        un unVar = this.f38537a;
        org.telegram.messenger.jj jjVar = unVar.f42421t5;
        if (jjVar != null && unVar.f42276h9 != null) {
            int max = Math.max(0, jjVar.f16337k.ttl_period - (unVar.getConnectionsManager().getCurrentTime() - unVar.f42421t5.f16337k.date));
            if (max < 86400) {
                G = org.telegram.messenger.i0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.cd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            unVar.f42276h9.setSubtext(org.telegram.messenger.cd.a0(null, null, 2131753853, G));
            org.telegram.messenger.i0.h3(unVar.f42288i9, 1000L);
        }
    }
}
