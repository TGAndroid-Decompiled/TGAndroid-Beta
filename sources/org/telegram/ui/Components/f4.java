package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
public final class f4 extends bc0 {
    @Override
    public final CharSequence d(int i9) {
        return LocaleController.formatPluralString("Times", i9 + 1, new Object[0]);
    }
}
