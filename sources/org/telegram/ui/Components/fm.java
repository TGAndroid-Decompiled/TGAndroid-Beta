package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class fm extends CameraView {
    public final ai.w4 f24332a;
    public boolean f24333b;
    public final ChatAttachAlertPhotoLayout f24334c;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f24334c = chatAttachAlertPhotoLayout;
        this.f24332a = new ai.w4(this, 7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24334c;
        wi wiVar = chatAttachAlertPhotoLayout.f27104b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f24333b && (chatAttachAlertPhotoLayout.f22134d0 || !chatAttachAlertPhotoLayout.f22130b0)) {
            float translationY = (wiVar.getContainerView().getTranslationY() + (wiVar.G0[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
            ci.i iVar = wiVar.B2;
            if (iVar != null) {
                f7 = iVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            int min = (int) Math.min(translationY - f7, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f22134d0;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = chatAttachAlertPhotoLayout.f22154n1;
                boolean z11 = ChatAttachAlertPhotoLayout.f22123q1;
                float f11 = 1.0f - chatAttachAlertPhotoLayout.f22136e0;
                rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f22149k1, chatAttachAlertPhotoLayout.f22151m1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f22136e0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f22130b0) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.f22123q1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.W, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
                return;
            } else {
                AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
            }
            canvas.save();
            canvas.clipRect(AndroidUtilities.rectTmp);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24334c;
        qc.a(chatAttachAlertPhotoLayout.P, this.f24332a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.f24334c.P);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f24334c.E.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f24334c.E.invalidate();
    }
}
