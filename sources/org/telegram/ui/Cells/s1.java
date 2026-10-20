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
    public int f22968a;
    public int f22969b;
    public int f22970c;
    public int d;
    public float e;
    public int f22971f;
    public float f22972g;
    public float h;
    public boolean f22973i;
    public int f22974j;
    public boolean f22975k;
    public boolean f22976l;
    public float f22977m;
    public float f22978n;
    public boolean f22979o;
    public StaticLayout f22980p;
    public f11 f22981q;
    public org.telegram.ui.Components.w5 f22982r;
    public TLRPC.PollAnswer f22983s;
    public TLRPC.TodoItem f22984t;
    public boolean f22985u;
    public int v;
    public Drawable f22986w;
    public th.b f22987x;
    public org.telegram.ui.Components.h9 f22988y;
    public ImageReceiver f22989z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22983s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22983s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22974j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22984t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22984t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22973i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22989z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22971f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22976l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22975k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22975k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22989z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22987x;
        if (bVar != null) {
            bVar.f47197b.a();
            bVar.f47198c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22989z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22987x;
        if (bVar != null) {
            bVar.f47197b.b();
            bVar.f47198c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
