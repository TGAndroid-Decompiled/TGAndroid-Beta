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
    public static final pr f21276w = ki.o.V;
    public final FrameLayout f21277a;
    public FrameLayout f21278b;
    public ViewGroup f21279c;
    public View d;
    public boolean f21281f;
    public boolean f21282g;
    public View f21286l;
    public ValueAnimator f21287m;
    public float f21290p;
    public float f21291q;
    public boolean f21292r;
    public boolean f21293s;
    public boolean v;
    public boolean f21280e = false;
    public final v2 h = new v2(this, 2);
    public int f21283i = -1;
    public int f21284j = -1;
    public int f21285k = -1;
    public final AnimationNotificationsLocker f21288n = new AnimationNotificationsLocker();
    public final ArrayList f21289o = new ArrayList();
    public final o1 f21294t = new o1(this);
    public final boolean f21295u = true;

    public p1(FrameLayout frameLayout) {
        this.f21277a = frameLayout;
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
        View view = this.f21277a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21279c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21278b;
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
            this.f21286l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21294t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21287m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21286l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21294t);
            this.f21286l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21289o;
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
        ValueAnimator valueAnimator = this.f21287m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21281f = false;
        this.f21280e = false;
        this.f21288n.unlock();
        this.f21287m = null;
        h(-1);
        this.f21289o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21293s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.v)) {
            this.f21277a.setTranslationY(0.0f);
        }
        f();
    }
}
