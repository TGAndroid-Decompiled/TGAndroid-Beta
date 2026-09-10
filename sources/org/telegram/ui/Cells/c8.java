package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;
public final class c8 extends org.telegram.ui.ActionBar.l5 {
    @Override
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
