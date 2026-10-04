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
    public int f22746a;
    public int f22747b;
    public int f22748c;
    public int d;
    public float f22749e;
    public int f22750f;
    public float f22751g;
    public float h;
    public boolean f22752i;
    public int f22753j;
    public boolean f22754k;
    public boolean f22755l;
    public float f22756m;
    public float f22757n;
    public boolean f22758o;
    public StaticLayout f22759p;
    public e11 f22760q;
    public org.telegram.ui.Components.v5 f22761r;
    public TLRPC.PollAnswer f22762s;
    public TLRPC.TodoItem f22763t;
    public boolean f22764u;
    public int v;
    public Drawable f22765w;
    public sh.b f22766x;
    public org.telegram.ui.Components.h9 f22767y;
    public ImageReceiver f22768z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22762s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22762s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22753j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22763t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22763t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22752i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22768z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22750f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22755l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22749e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22749e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22754k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22754k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22768z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22766x;
        if (bVar != null) {
            bVar.f46855b.a();
            bVar.f46856c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22768z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22766x;
        if (bVar != null) {
            bVar.f46855b.b();
            bVar.f46856c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
