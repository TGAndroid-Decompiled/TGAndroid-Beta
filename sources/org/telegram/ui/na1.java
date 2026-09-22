package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f35969a;
    public String f35970b;
    public long f35971c;
    public jg.b d;
    public jg.b e;
    public String f35972f;
    public String f35973g;
    public boolean h;
    public final int f35974i;
    public final String f35975j;
    public boolean f35976k;
    public boolean f35977l;
    public boolean f35978m;
    public boolean f35979n;
    public boolean f35980o;

    public na1(String str, int i10) {
        this.f35975j = str;
        this.f35974i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35976k) {
            this.f35976k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35972f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new dc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
