package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.nr;
public abstract class i1 {
    public static final nr f28971w = pi.k.V;
    public final FrameLayout f28972a;
    public FrameLayout f28973b;
    public ViewGroup f28974c;
    public View d;
    public boolean f28976f;
    public boolean f28977g;
    public View f28981l;
    public ValueAnimator f28982m;
    public float f28985p;
    public float f28986q;
    public boolean f28987r;
    public boolean f28988s;
    public boolean v;
    public boolean f28975e = false;
    public final j6.o h = new j6.o(this, 18);
    public int f28978i = -1;
    public int f28979j = -1;
    public int f28980k = -1;
    public final h2.f f28983n = new h2.f((int[]) null);
    public final ArrayList f28984o = new ArrayList();
    public final h1 f28989t = new h1(this, 0);
    public final boolean f28990u = true;

    public i1(FrameLayout frameLayout) {
        this.f28972a = frameLayout;
        org.telegram.messenger.g0.g3(new org.telegram.tgnet.m(this, 4));
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
        View view = this.f28972a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f28974c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f28973b;
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
            this.f28981l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f28989t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f28982m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f28981l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f28989t);
            this.f28981l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i7, boolean z10);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f28984o;
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
        ValueAnimator valueAnimator = this.f28982m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28976f = false;
        this.f28975e = false;
        this.f28983n.e();
        this.f28982m = null;
        h(-1);
        this.f28984o.clear();
        this.d.requestLayout();
        boolean z10 = this.f28988s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof ch.l)) {
            this.f28972a.setTranslationY(0.0f);
        }
        f();
    }
}
