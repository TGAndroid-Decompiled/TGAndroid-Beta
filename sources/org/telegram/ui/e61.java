package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class e61 {
    public boolean f36748a;
    public String f36749b;
    public long f36750c;
    public cg.b d;
    public cg.b e;
    public String f36751f;
    public String f36752g;
    public boolean h;
    public final int f36753i;
    public final String f36754j;
    public boolean f36755k;
    public boolean f36756l;
    public boolean f36757m;
    public boolean f36758n;
    public boolean f36759o;

    public e61(String str, int i10) {
        this.f36754j = str;
        this.f36753i = i10;
    }

    public final void a(int i10, int i11, int i12, org.telegram.messenger.j20 j20Var) {
        if (!this.f36755k) {
            this.f36755k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f36751f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new sl0(14, this, j20Var), null, null, 0, i12, 1, true), i11);
        }
    }
}
