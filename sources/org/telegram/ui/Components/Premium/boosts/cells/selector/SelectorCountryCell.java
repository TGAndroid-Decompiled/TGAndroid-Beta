package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.cells.BaseCell;

public final class SelectorCountryCell extends BaseCell {
    public final CheckBox2 checkBox;
    public TLRPC.TL_help_country country;
    public final TextPaint paint;
    public final PasscodeView$9$$ExternalSyntheticLambda0 setCountryRunnable;

    public final class SpaceDrawable extends ReplacementSpan {
        public final int size;

        public SpaceDrawable(int i) {
            this.size = i;
        }

        @Override
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return AndroidUtilities.dp(this.size);
        }
    }

    public SelectorCountryCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        TextPaint textPaint = new TextPaint();
        this.paint = textPaint;
        this.setCountryRunnable = new PasscodeView$9$$ExternalSyntheticLambda0(this, 25);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.radioButton.setVisibility(8);
        this.imageView.setVisibility(8);
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        int i = Theme.key_dialogRoundCheckBox;
        int i2 = Theme.key_checkboxDisabled;
        int i3 = Theme.key_dialogRoundCheckBoxCheck;
        CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
        checkBoxBase.setColor(i, i2, i3);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setDrawBackgroundAsArc(10);
        addView(checkBox2);
        checkBoxBase.setChecked(-1, false, false);
        checkBox2.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override
    public final int dividerPadding() {
        return 22;
    }

    public TLRPC.TL_help_country getCountry() {
        return this.country;
    }

    @Override
    public int getFullHeight() {
        return 44;
    }

    @Override
    public final boolean needCheck() {
        return true;
    }

    @Override
    public final void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2.getVisibility() == 0) {
            checkBox2.checkBoxBase.setChecked(-1, z, z2);
        }
    }

    public final void setCountryInternal() {
        TLRPC.TL_help_country tL_help_country = this.country;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequenceReplaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.paint.getFontMetricsInt(), 0, this.setCountryRunnable);
        if (charSequenceReplaceWithRestrictedEmoji != null) {
            spannableStringBuilder.append(charSequenceReplaceWithRestrictedEmoji).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new SpaceDrawable(16), charSequenceReplaceWithRestrictedEmoji.length(), charSequenceReplaceWithRestrictedEmoji.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new SpaceDrawable(34), 0, 1, 0);
        }
        String countryName = LocaleController.getCountryName(tL_help_country.iso2);
        if (TextUtils.isEmpty(countryName)) {
            countryName = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) countryName);
        this.titleTextView.setText(spannableStringBuilder);
    }

    @Override
    public final void updateLayouts() {
        boolean z = LocaleController.isRTL;
        this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 52.0f, 0.0f, z ? 52.0f : 20.0f, 0.0f));
        boolean z2 = LocaleController.isRTL;
        this.subtitleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 52.0f, 0.0f, z2 ? 52.0f : 20.0f, 0.0f));
        boolean z3 = LocaleController.isRTL;
        this.radioButton.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }
}
