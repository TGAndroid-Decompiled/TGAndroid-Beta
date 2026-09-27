package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f35466a;
    public final PopupNotificationActivity f35467b;

    public lw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f35466a = i10;
        this.f35467b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f35466a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f35467b;
                FrameLayout frameLayout = popupNotificationActivity.f31436f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int z10 = org.telegram.messenger.qk.z(48.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f31436f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), z10, popupNotificationActivity.f31436f.getPaddingRight(), z10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f35467b;
                popupNotificationActivity2.f31437n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f31437n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f31437n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
