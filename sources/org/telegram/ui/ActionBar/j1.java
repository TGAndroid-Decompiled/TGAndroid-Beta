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
    public static final lr f29019w = pi.k.V;
    public final FrameLayout f29020a;
    public FrameLayout f29021b;
    public ViewGroup f29022c;
    public View d;
    public boolean f29024f;
    public boolean f29025g;
    public View f29029l;
    public ValueAnimator f29030m;
    public float f29033p;
    public float f29034q;
    public boolean f29035r;
    public boolean f29036s;
    public boolean v;
    public boolean f29023e = false;
    public final j6.o h = new j6.o(this, 18);
    public int f29026i = -1;
    public int f29027j = -1;
    public int f29028k = -1;
    public final h2.f f29031n = new h2.f((int[]) null);
    public final ArrayList f29032o = new ArrayList();
    public final i1 f29037t = new i1(this, 0);
    public final boolean f29038u = true;

    public j1(FrameLayout frameLayout) {
        this.f29020a = frameLayout;
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
        View view = this.f29020a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f29022c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f29021b;
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
            this.f29029l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f29037t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f29030m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f29029l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f29037t);
            this.f29029l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i7, boolean z10);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29032o;
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
        ValueAnimator valueAnimator = this.f29030m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f29024f = false;
        this.f29023e = false;
        this.f29031n.e();
        this.f29030m = null;
        h(-1);
        this.f29032o.clear();
        this.d.requestLayout();
        boolean z10 = this.f29036s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof ch.l)) {
            this.f29020a.setTranslationY(0.0f);
        }
        f();
    }
}
