package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f34594a;
    public final PopupNotificationActivity f34595b;

    public iw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f34594a = i10;
        this.f34595b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f34594a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f34595b;
                FrameLayout frameLayout = popupNotificationActivity.f31436f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int A = org.telegram.messenger.ok.A(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f31436f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), A, popupNotificationActivity.f31436f.getPaddingRight(), A);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f34595b;
                popupNotificationActivity2.f31437n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f31437n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f31437n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
