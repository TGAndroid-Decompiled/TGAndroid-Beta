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
    public static final qr f19476w = ji.n.V;
    public final FrameLayout f19477a;
    public FrameLayout f19478b;
    public ViewGroup f19479c;
    public View d;
    public boolean f19480f;
    public boolean f19481g;
    public View f19485l;
    public ValueAnimator f19486m;
    public float f19489p;
    public float f19490q;
    public boolean f19491r;
    public boolean f19492s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int f19482i = -1;
    public int f19483j = -1;
    public int f19484k = -1;
    public final AnimationNotificationsLocker f19487n = new AnimationNotificationsLocker();
    public final ArrayList f19488o = new ArrayList();
    public final o1 f19493t = new o1(this);
    public final boolean f19494u = true;

    public p1(FrameLayout frameLayout) {
        this.f19477a = frameLayout;
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
        View view = this.f19477a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19479c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19478b;
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
            this.f19485l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19493t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19486m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19485l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19493t);
            this.f19485l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19488o;
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
        ValueAnimator valueAnimator = this.f19486m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19480f = false;
        this.e = false;
        this.f19487n.unlock();
        this.f19486m = null;
        h(-1);
        this.f19488o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19492s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19477a.setTranslationY(0.0f);
        }
        f();
    }
}
