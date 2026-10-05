package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f11;
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final u1 E;
    public int f22754a;
    public int f22755b;
    public int f22756c;
    public int d;
    public float f22757e;
    public int f22758f;
    public float f22759g;
    public float h;
    public boolean f22760i;
    public int f22761j;
    public boolean f22762k;
    public boolean f22763l;
    public float f22764m;
    public float f22765n;
    public boolean f22766o;
    public StaticLayout f22767p;
    public f11 f22768q;
    public org.telegram.ui.Components.v5 f22769r;
    public TLRPC.PollAnswer f22770s;
    public TLRPC.TodoItem f22771t;
    public boolean f22772u;
    public int v;
    public Drawable f22773w;
    public sh.b f22774x;
    public org.telegram.ui.Components.h9 f22775y;
    public ImageReceiver f22776z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static TLRPC.PollAnswer a(s1 s1Var) {
        return s1Var.f22770s;
    }

    public static void b(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        s1Var.f22770s = pollAnswer;
    }

    public static void c(s1 s1Var, int i10) {
        s1Var.f22761j = i10;
    }

    public static TLRPC.TodoItem d(s1 s1Var) {
        return s1Var.f22771t;
    }

    public static void e(s1 s1Var, TLRPC.TodoItem todoItem) {
        s1Var.f22771t = todoItem;
    }

    public static boolean f(s1 s1Var) {
        return s1Var.f22760i;
    }

    public static ImageReceiver g(s1 s1Var) {
        return s1Var.f22776z;
    }

    public static int h(s1 s1Var) {
        return s1Var.d;
    }

    public static void i(s1 s1Var, int i10) {
        s1Var.f22758f = i10;
    }

    public static void j(s1 s1Var, float f7) {
        s1Var.h = f7;
    }

    public static StaticLayout k(s1 s1Var) {
        return s1Var.A;
    }

    public static void l(s1 s1Var, boolean z10) {
        s1Var.f22763l = z10;
    }

    public static float m(s1 s1Var) {
        return s1Var.f22757e;
    }

    public static void n(s1 s1Var, float f7) {
        s1Var.f22757e -= f7;
    }

    public static boolean o(s1 s1Var) {
        return s1Var.f22762k;
    }

    public static void p(s1 s1Var, boolean z10) {
        s1Var.f22762k = z10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.f22776z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.f22774x;
        if (bVar != null) {
            bVar.f46870b.a();
            bVar.f46871c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.f22776z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        sh.b bVar = this.f22774x;
        if (bVar != null) {
            bVar.f46870b.b();
            bVar.f46871c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
