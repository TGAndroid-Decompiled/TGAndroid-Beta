package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f38943a;
    public final PopupNotificationActivity f38944b;

    public dw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f38943a = i10;
        this.f38944b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f38943a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f38944b;
                FrameLayout frameLayout = popupNotificationActivity.f35858f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int B = org.telegram.messenger.vh.B(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f35858f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), B, popupNotificationActivity.f35858f.getPaddingRight(), B);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f38944b;
                popupNotificationActivity2.f35859n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f35859n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f35859n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
