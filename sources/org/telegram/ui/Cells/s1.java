package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.x5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22743a;
    public int f22744b;
    public int f22745c;
    public int d;
    public float f22746e;
    public int f22747f;
    public float f22748g;
    public float h;
    public boolean f22749i;
    public int f22750j;
    public boolean f22751k;
    public boolean f22752l;
    public float f22753m;
    public float f22754n;
    public boolean f22755o;
    public StaticLayout f22756p;
    public l11 f22757q;
    public org.telegram.ui.Components.x5 f22758r;
    public TLRPC.PollAnswer f22759s;
    public TLRPC.TodoItem f22760t;
    public boolean f22761u;
    public int v;
    public Drawable f22762w;
    public sh.b f22763x;
    public org.telegram.ui.Components.j9 f22764y;
    public ImageReceiver f22765z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22759s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22759s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22750j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22760t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22760t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22749i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22765z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22747f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22752l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22746e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22746e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22751k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22751k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22765z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22763x;
        if (bVar != null) {
            bVar.f48164b.a();
            bVar.f48165c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22765z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22763x;
        if (bVar != null) {
            bVar.f48164b.b();
            bVar.f48165c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
