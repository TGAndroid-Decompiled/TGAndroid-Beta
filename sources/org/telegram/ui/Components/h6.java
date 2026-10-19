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
public abstract class h6 extends LinearLayout {
    public static final Comparator f26781r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.v8(14)), new ai.v8(15));
    public final HashMap f26782a;
    public final ArrayList f26783b;
    public final ne.j f26784c;
    public boolean d;
    public int e;
    public int f26785f;
    public Runnable h;
    public float f26786n;

    public h6(Context context) {
        super(context);
        this.f26782a = new HashMap();
        this.f26783b = new ArrayList();
        this.f26784c = new ne.j(new s(this, 11), bs.h, 420L);
    }

    public final void a() {
        this.f26785f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            g6 g6Var = (g6) this.f26782a.get(childAt);
            if (childAt.getVisibility() == 0 && g6Var != null && g6Var.f26487b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f26785f = childAt.getMeasuredHeight() + this.f26785f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f26784c.f17403b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ne.g gVar = (ne.g) obj;
            View view = ((g6) gVar.f17393a).f26486a;
            RectF b10 = gVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, gVar.c());
        }
        float f7 = getMetadata().f17401g.f17407a;
        if (this.f26786n != f7) {
            this.f26786n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f17399c.f17407a) + getMetadata().f17401g.f17407a;
    }

    public final boolean d(View view) {
        g6 g6Var = (g6) this.f26782a.get(view);
        if (g6Var != null && g6Var.f26487b) {
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
        g6 g6Var = (g6) this.f26782a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f26784c.f17403b.size();
    }

    public ne.i getMetadata() {
        return this.f26784c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f26785f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        g6 g6Var = (g6) this.f26782a.get(view);
        if (g6Var != null) {
            g6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        g6 g6Var;
        if (view != null && (g6Var = (g6) this.f26782a.get(view)) != null) {
            View view2 = g6Var.f26486a;
            if (g6Var.f26487b != z10) {
                g6Var.f26487b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !g6Var.f26488c) {
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
        ArrayList arrayList = this.f26783b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            g6 g6Var = (g6) this.f26782a.get(childAt);
            if (g6Var != null) {
                g6Var.e = i14;
                if (childAt.getVisibility() == 0 && g6Var.f26487b) {
                    arrayList.add(g6Var);
                }
            }
        }
        Collections.sort(arrayList, f26781r);
        this.f26784c.q(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((g6) obj).f26488c = true;
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
        this.f26782a.put(view, new g6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f26782a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
