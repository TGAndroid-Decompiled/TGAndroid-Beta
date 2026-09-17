package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ma1 {
    public boolean f35741a;
    public String f35742b;
    public long f35743c;
    public jg.b d;
    public jg.b e;
    public String f35744f;
    public String f35745g;
    public boolean h;
    public final int f35746i;
    public final String f35747j;
    public boolean f35748k;
    public boolean f35749l;
    public boolean f35750m;
    public boolean f35751n;
    public boolean f35752o;

    public ma1(String str, int i10) {
        this.f35747j = str;
        this.f35746i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35748k) {
            this.f35748k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35744f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new dc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
