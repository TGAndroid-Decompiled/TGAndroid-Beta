package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f40148a;
    public String f40149b;
    public long f40150c;
    public jg.b d;
    public jg.b f40151e;
    public String f40152f;
    public String f40153g;
    public boolean h;
    public final int f40154i;
    public final String f40155j;
    public boolean f40156k;
    public boolean f40157l;
    public boolean f40158m;
    public boolean f40159n;
    public boolean f40160o;

    public na1(String str, int i10) {
        this.f40155j = str;
        this.f40154i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40156k) {
            this.f40156k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40152f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ac0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
