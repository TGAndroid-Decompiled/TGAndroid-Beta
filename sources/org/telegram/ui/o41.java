package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class o41 {
    public boolean f50463a;
    public String f50464b;
    public long f50465c;
    public mg.b d;
    public mg.b f50466e;
    public String f50467f;
    public String f50468g;
    public boolean h;
    public final int f50469i;
    public final String f50470j;
    public boolean f50471k;
    public boolean f50472l;
    public boolean f50473m;
    public boolean f50474n;
    public boolean f50475o;

    public o41(String str, int i7) {
        this.f50470j = str;
        this.f50469i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.p10 p10Var) {
        if (!this.f50471k) {
            this.f50471k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f50467f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new e31(2, this, p10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
