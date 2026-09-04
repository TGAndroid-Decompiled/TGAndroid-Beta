package org.telegram.ui;

import org.telegram.messenger.LocaleController;
public final class n40 extends org.telegram.ui.Components.vc0 {
    public n40(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
