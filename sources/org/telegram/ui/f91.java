package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class f91 {
    public boolean f37243a;
    public String f37244b;
    public long f37245c;
    public kg.b d;
    public kg.b e;
    public String f37246f;
    public String f37247g;
    public boolean h;
    public final int f37248i;
    public final String f37249j;
    public boolean f37250k;
    public boolean f37251l;
    public boolean f37252m;
    public boolean f37253n;
    public boolean f37254o;

    public f91(String str, int i10) {
        this.f37249j = str;
        this.f37248i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f37250k) {
            this.f37250k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f37246f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new p71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
