package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ma1 {
    public boolean f39915a;
    public String f39916b;
    public long f39917c;
    public jg.b d;
    public jg.b f39918e;
    public String f39919f;
    public String f39920g;
    public boolean h;
    public final int f39921i;
    public final String f39922j;
    public boolean f39923k;
    public boolean f39924l;
    public boolean f39925m;
    public boolean f39926n;
    public boolean f39927o;

    public ma1(String str, int i10) {
        this.f39922j = str;
        this.f39921i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f39923k) {
            this.f39923k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f39919f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new zb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
