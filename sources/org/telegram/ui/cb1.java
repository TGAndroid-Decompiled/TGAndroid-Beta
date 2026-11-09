package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
public final class cb1 extends ViewGroup {
    public final Paint f44264a;
    public View f44265b;
    public boolean f44266c;

    public cb1(Context context) {
        super(context);
        this.f44264a = new Paint(1);
        setClipToPadding(false);
    }

    public final boolean a() {
        View view = this.f44265b;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int paddingBottom = getPaddingBottom();
        float T1 = org.telegram.messenger.g0.T1(0.1f, 0.75f, org.telegram.messenger.g0.R0(paddingBottom));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.l6.r1(T1, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)), x02);
        Paint paint = this.f44264a;
        paint.setColor(x02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - paddingBottom, paint);
        paint.setColor(k10);
        canvas.drawRect(0.0f, getMeasuredHeight() - paddingBottom, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean a10 = a();
        int size = View.MeasureSpec.getSize(i7);
        if (a10) {
            i11 = getPaddingBottom() + org.telegram.messenger.g0.L(44.0f);
        } else {
            i11 = 0;
        }
        setMeasuredDimension(size, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.f44266c != a10) {
            this.f44266c = a10;
            WeakHashMap weakHashMap = r0.i0.f54203a;
            r0.y.c(this);
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f44265b = view;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        super.setPadding(i7, i10, i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).setPadding(i7, i10, i11, i12);
        }
    }
}
