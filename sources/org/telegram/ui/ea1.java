package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ea1 {
    public boolean f33343a;
    public String f33344b;
    public long f33345c;
    public jg.b d;
    public jg.b e;
    public String f33346f;
    public String f33347g;
    public boolean h;
    public final int f33348i;
    public final String f33349j;
    public boolean f33350k;
    public boolean f33351l;
    public boolean f33352m;
    public boolean f33353n;
    public boolean f33354o;

    public ea1(String str, int i10) {
        this.f33349j = str;
        this.f33348i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f33350k) {
            this.f33350k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f33346f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new vb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
