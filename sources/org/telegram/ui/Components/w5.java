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
public abstract class w5 extends LinearLayout {
    public static final Comparator f41257r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(17)), new bg.d(18));
    public final HashMap f41258a;
    public final ArrayList f41259b;
    public final te.h f41260c;
    public boolean d;
    public int f41261e;
    public int f41262f;
    public Runnable h;
    public float f41263n;

    public w5(Context context) {
        super(context);
        this.f41258a = new HashMap();
        this.f41259b = new ArrayList();
        this.f41260c = new te.h(new s(this, 11), er.h, 420L);
    }

    public final void a() {
        this.f41262f = 0;
        this.f41261e = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            v5 v5Var = (v5) this.f41258a.get(childAt);
            if (childAt.getVisibility() == 0 && v5Var != null && v5Var.f40267b) {
                this.f41261e = childAt.getMeasuredWidth() + this.f41261e;
                this.f41262f = childAt.getMeasuredHeight() + this.f41262f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f41260c.f57102b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            View view = ((v5) eVar.f57090a).f40266a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f57100g.f57107a;
        if (this.f41263n != f10) {
            this.f41263n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f57097c.f57107a) + getMetadata().f57100g.f57107a;
    }

    public final boolean d(View view) {
        v5 v5Var = (v5) this.f41258a.get(view);
        if (v5Var != null && v5Var.f40267b) {
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
        v5 v5Var = (v5) this.f41258a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f41260c.f57102b.size();
    }

    public te.g getMetadata() {
        return this.f41260c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f41262f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f41261e;
    }

    public final void h(int i7, View view) {
        v5 v5Var = (v5) this.f41258a.get(view);
        if (v5Var != null) {
            v5Var.d = i7;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        v5 v5Var;
        if (view != null && (v5Var = (v5) this.f41258a.get(view)) != null) {
            View view2 = v5Var.f40266a;
            if (v5Var.f40267b != z10) {
                v5Var.f40267b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !v5Var.f40268c) {
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
        ArrayList arrayList = this.f41259b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            v5 v5Var = (v5) this.f41258a.get(childAt);
            if (v5Var != null) {
                v5Var.f40269e = i13;
                if (childAt.getVisibility() == 0 && v5Var.f40267b) {
                    arrayList.add(v5Var);
                }
            }
        }
        Collections.sort(arrayList, f41257r);
        this.f41260c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((v5) obj).f40268c = true;
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
        this.f41258a.put(view, new v5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f41258a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
