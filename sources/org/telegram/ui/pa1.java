package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class pa1 {
    public boolean f40890a;
    public String f40891b;
    public long f40892c;
    public jg.b d;
    public jg.b f40893e;
    public String f40894f;
    public String f40895g;
    public boolean h;
    public final int f40896i;
    public final String f40897j;
    public boolean f40898k;
    public boolean f40899l;
    public boolean f40900m;
    public boolean f40901n;
    public boolean f40902o;

    public pa1(String str, int i10) {
        this.f40897j = str;
        this.f40896i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40898k) {
            this.f40898k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40894f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new bc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
