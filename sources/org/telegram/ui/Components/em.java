package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
public final class em extends CameraView {
    public final bi.e1 f34765a;
    public boolean f34766b;
    public final ChatAttachAlertPhotoLayout f34767c;

    public em(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f34767c = chatAttachAlertPhotoLayout;
        this.f34765a = new bi.e1(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34767c;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (!this.f34766b && (chatAttachAlertPhotoLayout.f32775e0 || !chatAttachAlertPhotoLayout.f32771c0)) {
            float translationY = (siVar.f30190b.getTranslationY() + (siVar.E2[1] + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY();
            hi.i iVar = siVar.C4;
            if (iVar != null) {
                f10 = iVar.d() + org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f32775e0;
            if (z10) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = chatAttachAlertPhotoLayout.f32794o1;
                boolean z11 = ChatAttachAlertPhotoLayout.f32762r1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f32777f0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.f32767a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.f32790m1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f32777f0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f32771c0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z12 = ChatAttachAlertPhotoLayout.f32762r1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.f32767a0, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34767c;
        gc.a(chatAttachAlertPhotoLayout.Q, this.f34765a);
        chatAttachAlertPhotoLayout.F.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.f34767c.Q);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f34767c.F.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f34767c.F.invalidate();
    }
}
