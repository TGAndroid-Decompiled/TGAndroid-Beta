package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ha1 {
    public boolean f37016a;
    public String f37017b;
    public long f37018c;
    public jg.b d;
    public jg.b f37019e;
    public String f37020f;
    public String f37021g;
    public boolean h;
    public final int f37022i;
    public final String f37023j;
    public boolean f37024k;
    public boolean f37025l;
    public boolean f37026m;
    public boolean f37027n;
    public boolean f37028o;

    public ha1(String str, int i10) {
        this.f37023j = str;
        this.f37022i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f37024k) {
            this.f37024k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f37020f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new zb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
