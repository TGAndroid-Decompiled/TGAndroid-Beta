package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ea1 {
    public boolean f33333a;
    public String f33334b;
    public long f33335c;
    public jg.b d;
    public jg.b e;
    public String f33336f;
    public String f33337g;
    public boolean h;
    public final int f33338i;
    public final String f33339j;
    public boolean f33340k;
    public boolean f33341l;
    public boolean f33342m;
    public boolean f33343n;
    public boolean f33344o;

    public ea1(String str, int i10) {
        this.f33339j = str;
        this.f33338i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f33340k) {
            this.f33340k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f33336f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new vb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
