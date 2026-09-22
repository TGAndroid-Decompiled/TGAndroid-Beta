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
    public static final qr f19714w = ji.n.V;
    public final FrameLayout f19715a;
    public FrameLayout f19716b;
    public ViewGroup f19717c;
    public View d;
    public boolean f19718f;
    public boolean f19719g;
    public View f19723l;
    public ValueAnimator f19724m;
    public float f19727p;
    public float f19728q;
    public boolean f19729r;
    public boolean f19730s;
    public boolean v;
    public boolean e = false;
    public final v2 h = new v2(this, 2);
    public int f19720i = -1;
    public int f19721j = -1;
    public int f19722k = -1;
    public final AnimationNotificationsLocker f19725n = new AnimationNotificationsLocker();
    public final ArrayList f19726o = new ArrayList();
    public final o1 f19731t = new o1(this);
    public final boolean f19732u = true;

    public p1(FrameLayout frameLayout) {
        this.f19715a = frameLayout;
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
        View view = this.f19715a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19717c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19716b;
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
            this.f19723l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19731t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19724m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19723l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19731t);
            this.f19723l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19726o;
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
        ValueAnimator valueAnimator = this.f19724m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19718f = false;
        this.e = false;
        this.f19725n.unlock();
        this.f19724m = null;
        h(-1);
        this.f19726o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19730s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19715a.setTranslationY(0.0f);
        }
        f();
    }
}
