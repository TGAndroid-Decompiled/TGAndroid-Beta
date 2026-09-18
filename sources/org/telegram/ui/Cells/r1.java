package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h01;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.t5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f20648a;
    public int f20649b;
    public int f20650c;
    public int d;
    public float e;
    public int f20651f;
    public float f20652g;
    public float h;
    public boolean f20653i;
    public int f20654j;
    public boolean f20655k;
    public boolean f20656l;
    public float f20657m;
    public float f20658n;
    public boolean f20659o;
    public StaticLayout f20660p;
    public h01 f20661q;
    public org.telegram.ui.Components.t5 f20662r;
    public TLRPC.PollAnswer f20663s;
    public TLRPC.TodoItem f20664t;
    public boolean f20665u;
    public int v;
    public Drawable f20666w;
    public sh.b f20667x;
    public org.telegram.ui.Components.f9 f20668y;
    public ImageReceiver f20669z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f20663s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f20663s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f20654j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f20664t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f20664t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f20653i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f20669z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f20651f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f20656l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f20655k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f20655k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20669z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20667x;
        if (bVar != null) {
            bVar.f43004b.a();
            bVar.f43005c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20669z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20667x;
        if (bVar != null) {
            bVar.f43004b.b();
            bVar.f43005c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
