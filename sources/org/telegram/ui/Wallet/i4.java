package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.FileLog;
public final class i4 extends org.telegram.ui.ActionBar.k3 {
    public i4(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, (Context) activity, u6Var, false);
        this.behindKeyboardColorKey = org.telegram.ui.ActionBar.y6.f23297a7;
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7);
            setBackgroundColor(themedColor);
            if (this.navBarColor != themedColor) {
                fixNavigationBar(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
