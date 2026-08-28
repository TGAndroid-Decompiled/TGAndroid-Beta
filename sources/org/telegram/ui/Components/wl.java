package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class wl extends ViewOutlineProvider {
    public final yl f34289a;

    public wl(yl ylVar) {
        this.f34289a = ylVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        if (t5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) t5Var.getTag()).intValue();
        yl ylVar = this.f34289a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.v;
        if (ylVar.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.K0) {
            intValue++;
        }
        if (chatAttachAlertPhotoLayout.f26251c1) {
            intValue++;
        }
        if (intValue == 0) {
            int dp = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(0, 0, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp, dp);
        } else if (intValue == chatAttachAlertPhotoLayout.I0 - 1) {
            int dp2 = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(-dp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + dp2, dp2);
        } else {
            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
