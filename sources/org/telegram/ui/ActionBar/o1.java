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
public abstract class o1 {
    public static final sr f19668w = ji.n.V;
    public final FrameLayout f19669a;
    public FrameLayout f19670b;
    public ViewGroup f19671c;
    public View d;
    public boolean f19672f;
    public boolean f19673g;
    public View f19677l;
    public ValueAnimator f19678m;
    public float f19681p;
    public float f19682q;
    public boolean f19683r;
    public boolean f19684s;
    public boolean v;
    public boolean e = false;
    public final u2 h = new u2(this, 2);
    public int f19674i = -1;
    public int f19675j = -1;
    public int f19676k = -1;
    public final AnimationNotificationsLocker f19679n = new AnimationNotificationsLocker();
    public final ArrayList f19680o = new ArrayList();
    public final n1 f19685t = new n1(this);
    public final boolean f19686u = true;

    public o1(FrameLayout frameLayout) {
        this.f19669a = frameLayout;
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
        View view = this.f19669a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19671c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19670b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof x3) {
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
            this.f19677l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19685t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19678m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19677l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19685t);
            this.f19677l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19680o;
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
        ValueAnimator valueAnimator = this.f19678m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19672f = false;
        this.e = false;
        this.f19679n.unlock();
        this.f19678m = null;
        h(-1);
        this.f19680o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19684s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19669a.setTranslationY(0.0f);
        }
        f();
    }
}
