package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

public final class sl extends ViewOutlineProvider {

    public final ul f32480a;

    public sl(ul ulVar) {
        this.f32480a = ulVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (q5Var.getTag() == null) {
            return;
        }
        int iIntValue = ((Integer) q5Var.getTag()).intValue();
        ul ulVar = this.f32480a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ulVar.v;
        if (ulVar.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.K0) {
            iIntValue++;
        }
        if (chatAttachAlertPhotoLayout.f26247c1) {
            iIntValue++;
        }
        if (iIntValue == 0) {
            int iDp = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(0, 0, view.getMeasuredWidth() + iDp, view.getMeasuredHeight() + iDp, iDp);
        } else if (iIntValue != chatAttachAlertPhotoLayout.I0 - 1) {
            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        } else {
            int iDp2 = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(-iDp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + iDp2, iDp2);
        }
    }
}
