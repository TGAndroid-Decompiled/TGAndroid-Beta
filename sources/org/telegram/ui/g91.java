package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class g91 {
    public boolean f37531a;
    public String f37532b;
    public long f37533c;
    public kg.b d;
    public kg.b e;
    public String f37534f;
    public String f37535g;
    public boolean h;
    public final int f37536i;
    public final String f37537j;
    public boolean f37538k;
    public boolean f37539l;
    public boolean f37540m;
    public boolean f37541n;
    public boolean f37542o;

    public g91(String str, int i10) {
        this.f37537j = str;
        this.f37536i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f37538k) {
            this.f37538k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f37534f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new q71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
