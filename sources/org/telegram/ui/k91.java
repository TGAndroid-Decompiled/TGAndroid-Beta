package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class k91 {
    public boolean f40704a;
    public String f40705b;
    public long f40706c;
    public lg.b d;
    public lg.b e;
    public String f40707f;
    public String f40708g;
    public boolean h;
    public final int f40709i;
    public final String f40710j;
    public boolean f40711k;
    public boolean f40712l;
    public boolean f40713m;
    public boolean f40714n;
    public boolean f40715o;

    public k91(String str, int i10) {
        this.f40710j = str;
        this.f40709i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40711k) {
            this.f40711k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40707f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new n71(3, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
