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
import org.telegram.ui.Components.js;
public abstract class o1 {
    public static final js f21182w = ji.n.V;
    public final FrameLayout f21183a;
    public FrameLayout f21184b;
    public ViewGroup f21185c;
    public View d;
    public boolean f21187f;
    public boolean f21188g;
    public View f21192l;
    public ValueAnimator f21193m;
    public float f21196p;
    public float f21197q;
    public boolean f21198r;
    public boolean f21199s;
    public boolean v;
    public boolean f21186e = false;
    public final u2 h = new u2(this, 2);
    public int f21189i = -1;
    public int f21190j = -1;
    public int f21191k = -1;
    public final AnimationNotificationsLocker f21194n = new AnimationNotificationsLocker();
    public final ArrayList f21195o = new ArrayList();
    public final n1 f21200t = new n1(this);
    public final boolean f21201u = true;

    public o1(FrameLayout frameLayout) {
        this.f21183a = frameLayout;
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
        View view = this.f21183a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21185c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21184b;
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
            this.f21192l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21200t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21193m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21192l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21200t);
            this.f21192l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21195o;
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
        ValueAnimator valueAnimator = this.f21193m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21187f = false;
        this.f21186e = false;
        this.f21194n.unlock();
        this.f21193m = null;
        h(-1);
        this.f21195o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21199s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f21183a.setTranslationY(0.0f);
        }
        f();
    }
}
