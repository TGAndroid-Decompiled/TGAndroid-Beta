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
public abstract class o1 {
    public static final is f21407w = ji.n.V;
    public final FrameLayout f21408a;
    public FrameLayout f21409b;
    public ViewGroup f21410c;
    public View d;
    public boolean f21412f;
    public boolean f21413g;
    public View f21417l;
    public ValueAnimator f21418m;
    public float f21421p;
    public float f21422q;
    public boolean f21423r;
    public boolean f21424s;
    public boolean v;
    public boolean f21411e = false;
    public final u2 h = new u2(this, 2);
    public int f21414i = -1;
    public int f21415j = -1;
    public int f21416k = -1;
    public final AnimationNotificationsLocker f21419n = new AnimationNotificationsLocker();
    public final ArrayList f21420o = new ArrayList();
    public final n1 f21425t = new n1(this);
    public final boolean f21426u = true;

    public o1(FrameLayout frameLayout) {
        this.f21408a = frameLayout;
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
        View view = this.f21408a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21410c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21409b;
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
            this.f21417l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21425t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21418m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21417l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21425t);
            this.f21417l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21420o;
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
        ValueAnimator valueAnimator = this.f21418m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21412f = false;
        this.f21411e = false;
        this.f21419n.unlock();
        this.f21418m = null;
        h(-1);
        this.f21420o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21424s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f21408a.setTranslationY(0.0f);
        }
        f();
    }
}
