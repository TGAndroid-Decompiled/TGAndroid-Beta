package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class qm extends CameraView {
    public final ah.m0 f28325a;
    public boolean f28326b;
    public final ChatAttachAlertPhotoLayout f28327c;

    public qm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f28327c = chatAttachAlertPhotoLayout;
        this.f28325a = new ah.m0(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28327c;
        vi viVar = chatAttachAlertPhotoLayout.f27360b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f28326b && (chatAttachAlertPhotoLayout.f22729d0 || !chatAttachAlertPhotoLayout.f22725b0)) {
            float translationY = (viVar.getContainerView().getTranslationY() + (viVar.J0[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
            di.i iVar = viVar.E2;
            if (iVar != null) {
                f7 = iVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            int min = (int) Math.min(translationY - f7, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f22729d0;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = chatAttachAlertPhotoLayout.f22749n1;
                boolean z11 = ChatAttachAlertPhotoLayout.f22718q1;
                float f11 = 1.0f - chatAttachAlertPhotoLayout.f22731e0;
                rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f22744k1, chatAttachAlertPhotoLayout.f22746m1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f22731e0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f22725b0) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.f22718q1;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28327c;
        sc.a(chatAttachAlertPhotoLayout.P, this.f28325a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sc.h(this.f28327c.P);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f28327c.E.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f28327c.E.invalidate();
    }
}
