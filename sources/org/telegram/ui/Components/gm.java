package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class gm extends CameraView {
    public final ai.w4 f24617a;
    public boolean f24618b;
    public final ChatAttachAlertPhotoLayout f24619c;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f24619c = chatAttachAlertPhotoLayout;
        this.f24617a = new ai.w4(this, 7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24619c;
        xi xiVar = chatAttachAlertPhotoLayout.f27362b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f24618b && (chatAttachAlertPhotoLayout.f22153d0 || !chatAttachAlertPhotoLayout.f22149b0)) {
            float translationY = (xiVar.getContainerView().getTranslationY() + (xiVar.G0[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
            ci.i iVar = xiVar.B2;
            if (iVar != null) {
                f7 = iVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            int min = (int) Math.min(translationY - f7, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f22153d0;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = chatAttachAlertPhotoLayout.f22173n1;
                boolean z11 = ChatAttachAlertPhotoLayout.f22142q1;
                float f11 = 1.0f - chatAttachAlertPhotoLayout.f22155e0;
                rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f22168k1, chatAttachAlertPhotoLayout.f22170m1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f22155e0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f22149b0) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.f22142q1;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24619c;
        rc.a(chatAttachAlertPhotoLayout.P, this.f24617a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rc.h(this.f24619c.P);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f24619c.E.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f24619c.E.invalidate();
    }
}
