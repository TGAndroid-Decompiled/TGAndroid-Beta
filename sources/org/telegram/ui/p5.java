package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends org.telegram.ui.Cells.y4 {
    public final int f36327f;

    public p5(Context context, int i10) {
        super(context);
        this.f36327f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f36327f) {
            case 0:
                return AndroidUtilities.dp(50.0f);
            default:
                return AndroidUtilities.dp(50.0f);
        }
    }
}
