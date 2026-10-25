package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;
public final class e8 extends org.telegram.ui.ActionBar.b6 {
    @Override
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
