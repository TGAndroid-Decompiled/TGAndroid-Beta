package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ly0 extends iz0 {
    public ly0(Context context) {
        super(context);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        lh.x2 x2Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.p5 p5Var = this.f32906e;
        if (p5Var != null && (x2Var = p5Var.f31593k) != null) {
            x2Var.startAnimation();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenInPhotoViewer)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
