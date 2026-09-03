package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class bm extends CameraView {
    public final lh.t0 f25659a;
    public boolean f25660b;
    public final ChatAttachAlertPhotoLayout f25661c;

    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z4, boolean z10) {
        super(context, z4, z10);
        this.f25661c = chatAttachAlertPhotoLayout;
        this.f25659a = new lh.t0(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25661c;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f25660b && (chatAttachAlertPhotoLayout.f24743a0 || !chatAttachAlertPhotoLayout.V)) {
            float translationY = (miVar.getContainerView().getTranslationY() + (miVar.D0[1] + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY();
            zh zhVar = miVar.f29132y2;
            if (zhVar != null) {
                f10 = zhVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z4 = chatAttachAlertPhotoLayout.f24743a0;
            if (z4) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = chatAttachAlertPhotoLayout.f24764k1;
                boolean z10 = ChatAttachAlertPhotoLayout.f24738n1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f24745b0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.T) + chatAttachAlertPhotoLayout.f24758h1, chatAttachAlertPhotoLayout.f24762j1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.f24760i1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f24745b0));
            } else if (!z4 && !chatAttachAlertPhotoLayout.V) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z11 = ChatAttachAlertPhotoLayout.f24738n1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.T, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25661c;
        ic.a(chatAttachAlertPhotoLayout.M, this.f25659a);
        chatAttachAlertPhotoLayout.B.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this.f25661c.M);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f25661c.B.invalidate();
    }

    @Override
    public final void showTexture(boolean z4, boolean z10) {
        super.showTexture(z4, z10);
        this.f25661c.B.invalidate();
    }
}
