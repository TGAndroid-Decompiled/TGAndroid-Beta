package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class o41 {
    public boolean f50472a;
    public String f50473b;
    public long f50474c;
    public mg.b d;
    public mg.b f50475e;
    public String f50476f;
    public String f50477g;
    public boolean h;
    public final int f50478i;
    public final String f50479j;
    public boolean f50480k;
    public boolean f50481l;
    public boolean f50482m;
    public boolean f50483n;
    public boolean f50484o;

    public o41(String str, int i7) {
        this.f50479j = str;
        this.f50478i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.q10 q10Var) {
        if (!this.f50480k) {
            this.f50480k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f50476f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new e31(2, this, q10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
