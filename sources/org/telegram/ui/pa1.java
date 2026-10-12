package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class pa1 {
    public boolean f40892a;
    public String f40893b;
    public long f40894c;
    public jg.b d;
    public jg.b f40895e;
    public String f40896f;
    public String f40897g;
    public boolean h;
    public final int f40898i;
    public final String f40899j;
    public boolean f40900k;
    public boolean f40901l;
    public boolean f40902m;
    public boolean f40903n;
    public boolean f40904o;

    public pa1(String str, int i10) {
        this.f40899j = str;
        this.f40898i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40900k) {
            this.f40900k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40896f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new bc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
