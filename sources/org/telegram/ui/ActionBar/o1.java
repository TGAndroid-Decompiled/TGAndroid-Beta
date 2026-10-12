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
import org.telegram.ui.Components.es;
public abstract class o1 {
    public static final es f20554w = ki.n.V;
    public final FrameLayout f20555a;
    public FrameLayout f20556b;
    public ViewGroup f20557c;
    public View d;
    public boolean f20558f;
    public boolean f20559g;
    public View f20563l;
    public ValueAnimator f20564m;
    public float f20567p;
    public float f20568q;
    public boolean f20569r;
    public boolean f20570s;
    public boolean v;
    public boolean e = false;
    public final u2 h = new u2(this, 2);
    public int f20560i = -1;
    public int f20561j = -1;
    public int f20562k = -1;
    public final AnimationNotificationsLocker f20565n = new AnimationNotificationsLocker();
    public final ArrayList f20566o = new ArrayList();
    public final n1 f20571t = new n1(this);
    public final boolean f20572u = true;

    public o1(FrameLayout frameLayout) {
        this.f20555a = frameLayout;
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
        View view = this.f20555a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f20557c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f20556b;
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
            this.f20563l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f20571t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f20564m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f20563l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f20571t);
            this.f20563l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f20566o;
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
        ValueAnimator valueAnimator = this.f20564m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f20558f = false;
        this.e = false;
        this.f20565n.unlock();
        this.f20564m = null;
        h(-1);
        this.f20566o.clear();
        this.d.requestLayout();
        boolean z10 = this.f20570s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof ah.u)) {
            this.f20555a.setTranslationY(0.0f);
        }
        f();
    }
}
