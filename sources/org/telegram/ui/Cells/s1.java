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
    public int f22964a;
    public int f22965b;
    public int f22966c;
    public int d;
    public float e;
    public int f22967f;
    public float f22968g;
    public float h;
    public boolean f22969i;
    public int f22970j;
    public boolean f22971k;
    public boolean f22972l;
    public float f22973m;
    public float f22974n;
    public boolean f22975o;
    public StaticLayout f22976p;
    public d11 f22977q;
    public org.telegram.ui.Components.w5 f22978r;
    public TLRPC.PollAnswer f22979s;
    public TLRPC.TodoItem f22980t;
    public boolean f22981u;
    public int v;
    public Drawable f22982w;
    public th.b f22983x;
    public org.telegram.ui.Components.h9 f22984y;
    public ImageReceiver f22985z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22979s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22979s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22970j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22980t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22980t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22969i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22985z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22967f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22972l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22971k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22971k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22985z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.f22983x;
        if (bVar != null) {
            bVar.f47188b.a();
            bVar.f47189c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22985z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.f22983x;
        if (bVar != null) {
            bVar.f47188b.b();
            bVar.f47189c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
