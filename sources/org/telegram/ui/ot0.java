package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class ot0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f40267a;
    public final PopupNotificationActivity f40268b;

    public ot0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f40267a = i10;
        this.f40268b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f40267a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f40268b;
                FrameLayout frameLayout = popupNotificationActivity.f33689f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y3 = org.telegram.messenger.a30.y(48.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f33689f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y3, popupNotificationActivity.f33689f.getPaddingRight(), y3);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f40268b;
                popupNotificationActivity2.f33690n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f33690n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.i0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f33690n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
