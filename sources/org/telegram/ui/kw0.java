package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f34817a;
    public final PopupNotificationActivity f34818b;

    public kw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f34817a = i10;
        this.f34818b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f34817a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f34818b;
                FrameLayout frameLayout = popupNotificationActivity.f31119f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y3 = org.telegram.messenger.ul.y(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f31119f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y3, popupNotificationActivity.f31119f.getPaddingRight(), y3);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f34818b;
                popupNotificationActivity2.f31120n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f31120n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f31120n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
