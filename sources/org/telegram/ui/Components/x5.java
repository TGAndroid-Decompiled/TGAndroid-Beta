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
public abstract class x5 extends LinearLayout {
    public static final Comparator f40177r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(17)), new bg.d(18));
    public final HashMap f40178a;
    public final ArrayList f40179b;
    public final te.h f40180c;
    public boolean d;
    public int f40181e;
    public int f40182f;
    public Runnable h;
    public float f40183n;

    public x5(Context context) {
        super(context);
        this.f40178a = new HashMap();
        this.f40179b = new ArrayList();
        this.f40180c = new te.h(new t(this, 11), wq.h, 420L);
    }

    public final void a() {
        this.f40182f = 0;
        this.f40181e = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            w5 w5Var = (w5) this.f40178a.get(childAt);
            if (childAt.getVisibility() == 0 && w5Var != null && w5Var.f39882b) {
                this.f40181e = childAt.getMeasuredWidth() + this.f40181e;
                this.f40182f = childAt.getMeasuredHeight() + this.f40182f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f40180c.f55519b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            View view = ((w5) eVar.f55507a).f39881a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f55517g.f55524a;
        if (this.f40183n != f10) {
            this.f40183n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f55514c.f55524a) + getMetadata().f55517g.f55524a;
    }

    public final boolean d(View view) {
        w5 w5Var = (w5) this.f40178a.get(view);
        if (w5Var != null && w5Var.f39882b) {
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
        w5 w5Var = (w5) this.f40178a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f40180c.f55519b.size();
    }

    public te.g getMetadata() {
        return this.f40180c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f40182f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f40181e;
    }

    public final void h(int i7, View view) {
        w5 w5Var = (w5) this.f40178a.get(view);
        if (w5Var != null) {
            w5Var.d = i7;
        }
    }

    public final void i(View view, boolean z9, boolean z10) {
        w5 w5Var;
        if (view != null && (w5Var = (w5) this.f40178a.get(view)) != null) {
            View view2 = w5Var.f39881a;
            if (w5Var.f39882b != z9) {
                w5Var.f39882b = z9;
                if (z9) {
                    view2.setVisibility(0);
                }
                if (!z9 && !w5Var.f39883c) {
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
        ArrayList arrayList = this.f40179b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            w5 w5Var = (w5) this.f40178a.get(childAt);
            if (w5Var != null) {
                w5Var.f39884e = i13;
                if (childAt.getVisibility() == 0 && w5Var.f39882b) {
                    arrayList.add(w5Var);
                }
            }
        }
        Collections.sort(arrayList, f40177r);
        this.f40180c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((w5) obj).f39883c = true;
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
        this.f40178a.put(view, new w5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f40178a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
