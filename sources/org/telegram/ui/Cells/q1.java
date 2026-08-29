package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zz0;
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.u5 B;
    public int C;
    public int D;
    public final s1 E;
    public int f25028a;
    public int f25029b;
    public int f25030c;
    public int d;
    public float f25031e;
    public int f25032f;
    public float f25033g;
    public float h;
    public boolean f25034i;
    public int f25035j;
    public boolean f25036k;
    public boolean f25037l;
    public float f25038m;
    public float f25039n;
    public boolean f25040o;
    public StaticLayout f25041p;
    public zz0 f25042q;
    public org.telegram.ui.Components.u5 f25043r;
    public TLRPC.PollAnswer f25044s;
    public TLRPC.TodoItem f25045t;
    public boolean f25046u;
    public int v;
    public Drawable f25047w;
    public dh.b f25048x;
    public org.telegram.ui.Components.e9 f25049y;
    public ImageReceiver f25050z;

    public q1(s1 s1Var) {
        this.E = s1Var;
    }

    public static TLRPC.PollAnswer a(q1 q1Var) {
        return q1Var.f25044s;
    }

    public static void b(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        q1Var.f25044s = pollAnswer;
    }

    public static void c(q1 q1Var, int i10) {
        q1Var.f25035j = i10;
    }

    public static TLRPC.TodoItem d(q1 q1Var) {
        return q1Var.f25045t;
    }

    public static void e(q1 q1Var, TLRPC.TodoItem todoItem) {
        q1Var.f25045t = todoItem;
    }

    public static boolean f(q1 q1Var) {
        return q1Var.f25034i;
    }

    public static ImageReceiver g(q1 q1Var) {
        return q1Var.f25050z;
    }

    public static int h(q1 q1Var) {
        return q1Var.d;
    }

    public static void i(q1 q1Var, int i10) {
        q1Var.f25032f = i10;
    }

    public static void j(q1 q1Var, float f9) {
        q1Var.h = f9;
    }

    public static StaticLayout k(q1 q1Var) {
        return q1Var.A;
    }

    public static void l(q1 q1Var, boolean z10) {
        q1Var.f25037l = z10;
    }

    public static float m(q1 q1Var) {
        return q1Var.f25031e;
    }

    public static void n(q1 q1Var, float f9) {
        q1Var.f25031e -= f9;
    }

    public static boolean o(q1 q1Var) {
        return q1Var.f25036k;
    }

    public static void p(q1 q1Var, boolean z10) {
        q1Var.f25036k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f25050z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        dh.b bVar = this.f25048x;
        if (bVar != null) {
            bVar.f5633b.a();
            bVar.f5634c.onAttachedToWindow();
            bVar.A.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f25050z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        dh.b bVar = this.f25048x;
        if (bVar != null) {
            bVar.f5633b.b();
            bVar.f5634c.onDetachedFromWindow();
            bVar.A.f();
        }
    }
}
