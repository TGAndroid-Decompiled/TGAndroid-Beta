package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.kr;
public abstract class i1 {
    public static final kr f29066w = pi.k.V;
    public final FrameLayout f29067a;
    public FrameLayout f29068b;
    public ViewGroup f29069c;
    public View d;
    public boolean f29071f;
    public boolean f29072g;
    public View f29076l;
    public ValueAnimator f29077m;
    public float f29080p;
    public float f29081q;
    public boolean f29082r;
    public boolean f29083s;
    public boolean v;
    public boolean f29070e = false;
    public final i6.g h = new i6.g(this, 19);
    public int f29073i = -1;
    public int f29074j = -1;
    public int f29075k = -1;
    public final h2.f f29078n = new h2.f((int[]) null);
    public final ArrayList f29079o = new ArrayList();
    public final h1 f29084t = new h1(this, 0);
    public final boolean f29085u = true;

    public i1(FrameLayout frameLayout) {
        this.f29067a = frameLayout;
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
        View view = this.f29067a;
        Activity a10 = a(view.getContext());
        if (a10 != null) {
            this.f29069c = (ViewGroup) ((ViewGroup) a10.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f29068b;
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
            this.f29076l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f29084t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f29077m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f29076l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f29084t);
            this.f29076l = null;
        }
    }

    public abstract void e(float f10, float f11, boolean z10);

    public abstract void f();

    public abstract void g(int i7, boolean z10);

    public final void h(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29079o;
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
        ValueAnimator valueAnimator = this.f29077m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f29071f = false;
        this.f29070e = false;
        this.f29078n.e();
        this.f29077m = null;
        h(-1);
        this.f29079o.clear();
        this.d.requestLayout();
        boolean z10 = this.f29083s;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e(0.0f, f10, z10);
        if (!(this instanceof ch.l)) {
            this.f29067a.setTranslationY(0.0f);
        }
        f();
    }
}
