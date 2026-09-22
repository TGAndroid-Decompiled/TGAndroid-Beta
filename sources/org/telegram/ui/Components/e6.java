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
public abstract class e6 extends LinearLayout {
    public static final Comparator f23549r = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ai.f7(8)), new ai.f7(9));
    public final HashMap f23550a;
    public final ArrayList f23551b;
    public final le.j f23552c;
    public boolean d;
    public int e;
    public int f23553f;
    public Runnable h;
    public float f23554n;

    public e6(Context context) {
        super(context);
        this.f23550a = new HashMap();
        this.f23551b = new ArrayList();
        this.f23552c = new le.j(new s(this, 11), qr.h, 420L);
    }

    public final void a() {
        this.f23553f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            d6 d6Var = (d6) this.f23550a.get(childAt);
            if (childAt.getVisibility() == 0 && d6Var != null && d6Var.f23226b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f23553f = childAt.getMeasuredHeight() + this.f23553f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f23552c.f13992b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            le.g gVar = (le.g) obj;
            View view = ((d6) gVar.f13982a).f23225a;
            RectF b10 = gVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, gVar.c());
        }
        float f7 = getMetadata().f13990g.f13996a;
        if (this.f23554n != f7) {
            this.f23554n = f7;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f7) {
        return (f7 * getMetadata().f13988c.f13996a) + getMetadata().f13990g.f13996a;
    }

    public final boolean d(View view) {
        d6 d6Var = (d6) this.f23550a.get(view);
        if (d6Var != null && d6Var.f23226b) {
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
        d6 d6Var = (d6) this.f23550a.get(view);
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.f23552c.f13992b.size();
    }

    public le.i getMetadata() {
        return this.f23552c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f23553f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        d6 d6Var = (d6) this.f23550a.get(view);
        if (d6Var != null) {
            d6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        d6 d6Var;
        if (view != null && (d6Var = (d6) this.f23550a.get(view)) != null) {
            View view2 = d6Var.f23225a;
            if (d6Var.f23226b != z10) {
                d6Var.f23226b = z10;
                if (z10) {
                    view2.setVisibility(0);
                }
                if (!z10 && !d6Var.f23227c) {
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
        ArrayList arrayList = this.f23551b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            d6 d6Var = (d6) this.f23550a.get(childAt);
            if (d6Var != null) {
                d6Var.e = i14;
                if (childAt.getVisibility() == 0 && d6Var.f23226b) {
                    arrayList.add(d6Var);
                }
            }
        }
        Collections.sort(arrayList, f23549r);
        this.f23552c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((d6) obj).f23227c = true;
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
        this.f23550a.put(view, new d6(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f23550a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
