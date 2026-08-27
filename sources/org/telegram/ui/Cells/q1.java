package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pz0;

public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.p5 B;
    public int C;
    public int D;
    public final s1 E;

    public int f25017a;

    public int f25018b;

    public int f25019c;
    public int d;

    public float f25020e;

    public int f25021f;

    public float f25022g;
    public float h;

    public boolean f25023i;

    public int f25024j;

    public boolean f25025k;

    public boolean f25026l;

    public float f25027m;

    public float f25028n;

    public boolean f25029o;

    public StaticLayout f25030p;

    public pz0 f25031q;

    public org.telegram.ui.Components.p5 f25032r;

    public TLRPC.PollAnswer f25033s;

    public TLRPC.TodoItem f25034t;

    public boolean f25035u;
    public int v;

    public Drawable f25036w;

    public bh.b f25037x;

    public org.telegram.ui.Components.y8 f25038y;

    public ImageReceiver f25039z;

    public q1(s1 s1Var) {
        this.E = s1Var;
    }

    public static void n(q1 q1Var, float f10) {
        q1Var.f25020e -= f10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f25039z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        bh.b bVar = this.f25037x;
        if (bVar != null) {
            bVar.f2172b.a();
            bVar.f2173c.onAttachedToWindow();
            bVar.A.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f25039z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        bh.b bVar = this.f25037x;
        if (bVar != null) {
            bVar.f2172b.b();
            bVar.f2173c.onDetachedFromWindow();
            bVar.A.f();
        }
    }
}
