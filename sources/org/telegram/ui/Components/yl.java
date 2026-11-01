package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
public final class yl extends CameraView {
    public final k7 f32873a;
    public boolean f32874b;
    public final ChatAttachAlertPhotoLayout f32875c;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f32875c = chatAttachAlertPhotoLayout;
        this.f32873a = new k7(this, 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32875c;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        if (org.telegram.messenger.i0.m0) {
            return;
        }
        if (!this.f32874b && (chatAttachAlertPhotoLayout.f23857d0 || !chatAttachAlertPhotoLayout.f23853b0)) {
            float translationY = (biVar.f21587b.getTranslationY() + (biVar.A2[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
            oh ohVar = biVar.f24837y4;
            if (ohVar != null) {
                f7 = ohVar.d() + org.telegram.messenger.i0.L(8.0f);
            } else {
                f7 = 0.0f;
            }
            int min = (int) Math.min(translationY - f7, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f23857d0;
            if (z10) {
                RectF rectF = org.telegram.messenger.i0.P;
                float f10 = chatAttachAlertPhotoLayout.f23877n1;
                boolean z11 = ChatAttachAlertPhotoLayout.f23846q1;
                float f11 = 1.0f - chatAttachAlertPhotoLayout.f23859e0;
                rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f23872k1, chatAttachAlertPhotoLayout.f23874m1, org.telegram.messenger.i0.T1(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f23859e0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f23853b0) {
                RectF rectF2 = org.telegram.messenger.i0.P;
                boolean z12 = ChatAttachAlertPhotoLayout.f23846q1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.W, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
                return;
            } else {
                org.telegram.messenger.i0.P.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
            }
            canvas.save();
            canvas.clipRect(org.telegram.messenger.i0.P);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32875c;
        wb.a(chatAttachAlertPhotoLayout.P, this.f32873a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wb.h(this.f32875c.P);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f32875c.E.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f32875c.E.invalidate();
    }
}
