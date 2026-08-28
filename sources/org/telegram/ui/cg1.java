package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class cg1 extends ViewGroup {
    public final Paint f37204a;
    public View f37205b;
    public boolean f37206c;

    public cg1(Context context) {
        super(context);
        this.f37204a = new Paint(1);
        setClipToPadding(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int paddingBottom = getPaddingBottom();
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(0.1f, 0.75f, paddingBottom);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        int h = i0.a.h(org.telegram.ui.ActionBar.f6.l1(navigationBarThirdButtonsFactor, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false)), w02);
        Paint paint = this.f37204a;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - paddingBottom, paint);
        paint.setColor(h);
        canvas.drawRect(0.0f, getMeasuredHeight() - paddingBottom, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int i11;
        View view = this.f37205b;
        if (view != null && view.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (z10) {
            i11 = getPaddingBottom() + AndroidUtilities.dp(44.0f);
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
        if (this.f37206c != z10) {
            this.f37206c = z10;
            WeakHashMap weakHashMap = r0.j0.f46915a;
            r0.z.c(this);
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f37205b = view;
    }

    @Override
    public final void setPadding(int i9, int i10, int i11, int i12) {
        super.setPadding(i9, i10, i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).setPadding(i9, i10, i11, i12);
        }
    }
}
