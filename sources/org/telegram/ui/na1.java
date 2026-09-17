package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f38895a;
    public String f38896b;
    public long f38897c;
    public kg.b d;
    public kg.b f38898e;
    public String f38899f;
    public String f38900g;
    public boolean h;
    public final int f38901i;
    public final String f38902j;
    public boolean f38903k;
    public boolean f38904l;
    public boolean f38905m;
    public boolean f38906n;
    public boolean f38907o;

    public na1(String str, int i10) {
        this.f38902j = str;
        this.f38901i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f38903k) {
            this.f38903k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f38899f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new bc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
