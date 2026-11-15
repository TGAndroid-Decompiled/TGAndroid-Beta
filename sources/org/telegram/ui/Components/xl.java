package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
public final class xl extends CameraView {
    public final bi.e1 f41721a;
    public boolean f41722b;
    public final ChatAttachAlertPhotoLayout f41723c;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f41723c = chatAttachAlertPhotoLayout;
        this.f41721a = new bi.e1(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f41723c;
        ki kiVar = chatAttachAlertPhotoLayout.f33607b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (!this.f41722b && (chatAttachAlertPhotoLayout.f32378e0 || !chatAttachAlertPhotoLayout.f32374c0)) {
            float translationY = (kiVar.f29682b.getTranslationY() + (kiVar.E2[1] + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY();
            hi.i iVar = kiVar.C4;
            if (iVar != null) {
                f10 = iVar.d() + org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f32378e0;
            if (z10) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = chatAttachAlertPhotoLayout.f32397o1;
                boolean z11 = ChatAttachAlertPhotoLayout.f32365r1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f32380f0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.f32370a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.f32393m1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f32380f0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f32374c0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z12 = ChatAttachAlertPhotoLayout.f32365r1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.f32370a0, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
                return;
            } else {
                org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
            }
            canvas.save();
            canvas.clipRect(org.telegram.messenger.g0.P);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f41723c;
        xb.a(chatAttachAlertPhotoLayout.Q, this.f41721a);
        chatAttachAlertPhotoLayout.F.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xb.h(this.f41723c.Q);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f41723c.F.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f41723c.F.invalidate();
    }
}
