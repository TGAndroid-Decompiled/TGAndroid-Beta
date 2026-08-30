package org.telegram.ui.Components;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class sl extends ViewOutlineProvider {
    public final int f28725a;
    public final Object f28726b;

    public sl(Object obj, int i10) {
        this.f28725a = i10;
        this.f28726b = obj;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float f10;
        float f11;
        int i10 = this.f28725a;
        Object obj = this.f28726b;
        switch (i10) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                li liVar = chatAttachAlertPhotoLayout.f24278b;
                float f12 = liVar.D0[1];
                zh zhVar = liVar.f26762y2;
                if (zhVar != null) {
                    f10 = zhVar.d() + AndroidUtilities.dp(16.0f);
                } else {
                    f10 = 0.0f;
                }
                int min = (int) Math.min((liVar.getContainerView().getTranslationY() + ((f12 - f10) + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY(), view.getMeasuredHeight());
                if (chatAttachAlertPhotoLayout.V) {
                    min = view.getMeasuredHeight();
                } else if (chatAttachAlertPhotoLayout.f22899a0) {
                    min = AndroidUtilities.lerp(min, view.getMeasuredHeight(), chatAttachAlertPhotoLayout.f22901b0);
                }
                boolean z4 = chatAttachAlertPhotoLayout.f22899a0;
                if (z4) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f13 = chatAttachAlertPhotoLayout.f22920k1;
                    boolean z10 = ChatAttachAlertPhotoLayout.f22894n1;
                    float f14 = 1.0f - chatAttachAlertPhotoLayout.f22901b0;
                    rectF.set((0.0f * f14) + f13, (f14 * chatAttachAlertPhotoLayout.T) + chatAttachAlertPhotoLayout.f22914h1, chatAttachAlertPhotoLayout.f22918j1, chatAttachAlertPhotoLayout.f22916i1);
                    outline.setRect((int) rectF.left, (int) rectF.top, (int) rectF.right, Math.min(min, (int) rectF.bottom));
                    return;
                } else if (!z4 && !chatAttachAlertPhotoLayout.V) {
                    int dp = AndroidUtilities.dp(16.0f);
                    boolean z11 = ChatAttachAlertPhotoLayout.f22894n1;
                    outline.setRoundRect((int) 0.0f, (int) chatAttachAlertPhotoLayout.T, view.getMeasuredWidth() + dp, Math.min(min, view.getMeasuredHeight()) + dp, dp);
                    return;
                } else {
                    outline.setRect(0, 0, view.getMeasuredWidth(), Math.min(min, view.getMeasuredHeight()));
                    return;
                }
            case 1:
                int i11 = ((x50) obj).K0;
                outline.setOval(0, 0, i11, i11);
                return;
            case 2:
                outline.setRoundRect(0, ((qb0) obj).Q + 1, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(8.0f));
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
                if (s2Var.f29908b < 1.0f) {
                    outline.setRect((int) s2Var.L, (int) s2Var.K, (int) (view.getMeasuredWidth() - s2Var.L), (int) (view.getMeasuredHeight() - s2Var.K));
                    return;
                } else {
                    outline.setRoundRect((int) s2Var.L, (int) s2Var.K, (int) (view.getMeasuredWidth() - s2Var.L), (int) (view.getMeasuredHeight() - s2Var.K), s2Var.f29908b);
                    return;
                }
            case 5:
                outline.setRoundRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + PremiumPreviewFragment.e0((PremiumPreviewFragment) obj).getBottom(), view.getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(16.0f));
                return;
            default:
                pg.a aVar = ((pg.b) obj).h;
                pg.b.h(outline, aVar.f41212m, aVar.f41204b);
                return;
        }
    }
}
