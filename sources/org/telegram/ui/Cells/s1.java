package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u01;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f20899a;
    public int f20900b;
    public int f20901c;
    public int d;
    public float e;
    public int f20902f;
    public float f20903g;
    public float h;
    public boolean f20904i;
    public int f20905j;
    public boolean f20906k;
    public boolean f20907l;
    public float f20908m;
    public float f20909n;
    public boolean f20910o;
    public StaticLayout f20911p;
    public u01 f20912q;
    public org.telegram.ui.Components.v5 f20913r;
    public TLRPC.PollAnswer f20914s;
    public TLRPC.TodoItem f20915t;
    public boolean f20916u;
    public int v;
    public Drawable f20917w;
    public sh.b f20918x;
    public org.telegram.ui.Components.h9 f20919y;
    public ImageReceiver f20920z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f20914s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f20914s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f20905j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f20915t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f20915t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f20904i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f20920z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f20902f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f20907l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f20906k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f20906k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20920z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20918x;
        if (bVar != null) {
            bVar.f43264b.a();
            bVar.f43265c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20920z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20918x;
        if (bVar != null) {
            bVar.f43264b.b();
            bVar.f43265c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
