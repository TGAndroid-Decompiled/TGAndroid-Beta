package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f39436a;
    public final PopupNotificationActivity f39437b;

    public fw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f39436a = i10;
        this.f39437b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f39436a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f39437b;
                FrameLayout frameLayout = popupNotificationActivity.f35882f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int B = org.telegram.messenger.wh.B(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f35882f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), B, popupNotificationActivity.f35882f.getPaddingRight(), B);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f39437b;
                popupNotificationActivity2.f35883n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f35883n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f35883n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
