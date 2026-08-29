package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class f91 {
    public boolean f38069a;
    public String f38070b;
    public long f38071c;
    public uf.b d;
    public uf.b f38072e;
    public String f38073f;
    public String f38074g;
    public boolean h;
    public final int f38075i;
    public final String f38076j;
    public boolean f38077k;
    public boolean f38078l;
    public boolean f38079m;
    public boolean f38080n;
    public boolean f38081o;

    public f91(String str, int i10) {
        this.f38076j = str;
        this.f38075i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f38077k) {
            this.f38077k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f38073f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new u80(27, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
