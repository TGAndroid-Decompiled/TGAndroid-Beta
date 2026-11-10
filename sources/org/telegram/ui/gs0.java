package org.telegram.ui;

import android.view.View;
import android.widget.RelativeLayout;
public final class gs0 extends RelativeLayout {
    public final PopupNotificationActivity f46151a;

    public gs0(PopupNotificationActivity popupNotificationActivity, PopupNotificationActivity popupNotificationActivity2) {
        super(popupNotificationActivity2);
        this.f46151a = popupNotificationActivity;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTag() instanceof String) {
                int left = childAt.getLeft();
                PopupNotificationActivity popupNotificationActivity = this.f46151a;
                childAt.layout(left, org.telegram.messenger.g0.L(3.0f) + popupNotificationActivity.f41593b.getTop(), childAt.getRight(), popupNotificationActivity.f41593b.getBottom());
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        PopupNotificationActivity popupNotificationActivity = this.f46151a;
        int measuredWidth = popupNotificationActivity.f41593b.getMeasuredWidth();
        int measuredHeight = popupNotificationActivity.f41593b.getMeasuredHeight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getTag() instanceof String) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight - org.telegram.messenger.g0.L(3.0f), 1073741824));
            }
        }
    }
}
