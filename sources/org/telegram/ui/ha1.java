package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ha1 {
    public boolean f37015a;
    public String f37016b;
    public long f37017c;
    public jg.b d;
    public jg.b f37018e;
    public String f37019f;
    public String f37020g;
    public boolean h;
    public final int f37021i;
    public final String f37022j;
    public boolean f37023k;
    public boolean f37024l;
    public boolean f37025m;
    public boolean f37026n;
    public boolean f37027o;

    public ha1(String str, int i10) {
        this.f37022j = str;
        this.f37021i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f37023k) {
            this.f37023k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f37019f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new zb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
