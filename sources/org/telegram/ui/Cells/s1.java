package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t01;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f20900a;
    public int f20901b;
    public int f20902c;
    public int d;
    public float e;
    public int f20903f;
    public float f20904g;
    public float h;
    public boolean f20905i;
    public int f20906j;
    public boolean f20907k;
    public boolean f20908l;
    public float f20909m;
    public float f20910n;
    public boolean f20911o;
    public StaticLayout f20912p;
    public t01 f20913q;
    public org.telegram.ui.Components.v5 f20914r;
    public TLRPC.PollAnswer f20915s;
    public TLRPC.TodoItem f20916t;
    public boolean f20917u;
    public int v;
    public Drawable f20918w;
    public sh.b f20919x;
    public org.telegram.ui.Components.h9 f20920y;
    public ImageReceiver f20921z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f20915s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f20915s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f20906j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f20916t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f20916t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f20905i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f20921z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f20903f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f20908l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f20907k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f20907k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20921z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20919x;
        if (bVar != null) {
            bVar.f43266b.a();
            bVar.f43267c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20921z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20919x;
        if (bVar != null) {
            bVar.f43266b.b();
            bVar.f43267c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
