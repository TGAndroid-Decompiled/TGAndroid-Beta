package org.telegram.ui;

import android.view.View;
import android.widget.RelativeLayout;
public final class nt0 extends RelativeLayout {
    public final PopupNotificationActivity f40050a;

    public nt0(PopupNotificationActivity popupNotificationActivity, PopupNotificationActivity popupNotificationActivity2) {
        super(popupNotificationActivity2);
        this.f40050a = popupNotificationActivity;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTag() instanceof String) {
                int left = childAt.getLeft();
                PopupNotificationActivity popupNotificationActivity = this.f40050a;
                childAt.layout(left, org.telegram.messenger.i0.L(3.0f) + popupNotificationActivity.f33680b.getTop(), childAt.getRight(), popupNotificationActivity.f33680b.getBottom());
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        PopupNotificationActivity popupNotificationActivity = this.f40050a;
        int measuredWidth = popupNotificationActivity.f33680b.getMeasuredWidth();
        int measuredHeight = popupNotificationActivity.f33680b.getMeasuredHeight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getTag() instanceof String) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight - org.telegram.messenger.i0.L(3.0f), 1073741824));
            }
        }
    }
}
