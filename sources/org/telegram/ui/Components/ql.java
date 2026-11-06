package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
public final class ql extends CameraView {
    public final ch.v f37324a;
    public boolean f37325b;
    public final ChatAttachAlertPhotoLayout f37326c;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z9, boolean z10) {
        super(context, z9, z10);
        this.f37326c = chatAttachAlertPhotoLayout;
        this.f37324a = new ch.v(this, 7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37326c;
        di diVar = chatAttachAlertPhotoLayout.f38969b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (!this.f37325b && (chatAttachAlertPhotoLayout.f31195d0 || !chatAttachAlertPhotoLayout.f31191b0)) {
            float translationY = (diVar.f28616b.getTranslationY() + (diVar.A2[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
            fi.i iVar = diVar.f33010y4;
            if (iVar != null) {
                f10 = iVar.d() + org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z9 = chatAttachAlertPhotoLayout.f31195d0;
            if (z9) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = chatAttachAlertPhotoLayout.n1;
                boolean z10 = ChatAttachAlertPhotoLayout.f31184q1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f31197e0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.f31210k1, chatAttachAlertPhotoLayout.f31212m1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f31197e0));
            } else if (!z9 && !chatAttachAlertPhotoLayout.f31191b0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z11 = ChatAttachAlertPhotoLayout.f31184q1;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37326c;
        cc.a(chatAttachAlertPhotoLayout.P, this.f37324a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cc.h(this.f37326c.P);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f37326c.E.invalidate();
    }

    @Override
    public final void showTexture(boolean z9, boolean z10) {
        super.showTexture(z9, z10);
        this.f37326c.E.invalidate();
    }
}
