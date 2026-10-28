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
public abstract class j6 extends LinearLayout {
    public static final Comparator f29520r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ag.e(15)), new ag.e(16));
    public final HashMap f29521a;
    public final ArrayList f29522b;
    public final oe.j f29523c;
    public boolean d;
    public int e;
    public int f29524f;
    public Runnable h;
    public float f29525n;

    public j6(Context context) {
        super(context);
        this.f29521a = new HashMap();
        this.f29522b = new ArrayList();
        this.f29523c = new oe.j(new s(this, 11), ds.h, 420L);
    }

    public final void a() {
        this.f29524f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            i6 i6Var = (i6) this.f29521a.get(childAt);
            if (childAt.getVisibility() == 0 && i6Var != null && i6Var.f29224b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f29524f = childAt.getMeasuredHeight() + this.f29524f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f29523c.f19346b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            oe.g gVar = (oe.g) obj;
            View view = ((i6) gVar.f19336a).f29223a;
            RectF b10 = gVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, gVar.c());
        }
        float f7 = getMetadata().f19344g.f19350a;
        if (this.f29525n != f7) {
            this.f29525n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f19342c.f19350a) + getMetadata().f19344g.f19350a;
    }

    public final boolean d(View view) {
        i6 i6Var = (i6) this.f29521a.get(view);
        if (i6Var != null && i6Var.f29224b) {
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
        i6 i6Var = (i6) this.f29521a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f29523c.f19346b.size();
    }

    public oe.i getMetadata() {
        return this.f29523c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f29524f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        i6 i6Var = (i6) this.f29521a.get(view);
        if (i6Var != null) {
            i6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        i6 i6Var;
        if (view != null && (i6Var = (i6) this.f29521a.get(view)) != null) {
            View view2 = i6Var.f29223a;
            if (i6Var.f29224b != z10) {
                i6Var.f29224b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !i6Var.f29225c) {
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
        ArrayList arrayList = this.f29522b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            i6 i6Var = (i6) this.f29521a.get(childAt);
            if (i6Var != null) {
                i6Var.e = i14;
                if (childAt.getVisibility() == 0 && i6Var.f29224b) {
                    arrayList.add(i6Var);
                }
            }
        }
        Collections.sort(arrayList, f29520r);
        this.f29523c.q(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((i6) obj).f29225c = true;
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
        this.f29521a.put(view, new i6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f29521a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
