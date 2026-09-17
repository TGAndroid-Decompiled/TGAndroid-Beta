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
    public int f22512a;
    public int f22513b;
    public int f22514c;
    public int d;
    public float f22515e;
    public int f22516f;
    public float f22517g;
    public float h;
    public boolean f22518i;
    public int f22519j;
    public boolean f22520k;
    public boolean f22521l;
    public float f22522m;
    public float f22523n;
    public boolean f22524o;
    public StaticLayout f22525p;
    public f01 f22526q;
    public org.telegram.ui.Components.v5 f22527r;
    public TLRPC.PollAnswer f22528s;
    public TLRPC.TodoItem f22529t;
    public boolean f22530u;
    public int v;
    public Drawable f22531w;
    public th.b f22532x;
    public org.telegram.ui.Components.i9 f22533y;
    public ImageReceiver f22534z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f22528s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f22528s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f22519j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f22529t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f22529t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f22518i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f22534z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f22516f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f22521l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.f22515e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.f22515e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f22520k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f22520k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22534z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22532x;
        if (bVar != null) {
            bVar.f46563b.a();
            bVar.f46564c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22534z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22532x;
        if (bVar != null) {
            bVar.f46563b.b();
            bVar.f46564c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
