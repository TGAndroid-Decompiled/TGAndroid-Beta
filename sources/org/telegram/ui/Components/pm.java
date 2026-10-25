package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class pm extends CameraView {
    public final bh.c0 f31602a;
    public boolean f31603b;
    public final ChatAttachAlertPhotoLayout f31604c;

    public pm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f31604c = chatAttachAlertPhotoLayout;
        this.f31602a = new bh.c0(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31604c;
        ti tiVar = chatAttachAlertPhotoLayout.f30213b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f31603b && (chatAttachAlertPhotoLayout.f26024d0 || !chatAttachAlertPhotoLayout.f26020b0)) {
            float translationY = (tiVar.getContainerView().getTranslationY() + (tiVar.J0[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
            fi.i iVar = tiVar.H2;
            if (iVar != null) {
                f7 = iVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            int min = (int) Math.min(translationY - f7, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f26024d0;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = chatAttachAlertPhotoLayout.f26044n1;
                boolean z11 = ChatAttachAlertPhotoLayout.f26013q1;
                float f11 = 1.0f - chatAttachAlertPhotoLayout.f26026e0;
                rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f26039k1, chatAttachAlertPhotoLayout.f26041m1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f26026e0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f26020b0) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.f26013q1;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31604c;
        qc.a(chatAttachAlertPhotoLayout.P, this.f31602a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.f31604c.P);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f31604c.E.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f31604c.E.invalidate();
    }
}
