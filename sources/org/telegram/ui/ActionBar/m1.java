package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.gr;
public abstract class m1 {
    public static final gr f20562w = ci.o.V;
    public final FrameLayout f20563a;
    public FrameLayout f20564b;
    public ViewGroup f20565c;
    public View d;
    public boolean f20566f;
    public boolean f20567g;
    public View f20571l;
    public ValueAnimator f20572m;
    public float f20575p;
    public float f20576q;
    public boolean f20577r;
    public boolean f20578s;
    public boolean v;
    public boolean e = false;
    public final mg.c2 h = new mg.c2(this, 13);
    public int f20568i = -1;
    public int f20569j = -1;
    public int f20570k = -1;
    public final e2.f f20573n = new e2.f((int[]) null);
    public final ArrayList f20574o = new ArrayList();
    public final l1 f20579t = new l1(this, 0);
    public final boolean f20580u = true;

    public m1(FrameLayout frameLayout) {
        this.f20563a = frameLayout;
        org.telegram.messenger.i0.g3(new lg.s(this, 18));
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
        View view = this.f20563a;
        Activity a2 = a(view.getContext());
        if (a2 != null) {
            this.f20565c = (ViewGroup) ((ViewGroup) a2.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.f20564b;
        if (view2 == null) {
            while (true) {
                view2 = null;
                if (view != null) {
                    if (view.getParent() instanceof s3) {
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
            this.f20571l = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.f20579t);
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f20572m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f20571l;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.f20579t);
            this.f20571l = null;
        }
    }

    public abstract void e(float f7, float f10, boolean z10);

    public abstract void f();

    public abstract void g(int i10, boolean z10);

    public final void h(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f20574o;
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
        ValueAnimator valueAnimator = this.f20572m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f20566f = false;
        this.e = false;
        this.f20573n.e();
        this.f20572m = null;
        h(-1);
        this.f20574o.clear();
        this.d.requestLayout();
        boolean z10 = this.f20578s;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        e(0.0f, f7, z10);
        if (!(this instanceof sg.k)) {
            this.f20563a.setTranslationY(0.0f);
        }
        f();
    }
}
