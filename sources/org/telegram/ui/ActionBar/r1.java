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
import org.telegram.ui.Components.nr;
public abstract class r1 {
    public static final nr f20543w = wh.n.V;
    public final FrameLayout f20544a;
    public FrameLayout f20545b;
    public ViewGroup f20546c;
    public View d;
    public boolean f20547f;
    public boolean f20548g;
    public View f20552l;
    public ValueAnimator f20553m;
    public float f20556p;
    public float f20557q;
    public boolean f20558r;
    public boolean f20559s;
    public boolean v;
    public boolean e = false;
    public final w2 h = new w2(this, 2);
    public int f20549i = -1;
    public int f20550j = -1;
    public int f20551k = -1;
    public final AnimationNotificationsLocker f20554n = new AnimationNotificationsLocker();
    public final ArrayList f20555o = new ArrayList();
    public final q1 f20560t = new q1(this);
    public final boolean f20561u = true;

    public r1(FrameLayout frameLayout) {
        this.f20544a = frameLayout;
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
        View view = this.f20544a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f20546c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f20545b;
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
            this.f20552l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f20560t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f20553m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f20552l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f20560t);
            this.f20552l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z4);

    public abstract void f();

    public abstract void g(int i10, boolean z4);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f20555o;
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
        ValueAnimator valueAnimator = this.f20553m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f20547f = false;
        this.e = false;
        this.f20554n.unlock();
        this.f20553m = null;
        h(-1);
        this.f20555o.clear();
        this.d.requestLayout();
        boolean z4 = this.f20559s;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z4);
        if (!(this instanceof mg.o)) {
            this.f20544a.setTranslationY(0.0f);
        }
        f();
    }
}
