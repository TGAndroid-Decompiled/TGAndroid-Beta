package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ka1 {
    public boolean f35093a;
    public String f35094b;
    public long f35095c;
    public jg.b d;
    public jg.b e;
    public String f35096f;
    public String f35097g;
    public boolean h;
    public final int f35098i;
    public final String f35099j;
    public boolean f35100k;
    public boolean f35101l;
    public boolean f35102m;
    public boolean f35103n;
    public boolean f35104o;

    public ka1(String str, int i10) {
        this.f35099j = str;
        this.f35098i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35100k) {
            this.f35100k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35096f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new bc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
