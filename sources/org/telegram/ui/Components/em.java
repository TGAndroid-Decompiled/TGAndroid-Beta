package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
public final class em extends CameraView {
    public final bi.i1 f34791a;
    public boolean f34792b;
    public final ChatAttachAlertPhotoLayout f34793c;

    public em(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f34793c = chatAttachAlertPhotoLayout;
        this.f34791a = new bi.i1(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34793c;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (!this.f34792b && (chatAttachAlertPhotoLayout.f32875e0 || !chatAttachAlertPhotoLayout.f32871c0)) {
            float translationY = (tiVar.f30226b.getTranslationY() + (tiVar.E2[1] + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY();
            hi.j jVar = tiVar.C4;
            if (jVar != null) {
                f10 = jVar.d() + org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f32875e0;
            if (z10) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = chatAttachAlertPhotoLayout.f32894o1;
                boolean z11 = ChatAttachAlertPhotoLayout.f32862r1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f32877f0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.f32867a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.f32890m1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f32877f0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f32871c0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z12 = ChatAttachAlertPhotoLayout.f32862r1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.f32867a0, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34793c;
        fc.a(chatAttachAlertPhotoLayout.Q, this.f34791a);
        chatAttachAlertPhotoLayout.F.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fc.h(this.f34793c.Q);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.f34793c.F.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f34793c.F.invalidate();
    }
}
