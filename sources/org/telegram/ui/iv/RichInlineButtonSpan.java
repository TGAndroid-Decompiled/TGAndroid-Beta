package org.telegram.ui.iv;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.Theme;

public class RichInlineButtonSpan extends ReplacementSpan {
    private View attachedView;
    private final TL_iv.textButton button;
    private int currentAccount = UserConfig.selectedAccount;
    private RichMessageLayout.RichButtonSpan renderedSpan;
    private Theme.ResourcesProvider resourcesProvider;

    public RichInlineButtonSpan(TL_iv.textButton textbutton) {
        this.button = textbutton;
    }

    public TL_iv.textButton getButton() {
        return this.button;
    }

    public static boolean isSupported(TL_keyboard.InlineButtonType inlineButtonType) {
        return (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile);
    }

    public void removeNestedReplacementSpans(Spannable spannable) {
        if (spannable == null) {
            return;
        }
        int spanStart = spannable.getSpanStart(this);
        int spanEnd = spannable.getSpanEnd(this);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        for (ReplacementSpan replacementSpan : (ReplacementSpan[]) spannable.getSpans(spanStart, spanEnd, ReplacementSpan.class)) {
            if (replacementSpan != this) {
                int spanStart2 = spannable.getSpanStart(replacementSpan);
                int spanEnd2 = spannable.getSpanEnd(replacementSpan);
                if (spanStart2 < spanEnd && spanEnd2 > spanStart) {
                    spannable.removeSpan(replacementSpan);
                }
            }
        }
    }

    public void bind(View view, int i, Theme.ResourcesProvider resourcesProvider) {
        View view2;
        RichMessageLayout.RichButtonSpan richButtonSpan = this.renderedSpan;
        if (richButtonSpan != null && (view2 = this.attachedView) != null) {
            richButtonSpan.detach(view2);
        }
        this.attachedView = view;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        this.renderedSpan = null;
        ensureRenderer();
    }

    public void detach(View view) {
        RichMessageLayout.RichButtonSpan richButtonSpan = this.renderedSpan;
        if (richButtonSpan == null || this.attachedView != view) {
            return;
        }
        richButtonSpan.detach(view);
        this.attachedView = null;
    }

    private RichMessageLayout.RichButtonSpan ensureRenderer() {
        if (this.renderedSpan == null) {
            RichMessageLayout.RichButtonSpan richButtonSpanCreateEditorButtonSpan = RichMessageLayout.createEditorButtonSpan(this.currentAccount, AndroidUtilities.dp(240.0f), this.resourcesProvider, this.button);
            this.renderedSpan = richButtonSpanCreateEditorButtonSpan;
            View view = this.attachedView;
            if (view != null) {
                richButtonSpanCreateEditorButtonSpan.attach(view);
            }
        }
        return this.renderedSpan;
    }

    public void setPressed(boolean z) {
        ensureRenderer().setPressed(z);
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return ensureRenderer().getSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        ensureRenderer().draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
