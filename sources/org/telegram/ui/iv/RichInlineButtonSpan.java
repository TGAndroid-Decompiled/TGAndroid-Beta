package org.telegram.ui.iv;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.Theme;

public final class RichInlineButtonSpan extends ReplacementSpan {
    public RichEditText attachedView;
    public final TL_iv.textButton button;
    public int currentAccount = UserConfig.selectedAccount;
    public RichMessageLayout.RichButtonSpan renderedSpan;
    public Theme.ResourcesProvider resourcesProvider;

    public RichInlineButtonSpan(TL_iv.textButton textbutton) {
        this.button = textbutton;
    }

    public static boolean isSupported(TL_keyboard.InlineButtonType inlineButtonType) {
        return (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        ensureRenderer().draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    public final RichMessageLayout.RichButtonSpan ensureRenderer() {
        if (this.renderedSpan == null) {
            RichMessageLayout.RichButtonSpan richButtonSpanCreateEditorButtonSpan = RichMessageLayout.createEditorButtonSpan(this.currentAccount, AndroidUtilities.dp(240.0f), this.resourcesProvider, this.button);
            this.renderedSpan = richButtonSpanCreateEditorButtonSpan;
            RichEditText richEditText = this.attachedView;
            if (richEditText != null) {
                richButtonSpanCreateEditorButtonSpan.attach(richEditText);
            }
        }
        return this.renderedSpan;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return ensureRenderer().getSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    public final void removeNestedReplacementSpans(Editable editable) {
        int spanStart = editable.getSpanStart(this);
        int spanEnd = editable.getSpanEnd(this);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        for (ReplacementSpan replacementSpan : (ReplacementSpan[]) editable.getSpans(spanStart, spanEnd, ReplacementSpan.class)) {
            if (replacementSpan != this) {
                int spanStart2 = editable.getSpanStart(replacementSpan);
                int spanEnd2 = editable.getSpanEnd(replacementSpan);
                if (spanStart2 < spanEnd && spanEnd2 > spanStart) {
                    editable.removeSpan(replacementSpan);
                }
            }
        }
    }
}
