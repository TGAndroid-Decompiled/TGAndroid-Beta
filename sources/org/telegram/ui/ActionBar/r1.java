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
import org.telegram.ui.Components.mr;
public abstract class r1 {
    public static final mr f20518w = wh.n.V;
    public final FrameLayout f20519a;
    public FrameLayout f20520b;
    public ViewGroup f20521c;
    public View d;
    public boolean f20522f;
    public boolean f20523g;
    public View f20527l;
    public ValueAnimator f20528m;
    public float f20531p;
    public float f20532q;
    public boolean f20533r;
    public boolean f20534s;
    public boolean v;
    public boolean e = false;
    public final w2 h = new w2(this, 2);
    public int f20524i = -1;
    public int f20525j = -1;
    public int f20526k = -1;
    public final AnimationNotificationsLocker f20529n = new AnimationNotificationsLocker();
    public final ArrayList f20530o = new ArrayList();
    public final q1 f20535t = new q1(this);
    public final boolean f20536u = true;

    public r1(FrameLayout frameLayout) {
        this.f20519a = frameLayout;
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
        View view = this.f20519a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f20521c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f20520b;
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
            this.f20527l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f20535t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f20528m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f20527l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f20535t);
            this.f20527l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z4);

    public abstract void f();

    public abstract void g(int i10, boolean z4);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f20530o;
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
        ValueAnimator valueAnimator = this.f20528m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f20522f = false;
        this.e = false;
        this.f20529n.unlock();
        this.f20528m = null;
        h(-1);
        this.f20530o.clear();
        this.d.requestLayout();
        boolean z4 = this.f20534s;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z4);
        if (!(this instanceof mg.o)) {
            this.f20519a.setTranslationY(0.0f);
        }
        f();
    }
}
