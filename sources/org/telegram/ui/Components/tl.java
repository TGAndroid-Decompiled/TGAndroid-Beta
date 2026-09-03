package org.telegram.ui.Components;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class tl extends ViewOutlineProvider {
    public final int f31369a;
    public final Object f31370b;

    public tl(Object obj, int i10) {
        this.f31369a = i10;
        this.f31370b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        float f11;
        int i10 = this.f31369a;
        Object obj = this.f31370b;
        switch (i10) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                mi miVar = chatAttachAlertPhotoLayout.f26590b;
                float f12 = miVar.D0[1];
                zh zhVar = miVar.f29132y2;
                if (zhVar != null) {
                    f10 = zhVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((miVar.getContainerView().getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.V) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f24743a0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f24745b0);
                }
                boolean z4 = chatAttachAlertPhotoLayout.f24743a0;
                if (z4) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f13 = chatAttachAlertPhotoLayout.f24764k1;
                    boolean z10 = ChatAttachAlertPhotoLayout.f24738n1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f24745b0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.T) + chatAttachAlertPhotoLayout.f24758h1, chatAttachAlertPhotoLayout.f24762j1, chatAttachAlertPhotoLayout.f24760i1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z4 && !chatAttachAlertPhotoLayout.V) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z11 = ChatAttachAlertPhotoLayout.f24738n1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.T, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 1:
                int i11 = ((z50) obj).K0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 2:
                outline.setRoundRect(0, ((sb0) obj).Q + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                return;
            case 3:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) obj;
                float f15 = t1Var.N;
                if (f15 >= 0.0f) {
                    if (f15 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), t1Var.N);
                        return;
                    }
                } else if (!t1Var.J) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (t1Var.J) {
                        f11 = AndroidUtilities.dp(4.0f);
                    } else {
                        f11 = 0.0f;
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f11);
                    return;
                }
            case 4:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) obj;
                if (t2Var.f32353b < 1.0f) {
                    outline.setRect((int) t2Var.L, (int) t2Var.K, (int) (view.getMeasuredWidth() - t2Var.L), (int) (view.getMeasuredHeight() - t2Var.K));
                    return;
                } else {
                    outline.setRoundRect((int) t2Var.L, (int) t2Var.K, (int) (view.getMeasuredWidth() - t2Var.L), (int) (view.getMeasuredHeight() - t2Var.K), t2Var.f32353b);
                    return;
                }
            case 5:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
            default:
                qg.a aVar = ((qg.b) obj).h;
                qg.b.h(outline, aVar.f44877m, aVar.f44868b);
                return;
        }
    }
}
