package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class o41 {
    public boolean f50461a;
    public String f50462b;
    public long f50463c;
    public mg.b d;
    public mg.b f50464e;
    public String f50465f;
    public String f50466g;
    public boolean h;
    public final int f50467i;
    public final String f50468j;
    public boolean f50469k;
    public boolean f50470l;
    public boolean f50471m;
    public boolean f50472n;
    public boolean f50473o;

    public o41(String str, int i7) {
        this.f50468j = str;
        this.f50467i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.q10 q10Var) {
        if (!this.f50469k) {
            this.f50469k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f50465f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new e31(2, this, q10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
