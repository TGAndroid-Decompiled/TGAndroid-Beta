package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends org.telegram.ui.Cells.y4 {
    public final int f37589f;

    public q5(Context context, int i10) {
        super(context);
        this.f37589f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f37589f) {
            case 0:
                return AndroidUtilities.dp(50.0f);
            default:
                return AndroidUtilities.dp(50.0f);
        }
    }
}
