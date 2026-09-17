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
import org.telegram.ui.Components.pr;
public abstract class p1 {
    public static final pr f21303w = ki.o.V;
    public final FrameLayout f21304a;
    public FrameLayout f21305b;
    public ViewGroup f21306c;
    public View d;
    public boolean f21308f;
    public boolean f21309g;
    public View f21313l;
    public ValueAnimator f21314m;
    public float f21317p;
    public float f21318q;
    public boolean f21319r;
    public boolean f21320s;
    public boolean v;
    public boolean f21307e = false;
    public final v2 h = new v2(this, 2);
    public int f21310i = -1;
    public int f21311j = -1;
    public int f21312k = -1;
    public final AnimationNotificationsLocker f21315n = new AnimationNotificationsLocker();
    public final ArrayList f21316o = new ArrayList();
    public final o1 f21321t = new o1(this);
    public final boolean f21322u = true;

    public p1(FrameLayout frameLayout) {
        this.f21304a = frameLayout;
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
        View view = this.f21304a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21306c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21305b;
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
            this.f21313l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21321t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21314m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21313l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21321t);
            this.f21313l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21316o;
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
        ValueAnimator valueAnimator = this.f21314m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21308f = false;
        this.f21307e = false;
        this.f21315n.unlock();
        this.f21314m = null;
        h(-1);
        this.f21316o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21320s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.v)) {
            this.f21304a.setTranslationY(0.0f);
        }
        f();
    }
}
