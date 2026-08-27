package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;

public final class ql extends CameraView {

    public final gh.w0 f31921a;

    public boolean f31922b;

    public final ChatAttachAlertPhotoLayout f31923c;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.f31923c = chatAttachAlertPhotoLayout;
        this.f31921a = new gh.w0(this, 9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31923c;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (this.f31922b || (!chatAttachAlertPhotoLayout.W && chatAttachAlertPhotoLayout.U)) {
            super.dispatchDraw(canvas);
            return;
        }
        float translationY = (giVar.getContainerView().getTranslationY() + (giVar.C0[1] + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY();
        lh.i iVar = giVar.f28709x2;
        int iMin = (int) Math.min(translationY - (iVar != null ? iVar.d() + AndroidUtilities.dp(8.0f) : 0.0f), getMeasuredHeight());
        boolean z10 = chatAttachAlertPhotoLayout.W;
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = chatAttachAlertPhotoLayout.f26261j1;
            boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
            float f11 = 1.0f - chatAttachAlertPhotoLayout.f26242a0;
            rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.f26255g1, chatAttachAlertPhotoLayout.f26259i1, AndroidUtilities.lerp(Math.min(iMin, chatAttachAlertPhotoLayout.f26257h1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f26242a0));
        } else {
            if (!z10 && !chatAttachAlertPhotoLayout.U) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.S, getMeasuredWidth(), Math.min(iMin, getMeasuredHeight()));
                return;
            }
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(iMin, getMeasuredHeight()));
        }
        canvas.save();
        canvas.clipRect(AndroidUtilities.rectTmp);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31923c;
        ec.a(chatAttachAlertPhotoLayout.L, this.f31921a);
        chatAttachAlertPhotoLayout.A.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this.f31923c.L);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f31923c.A.invalidate();
    }

    @Override
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.f31923c.A.invalidate();
    }
}
