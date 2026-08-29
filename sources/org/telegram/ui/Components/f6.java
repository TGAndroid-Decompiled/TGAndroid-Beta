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
public abstract class f6 extends LinearLayout {
    public static final Comparator f28319r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new jf.d(14)), new jf.d(15));
    public final HashMap f28320a;
    public final ArrayList f28321b;
    public final vd.i f28322c;
    public boolean d;
    public int f28323e;
    public int f28324f;
    public Runnable h;
    public float f28325n;

    public f6(Context context) {
        super(context);
        this.f28320a = new HashMap();
        this.f28321b = new ArrayList();
        this.f28322c = new vd.i(new u(this, 11), jr.h, 420L);
    }

    public final void a() {
        this.f28324f = 0;
        this.f28323e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e6 e6Var = (e6) this.f28320a.get(childAt);
            if (childAt.getVisibility() == 0 && e6Var != null && e6Var.f27933b) {
                this.f28323e = childAt.getMeasuredWidth() + this.f28323e;
                this.f28324f = childAt.getMeasuredHeight() + this.f28324f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f28322c.f49526b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            vd.f fVar = (vd.f) obj;
            View view = ((e6) fVar.f49514a).f27932a;
            RectF b10 = fVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, fVar.c());
        }
        float f9 = getMetadata().f49524g.f49531a;
        if (this.f28325n != f9) {
            this.f28325n = f9;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f9) {
        return (f9 * getMetadata().f49521c.f49531a) + getMetadata().f49524g.f49531a;
    }

    public final boolean d(View view) {
        e6 e6Var = (e6) this.f28320a.get(view);
        if (e6Var != null && e6Var.f27933b) {
            return true;
        }
        return false;
    }

    public abstract void e();

    public void f(View view, float f9) {
        float lerp = AndroidUtilities.lerp(0.95f, 1.0f, f9);
        view.setAlpha(f9);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
    }

    public final void g(View view) {
        e6 e6Var = (e6) this.f28320a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f28322c.f49526b.size();
    }

    public vd.h getMetadata() {
        return this.f28322c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f28324f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f28323e;
    }

    public final void h(int i10, View view) {
        e6 e6Var = (e6) this.f28320a.get(view);
        if (e6Var != null) {
            e6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        e6 e6Var;
        if (view != null && (e6Var = (e6) this.f28320a.get(view)) != null) {
            View view2 = e6Var.f27932a;
            if (e6Var.f27933b != z10) {
                e6Var.f27933b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !e6Var.f27934c) {
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
        ArrayList arrayList = this.f28321b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            e6 e6Var = (e6) this.f28320a.get(childAt);
            if (e6Var != null) {
                e6Var.f27935e = i14;
                if (childAt.getVisibility() == 0 && e6Var.f27933b) {
                    arrayList.add(e6Var);
                }
            }
        }
        Collections.sort(arrayList, f28319r);
        this.f28322c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((e6) obj).f27934c = true;
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
        this.f28320a.put(view, new e6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f28320a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
