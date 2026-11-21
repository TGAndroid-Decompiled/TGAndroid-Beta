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
    public static final nr f29002w = pi.k.V;
    public final FrameLayout f29003a;
    public FrameLayout f29004b;
    public ViewGroup f29005c;
    public View d;
    public boolean f29007f;
    public boolean f29008g;
    public View f29012l;
    public ValueAnimator f29013m;
    public float f29016p;
    public float f29017q;
    public boolean f29018r;
    public boolean f29019s;
    public boolean v;
    public boolean f29006e = false;
    public final j6.o h = new j6.o(this, 18);
    public int f29009i = -1;
    public int f29010j = -1;
    public int f29011k = -1;
    public final h2.f f29014n = new h2.f((int[]) null);
    public final ArrayList f29015o = new ArrayList();
    public final h1 f29020t = new h1(this, 0);
    public final boolean f29021u = true;

    public i1(FrameLayout frameLayout) {
        this.f29003a = frameLayout;
        org.telegram.messenger.g0.g3(new oi.c2(this, 5));
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
        View view = this.f29003a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f29005c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f29004b;
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
            this.f29012l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f29020t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f29013m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f29012l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f29020t);
            this.f29012l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i7, boolean z10);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29015o;
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
        ValueAnimator valueAnimator = this.f29013m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f29007f = false;
        this.f29006e = false;
        this.f29014n.e();
        this.f29013m = null;
        h(-1);
        this.f29015o.clear();
        this.d.requestLayout();
        boolean z10 = this.f29019s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof ch.l)) {
            this.f29003a.setTranslationY(0.0f);
        }
        f();
    }
}
