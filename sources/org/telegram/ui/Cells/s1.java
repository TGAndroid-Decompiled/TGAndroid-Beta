package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.x5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f21781a;
    public int f21782b;
    public int f21783c;
    public int d;
    public float e;
    public int f21784f;
    public float f21785g;
    public float h;
    public boolean f21786i;
    public int f21787j;
    public boolean f21788k;
    public boolean f21789l;
    public float f21790m;
    public float f21791n;
    public boolean f21792o;
    public StaticLayout f21793p;
    public h11 f21794q;
    public org.telegram.ui.Components.x5 f21795r;
    public TLRPC.PollAnswer f21796s;
    public TLRPC.TodoItem f21797t;
    public boolean f21798u;
    public int v;
    public Drawable f21799w;
    public th.b f21800x;
    public org.telegram.ui.Components.k9 f21801y;
    public ImageReceiver f21802z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f21796s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f21796s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f21787j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f21797t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f21797t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f21786i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f21802z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f21784f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f21789l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f21788k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f21788k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f21802z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f21800x;
        if (bVar != null) {
            bVar.f45822b.a();
            bVar.f45823c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f21802z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f21800x;
        if (bVar != null) {
            bVar.f45822b.b();
            bVar.f45823c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
