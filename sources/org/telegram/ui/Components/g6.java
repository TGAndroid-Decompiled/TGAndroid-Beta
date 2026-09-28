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
    public static final Comparator f24433r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.g7(8)), new ai.g7(9));
    public final HashMap f24434a;
    public final ArrayList f24435b;
    public final le.k f24436c;
    public boolean d;
    public int e;
    public int f24437f;
    public Runnable h;
    public float f24438n;

    public g6(Context context) {
        super(context);
        this.f24434a = new HashMap();
        this.f24435b = new ArrayList();
        this.f24436c = new le.k(new s(this, 11), sr.h, 420L);
    }

    public final void a() {
        this.f24437f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f6 f6Var = (f6) this.f24434a.get(childAt);
            if (childAt.getVisibility() == 0 && f6Var != null && f6Var.f24138b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f24437f = childAt.getMeasuredHeight() + this.f24437f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f24436c.f14221b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            le.h hVar = (le.h) obj;
            View view = ((f6) hVar.f14211a).f24137a;
            RectF b10 = hVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, hVar.c());
        }
        float f7 = getMetadata().f14219g.f14225a;
        if (this.f24438n != f7) {
            this.f24438n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f14217c.f14225a) + getMetadata().f14219g.f14225a;
    }

    public final boolean d(View view) {
        f6 f6Var = (f6) this.f24434a.get(view);
        if (f6Var != null && f6Var.f24138b) {
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
        f6 f6Var = (f6) this.f24434a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f24436c.f14221b.size();
    }

    public le.j getMetadata() {
        return this.f24436c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f24437f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        f6 f6Var = (f6) this.f24434a.get(view);
        if (f6Var != null) {
            f6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        f6 f6Var;
        if (view != null && (f6Var = (f6) this.f24434a.get(view)) != null) {
            View view2 = f6Var.f24137a;
            if (f6Var.f24138b != z10) {
                f6Var.f24138b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !f6Var.f24139c) {
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
        ArrayList arrayList = this.f24435b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            f6 f6Var = (f6) this.f24434a.get(childAt);
            if (f6Var != null) {
                f6Var.e = i14;
                if (childAt.getVisibility() == 0 && f6Var.f24138b) {
                    arrayList.add(f6Var);
                }
            }
        }
        Collections.sort(arrayList, f24433r);
        this.f24436c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((f6) obj).f24139c = true;
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
        this.f24434a.put(view, new f6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f24434a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
