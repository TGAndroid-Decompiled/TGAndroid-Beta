package org.telegram.ui.Components.Paint.Views;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class StickerCutOutBtn extends ButtonWithCounterView {
    public final BlurringShader.StoryBlurDrawer blurDrawer;
    public final RectF bounds;
    public int rad;
    public final Theme.ResourcesProvider resourcesProvider;
    public int state;
    public final StickerMakerView stickerMakerView;
    public boolean wrapContent;

    public StickerCutOutBtn(StickerMakerView stickerMakerView, ContextThemeWrapper contextThemeWrapper, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
        super(contextThemeWrapper, resourcesProvider, false);
        this.bounds = new RectF();
        this.rad = 8;
        this.resourcesProvider = resourcesProvider;
        this.stickerMakerView = stickerMakerView;
        this.blurDrawer = new BlurringShader.StoryBlurDrawer(blurManager, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
        removeView(this.rippleView);
        setForeground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z = this.wrapContentDynamic;
        RectF rectF = this.bounds;
        if (z) {
            float currentWidth = this.text.getCurrentWidth() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - currentWidth) / 2.0f, 0.0f, (getMeasuredWidth() + currentWidth) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.wrapContent) {
            i = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.text.getCurrentWidth()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override
    public void setAlpha(float f) {
        StickerMakerView.SegmentedObject[] segmentedObjectArr;
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (!stickerMakerView.segmentingLoaded || (segmentedObjectArr = stickerMakerView.objects) == null || segmentedObjectArr.length <= 0) {
            f = 0.0f;
        }
        super.setAlpha(f);
    }

    public void setCancelState(boolean z) {
        this.state = 2;
        setText(LocaleController.getString(R.string.Cancel), z, true);
    }

    public void setCutOutState(boolean z) {
        this.state = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.media_magic_cut);
        coloredImageSpan.setSize(AndroidUtilities.dp(22.0f));
        coloredImageSpan.setTranslateX(AndroidUtilities.dp(1.0f));
        coloredImageSpan.setTranslateY(AndroidUtilities.dp(2.0f));
        coloredImageSpan.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        setText(spannableStringBuilder, z, true);
    }

    public void setEraseState(boolean z) {
        this.state = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.media_button_erase);
        coloredImageSpan.setSize(AndroidUtilities.dp(20.0f));
        coloredImageSpan.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        setText(spannableStringBuilder, z, true);
    }

    public void setOutlineState(boolean z) {
        this.state = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.media_sticker_stroke);
        coloredImageSpan.setSize(AndroidUtilities.dp(20.0f));
        coloredImageSpan.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        setText(spannableStringBuilder, z, true);
    }

    public void setRad(int i) {
        this.rad = i;
        setForeground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), i, i));
    }

    public void setRestoreState(boolean z) {
        this.state = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.media_button_restore);
        coloredImageSpan.setSize(AndroidUtilities.dp(20.0f));
        coloredImageSpan.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        setText(spannableStringBuilder, z, true);
    }

    public void setUndoCutState(boolean z) {
        this.state = 1;
    }

    public void setUndoState(boolean z) {
        this.state = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.photo_undo2);
        coloredImageSpan.setSize(AndroidUtilities.dp(20.0f));
        coloredImageSpan.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndo));
        setText(spannableStringBuilder, z, true);
    }

    @Override
    public void setVisibility(int i) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }
}
