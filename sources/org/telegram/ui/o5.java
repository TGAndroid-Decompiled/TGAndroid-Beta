package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class o5 extends org.telegram.ui.Cells.v4 {

    public final int f40987f;

    public o5(Context context, int i10) {
        super(context);
        this.f40987f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f40987f) {
            case 0:
                break;
        }
        return AndroidUtilities.dp(50.0f);
    }
}
