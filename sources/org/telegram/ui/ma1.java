package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ma1 {
    public boolean f35746a;
    public String f35747b;
    public long f35748c;
    public jg.b d;
    public jg.b e;
    public String f35749f;
    public String f35750g;
    public boolean h;
    public final int f35751i;
    public final String f35752j;
    public boolean f35753k;
    public boolean f35754l;
    public boolean f35755m;
    public boolean f35756n;
    public boolean f35757o;

    public ma1(String str, int i10) {
        this.f35752j = str;
        this.f35751i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35753k) {
            this.f35753k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35749f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new dc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
