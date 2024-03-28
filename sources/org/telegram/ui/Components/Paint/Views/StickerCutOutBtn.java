package org.telegram.ui.Components.Paint.Views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
@SuppressLint({"ViewConstructor"})
public class StickerCutOutBtn extends ButtonWithCounterView {
    protected final BlurringShader.StoryBlurDrawer blurDrawer;
    protected final RectF bounds;
    private int state;
    private final StickerMakerView stickerMakerView;

    public StickerCutOutBtn(StickerMakerView stickerMakerView, Context context, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
        super(context, false, resourcesProvider);
        this.bounds = new RectF();
        this.stickerMakerView = stickerMakerView;
        this.blurDrawer = new BlurringShader.StoryBlurDrawer(blurManager, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.text.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        setForeground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 8, 8));
    }

    @Override
    public void setAlpha(float f) {
        if (!this.stickerMakerView.hasSegmentedBitmap()) {
            f = 0.0f;
        }
        super.setAlpha(f);
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.bounds.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onDraw(canvas);
    }

    @Override
    public void setVisibility(int i) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }

    public void setCutOutState(boolean z) {
        this.state = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.media_magic_cut);
        coloredImageSpan.setSize(AndroidUtilities.dp(22.0f));
        coloredImageSpan.setTranslateX(AndroidUtilities.dp(-2.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        setText(spannableStringBuilder, z);
    }

    public void setUndoCutState(boolean z) {
        this.state = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.photo_undo2);
        coloredImageSpan.setSize(AndroidUtilities.dp(20.0f));
        coloredImageSpan.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndoCutOut));
        setText(spannableStringBuilder, z);
    }

    public void setCancelState(boolean z) {
        this.state = 2;
        setText(LocaleController.getString(R.string.Cancel), z);
    }

    public boolean isCutOutState() {
        return this.state == 0;
    }

    public boolean isCancelState() {
        return this.state == 2;
    }

    public void clean() {
        setCutOutState(false);
    }

    public void invalidateBlur() {
        invalidate();
    }
}
