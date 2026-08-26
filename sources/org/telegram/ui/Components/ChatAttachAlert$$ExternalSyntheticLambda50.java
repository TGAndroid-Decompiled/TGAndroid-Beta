package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class ChatAttachAlert$$ExternalSyntheticLambda50 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId = 0;
    public final KeyEvent.Callback f$0;
    public final float f$1;
    public final float f$2;
    public final boolean f$3;

    public ChatAttachAlert$$ExternalSyntheticLambda50(ChatAttachAlert chatAttachAlert, float f, float f2, boolean z) {
        this.f$0 = chatAttachAlert;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = z;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                float f3 = f / 500.0f;
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                chatAttachAlert.ATTACH_ALERT_LAYOUT_TRANSLATION.set(chatAttachAlert.currentAttachLayout, Float.valueOf(f3));
                chatAttachAlert.actionBar.setAlpha(AndroidUtilities.lerp(this.f$1, this.f$2, f3));
                chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, false, 0);
                chatAttachAlert.updateLayout(chatAttachAlert.nextAttachLayout, false, 0);
                if (!(chatAttachAlert.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || this.f$3) {
                    f3 = 1.0f - f3;
                }
                float fClamp = Utilities.clamp(f3, 1.0f, 0.0f);
                LinearLayout linearLayout = chatAttachAlert.mediaPreviewView;
                linearLayout.setAlpha(fClamp);
                LinearLayout linearLayout2 = chatAttachAlert.selectedView;
                float f4 = 1.0f - fClamp;
                linearLayout2.setAlpha(f4);
                linearLayout2.setTranslationX(fClamp * (-AndroidUtilities.dp(16.0f)));
                linearLayout.setTranslationX(f4 * AndroidUtilities.dp(16.0f));
                break;
            default:
                SenderSelectView senderSelectView = (SenderSelectView) this.f$0;
                senderSelectView.getClass();
                boolean z = this.f$3;
                if (z) {
                    if (f > this.f$1 / 2.0f || !senderSelectView.scaleIn) {
                    }
                } else if (f < this.f$2 / 2.0f || !senderSelectView.scaleOut) {
                }
                senderSelectView.scaleIn = !z;
                senderSelectView.scaleOut = z;
                break;
        }
    }

    public ChatAttachAlert$$ExternalSyntheticLambda50(SenderSelectView senderSelectView, boolean z, float f, float f2) {
        this.f$0 = senderSelectView;
        this.f$3 = z;
        this.f$1 = f;
        this.f$2 = f2;
    }
}
