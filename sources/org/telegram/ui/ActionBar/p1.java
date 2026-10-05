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
    public static final tr f21452w = ji.n.V;
    public final FrameLayout f21453a;
    public FrameLayout f21454b;
    public ViewGroup f21455c;
    public View d;
    public boolean f21457f;
    public boolean f21458g;
    public View f21462l;
    public ValueAnimator f21463m;
    public float f21466p;
    public float f21467q;
    public boolean f21468r;
    public boolean f21469s;
    public boolean v;
    public boolean f21456e = false;
    public final v2 h = new v2(this, 2);
    public int f21459i = -1;
    public int f21460j = -1;
    public int f21461k = -1;
    public final AnimationNotificationsLocker f21464n = new AnimationNotificationsLocker();
    public final ArrayList f21465o = new ArrayList();
    public final o1 f21470t = new o1(this);
    public final boolean f21471u = true;

    public p1(FrameLayout frameLayout) {
        this.f21453a = frameLayout;
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
        View view = this.f21453a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21455c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21454b;
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
            this.f21462l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21470t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21463m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21462l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21470t);
            this.f21462l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21465o;
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
        ValueAnimator valueAnimator = this.f21463m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21457f = false;
        this.f21456e = false;
        this.f21464n.unlock();
        this.f21463m = null;
        h(-1);
        this.f21465o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21469s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.k)) {
            this.f21453a.setTranslationY(0.0f);
        }
        f();
    }
}
