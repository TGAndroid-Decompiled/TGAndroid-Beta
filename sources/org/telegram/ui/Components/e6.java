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
public abstract class e6 extends LinearLayout {
    public static final Comparator f34575r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(17)), new bg.d(18));
    public final HashMap f34576a;
    public final ArrayList f34577b;
    public final te.h f34578c;
    public boolean d;
    public int f34579e;
    public int f34580f;
    public Runnable h;
    public float f34581n;

    public e6(Context context) {
        super(context);
        this.f34576a = new HashMap();
        this.f34577b = new ArrayList();
        this.f34578c = new te.h(new b0(this, 10), kr.h, 420L);
    }

    public final void a() {
        this.f34580f = 0;
        this.f34579e = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            d6 d6Var = (d6) this.f34576a.get(childAt);
            if (childAt.getVisibility() == 0 && d6Var != null && d6Var.f34217b) {
                this.f34579e = childAt.getMeasuredWidth() + this.f34579e;
                this.f34580f = childAt.getMeasuredHeight() + this.f34580f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f34578c.f57800b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            View view = ((d6) eVar.f57788a).f34216a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            g(view, eVar.c());
        }
        float f10 = getMetadata().f57798g.f57805a;
        if (this.f34581n != f10) {
            this.f34581n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float d(float f10) {
        return (f10 * getMetadata().f57795c.f57805a) + getMetadata().f57798g.f57805a;
    }

    public final boolean e(View view) {
        d6 d6Var = (d6) this.f34576a.get(view);
        if (d6Var != null && d6Var.f34217b) {
            return true;
        }
        return false;
    }

    public abstract void f();

    public void g(View view, float f10) {
        float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(T1);
        view.setScaleY(T1);
    }

    public float getAnimatedHeightWithPadding() {
        return d(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f34578c.f57800b.size();
    }

    public te.g getMetadata() {
        return this.f34578c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f34580f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f34579e;
    }

    public final void h(View view) {
        d6 d6Var = (d6) this.f34576a.get(view);
    }

    public final void i(int i7, View view) {
        d6 d6Var = (d6) this.f34576a.get(view);
        if (d6Var != null) {
            d6Var.d = i7;
        }
    }

    public final void j(View view, boolean z10, boolean z11) {
        d6 d6Var;
        if (view != null && (d6Var = (d6) this.f34576a.get(view)) != null) {
            View view2 = d6Var.f34216a;
            if (d6Var.f34217b != z10) {
                d6Var.f34217b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !d6Var.f34218c) {
                    view2.setVisibility(8);
                }
                if (!z11) {
                    this.d = true;
                }
                requestLayout();
            }
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        ArrayList arrayList = this.f34577b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            d6 d6Var = (d6) this.f34576a.get(childAt);
            if (d6Var != null) {
                d6Var.f34219e = i13;
                if (childAt.getVisibility() == 0 && d6Var.f34217b) {
                    arrayList.add(d6Var);
                }
            }
        }
        Collections.sort(arrayList, f34575r);
        this.f34578c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((d6) obj).f34218c = true;
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
        this.f34576a.put(view, new d6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f34576a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
