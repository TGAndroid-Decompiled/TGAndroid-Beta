package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.x5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22507a;
    public int f22508b;
    public int f22509c;
    public int d;
    public float f22510e;
    public int f22511f;
    public float f22512g;
    public float h;
    public boolean f22513i;
    public int f22514j;
    public boolean f22515k;
    public boolean f22516l;
    public float f22517m;
    public float f22518n;
    public boolean f22519o;
    public StaticLayout f22520p;
    public r11 f22521q;
    public org.telegram.ui.Components.x5 f22522r;
    public TLRPC.PollAnswer f22523s;
    public TLRPC.TodoItem f22524t;
    public boolean f22525u;
    public int v;
    public Drawable f22526w;
    public sh.b f22527x;
    public org.telegram.ui.Components.j9 f22528y;
    public ImageReceiver f22529z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22523s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22523s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22514j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22524t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22524t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22513i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22529z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22511f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22516l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22510e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22510e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22515k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22515k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22529z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22527x;
        if (bVar != null) {
            bVar.f48405b.a();
            bVar.f48406c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22529z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22527x;
        if (bVar != null) {
            bVar.f48405b.b();
            bVar.f48406c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
