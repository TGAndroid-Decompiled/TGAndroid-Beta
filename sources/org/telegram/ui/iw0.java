package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f34679a;
    public final PopupNotificationActivity f34680b;

    public iw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f34679a = i10;
        this.f34680b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f34679a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f34680b;
                FrameLayout frameLayout = popupNotificationActivity.f31508f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int A = org.telegram.messenger.ok.A(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f31508f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), A, popupNotificationActivity.f31508f.getPaddingRight(), A);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f34680b;
                popupNotificationActivity2.f31509n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f31509n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f31509n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
