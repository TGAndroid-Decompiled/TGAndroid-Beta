package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class zl extends CameraView {
    public final kh.t0 f31407a;
    public boolean f31408b;
    public final ChatAttachAlertPhotoLayout f31409c;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z4, boolean z10) {
        super(context, z4, z10);
        this.f31409c = chatAttachAlertPhotoLayout;
        this.f31407a = new kh.t0(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31409c;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f31408b && (chatAttachAlertPhotoLayout.f22872a0 || !chatAttachAlertPhotoLayout.V)) {
            float translationY = (liVar.getContainerView().getTranslationY() + (liVar.D0[1] + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY();
            zh zhVar = liVar.f26758y2;
            if (zhVar != null) {
                f10 = zhVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z4 = chatAttachAlertPhotoLayout.f22872a0;
            if (z4) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = chatAttachAlertPhotoLayout.f22893k1;
                boolean z10 = ChatAttachAlertPhotoLayout.f22867n1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f22874b0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.T) + chatAttachAlertPhotoLayout.f22887h1, chatAttachAlertPhotoLayout.f22891j1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.f22889i1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f22874b0));
            } else if (!z4 && !chatAttachAlertPhotoLayout.V) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z11 = ChatAttachAlertPhotoLayout.f22867n1;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31409c;
        ic.a(chatAttachAlertPhotoLayout.M, this.f31407a);
        chatAttachAlertPhotoLayout.B.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this.f31409c.M);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f31409c.B.invalidate();
    }

    @Override
    public final void showTexture(boolean z4, boolean z10) {
        super.showTexture(z4, z10);
        this.f31409c.B.invalidate();
    }
}
