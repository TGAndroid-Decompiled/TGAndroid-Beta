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
    public static final bs f21632w = li.m.V;
    public final FrameLayout f21633a;
    public FrameLayout f21634b;
    public ViewGroup f21635c;
    public View d;
    public boolean f21636f;
    public boolean f21637g;
    public View f21641l;
    public ValueAnimator f21642m;
    public float f21645p;
    public float f21646q;
    public boolean f21647r;
    public boolean f21648s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int f21638i = -1;
    public int f21639j = -1;
    public int f21640k = -1;
    public final AnimationNotificationsLocker f21643n = new AnimationNotificationsLocker();
    public final ArrayList f21644o = new ArrayList();
    public final n1 f21649t = new n1(this);
    public final boolean f21650u = true;

    public o1(FrameLayout frameLayout) {
        this.f21633a = frameLayout;
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
        View view = this.f21633a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21635c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21634b;
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
            this.f21641l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21649t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21642m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21641l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21649t);
            this.f21641l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21644o;
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
        ValueAnimator valueAnimator = this.f21642m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21636f = false;
        this.e = false;
        this.f21643n.unlock();
        this.f21642m = null;
        h(-1);
        this.f21644o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21648s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.u)) {
            this.f21633a.setTranslationY(0.0f);
        }
        f();
    }
}
