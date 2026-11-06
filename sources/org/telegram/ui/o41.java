package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class o41 {
    public boolean f48253a;
    public String f48254b;
    public long f48255c;
    public mg.b d;
    public mg.b f48256e;
    public String f48257f;
    public String f48258g;
    public boolean h;
    public final int f48259i;
    public final String f48260j;
    public boolean f48261k;
    public boolean f48262l;
    public boolean f48263m;
    public boolean f48264n;
    public boolean f48265o;

    public o41(String str, int i7) {
        this.f48260j = str;
        this.f48259i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.u10 u10Var) {
        if (!this.f48261k) {
            this.f48261k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f48257f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new n41(0, this, u10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
