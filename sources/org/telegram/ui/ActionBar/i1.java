package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.wq;
public abstract class i1 {
    public static final wq f27527w = mi.l.V;
    public final FrameLayout f27528a;
    public FrameLayout f27529b;
    public ViewGroup f27530c;
    public View d;
    public boolean f27532f;
    public boolean f27533g;
    public View f27537l;
    public ValueAnimator f27538m;
    public float f27541p;
    public float f27542q;
    public boolean f27543r;
    public boolean f27544s;
    public boolean v;
    public boolean f27531e = false;
    public final m.f3 h = new m.f3(this, 15);
    public int f27534i = -1;
    public int f27535j = -1;
    public int f27536k = -1;
    public final h2.f f27539n = new h2.f((int[]) null);
    public final ArrayList f27540o = new ArrayList();
    public final h1 f27545t = new h1(this, 0);
    public final boolean f27546u = true;

    public i1(FrameLayout frameLayout) {
        this.f27528a = frameLayout;
        org.telegram.messenger.g0.h3(new l2.a0(this, 18));
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
        View view = this.f27528a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f27530c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f27529b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof o3) {
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
            this.f27537l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f27545t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f27538m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f27537l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f27545t);
            this.f27537l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z9);

    public abstract void f();

    public abstract void g(int i7, boolean z9);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27540o;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).getLayoutParams().height = i7;
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
        ValueAnimator valueAnimator = this.f27538m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27532f = false;
        this.f27531e = false;
        this.f27539n.e();
        this.f27538m = null;
        h(-1);
        this.f27540o.clear();
        this.d.requestLayout();
        boolean z9 = this.f27544s;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z9);
        if (!(this instanceof ch.k)) {
            this.f27528a.setTranslationY(0.0f);
        }
        f();
    }
}
