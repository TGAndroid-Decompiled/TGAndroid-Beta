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
import org.telegram.ui.Components.bs;
public abstract class o1 {
    public static final bs f21717w = li.m.V;
    public final FrameLayout f21718a;
    public FrameLayout f21719b;
    public ViewGroup f21720c;
    public View d;
    public boolean f21721f;
    public boolean f21722g;
    public View f21726l;
    public ValueAnimator f21727m;
    public float f21730p;
    public float f21731q;
    public boolean f21732r;
    public boolean f21733s;
    public boolean v;
    public boolean e = false;
    public final w2 h = new w2(this, 2);
    public int f21723i = -1;
    public int f21724j = -1;
    public int f21725k = -1;
    public final AnimationNotificationsLocker f21728n = new AnimationNotificationsLocker();
    public final ArrayList f21729o = new ArrayList();
    public final n1 f21734t = new n1(this);
    public final boolean f21735u = true;

    public o1(FrameLayout frameLayout) {
        this.f21718a = frameLayout;
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
        View view = this.f21718a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f21720c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f21719b;
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
            this.f21726l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f21734t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f21727m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f21726l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f21734t);
            this.f21726l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f21729o;
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
        ValueAnimator valueAnimator = this.f21727m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21721f = false;
        this.e = false;
        this.f21728n.unlock();
        this.f21727m = null;
        h(-1);
        this.f21729o.clear();
        this.d.requestLayout();
        boolean z10 = this.f21733s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.u)) {
            this.f21718a.setTranslationY(0.0f);
        }
        f();
    }
}
