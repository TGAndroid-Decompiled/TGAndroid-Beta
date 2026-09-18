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
    public static final qr f19667w = ji.n.V;
    public final FrameLayout f19668a;
    public FrameLayout f19669b;
    public ViewGroup f19670c;
    public View d;
    public boolean f19671f;
    public boolean f19672g;
    public View f19676l;
    public ValueAnimator f19677m;
    public float f19680p;
    public float f19681q;
    public boolean f19682r;
    public boolean f19683s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int f19673i = -1;
    public int f19674j = -1;
    public int f19675k = -1;
    public final AnimationNotificationsLocker f19678n = new AnimationNotificationsLocker();
    public final ArrayList f19679o = new ArrayList();
    public final o1 f19684t = new o1(this);
    public final boolean f19685u = true;

    public p1(FrameLayout frameLayout) {
        this.f19668a = frameLayout;
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
        View view = this.f19668a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19670c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19669b;
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
            this.f19676l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19684t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19677m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19676l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19684t);
            this.f19676l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19679o;
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
        ValueAnimator valueAnimator = this.f19677m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19671f = false;
        this.e = false;
        this.f19678n.unlock();
        this.f19677m = null;
        h(-1);
        this.f19679o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19683s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19668a.setTranslationY(0.0f);
        }
        f();
    }
}
