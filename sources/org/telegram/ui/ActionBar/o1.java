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
    public static final js f21181w = ji.n.V;
    public final FrameLayout f21182a;
    public FrameLayout f21183b;
    public ViewGroup f21184c;
    public View d;
    public boolean f21186f;
    public boolean f21187g;
    public View f21191l;
    public ValueAnimator f21192m;
    public float f21195p;
    public float f21196q;
    public boolean f21197r;
    public boolean f21198s;
    public boolean v;
    public boolean f21185e = false;
    public final u2 h = new u2(this, 2);
    public int f21188i = -1;
    public int f21189j = -1;
    public int f21190k = -1;
    public final AnimationNotificationsLocker f21193n = new AnimationNotificationsLocker();
    public final ArrayList f21194o = new ArrayList();
    public final n1 f21199t = new n1(this);
    public final boolean f21200u = true;

    public o1(FrameLayout frameLayout) {
        this.f21182a = frameLayout;
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
        View view = this.f21182a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21184c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21183b;
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
            this.f21191l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21199t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21192m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21191l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21199t);
            this.f21191l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21194o;
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
        ValueAnimator valueAnimator = this.f21192m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21186f = false;
        this.f21185e = false;
        this.f21193n.unlock();
        this.f21192m = null;
        h(-1);
        this.f21194o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21198s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f21182a.setTranslationY(0.0f);
        }
        f();
    }
}
