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
import org.telegram.ui.Components.gr;
public abstract class q1 {
    public static final gr f23713w = rh.m.V;
    public final FrameLayout f23714a;
    public FrameLayout f23715b;
    public ViewGroup f23716c;
    public View d;
    public boolean f23718f;
    public boolean f23719g;
    public View f23723l;
    public ValueAnimator f23724m;
    public float f23727p;
    public float f23728q;
    public boolean f23729r;
    public boolean f23730s;
    public boolean v;
    public boolean f23717e = false;
    public final v2 h = new v2(this, 2);
    public int f23720i = -1;
    public int f23721j = -1;
    public int f23722k = -1;
    public final AnimationNotificationsLocker f23725n = new AnimationNotificationsLocker();
    public final ArrayList f23726o = new ArrayList();
    public final p1 f23731t = new p1(this);
    public final boolean f23732u = true;

    public q1(FrameLayout frameLayout) {
        this.f23714a = frameLayout;
        AndroidUtilities.runOnUIThread(new p(this, 4));
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
        View view = this.f23714a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f23716c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f23715b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof x3) {
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
            this.f23723l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f23731t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f23724m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f23723l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f23731t);
            this.f23723l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i9, boolean z10);

    public final void h(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23726o;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).getLayoutParams().height = i9;
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
        ValueAnimator valueAnimator = this.f23724m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f23718f = false;
        this.f23717e = false;
        this.f23725n.unlock();
        this.f23724m = null;
        h(-1);
        this.f23726o.clear();
        this.d.requestLayout();
        boolean z10 = this.f23730s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof hg.o)) {
            this.f23714a.setTranslationY(0.0f);
        }
        f();
    }
}
