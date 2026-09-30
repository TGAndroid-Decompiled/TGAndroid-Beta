package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ea1 {
    public boolean f33427a;
    public String f33428b;
    public long f33429c;
    public jg.b d;
    public jg.b e;
    public String f33430f;
    public String f33431g;
    public boolean h;
    public final int f33432i;
    public final String f33433j;
    public boolean f33434k;
    public boolean f33435l;
    public boolean f33436m;
    public boolean f33437n;
    public boolean f33438o;

    public ea1(String str, int i10) {
        this.f33433j = str;
        this.f33432i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f33434k) {
            this.f33434k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f33430f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new vb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
