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
    public int f22539a;
    public int f22540b;
    public int f22541c;
    public int d;
    public float f22542e;
    public int f22543f;
    public float f22544g;
    public float h;
    public boolean f22545i;
    public int f22546j;
    public boolean f22547k;
    public boolean f22548l;
    public float f22549m;
    public float f22550n;
    public boolean f22551o;
    public StaticLayout f22552p;
    public f01 f22553q;
    public org.telegram.ui.Components.v5 f22554r;
    public TLRPC.PollAnswer f22555s;
    public TLRPC.TodoItem f22556t;
    public boolean f22557u;
    public int v;
    public Drawable f22558w;
    public th.b f22559x;
    public org.telegram.ui.Components.i9 f22560y;
    public ImageReceiver f22561z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f22555s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f22555s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f22546j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f22556t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f22556t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f22545i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f22561z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f22543f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f22548l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.f22542e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.f22542e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f22547k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f22547k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22561z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22559x;
        if (bVar != null) {
            bVar.f46591b.a();
            bVar.f46592c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22561z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22559x;
        if (bVar != null) {
            bVar.f46591b.b();
            bVar.f46592c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
