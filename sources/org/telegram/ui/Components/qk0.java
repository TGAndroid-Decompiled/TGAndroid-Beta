package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class qk0 extends k10 {
    public final vk0 U;

    public qk0(vk0 vk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = vk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        vb0 vb0Var;
        vk0 vk0Var = this.U;
        if (!vk0Var.H.isEmpty() && (vb0Var = vk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + vb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
