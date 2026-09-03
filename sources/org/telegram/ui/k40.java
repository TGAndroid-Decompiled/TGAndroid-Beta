package org.telegram.ui;

import org.telegram.messenger.LocaleController;
public final class k40 extends org.telegram.ui.Components.xc0 {
    public k40(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
