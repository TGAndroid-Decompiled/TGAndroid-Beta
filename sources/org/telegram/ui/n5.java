package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n5 extends org.telegram.ui.Cells.x4 {
    public final int f38856f;

    public n5(Context context, int i10) {
        super(context);
        this.f38856f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f38856f) {
            case 0:
                return AndroidUtilities.dp(50.0f);
            default:
                return AndroidUtilities.dp(50.0f);
        }
    }
}
