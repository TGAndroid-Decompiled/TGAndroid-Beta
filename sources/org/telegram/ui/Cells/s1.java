package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w01;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.u5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f20917a;
    public int f20918b;
    public int f20919c;
    public int d;
    public float e;
    public int f20920f;
    public float f20921g;
    public float h;
    public boolean f20922i;
    public int f20923j;
    public boolean f20924k;
    public boolean f20925l;
    public float f20926m;
    public float f20927n;
    public boolean f20928o;
    public StaticLayout f20929p;
    public w01 f20930q;
    public org.telegram.ui.Components.u5 f20931r;
    public TLRPC.PollAnswer f20932s;
    public TLRPC.TodoItem f20933t;
    public boolean f20934u;
    public int v;
    public Drawable f20935w;
    public sh.b f20936x;
    public org.telegram.ui.Components.g9 f20937y;
    public ImageReceiver f20938z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f20932s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f20932s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f20923j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f20933t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f20933t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f20922i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f20938z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f20920f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f20925l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f20924k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f20924k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20938z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20936x;
        if (bVar != null) {
            bVar.f43300b.a();
            bVar.f43301c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20938z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20936x;
        if (bVar != null) {
            bVar.f43300b.b();
            bVar.f43301c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
