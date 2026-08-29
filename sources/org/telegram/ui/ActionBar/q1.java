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
import org.telegram.ui.Components.jr;
public abstract class q1 {
    public static final jr f23735w = uh.m.V;
    public final FrameLayout f23736a;
    public FrameLayout f23737b;
    public ViewGroup f23738c;
    public View d;
    public boolean f23740f;
    public boolean f23741g;
    public View f23745l;
    public ValueAnimator f23746m;
    public float f23749p;
    public float f23750q;
    public boolean f23751r;
    public boolean f23752s;
    public boolean v;
    public boolean f23739e = false;
    public final v2 h = new v2(this, 2);
    public int f23742i = -1;
    public int f23743j = -1;
    public int f23744k = -1;
    public final AnimationNotificationsLocker f23747n = new AnimationNotificationsLocker();
    public final ArrayList f23748o = new ArrayList();
    public final p1 f23753t = new p1(this);
    public final boolean f23754u = true;

    public q1(FrameLayout frameLayout) {
        this.f23736a = frameLayout;
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
        View view = this.f23736a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f23738c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f23737b;
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
            this.f23745l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f23753t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f23746m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f23745l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f23753t);
            this.f23745l = null;
        }
    }

    public abstract void e(float f9, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f23748o;
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
        float f9;
        ValueAnimator valueAnimator = this.f23746m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f23740f = false;
        this.f23739e = false;
        this.f23747n.unlock();
        this.f23746m = null;
        h(-1);
        this.f23748o.clear();
        this.d.requestLayout();
        boolean z10 = this.f23752s;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        e(0.0f, f9, z10);
        if (!(this instanceof kg.o)) {
            this.f23736a.setTranslationY(0.0f);
        }
        f();
    }
}
