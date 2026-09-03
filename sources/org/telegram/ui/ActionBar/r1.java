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
public abstract class r1 {
    public static final pr f22251w = xh.n.V;
    public final FrameLayout f22252a;
    public FrameLayout f22253b;
    public ViewGroup f22254c;
    public View d;
    public boolean f22256f;
    public boolean f22257g;
    public View f22261l;
    public ValueAnimator f22262m;
    public float f22265p;
    public float f22266q;
    public boolean f22267r;
    public boolean f22268s;
    public boolean v;
    public boolean f22255e = false;
    public final x2 h = new x2(this, 2);
    public int f22258i = -1;
    public int f22259j = -1;
    public int f22260k = -1;
    public final AnimationNotificationsLocker f22263n = new AnimationNotificationsLocker();
    public final ArrayList f22264o = new ArrayList();
    public final q1 f22269t = new q1(this);
    public final boolean f22270u = true;

    public r1(FrameLayout frameLayout) {
        this.f22252a = frameLayout;
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
        View view = this.f22252a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f22254c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f22253b;
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
            this.f22261l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f22269t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f22262m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f22261l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f22269t);
            this.f22261l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z4);

    public abstract void f();

    public abstract void g(int i10, boolean z4);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22264o;
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
        float f10;
        ValueAnimator valueAnimator = this.f22262m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f22256f = false;
        this.f22255e = false;
        this.f22263n.unlock();
        this.f22262m = null;
        h(-1);
        this.f22264o.clear();
        this.d.requestLayout();
        boolean z4 = this.f22268s;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z4);
        if (!(this instanceof ng.o)) {
            this.f22252a.setTranslationY(0.0f);
        }
        f();
    }
}
