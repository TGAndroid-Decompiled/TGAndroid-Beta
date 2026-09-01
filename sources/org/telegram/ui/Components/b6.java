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
    public static final Comparator f25496r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new lf.d(14)), new lf.d(15));
    public final HashMap f25497a;
    public final ArrayList f25498b;
    public final xd.h f25499c;
    public boolean d;
    public int f25500e;
    public int f25501f;
    public Runnable h;
    public float f25502n;

    public b6(Context context) {
        super(context);
        this.f25497a = new HashMap();
        this.f25498b = new ArrayList();
        this.f25499c = new xd.h(new t(this, 11), pr.h, 420L);
    }

    public final void a() {
        this.f25501f = 0;
        this.f25500e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a6 a6Var = (a6) this.f25497a.get(childAt);
            if (childAt.getVisibility() == 0 && a6Var != null && a6Var.f25165b) {
                this.f25500e = childAt.getMeasuredWidth() + this.f25500e;
                this.f25501f = childAt.getMeasuredHeight() + this.f25501f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f25499c.f50525b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            xd.e eVar = (xd.e) obj;
            View view = ((a6) eVar.f50513a).f25164a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f50523g.f50530a;
        if (this.f25502n != f10) {
            this.f25502n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f50520c.f50530a) + getMetadata().f50523g.f50530a;
    }

    public final boolean d(View view) {
        a6 a6Var = (a6) this.f25497a.get(view);
        if (a6Var != null && a6Var.f25165b) {
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
        a6 a6Var = (a6) this.f25497a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f25499c.f50525b.size();
    }

    public xd.g getMetadata() {
        return this.f25499c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f25501f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f25500e;
    }

    public final void h(int i10, View view) {
        a6 a6Var = (a6) this.f25497a.get(view);
        if (a6Var != null) {
            a6Var.d = i10;
        }
    }

    public final void i(View view, boolean z4, boolean z10) {
        a6 a6Var;
        if (view != null && (a6Var = (a6) this.f25497a.get(view)) != null) {
            View view2 = a6Var.f25164a;
            if (a6Var.f25165b != z4) {
                a6Var.f25165b = z4;
                if (z4) {
                    view2.setVisibility(0);
                }
                if (!z4 && !a6Var.f25166c) {
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
        ArrayList arrayList = this.f25498b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a6 a6Var = (a6) this.f25497a.get(childAt);
            if (a6Var != null) {
                a6Var.f25167e = i14;
                if (childAt.getVisibility() == 0 && a6Var.f25165b) {
                    arrayList.add(a6Var);
                }
            }
        }
        Collections.sort(arrayList, f25496r);
        this.f25499c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((a6) obj).f25166c = true;
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
        this.f25497a.put(view, new a6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f25497a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
