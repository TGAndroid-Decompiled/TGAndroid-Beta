package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class bm extends ViewOutlineProvider {
    public final dm f23719a;

    public bm(dm dmVar) {
        this.f23719a = dmVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (s5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) s5Var.getTag()).intValue();
        dm dmVar = this.f23719a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.v;
        if (dmVar.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0 && !chatAttachAlertPhotoLayout.L0) {
            intValue++;
        }
        if (chatAttachAlertPhotoLayout.f22879d1) {
            intValue++;
        }
        if (intValue == 0) {
            int dp = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(0, 0, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp, dp);
        } else if (intValue == chatAttachAlertPhotoLayout.J0 - 1) {
            int dp2 = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(-dp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + dp2, dp2);
        } else {
            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
