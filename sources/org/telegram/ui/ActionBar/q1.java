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
import org.telegram.ui.Components.ds;
public abstract class q1 {
    public static final ds f22961w = mi.m.V;
    public final FrameLayout f22962a;
    public FrameLayout f22963b;
    public ViewGroup f22964c;
    public View d;
    public boolean f22965f;
    public boolean f22966g;
    public View f22970l;
    public ValueAnimator f22971m;
    public float f22974p;
    public float f22975q;
    public boolean f22976r;
    public boolean f22977s;
    public boolean v;
    public boolean e = false;
    public final z2 h = new z2(this, 2);
    public int f22967i = -1;
    public int f22968j = -1;
    public int f22969k = -1;
    public final AnimationNotificationsLocker f22972n = new AnimationNotificationsLocker();
    public final ArrayList f22973o = new ArrayList();
    public final p1 f22978t = new p1(this);
    public final boolean f22979u = true;

    public q1(FrameLayout frameLayout) {
        this.f22962a = frameLayout;
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
        View view = this.f22962a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f22964c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f22963b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof d4) {
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
            this.f22970l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f22978t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f22971m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f22970l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f22978t);
            this.f22970l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22973o;
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
        ValueAnimator valueAnimator = this.f22971m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f22965f = false;
        this.e = false;
        this.f22972n.unlock();
        this.f22971m = null;
        h(-1);
        this.f22973o.clear();
        this.d.requestLayout();
        boolean z10 = this.f22977s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof bh.o)) {
            this.f22962a.setTranslationY(0.0f);
        }
        f();
    }
}
