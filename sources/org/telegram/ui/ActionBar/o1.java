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
    public static final bs f21635w = li.m.V;
    public final FrameLayout f21636a;
    public FrameLayout f21637b;
    public ViewGroup f21638c;
    public View d;
    public boolean f21639f;
    public boolean f21640g;
    public View f21644l;
    public ValueAnimator f21645m;
    public float f21648p;
    public float f21649q;
    public boolean f21650r;
    public boolean f21651s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int f21641i = -1;
    public int f21642j = -1;
    public int f21643k = -1;
    public final AnimationNotificationsLocker f21646n = new AnimationNotificationsLocker();
    public final ArrayList f21647o = new ArrayList();
    public final n1 f21652t = new n1(this);
    public final boolean f21653u = true;

    public o1(FrameLayout frameLayout) {
        this.f21636a = frameLayout;
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
        View view = this.f21636a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21638c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21637b;
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
            this.f21644l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21652t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21645m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21644l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21652t);
            this.f21644l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21647o;
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
        ValueAnimator valueAnimator = this.f21645m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21639f = false;
        this.e = false;
        this.f21646n.unlock();
        this.f21645m = null;
        h(-1);
        this.f21647o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21651s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.u)) {
            this.f21636a.setTranslationY(0.0f);
        }
        f();
    }
}
