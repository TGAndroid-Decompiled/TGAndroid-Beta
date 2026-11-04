package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;
public abstract class h1 {
    public static final xq f27551w = ni.l.V;
    public final FrameLayout f27552a;
    public FrameLayout f27553b;
    public ViewGroup f27554c;
    public View d;
    public boolean f27556f;
    public boolean f27557g;
    public View f27561l;
    public ValueAnimator f27562m;
    public float f27565p;
    public float f27566q;
    public boolean f27567r;
    public boolean f27568s;
    public boolean v;
    public boolean f27555e = false;
    public final mi.b0 h = new mi.b0(this, 14);
    public int f27558i = -1;
    public int f27559j = -1;
    public int f27560k = -1;
    public final g2.g f27563n = new g2.g((int[]) null);
    public final ArrayList f27564o = new ArrayList();
    public final g1 f27569t = new g1(this, 0);
    public final boolean f27570u = true;

    public h1(FrameLayout frameLayout) {
        this.f27552a = frameLayout;
        org.telegram.messenger.g0.h3(new lg.n(this, 22));
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return a(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public abstract boolean b();

    public final void c() {
        d();
        View view = this.f27552a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f27554c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f27553b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof l3) {
                        view2 = view;
                        break;
                    } else if (!(view.getParent() instanceof View)) {
                        break;
                    } else {
                        view = (View) view.getParent();
                    }
                } else {
                    break;
                }
            }
        }
        this.d = view2;
        if (view2 != null) {
            this.f27561l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f27569t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f27562m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f27561l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f27569t);
            this.f27561l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i3, boolean z10);

    public final void h(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27564o;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).getLayoutParams().height = i3;
                ((View) arrayList.get(i10)).requestLayout();
                i10++;
            } else {
                return;
            }
        }
    }

    public int i() {
        return 0;
    }

    public final void j() {
        float f10;
        ValueAnimator valueAnimator = this.f27562m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27556f = false;
        this.f27555e = false;
        this.f27563n.e();
        this.f27562m = null;
        h(-1);
        this.f27564o.clear();
        this.d.requestLayout();
        boolean z10 = this.f27568s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof dh.k)) {
            this.f27552a.setTranslationY(0.0f);
        }
        f();
    }
}
