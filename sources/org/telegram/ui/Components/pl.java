package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;
public final class pl extends CameraView {
    public final ai.h1 f37174a;
    public boolean f37175b;
    public final ChatAttachAlertPhotoLayout f37176c;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f37176c = chatAttachAlertPhotoLayout;
        this.f37174a = new ai.h1(this, 8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37176c;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (!this.f37175b && (chatAttachAlertPhotoLayout.f31271e0 || !chatAttachAlertPhotoLayout.f31267c0)) {
            float translationY = (biVar.f28586b.getTranslationY() + (biVar.B2[1] + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY();
            gi.i iVar = biVar.f32301z4;
            if (iVar != null) {
                f10 = iVar.d() + org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            int min = (int) Math.min(translationY - f10, getMeasuredHeight());
            boolean z10 = chatAttachAlertPhotoLayout.f31271e0;
            if (z10) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f11 = chatAttachAlertPhotoLayout.f31290o1;
                boolean z11 = ChatAttachAlertPhotoLayout.f31258r1;
                float f12 = 1.0f - chatAttachAlertPhotoLayout.f31273f0;
                rectF.set((0.0f * f12) + f11, (f12 * chatAttachAlertPhotoLayout.f31263a0) + chatAttachAlertPhotoLayout.f31285l1, chatAttachAlertPhotoLayout.f31288n1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.m1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f31273f0));
            } else if (!z10 && !chatAttachAlertPhotoLayout.f31267c0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z12 = ChatAttachAlertPhotoLayout.f31258r1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.f31263a0, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37176c;
        ac.a(chatAttachAlertPhotoLayout.Q, this.f37174a);
        chatAttachAlertPhotoLayout.F.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac.h(this.f37176c.Q);
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        this.f37176c.F.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f37176c.F.invalidate();
    }
}
