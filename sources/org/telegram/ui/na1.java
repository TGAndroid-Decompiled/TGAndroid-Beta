package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f40146a;
    public String f40147b;
    public long f40148c;
    public jg.b d;
    public jg.b f40149e;
    public String f40150f;
    public String f40151g;
    public boolean h;
    public final int f40152i;
    public final String f40153j;
    public boolean f40154k;
    public boolean f40155l;
    public boolean f40156m;
    public boolean f40157n;
    public boolean f40158o;

    public na1(String str, int i10) {
        this.f40153j = str;
        this.f40152i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40154k) {
            this.f40154k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40150f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ac0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
