package org.telegram.ui.bots;

import android.animation.ValueAnimator;

public final class ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatAttachAlertBotWebViewLayout f$0;

    public ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertBotWebViewLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.f$0;
                chatAttachAlertBotWebViewLayout.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ChatAttachAlertBotWebViewLayout.AnonymousClass1 anonymousClass1 = chatAttachAlertBotWebViewLayout.webViewContainer;
                if (anonymousClass1.getWebView() != null) {
                    anonymousClass1.getWebView().setScrollY(iIntValue);
                }
                break;
            default:
                this.f$0.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
