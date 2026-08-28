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
public abstract class a6 extends LinearLayout {
    public static final Comparator f26669r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ff.d(14)), new ff.d(15));
    public final HashMap f26670a;
    public final ArrayList f26671b;
    public final td.h f26672c;
    public boolean d;
    public int f26673e;
    public int f26674f;
    public Runnable h;
    public float f26675n;

    public a6(Context context) {
        super(context);
        this.f26670a = new HashMap();
        this.f26671b = new ArrayList();
        this.f26672c = new td.h(new s(this, 11), gr.h, 420L);
    }

    public final void a() {
        this.f26674f = 0;
        this.f26673e = 0;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            z5 z5Var = (z5) this.f26670a.get(childAt);
            if (childAt.getVisibility() == 0 && z5Var != null && z5Var.f35194b) {
                this.f26673e = childAt.getMeasuredWidth() + this.f26673e;
                this.f26674f = childAt.getMeasuredHeight() + this.f26674f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f26672c.f47795b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            td.e eVar = (td.e) obj;
            View view = ((z5) eVar.f47783a).f35193a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f47793g.f47800a;
        if (this.f26675n != f10) {
            this.f26675n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f47790c.f47800a) + getMetadata().f47793g.f47800a;
    }

    public final boolean d(View view) {
        z5 z5Var = (z5) this.f26670a.get(view);
        if (z5Var != null && z5Var.f35194b) {
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
        z5 z5Var = (z5) this.f26670a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f26672c.f47795b.size();
    }

    public td.g getMetadata() {
        return this.f26672c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f26674f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f26673e;
    }

    public final void h(int i9, View view) {
        z5 z5Var = (z5) this.f26670a.get(view);
        if (z5Var != null) {
            z5Var.d = i9;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        z5 z5Var;
        if (view != null && (z5Var = (z5) this.f26670a.get(view)) != null) {
            View view2 = z5Var.f35193a;
            if (z5Var.f35194b != z10) {
                z5Var.f35194b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !z5Var.f35195c) {
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ArrayList arrayList = this.f26671b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            z5 z5Var = (z5) this.f26670a.get(childAt);
            if (z5Var != null) {
                z5Var.f35196e = i13;
                if (childAt.getVisibility() == 0 && z5Var.f35194b) {
                    arrayList.add(z5Var);
                }
            }
        }
        Collections.sort(arrayList, f26669r);
        this.f26672c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((z5) obj).f35195c = true;
        }
        this.d = false;
        b();
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        a();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.f26670a.put(view, new z5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f26670a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
