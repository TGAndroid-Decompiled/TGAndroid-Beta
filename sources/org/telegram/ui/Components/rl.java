package org.telegram.ui.Components;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class rl extends ViewOutlineProvider {
    public final int f28486a;
    public final Object f28487b;

    public rl(Object obj, int i10) {
        this.f28486a = i10;
        this.f28487b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        float f11;
        int i10 = this.f28486a;
        Object obj = this.f28487b;
        switch (i10) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                li liVar = chatAttachAlertPhotoLayout.f24282b;
                float f12 = liVar.D0[1];
                zh zhVar = liVar.f26758y2;
                if (zhVar != null) {
                    f10 = zhVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((liVar.getContainerView().getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.V) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f22872a0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f22874b0);
                }
                boolean z4 = chatAttachAlertPhotoLayout.f22872a0;
                if (z4) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f13 = chatAttachAlertPhotoLayout.f22893k1;
                    boolean z10 = ChatAttachAlertPhotoLayout.f22867n1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f22874b0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.T) + chatAttachAlertPhotoLayout.f22887h1, chatAttachAlertPhotoLayout.f22891j1, chatAttachAlertPhotoLayout.f22889i1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z4 && !chatAttachAlertPhotoLayout.V) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z11 = ChatAttachAlertPhotoLayout.f22867n1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.T, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 1:
                int i11 = ((y50) obj).K0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 2:
                outline.setRoundRect(0, ((rb0) obj).Q + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
                return;
            case 3:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) obj;
                float f15 = s1Var.N;
                if (f15 >= 0.0f) {
                    if (f15 < 1.0f) {
                        outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        return;
                    } else {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), s1Var.N);
                        return;
                    }
                } else if (!s1Var.J) {
                    outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    return;
                } else {
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (s1Var.J) {
                        f11 = AndroidUtilities.dp(4.0f);
                    } else {
                        f11 = 0.0f;
                    }
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight, f11);
                    return;
                }
            case 4:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) obj;
                if (s2Var.f29880b < 1.0f) {
                    outline.setRect((int) s2Var.L, (int) s2Var.K, (int) (view.getMeasuredWidth() - s2Var.L), (int) (view.getMeasuredHeight() - s2Var.K));
                    return;
                } else {
                    outline.setRoundRect((int) s2Var.L, (int) s2Var.K, (int) (view.getMeasuredWidth() - s2Var.L), (int) (view.getMeasuredHeight() - s2Var.K), s2Var.f29880b);
                    return;
                }
            case 5:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
            default:
                pg.a aVar = ((pg.b) obj).h;
                pg.b.h(outline, aVar.f41239m, aVar.f41231b);
                return;
        }
    }
}
