package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ea1 {
    public boolean f33345a;
    public String f33346b;
    public long f33347c;
    public jg.b d;
    public jg.b e;
    public String f33348f;
    public String f33349g;
    public boolean h;
    public final int f33350i;
    public final String f33351j;
    public boolean f33352k;
    public boolean f33353l;
    public boolean f33354m;
    public boolean f33355n;
    public boolean f33356o;

    public ea1(String str, int i10) {
        this.f33351j = str;
        this.f33350i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f33352k) {
            this.f33352k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f33348f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new vb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
