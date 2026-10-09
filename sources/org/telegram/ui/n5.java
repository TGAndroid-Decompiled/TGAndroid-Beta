package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n5 extends org.telegram.ui.Cells.y4 {
    public final int f40075f;

    public n5(Context context, int i10) {
        super(context);
        this.f40075f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f40075f) {
            case 0:
                return AndroidUtilities.dp(50.0f);
            default:
                return AndroidUtilities.dp(50.0f);
        }
    }
}
