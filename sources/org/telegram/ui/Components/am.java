package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class am extends ViewOutlineProvider {
    public final cm f26800a;

    public am(cm cmVar) {
        this.f26800a = cmVar;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
        if (r5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) r5Var.getTag()).intValue();
        cm cmVar = this.f26800a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.v;
        if (cmVar.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.K0) {
            intValue++;
        }
        if (chatAttachAlertPhotoLayout.f26262c1) {
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
