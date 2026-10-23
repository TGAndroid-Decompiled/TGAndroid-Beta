package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i11;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.w5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f23060a;
    public int f23061b;
    public int f23062c;
    public int d;
    public float e;
    public int f23063f;
    public float f23064g;
    public float h;
    public boolean f23065i;
    public int f23066j;
    public boolean f23067k;
    public boolean f23068l;
    public float f23069m;
    public float f23070n;
    public boolean f23071o;
    public StaticLayout f23072p;
    public i11 f23073q;
    public org.telegram.ui.Components.w5 f23074r;
    public TLRPC.PollAnswer f23075s;
    public TLRPC.TodoItem f23076t;
    public boolean f23077u;
    public int v;
    public Drawable f23078w;
    public th.b f23079x;
    public org.telegram.ui.Components.h9 f23080y;
    public ImageReceiver f23081z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f23075s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f23075s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f23066j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f23076t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f23076t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f23065i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f23081z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f23063f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f23068l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f23067k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f23067k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f23081z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f23079x;
        if (bVar != null) {
            bVar.f47636b.a();
            bVar.f47637c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f23081z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f23079x;
        if (bVar != null) {
            bVar.f47636b.b();
            bVar.f47637c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
