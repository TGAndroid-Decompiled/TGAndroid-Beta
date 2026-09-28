package org.telegram.ui;

import android.view.View;
import android.widget.RelativeLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gw0 extends RelativeLayout {
    public final PopupNotificationActivity f34072a;

    public gw0(PopupNotificationActivity popupNotificationActivity, PopupNotificationActivity popupNotificationActivity2) {
        super(popupNotificationActivity2);
        this.f34072a = popupNotificationActivity;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTag() instanceof String) {
                int left = childAt.getLeft();
                PopupNotificationActivity popupNotificationActivity = this.f34072a;
                childAt.layout(left, AndroidUtilities.dp(3.0f) + popupNotificationActivity.f31432b.getTop(), childAt.getRight(), popupNotificationActivity.f31432b.getBottom());
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        PopupNotificationActivity popupNotificationActivity = this.f34072a;
        int measuredWidth = popupNotificationActivity.f31432b.getMeasuredWidth();
        int measuredHeight = popupNotificationActivity.f31432b.getMeasuredHeight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getTag() instanceof String) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight - AndroidUtilities.dp(3.0f), 1073741824));
            }
        }
    }
}
