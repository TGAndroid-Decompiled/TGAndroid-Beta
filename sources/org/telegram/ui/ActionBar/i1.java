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
public abstract class i1 {
    public static final xq f27519w = mi.l.V;
    public final FrameLayout f27520a;
    public FrameLayout f27521b;
    public ViewGroup f27522c;
    public View d;
    public boolean f27524f;
    public boolean f27525g;
    public View f27529l;
    public ValueAnimator f27530m;
    public float f27533p;
    public float f27534q;
    public boolean f27535r;
    public boolean f27536s;
    public boolean v;
    public boolean f27523e = false;
    public final m.f3 h = new m.f3(this, 15);
    public int f27526i = -1;
    public int f27527j = -1;
    public int f27528k = -1;
    public final h2.f f27531n = new h2.f((int[]) null);
    public final ArrayList f27532o = new ArrayList();
    public final h1 f27537t = new h1(this, 0);
    public final boolean f27538u = true;

    public i1(FrameLayout frameLayout) {
        this.f27520a = frameLayout;
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
        View view = this.f27520a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f27522c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f27521b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof n3) {
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
            this.f27529l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f27537t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f27530m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f27529l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f27537t);
            this.f27529l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z9);

    public abstract void f();

    public abstract void g(int i7, boolean z9);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27532o;
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
        ValueAnimator valueAnimator = this.f27530m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f27524f = false;
        this.f27523e = false;
        this.f27531n.e();
        this.f27530m = null;
        h(-1);
        this.f27532o.clear();
        this.d.requestLayout();
        boolean z9 = this.f27536s;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z9);
        if (!(this instanceof ch.k)) {
            this.f27520a.setTranslationY(0.0f);
        }
        f();
    }
}
