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
    public static final Comparator f24427r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.g7(8)), new ai.g7(9));
    public final HashMap f24428a;
    public final ArrayList f24429b;
    public final le.k f24430c;
    public boolean d;
    public int e;
    public int f24431f;
    public Runnable h;
    public float f24432n;

    public g6(Context context) {
        super(context);
        this.f24428a = new HashMap();
        this.f24429b = new ArrayList();
        this.f24430c = new le.k(new s(this, 11), tr.h, 420L);
    }

    public final void a() {
        this.f24431f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f6 f6Var = (f6) this.f24428a.get(childAt);
            if (childAt.getVisibility() == 0 && f6Var != null && f6Var.f24178b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f24431f = childAt.getMeasuredHeight() + this.f24431f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f24430c.f14236b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            le.h hVar = (le.h) obj;
            View view = ((f6) hVar.f14226a).f24177a;
            RectF b10 = hVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, hVar.c());
        }
        float f7 = getMetadata().f14234g.f14240a;
        if (this.f24432n != f7) {
            this.f24432n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f14232c.f14240a) + getMetadata().f14234g.f14240a;
    }

    public final boolean d(View view) {
        f6 f6Var = (f6) this.f24428a.get(view);
        if (f6Var != null && f6Var.f24178b) {
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
        f6 f6Var = (f6) this.f24428a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f24430c.f14236b.size();
    }

    public le.j getMetadata() {
        return this.f24430c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f24431f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        f6 f6Var = (f6) this.f24428a.get(view);
        if (f6Var != null) {
            f6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        f6 f6Var;
        if (view != null && (f6Var = (f6) this.f24428a.get(view)) != null) {
            View view2 = f6Var.f24177a;
            if (f6Var.f24178b != z10) {
                f6Var.f24178b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !f6Var.f24179c) {
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
        ArrayList arrayList = this.f24429b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            f6 f6Var = (f6) this.f24428a.get(childAt);
            if (f6Var != null) {
                f6Var.e = i14;
                if (childAt.getVisibility() == 0 && f6Var.f24178b) {
                    arrayList.add(f6Var);
                }
            }
        }
        Collections.sort(arrayList, f24427r);
        this.f24430c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((f6) obj).f24179c = true;
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
        this.f24428a.put(view, new f6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f24428a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
