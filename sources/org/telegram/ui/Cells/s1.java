package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22751a;
    public int f22752b;
    public int f22753c;
    public int d;
    public float f22754e;
    public int f22755f;
    public float f22756g;
    public float h;
    public boolean f22757i;
    public int f22758j;
    public boolean f22759k;
    public boolean f22760l;
    public float f22761m;
    public float f22762n;
    public boolean f22763o;
    public StaticLayout f22764p;
    public e11 f22765q;
    public org.telegram.ui.Components.v5 f22766r;
    public TLRPC.PollAnswer f22767s;
    public TLRPC.TodoItem f22768t;
    public boolean f22769u;
    public int v;
    public Drawable f22770w;
    public sh.b f22771x;
    public org.telegram.ui.Components.h9 f22772y;
    public ImageReceiver f22773z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22767s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22767s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22758j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22768t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22768t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22757i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22773z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22755f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22760l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22754e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22754e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22759k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22759k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22773z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22771x;
        if (bVar != null) {
            bVar.f46863b.a();
            bVar.f46864c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22773z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22771x;
        if (bVar != null) {
            bVar.f46863b.b();
            bVar.f46864c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
