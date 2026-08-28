package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class e91 {
    public boolean f37869a;
    public String f37870b;
    public long f37871c;
    public rf.b d;
    public rf.b f37872e;
    public String f37873f;
    public String f37874g;
    public boolean h;
    public final int f37875i;
    public final String f37876j;
    public boolean f37877k;
    public boolean f37878l;
    public boolean f37879m;
    public boolean f37880n;
    public boolean f37881o;

    public e91(String str, int i9) {
        this.f37876j = str;
        this.f37875i = i9;
    }

    public final void a(int i9, int i10, int i11, Utilities.Callback0Return callback0Return) {
        if (!this.f37877k) {
            this.f37877k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f37873f;
            ConnectionsManager.getInstance(i9).bindRequestToGuid(ConnectionsManager.getInstance(i9).sendRequest(tL_loadAsyncGraph, new o71(1, this, callback0Return), null, null, 0, i11, 1, true), i10);
        }
    }
}
