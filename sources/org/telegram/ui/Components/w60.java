package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
public final class w60 extends ScrollView {
    public final int f32091a;

    public w60(Context context, int i10) {
        super(context);
        this.f32091a = i10;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f32091a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(260.0f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i11), Math.min(org.telegram.messenger.i0.f16172q.y * 0.35f, org.telegram.messenger.i0.L(400.0f))), View.MeasureSpec.getMode(i11)));
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(320.0f)), Integer.MIN_VALUE));
                return;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(360.0f)), Integer.MIN_VALUE));
                return;
            case 5:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(260.0f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f32091a) {
            case 2:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f32091a) {
            case 2:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.i0.L(20.0f) + rect.top;
                rect.bottom = org.telegram.messenger.i0.L(50.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }
}
