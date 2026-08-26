package org.telegram.ui.Components.Reactions;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class UpdateReactionsButton extends ButtonWithCounterView {
    public SpannableStringBuilder lock;

    public void setLvlRequiredState(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.lock).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i, new Object[0]));
        setSubText(spannableStringBuilder, true);
    }
}
