package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b81 extends FrameLayout {
    public final int f36766a;

    public b81(Context context, int i9) {
        super(context);
        this.f36766a = i9;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36766a) {
            case 5:
                org.telegram.ui.ActionBar.f6.f23089i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.f6.f23089i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.f6.f23089i3.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f36766a) {
            case 10:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f36766a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f36766a) {
            case 4:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f36766a) {
            case 1:
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getMeasuredWidth() + i13 > getMeasuredWidth()) {
                        i14 += getChildAt(i15).getMeasuredHeight();
                        i13 = 0;
                    }
                    getChildAt(i15).layout(i13, i14, getChildAt(i15).getMeasuredWidth() + i13, getChildAt(i15).getMeasuredHeight() + i14);
                    i13 += getChildAt(i15).getMeasuredWidth();
                }
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        switch (this.f36766a) {
            case 0:
                super.onMeasure(i9, i10);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i9);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
                int childCount = getChildCount();
                int i12 = 0;
                if (childCount > 0) {
                    i11 = getChildAt(0).getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getMeasuredWidth() + i13 > size) {
                        i14 += getChildAt(i15).getMeasuredHeight();
                        i13 = 0;
                    }
                    i13 += getChildAt(i15).getMeasuredWidth();
                }
                int measuredWidth = getMeasuredWidth();
                if (getChildCount() != 0) {
                    i12 = AndroidUtilities.dp(16.0f) + i11 + i14;
                }
                setMeasuredDimension(measuredWidth, i12);
                return;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                return;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onMeasure(i9, i10);
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(60.0f)), View.MeasureSpec.getMode(i10)));
                return;
            case 11:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
                return;
        }
    }
}
