package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class o41 {
    public boolean f50468a;
    public String f50469b;
    public long f50470c;
    public mg.b d;
    public mg.b f50471e;
    public String f50472f;
    public String f50473g;
    public boolean h;
    public final int f50474i;
    public final String f50475j;
    public boolean f50476k;
    public boolean f50477l;
    public boolean f50478m;
    public boolean f50479n;
    public boolean f50480o;

    public o41(String str, int i7) {
        this.f50475j = str;
        this.f50474i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.p10 p10Var) {
        if (!this.f50476k) {
            this.f50476k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f50472f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new e31(2, this, p10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
