package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

public final class c91 {

    public boolean f37021a;

    public String f37022b;

    public long f37023c;
    public sf.b d;

    public sf.b f37024e;

    public String f37025f;

    public String f37026g;
    public boolean h;

    public final int f37027i;

    public final String f37028j;

    public boolean f37029k;

    public boolean f37030l;

    public boolean f37031m;

    public boolean f37032n;

    public boolean f37033o;

    public c91(String str, int i10) {
        this.f37028j = str;
        this.f37027i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (this.f37029k) {
            return;
        }
        this.f37029k = true;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        tL_loadAsyncGraph.token = this.f37025f;
        ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new v80(28, this, callback0Return), null, null, 0, i12, 1, true), i11);
    }
}
