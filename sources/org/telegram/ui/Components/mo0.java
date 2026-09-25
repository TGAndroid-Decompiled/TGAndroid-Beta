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
public class mo0 extends ScrollView {
    public final org.telegram.ui.ActionBar.d6 f26560a;
    public final LinearLayout f26561b;
    public final float f26562c;
    public final float[] d;
    public final float[] e;
    public final ArrayList f26563f;
    public final ArrayList h;
    public final Path f26564n;

    public mo0(Context context, LinearLayout linearLayout, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        float f7;
        this.f26562c = AndroidUtilities.dp(16.0f);
        this.f26563f = new ArrayList();
        this.h = new ArrayList();
        this.f26564n = new Path();
        this.f26560a = d6Var;
        this.f26561b = linearLayout;
        setWillNotDraw(false);
        int dp = AndroidUtilities.dp(12.0f);
        if (z10) {
            f7 = 12.0f;
        } else {
            f7 = 4.0f;
        }
        linearLayout.setPadding(dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.d = new float[]{AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0.0f, 0.0f, 0.0f, 0.0f};
        this.e = new float[]{0.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f)};
    }

    public static boolean e(View view) {
        if (!Objects.equals(view.getTag(), -33024) && !(view instanceof org.telegram.ui.Cells.e9) && !(view instanceof org.telegram.ui.Cells.b7) && !(view instanceof org.telegram.ui.w10)) {
            return true;
        }
        return false;
    }

    public final void a(Canvas canvas, View view, View view2) {
        float f7;
        if (view != null && view2 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewParent parent = view.getParent();
            float f10 = 0.0f;
            LinearLayout linearLayout = this.f26561b;
            if (parent != linearLayout && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                f7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            } else {
                f7 = 0.0f;
            }
            if (view2.getParent() != linearLayout && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                f10 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(c(view) + linearLayout.getX(), Math.max(getScrollY() - AndroidUtilities.dp(16.0f), (d(view) + linearLayout.getY()) - f7), c(view) + linearLayout.getX() + view.getWidth(), Math.min(getScrollY() + AndroidUtilities.dp(16.0f) + getHeight(), d(view2) + linearLayout.getY() + view2.getHeight() + f10));
            if (rectF.bottom >= rectF.top) {
                wl0.O0(canvas, rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), view.getAlpha(), this.f26560a);
            }
        }
    }

    public final void b(ViewGroup viewGroup, float f7, float f10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1) {
                        LinearLayout linearLayout2 = this.f26561b;
                        if (childAt.getX() + f7 <= linearLayout2.getPaddingLeft() && childAt.getX() + f7 + childAt.getWidth() >= linearLayout2.getWidth() - linearLayout2.getPaddingRight()) {
                            b(linearLayout, childAt.getX() + f7, childAt.getY() + f10);
                        }
                    }
                }
                this.h.add(childAt);
            }
        }
    }

    public final float c(View view) {
        if (view != this.f26561b && (view.getParent() instanceof View)) {
            return view.getX() + c((View) view.getParent());
        }
        return view.getX();
    }

    public final float d(View view) {
        if (view != this.f26561b && (view.getParent() instanceof View)) {
            return view.getY() + d((View) view.getParent());
        }
        return view.getY();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.h;
        arrayList.clear();
        b(this.f26561b, 0.0f, 0.0f);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ArrayList arrayList = this.f26563f;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.f26561b.invalidate();
    }
}
