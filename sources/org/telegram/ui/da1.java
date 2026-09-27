package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class da1 {
    public boolean f32906a;
    public String f32907b;
    public long f32908c;
    public jg.b d;
    public jg.b e;
    public String f32909f;
    public String f32910g;
    public boolean h;
    public final int f32911i;
    public final String f32912j;
    public boolean f32913k;
    public boolean f32914l;
    public boolean f32915m;
    public boolean f32916n;
    public boolean f32917o;

    public da1(String str, int i10) {
        this.f32912j = str;
        this.f32911i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f32913k) {
            this.f32913k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f32909f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new yb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
