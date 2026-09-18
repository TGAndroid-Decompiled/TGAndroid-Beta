package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class la1 {
    public boolean f35322a;
    public String f35323b;
    public long f35324c;
    public jg.b d;
    public jg.b e;
    public String f35325f;
    public String f35326g;
    public boolean h;
    public final int f35327i;
    public final String f35328j;
    public boolean f35329k;
    public boolean f35330l;
    public boolean f35331m;
    public boolean f35332n;
    public boolean f35333o;

    public la1(String str, int i10) {
        this.f35328j = str;
        this.f35327i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35329k) {
            this.f35329k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35325f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new cc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
