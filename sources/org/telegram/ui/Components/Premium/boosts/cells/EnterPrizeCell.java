package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;

public final class EnterPrizeCell extends LinearLayout {
    public AfterTextChangedListener afterTextChangedListener;
    public final EditTextCaption editText;
    public final TextView textView;

    public interface AfterTextChangedListener {
    }

    public EnterPrizeCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setOrientation(0);
        EditTextCaption editTextCaption = new EditTextCaption(context, resourcesProvider);
        this.editText = editTextCaption;
        editTextCaption.setLines(1);
        editTextCaption.setSingleLine(true);
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                CharSequence charSequenceFilter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (charSequenceFilter != null && charSequenceFilter.length() == 0) {
                    AndroidUtilities.shakeView(EnterPrizeCell.this.editText);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return charSequenceFilter;
            }
        }};
        editTextCaption.setInputType(16384);
        editTextCaption.setFilters(inputFilterArr);
        editTextCaption.setTextSize(1, 16.0f);
        editTextCaption.setTextColor(Theme.getColor(Theme.key_chat_messagePanelText, resourcesProvider));
        editTextCaption.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkOut, resourcesProvider));
        editTextCaption.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        int i = Theme.key_chat_messagePanelHint;
        editTextCaption.setHintColor(Theme.getColor(i, resourcesProvider));
        editTextCaption.setHintTextColor(Theme.getColor(i, resourcesProvider));
        editTextCaption.setCursorColor(Theme.getColor(Theme.key_chat_messagePanelCursor, resourcesProvider));
        editTextCaption.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        editTextCaption.setBackground(null);
        editTextCaption.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        editTextCaption.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 15));
        editTextCaption.setImeOptions(6);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        if (!LocaleController.isRTL) {
            addView(textView, LayoutHelper.createLinear(-2, -2, 16, 20, 0, 0, 0));
            addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, -2, 16, 20, 0, 36, 0);
            layoutParamsCreateLinear.weight = 1.0f;
            addView(editTextCaption, layoutParamsCreateLinear);
            addView(textView, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(AfterTextChangedListener afterTextChangedListener) {
        this.afterTextChangedListener = afterTextChangedListener;
    }

    public void setCount(int i) {
        this.textView.setText(String.valueOf(i));
    }
}
