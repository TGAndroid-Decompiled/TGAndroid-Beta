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
    public static final qr f19508w = ji.n.V;
    public final FrameLayout f19509a;
    public FrameLayout f19510b;
    public ViewGroup f19511c;
    public View d;
    public boolean f19512f;
    public boolean f19513g;
    public View f19517l;
    public ValueAnimator f19518m;
    public float f19521p;
    public float f19522q;
    public boolean f19523r;
    public boolean f19524s;
    public boolean v;
    public boolean e = false;
    public final w2 h = new w2(this, 2);
    public int f19514i = -1;
    public int f19515j = -1;
    public int f19516k = -1;
    public final AnimationNotificationsLocker f19519n = new AnimationNotificationsLocker();
    public final ArrayList f19520o = new ArrayList();
    public final p1 f19525t = new p1(this);
    public final boolean f19526u = true;

    public q1(FrameLayout frameLayout) {
        this.f19509a = frameLayout;
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
        View view = this.f19509a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19511c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19510b;
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
            this.f19517l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19525t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19518m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19517l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19525t);
            this.f19517l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19520o;
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
        ValueAnimator valueAnimator = this.f19518m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19512f = false;
        this.e = false;
        this.f19519n.unlock();
        this.f19518m = null;
        h(-1);
        this.f19520o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19524s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19509a.setTranslationY(0.0f);
        }
        f();
    }
}
