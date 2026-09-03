package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class aa1 {
    public boolean f32526a;
    public String f32527b;
    public long f32528c;
    public wf.b d;
    public wf.b e;
    public String f32529f;
    public String f32530g;
    public boolean h;
    public final int f32531i;
    public final String f32532j;
    public boolean f32533k;
    public boolean f32534l;
    public boolean f32535m;
    public boolean f32536n;
    public boolean f32537o;

    public aa1(String str, int i10) {
        this.f32532j = str;
        this.f32531i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f32533k) {
            this.f32533k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f32529f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ub0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
