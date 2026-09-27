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
    public int f20901a;
    public int f20902b;
    public int f20903c;
    public int d;
    public float e;
    public int f20904f;
    public float f20905g;
    public float h;
    public boolean f20906i;
    public int f20907j;
    public boolean f20908k;
    public boolean f20909l;
    public float f20910m;
    public float f20911n;
    public boolean f20912o;
    public StaticLayout f20913p;
    public v01 f20914q;
    public org.telegram.ui.Components.v5 f20915r;
    public TLRPC.PollAnswer f20916s;
    public TLRPC.TodoItem f20917t;
    public boolean f20918u;
    public int v;
    public Drawable f20919w;
    public sh.b f20920x;
    public org.telegram.ui.Components.h9 f20921y;
    public ImageReceiver f20922z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f20916s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f20916s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f20907j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f20917t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f20917t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f20906i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f20922z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f20904f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f20909l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f20908k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f20908k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20922z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20920x;
        if (bVar != null) {
            bVar.f43310b.a();
            bVar.f43311c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20922z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20920x;
        if (bVar != null) {
            bVar.f43310b.b();
            bVar.f43311c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
