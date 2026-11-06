package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class es0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f45402a;
    public final PopupNotificationActivity f45403b;

    public es0(PopupNotificationActivity popupNotificationActivity, int i7) {
        this.f45402a = i7;
        this.f45403b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f45402a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f45403b;
                FrameLayout frameLayout = popupNotificationActivity.f41570f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y10 = org.telegram.messenger.camera.q.y(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f41570f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y10, popupNotificationActivity.f41570f.getPaddingRight(), y10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f45403b;
                popupNotificationActivity2.f41571n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f41571n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f41571n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
