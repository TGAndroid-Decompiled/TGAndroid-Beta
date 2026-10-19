package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.w5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22965a;
    public int f22966b;
    public int f22967c;
    public int d;
    public float e;
    public int f22968f;
    public float f22969g;
    public float h;
    public boolean f22970i;
    public int f22971j;
    public boolean f22972k;
    public boolean f22973l;
    public float f22974m;
    public float f22975n;
    public boolean f22976o;
    public StaticLayout f22977p;
    public e11 f22978q;
    public org.telegram.ui.Components.w5 f22979r;
    public TLRPC.PollAnswer f22980s;
    public TLRPC.TodoItem f22981t;
    public boolean f22982u;
    public int v;
    public Drawable f22983w;
    public th.b f22984x;
    public org.telegram.ui.Components.h9 f22985y;
    public ImageReceiver f22986z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22980s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22980s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22971j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22981t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22981t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22970i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22986z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22968f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22973l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22972k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22972k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22986z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22984x;
        if (bVar != null) {
            bVar.f47192b.a();
            bVar.f47193c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22986z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22984x;
        if (bVar != null) {
            bVar.f47192b.b();
            bVar.f47193c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
