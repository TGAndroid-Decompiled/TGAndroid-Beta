package org.telegram.ui.Components.Reactions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

@SuppressLint({"ViewConstructor"})
public class UpdateReactionsButton extends ButtonWithCounterView {
    private SpannableStringBuilder lock;

    public UpdateReactionsButton(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
    }

    public void setDefaultState() {
        setText(new SpannableStringBuilder(LocaleController.getString("ReactionUpdateReactionsBtn", R.string.ReactionUpdateReactionsBtn)), false);
        this.lock = new SpannableStringBuilder("l");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
        coloredImageSpan.setTopOffset(1);
        this.lock.setSpan(coloredImageSpan, 0, 1, 33);
    }

    public void setLvlRequiredState(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.lock).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i, new Object[0]));
        setSubText(spannableStringBuilder, true);
    }

    public void removeLvlRequiredState() {
        setSubText(null, true);
    }
}
