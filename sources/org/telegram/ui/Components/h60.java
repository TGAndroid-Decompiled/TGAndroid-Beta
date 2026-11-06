package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
public final class h60 extends ScrollView {
    public final int f34170a;

    public h60(Context context, int i7) {
        super(context);
        this.f34170a = i7;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f34170a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i10), Math.min(org.telegram.messenger.g0.f22537q.y * 0.35f, org.telegram.messenger.g0.L(400.0f))), View.MeasureSpec.getMode(i10)));
                return;
            case 2:
            default:
                super.onMeasure(i7, i10);
                return;
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(320.0f)), Integer.MIN_VALUE));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(360.0f)), Integer.MIN_VALUE));
                return;
            case 5:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        switch (this.f34170a) {
            case 2:
                return false;
            default:
                return super.onRequestFocusInDescendants(i7, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        switch (this.f34170a) {
            case 2:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.g0.L(20.0f) + rect.top;
                rect.bottom = org.telegram.messenger.g0.L(50.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z9);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z9);
        }
    }
}
