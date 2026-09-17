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
    public int f20647a;
    public int f20648b;
    public int f20649c;
    public int d;
    public float e;
    public int f20650f;
    public float f20651g;
    public float h;
    public boolean f20652i;
    public int f20653j;
    public boolean f20654k;
    public boolean f20655l;
    public float f20656m;
    public float f20657n;
    public boolean f20658o;
    public StaticLayout f20659p;
    public h01 f20660q;
    public org.telegram.ui.Components.t5 f20661r;
    public TLRPC.PollAnswer f20662s;
    public TLRPC.TodoItem f20663t;
    public boolean f20664u;
    public int v;
    public Drawable f20665w;
    public sh.b f20666x;
    public org.telegram.ui.Components.f9 f20667y;
    public ImageReceiver f20668z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f20662s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f20662s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f20653j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f20663t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f20663t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f20652i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f20668z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f20650f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f20655l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f20654k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f20654k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20668z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20666x;
        if (bVar != null) {
            bVar.f42999b.a();
            bVar.f43000c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20668z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20666x;
        if (bVar != null) {
            bVar.f42999b.b();
            bVar.f43000c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
