package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t01;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.u5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f19731a;
    public int f19732b;
    public int f19733c;
    public int d;
    public float e;
    public int f19734f;
    public float f19735g;
    public float h;
    public boolean f19736i;
    public int f19737j;
    public boolean f19738k;
    public boolean f19739l;
    public float f19740m;
    public float f19741n;
    public boolean f19742o;
    public StaticLayout f19743p;
    public t01 f19744q;
    public org.telegram.ui.Components.u5 f19745r;
    public TLRPC.PollAnswer f19746s;
    public TLRPC.TodoItem f19747t;
    public boolean f19748u;
    public int v;
    public Drawable f19749w;
    public rh.b f19750x;
    public org.telegram.ui.Components.g9 f19751y;
    public ImageReceiver f19752z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f19746s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f19746s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f19737j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f19747t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f19747t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f19736i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f19752z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f19734f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f19739l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f19738k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f19738k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f19752z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        rh.b bVar = this.f19750x;
        if (bVar != null) {
            bVar.f41525b.a();
            bVar.f41526c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f19752z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        rh.b bVar = this.f19750x;
        if (bVar != null) {
            bVar.f41525b.b();
            bVar.f41526c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
