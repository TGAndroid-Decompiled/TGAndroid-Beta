package org.telegram.ui.Components.dialogs;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;

public abstract class DialogMediaIconsHelper {
    private static final SparseArray spans = new SparseArray(6);

    public static CharSequence addDialogMediaSpan(CharSequence charSequence, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        if (z) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = spans;
        ColoredImageSpan coloredImageSpan = (ColoredImageSpan) sparseArray.get(i);
        if (coloredImageSpan == null) {
            coloredImageSpan = new ColoredImageSpan(i);
            coloredImageSpan.setColorKey(Theme.key_telegram_color_text);
            sparseArray.put(i, coloredImageSpan);
        }
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
        if (z) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
