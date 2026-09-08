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
    public static final pr f21302w = ki.o.V;
    public final FrameLayout f21303a;
    public FrameLayout f21304b;
    public ViewGroup f21305c;
    public View d;
    public boolean f21307f;
    public boolean f21308g;
    public View f21312l;
    public ValueAnimator f21313m;
    public float f21316p;
    public float f21317q;
    public boolean f21318r;
    public boolean f21319s;
    public boolean v;
    public boolean f21306e = false;
    public final v2 h = new v2(this, 2);
    public int f21309i = -1;
    public int f21310j = -1;
    public int f21311k = -1;
    public final AnimationNotificationsLocker f21314n = new AnimationNotificationsLocker();
    public final ArrayList f21315o = new ArrayList();
    public final o1 f21320t = new o1(this);
    public final boolean f21321u = true;

    public p1(FrameLayout frameLayout) {
        this.f21303a = frameLayout;
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
        View view = this.f21303a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21305c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21304b;
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
            this.f21312l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21320t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21313m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21312l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21320t);
            this.f21312l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21315o;
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
        ValueAnimator valueAnimator = this.f21313m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21307f = false;
        this.f21306e = false;
        this.f21314n.unlock();
        this.f21313m = null;
        h(-1);
        this.f21315o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21319s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.v)) {
            this.f21303a.setTranslationY(0.0f);
        }
        f();
    }
}
