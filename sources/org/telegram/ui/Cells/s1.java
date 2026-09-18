package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v01;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f20863a;
    public int f20864b;
    public int f20865c;
    public int d;
    public float e;
    public int f20866f;
    public float f20867g;
    public float h;
    public boolean f20868i;
    public int f20869j;
    public boolean f20870k;
    public boolean f20871l;
    public float f20872m;
    public float f20873n;
    public boolean f20874o;
    public StaticLayout f20875p;
    public v01 f20876q;
    public org.telegram.ui.Components.v5 f20877r;
    public TLRPC.PollAnswer f20878s;
    public TLRPC.TodoItem f20879t;
    public boolean f20880u;
    public int v;
    public Drawable f20881w;
    public sh.b f20882x;
    public org.telegram.ui.Components.h9 f20883y;
    public ImageReceiver f20884z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f20878s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f20878s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f20869j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f20879t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f20879t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f20868i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f20884z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f20866f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f20871l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f20870k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f20870k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20884z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20882x;
        if (bVar != null) {
            bVar.f43235b.a();
            bVar.f43236c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20884z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20882x;
        if (bVar != null) {
            bVar.f43235b.b();
            bVar.f43236c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
