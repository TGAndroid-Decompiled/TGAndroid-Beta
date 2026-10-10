package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class qk0 extends k10 {
    public final vk0 U;

    public qk0(vk0 vk0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.U = vk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        wb0 wb0Var;
        vk0 vk0Var = this.U;
        if (!vk0Var.H.isEmpty() && (wb0Var = vk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + wb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
