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
import org.telegram.ui.Components.tr;
public abstract class p1 {
    public static final tr f21443w = ji.n.V;
    public final FrameLayout f21444a;
    public FrameLayout f21445b;
    public ViewGroup f21446c;
    public View d;
    public boolean f21448f;
    public boolean f21449g;
    public View f21453l;
    public ValueAnimator f21454m;
    public float f21457p;
    public float f21458q;
    public boolean f21459r;
    public boolean f21460s;
    public boolean v;
    public boolean f21447e = false;
    public final v2 h = new v2(this, 2);
    public int f21450i = -1;
    public int f21451j = -1;
    public int f21452k = -1;
    public final AnimationNotificationsLocker f21455n = new AnimationNotificationsLocker();
    public final ArrayList f21456o = new ArrayList();
    public final o1 f21461t = new o1(this);
    public final boolean f21462u = true;

    public p1(FrameLayout frameLayout) {
        this.f21444a = frameLayout;
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
        View view = this.f21444a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21446c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21445b;
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
            this.f21453l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21461t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21454m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21453l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21461t);
            this.f21453l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21456o;
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
        ValueAnimator valueAnimator = this.f21454m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21448f = false;
        this.f21447e = false;
        this.f21455n.unlock();
        this.f21454m = null;
        h(-1);
        this.f21456o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21460s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f21444a.setTranslationY(0.0f);
        }
        f();
    }
}
