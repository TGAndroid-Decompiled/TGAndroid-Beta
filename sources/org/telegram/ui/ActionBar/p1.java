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
    public static final tr f21448w = ji.n.V;
    public final FrameLayout f21449a;
    public FrameLayout f21450b;
    public ViewGroup f21451c;
    public View d;
    public boolean f21453f;
    public boolean f21454g;
    public View f21458l;
    public ValueAnimator f21459m;
    public float f21462p;
    public float f21463q;
    public boolean f21464r;
    public boolean f21465s;
    public boolean v;
    public boolean f21452e = false;
    public final v2 h = new v2(this, 2);
    public int f21455i = -1;
    public int f21456j = -1;
    public int f21457k = -1;
    public final AnimationNotificationsLocker f21460n = new AnimationNotificationsLocker();
    public final ArrayList f21461o = new ArrayList();
    public final o1 f21466t = new o1(this);
    public final boolean f21467u = true;

    public p1(FrameLayout frameLayout) {
        this.f21449a = frameLayout;
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
        View view = this.f21449a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21451c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21450b;
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
            this.f21458l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21466t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21459m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21458l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21466t);
            this.f21458l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21461o;
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
        ValueAnimator valueAnimator = this.f21459m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21453f = false;
        this.f21452e = false;
        this.f21460n.unlock();
        this.f21459m = null;
        h(-1);
        this.f21461o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21465s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f21449a.setTranslationY(0.0f);
        }
        f();
    }
}
