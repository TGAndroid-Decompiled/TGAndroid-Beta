package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.x5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22735a;
    public int f22736b;
    public int f22737c;
    public int d;
    public float f22738e;
    public int f22739f;
    public float f22740g;
    public float h;
    public boolean f22741i;
    public int f22742j;
    public boolean f22743k;
    public boolean f22744l;
    public float f22745m;
    public float f22746n;
    public boolean f22747o;
    public StaticLayout f22748p;
    public n11 f22749q;
    public org.telegram.ui.Components.x5 f22750r;
    public TLRPC.PollAnswer f22751s;
    public TLRPC.TodoItem f22752t;
    public boolean f22753u;
    public int v;
    public Drawable f22754w;
    public sh.b f22755x;
    public org.telegram.ui.Components.j9 f22756y;
    public ImageReceiver f22757z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22751s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22751s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22742j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22752t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22752t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22741i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22757z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22739f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22744l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22738e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22738e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22743k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22743k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22757z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22755x;
        if (bVar != null) {
            bVar.f48256b.a();
            bVar.f48257c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22757z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22755x;
        if (bVar != null) {
            bVar.f48256b.b();
            bVar.f48257c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
