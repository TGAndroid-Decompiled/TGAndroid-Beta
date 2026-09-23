package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f01;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f20611a;
    public int f20612b;
    public int f20613c;
    public int d;
    public float e;
    public int f20614f;
    public float f20615g;
    public float h;
    public boolean f20616i;
    public int f20617j;
    public boolean f20618k;
    public boolean f20619l;
    public float f20620m;
    public float f20621n;
    public boolean f20622o;
    public StaticLayout f20623p;
    public f01 f20624q;
    public org.telegram.ui.Components.v5 f20625r;
    public TLRPC.PollAnswer f20626s;
    public TLRPC.TodoItem f20627t;
    public boolean f20628u;
    public int v;
    public Drawable f20629w;
    public sh.b f20630x;
    public org.telegram.ui.Components.h9 f20631y;
    public ImageReceiver f20632z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f20626s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f20626s = pollAnswer;
    }

    public static void c(r1 r1Var, int i10) {
        r1Var.f20617j = i10;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f20627t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f20627t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f20616i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f20632z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i10) {
        r1Var.f20614f = i10;
    }

    public static void j(r1 r1Var, float f7) {
        r1Var.h = f7;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f20619l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.e;
    }

    public static void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f20618k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f20618k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f20632z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f20630x;
        if (bVar != null) {
            bVar.f42929b.a();
            bVar.f42930c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f20632z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f20630x;
        if (bVar != null) {
            bVar.f42929b.b();
            bVar.f42930c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
