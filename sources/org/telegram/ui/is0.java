package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class is0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f46750a;
    public final PopupNotificationActivity f46751b;

    public is0(PopupNotificationActivity popupNotificationActivity, int i7) {
        this.f46750a = i7;
        this.f46751b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f46750a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f46751b;
                FrameLayout frameLayout = popupNotificationActivity.f41596f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y10 = org.telegram.messenger.camera.q.y(48.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f41596f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y10, popupNotificationActivity.f41596f.getPaddingRight(), y10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f46751b;
                popupNotificationActivity2.f41597n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f41597n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f41597n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
