package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class fs0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f45700a;
    public final PopupNotificationActivity f45701b;

    public fs0(PopupNotificationActivity popupNotificationActivity, int i7) {
        this.f45700a = i7;
        this.f45701b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f45700a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f45701b;
                FrameLayout frameLayout = popupNotificationActivity.f41598f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y10 = org.telegram.messenger.camera.q.y(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f41598f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y10, popupNotificationActivity.f41598f.getPaddingRight(), y10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f45701b;
                popupNotificationActivity2.f41599n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f41599n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f41599n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
