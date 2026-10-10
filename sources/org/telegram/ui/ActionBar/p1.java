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
import org.telegram.ui.Components.is;
public abstract class p1 {
    public static final is f21459w = ji.n.V;
    public final FrameLayout f21460a;
    public FrameLayout f21461b;
    public ViewGroup f21462c;
    public View d;
    public boolean f21464f;
    public boolean f21465g;
    public View f21469l;
    public ValueAnimator f21470m;
    public float f21473p;
    public float f21474q;
    public boolean f21475r;
    public boolean f21476s;
    public boolean v;
    public boolean f21463e = false;
    public final v2 h = new v2(this, 2);
    public int f21466i = -1;
    public int f21467j = -1;
    public int f21468k = -1;
    public final AnimationNotificationsLocker f21471n = new AnimationNotificationsLocker();
    public final ArrayList f21472o = new ArrayList();
    public final o1 f21477t = new o1(this);
    public final boolean f21478u = true;

    public p1(FrameLayout frameLayout) {
        this.f21460a = frameLayout;
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
        View view = this.f21460a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21462c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21461b;
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
            this.f21469l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21477t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21470m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21469l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21477t);
            this.f21469l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21472o;
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
        ValueAnimator valueAnimator = this.f21470m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21464f = false;
        this.f21463e = false;
        this.f21471n.unlock();
        this.f21470m = null;
        h(-1);
        this.f21472o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21476s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f21460a.setTranslationY(0.0f);
        }
        f();
    }
}
