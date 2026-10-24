package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.FileLog;
public final class j4 extends org.telegram.ui.ActionBar.h3 {
    public j4(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, (Context) activity, g6Var, false);
        this.behindKeyboardColorKey = org.telegram.ui.ActionBar.k6.f21126a7;
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
            setBackgroundColor(themedColor);
            if (this.navBarColor != themedColor) {
                fixNavigationBar(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
