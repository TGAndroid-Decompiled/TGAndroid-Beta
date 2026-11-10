package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.m5 B;
    public int C;
    public int D;
    public final q1 E;
    public int f29726a;
    public int f29727b;
    public int f29728c;
    public int d;
    public float f29729e;
    public int f29730f;
    public float f29731g;
    public float h;
    public boolean f29732i;
    public int f29733j;
    public boolean f29734k;
    public boolean f29735l;
    public float f29736m;
    public float f29737n;
    public boolean f29738o;
    public StaticLayout f29739p;
    public my0 f29740q;
    public org.telegram.ui.Components.m5 f29741r;
    public TLRPC.PollAnswer f29742s;
    public TLRPC.TodoItem f29743t;
    public boolean f29744u;
    public int v;
    public Drawable f29745w;
    public uh.b f29746x;
    public org.telegram.ui.Components.v8 f29747y;
    public ImageReceiver f29748z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.f29748z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.f29746x;
        if (bVar != null) {
            bVar.f56907b.a();
            bVar.f56908c.P();
            bVar.E.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.f29748z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        uh.b bVar = this.f29746x;
        if (bVar != null) {
            bVar.f56907b.b();
            bVar.f56908c.R();
            bVar.E.f();
        }
    }
}
