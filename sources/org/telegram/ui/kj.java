package org.telegram.ui;
public final class kj implements Runnable {
    public final wm f46960a;

    public kj(wm wmVar) {
        this.f46960a = wmVar;
    }

    @Override
    public final void run() {
        String G;
        wm wmVar = this.f46960a;
        org.telegram.messenger.zi ziVar = wmVar.f51500u5;
        if (ziVar != null && wmVar.f51354i9 != null) {
            int max = Math.max(0, ziVar.f26868k.ttl_period - (wmVar.getConnectionsManager().getCurrentTime() - wmVar.f51500u5.f26868k.date));
            if (max < 86400) {
                G = org.telegram.messenger.g0.g0(max, false, true);
            } else {
                G = org.telegram.messenger.bd.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            wmVar.f51354i9.setSubtext(org.telegram.messenger.bd.a0(null, null, 2131753853, G));
            org.telegram.messenger.g0.i3(wmVar.f51368j9, 1000L);
        }
    }
}
