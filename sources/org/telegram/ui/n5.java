package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n5 extends org.telegram.ui.Cells.y4 {
    public final int f40591f;

    public n5(Context context, int i9) {
        super(context);
        this.f40591f = i9;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f40591f) {
            case 0:
                return AndroidUtilities.dp(50.0f);
            default:
                return AndroidUtilities.dp(50.0f);
        }
    }
}
