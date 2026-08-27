package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ov0 implements ViewTreeObserver.OnPreDrawListener {

    public final int f41194a;

    public final PopupNotificationActivity f41195b;

    public ov0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f41194a = i10;
        this.f41195b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f41194a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f41195b;
                FrameLayout frameLayout = popupNotificationActivity.f35835f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int iX = org.telegram.messenger.rl.x(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f35835f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), iX, popupNotificationActivity.f35835f.getPaddingRight(), iX);
                break;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f41195b;
                popupNotificationActivity2.f35836n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.T) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f35836n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f35836n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    break;
                }
                break;
        }
        return true;
    }
}
