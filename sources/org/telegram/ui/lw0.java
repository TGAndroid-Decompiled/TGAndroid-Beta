package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f38358a;
    public final PopupNotificationActivity f38359b;

    public lw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f38358a = i10;
        this.f38359b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38358a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f38359b;
                FrameLayout frameLayout = popupNotificationActivity.f34115f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int z10 = org.telegram.messenger.bi.z(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f34115f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), z10, popupNotificationActivity.f34115f.getPaddingRight(), z10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f38359b;
                popupNotificationActivity2.f34116n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f34116n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f34116n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
