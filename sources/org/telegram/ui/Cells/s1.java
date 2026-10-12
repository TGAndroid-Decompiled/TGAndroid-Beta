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
    public int f22506a;
    public int f22507b;
    public int f22508c;
    public int d;
    public float f22509e;
    public int f22510f;
    public float f22511g;
    public float h;
    public boolean f22512i;
    public int f22513j;
    public boolean f22514k;
    public boolean f22515l;
    public float f22516m;
    public float f22517n;
    public boolean f22518o;
    public StaticLayout f22519p;
    public r11 f22520q;
    public org.telegram.ui.Components.x5 f22521r;
    public TLRPC.PollAnswer f22522s;
    public TLRPC.TodoItem f22523t;
    public boolean f22524u;
    public int v;
    public Drawable f22525w;
    public sh.b f22526x;
    public org.telegram.ui.Components.j9 f22527y;
    public ImageReceiver f22528z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22522s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22522s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22513j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22523t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22523t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22512i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22528z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22510f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22515l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22509e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22509e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22514k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22514k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22528z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22526x;
        if (bVar != null) {
            bVar.f48397b.a();
            bVar.f48398c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22528z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22526x;
        if (bVar != null) {
            bVar.f48397b.b();
            bVar.f48398c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
