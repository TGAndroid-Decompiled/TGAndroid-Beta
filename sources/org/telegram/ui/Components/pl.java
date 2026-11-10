package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
public final class pl extends CameraView {
    public final ch.v f37006a;
    public boolean f37007b;
    public final ChatAttachAlertPhotoLayout f37008c;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z9, boolean z10) {
        super(context, z9, z10);
        this.f37008c = chatAttachAlertPhotoLayout;
        this.f37006a = new ch.v(this, 7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37008c;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (!this.f37007b && (chatAttachAlertPhotoLayout.f31215d0 || !chatAttachAlertPhotoLayout.f31211b0)) {
            float translationY = (ciVar.f28672b.getTranslationY() + (ciVar.D2[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
            fi.i iVar = ciVar.B4;
            if (iVar != null) {
                f10 = iVar.d() + org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z9 = chatAttachAlertPhotoLayout.f31215d0;
            if (z9) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = chatAttachAlertPhotoLayout.n1;
                boolean z10 = ChatAttachAlertPhotoLayout.f31204q1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f31217e0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f31230k1, chatAttachAlertPhotoLayout.f31232m1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f31217e0));
            } else if (!z9 && !chatAttachAlertPhotoLayout.f31211b0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z11 = ChatAttachAlertPhotoLayout.f31204q1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.W, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37008c;
        bc.a(chatAttachAlertPhotoLayout.P, this.f37006a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bc.h(this.f37008c.P);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f37008c.E.invalidate();
    }

    @Override
    public final void showTexture(boolean z9, boolean z10) {
        super.showTexture(z9, z10);
        this.f37008c.E.invalidate();
    }
}
