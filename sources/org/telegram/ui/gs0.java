package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class gs0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f48123a;
    public final PopupNotificationActivity f48124b;

    public gs0(PopupNotificationActivity popupNotificationActivity, int i7) {
        this.f48123a = i7;
        this.f48124b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f48123a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f48124b;
                FrameLayout frameLayout = popupNotificationActivity.f43423f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int z10 = org.telegram.messenger.o10.z(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f43423f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), z10, popupNotificationActivity.f43423f.getPaddingRight(), z10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f48124b;
                popupNotificationActivity2.f43424n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f43424n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f43424n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
