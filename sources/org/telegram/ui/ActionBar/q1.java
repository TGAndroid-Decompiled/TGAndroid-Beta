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
import org.telegram.ui.Components.sr;
public abstract class q1 {
    public static final sr f19718w = ji.n.V;
    public final FrameLayout f19719a;
    public FrameLayout f19720b;
    public ViewGroup f19721c;
    public View d;
    public boolean f19722f;
    public boolean f19723g;
    public View f19727l;
    public ValueAnimator f19728m;
    public float f19731p;
    public float f19732q;
    public boolean f19733r;
    public boolean f19734s;
    public boolean v;
    public boolean e = false;
    public final w2 h = new w2(this, 2);
    public int f19724i = -1;
    public int f19725j = -1;
    public int f19726k = -1;
    public final AnimationNotificationsLocker f19729n = new AnimationNotificationsLocker();
    public final ArrayList f19730o = new ArrayList();
    public final p1 f19735t = new p1(this);
    public final boolean f19736u = true;

    public q1(FrameLayout frameLayout) {
        this.f19719a = frameLayout;
        AndroidUtilities.runOnUIThread(new r(this, 4));
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
        View view = this.f19719a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19721c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19720b;
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
            this.f19727l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19735t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19728m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19727l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19735t);
            this.f19727l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19730o;
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
        ValueAnimator valueAnimator = this.f19728m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19722f = false;
        this.e = false;
        this.f19729n.unlock();
        this.f19728m = null;
        h(-1);
        this.f19730o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19734s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.o)) {
            this.f19719a.setTranslationY(0.0f);
        }
        f();
    }
}
