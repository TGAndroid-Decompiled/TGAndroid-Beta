package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f01;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f22511a;
    public int f22512b;
    public int f22513c;
    public int d;
    public float f22514e;
    public int f22515f;
    public float f22516g;
    public float h;
    public boolean f22517i;
    public int f22518j;
    public boolean f22519k;
    public boolean f22520l;
    public float f22521m;
    public float f22522n;
    public boolean f22523o;
    public StaticLayout f22524p;
    public f01 f22525q;
    public org.telegram.ui.Components.v5 f22526r;
    public TLRPC.PollAnswer f22527s;
    public TLRPC.TodoItem f22528t;
    public boolean f22529u;
    public int v;
    public Drawable f22530w;
    public th.b f22531x;
    public org.telegram.ui.Components.i9 f22532y;
    public ImageReceiver f22533z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f22527s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f22527s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f22518j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f22528t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f22528t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f22517i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f22533z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f22515f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f22520l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.f22514e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.f22514e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f22519k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f22519k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22533z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22531x;
        if (bVar != null) {
            bVar.f46562b.a();
            bVar.f46563c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22533z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22531x;
        if (bVar != null) {
            bVar.f46562b.b();
            bVar.f46563c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
