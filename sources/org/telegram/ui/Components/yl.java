package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class yl extends CameraView {
    public final ih.u0 f35087a;
    public boolean f35088b;
    public final ChatAttachAlertPhotoLayout f35089c;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f35089c = chatAttachAlertPhotoLayout;
        this.f35087a = new ih.u0(this, 9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35089c;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f35088b && (chatAttachAlertPhotoLayout.W || !chatAttachAlertPhotoLayout.U)) {
            float translationY = (niVar.getContainerView().getTranslationY() + (niVar.C0[1] + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY();
            nh.i iVar = niVar.f31064x2;
            if (iVar != null) {
                f9 = iVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f9 = 0.0f;
            }
            int min = (int) Math.min(translationY - f9, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.W;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = chatAttachAlertPhotoLayout.f26276j1;
                boolean z11 = ChatAttachAlertPhotoLayout.f26252m1;
                float f11 = 1.0f - chatAttachAlertPhotoLayout.f26257a0;
                rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.f26270g1, chatAttachAlertPhotoLayout.f26274i1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.f26272h1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f26257a0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.U) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.f26252m1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.S, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35089c;
        mc.a(chatAttachAlertPhotoLayout.L, this.f35087a);
        chatAttachAlertPhotoLayout.A.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mc.h(this.f35089c.L);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f35089c.A.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f35089c.A.invalidate();
    }
}
