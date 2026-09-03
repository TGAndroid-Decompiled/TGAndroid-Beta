package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.q5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f23390a;
    public int f23391b;
    public int f23392c;
    public int d;
    public float f23393e;
    public int f23394f;
    public float f23395g;
    public float h;
    public boolean f23396i;
    public int f23397j;
    public boolean f23398k;
    public boolean f23399l;
    public float f23400m;
    public float f23401n;
    public boolean f23402o;
    public StaticLayout f23403p;
    public k01 f23404q;
    public org.telegram.ui.Components.q5 f23405r;
    public TLRPC.PollAnswer f23406s;
    public TLRPC.TodoItem f23407t;
    public boolean f23408u;
    public int v;
    public Drawable f23409w;
    public gh.b f23410x;
    public org.telegram.ui.Components.z8 f23411y;
    public ImageReceiver f23412z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f23406s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f23406s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f23397j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f23407t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f23407t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f23396i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f23412z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f23394f = i10;
    }

    public static void j(r1 r1Var, float f10) {
        r1Var.h = f10;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z4) {
        r1Var.f23399l = z4;
    }

    public static float m(r1 r1Var) {
        return r1Var.f23393e;
    }

    public static void n(r1 r1Var, float f10) {
        r1Var.f23393e -= f10;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f23398k;
    }

    public static void p(r1 r1Var, boolean z4) {
        r1Var.f23398k = z4;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f23412z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        gh.b bVar = this.f23410x;
        if (bVar != null) {
            bVar.f7130b.a();
            bVar.f7131c.onAttachedToWindow();
            bVar.B.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f23412z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        gh.b bVar = this.f23410x;
        if (bVar != null) {
            bVar.f7130b.b();
            bVar.f7131c.onDetachedFromWindow();
            bVar.B.f();
        }
    }
}
