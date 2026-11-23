package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
public final class gm extends CameraView {
    public final bi.i1 f35594a;
    public boolean f35595b;
    public final ChatAttachAlertPhotoLayout f35596c;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f35596c = chatAttachAlertPhotoLayout;
        this.f35594a = new bi.i1(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35596c;
        ui uiVar = chatAttachAlertPhotoLayout.f37477b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (!this.f35595b && (chatAttachAlertPhotoLayout.f32777e0 || !chatAttachAlertPhotoLayout.f32773c0)) {
            float translationY = (uiVar.f30142b.getTranslationY() + (uiVar.E2[1] + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY();
            hi.i iVar = uiVar.C4;
            if (iVar != null) {
                f10 = iVar.d() + org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f32777e0;
            if (z10) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = chatAttachAlertPhotoLayout.f32796o1;
                boolean z11 = ChatAttachAlertPhotoLayout.f32764r1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f32779f0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.f32769a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.f32792m1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f32779f0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f32773c0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z12 = ChatAttachAlertPhotoLayout.f32764r1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.f32769a0, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35596c;
        gc.a(chatAttachAlertPhotoLayout.Q, this.f35594a);
        chatAttachAlertPhotoLayout.F.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.f35596c.Q);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f35596c.F.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f35596c.F.invalidate();
    }
}
