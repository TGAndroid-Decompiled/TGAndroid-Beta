package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class d91 {
    public boolean f36105a;
    public String f36106b;
    public long f36107c;
    public kg.b d;
    public kg.b e;
    public String f36108f;
    public String f36109g;
    public boolean h;
    public final int f36110i;
    public final String f36111j;
    public boolean f36112k;
    public boolean f36113l;
    public boolean f36114m;
    public boolean f36115n;
    public boolean f36116o;

    public d91(String str, int i10) {
        this.f36111j = str;
        this.f36110i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f36112k) {
            this.f36112k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f36108f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new o71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
