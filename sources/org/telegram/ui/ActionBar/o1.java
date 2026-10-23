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
import org.telegram.ui.Components.bs;
public abstract class o1 {
    public static final bs f21636w = li.m.V;
    public final FrameLayout f21637a;
    public FrameLayout f21638b;
    public ViewGroup f21639c;
    public View d;
    public boolean f21640f;
    public boolean f21641g;
    public View f21645l;
    public ValueAnimator f21646m;
    public float f21649p;
    public float f21650q;
    public boolean f21651r;
    public boolean f21652s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int f21642i = -1;
    public int f21643j = -1;
    public int f21644k = -1;
    public final AnimationNotificationsLocker f21647n = new AnimationNotificationsLocker();
    public final ArrayList f21648o = new ArrayList();
    public final n1 f21653t = new n1(this);
    public final boolean f21654u = true;

    public o1(FrameLayout frameLayout) {
        this.f21637a = frameLayout;
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
        View view = this.f21637a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21639c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21638b;
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
            this.f21645l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21653t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21646m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21645l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21653t);
            this.f21645l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21648o;
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
        ValueAnimator valueAnimator = this.f21646m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21640f = false;
        this.e = false;
        this.f21647n.unlock();
        this.f21646m = null;
        h(-1);
        this.f21648o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21652s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.u)) {
            this.f21637a.setTranslationY(0.0f);
        }
        f();
    }
}
