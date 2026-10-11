package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.x5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22771a;
    public int f22772b;
    public int f22773c;
    public int d;
    public float f22774e;
    public int f22775f;
    public float f22776g;
    public float h;
    public boolean f22777i;
    public int f22778j;
    public boolean f22779k;
    public boolean f22780l;
    public float f22781m;
    public float f22782n;
    public boolean f22783o;
    public StaticLayout f22784p;
    public m11 f22785q;
    public org.telegram.ui.Components.x5 f22786r;
    public TLRPC.PollAnswer f22787s;
    public TLRPC.TodoItem f22788t;
    public boolean f22789u;
    public int v;
    public Drawable f22790w;
    public sh.b f22791x;
    public org.telegram.ui.Components.j9 f22792y;
    public ImageReceiver f22793z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22787s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22787s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22778j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22788t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22788t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22777i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22793z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22775f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22780l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22774e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22774e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22779k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22779k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22793z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22791x;
        if (bVar != null) {
            bVar.f48290b.a();
            bVar.f48291c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22793z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22791x;
        if (bVar != null) {
            bVar.f48290b.b();
            bVar.f48291c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
