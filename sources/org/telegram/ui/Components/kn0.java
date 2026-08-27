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

public class kn0 extends ScrollView {

    public final org.telegram.ui.ActionBar.c6 f30153a;

    public final LinearLayout f30154b;

    public final float f30155c;
    public final float[] d;

    public final float[] f30156e;

    public final ArrayList f30157f;
    public final ArrayList h;

    public final Path f30158n;

    public kn0(Context context, LinearLayout linearLayout, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f30155c = AndroidUtilities.dp(16.0f);
        this.f30157f = new ArrayList();
        this.h = new ArrayList();
        this.f30158n = new Path();
        this.f30153a = c6Var;
        this.f30154b = linearLayout;
        setWillNotDraw(false);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 12.0f : 4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.d = new float[]{AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0.0f, 0.0f, 0.0f, 0.0f};
        this.f30156e = new float[]{0.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f)};
    }

    public static boolean e(View view) {
        return (Objects.equals(view.getTag(), -33024) || (view instanceof org.telegram.ui.Cells.x8) || (view instanceof org.telegram.ui.Cells.w6) || (view instanceof org.telegram.ui.l10)) ? false : true;
    }

    public final void a(Canvas canvas, View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewParent parent = view.getParent();
        float f10 = 0.0f;
        LinearLayout linearLayout = this.f30154b;
        float f11 = (parent == linearLayout || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (view2.getParent() != linearLayout && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(c(view) + linearLayout.getX(), Math.max(getScrollY() - AndroidUtilities.dp(16.0f), (d(view) + linearLayout.getY()) - f11), c(view) + linearLayout.getX() + view.getWidth(), Math.min(getScrollY() + AndroidUtilities.dp(16.0f) + getHeight(), d(view2) + linearLayout.getY() + view2.getHeight() + f10));
        if (rectF.bottom < rectF.top) {
            return;
        }
        zk0.N0(canvas, rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), view.getAlpha(), this.f30153a);
    }

    public final void b(ViewGroup viewGroup, float f10, float f11) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1) {
                        float x8 = childAt.getX() + f10;
                        LinearLayout linearLayout2 = this.f30154b;
                        if (x8 > linearLayout2.getPaddingLeft() || childAt.getX() + f10 + childAt.getWidth() < linearLayout2.getWidth() - linearLayout2.getPaddingRight()) {
                            this.h.add(childAt);
                        } else {
                            b(linearLayout, childAt.getX() + f10, childAt.getY() + f11);
                        }
                    } else {
                        this.h.add(childAt);
                    }
                } else {
                    this.h.add(childAt);
                }
            }
        }
    }

    public final float c(View view) {
        if (view == this.f30154b || !(view.getParent() instanceof View)) {
            return view.getX();
        }
        return view.getX() + c((View) view.getParent());
    }

    public final float d(View view) {
        if (view == this.f30154b || !(view.getParent() instanceof View)) {
            return view.getY();
        }
        return view.getY() + d((View) view.getParent());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.h;
        arrayList.clear();
        b(this.f30154b, 0.0f, 0.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            View view = null;
            View view2 = null;
            while (true) {
                if (i10 >= size) {
                    a(canvas, view, view2);
                    super.dispatchDraw(canvas);
                    return;
                }
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
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ArrayList arrayList = this.f30157f;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.f30154b.invalidate();
    }
}
