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
import org.telegram.ui.Components.wr;
public abstract class r1 {
    public static final wr f18592w = ii.n.V;
    public final FrameLayout f18593a;
    public FrameLayout f18594b;
    public ViewGroup f18595c;
    public View d;
    public boolean f18596f;
    public boolean f18597g;
    public View f18601l;
    public ValueAnimator f18602m;
    public float f18605p;
    public float f18606q;
    public boolean f18607r;
    public boolean f18608s;
    public boolean v;
    public boolean e = false;
    public final x2 h = new x2(this, 2);
    public int f18598i = -1;
    public int f18599j = -1;
    public int f18600k = -1;
    public final AnimationNotificationsLocker f18603n = new AnimationNotificationsLocker();
    public final ArrayList f18604o = new ArrayList();
    public final q1 f18609t = new q1(this);
    public final boolean f18610u = true;

    public r1(FrameLayout frameLayout) {
        this.f18593a = frameLayout;
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
        View view = this.f18593a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f18595c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f18594b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof b4) {
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
            this.f18601l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f18609t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f18602m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f18601l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f18609t);
            this.f18601l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f18604o;
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
        ValueAnimator valueAnimator = this.f18602m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f18596f = false;
        this.e = false;
        this.f18603n.unlock();
        this.f18602m = null;
        h(-1);
        this.f18604o.clear();
        this.d.requestLayout();
        boolean z10 = this.f18608s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof yg.o)) {
            this.f18593a.setTranslationY(0.0f);
        }
        f();
    }
}
