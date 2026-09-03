package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;
public final class du0 extends org.telegram.ui.Cells.t1 {
    public final int Ce = 1;

    public du0(Context context, int i10) {
        super(context, i10);
    }

    @Override
    public int getParentWidth() {
        int i10;
        int dp;
        switch (this.Ce) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i10 = getMeasuredWidth();
                    dp = AndroidUtilities.dp(24.0f);
                } else {
                    i10 = AndroidUtilities.displaySize.x;
                    dp = AndroidUtilities.dp(24.0f);
                }
                return i10 - dp;
            default:
                return super.getParentWidth();
        }
    }

    @Override
    public final boolean isPressed() {
        switch (this.Ce) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public du0(Context context, int i10, boolean z4, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, z4, chatMessageSharedResources, g6Var);
    }
}
