package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ma1 {
    public boolean f39881a;
    public String f39882b;
    public long f39883c;
    public jg.b d;
    public jg.b f39884e;
    public String f39885f;
    public String f39886g;
    public boolean h;
    public final int f39887i;
    public final String f39888j;
    public boolean f39889k;
    public boolean f39890l;
    public boolean f39891m;
    public boolean f39892n;
    public boolean f39893o;

    public ma1(String str, int i10) {
        this.f39888j = str;
        this.f39887i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f39889k) {
            this.f39889k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f39885f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new zb0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
