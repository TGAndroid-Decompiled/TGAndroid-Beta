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
    public int f22971a;
    public int f22972b;
    public int f22973c;
    public int d;
    public float e;
    public int f22974f;
    public float f22975g;
    public float h;
    public boolean f22976i;
    public int f22977j;
    public boolean f22978k;
    public boolean f22979l;
    public float f22980m;
    public float f22981n;
    public boolean f22982o;
    public StaticLayout f22983p;
    public f11 f22984q;
    public org.telegram.ui.Components.w5 f22985r;
    public TLRPC.PollAnswer f22986s;
    public TLRPC.TodoItem f22987t;
    public boolean f22988u;
    public int v;
    public Drawable f22989w;
    public th.b f22990x;
    public org.telegram.ui.Components.h9 f22991y;
    public ImageReceiver f22992z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22986s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22986s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22977j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22987t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22987t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22976i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22992z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22974f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22979l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22978k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22978k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22992z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22990x;
        if (bVar != null) {
            bVar.f47200b.a();
            bVar.f47201c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22992z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22990x;
        if (bVar != null) {
            bVar.f47200b.b();
            bVar.f47201c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
