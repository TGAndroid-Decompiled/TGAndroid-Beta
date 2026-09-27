package org.telegram.ui;

import android.view.View;
import android.widget.RelativeLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 extends RelativeLayout {
    public final PopupNotificationActivity f34873a;

    public jw0(PopupNotificationActivity popupNotificationActivity, PopupNotificationActivity popupNotificationActivity2) {
        super(popupNotificationActivity2);
        this.f34873a = popupNotificationActivity;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTag() instanceof String) {
                int left = childAt.getLeft();
                PopupNotificationActivity popupNotificationActivity = this.f34873a;
                childAt.layout(left, AndroidUtilities.dp(3.0f) + popupNotificationActivity.f31434b.getTop(), childAt.getRight(), popupNotificationActivity.f31434b.getBottom());
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        PopupNotificationActivity popupNotificationActivity = this.f34873a;
        int measuredWidth = popupNotificationActivity.f31434b.getMeasuredWidth();
        int measuredHeight = popupNotificationActivity.f31434b.getMeasuredHeight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getTag() instanceof String) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight - AndroidUtilities.dp(3.0f), 1073741824));
            }
        }
    }
}
