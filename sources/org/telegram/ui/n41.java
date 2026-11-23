package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class n41 {
    public boolean f50208a;
    public String f50209b;
    public long f50210c;
    public mg.b d;
    public mg.b f50211e;
    public String f50212f;
    public String f50213g;
    public boolean h;
    public final int f50214i;
    public final String f50215j;
    public boolean f50216k;
    public boolean f50217l;
    public boolean f50218m;
    public boolean f50219n;
    public boolean f50220o;

    public n41(String str, int i7) {
        this.f50215j = str;
        this.f50214i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.o10 o10Var) {
        if (!this.f50216k) {
            this.f50216k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f50212f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new d31(2, this, o10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
