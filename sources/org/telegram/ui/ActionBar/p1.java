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
import org.telegram.ui.Components.er;

public abstract class p1 {

    public static final er f23706w = sh.m.V;

    public final FrameLayout f23707a;

    public FrameLayout f23708b;

    public ViewGroup f23709c;
    public View d;

    public boolean f23711f;

    public boolean f23712g;

    public View f23716l;

    public ValueAnimator f23717m;

    public float f23720p;

    public float f23721q;

    public boolean f23722r;

    public boolean f23723s;
    public boolean v;

    public boolean f23710e = false;
    public final u2 h = new u2(this, 2);

    public int f23713i = -1;

    public int f23714j = -1;

    public int f23715k = -1;

    public final AnimationNotificationsLocker f23718n = new AnimationNotificationsLocker();

    public final ArrayList f23719o = new ArrayList();

    public final o1 f23724t = new o1(this);

    public final boolean f23725u = true;

    public p1(FrameLayout frameLayout) {
        this.f23707a = frameLayout;
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
        View view = this.f23707a;
        Activity activityA = a(view.getContext());
        if (activityA != null) {
            this.f23709c = (ViewGroup) ((ViewGroup) activityA.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f23708b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (!(view.getParent() instanceof x3)) {
                        if (!(view.getParent() instanceof View)) {
                            break;
                        } else {
                            view = (View) view.getParent();
                        }
                    } else {
                        view2 = view;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.d = view2;
        if (view2 != null) {
            this.f23716l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f23724t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f23717m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f23716l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f23724t);
            this.f23716l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f23719o;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i11)).getLayoutParams().height = i10;
            ((View) arrayList.get(i11)).requestLayout();
            i11++;
        }
    }

    public int i() {
        return 0;
    }

    public final void j() {
        ValueAnimator valueAnimator = this.f23717m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f23711f = false;
        this.f23710e = false;
        this.f23718n.unlock();
        this.f23717m = null;
        h(-1);
        this.f23719o.clear();
        this.d.requestLayout();
        boolean z10 = this.f23723s;
        e(0.0f, z10 ? 1.0f : 0.0f, z10);
        if (!(this instanceof ig.o)) {
            this.f23707a.setTranslationY(0.0f);
        }
        f();
    }
}
