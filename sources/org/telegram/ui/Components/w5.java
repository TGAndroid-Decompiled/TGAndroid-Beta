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
    public static final Comparator f39885r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new cg.d(17)), new cg.d(18));
    public final HashMap f39886a;
    public final ArrayList f39887b;
    public final qe.h f39888c;
    public boolean d;
    public int f39889e;
    public int f39890f;
    public Runnable h;
    public float f39891n;

    public w5(Context context) {
        super(context);
        this.f39886a = new HashMap();
        this.f39887b = new ArrayList();
        this.f39888c = new qe.h(new t(this, 11), xq.h, 420L);
    }

    public final void a() {
        this.f39890f = 0;
        this.f39889e = 0;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            v5 v5Var = (v5) this.f39886a.get(childAt);
            if (childAt.getVisibility() == 0 && v5Var != null && v5Var.f39009b) {
                this.f39889e = childAt.getMeasuredWidth() + this.f39889e;
                this.f39890f = childAt.getMeasuredHeight() + this.f39890f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f39888c.f53861b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qe.e eVar = (qe.e) obj;
            View view = ((v5) eVar.f53849a).f39008a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f53859g.f53866a;
        if (this.f39891n != f10) {
            this.f39891n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f53856c.f53866a) + getMetadata().f53859g.f53866a;
    }

    public final boolean d(View view) {
        v5 v5Var = (v5) this.f39886a.get(view);
        if (v5Var != null && v5Var.f39009b) {
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
        v5 v5Var = (v5) this.f39886a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f39888c.f53861b.size();
    }

    public qe.g getMetadata() {
        return this.f39888c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f39890f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f39889e;
    }

    public final void h(int i3, View view) {
        v5 v5Var = (v5) this.f39886a.get(view);
        if (v5Var != null) {
            v5Var.d = i3;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        v5 v5Var;
        if (view != null && (v5Var = (v5) this.f39886a.get(view)) != null) {
            View view2 = v5Var.f39008a;
            if (v5Var.f39009b != z10) {
                v5Var.f39009b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !v5Var.f39010c) {
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        ArrayList arrayList = this.f39887b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            v5 v5Var = (v5) this.f39886a.get(childAt);
            if (v5Var != null) {
                v5Var.f39011e = i13;
                if (childAt.getVisibility() == 0 && v5Var.f39009b) {
                    arrayList.add(v5Var);
                }
            }
        }
        Collections.sort(arrayList, f39885r);
        this.f39888c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((v5) obj).f39010c = true;
        }
        this.d = false;
        b();
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        a();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.f39886a.put(view, new v5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f39886a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
