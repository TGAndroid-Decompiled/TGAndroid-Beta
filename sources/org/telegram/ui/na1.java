package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f38921a;
    public String f38922b;
    public long f38923c;
    public kg.b d;
    public kg.b f38924e;
    public String f38925f;
    public String f38926g;
    public boolean h;
    public final int f38927i;
    public final String f38928j;
    public boolean f38929k;
    public boolean f38930l;
    public boolean f38931m;
    public boolean f38932n;
    public boolean f38933o;

    public na1(String str, int i10) {
        this.f38928j = str;
        this.f38927i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f38929k) {
            this.f38929k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f38925f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new bc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
