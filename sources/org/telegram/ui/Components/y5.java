package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public abstract class y5 extends LinearLayout {
    public static final Comparator f40593r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(17)), new bg.d(18));
    public final HashMap f40594a;
    public final ArrayList f40595b;
    public final te.h f40596c;
    public boolean d;
    public int f40597e;
    public int f40598f;
    public Runnable h;
    public float f40599n;

    public y5(Context context) {
        super(context);
        this.f40594a = new HashMap();
        this.f40595b = new ArrayList();
        this.f40596c = new te.h(new u(this, 11), xq.h, 420L);
    }

    public final void a() {
        this.f40598f = 0;
        this.f40597e = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            x5 x5Var = (x5) this.f40594a.get(childAt);
            if (childAt.getVisibility() == 0 && x5Var != null && x5Var.f40297b) {
                this.f40597e = childAt.getMeasuredWidth() + this.f40597e;
                this.f40598f = childAt.getMeasuredHeight() + this.f40598f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f40596c.f55520b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            View view = ((x5) eVar.f55508a).f40296a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f55518g.f55525a;
        if (this.f40599n != f10) {
            this.f40599n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f55515c.f55525a) + getMetadata().f55518g.f55525a;
    }

    public final boolean d(View view) {
        x5 x5Var = (x5) this.f40594a.get(view);
        if (x5Var != null && x5Var.f40297b) {
            return true;
        }
        return false;
    }

    public abstract void e();

    public void f(View view, float f10) {
        float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(T1);
        view.setScaleY(T1);
    }

    public final void g(View view) {
        x5 x5Var = (x5) this.f40594a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f40596c.f55520b.size();
    }

    public te.g getMetadata() {
        return this.f40596c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f40598f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f40597e;
    }

    public final void h(int i7, View view) {
        x5 x5Var = (x5) this.f40594a.get(view);
        if (x5Var != null) {
            x5Var.d = i7;
        }
    }

    public final void i(View view, boolean z9, boolean z10) {
        x5 x5Var;
        if (view != null && (x5Var = (x5) this.f40594a.get(view)) != null) {
            View view2 = x5Var.f40296a;
            if (x5Var.f40297b != z9) {
                x5Var.f40297b = z9;
                if (z9) {
                    view2.setVisibility(0);
                }
                if (!z9 && !x5Var.f40298c) {
                    view2.setVisibility(8);
                }
                if (!z10) {
                    this.d = true;
                }
                requestLayout();
            }
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ArrayList arrayList = this.f40595b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            x5 x5Var = (x5) this.f40594a.get(childAt);
            if (x5Var != null) {
                x5Var.f40299e = i13;
                if (childAt.getVisibility() == 0 && x5Var.f40297b) {
                    arrayList.add(x5Var);
                }
            }
        }
        Collections.sort(arrayList, f40593r);
        this.f40596c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((x5) obj).f40298c = true;
        }
        this.d = false;
        b();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        a();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.f40594a.put(view, new x5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f40594a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
