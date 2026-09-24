package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t01;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f20885a;
    public int f20886b;
    public int f20887c;
    public int d;
    public float e;
    public int f20888f;
    public float f20889g;
    public float h;
    public boolean f20890i;
    public int f20891j;
    public boolean f20892k;
    public boolean f20893l;
    public float f20894m;
    public float f20895n;
    public boolean f20896o;
    public StaticLayout f20897p;
    public t01 f20898q;
    public org.telegram.ui.Components.v5 f20899r;
    public TLRPC.PollAnswer f20900s;
    public TLRPC.TodoItem f20901t;
    public boolean f20902u;
    public int v;
    public Drawable f20903w;
    public sh.b f20904x;
    public org.telegram.ui.Components.h9 f20905y;
    public ImageReceiver f20906z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f20900s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f20900s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f20891j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f20901t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f20901t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f20890i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f20906z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f20888f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f20893l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f20892k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f20892k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20906z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20904x;
        if (bVar != null) {
            bVar.f43251b.a();
            bVar.f43252c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20906z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20904x;
        if (bVar != null) {
            bVar.f43251b.b();
            bVar.f43252c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
