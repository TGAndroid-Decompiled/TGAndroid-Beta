package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ej0 extends lg.d {
    @Override
    public final int getHeaderHeight() {
        if (getResources().getConfiguration().orientation == 2) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(54.0f);
    }
}
