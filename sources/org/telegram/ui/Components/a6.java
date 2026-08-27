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

    public static final Comparator f26635r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new gf.d(14)), new gf.d(15));

    public final HashMap f26636a;

    public final ArrayList f26637b;

    public final ud.h f26638c;
    public boolean d;

    public int f26639e;

    public int f26640f;
    public Runnable h;

    public float f26641n;

    public a6(Context context) {
        super(context);
        this.f26636a = new HashMap();
        this.f26637b = new ArrayList();
        this.f26638c = new ud.h(new s(this, 11), er.h, 420L);
    }

    public final void a() {
        this.f26640f = 0;
        this.f26639e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            z5 z5Var = (z5) this.f26636a.get(childAt);
            if (childAt.getVisibility() == 0 && z5Var != null && z5Var.f35152b) {
                this.f26639e = childAt.getMeasuredWidth() + this.f26639e;
                this.f26640f = childAt.getMeasuredHeight() + this.f26640f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f26638c.f48517b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ud.e eVar = (ud.e) obj;
            View view = ((z5) eVar.f48505a).f35151a;
            RectF rectFB = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + rectFB.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + rectFB.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().f48515g.f48522a;
        if (this.f26641n != f10) {
            this.f26641n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().f48512c.f48522a) + getMetadata().f48515g.f48522a;
    }

    public final boolean d(View view) {
        z5 z5Var = (z5) this.f26636a.get(view);
        return z5Var != null && z5Var.f35152b;
    }

    public abstract void e();

    public void f(View view, float f10) {
        float fLerp = AndroidUtilities.lerp(0.95f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(fLerp);
        view.setScaleY(fLerp);
    }

    public final void g(View view) {
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f26638c.f48517b.size();
    }

    public ud.g getMetadata() {
        return this.f26638c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f26640f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f26639e;
    }

    public final void h(int i10, View view) {
        z5 z5Var = (z5) this.f26636a.get(view);
        if (z5Var != null) {
            z5Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        z5 z5Var;
        if (view == null || (z5Var = (z5) this.f26636a.get(view)) == null) {
            return;
        }
        View view2 = z5Var.f35151a;
        if (z5Var.f35152b != z10) {
            z5Var.f35152b = z10;
            if (z10) {
                view2.setVisibility(0);
            }
            if (!z10 && !z5Var.f35153c) {
                view2.setVisibility(8);
            }
            if (!z11) {
                this.d = true;
            }
            requestLayout();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ArrayList arrayList = this.f26637b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            z5 z5Var = (z5) this.f26636a.get(childAt);
            if (z5Var != null) {
                z5Var.f35154e = i14;
                if (childAt.getVisibility() == 0 && z5Var.f35152b) {
                    arrayList.add(z5Var);
                }
            }
        }
        Collections.sort(arrayList, f26635r);
        this.f26638c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((z5) obj).f35153c = true;
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
        this.f26636a.put(view, new z5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f26636a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
