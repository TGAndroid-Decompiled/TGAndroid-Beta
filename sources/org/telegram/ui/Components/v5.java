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
public abstract class v5 extends LinearLayout {
    public static final Comparator f31140r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bi.t6(8)), new bi.t6(9));
    public final HashMap f31141a;
    public final ArrayList f31142b;
    public final fe.k f31143c;
    public boolean d;
    public int e;
    public int f31144f;
    public Runnable h;
    public float f31145n;

    public v5(Context context) {
        super(context);
        this.f31141a = new HashMap();
        this.f31142b = new ArrayList();
        this.f31143c = new fe.k(new t(this, 11), gr.h, 420L);
    }

    public final void a() {
        this.f31144f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            u5 u5Var = (u5) this.f31141a.get(childAt);
            if (childAt.getVisibility() == 0 && u5Var != null && u5Var.f30814b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f31144f = childAt.getMeasuredHeight() + this.f31144f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f31143c.f7044b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            fe.h hVar = (fe.h) obj;
            View view = ((u5) hVar.f7034a).f30813a;
            RectF b10 = hVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, hVar.c());
        }
        float f7 = getMetadata().f7042g.f7048a;
        if (this.f31145n != f7) {
            this.f31145n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f7040c.f7048a) + getMetadata().f7042g.f7048a;
    }

    public final boolean d(View view) {
        u5 u5Var = (u5) this.f31141a.get(view);
        if (u5Var != null && u5Var.f30814b) {
            return true;
        }
        return false;
    }

    public abstract void e();

    public void f(View view, float f7) {
        float T1 = org.telegram.messenger.i0.T1(0.95f, 1.0f, f7);
        view.setAlpha(f7);
        view.setScaleX(T1);
        view.setScaleY(T1);
    }

    public final void g(View view) {
        u5 u5Var = (u5) this.f31141a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f31143c.f7044b.size();
    }

    public fe.j getMetadata() {
        return this.f31143c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f31144f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        u5 u5Var = (u5) this.f31141a.get(view);
        if (u5Var != null) {
            u5Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        u5 u5Var;
        if (view != null && (u5Var = (u5) this.f31141a.get(view)) != null) {
            View view2 = u5Var.f30813a;
            if (u5Var.f30814b != z10) {
                u5Var.f30814b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !u5Var.f30815c) {
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ArrayList arrayList = this.f31142b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            u5 u5Var = (u5) this.f31141a.get(childAt);
            if (u5Var != null) {
                u5Var.e = i14;
                if (childAt.getVisibility() == 0 && u5Var.f30814b) {
                    arrayList.add(u5Var);
                }
            }
        }
        Collections.sort(arrayList, f31140r);
        this.f31143c.q(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((u5) obj).f30815c = true;
        }
        this.d = false;
        b();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.f31141a.put(view, new u5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f31141a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
