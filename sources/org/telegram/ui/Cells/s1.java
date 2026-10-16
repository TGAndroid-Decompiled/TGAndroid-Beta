package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.x5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f21478a;
    public int f21479b;
    public int f21480c;
    public int d;
    public float e;
    public int f21481f;
    public float f21482g;
    public float h;
    public boolean f21483i;
    public int f21484j;
    public boolean f21485k;
    public boolean f21486l;
    public float f21487m;
    public float f21488n;
    public boolean f21489o;
    public StaticLayout f21490p;
    public i11 f21491q;
    public org.telegram.ui.Components.x5 f21492r;
    public TLRPC.PollAnswer f21493s;
    public TLRPC.TodoItem f21494t;
    public boolean f21495u;
    public int v;
    public Drawable f21496w;
    public th.b f21497x;
    public org.telegram.ui.Components.k9 f21498y;
    public ImageReceiver f21499z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f21493s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f21493s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f21484j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f21494t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f21494t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f21483i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f21499z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f21481f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f21486l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f21485k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f21485k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f21499z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f21497x;
        if (bVar != null) {
            bVar.f45822b.a();
            bVar.f45823c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f21499z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f21497x;
        if (bVar != null) {
            bVar.f45822b.b();
            bVar.f45823c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
