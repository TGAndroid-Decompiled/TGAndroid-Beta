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
public abstract class q1 {
    public static final qr f19507w = ji.n.V;
    public final FrameLayout f19508a;
    public FrameLayout f19509b;
    public ViewGroup f19510c;
    public View d;
    public boolean f19511f;
    public boolean f19512g;
    public View f19516l;
    public ValueAnimator f19517m;
    public float f19520p;
    public float f19521q;
    public boolean f19522r;
    public boolean f19523s;
    public boolean v;
    public boolean e = false;
    public final w2 h = new w2(this, 2);
    public int f19513i = -1;
    public int f19514j = -1;
    public int f19515k = -1;
    public final AnimationNotificationsLocker f19518n = new AnimationNotificationsLocker();
    public final ArrayList f19519o = new ArrayList();
    public final p1 f19524t = new p1(this);
    public final boolean f19525u = true;

    public q1(FrameLayout frameLayout) {
        this.f19508a = frameLayout;
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
        View view = this.f19508a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19510c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19509b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof a4) {
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
            this.f19516l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19524t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19517m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19516l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19524t);
            this.f19516l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19519o;
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
        ValueAnimator valueAnimator = this.f19517m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19511f = false;
        this.e = false;
        this.f19518n.unlock();
        this.f19517m = null;
        h(-1);
        this.f19519o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19523s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19508a.setTranslationY(0.0f);
        }
        f();
    }
}
