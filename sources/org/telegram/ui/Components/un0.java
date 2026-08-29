package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public class un0 extends ScrollView {
    public final org.telegram.ui.ActionBar.c6 f33277a;
    public final LinearLayout f33278b;
    public final float f33279c;
    public final float[] d;
    public final float[] f33280e;
    public final ArrayList f33281f;
    public final ArrayList h;
    public final Path f33282n;

    public un0(Context context, LinearLayout linearLayout, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        float f9;
        this.f33279c = AndroidUtilities.dp(16.0f);
        this.f33281f = new ArrayList();
        this.h = new ArrayList();
        this.f33282n = new Path();
        this.f33277a = c6Var;
        this.f33278b = linearLayout;
        setWillNotDraw(false);
        int dp = AndroidUtilities.dp(12.0f);
        if (z10) {
            f9 = 12.0f;
        } else {
            f9 = 4.0f;
        }
        linearLayout.setPadding(dp, AndroidUtilities.dp(f9), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.d = new float[]{AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0.0f, 0.0f, 0.0f, 0.0f};
        this.f33280e = new float[]{0.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f)};
    }

    public static boolean e(View view) {
        if (!Objects.equals(view.getTag(), -33024) && !(view instanceof org.telegram.ui.Cells.y8) && !(view instanceof org.telegram.ui.Cells.x6) && !(view instanceof org.telegram.ui.k10)) {
            return true;
        }
        return false;
    }

    public final void a(Canvas canvas, View view, View view2) {
        float f9;
        if (view != null && view2 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewParent parent = view.getParent();
            float f10 = 0.0f;
            LinearLayout linearLayout = this.f33278b;
            if (parent != linearLayout && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                f9 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            } else {
                f9 = 0.0f;
            }
            if (view2.getParent() != linearLayout && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                f10 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(c(view) + linearLayout.getX(), Math.max(getScrollY() - AndroidUtilities.dp(16.0f), (d(view) + linearLayout.getY()) - f9), c(view) + linearLayout.getX() + view.getWidth(), Math.min(getScrollY() + AndroidUtilities.dp(16.0f) + getHeight(), d(view2) + linearLayout.getY() + view2.getHeight() + f10));
            if (rectF.bottom >= rectF.top) {
                jl0.N0(canvas, rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), view.getAlpha(), this.f33277a);
            }
        }
    }

    public final void b(ViewGroup viewGroup, float f9, float f10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1) {
                        LinearLayout linearLayout2 = this.f33278b;
                        if (childAt.getX() + f9 <= linearLayout2.getPaddingLeft() && childAt.getX() + f9 + childAt.getWidth() >= linearLayout2.getWidth() - linearLayout2.getPaddingRight()) {
                            b(linearLayout, childAt.getX() + f9, childAt.getY() + f10);
                        }
                    }
                }
                this.h.add(childAt);
            }
        }
    }

    public final float c(View view) {
        if (view != this.f33278b && (view.getParent() instanceof View)) {
            return view.getX() + c((View) view.getParent());
        }
        return view.getX();
    }

    public final float d(View view) {
        if (view != this.f33278b && (view.getParent() instanceof View)) {
            return view.getY() + d((View) view.getParent());
        }
        return view.getY();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.h;
        arrayList.clear();
        b(this.f33278b, 0.0f, 0.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            View view = null;
            View view2 = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                View view3 = (View) obj;
                if (!e(view3)) {
                    break;
                }
                if (view != null && Math.abs(view2.getAlpha() - view3.getAlpha()) > 0.1f) {
                    a(canvas, view, view2);
                    view = null;
                }
                if (view == null) {
                    view = view3;
                }
                view2 = view3;
            }
            a(canvas, view, view2);
            super.dispatchDraw(canvas);
            return;
            a(canvas, view, view2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ArrayList arrayList = this.f33281f;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.f33278b.invalidate();
    }
}
