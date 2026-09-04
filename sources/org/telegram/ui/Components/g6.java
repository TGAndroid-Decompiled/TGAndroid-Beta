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
import org.telegram.messenger.AndroidUtilities;
public abstract class g6 extends LinearLayout {
    public static final Comparator f26257r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bi.o6(8)), new bi.o6(9));
    public final HashMap f26258a;
    public final ArrayList f26259b;
    public final le.j f26260c;
    public boolean d;
    public int f26261e;
    public int f26262f;
    public Runnable h;
    public float f26263n;

    public g6(Context context) {
        super(context);
        this.f26258a = new HashMap();
        this.f26259b = new ArrayList();
        this.f26260c = new le.j(new t(this, 11), pr.h, 420L);
    }

    public final void a() {
        this.f26262f = 0;
        this.f26261e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f6 f6Var = (f6) this.f26258a.get(childAt);
            if (childAt.getVisibility() == 0 && f6Var != null && f6Var.f25926b) {
                this.f26261e = childAt.getMeasuredWidth() + this.f26261e;
                this.f26262f = childAt.getMeasuredHeight() + this.f26262f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f26260c.f15391b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            le.g gVar = (le.g) obj;
            View view = ((f6) gVar.f15379a).f25925a;
            RectF b10 = gVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, gVar.c());
        }
        float f7 = getMetadata().f15389g.f15396a;
        if (this.f26263n != f7) {
            this.f26263n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f15386c.f15396a) + getMetadata().f15389g.f15396a;
    }

    public final boolean d(View view) {
        f6 f6Var = (f6) this.f26258a.get(view);
        if (f6Var != null && f6Var.f25926b) {
            return true;
        }
        return false;
    }

    public abstract void e();

    public void f(View view, float f7) {
        float lerp = AndroidUtilities.lerp(0.95f, 1.0f, f7);
        view.setAlpha(f7);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
    }

    public final void g(View view) {
        f6 f6Var = (f6) this.f26258a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f26260c.f15391b.size();
    }

    public le.i getMetadata() {
        return this.f26260c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f26262f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f26261e;
    }

    public final void h(int i10, View view) {
        f6 f6Var = (f6) this.f26258a.get(view);
        if (f6Var != null) {
            f6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        f6 f6Var;
        if (view != null && (f6Var = (f6) this.f26258a.get(view)) != null) {
            View view2 = f6Var.f25925a;
            if (f6Var.f25926b != z10) {
                f6Var.f25926b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !f6Var.f25927c) {
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
        ArrayList arrayList = this.f26259b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            f6 f6Var = (f6) this.f26258a.get(childAt);
            if (f6Var != null) {
                f6Var.f25928e = i14;
                if (childAt.getVisibility() == 0 && f6Var.f25926b) {
                    arrayList.add(f6Var);
                }
            }
        }
        Collections.sort(arrayList, f26257r);
        this.f26260c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((f6) obj).f25927c = true;
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
        this.f26258a.put(view, new f6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f26258a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
