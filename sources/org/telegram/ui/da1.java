package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class da1 {
    public boolean f32551a;
    public String f32552b;
    public long f32553c;
    public jg.b d;
    public jg.b e;
    public String f32554f;
    public String f32555g;
    public boolean h;
    public final int f32556i;
    public final String f32557j;
    public boolean f32558k;
    public boolean f32559l;
    public boolean f32560m;
    public boolean f32561n;
    public boolean f32562o;

    public da1(String str, int i10) {
        this.f32557j = str;
        this.f32556i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f32558k) {
            this.f32558k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f32554f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new wb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
