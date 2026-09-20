package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u01;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.u5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f20902a;
    public int f20903b;
    public int f20904c;
    public int d;
    public float e;
    public int f20905f;
    public float f20906g;
    public float h;
    public boolean f20907i;
    public int f20908j;
    public boolean f20909k;
    public boolean f20910l;
    public float f20911m;
    public float f20912n;
    public boolean f20913o;
    public StaticLayout f20914p;
    public u01 f20915q;
    public org.telegram.ui.Components.u5 f20916r;
    public TLRPC.PollAnswer f20917s;
    public TLRPC.TodoItem f20918t;
    public boolean f20919u;
    public int v;
    public Drawable f20920w;
    public sh.b f20921x;
    public org.telegram.ui.Components.g9 f20922y;
    public ImageReceiver f20923z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f20917s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f20917s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f20908j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f20918t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f20918t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f20907i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f20923z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f20905f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f20910l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f20909k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f20909k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20923z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20921x;
        if (bVar != null) {
            bVar.f43279b.a();
            bVar.f43280c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20923z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20921x;
        if (bVar != null) {
            bVar.f43279b.b();
            bVar.f43280c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
