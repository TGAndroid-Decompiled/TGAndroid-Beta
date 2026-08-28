package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class ul extends CameraView {
    public final fh.y0 f33087a;
    public boolean f33088b;
    public final ChatAttachAlertPhotoLayout f33089c;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f33089c = chatAttachAlertPhotoLayout;
        this.f33087a = new fh.y0(this, 9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33089c;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f33088b && (chatAttachAlertPhotoLayout.W || !chatAttachAlertPhotoLayout.U)) {
            float translationY = (kiVar.getContainerView().getTranslationY() + (kiVar.C0[1] + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY();
            kh.i iVar = kiVar.f30173x2;
            if (iVar != null) {
                f10 = iVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.W;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = chatAttachAlertPhotoLayout.f26265j1;
                boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f26246a0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.f26259g1, chatAttachAlertPhotoLayout.f26263i1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.f26261h1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f26246a0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.U) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.f26241m1;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33089c;
        gc.a(chatAttachAlertPhotoLayout.L, this.f33087a);
        chatAttachAlertPhotoLayout.A.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.f33089c.L);
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        this.f33089c.A.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f33089c.A.invalidate();
    }
}
