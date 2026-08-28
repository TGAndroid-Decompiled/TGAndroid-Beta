package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;
public final class kt0 extends org.telegram.ui.Cells.t1 {
    public final int Be = 1;

    public kt0(Context context, int i9) {
        super(context, i9);
    }

    @Override
    public int getParentWidth() {
        int i9;
        int dp;
        switch (this.Be) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i9 = getMeasuredWidth();
                    dp = AndroidUtilities.dp(24.0f);
                } else {
                    i9 = AndroidUtilities.displaySize.x;
                    dp = AndroidUtilities.dp(24.0f);
                }
                return i9 - dp;
            default:
                return super.getParentWidth();
        }
    }

    @Override
    public final boolean isPressed() {
        switch (this.Be) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public kt0(Context context, int i9, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, z10, chatMessageSharedResources, b6Var);
    }
}
