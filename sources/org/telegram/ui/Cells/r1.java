package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g01;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.t5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f20635a;
    public int f20636b;
    public int f20637c;
    public int d;
    public float e;
    public int f20638f;
    public float f20639g;
    public float h;
    public boolean f20640i;
    public int f20641j;
    public boolean f20642k;
    public boolean f20643l;
    public float f20644m;
    public float f20645n;
    public boolean f20646o;
    public StaticLayout f20647p;
    public g01 f20648q;
    public org.telegram.ui.Components.t5 f20649r;
    public TLRPC.PollAnswer f20650s;
    public TLRPC.TodoItem f20651t;
    public boolean f20652u;
    public int v;
    public Drawable f20653w;
    public sh.b f20654x;
    public org.telegram.ui.Components.f9 f20655y;
    public ImageReceiver f20656z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f20650s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f20650s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f20641j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f20651t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f20651t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f20640i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f20656z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f20638f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f20643l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f20642k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f20642k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20656z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20654x;
        if (bVar != null) {
            bVar.f42973b.a();
            bVar.f42974c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20656z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20654x;
        if (bVar != null) {
            bVar.f42973b.b();
            bVar.f42974c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
