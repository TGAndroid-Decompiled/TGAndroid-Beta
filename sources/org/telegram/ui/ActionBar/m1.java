package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.gr;
public abstract class m1 {
    public static final gr f20561w = ci.o.V;
    public final FrameLayout f20562a;
    public FrameLayout f20563b;
    public ViewGroup f20564c;
    public View d;
    public boolean f20565f;
    public boolean f20566g;
    public View f20570l;
    public ValueAnimator f20571m;
    public float f20574p;
    public float f20575q;
    public boolean f20576r;
    public boolean f20577s;
    public boolean v;
    public boolean e = false;
    public final mg.c2 h = new mg.c2(this, 13);
    public int f20567i = -1;
    public int f20568j = -1;
    public int f20569k = -1;
    public final e2.f f20572n = new e2.f(null);
    public final ArrayList f20573o = new ArrayList();
    public final l1 f20578t = new l1(this, 0);
    public final boolean f20579u = true;

    public m1(FrameLayout frameLayout) {
        this.f20562a = frameLayout;
        org.telegram.messenger.i0.g3(new lg.s(this, 18));
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
        View view = this.f20562a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f20564c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f20563b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof s3) {
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
            this.f20570l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f20578t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f20571m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f20570l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f20578t);
            this.f20570l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f20573o;
            if (i11 < arrayList.size()) {
                ((View) arrayList.get(i11)).getLayoutParams().height = i10;
                ((View) arrayList.get(i11)).requestLayout();
                i11++;
            } else {
                return;
            }
        }
    }

    public int i() {
        return 0;
    }

    public final void j() {
        float f7;
        ValueAnimator valueAnimator = this.f20571m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f20565f = false;
        this.e = false;
        this.f20572n.e();
        this.f20571m = null;
        h(-1);
        this.f20573o.clear();
        this.d.requestLayout();
        boolean z10 = this.f20577s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof sg.k)) {
            this.f20562a.setTranslationY(0.0f);
        }
        f();
    }
}
