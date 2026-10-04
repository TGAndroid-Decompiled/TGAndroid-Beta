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
    public static final Comparator f26655r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.g7(8)), new ai.g7(9));
    public final HashMap f26656a;
    public final ArrayList f26657b;
    public final le.j f26658c;
    public boolean d;
    public int f26659e;
    public int f26660f;
    public Runnable h;
    public float f26661n;

    public g6(Context context) {
        super(context);
        this.f26656a = new HashMap();
        this.f26657b = new ArrayList();
        this.f26658c = new le.j(new s(this, 11), tr.h, 420L);
    }

    public final void a() {
        this.f26660f = 0;
        this.f26659e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f6 f6Var = (f6) this.f26656a.get(childAt);
            if (childAt.getVisibility() == 0 && f6Var != null && f6Var.f26291b) {
                this.f26659e = childAt.getMeasuredWidth() + this.f26659e;
                this.f26660f = childAt.getMeasuredHeight() + this.f26660f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f26658c.f15458b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            le.g gVar = (le.g) obj;
            View view = ((f6) gVar.f15446a).f26290a;
            RectF b10 = gVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, gVar.c());
        }
        float f7 = getMetadata().f15456g.f15463a;
        if (this.f26661n != f7) {
            this.f26661n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f15453c.f15463a) + getMetadata().f15456g.f15463a;
    }

    public final boolean d(View view) {
        f6 f6Var = (f6) this.f26656a.get(view);
        if (f6Var != null && f6Var.f26291b) {
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
        f6 f6Var = (f6) this.f26656a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f26658c.f15458b.size();
    }

    public le.i getMetadata() {
        return this.f26658c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f26660f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f26659e;
    }

    public final void h(int i10, View view) {
        f6 f6Var = (f6) this.f26656a.get(view);
        if (f6Var != null) {
            f6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        f6 f6Var;
        if (view != null && (f6Var = (f6) this.f26656a.get(view)) != null) {
            View view2 = f6Var.f26290a;
            if (f6Var.f26291b != z10) {
                f6Var.f26291b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !f6Var.f26292c) {
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
        ArrayList arrayList = this.f26657b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            f6 f6Var = (f6) this.f26656a.get(childAt);
            if (f6Var != null) {
                f6Var.f26293e = i14;
                if (childAt.getVisibility() == 0 && f6Var.f26291b) {
                    arrayList.add(f6Var);
                }
            }
        }
        Collections.sort(arrayList, f26655r);
        this.f26658c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((f6) obj).f26292c = true;
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
        this.f26656a.put(view, new f6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f26656a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
