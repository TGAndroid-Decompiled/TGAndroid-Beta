package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f38894a;
    public String f38895b;
    public long f38896c;
    public kg.b d;
    public kg.b f38897e;
    public String f38898f;
    public String f38899g;
    public boolean h;
    public final int f38900i;
    public final String f38901j;
    public boolean f38902k;
    public boolean f38903l;
    public boolean f38904m;
    public boolean f38905n;
    public boolean f38906o;

    public na1(String str, int i10) {
        this.f38901j = str;
        this.f38900i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f38902k) {
            this.f38902k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f38898f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new bc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
