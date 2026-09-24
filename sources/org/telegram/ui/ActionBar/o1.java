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
import org.telegram.ui.Components.rr;
public abstract class o1 {
    public static final rr f19654w = ji.n.V;
    public final FrameLayout f19655a;
    public FrameLayout f19656b;
    public ViewGroup f19657c;
    public View d;
    public boolean f19658f;
    public boolean f19659g;
    public View f19663l;
    public ValueAnimator f19664m;
    public float f19667p;
    public float f19668q;
    public boolean f19669r;
    public boolean f19670s;
    public boolean v;
    public boolean e = false;
    public final u2 h = new u2(this, 2);
    public int f19660i = -1;
    public int f19661j = -1;
    public int f19662k = -1;
    public final AnimationNotificationsLocker f19665n = new AnimationNotificationsLocker();
    public final ArrayList f19666o = new ArrayList();
    public final n1 f19671t = new n1(this);
    public final boolean f19672u = true;

    public o1(FrameLayout frameLayout) {
        this.f19655a = frameLayout;
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
        View view = this.f19655a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f19657c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f19656b;
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
            this.f19663l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f19671t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f19664m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f19663l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f19671t);
            this.f19663l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19666o;
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
        ValueAnimator valueAnimator = this.f19664m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19658f = false;
        this.e = false;
        this.f19665n.unlock();
        this.f19664m = null;
        h(-1);
        this.f19666o.clear();
        this.d.requestLayout();
        boolean z10 = this.f19670s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof zg.n)) {
            this.f19655a.setTranslationY(0.0f);
        }
        f();
    }
}
