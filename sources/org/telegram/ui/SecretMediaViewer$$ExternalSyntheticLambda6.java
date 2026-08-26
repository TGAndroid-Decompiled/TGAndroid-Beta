package org.telegram.ui;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bots.BotWebViewSheet;

public final class SecretMediaViewer$$ExternalSyntheticLambda6 implements View.OnApplyWindowInsetsListener {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;

    public SecretMediaViewer$$ExternalSyntheticLambda6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.$r8$classId) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f$0;
                WindowInsets windowInsets2 = secretMediaViewer.lastInsets;
                secretMediaViewer.lastInsets = windowInsets;
                if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
                    secretMediaViewer.windowView.requestLayout();
                }
                return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
            default:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.f$0;
                WindowInsetsCompat.Impl impl = WindowInsetsCompat.toWindowInsetsCompat(view, windowInsets).mImpl;
                Insets insets = impl.getInsets(2);
                botWebViewSheet.navInsets.set(insets.left, insets.top, insets.right, insets.bottom);
                Insets insets2 = impl.getInsets(647);
                int iMax = Math.max(insets2.left, windowInsets.getStableInsetLeft());
                int iMax2 = Math.max(insets2.top, windowInsets.getStableInsetTop());
                int iMax3 = Math.max(insets2.right, windowInsets.getStableInsetRight());
                int iMax4 = Math.max(insets2.bottom, windowInsets.getStableInsetBottom());
                Rect rect = botWebViewSheet.insets;
                rect.set(iMax, iMax2, iMax3, iMax4);
                int i = Build.VERSION.SDK_INT;
                if (i <= 28) {
                    rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(botWebViewSheet.getContext()));
                }
                int i2 = impl.getInsets(8).bottom;
                if (i2 <= rect.bottom || i2 <= AndroidUtilities.dp(20.0f)) {
                    botWebViewSheet.keyboardInset = 0;
                } else {
                    botWebViewSheet.keyboardInset = i2;
                }
                botWebViewSheet.updateFullscreenLayout();
                return i >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
        }
    }
}
