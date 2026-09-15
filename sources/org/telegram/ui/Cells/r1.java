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
    public int f20637a;
    public int f20638b;
    public int f20639c;
    public int d;
    public float e;
    public int f20640f;
    public float f20641g;
    public float h;
    public boolean f20642i;
    public int f20643j;
    public boolean f20644k;
    public boolean f20645l;
    public float f20646m;
    public float f20647n;
    public boolean f20648o;
    public StaticLayout f20649p;
    public g01 f20650q;
    public org.telegram.ui.Components.t5 f20651r;
    public TLRPC.PollAnswer f20652s;
    public TLRPC.TodoItem f20653t;
    public boolean f20654u;
    public int v;
    public Drawable f20655w;
    public sh.b f20656x;
    public org.telegram.ui.Components.f9 f20657y;
    public ImageReceiver f20658z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f20652s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f20652s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f20643j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f20653t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f20653t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f20642i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f20658z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f20640f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f20645l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f20644k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f20644k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20658z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20656x;
        if (bVar != null) {
            bVar.f42977b.a();
            bVar.f42978c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20658z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20656x;
        if (bVar != null) {
            bVar.f42977b.b();
            bVar.f42978c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
