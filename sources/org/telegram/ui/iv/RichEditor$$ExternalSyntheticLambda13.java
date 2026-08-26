package org.telegram.ui.iv;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.bots.BotWebViewSheet;

public final class RichEditor$$ExternalSyntheticLambda13 implements SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;

    public RichEditor$$ExternalSyntheticLambda13(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
    }

    @Override
    public final void onSizeChanged(int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ((RichEditor) this.f$0).getClass();
                break;
            default:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.f$0;
                botWebViewSheet.getClass();
                if (i > AndroidUtilities.dp(20.0f)) {
                    BotWebViewSheet.AnonymousClass1 anonymousClass1 = botWebViewSheet.swipeContainer;
                    anonymousClass1.stickTo(anonymousClass1.getTopActionBarOffsetY() + (-anonymousClass1.getOffsetY()));
                }
                break;
        }
    }
}
