package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.q5 B;
    public int C;
    public int D;
    public final s1 E;
    public int f21531a;
    public int f21532b;
    public int f21533c;
    public int d;
    public float e;
    public int f21534f;
    public float f21535g;
    public float h;
    public boolean f21536i;
    public int f21537j;
    public boolean f21538k;
    public boolean f21539l;
    public float f21540m;
    public float f21541n;
    public boolean f21542o;
    public StaticLayout f21543p;
    public k01 f21544q;
    public org.telegram.ui.Components.q5 f21545r;
    public TLRPC.PollAnswer f21546s;
    public TLRPC.TodoItem f21547t;
    public boolean f21548u;
    public int v;
    public Drawable f21549w;
    public fh.b f21550x;
    public org.telegram.ui.Components.z8 f21551y;
    public ImageReceiver f21552z;

    public q1(s1 s1Var) {
        this.E = s1Var;
    }

    public static TLRPC.PollAnswer a(q1 q1Var) {
        return q1Var.f21546s;
    }

    public static void b(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        q1Var.f21546s = pollAnswer;
    }

    public static void c(q1 q1Var, int i10) {
        q1Var.f21537j = i10;
    }

    public static TLRPC.TodoItem d(q1 q1Var) {
        return q1Var.f21547t;
    }

    public static void e(q1 q1Var, TLRPC.TodoItem todoItem) {
        q1Var.f21547t = todoItem;
    }

    public static boolean f(q1 q1Var) {
        return q1Var.f21536i;
    }

    public static ImageReceiver g(q1 q1Var) {
        return q1Var.f21552z;
    }

    public static int h(q1 q1Var) {
        return q1Var.d;
    }

    public static void i(q1 q1Var, int i10) {
        q1Var.f21534f = i10;
    }

    public static void j(q1 q1Var, float f10) {
        q1Var.h = f10;
    }

    public static StaticLayout k(q1 q1Var) {
        return q1Var.A;
    }

    public static void l(q1 q1Var, boolean z4) {
        q1Var.f21539l = z4;
    }

    public static float m(q1 q1Var) {
        return q1Var.e;
    }

    public static void n(q1 q1Var, float f10) {
        q1Var.e -= f10;
    }

    public static boolean o(q1 q1Var) {
        return q1Var.f21538k;
    }

    public static void p(q1 q1Var, boolean z4) {
        q1Var.f21538k = z4;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f21552z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        fh.b bVar = this.f21550x;
        if (bVar != null) {
            bVar.f6196b.a();
            bVar.f6197c.onAttachedToWindow();
            bVar.B.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f21552z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        fh.b bVar = this.f21550x;
        if (bVar != null) {
            bVar.f6196b.b();
            bVar.f6197c.onDetachedFromWindow();
            bVar.B.f();
        }
    }
}
