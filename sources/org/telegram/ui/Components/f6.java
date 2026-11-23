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
public abstract class f6 extends LinearLayout {
    public static final Comparator f35066r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(17)), new bg.d(18));
    public final HashMap f35067a;
    public final ArrayList f35068b;
    public final te.h f35069c;
    public boolean d;
    public int f35070e;
    public int f35071f;
    public Runnable h;
    public float f35072n;

    public f6(Context context) {
        super(context);
        this.f35067a = new HashMap();
        this.f35068b = new ArrayList();
        this.f35069c = new te.h(new c0(this, 10), nr.h, 420L);
    }

    public final void a() {
        this.f35071f = 0;
        this.f35070e = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            e6 e6Var = (e6) this.f35067a.get(childAt);
            if (childAt.getVisibility() == 0 && e6Var != null && e6Var.f34675b) {
                this.f35070e = childAt.getMeasuredWidth() + this.f35070e;
                this.f35071f = childAt.getMeasuredHeight() + this.f35071f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f35069c.f57686b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            View view = ((e6) eVar.f57674a).f34674a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            g(view, eVar.c());
        }
        float f10 = getMetadata().f57684g.f57691a;
        if (this.f35072n != f10) {
            this.f35072n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float d(float f10) {
        return (f10 * getMetadata().f57681c.f57691a) + getMetadata().f57684g.f57691a;
    }

    public final boolean e(View view) {
        e6 e6Var = (e6) this.f35067a.get(view);
        if (e6Var != null && e6Var.f34675b) {
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
        return this.f35069c.f57686b.size();
    }

    public te.g getMetadata() {
        return this.f35069c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f35071f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f35070e;
    }

    public final void h(View view) {
        e6 e6Var = (e6) this.f35067a.get(view);
    }

    public final void i(int i7, View view) {
        e6 e6Var = (e6) this.f35067a.get(view);
        if (e6Var != null) {
            e6Var.d = i7;
        }
    }

    public final void j(View view, boolean z10, boolean z11) {
        e6 e6Var;
        if (view != null && (e6Var = (e6) this.f35067a.get(view)) != null) {
            View view2 = e6Var.f34674a;
            if (e6Var.f34675b != z10) {
                e6Var.f34675b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !e6Var.f34676c) {
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
        ArrayList arrayList = this.f35068b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            e6 e6Var = (e6) this.f35067a.get(childAt);
            if (e6Var != null) {
                e6Var.f34677e = i13;
                if (childAt.getVisibility() == 0 && e6Var.f34675b) {
                    arrayList.add(e6Var);
                }
            }
        }
        Collections.sort(arrayList, f35066r);
        this.f35069c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((e6) obj).f34676c = true;
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
        this.f35067a.put(view, new e6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f35067a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
