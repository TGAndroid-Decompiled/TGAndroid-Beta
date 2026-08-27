package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

public final class mt0 extends org.telegram.ui.Cells.s1 {
    public final int Be = 1;

    public mt0(Context context, int i10) {
        super(context, i10);
    }

    @Override
    public int getParentWidth() {
        int measuredWidth;
        int iDp;
        switch (this.Be) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    measuredWidth = getMeasuredWidth();
                    iDp = AndroidUtilities.dp(24.0f);
                } else {
                    measuredWidth = AndroidUtilities.displaySize.x;
                    iDp = AndroidUtilities.dp(24.0f);
                }
                return measuredWidth - iDp;
            default:
                return super.getParentWidth();
        }
    }

    @Override
    public final boolean isPressed() {
        switch (this.Be) {
        }
        return false;
    }

    public mt0(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, z10, chatMessageSharedResources, c6Var);
    }
}
