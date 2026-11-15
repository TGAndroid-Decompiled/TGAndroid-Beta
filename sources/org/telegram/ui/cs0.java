package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class cs0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f46210a;
    public final PopupNotificationActivity f46211b;

    public cs0(PopupNotificationActivity popupNotificationActivity, int i7) {
        this.f46210a = i7;
        this.f46211b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f46210a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f46211b;
                FrameLayout frameLayout = popupNotificationActivity.f42968f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y10 = org.telegram.messenger.i20.y(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f42968f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y10, popupNotificationActivity.f42968f.getPaddingRight(), y10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f46211b;
                popupNotificationActivity2.f42969n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f42969n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f42969n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
