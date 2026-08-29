package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;
public final class vt0 extends org.telegram.ui.Cells.s1 {
    public final int Be = 1;

    public vt0(Context context, int i10) {
        super(context, i10);
    }

    @Override
    public int getParentWidth() {
        int i10;
        int dp;
        switch (this.Be) {
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
        switch (this.Be) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public vt0(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, z10, chatMessageSharedResources, c6Var);
    }
}
