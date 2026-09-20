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
    public static final Comparator f24008r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.f7(8)), new ai.f7(9));
    public final HashMap f24009a;
    public final ArrayList f24010b;
    public final le.j f24011c;
    public boolean d;
    public int e;
    public int f24012f;
    public Runnable h;
    public float f24013n;

    public f6(Context context) {
        super(context);
        this.f24009a = new HashMap();
        this.f24010b = new ArrayList();
        this.f24011c = new le.j(new s(this, 11), qr.h, 420L);
    }

    public final void a() {
        this.f24012f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e6 e6Var = (e6) this.f24009a.get(childAt);
            if (childAt.getVisibility() == 0 && e6Var != null && e6Var.f23745b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f24012f = childAt.getMeasuredHeight() + this.f24012f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f24011c.f14189b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            le.g gVar = (le.g) obj;
            View view = ((e6) gVar.f14179a).f23744a;
            RectF b10 = gVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, gVar.c());
        }
        float f7 = getMetadata().f14187g.f14193a;
        if (this.f24013n != f7) {
            this.f24013n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f14185c.f14193a) + getMetadata().f14187g.f14193a;
    }

    public final boolean d(View view) {
        e6 e6Var = (e6) this.f24009a.get(view);
        if (e6Var != null && e6Var.f23745b) {
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
        e6 e6Var = (e6) this.f24009a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f24011c.f14189b.size();
    }

    public le.i getMetadata() {
        return this.f24011c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f24012f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        e6 e6Var = (e6) this.f24009a.get(view);
        if (e6Var != null) {
            e6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        e6 e6Var;
        if (view != null && (e6Var = (e6) this.f24009a.get(view)) != null) {
            View view2 = e6Var.f23744a;
            if (e6Var.f23745b != z10) {
                e6Var.f23745b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !e6Var.f23746c) {
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
        ArrayList arrayList = this.f24010b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            e6 e6Var = (e6) this.f24009a.get(childAt);
            if (e6Var != null) {
                e6Var.e = i14;
                if (childAt.getVisibility() == 0 && e6Var.f23745b) {
                    arrayList.add(e6Var);
                }
            }
        }
        Collections.sort(arrayList, f24008r);
        this.f24011c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((e6) obj).f23746c = true;
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
        this.f24009a.put(view, new e6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f24009a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
