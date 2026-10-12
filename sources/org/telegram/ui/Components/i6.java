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
public abstract class i6 extends LinearLayout {
    public static final Comparator f25851r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bi.s6(8)), new bi.s6(9));
    public final HashMap f25852a;
    public final ArrayList f25853b;
    public final ne.j f25854c;
    public boolean d;
    public int e;
    public int f25855f;
    public Runnable h;
    public float f25856n;

    public i6(Context context) {
        super(context);
        this.f25852a = new HashMap();
        this.f25853b = new ArrayList();
        this.f25854c = new ne.j(new s(this, 11), es.h, 420L);
    }

    public final void a() {
        this.f25855f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            h6 h6Var = (h6) this.f25852a.get(childAt);
            if (childAt.getVisibility() == 0 && h6Var != null && h6Var.f25514b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f25855f = childAt.getMeasuredHeight() + this.f25855f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f25854c.f16312b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ne.g gVar = (ne.g) obj;
            View view = ((h6) gVar.f16302a).f25513a;
            RectF b10 = gVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, gVar.c());
        }
        float f7 = getMetadata().f16310g.f16316a;
        if (this.f25856n != f7) {
            this.f25856n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f16308c.f16316a) + getMetadata().f16310g.f16316a;
    }

    public final boolean d(View view) {
        h6 h6Var = (h6) this.f25852a.get(view);
        if (h6Var != null && h6Var.f25514b) {
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
        h6 h6Var = (h6) this.f25852a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f25854c.f16312b.size();
    }

    public ne.i getMetadata() {
        return this.f25854c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f25855f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        h6 h6Var = (h6) this.f25852a.get(view);
        if (h6Var != null) {
            h6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        h6 h6Var;
        if (view != null && (h6Var = (h6) this.f25852a.get(view)) != null) {
            View view2 = h6Var.f25513a;
            if (h6Var.f25514b != z10) {
                h6Var.f25514b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !h6Var.f25515c) {
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
        ArrayList arrayList = this.f25853b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            h6 h6Var = (h6) this.f25852a.get(childAt);
            if (h6Var != null) {
                h6Var.e = i14;
                if (childAt.getVisibility() == 0 && h6Var.f25514b) {
                    arrayList.add(h6Var);
                }
            }
        }
        Collections.sort(arrayList, f25851r);
        this.f25854c.q(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((h6) obj).f25515c = true;
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
        this.f25852a.put(view, new h6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f25852a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
