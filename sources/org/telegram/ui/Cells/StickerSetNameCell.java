package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.ColorSpanUnderline;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;

public final class StickerSetNameCell extends FrameLayout {
    public final ImageView buttonView;
    public final TextView editView;
    public boolean empty;
    public final Theme.ResourcesProvider resourcesProvider;
    public CharSequence stickerSetName;
    public int stickerSetNameSearchIndex;
    public int stickerSetNameSearchLength;
    public final TextView textView;
    public CharSequence url;
    public int urlSearchLength;
    public final TextView urlTextView;

    public StickerSetNameCell(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider, boolean z3) {
        ViewGroup.LayoutParams layoutParamsCreateFrame;
        ViewGroup.LayoutParams layoutParamsCreateFrame2;
        super(context);
        this.resourcesProvider = resourcesProvider;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.textView = textView;
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(15.0f, z3 ? getGlassIconColor(0.6f) : Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider), 1, textView);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z2) {
            layoutParamsCreateFrame = LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, z ? 5.0f : 15.0f, 5.0f, z ? 15.0f : 25.0f, 0.0f);
        } else {
            layoutParamsCreateFrame = LayoutHelper.createFrame(-2, -2.0f, 51, z ? 5.0f : 15.0f, 5.0f, z ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, layoutParamsCreateFrame);
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-2, -2, 1.0f, 16), context);
        this.editView = textViewM;
        textViewM.setTextColor(z3 ? getGlassIconColor(0.6f) : Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider));
        textViewM.setTextSize(1, 11.0f);
        textViewM.setTypeface(AndroidUtilities.bold());
        textViewM.setEllipsize(truncateAt);
        textViewM.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int iDp = AndroidUtilities.dp(9.0f);
        int glassIconColor = z3 ? getGlassIconColor(0.05f) : Theme.multAlpha(0.1f, Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider));
        int glassIconColor2 = z3 ? getGlassIconColor(0.08f) : Theme.multAlpha(0.24f, Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider));
        textViewM.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, glassIconColor, glassIconColor2, glassIconColor2));
        textViewM.setGravity(17);
        textViewM.setSingleLine(true);
        ScaleStateListAnimator.apply(textViewM, 0.1f, 1.5f);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        textViewM.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.urlTextView = textView2;
        textView2.setTextColor(z3 ? getGlassIconColor(0.6f) : Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider));
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z2 ? LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : LayoutHelper.createFrame(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.buttonView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(z3 ? getGlassIconColor(0.6f) : Theme.getColor(Theme.key_chat_emojiPanelStickerSetNameIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 3, -1));
        if (z2) {
            layoutParamsCreateFrame2 = LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z ? 0.0f : 10.0f, 0.0f);
        } else {
            layoutParamsCreateFrame2 = LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 0.0f, z ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, layoutParamsCreateFrame2);
    }

    public final int getGlassIconColor(float f) {
        return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), (int) (f * 255.0f));
    }

    public TextView getTextView() {
        return this.textView;
    }

    @Override
    public final void invalidate() {
        this.textView.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view == this.urlTextView) {
            i2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.textView.getMeasuredWidth(), 16.0f, i2);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.empty) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.editView;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.textView.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.buttonView.setOnClickListener(onClickListener);
    }

    public final void setText(CharSequence charSequence, int i, String str, int i2, int i3) {
        this.stickerSetName = charSequence;
        this.stickerSetNameSearchIndex = i2;
        this.stickerSetNameSearchLength = i3;
        TextView textView = this.textView;
        ImageView imageView = this.buttonView;
        if (charSequence == null) {
            this.empty = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.empty = false;
            if (i3 != 0) {
                updateTextSearchSpan();
            } else {
                textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
            }
            if (i != 0) {
                imageView.setImageResource(i);
                imageView.setContentDescription(str);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.editView.setVisibility(8);
    }

    public void setTitleColor(int i) {
        this.textView.setTextColor(i);
    }

    public final void setUrl(int i, CharSequence charSequence) {
        this.url = charSequence;
        this.urlSearchLength = i;
        this.urlTextView.setVisibility(charSequence != null ? 0 : 8);
        updateUrlSearchSpan();
    }

    public final void updateTextSearchSpan() {
        if (this.stickerSetName == null || this.stickerSetNameSearchLength <= 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.stickerSetName);
        try {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Theme.getColor(Theme.key_chat_emojiPanelStickerSetNameHighlight, this.resourcesProvider));
            int i = this.stickerSetNameSearchIndex;
            spannableStringBuilder.setSpan(foregroundColorSpan, i, this.stickerSetNameSearchLength + i, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.textView;
        textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
    }

    public final void updateUrlSearchSpan() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (this.url != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.url);
            try {
                spannableStringBuilder.setSpan(new ColorSpanUnderline(Theme.getColor(Theme.key_chat_emojiPanelStickerSetNameHighlight, resourcesProvider)), 0, this.urlSearchLength, 33);
                spannableStringBuilder.setSpan(new ColorSpanUnderline(Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider)), this.urlSearchLength, this.url.length(), 33);
            } catch (Exception unused) {
            }
            this.urlTextView.setText(spannableStringBuilder);
        }
    }
}
