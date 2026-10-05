package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class fa1 {
    public boolean f36244a;
    public String f36245b;
    public long f36246c;
    public jg.b d;
    public jg.b f36247e;
    public String f36248f;
    public String f36249g;
    public boolean h;
    public final int f36250i;
    public final String f36251j;
    public boolean f36252k;
    public boolean f36253l;
    public boolean f36254m;
    public boolean f36255n;
    public boolean f36256o;

    public fa1(String str, int i10) {
        this.f36251j = str;
        this.f36250i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f36252k) {
            this.f36252k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f36248f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new zb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
