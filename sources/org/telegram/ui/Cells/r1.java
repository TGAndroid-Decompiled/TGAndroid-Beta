package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nz0;
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.p5 B;
    public int C;
    public int D;
    public final t1 E;
    public int f24931a;
    public int f24932b;
    public int f24933c;
    public int d;
    public float f24934e;
    public int f24935f;
    public float f24936g;
    public float h;
    public boolean f24937i;
    public int f24938j;
    public boolean f24939k;
    public boolean f24940l;
    public float f24941m;
    public float f24942n;
    public boolean f24943o;
    public StaticLayout f24944p;
    public nz0 f24945q;
    public org.telegram.ui.Components.p5 f24946r;
    public TLRPC.PollAnswer f24947s;
    public TLRPC.TodoItem f24948t;
    public boolean f24949u;
    public int v;
    public Drawable f24950w;
    public ah.b f24951x;
    public org.telegram.ui.Components.z8 f24952y;
    public ImageReceiver f24953z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static TLRPC.PollAnswer a(r1 r1Var) {
        return r1Var.f24947s;
    }

    public static void b(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        r1Var.f24947s = pollAnswer;
    }

    public static void c(r1 r1Var, int i9) {
        r1Var.f24938j = i9;
    }

    public static TLRPC.TodoItem d(r1 r1Var) {
        return r1Var.f24948t;
    }

    public static void e(r1 r1Var, TLRPC.TodoItem todoItem) {
        r1Var.f24948t = todoItem;
    }

    public static boolean f(r1 r1Var) {
        return r1Var.f24937i;
    }

    public static ImageReceiver g(r1 r1Var) {
        return r1Var.f24953z;
    }

    public static int h(r1 r1Var) {
        return r1Var.d;
    }

    public static void i(r1 r1Var, int i9) {
        r1Var.f24935f = i9;
    }

    public static void j(r1 r1Var, float f10) {
        r1Var.h = f10;
    }

    public static StaticLayout k(r1 r1Var) {
        return r1Var.A;
    }

    public static void l(r1 r1Var, boolean z10) {
        r1Var.f24940l = z10;
    }

    public static float m(r1 r1Var) {
        return r1Var.f24934e;
    }

    public static void n(r1 r1Var, float f10) {
        r1Var.f24934e -= f10;
    }

    public static boolean o(r1 r1Var) {
        return r1Var.f24939k;
    }

    public static void p(r1 r1Var, boolean z10) {
        r1Var.f24939k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f24953z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        ah.b bVar = this.f24951x;
        if (bVar != null) {
            bVar.f248b.a();
            bVar.f249c.onAttachedToWindow();
            bVar.A.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f24953z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        ah.b bVar = this.f24951x;
        if (bVar != null) {
            bVar.f248b.b();
            bVar.f249c.onDetachedFromWindow();
            bVar.A.f();
        }
    }
}
