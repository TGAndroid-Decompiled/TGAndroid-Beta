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
    public static final Comparator f27188r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.h7(9)), new ai.h7(10));
    public final HashMap f27189a;
    public final ArrayList f27190b;
    public final me.j f27191c;
    public boolean d;
    public int f27192e;
    public int f27193f;
    public Runnable h;
    public float f27194n;

    public i6(Context context) {
        super(context);
        this.f27189a = new HashMap();
        this.f27190b = new ArrayList();
        this.f27191c = new me.j(new s(this, 11), is.h, 420L);
    }

    public final void a() {
        this.f27193f = 0;
        this.f27192e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            h6 h6Var = (h6) this.f27189a.get(childAt);
            if (childAt.getVisibility() == 0 && h6Var != null && h6Var.f26912b) {
                this.f27192e = childAt.getMeasuredWidth() + this.f27192e;
                this.f27193f = childAt.getMeasuredHeight() + this.f27193f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f27191c.f16388b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            me.g gVar = (me.g) obj;
            View view = ((h6) gVar.f16376a).f26911a;
            RectF b10 = gVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, gVar.c());
        }
        float f7 = getMetadata().f16386g.f16393a;
        if (this.f27194n != f7) {
            this.f27194n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f16383c.f16393a) + getMetadata().f16386g.f16393a;
    }

    public final boolean d(View view) {
        h6 h6Var = (h6) this.f27189a.get(view);
        if (h6Var != null && h6Var.f26912b) {
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
        h6 h6Var = (h6) this.f27189a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f27191c.f16388b.size();
    }

    public me.i getMetadata() {
        return this.f27191c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f27193f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.f27192e;
    }

    public final void h(int i10, View view) {
        h6 h6Var = (h6) this.f27189a.get(view);
        if (h6Var != null) {
            h6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        h6 h6Var;
        if (view != null && (h6Var = (h6) this.f27189a.get(view)) != null) {
            View view2 = h6Var.f26911a;
            if (h6Var.f26912b != z10) {
                h6Var.f26912b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !h6Var.f26913c) {
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
        ArrayList arrayList = this.f27190b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            h6 h6Var = (h6) this.f27189a.get(childAt);
            if (h6Var != null) {
                h6Var.f26914e = i14;
                if (childAt.getVisibility() == 0 && h6Var.f26912b) {
                    arrayList.add(h6Var);
                }
            }
        }
        Collections.sort(arrayList, f27188r);
        this.f27191c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((h6) obj).f26913c = true;
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
        this.f27189a.put(view, new h6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f27189a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
