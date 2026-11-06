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
    public static final Comparator f40524r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(17)), new bg.d(18));
    public final HashMap f40525a;
    public final ArrayList f40526b;
    public final te.h f40527c;
    public boolean d;
    public int f40528e;
    public int f40529f;
    public Runnable h;
    public float f40530n;

    public y5(Context context) {
        super(context);
        this.f40525a = new HashMap();
        this.f40526b = new ArrayList();
        this.f40527c = new te.h(new u(this, 11), xq.h, 420L);
    }

    public final void a() {
        this.f40529f = 0;
        this.f40528e = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            x5 x5Var = (x5) this.f40525a.get(childAt);
            if (childAt.getVisibility() == 0 && x5Var != null && x5Var.f40166b) {
                this.f40528e = childAt.getMeasuredWidth() + this.f40528e;
                this.f40529f = childAt.getMeasuredHeight() + this.f40529f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f40527c.f55416b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            View view = ((x5) eVar.f55404a).f40165a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f55414g.f55421a;
        if (this.f40530n != f10) {
            this.f40530n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f55411c.f55421a) + getMetadata().f55414g.f55421a;
    }

    public final boolean d(View view) {
        x5 x5Var = (x5) this.f40525a.get(view);
        if (x5Var != null && x5Var.f40166b) {
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
        x5 x5Var = (x5) this.f40525a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f40527c.f55416b.size();
    }

    public te.g getMetadata() {
        return this.f40527c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f40529f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f40528e;
    }

    public final void h(int i7, View view) {
        x5 x5Var = (x5) this.f40525a.get(view);
        if (x5Var != null) {
            x5Var.d = i7;
        }
    }

    public final void i(View view, boolean z9, boolean z10) {
        x5 x5Var;
        if (view != null && (x5Var = (x5) this.f40525a.get(view)) != null) {
            View view2 = x5Var.f40165a;
            if (x5Var.f40166b != z9) {
                x5Var.f40166b = z9;
                if (z9) {
                    view2.setVisibility(0);
                }
                if (!z9 && !x5Var.f40167c) {
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
        ArrayList arrayList = this.f40526b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            x5 x5Var = (x5) this.f40525a.get(childAt);
            if (x5Var != null) {
                x5Var.f40168e = i13;
                if (childAt.getVisibility() == 0 && x5Var.f40166b) {
                    arrayList.add(x5Var);
                }
            }
        }
        Collections.sort(arrayList, f40524r);
        this.f40527c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((x5) obj).f40167c = true;
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
        this.f40525a.put(view, new x5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f40525a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
