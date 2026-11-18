package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class o41 {
    public boolean f50447a;
    public String f50448b;
    public long f50449c;
    public mg.b d;
    public mg.b f50450e;
    public String f50451f;
    public String f50452g;
    public boolean h;
    public final int f50453i;
    public final String f50454j;
    public boolean f50455k;
    public boolean f50456l;
    public boolean f50457m;
    public boolean f50458n;
    public boolean f50459o;

    public o41(String str, int i7) {
        this.f50454j = str;
        this.f50453i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.p10 p10Var) {
        if (!this.f50455k) {
            this.f50455k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f50451f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new e31(2, this, p10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
