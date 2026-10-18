package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class d91 {
    public boolean f36126a;
    public String f36127b;
    public long f36128c;
    public kg.b d;
    public kg.b e;
    public String f36129f;
    public String f36130g;
    public boolean h;
    public final int f36131i;
    public final String f36132j;
    public boolean f36133k;
    public boolean f36134l;
    public boolean f36135m;
    public boolean f36136n;
    public boolean f36137o;

    public d91(String str, int i10) {
        this.f36132j = str;
        this.f36131i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f36133k) {
            this.f36133k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f36129f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new o71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
