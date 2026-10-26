package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q11;
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.y5 B;
    public int C;
    public int D;
    public final s1 E;
    public int f24790a;
    public int f24791b;
    public int f24792c;
    public int d;
    public float e;
    public int f24793f;
    public float f24794g;
    public float h;
    public boolean f24795i;
    public int f24796j;
    public boolean f24797k;
    public boolean f24798l;
    public float f24799m;
    public float f24800n;
    public boolean f24801o;
    public StaticLayout f24802p;
    public q11 f24803q;
    public org.telegram.ui.Components.y5 f24804r;
    public TLRPC.PollAnswer f24805s;
    public TLRPC.TodoItem f24806t;
    public boolean f24807u;
    public int v;
    public Drawable f24808w;
    public uh.b f24809x;
    public org.telegram.ui.Components.j9 f24810y;
    public ImageReceiver f24811z;

    public q1(s1 s1Var) {
        this.E = s1Var;
    }

    public static TLRPC.PollAnswer a(q1 q1Var) {
        return q1Var.f24805s;
    }

    public static void b(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        q1Var.f24805s = pollAnswer;
    }

    public static void c(q1 q1Var, int i10) {
        q1Var.f24796j = i10;
    }

    public static TLRPC.TodoItem d(q1 q1Var) {
        return q1Var.f24806t;
    }

    public static void e(q1 q1Var, TLRPC.TodoItem todoItem) {
        q1Var.f24806t = todoItem;
    }

    public static boolean f(q1 q1Var) {
        return q1Var.f24795i;
    }

    public static ImageReceiver g(q1 q1Var) {
        return q1Var.f24811z;
    }

    public static int h(q1 q1Var) {
        return q1Var.d;
    }

    public static void i(q1 q1Var, int i10) {
        q1Var.f24793f = i10;
    }

    public static void j(q1 q1Var, float f7) {
        q1Var.h = f7;
    }

    public static StaticLayout k(q1 q1Var) {
        return q1Var.A;
    }

    public static void l(q1 q1Var, boolean z10) {
        q1Var.f24798l = z10;
    }

    public static float m(q1 q1Var) {
        return q1Var.e;
    }

    public static void n(q1 q1Var, float f7) {
        q1Var.e -= f7;
    }

    public static boolean o(q1 q1Var) {
        return q1Var.f24797k;
    }

    public static void p(q1 q1Var, boolean z10) {
        q1Var.f24797k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f24811z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        uh.b bVar = this.f24809x;
        if (bVar != null) {
            bVar.f49903b.a();
            bVar.f49904c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f24811z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        uh.b bVar = this.f24809x;
        if (bVar != null) {
            bVar.f49903b.b();
            bVar.f49904c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
