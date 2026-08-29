package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nv0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f40909a;
    public final PopupNotificationActivity f40910b;

    public nv0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f40909a = i10;
        this.f40910b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f40909a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f40910b;
                FrameLayout frameLayout = popupNotificationActivity.f35898f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int x4 = b.x(48.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f35898f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), x4, popupNotificationActivity.f35898f.getPaddingRight(), x4);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f40910b;
                popupNotificationActivity2.f35899n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.T) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f35899n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f35899n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
