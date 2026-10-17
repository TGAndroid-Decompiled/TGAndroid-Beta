package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.w5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22967a;
    public int f22968b;
    public int f22969c;
    public int d;
    public float e;
    public int f22970f;
    public float f22971g;
    public float h;
    public boolean f22972i;
    public int f22973j;
    public boolean f22974k;
    public boolean f22975l;
    public float f22976m;
    public float f22977n;
    public boolean f22978o;
    public StaticLayout f22979p;
    public d11 f22980q;
    public org.telegram.ui.Components.w5 f22981r;
    public TLRPC.PollAnswer f22982s;
    public TLRPC.TodoItem f22983t;
    public boolean f22984u;
    public int v;
    public Drawable f22985w;
    public th.b f22986x;
    public org.telegram.ui.Components.h9 f22987y;
    public ImageReceiver f22988z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22982s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22982s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22973j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22983t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22983t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22972i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22988z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22970f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22975l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22974k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22974k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22988z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22986x;
        if (bVar != null) {
            bVar.f47213b.a();
            bVar.f47214c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22988z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22986x;
        if (bVar != null) {
            bVar.f47213b.b();
            bVar.f47214c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
