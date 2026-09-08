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
    public int f22538a;
    public int f22539b;
    public int f22540c;
    public int d;
    public float f22541e;
    public int f22542f;
    public float f22543g;
    public float h;
    public boolean f22544i;
    public int f22545j;
    public boolean f22546k;
    public boolean f22547l;
    public float f22548m;
    public float f22549n;
    public boolean f22550o;
    public StaticLayout f22551p;
    public f01 f22552q;
    public org.telegram.ui.Components.v5 f22553r;
    public TLRPC.PollAnswer f22554s;
    public TLRPC.TodoItem f22555t;
    public boolean f22556u;
    public int v;
    public Drawable f22557w;
    public th.b f22558x;
    public org.telegram.ui.Components.i9 f22559y;
    public ImageReceiver f22560z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f22554s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f22554s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f22545j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f22555t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f22555t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f22544i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f22560z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f22542f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f22547l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.f22541e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.f22541e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f22546k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f22546k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22560z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22558x;
        if (bVar != null) {
            bVar.f46590b.a();
            bVar.f46591c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22560z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22558x;
        if (bVar != null) {
            bVar.f46590b.b();
            bVar.f46591c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
