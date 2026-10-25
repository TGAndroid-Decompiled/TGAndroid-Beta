package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q11;
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.y5 B;
    public int C;
    public int D;
    public final s1 E;
    public int f24788a;
    public int f24789b;
    public int f24790c;
    public int d;
    public float e;
    public int f24791f;
    public float f24792g;
    public float h;
    public boolean f24793i;
    public int f24794j;
    public boolean f24795k;
    public boolean f24796l;
    public float f24797m;
    public float f24798n;
    public boolean f24799o;
    public StaticLayout f24800p;
    public q11 f24801q;
    public org.telegram.ui.Components.y5 f24802r;
    public TLRPC.PollAnswer f24803s;
    public TLRPC.TodoItem f24804t;
    public boolean f24805u;
    public int v;
    public Drawable f24806w;
    public uh.b f24807x;
    public org.telegram.ui.Components.j9 f24808y;
    public ImageReceiver f24809z;

    public q1(s1 s1Var) {
        this.E = s1Var;
    }

    public static TLRPC.PollAnswer a(q1 q1Var) {
        return q1Var.f24803s;
    }

    public static void b(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        q1Var.f24803s = pollAnswer;
    }

    public static void c(q1 q1Var, int i10) {
        q1Var.f24794j = i10;
    }

    public static TLRPC.TodoItem d(q1 q1Var) {
        return q1Var.f24804t;
    }

    public static void e(q1 q1Var, TLRPC.TodoItem todoItem) {
        q1Var.f24804t = todoItem;
    }

    public static boolean f(q1 q1Var) {
        return q1Var.f24793i;
    }

    public static ImageReceiver g(q1 q1Var) {
        return q1Var.f24809z;
    }

    public static int h(q1 q1Var) {
        return q1Var.d;
    }

    public static void i(q1 q1Var, int i10) {
        q1Var.f24791f = i10;
    }

    public static void j(q1 q1Var, float f7) {
        q1Var.h = f7;
    }

    public static StaticLayout k(q1 q1Var) {
        return q1Var.A;
    }

    public static void l(q1 q1Var, boolean z10) {
        q1Var.f24796l = z10;
    }

    public static float m(q1 q1Var) {
        return q1Var.e;
    }

    public static void n(q1 q1Var, float f7) {
        q1Var.e -= f7;
    }

    public static boolean o(q1 q1Var) {
        return q1Var.f24795k;
    }

    public static void p(q1 q1Var, boolean z10) {
        q1Var.f24795k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f24809z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        uh.b bVar = this.f24807x;
        if (bVar != null) {
            bVar.f49900b.a();
            bVar.f49901c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f24809z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        uh.b bVar = this.f24807x;
        if (bVar != null) {
            bVar.f49900b.b();
            bVar.f49901c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
