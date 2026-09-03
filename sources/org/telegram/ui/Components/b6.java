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
    public static final Comparator f25514r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new lf.d(14)), new lf.d(15));
    public final HashMap f25515a;
    public final ArrayList f25516b;
    public final xd.h f25517c;
    public boolean d;
    public int f25518e;
    public int f25519f;
    public Runnable h;
    public float f25520n;

    public b6(Context context) {
        super(context);
        this.f25515a = new HashMap();
        this.f25516b = new ArrayList();
        this.f25517c = new xd.h(new t(this, 11), pr.h, 420L);
    }

    public final void a() {
        this.f25519f = 0;
        this.f25518e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a6 a6Var = (a6) this.f25515a.get(childAt);
            if (childAt.getVisibility() == 0 && a6Var != null && a6Var.f25166b) {
                this.f25518e = childAt.getMeasuredWidth() + this.f25518e;
                this.f25519f = childAt.getMeasuredHeight() + this.f25519f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f25517c.f50561b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            xd.e eVar = (xd.e) obj;
            View view = ((a6) eVar.f50549a).f25165a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f50559g.f50566a;
        if (this.f25520n != f10) {
            this.f25520n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f50556c.f50566a) + getMetadata().f50559g.f50566a;
    }

    public final boolean d(View view) {
        a6 a6Var = (a6) this.f25515a.get(view);
        if (a6Var != null && a6Var.f25166b) {
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
        a6 a6Var = (a6) this.f25515a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f25517c.f50561b.size();
    }

    public xd.g getMetadata() {
        return this.f25517c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f25519f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f25518e;
    }

    public final void h(int i10, View view) {
        a6 a6Var = (a6) this.f25515a.get(view);
        if (a6Var != null) {
            a6Var.d = i10;
        }
    }

    public final void i(View view, boolean z4, boolean z10) {
        a6 a6Var;
        if (view != null && (a6Var = (a6) this.f25515a.get(view)) != null) {
            View view2 = a6Var.f25165a;
            if (a6Var.f25166b != z4) {
                a6Var.f25166b = z4;
                if (z4) {
                    view2.setVisibility(0);
                }
                if (!z4 && !a6Var.f25167c) {
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
        ArrayList arrayList = this.f25516b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a6 a6Var = (a6) this.f25515a.get(childAt);
            if (a6Var != null) {
                a6Var.f25168e = i14;
                if (childAt.getVisibility() == 0 && a6Var.f25166b) {
                    arrayList.add(a6Var);
                }
            }
        }
        Collections.sort(arrayList, f25514r);
        this.f25517c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((a6) obj).f25167c = true;
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
        this.f25515a.put(view, new a6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f25515a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
