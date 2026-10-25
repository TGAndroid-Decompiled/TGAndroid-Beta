package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class i91 {
    public boolean f40183a;
    public String f40184b;
    public long f40185c;
    public lg.b d;
    public lg.b e;
    public String f40186f;
    public String f40187g;
    public boolean h;
    public final int f40188i;
    public final String f40189j;
    public boolean f40190k;
    public boolean f40191l;
    public boolean f40192m;
    public boolean f40193n;
    public boolean f40194o;

    public i91(String str, int i10) {
        this.f40189j = str;
        this.f40188i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40190k) {
            this.f40190k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40186f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new l71(3, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
