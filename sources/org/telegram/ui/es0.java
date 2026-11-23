package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class es0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f47613a;
    public final PopupNotificationActivity f47614b;

    public es0(PopupNotificationActivity popupNotificationActivity, int i7) {
        this.f47613a = i7;
        this.f47614b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f47613a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f47614b;
                FrameLayout frameLayout = popupNotificationActivity.f43539f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int z10 = org.telegram.messenger.m10.z(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f43539f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), z10, popupNotificationActivity.f43539f.getPaddingRight(), z10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f47614b;
                popupNotificationActivity2.f43540n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f43540n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f43540n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
