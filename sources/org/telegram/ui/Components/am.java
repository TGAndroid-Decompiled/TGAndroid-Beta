package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;
public final class am extends CameraView {
    public final kh.t0 f23452a;
    public boolean f23453b;
    public final ChatAttachAlertPhotoLayout f23454c;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z4, boolean z10) {
        super(context, z4, z10);
        this.f23454c = chatAttachAlertPhotoLayout;
        this.f23452a = new kh.t0(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23454c;
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (!this.f23453b && (chatAttachAlertPhotoLayout.f22899a0 || !chatAttachAlertPhotoLayout.V)) {
            float translationY = (liVar.getContainerView().getTranslationY() + (liVar.D0[1] + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY();
            zh zhVar = liVar.f26762y2;
            if (zhVar != null) {
                f10 = zhVar.d() + AndroidUtilities.dp(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z4 = chatAttachAlertPhotoLayout.f22899a0;
            if (z4) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = chatAttachAlertPhotoLayout.f22920k1;
                boolean z10 = ChatAttachAlertPhotoLayout.f22894n1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f22901b0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.T) + chatAttachAlertPhotoLayout.f22914h1, chatAttachAlertPhotoLayout.f22918j1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.f22916i1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f22901b0));
            } else if (!z4 && !chatAttachAlertPhotoLayout.V) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z11 = ChatAttachAlertPhotoLayout.f22894n1;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23454c;
        ic.a(chatAttachAlertPhotoLayout.M, this.f23452a);
        chatAttachAlertPhotoLayout.B.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this.f23454c.M);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f23454c.B.invalidate();
    }

    @Override
    public final void showTexture(boolean z4, boolean z10) {
        super.showTexture(z4, z10);
        this.f23454c.B.invalidate();
    }
}
