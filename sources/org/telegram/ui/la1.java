package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class la1 {
    public boolean f35367a;
    public String f35368b;
    public long f35369c;
    public jg.b d;
    public jg.b e;
    public String f35370f;
    public String f35371g;
    public boolean h;
    public final int f35372i;
    public final String f35373j;
    public boolean f35374k;
    public boolean f35375l;
    public boolean f35376m;
    public boolean f35377n;
    public boolean f35378o;

    public la1(String str, int i10) {
        this.f35373j = str;
        this.f35372i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35374k) {
            this.f35374k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35370f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new bc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
