package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n5 extends org.telegram.ui.Cells.z4 {
    public final int f35891f;

    public n5(Context context, int i10) {
        super(context);
        this.f35891f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f35891f) {
            case 0:
                return AndroidUtilities.dp(50.0f);
            default:
                return AndroidUtilities.dp(50.0f);
        }
    }
}
