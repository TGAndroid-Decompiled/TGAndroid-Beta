package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class fs0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f47847a;
    public final PopupNotificationActivity f47848b;

    public fs0(PopupNotificationActivity popupNotificationActivity, int i7) {
        this.f47847a = i7;
        this.f47848b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f47847a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f47848b;
                FrameLayout frameLayout = popupNotificationActivity.f43458f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int z10 = org.telegram.messenger.o10.z(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f43458f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), z10, popupNotificationActivity.f43458f.getPaddingRight(), z10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f47848b;
                popupNotificationActivity2.f43459n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f43459n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f43459n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
