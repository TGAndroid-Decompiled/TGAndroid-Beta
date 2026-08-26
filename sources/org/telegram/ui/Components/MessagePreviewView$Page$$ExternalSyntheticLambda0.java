package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public final class MessagePreviewView$Page$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final int f$1;
    public final float f$2;

    public MessagePreviewView$Page$$ExternalSyntheticLambda0(FrameLayout frameLayout, int i, float f, int i2) {
        this.$r8$classId = i2;
        this.f$0 = frameLayout;
        this.f$1 = i;
        this.f$2 = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                MessagePreviewView.Page page = (MessagePreviewView.Page) this.f$0;
                page.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 1.0f - fFloatValue;
                int i = (int) ((page.chatTopOffset * fFloatValue) + (this.f$1 * f));
                page.currentTopOffset = i;
                page.setOffset((page.yOffset * fFloatValue) + (this.f$2 * f), i);
                break;
            default:
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = (ChatAttachAlertDocumentLayout) this.f$0;
                chatAttachAlertDocumentLayout.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = this.f$1;
                float f2 = this.f$2;
                ChatAttachAlertDocumentLayout.AnonymousClass4 anonymousClass4 = chatAttachAlertDocumentLayout.listView;
                ChatAttachAlertDocumentLayout.AnonymousClass4 anonymousClass5 = chatAttachAlertDocumentLayout.backgroundListView;
                if (i2 != 1) {
                    anonymousClass5.setTranslationX(f2 * fFloatValue2);
                    anonymousClass5.setAlpha(Math.max(0.0f, 1.0f - fFloatValue2));
                    anonymousClass5.invalidate();
                    anonymousClass4.setAlpha(fFloatValue2);
                    float f3 = (fFloatValue2 * 0.05f) + 0.95f;
                    anonymousClass4.setScaleX(f3);
                    anonymousClass4.setScaleY(f3);
                    anonymousClass5.invalidate();
                } else {
                    anonymousClass4.setTranslationX(f2 * fFloatValue2);
                    anonymousClass4.setAlpha(1.0f - fFloatValue2);
                    anonymousClass4.invalidate();
                    anonymousClass5.setAlpha(fFloatValue2);
                    float f4 = (fFloatValue2 * 0.05f) + 0.95f;
                    anonymousClass5.setScaleX(f4);
                    anonymousClass5.setScaleY(f4);
                }
                break;
        }
    }
}
