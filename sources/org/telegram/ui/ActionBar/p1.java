package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.Components.rr;
public abstract class p1 {
    public static final rr f19441w = ji.n.V;
    public final FrameLayout f19442a;
    public FrameLayout f19443b;
    public ViewGroup f19444c;
    public View d;
    public boolean f19445f;
    public boolean f19446g;
    public View f19450l;
    public ValueAnimator f19451m;
    public float f19454p;
    public float f19455q;
    public boolean f19456r;
    public boolean f19457s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int f19447i = -1;
    public int f19448j = -1;
    public int f19449k = -1;
    public final AnimationNotificationsLocker f19452n = new AnimationNotificationsLocker();
    public final ArrayList f19453o = new ArrayList();
    public final o1 f19458t = new o1(this);
    public final boolean f19459u = true;

    public p1(FrameLayout frameLayout) {
        this.f19442a = frameLayout;
        AndroidUtilities.runOnUIThread(new q(this, 4));
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
        View view = this.f19442a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19444c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19443b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof y3) {
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
            this.f19450l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19458t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19451m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19450l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19458t);
            this.f19450l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19453o;
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
        ValueAnimator valueAnimator = this.f19451m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19445f = false;
        this.e = false;
        this.f19452n.unlock();
        this.f19451m = null;
        h(-1);
        this.f19453o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19457s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19442a.setTranslationY(0.0f);
        }
        f();
    }
}
