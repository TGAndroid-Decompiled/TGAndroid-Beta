package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ea1 {
    public boolean f33344a;
    public String f33345b;
    public long f33346c;
    public jg.b d;
    public jg.b e;
    public String f33347f;
    public String f33348g;
    public boolean h;
    public final int f33349i;
    public final String f33350j;
    public boolean f33351k;
    public boolean f33352l;
    public boolean f33353m;
    public boolean f33354n;
    public boolean f33355o;

    public ea1(String str, int i10) {
        this.f33350j = str;
        this.f33349i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f33351k) {
            this.f33351k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f33347f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new vb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
