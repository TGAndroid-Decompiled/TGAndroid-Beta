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
    public int f21598a;
    public int f21599b;
    public int f21600c;
    public int d;
    public float e;
    public int f21601f;
    public float f21602g;
    public float h;
    public boolean f21603i;
    public int f21604j;
    public boolean f21605k;
    public boolean f21606l;
    public float f21607m;
    public float f21608n;
    public boolean f21609o;
    public StaticLayout f21610p;
    public k01 f21611q;
    public org.telegram.ui.Components.q5 f21612r;
    public TLRPC.PollAnswer f21613s;
    public TLRPC.TodoItem f21614t;
    public boolean f21615u;
    public int v;
    public Drawable f21616w;
    public fh.b f21617x;
    public org.telegram.ui.Components.z8 f21618y;
    public ImageReceiver f21619z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f21613s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f21613s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f21604j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f21614t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f21614t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f21603i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f21619z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f21601f = i10;
    }

    public static void j(r1 r1Var, float f10) {
        r1Var.h = f10;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z4) {
        r1Var.f21606l = z4;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f10) {
        r1Var.e -= f10;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f21605k;
    }

    public static void p(r1 r1Var, boolean z4) {
        r1Var.f21605k = z4;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f21619z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        fh.b bVar = this.f21617x;
        if (bVar != null) {
            bVar.f6196b.a();
            bVar.f6197c.onAttachedToWindow();
            bVar.B.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f21619z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        fh.b bVar = this.f21617x;
        if (bVar != null) {
            bVar.f6196b.b();
            bVar.f6197c.onDetachedFromWindow();
            bVar.B.f();
        }
    }
}
