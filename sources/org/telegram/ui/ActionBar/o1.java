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
    public static final sr f19670w = ji.n.V;
    public final FrameLayout f19671a;
    public FrameLayout f19672b;
    public ViewGroup f19673c;
    public View d;
    public boolean f19674f;
    public boolean f19675g;
    public View f19679l;
    public ValueAnimator f19680m;
    public float f19683p;
    public float f19684q;
    public boolean f19685r;
    public boolean f19686s;
    public boolean v;
    public boolean e = false;
    public final u2 h = new u2(this, 2);
    public int f19676i = -1;
    public int f19677j = -1;
    public int f19678k = -1;
    public final AnimationNotificationsLocker f19681n = new AnimationNotificationsLocker();
    public final ArrayList f19682o = new ArrayList();
    public final n1 f19687t = new n1(this);
    public final boolean f19688u = true;

    public o1(FrameLayout frameLayout) {
        this.f19671a = frameLayout;
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
        View view = this.f19671a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19673c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19672b;
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
            this.f19679l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19687t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19680m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19679l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19687t);
            this.f19679l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19682o;
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
        ValueAnimator valueAnimator = this.f19680m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19674f = false;
        this.e = false;
        this.f19681n.unlock();
        this.f19680m = null;
        h(-1);
        this.f19682o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19686s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19671a.setTranslationY(0.0f);
        }
        f();
    }
}
