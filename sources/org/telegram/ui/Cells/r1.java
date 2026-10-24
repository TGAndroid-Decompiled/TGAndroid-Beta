package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h11;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.u5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f23061a;
    public int f23062b;
    public int f23063c;
    public int d;
    public float e;
    public int f23064f;
    public float f23065g;
    public float h;
    public boolean f23066i;
    public int f23067j;
    public boolean f23068k;
    public boolean f23069l;
    public float f23070m;
    public float f23071n;
    public boolean f23072o;
    public StaticLayout f23073p;
    public h11 f23074q;
    public org.telegram.ui.Components.u5 f23075r;
    public TLRPC.PollAnswer f23076s;
    public TLRPC.TodoItem f23077t;
    public boolean f23078u;
    public int v;
    public Drawable f23079w;
    public th.b f23080x;
    public org.telegram.ui.Components.f9 f23081y;
    public ImageReceiver f23082z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f23076s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f23076s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f23067j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f23077t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f23077t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f23066i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f23082z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f23064f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f23069l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f23068k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f23068k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f23082z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f23080x;
        if (bVar != null) {
            bVar.f47635b.a();
            bVar.f47636c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f23082z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f23080x;
        if (bVar != null) {
            bVar.f47635b.b();
            bVar.f47636c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
