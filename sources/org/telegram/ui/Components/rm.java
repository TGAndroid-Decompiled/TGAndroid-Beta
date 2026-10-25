package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class rm extends ViewOutlineProvider {
    public final tm f32268a;

    public rm(tm tmVar) {
        this.f32268a = tmVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
        if (x5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) x5Var.getTag()).intValue();
        tm tmVar = this.f32268a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tmVar.v;
        if (tmVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && !chatAttachAlertPhotoLayout.O0) {
            intValue++;
        }
        if (chatAttachAlertPhotoLayout.f26031g1) {
            intValue++;
        }
        if (intValue == 0) {
            int dp = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(0, 0, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp, dp);
        } else if (intValue == chatAttachAlertPhotoLayout.M0 - 1) {
            int dp2 = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(-dp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + dp2, dp2);
        } else {
            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
