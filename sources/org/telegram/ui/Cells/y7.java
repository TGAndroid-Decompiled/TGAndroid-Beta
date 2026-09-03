package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;
public final class y7 extends org.telegram.ui.ActionBar.k5 {
    @Override
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
