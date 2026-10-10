package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f40192a;
    public String f40193b;
    public long f40194c;
    public jg.b d;
    public jg.b f40195e;
    public String f40196f;
    public String f40197g;
    public boolean h;
    public final int f40198i;
    public final String f40199j;
    public boolean f40200k;
    public boolean f40201l;
    public boolean f40202m;
    public boolean f40203n;
    public boolean f40204o;

    public na1(String str, int i10) {
        this.f40199j = str;
        this.f40198i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40200k) {
            this.f40200k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40196f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ac0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
