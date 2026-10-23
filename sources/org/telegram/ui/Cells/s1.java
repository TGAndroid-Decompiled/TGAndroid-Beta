package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.w5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22972a;
    public int f22973b;
    public int f22974c;
    public int d;
    public float e;
    public int f22975f;
    public float f22976g;
    public float h;
    public boolean f22977i;
    public int f22978j;
    public boolean f22979k;
    public boolean f22980l;
    public float f22981m;
    public float f22982n;
    public boolean f22983o;
    public StaticLayout f22984p;
    public f11 f22985q;
    public org.telegram.ui.Components.w5 f22986r;
    public TLRPC.PollAnswer f22987s;
    public TLRPC.TodoItem f22988t;
    public boolean f22989u;
    public int v;
    public Drawable f22990w;
    public th.b f22991x;
    public org.telegram.ui.Components.h9 f22992y;
    public ImageReceiver f22993z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22987s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22987s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22978j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22988t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22988t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22977i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22993z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22975f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22980l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22979k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22979k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22993z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22991x;
        if (bVar != null) {
            bVar.f47201b.a();
            bVar.f47202c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22993z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22991x;
        if (bVar != null) {
            bVar.f47201b.b();
            bVar.f47202c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
