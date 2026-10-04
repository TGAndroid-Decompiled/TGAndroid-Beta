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
    public int f22747a;
    public int f22748b;
    public int f22749c;
    public int d;
    public float f22750e;
    public int f22751f;
    public float f22752g;
    public float h;
    public boolean f22753i;
    public int f22754j;
    public boolean f22755k;
    public boolean f22756l;
    public float f22757m;
    public float f22758n;
    public boolean f22759o;
    public StaticLayout f22760p;
    public e11 f22761q;
    public org.telegram.ui.Components.v5 f22762r;
    public TLRPC.PollAnswer f22763s;
    public TLRPC.TodoItem f22764t;
    public boolean f22765u;
    public int v;
    public Drawable f22766w;
    public sh.b f22767x;
    public org.telegram.ui.Components.h9 f22768y;
    public ImageReceiver f22769z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22763s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22763s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22754j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22764t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22764t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22753i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22769z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22751f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22756l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22750e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22750e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22755k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22755k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22769z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22767x;
        if (bVar != null) {
            bVar.f46856b.a();
            bVar.f46857c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22769z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22767x;
        if (bVar != null) {
            bVar.f46856b.b();
            bVar.f46857c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
