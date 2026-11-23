package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.nr;
public abstract class i1 {
    public static final nr f29005w = pi.k.V;
    public final FrameLayout f29006a;
    public FrameLayout f29007b;
    public ViewGroup f29008c;
    public View d;
    public boolean f29010f;
    public boolean f29011g;
    public View f29015l;
    public ValueAnimator f29016m;
    public float f29019p;
    public float f29020q;
    public boolean f29021r;
    public boolean f29022s;
    public boolean v;
    public boolean f29009e = false;
    public final j6.o h = new j6.o(this, 18);
    public int f29012i = -1;
    public int f29013j = -1;
    public int f29014k = -1;
    public final h2.f f29017n = new h2.f((int[]) null);
    public final ArrayList f29018o = new ArrayList();
    public final h1 f29023t = new h1(this, 0);
    public final boolean f29024u = true;

    public i1(FrameLayout frameLayout) {
        this.f29006a = frameLayout;
        org.telegram.messenger.g0.g3(new oi.c2(this, 5));
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
        View view = this.f29006a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f29008c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f29007b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof o3) {
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
            this.f29015l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f29023t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f29016m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f29015l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f29023t);
            this.f29015l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i7, boolean z10);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29018o;
            if (i10 < arrayList.size()) {
                ((View) arrayList.get(i10)).getLayoutParams().height = i7;
                ((View) arrayList.get(i10)).requestLayout();
                i10++;
            } else {
                return;
            }
        }
    }

    public int i() {
        return 0;
    }

    public final void j() {
        float f10;
        ValueAnimator valueAnimator = this.f29016m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f29010f = false;
        this.f29009e = false;
        this.f29017n.e();
        this.f29016m = null;
        h(-1);
        this.f29018o.clear();
        this.d.requestLayout();
        boolean z10 = this.f29022s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof ch.l)) {
            this.f29006a.setTranslationY(0.0f);
        }
        f();
    }
}
