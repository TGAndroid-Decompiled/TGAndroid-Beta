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
public abstract class b6 extends LinearLayout {
    public static final Comparator f23557r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new kf.d(14)), new kf.d(15));
    public final HashMap f23558a;
    public final ArrayList f23559b;
    public final xd.h f23560c;
    public boolean d;
    public int e;
    public int f23561f;
    public Runnable h;
    public float f23562n;

    public b6(Context context) {
        super(context);
        this.f23558a = new HashMap();
        this.f23559b = new ArrayList();
        this.f23560c = new xd.h(new t(this, 11), mr.h, 420L);
    }

    public final void a() {
        this.f23561f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a6 a6Var = (a6) this.f23558a.get(childAt);
            if (childAt.getVisibility() == 0 && a6Var != null && a6Var.f23324b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f23561f = childAt.getMeasuredHeight() + this.f23561f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f23560c.f46977b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            xd.e eVar = (xd.e) obj;
            View view = ((a6) eVar.f46967a).f23323a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f46975g.f46981a;
        if (this.f23562n != f10) {
            this.f23562n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f46973c.f46981a) + getMetadata().f46975g.f46981a;
    }

    public final boolean d(View view) {
        a6 a6Var = (a6) this.f23558a.get(view);
        if (a6Var != null && a6Var.f23324b) {
            return true;
        }
        return false;
    }

    public abstract void e();

    public void f(View view, float f10) {
        float lerp = AndroidUtilities.lerp(0.95f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
    }

    public final void g(View view) {
        a6 a6Var = (a6) this.f23558a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f23560c.f46977b.size();
    }

    public xd.g getMetadata() {
        return this.f23560c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f23561f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        a6 a6Var = (a6) this.f23558a.get(view);
        if (a6Var != null) {
            a6Var.d = i10;
        }
    }

    public final void i(View view, boolean z4, boolean z10) {
        a6 a6Var;
        if (view != null && (a6Var = (a6) this.f23558a.get(view)) != null) {
            View view2 = a6Var.f23323a;
            if (a6Var.f23324b != z4) {
                a6Var.f23324b = z4;
                if (z4) {
                    view2.setVisibility(0);
                }
                if (!z4 && !a6Var.f23325c) {
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ArrayList arrayList = this.f23559b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a6 a6Var = (a6) this.f23558a.get(childAt);
            if (a6Var != null) {
                a6Var.e = i14;
                if (childAt.getVisibility() == 0 && a6Var.f23324b) {
                    arrayList.add(a6Var);
                }
            }
        }
        Collections.sort(arrayList, f23557r);
        this.f23560c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((a6) obj).f23325c = true;
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
        this.f23558a.put(view, new a6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f23558a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
