package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.recorder.HintView2;

public class TextCell extends FrameLayout {
    private boolean attached;
    private int changeProgressStartDelay;
    private Switch checkBox;
    private boolean drawLoading;
    private float drawLoadingProgress;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiDrawable;
    public int heightDp;
    public int imageLeft;
    public final RLottieImageView imageView;
    private boolean inDialogs;
    private boolean incrementLoadingProgress;
    private int lastWidth;
    public int leftPadding;
    private float loadingProgress;
    private int loadingSize;
    private boolean measureDelay;
    private boolean needDivider;
    public int offsetFromImage;
    Paint paint;
    private boolean prioritizeTitleOverValue;
    private Theme.ResourcesProvider resourcesProvider;
    private final SimpleTextView subtitleView;
    public final SimpleTextView textView;
    private ImageView valueImageView;
    public final SimpleTextView valueSpoilersTextView;
    private CharSequence valueText;
    public final AnimatedTextView valueTextView;

    protected int getOffsetFromImage(boolean z) {
        return z ? 52 : 58;
    }

    protected int processColor(int i) {
        return i;
    }

    public TextCell(Context context) {
        this(context, 23, false, false, null);
    }

    public TextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, 23, false, false, resourcesProvider);
    }

    public TextCell(Context context, int i, boolean z) {
        this(context, i, z, false, null);
    }

    public TextCell(Context context, int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.offsetFromImage = 58;
        this.heightDp = 50;
        this.imageLeft = 16;
        this.resourcesProvider = resourcesProvider;
        this.leftPadding = i;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(z ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView.setImportantForAccessibility(2);
        addView(simpleTextView, LayoutHelper.createFrame(-2, -1.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.subtitleView = simpleTextView2;
        simpleTextView2.setTextColor(Theme.getColor(z ? Theme.key_dialogTextGray : Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        simpleTextView2.setTextSize(13);
        simpleTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView2.setImportantForAccessibility(2);
        addView(simpleTextView2, LayoutHelper.createFrame(-2, -1.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
        this.valueTextView = animatedTextView;
        animatedTextView.setTextColor(Theme.getColor(z ? Theme.key_dialogTextBlue2 : Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
        animatedTextView.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        animatedTextView.setTextSize(AndroidUtilities.dp(16.0f));
        animatedTextView.setGravity(LocaleController.isRTL ? 3 : 5);
        animatedTextView.setImportantForAccessibility(2);
        animatedTextView.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(animatedTextView);
        SimpleTextView simpleTextView3 = new SimpleTextView(context);
        this.valueSpoilersTextView = simpleTextView3;
        simpleTextView3.setEllipsizeByGradient(18, Boolean.FALSE);
        simpleTextView3.setTextColor(Theme.getColor(z ? Theme.key_dialogTextBlue2 : Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
        simpleTextView3.setGravity(LocaleController.isRTL ? 3 : 5);
        simpleTextView3.setTextSize(16);
        simpleTextView3.setImportantForAccessibility(2);
        simpleTextView3.setVisibility(8);
        addView(simpleTextView3);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rLottieImageView.setScaleType(scaleType);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(z ? Theme.key_dialogIcon : Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
        addView(rLottieImageView);
        ImageView imageView = new ImageView(context);
        this.valueImageView = imageView;
        imageView.setScaleType(scaleType);
        addView(this.valueImageView);
        if (z2) {
            Switch r4 = new Switch(context, resourcesProvider);
            this.checkBox = r4;
            int i2 = Theme.key_switchTrack;
            int i3 = Theme.key_switchTrackChecked;
            int i4 = Theme.key_windowBackgroundWhite;
            r4.setColors(i2, i3, i4, i4);
            addView(this.checkBox, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public boolean isChecked() {
        Switch r0 = this.checkBox;
        return r0 != null && r0.isChecked();
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    public void setIsInDialogs() {
        this.inDialogs = true;
    }

    public SimpleTextView getTextView() {
        return this.textView;
    }

    public RLottieImageView getImageView() {
        return this.imageView;
    }

    public AnimatedTextView getValueTextView() {
        return this.valueTextView;
    }

    public ImageView getValueImageView() {
        return this.valueImageView;
    }

    public void setPrioritizeTitleOverValue(boolean z) {
        if (this.prioritizeTitleOverValue != z) {
            this.prioritizeTitleOverValue = z;
            requestLayout();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(this.heightDp);
        int i3 = this.lastWidth;
        if (i3 != 0 && i3 != size && (charSequence = this.valueText) != null) {
            AnimatedTextView animatedTextView = this.valueTextView;
            animatedTextView.setText(TextUtils.ellipsize(charSequence, animatedTextView.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false);
        }
        this.lastWidth = size;
        if (this.prioritizeTitleOverValue) {
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.leftPadding + 71), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            this.subtitleView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.leftPadding + 71), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.leftPadding + 103)) - this.textView.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            this.valueSpoilersTextView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.leftPadding + 103)) - this.textView.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.leftPadding), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            this.valueSpoilersTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.leftPadding), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int iMax = Math.max(this.valueTextView.width(), this.valueSpoilersTextView.getTextWidth());
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.leftPadding + 71)) - iMax), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            this.subtitleView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.leftPadding + 71)) - iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        if (this.imageView.getVisibility() == 0) {
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        if (this.valueImageView.getVisibility() == 0) {
            this.valueImageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        Switch r0 = this.checkBox;
        if (r0 != null) {
            r0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, iDp + (this.needDivider ? 1 : 0));
    }

    @Override
    public void setEnabled(boolean z) {
        setEnabled(z, true);
    }

    public void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        Switch r0 = this.checkBox;
        if (r0 != null) {
            r0.setEnabled(z);
        }
        if (z2) {
            this.textView.animate().alpha(z ? 1.0f : 0.5f).start();
            this.subtitleView.animate().alpha(z ? 1.0f : 0.5f).start();
            this.valueTextView.animate().alpha(z ? 1.0f : 0.5f).start();
            this.valueSpoilersTextView.animate().alpha(z ? 1.0f : 0.5f).start();
            return;
        }
        this.textView.setAlpha(z ? 1.0f : 0.5f);
        this.subtitleView.setAlpha(z ? 1.0f : 0.5f);
        this.valueTextView.setAlpha(z ? 1.0f : 0.5f);
        this.valueSpoilersTextView.setAlpha(z ? 1.0f : 0.5f);
    }

    public void updateEmojiBounds() {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable == null) {
            return;
        }
        swapAnimatedEmojiDrawable.setBounds((getWidth() - this.emojiDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(18.0f), (getHeight() - this.emojiDrawable.getIntrinsicHeight()) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.emojiDrawable.getIntrinsicHeight()) / 2);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int iMax = ((i5 - Math.max(this.valueSpoilersTextView.getTextHeight(), this.valueTextView.getTextHeight())) / 2) + 1;
        int iDp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.leftPadding - 6) : (i6 - this.valueTextView.getMeasuredWidth()) - AndroidUtilities.dp(this.leftPadding - 6);
        if (this.prioritizeTitleOverValue && !LocaleController.isRTL) {
            iDp2 = (i6 - this.valueTextView.getMeasuredWidth()) - AndroidUtilities.dp(this.leftPadding);
        }
        AnimatedTextView animatedTextView = this.valueTextView;
        animatedTextView.layout(iDp2, iMax, animatedTextView.getMeasuredWidth() + iDp2, this.valueTextView.getMeasuredHeight() + iMax);
        int iDp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.leftPadding - 6) : (i6 - this.valueSpoilersTextView.getMeasuredWidth()) - AndroidUtilities.dp(this.leftPadding - 6);
        SimpleTextView simpleTextView = this.valueSpoilersTextView;
        simpleTextView.layout(iDp3, iMax, simpleTextView.getMeasuredWidth() + iDp3, this.valueSpoilersTextView.getMeasuredHeight() + iMax);
        if (LocaleController.isRTL) {
            iDp = (getMeasuredWidth() - this.textView.getMeasuredWidth()) - AndroidUtilities.dp(this.imageView.getVisibility() == 0 ? this.offsetFromImage : this.leftPadding);
        } else {
            iDp = AndroidUtilities.dp(this.imageView.getVisibility() == 0 ? this.offsetFromImage : this.leftPadding);
        }
        if (this.subtitleView.getVisibility() == 0) {
            float f = this.heightDp > 50 ? 4 : 2;
            int textHeight = ((((i5 - this.textView.getTextHeight()) - this.subtitleView.getTextHeight()) - AndroidUtilities.dp(f)) / 2) + AndroidUtilities.dp(1.0f);
            SimpleTextView simpleTextView2 = this.textView;
            simpleTextView2.layout(iDp, textHeight, simpleTextView2.getMeasuredWidth() + iDp, this.textView.getMeasuredHeight() + textHeight);
            int textHeight2 = textHeight + this.textView.getTextHeight() + AndroidUtilities.dp(f);
            SimpleTextView simpleTextView3 = this.subtitleView;
            simpleTextView3.layout(iDp, textHeight2, simpleTextView3.getMeasuredWidth() + iDp, this.subtitleView.getMeasuredHeight() + textHeight2);
        } else {
            int textHeight3 = ((i5 - this.textView.getTextHeight()) / 2) + AndroidUtilities.dp(1.0f);
            SimpleTextView simpleTextView4 = this.textView;
            simpleTextView4.layout(iDp, textHeight3, simpleTextView4.getMeasuredWidth() + iDp, this.textView.getMeasuredHeight() + textHeight3);
        }
        if (this.imageView.getVisibility() == 0) {
            int iDp4 = ((AndroidUtilities.dp(this.heightDp > 50 ? 0.0f : 2.0f) + ((i5 - this.imageView.getMeasuredHeight()) / 2)) - this.imageView.getPaddingTop()) + AndroidUtilities.dp(1.0f);
            int iDp5 = !LocaleController.isRTL ? AndroidUtilities.dp(this.imageLeft) : (i6 - this.imageView.getMeasuredWidth()) - AndroidUtilities.dp(this.imageLeft);
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.layout(iDp5, iDp4, rLottieImageView.getMeasuredWidth() + iDp5, this.imageView.getMeasuredHeight() + iDp4);
        }
        if (this.valueImageView.getVisibility() == 0) {
            int measuredHeight = ((i5 - this.valueImageView.getMeasuredHeight()) / 2) + AndroidUtilities.dp(1.0f);
            int iDp6 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i6 - this.valueImageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            ImageView imageView = this.valueImageView;
            imageView.layout(iDp6, measuredHeight, imageView.getMeasuredWidth() + iDp6, this.valueImageView.getMeasuredHeight() + measuredHeight);
        }
        Switch r7 = this.checkBox;
        if (r7 == null || r7.getVisibility() != 0) {
            return;
        }
        int measuredHeight2 = (i5 - this.checkBox.getMeasuredHeight()) / 2;
        int iDp7 = LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : (i6 - this.checkBox.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
        Switch r8 = this.checkBox;
        r8.layout(iDp7, measuredHeight2, r8.getMeasuredWidth() + iDp7, this.checkBox.getMeasuredHeight() + measuredHeight2);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void updateColors() {
        int iIntValue = this.textView.getTag() instanceof Integer ? ((Integer) this.textView.getTag()).intValue() : Theme.key_windowBackgroundWhiteBlackText;
        int color = Theme.getColor(iIntValue, this.resourcesProvider);
        if (iIntValue != Theme.key_dialogTextBlack && iIntValue != Theme.key_windowBackgroundWhiteBlackText) {
            color = processColor(color);
        }
        this.textView.setTextColor(color);
        if (this.imageView.getTag() instanceof Integer) {
            int iIntValue2 = ((Integer) this.imageView.getTag()).intValue();
            int color2 = Theme.getColor(iIntValue2, this.resourcesProvider);
            if (iIntValue2 != Theme.key_dialogIcon && iIntValue2 != Theme.key_windowBackgroundWhiteGrayIcon) {
                color2 = processColor(color2);
            }
            this.imageView.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
        }
        this.subtitleView.setTextColor(processColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider)));
        AnimatedTextView animatedTextView = this.valueTextView;
        int i = Theme.key_windowBackgroundWhiteValueText;
        animatedTextView.setTextColor(processColor(Theme.getColor(i, this.resourcesProvider)));
        this.valueSpoilersTextView.setTextColor(processColor(Theme.getColor(i, this.resourcesProvider)));
    }

    public void setColors(int i, int i2) {
        this.textView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        this.textView.setTag(Integer.valueOf(i2));
        if (i >= 0) {
            this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.imageView.setTag(Integer.valueOf(i));
        }
        updateColors();
    }

    public void setText(CharSequence charSequence, boolean z) {
        this.imageLeft = 16;
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false);
        this.imageView.setVisibility(8);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z;
        setWillNotDraw(!z);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setLockLevel(boolean z, int i) {
        if (i <= 0) {
            this.textView.setRightDrawable((Drawable) null);
        } else {
            this.textView.setRightDrawable(new PeerColorActivity.LevelLock(getContext(), z, i, this.resourcesProvider));
            this.textView.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public void setTextAndIcon(CharSequence charSequence, int i, boolean z) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false);
        this.imageView.setImageResource(i);
        this.imageView.setVisibility(0);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextAndIcon(CharSequence charSequence, Drawable drawable, boolean z) {
        this.offsetFromImage = 58;
        this.imageLeft = 18;
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false);
        this.imageView.setColorFilter((ColorFilter) null);
        if (drawable instanceof RLottieDrawable) {
            this.imageView.setAnimation((RLottieDrawable) drawable);
        } else {
            this.imageView.setImageDrawable(drawable);
        }
        this.imageView.setVisibility(0);
        this.valueTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextAndValueAndIcon(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z) {
        this.offsetFromImage = 58;
        this.imageLeft = 18;
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = charSequence2;
        animatedTextView.setText(charSequence2, false);
        this.imageView.setColorFilter((ColorFilter) null);
        if (drawable instanceof RLottieDrawable) {
            this.imageView.setAnimation((RLottieDrawable) drawable);
        } else {
            this.imageView.setImageDrawable(drawable);
        }
        this.imageView.setVisibility(0);
        this.valueTextView.setVisibility(0);
        this.valueImageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setOffsetFromImage(int i) {
        this.offsetFromImage = i;
    }

    public void setImageLeft(int i) {
        this.imageLeft = i;
    }

    public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        setTextAndValue(charSequence, charSequence2, false, z);
    }

    public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        this.valueText = charSequence2;
        AnimatedTextView animatedTextView = this.valueTextView;
        animatedTextView.setText(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, animatedTextView.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), z);
        this.valueTextView.setVisibility(0);
        this.valueSpoilersTextView.setVisibility(8);
        this.imageView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        Switch r6 = this.checkBox;
        if (r6 != null) {
            r6.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setValue(CharSequence charSequence, boolean z) {
        CharSequence charSequenceEllipsize;
        AnimatedTextView animatedTextView = this.valueTextView;
        if (charSequence == null) {
            charSequenceEllipsize = "";
        } else {
            this.valueText = charSequence;
            charSequenceEllipsize = TextUtils.ellipsize(charSequence, animatedTextView.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        animatedTextView.setText(charSequenceEllipsize, z);
    }

    public void setTextAndValueAndColorfulIcon(String str, CharSequence charSequence, boolean z, int i, int i2, int i3, boolean z2) {
        CharSequence charSequenceEllipsize;
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(str);
        this.textView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        if (charSequence == null) {
            charSequenceEllipsize = "";
        } else {
            this.valueText = charSequence;
            charSequenceEllipsize = TextUtils.ellipsize(charSequence, animatedTextView.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        animatedTextView.setText(charSequenceEllipsize, z);
        this.valueTextView.setVisibility(0);
        this.valueSpoilersTextView.setVisibility(8);
        setColorfulIcon(i2, i3, i);
        this.valueImageView.setVisibility(8);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        Switch r6 = this.checkBox;
        if (r6 != null) {
            r6.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextAndCheckAndColorfulIcon(CharSequence charSequence, boolean z, int i, int i2, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        setColorfulIcon(i2, i);
        if (this.checkBox == null) {
            Switch r11 = new Switch(getContext(), this.resourcesProvider);
            this.checkBox = r11;
            int i3 = Theme.key_switchTrack;
            int i4 = Theme.key_switchTrackChecked;
            int i5 = Theme.key_windowBackgroundWhite;
            r11.setColors(i3, i4, i5, i5);
            addView(this.checkBox, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r12 = this.checkBox;
        if (r12 != null) {
            r12.setVisibility(0);
            this.checkBox.setChecked(z, false);
        }
        this.needDivider = z2;
        setWillNotDraw(!z2);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextAndSpoilersValueAndIcon(String str, CharSequence charSequence, int i, boolean z) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(str);
        this.textView.setRightDrawable((Drawable) null);
        this.valueSpoilersTextView.setVisibility(0);
        this.valueSpoilersTextView.setText(charSequence);
        this.valueTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.imageView.setVisibility(0);
        this.imageView.setTranslationX(0.0f);
        this.imageView.setTranslationY(0.0f);
        this.imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.imageView.setImageResource(i);
        this.needDivider = z;
        setWillNotDraw(!z);
        Switch r4 = this.checkBox;
        if (r4 != null) {
            r4.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextAndValueAndIcon(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        setTextAndValueAndIcon(charSequence, charSequence2, false, i, z);
    }

    public void setTextAndValueAndIcon(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        this.imageView.setVisibility(0);
        if (charSequence2 != null) {
            int iMax = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(this.offsetFromImage) + HintView2.measureCorrectly(charSequence, this.textView.getTextPaint())) + AndroidUtilities.dp(16.0f)));
            AnimatedTextView animatedTextView = this.valueTextView;
            this.valueText = charSequence2;
            animatedTextView.setText(TextUtils.ellipsize(charSequence2, animatedTextView.getPaint(), iMax, TextUtils.TruncateAt.END), z);
        } else {
            this.valueTextView.setText("", z);
        }
        this.valueTextView.setVisibility(0);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.imageView.setTranslationX(0.0f);
        this.imageView.setTranslationY(0.0f);
        this.imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.imageView.setImageResource(i);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        Switch r6 = this.checkBox;
        if (r6 != null) {
            r6.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public static CharSequence applyNewSpan(CharSequence charSequence) {
        return applyNewSpan(charSequence, false);
    }

    public static CharSequence applyNewSpan(CharSequence charSequence, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(10.0f);
        newSpan.usePaintAlpha = z;
        newSpan.setColor(Theme.getColor(Theme.key_premiumGradient1));
        spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public void setColorfulIcon(int i, int i2) {
        setColorfulIcon(i, i, i2);
    }

    public void setColorfulIcon(int i, int i2, int i3) {
        this.offsetFromImage = getOffsetFromImage(true);
        this.imageView.setVisibility(0);
        this.imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.imageView.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        this.imageView.setImageResource(i3);
        this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        SettingsActivity.SettingCell.Background background = new SettingsActivity.SettingCell.Background();
        background.setColor(i, i2);
        background.setDrawBorder(zIsDark);
        this.imageView.setBackground(background);
    }

    public void setTextAndCheck(CharSequence charSequence, boolean z, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        this.imageView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z2;
        Switch r4 = this.checkBox;
        if (r4 != null) {
            r4.setVisibility(0);
            this.checkBox.setChecked(z, false);
        }
        setWillNotDraw(!this.needDivider);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextAndCheckAndIcon(CharSequence charSequence, boolean z, int i, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        Switch r4 = this.checkBox;
        if (r4 != null) {
            r4.setVisibility(0);
            this.checkBox.setChecked(z, false);
        }
        this.imageView.setVisibility(0);
        this.imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.imageView.setImageResource(i);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextAndValueDrawable(CharSequence charSequence, Drawable drawable, boolean z) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false);
        this.valueImageView.setVisibility(0);
        this.valueImageView.setImageDrawable(drawable);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.imageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        Switch r4 = this.checkBox;
        if (r4 != null) {
            r4.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextAndSticker(CharSequence charSequence, TLRPC.Document document, boolean z) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false);
        this.valueImageView.setVisibility(8);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.imageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        Switch r4 = this.checkBox;
        if (r4 != null) {
            r4.setVisibility(8);
        }
        setValueSticker(document);
    }

    public void setTextAndSticker(CharSequence charSequence, String str, boolean z) {
        this.imageLeft = 16;
        this.offsetFromImage = getOffsetFromImage(false);
        this.textView.setText(charSequence);
        this.textView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false);
        this.valueImageView.setVisibility(8);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.imageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        Switch r4 = this.checkBox;
        if (r4 != null) {
            r4.setVisibility(8);
        }
        setValueSticker(str);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.emojiDrawable == null) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(30.0f));
            this.emojiDrawable = swapAnimatedEmojiDrawable;
            if (this.attached) {
                swapAnimatedEmojiDrawable.attach();
            }
        }
        this.emojiDrawable.set(document, 1, true);
        invalidate();
    }

    public void setValueSticker(String str) {
        if (this.emojiDrawable == null) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(30.0f));
            this.emojiDrawable = swapAnimatedEmojiDrawable;
            if (this.attached) {
                swapAnimatedEmojiDrawable.attach();
            }
        }
        final ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view) {
                imageReceiver.onAttachedToWindow();
            }

            @Override
            public void onViewDetachedFromWindow(View view) {
                imageReceiver.onDetachedFromWindow();
            }
        });
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.emojiDrawable.set(new Drawable() {
            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void draw(Canvas canvas) {
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
            }

            @Override
            public void setAlpha(int i) {
                imageReceiver.setAlpha(i / 255.0f);
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
                imageReceiver.setColorFilter(colorFilter);
            }

            @Override
            public int getIntrinsicWidth() {
                return AndroidUtilities.dp(30.0f);
            }

            @Override
            public int getIntrinsicHeight() {
                return AndroidUtilities.dp(30.0f);
            }
        }, true);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float fDp;
        int iDp;
        if (this.needDivider) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
            if (paint == null) {
                paint = Theme.dividerPaint;
            }
            Paint paint2 = paint;
            float f2 = 20.0f;
            if (LocaleController.isRTL) {
                fDp = 0.0f;
            } else {
                if (this.imageView.getVisibility() == 0) {
                    f = this.inDialogs ? 72 : 58;
                } else {
                    f = 20.0f;
                }
                fDp = AndroidUtilities.dp(f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (this.imageView.getVisibility() == 0) {
                    f2 = this.inDialogs ? 72 : 58;
                }
                iDp = AndroidUtilities.dp(f2);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.textView.getText();
        if (!TextUtils.isEmpty(text)) {
            CharSequence text2 = this.valueTextView.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.checkBox != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.checkBox.isChecked());
            StringBuilder sb = new StringBuilder();
            sb.append(this.textView.getText());
            if (!TextUtils.isEmpty(this.valueTextView.getText())) {
                sb.append('\n');
                sb.append(this.valueTextView.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    public void setNeedDivider(boolean z) {
        if (this.needDivider != z) {
            this.needDivider = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.attach();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.detach();
        }
    }

    public void setDrawLoading(boolean z, int i, boolean z2) {
        this.drawLoading = z;
        this.loadingSize = i;
        if (!z2) {
            this.drawLoadingProgress = z ? 1.0f : 0.0f;
        } else {
            this.measureDelay = true;
        }
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.drawLoading || this.drawLoadingProgress != 0.0f) {
            if (this.paint == null) {
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(Theme.getColor(Theme.key_dialogSearchBackground, this.resourcesProvider));
            }
            if (this.incrementLoadingProgress) {
                float f3 = this.loadingProgress + 0.016f;
                this.loadingProgress = f3;
                if (f3 > 1.0f) {
                    this.loadingProgress = 1.0f;
                    this.incrementLoadingProgress = false;
                }
            } else {
                float f4 = this.loadingProgress - 0.016f;
                this.loadingProgress = f4;
                if (f4 < 0.0f) {
                    this.loadingProgress = 0.0f;
                    this.incrementLoadingProgress = true;
                }
            }
            int i = this.changeProgressStartDelay;
            if (i > 0) {
                this.changeProgressStartDelay = i - 15;
            } else {
                boolean z = this.drawLoading;
                if (z) {
                    float f5 = this.drawLoadingProgress;
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.10666667f;
                        this.drawLoadingProgress = f6;
                        if (f6 > 1.0f) {
                            this.drawLoadingProgress = 1.0f;
                        }
                    } else if (!z) {
                        f = this.drawLoadingProgress;
                        if (f != 0.0f) {
                            f2 = f - 0.10666667f;
                            this.drawLoadingProgress = f2;
                            if (f2 < 0.0f) {
                                this.drawLoadingProgress = 0.0f;
                            }
                        }
                    }
                } else if (!z) {
                    f = this.drawLoadingProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.10666667f;
                        this.drawLoadingProgress = f2;
                        if (f2 < 0.0f) {
                            this.drawLoadingProgress = 0.0f;
                        }
                    }
                }
            }
            this.paint.setAlpha((int) (((this.loadingProgress * 0.4f) + 0.6f) * this.drawLoadingProgress * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.loadingSize), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), measuredHeight + AndroidUtilities.dp(3.0f));
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.paint);
            invalidate();
        }
        AnimatedTextView animatedTextView = this.valueTextView;
        float f7 = 1.0f - this.drawLoadingProgress;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        animatedTextView.setAlpha(f7 * (swapAnimatedEmojiDrawable == null ? 1.0f : 1.0f - swapAnimatedEmojiDrawable.isNotEmpty()) * (isEnabled() ? 1.0f : 0.5f));
        SimpleTextView simpleTextView = this.valueSpoilersTextView;
        float f8 = 1.0f - this.drawLoadingProgress;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiDrawable;
        simpleTextView.setAlpha(f8 * (swapAnimatedEmojiDrawable2 == null ? 1.0f : 1.0f - swapAnimatedEmojiDrawable2.isNotEmpty()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        if (this.emojiDrawable != null) {
            updateEmojiBounds();
            this.emojiDrawable.draw(canvas);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.subtitleView.setVisibility(0);
            this.subtitleView.setText(charSequence);
        } else {
            this.subtitleView.setVisibility(8);
        }
    }
}
