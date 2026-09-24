package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ea1 {
    public boolean f33317a;
    public String f33318b;
    public long f33319c;
    public jg.b d;
    public jg.b e;
    public String f33320f;
    public String f33321g;
    public boolean h;
    public final int f33322i;
    public final String f33323j;
    public boolean f33324k;
    public boolean f33325l;
    public boolean f33326m;
    public boolean f33327n;
    public boolean f33328o;

    public ea1(String str, int i10) {
        this.f33323j = str;
        this.f33322i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f33324k) {
            this.f33324k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f33320f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new vb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
