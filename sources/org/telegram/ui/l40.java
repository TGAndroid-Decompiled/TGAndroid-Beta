package org.telegram.ui;

import org.telegram.messenger.LocaleController;
public final class l40 extends org.telegram.ui.Components.xc0 {
    public l40(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Minutes", i10, new Object[0]);
    }
}
