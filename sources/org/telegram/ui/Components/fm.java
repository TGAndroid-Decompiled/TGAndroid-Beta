package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class fm extends ViewOutlineProvider {
    public final hm f24279a;

    public fm(hm hmVar) {
        this.f24279a = hmVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
        if (u5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) u5Var.getTag()).intValue();
        hm hmVar = this.f24279a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        if (hmVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && !chatAttachAlertPhotoLayout.O0) {
            intValue++;
        }
        if (chatAttachAlertPhotoLayout.f22153g1) {
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
