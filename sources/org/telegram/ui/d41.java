package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class d41 {
    public boolean f44538a;
    public String f44539b;
    public long f44540c;
    public ng.b d;
    public ng.b f44541e;
    public String f44542f;
    public String f44543g;
    public boolean h;
    public final int f44544i;
    public final String f44545j;
    public boolean f44546k;
    public boolean f44547l;
    public boolean f44548m;
    public boolean f44549n;
    public boolean f44550o;

    public d41(String str, int i3) {
        this.f44545j = str;
        this.f44544i = i3;
    }

    public final void a(int i3, int i10, int i11, org.telegram.messenger.m10 m10Var) {
        if (!this.f44546k) {
            this.f44546k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f44542f;
            ConnectionsManager.getInstance(i3).bindRequestToGuid(ConnectionsManager.getInstance(i3).sendRequest(tL_loadAsyncGraph, new m21(3, this, m10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
