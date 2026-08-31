package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l01;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.q5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f23388a;
    public int f23389b;
    public int f23390c;
    public int d;
    public float f23391e;
    public int f23392f;
    public float f23393g;
    public float h;
    public boolean f23394i;
    public int f23395j;
    public boolean f23396k;
    public boolean f23397l;
    public float f23398m;
    public float f23399n;
    public boolean f23400o;
    public StaticLayout f23401p;
    public l01 f23402q;
    public org.telegram.ui.Components.q5 f23403r;
    public TLRPC.PollAnswer f23404s;
    public TLRPC.TodoItem f23405t;
    public boolean f23406u;
    public int v;
    public Drawable f23407w;
    public gh.b f23408x;
    public org.telegram.ui.Components.z8 f23409y;
    public ImageReceiver f23410z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f23404s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f23404s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f23395j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f23405t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f23405t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f23394i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f23410z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f23392f = i10;
    }

    public static void j(r1 r1Var, float f10) {
        r1Var.h = f10;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z4) {
        r1Var.f23397l = z4;
    }

    public static float m(r1 r1Var) {
        return r1Var.f23391e;
    }

    public static void n(r1 r1Var, float f10) {
        r1Var.f23391e -= f10;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f23396k;
    }

    public static void p(r1 r1Var, boolean z4) {
        r1Var.f23396k = z4;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f23410z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        gh.b bVar = this.f23408x;
        if (bVar != null) {
            bVar.f7130b.a();
            bVar.f7131c.onAttachedToWindow();
            bVar.B.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f23410z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        gh.b bVar = this.f23408x;
        if (bVar != null) {
            bVar.f7130b.b();
            bVar.f7131c.onDetachedFromWindow();
            bVar.B.f();
        }
    }
}
