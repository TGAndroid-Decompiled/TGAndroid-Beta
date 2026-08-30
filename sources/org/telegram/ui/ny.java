package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ny extends FrameLayout {
    public static final int I = 0;
    public boolean B;
    public hx C;
    public tf.k D;
    public boolean E;
    public final rw F;
    public final rw G;
    public final oy H;
    public ky f36741a;
    public b4.e0 f36742b;
    public sw f36743c;
    public ww d;
    public f2.e0 e;
    public my f36744f;
    public int h;
    public vw f36745n;
    public c2.y f36746r;
    public int f36747s;
    public int v;
    public org.telegram.ui.Components.t00 f36748w;
    public qw f36749x;
    public org.telegram.ui.Components.zk0 f36750y;

    public ny(Context context, oy oyVar) {
        super(context);
        this.H = oyVar;
        this.F = new rw(this, 1);
        this.G = new rw(this, 2);
    }

    public static void a(ny nyVar, sw swVar) {
        nyVar.f36743c = swVar;
    }

    public static f2.e0 b(ny nyVar) {
        return nyVar.e;
    }

    public static void c(ny nyVar, f2.e0 e0Var) {
        nyVar.e = e0Var;
    }

    public static int d(ny nyVar) {
        return nyVar.v;
    }

    public static void e(ny nyVar, int i10) {
        nyVar.v = i10;
    }

    public static void f(ny nyVar, org.telegram.ui.Components.t00 t00Var) {
        nyVar.f36748w = t00Var;
    }

    public static my g(ny nyVar) {
        return nyVar.f36744f;
    }

    public static void h(ny nyVar, my myVar) {
        nyVar.f36744f = myVar;
    }

    public static void i(ny nyVar, qw qwVar) {
        nyVar.f36749x = qwVar;
    }

    public static void j(ny nyVar, org.telegram.ui.Components.zk0 zk0Var) {
        nyVar.f36750y = zk0Var;
    }

    public static void k(ny nyVar, c2.y yVar) {
        nyVar.f36746r = yVar;
    }

    public static void l(ny nyVar, int i10) {
        nyVar.f36747s = i10;
    }

    public static tf.k m(ny nyVar) {
        return nyVar.d;
    }

    public static void n(ny nyVar, ww wwVar) {
        nyVar.d = wwVar;
    }

    public static void o(ny nyVar, vw vwVar) {
        nyVar.f36745n = vwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f36741a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f36747s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z4) {
        boolean z10;
        z10 = ((org.telegram.ui.ActionBar.p2) this.H).isPaused;
        if (!z10) {
            rw rwVar = this.G;
            if (z4) {
                AndroidUtilities.cancelRunOnUIThread(rwVar);
                this.f36741a.setItemAnimator(this.f36749x);
                rwVar.run();
            } else if (this.E) {
            } else {
                this.E = true;
                if (!this.f36749x.k()) {
                    this.f36741a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(rwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        ny nyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            oy oyVar = this.H;
            if (oyVar.f37022d3 && (nyVar = oyVar.f37009b0[0]) == this) {
                oyVar.f37115w0.g(Math.abs(nyVar.getTranslationX()) / oyVar.f37009b0[0].getMeasuredWidth(), oyVar.f37009b0[1].h);
            }
            oyVar.m3();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            this.H.m3();
        }
        super.setTranslationY(f10);
    }
}
