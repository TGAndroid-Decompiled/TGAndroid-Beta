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
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.cells.BaseCell;
import org.telegram.ui.Components.RadioButton;

public class SelectorCountryCell extends BaseCell {
    private final CheckBox2 checkBox;
    private TLRPC.TL_help_country country;
    private TextPaint paint;
    private final Runnable setCountryRunnable;

    @Override
    protected int dividerPadding() {
        return 22;
    }

    @Override
    protected int getFullHeight() {
        return 44;
    }

    @Override
    protected boolean needCheck() {
        return true;
    }

    public SelectorCountryCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.paint = new TextPaint();
        this.setCountryRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.setCountryInternal();
            }
        };
        this.paint.setTextSize(AndroidUtilities.dp(20.0f));
        this.radioButton.setVisibility(8);
        this.imageView.setVisibility(8);
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setDrawBackgroundAsArc(10);
        addView(checkBox2);
        checkBox2.setChecked(false, false);
        checkBox2.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override
    protected void updateLayouts() {
        SimpleTextView simpleTextView = this.titleTextView;
        boolean z = LocaleController.isRTL;
        simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 52.0f, 0.0f, z ? 52.0f : 20.0f, 0.0f));
        SimpleTextView simpleTextView2 = this.subtitleTextView;
        boolean z2 = LocaleController.isRTL;
        simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 52.0f, 0.0f, z2 ? 52.0f : 20.0f, 0.0f));
        RadioButton radioButton = this.radioButton;
        boolean z3 = LocaleController.isRTL;
        radioButton.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }

    public void setCountry(TLRPC.TL_help_country tL_help_country, boolean z) {
        this.country = tL_help_country;
        setCountryInternal();
        setDivider(z);
    }

    public void setCountryInternal() {
        this.titleTextView.setText(getCountryNameWithFlag(this.country));
    }

    private CharSequence getCountryNameWithFlag(TLRPC.TL_help_country tL_help_country) {
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
        return spannableStringBuilder;
    }

    public TLRPC.TL_help_country getCountry() {
        return this.country;
    }

    @Override
    public void setChecked(boolean z, boolean z2) {
        if (this.checkBox.getVisibility() == 0) {
            this.checkBox.setChecked(z, z2);
        }
    }

    private static class SpaceDrawable extends ReplacementSpan {
        private final int size;

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        public SpaceDrawable(int i) {
            this.size = i;
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return AndroidUtilities.dp(this.size);
        }
    }
}
