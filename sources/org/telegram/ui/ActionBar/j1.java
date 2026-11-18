package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.lr;
public abstract class j1 {
    public static final lr f29017w = pi.k.V;
    public final FrameLayout f29018a;
    public FrameLayout f29019b;
    public ViewGroup f29020c;
    public View d;
    public boolean f29022f;
    public boolean f29023g;
    public View f29027l;
    public ValueAnimator f29028m;
    public float f29031p;
    public float f29032q;
    public boolean f29033r;
    public boolean f29034s;
    public boolean v;
    public boolean f29021e = false;
    public final j6.o h = new j6.o(this, 18);
    public int f29024i = -1;
    public int f29025j = -1;
    public int f29026k = -1;
    public final h2.f f29029n = new h2.f((int[]) null);
    public final ArrayList f29030o = new ArrayList();
    public final i1 f29035t = new i1(this, 0);
    public final boolean f29036u = true;

    public j1(FrameLayout frameLayout) {
        this.f29018a = frameLayout;
        org.telegram.messenger.g0.g3(new oi.a2(this, 5));
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
        View view = this.f29018a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f29020c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f29019b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof p3) {
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
            this.f29027l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f29035t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f29028m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f29027l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f29035t);
            this.f29027l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i7, boolean z10);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29030o;
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
        ValueAnimator valueAnimator = this.f29028m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f29022f = false;
        this.f29021e = false;
        this.f29029n.e();
        this.f29028m = null;
        h(-1);
        this.f29030o.clear();
        this.d.requestLayout();
        boolean z10 = this.f29034s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof ch.l)) {
            this.f29018a.setTranslationY(0.0f);
        }
        f();
    }
}
