package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w01;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f20918a;
    public int f20919b;
    public int f20920c;
    public int d;
    public float e;
    public int f20921f;
    public float f20922g;
    public float h;
    public boolean f20923i;
    public int f20924j;
    public boolean f20925k;
    public boolean f20926l;
    public float f20927m;
    public float f20928n;
    public boolean f20929o;
    public StaticLayout f20930p;
    public w01 f20931q;
    public org.telegram.ui.Components.v5 f20932r;
    public TLRPC.PollAnswer f20933s;
    public TLRPC.TodoItem f20934t;
    public boolean f20935u;
    public int v;
    public Drawable f20936w;
    public sh.b f20937x;
    public org.telegram.ui.Components.h9 f20938y;
    public ImageReceiver f20939z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f20933s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f20933s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f20924j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f20934t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f20934t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f20923i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f20939z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f20921f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f20926l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f20925k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f20925k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20939z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20937x;
        if (bVar != null) {
            bVar.f43373b.a();
            bVar.f43374c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20939z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20937x;
        if (bVar != null) {
            bVar.f43373b.b();
            bVar.f43374c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
