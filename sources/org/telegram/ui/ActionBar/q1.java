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
    public static final ds f22963w = mi.m.V;
    public final FrameLayout f22964a;
    public FrameLayout f22965b;
    public ViewGroup f22966c;
    public View d;
    public boolean f22967f;
    public boolean f22968g;
    public View f22972l;
    public ValueAnimator f22973m;
    public float f22976p;
    public float f22977q;
    public boolean f22978r;
    public boolean f22979s;
    public boolean v;
    public boolean e = false;
    public final z2 h = new z2(this, 2);
    public int f22969i = -1;
    public int f22970j = -1;
    public int f22971k = -1;
    public final AnimationNotificationsLocker f22974n = new AnimationNotificationsLocker();
    public final ArrayList f22975o = new ArrayList();
    public final p1 f22980t = new p1(this);
    public final boolean f22981u = true;

    public q1(FrameLayout frameLayout) {
        this.f22964a = frameLayout;
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
        View view = this.f22964a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f22966c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f22965b;
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
            this.f22972l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f22980t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f22973m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f22972l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f22980t);
            this.f22972l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22975o;
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
        ValueAnimator valueAnimator = this.f22973m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f22967f = false;
        this.e = false;
        this.f22974n.unlock();
        this.f22973m = null;
        h(-1);
        this.f22975o.clear();
        this.d.requestLayout();
        boolean z10 = this.f22979s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof bh.o)) {
            this.f22964a.setTranslationY(0.0f);
        }
        f();
    }
}
