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
import org.telegram.ui.Components.qr;
public abstract class p1 {
    public static final qr f19480w = ji.n.V;
    public final FrameLayout f19481a;
    public FrameLayout f19482b;
    public ViewGroup f19483c;
    public View d;
    public boolean f19484f;
    public boolean f19485g;
    public View f19489l;
    public ValueAnimator f19490m;
    public float f19493p;
    public float f19494q;
    public boolean f19495r;
    public boolean f19496s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int f19486i = -1;
    public int f19487j = -1;
    public int f19488k = -1;
    public final AnimationNotificationsLocker f19491n = new AnimationNotificationsLocker();
    public final ArrayList f19492o = new ArrayList();
    public final o1 f19497t = new o1(this);
    public final boolean f19498u = true;

    public p1(FrameLayout frameLayout) {
        this.f19481a = frameLayout;
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
        View view = this.f19481a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19483c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19482b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof z3) {
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
            this.f19489l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19497t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19490m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19489l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19497t);
            this.f19489l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19492o;
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
        ValueAnimator valueAnimator = this.f19490m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19484f = false;
        this.e = false;
        this.f19491n.unlock();
        this.f19490m = null;
        h(-1);
        this.f19492o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19496s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19481a.setTranslationY(0.0f);
        }
        f();
    }
}
