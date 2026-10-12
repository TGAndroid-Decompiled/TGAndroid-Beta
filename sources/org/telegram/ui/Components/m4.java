package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
public final class m4 extends yd0 {
    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
    }
}
