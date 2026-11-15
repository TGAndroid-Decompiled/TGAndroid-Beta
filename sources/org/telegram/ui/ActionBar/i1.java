package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.er;
public abstract class i1 {
    public static final er f28644w = pi.k.V;
    public final FrameLayout f28645a;
    public FrameLayout f28646b;
    public ViewGroup f28647c;
    public View d;
    public boolean f28649f;
    public boolean f28650g;
    public View f28654l;
    public ValueAnimator f28655m;
    public float f28658p;
    public float f28659q;
    public boolean f28660r;
    public boolean f28661s;
    public boolean v;
    public boolean f28648e = false;
    public final j6.o h = new j6.o(this, 18);
    public int f28651i = -1;
    public int f28652j = -1;
    public int f28653k = -1;
    public final h2.f f28656n = new h2.f((int[]) null);
    public final ArrayList f28657o = new ArrayList();
    public final h1 f28662t = new h1(this, 0);
    public final boolean f28663u = true;

    public i1(FrameLayout frameLayout) {
        this.f28645a = frameLayout;
        org.telegram.messenger.g0.h3(new r0(this, 1));
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
        View view = this.f28645a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f28647c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f28646b;
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
            this.f28654l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f28662t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f28655m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f28654l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f28662t);
            this.f28654l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i7, boolean z10);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f28657o;
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
        ValueAnimator valueAnimator = this.f28655m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28649f = false;
        this.f28648e = false;
        this.f28656n.e();
        this.f28655m = null;
        h(-1);
        this.f28657o.clear();
        this.d.requestLayout();
        boolean z10 = this.f28661s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof ch.k)) {
            this.f28645a.setTranslationY(0.0f);
        }
        f();
    }
}
