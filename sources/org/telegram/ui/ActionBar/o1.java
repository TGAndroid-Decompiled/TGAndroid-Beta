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
import org.telegram.ui.Components.es;
public abstract class o1 {
    public static final es f20254w = ki.n.V;
    public final FrameLayout f20255a;
    public FrameLayout f20256b;
    public ViewGroup f20257c;
    public View d;
    public boolean f20258f;
    public boolean f20259g;
    public View f20263l;
    public ValueAnimator f20264m;
    public float f20267p;
    public float f20268q;
    public boolean f20269r;
    public boolean f20270s;
    public boolean v;
    public boolean e = false;
    public final u2 h = new u2(this, 2);
    public int f20260i = -1;
    public int f20261j = -1;
    public int f20262k = -1;
    public final AnimationNotificationsLocker f20265n = new AnimationNotificationsLocker();
    public final ArrayList f20266o = new ArrayList();
    public final n1 f20271t = new n1(this);
    public final boolean f20272u = true;

    public o1(FrameLayout frameLayout) {
        this.f20255a = frameLayout;
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
        View view = this.f20255a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f20257c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f20256b;
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
            this.f20263l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f20271t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f20264m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f20263l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f20271t);
            this.f20263l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f20266o;
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
        ValueAnimator valueAnimator = this.f20264m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f20258f = false;
        this.e = false;
        this.f20265n.unlock();
        this.f20264m = null;
        h(-1);
        this.f20266o.clear();
        this.d.requestLayout();
        boolean z10 = this.f20270s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.u)) {
            this.f20255a.setTranslationY(0.0f);
        }
        f();
    }
}
