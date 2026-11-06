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
    public static final Comparator f40546r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(17)), new bg.d(18));
    public final HashMap f40547a;
    public final ArrayList f40548b;
    public final te.h f40549c;
    public boolean d;
    public int f40550e;
    public int f40551f;
    public Runnable h;
    public float f40552n;

    public y5(Context context) {
        super(context);
        this.f40547a = new HashMap();
        this.f40548b = new ArrayList();
        this.f40549c = new te.h(new u(this, 11), xq.h, 420L);
    }

    public final void a() {
        this.f40551f = 0;
        this.f40550e = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            x5 x5Var = (x5) this.f40547a.get(childAt);
            if (childAt.getVisibility() == 0 && x5Var != null && x5Var.f40188b) {
                this.f40550e = childAt.getMeasuredWidth() + this.f40550e;
                this.f40551f = childAt.getMeasuredHeight() + this.f40551f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f40549c.f55415b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            View view = ((x5) eVar.f55403a).f40187a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f55413g.f55420a;
        if (this.f40552n != f10) {
            this.f40552n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f55410c.f55420a) + getMetadata().f55413g.f55420a;
    }

    public final boolean d(View view) {
        x5 x5Var = (x5) this.f40547a.get(view);
        if (x5Var != null && x5Var.f40188b) {
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
        x5 x5Var = (x5) this.f40547a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f40549c.f55415b.size();
    }

    public te.g getMetadata() {
        return this.f40549c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f40551f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f40550e;
    }

    public final void h(int i7, View view) {
        x5 x5Var = (x5) this.f40547a.get(view);
        if (x5Var != null) {
            x5Var.d = i7;
        }
    }

    public final void i(View view, boolean z9, boolean z10) {
        x5 x5Var;
        if (view != null && (x5Var = (x5) this.f40547a.get(view)) != null) {
            View view2 = x5Var.f40187a;
            if (x5Var.f40188b != z9) {
                x5Var.f40188b = z9;
                if (z9) {
                    view2.setVisibility(0);
                }
                if (!z9 && !x5Var.f40189c) {
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
        ArrayList arrayList = this.f40548b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            x5 x5Var = (x5) this.f40547a.get(childAt);
            if (x5Var != null) {
                x5Var.f40190e = i13;
                if (childAt.getVisibility() == 0 && x5Var.f40188b) {
                    arrayList.add(x5Var);
                }
            }
        }
        Collections.sort(arrayList, f40546r);
        this.f40549c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((x5) obj).f40189c = true;
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
        this.f40547a.put(view, new x5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f40547a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
