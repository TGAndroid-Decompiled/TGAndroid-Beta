package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f38922a;
    public String f38923b;
    public long f38924c;
    public kg.b d;
    public kg.b f38925e;
    public String f38926f;
    public String f38927g;
    public boolean h;
    public final int f38928i;
    public final String f38929j;
    public boolean f38930k;
    public boolean f38931l;
    public boolean f38932m;
    public boolean f38933n;
    public boolean f38934o;

    public na1(String str, int i10) {
        this.f38929j = str;
        this.f38928i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f38930k) {
            this.f38930k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f38926f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new bc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
