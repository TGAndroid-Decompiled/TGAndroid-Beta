package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33541a;
    public final PopupNotificationActivity f33542b;

    public dw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f33541a = i10;
        this.f33542b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f33541a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f33542b;
                FrameLayout frameLayout = popupNotificationActivity.f31918f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int x10 = b.x(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f31918f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), x10, popupNotificationActivity.f31918f.getPaddingRight(), x10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f33542b;
                popupNotificationActivity2.f31919n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.U) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f31919n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f31919n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
