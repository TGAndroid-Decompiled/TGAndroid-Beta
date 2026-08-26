package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;

public class ActionBarMenuSubItem extends FrameLayout {
    public BackupImageView backupImageView;
    public boolean bottom;
    public CheckBox2 checkView;
    public boolean checkViewLeft;
    public boolean enabled;
    public ValueAnimator enabledAnimator;
    public boolean expandIfMultiline;
    public int iconColor;
    public PorterDuff.Mode iconColorMode;
    public int iconResId;
    public final RLottieImageView imageView;
    public int itemHeight;
    public Runnable openSwipeBackLayout;
    public final Theme.ResourcesProvider resourcesProvider;
    public ImageView rightIcon;
    public int selectorColor;
    public int selectorRad;
    public TextView subtextView;
    public int textColor;
    public final AnimatedEmojiSpan.TextViewEmojis textView;
    public boolean top;

    public ActionBarMenuSubItem(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        this(0, context, resourcesProvider, z, z2);
    }

    public CheckBox2 getCheckView() {
        return this.checkView;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public ImageView getImageView() {
        return this.imageView;
    }

    public ImageView getRightIcon() {
        return this.rightIcon;
    }

    public AnimatedEmojiSpan.TextViewEmojis getTextView() {
        return this.textView;
    }

    public final void makeCheckView(int i) {
        if (i > 0) {
            CheckBox2 checkBox2 = new CheckBox2(getContext(), 26, this.resourcesProvider);
            this.checkView = checkBox2;
            checkBox2.setDrawUnchecked(false);
            this.checkView.checkBoxBase.setColor(-1, -1, Theme.key_actionBarDefaultSubmenuItem);
            this.checkView.setDrawBackgroundAsArc(-1);
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
            if (i != 1) {
                addView(this.checkView, LayoutHelper.createFrame(26, -1, (LocaleController.isRTL ? 3 : 5) | 16));
                textViewEmojis.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            } else {
                boolean z = LocaleController.isRTL;
                this.checkViewLeft = !z;
                addView(this.checkView, LayoutHelper.createFrame(26, -1, (z ? 5 : 3) | 16));
                textViewEmojis.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, !LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        CheckBox2 checkBox2 = this.checkView;
        if (checkBox2 == null || !checkBox2.checkBoxBase.isChecked) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkView.checkBoxBase.isChecked);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.itemHeight), 1073741824));
        if (!this.expandIfMultiline || this.textView.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.itemHeight + 8), 1073741824));
    }

    public void setAnimatedIcon(int i) {
        this.iconResId = 0;
        this.imageView.setAnimation(i, 24, 24, null);
    }

    public void setCheckColor(int i) {
        this.checkView.checkBoxBase.setColor(-1, -1, i);
    }

    public void setChecked(boolean z) {
        CheckBox2 checkBox2 = this.checkView;
        if (checkBox2 == null) {
            return;
        }
        checkBox2.checkBoxBase.setChecked(-1, z, true);
    }

    public final void setColors(int i, int i2) {
        setTextColor(i);
        setIconColor(i2);
    }

    public void setEmojiCacheType(int i) {
        this.textView.setCacheType(i);
    }

    public final void setEnabledByColor(boolean z) {
        int i = 1;
        int i2 = 2;
        ValueAnimator valueAnimator = this.enabledAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.enabled ? 1.0f : 0.0f, z ? 1.0f : 0.0f);
        this.enabledAnimator = valueAnimatorOfFloat;
        this.enabled = z;
        valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabs$$ExternalSyntheticLambda2(this, i2));
        this.enabledAnimator.addListener(new ChatActivity.AnonymousClass77(i, this, z));
        this.enabledAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.enabledAnimator.start();
    }

    public void setIcon(int i) {
        RLottieImageView rLottieImageView = this.imageView;
        this.iconResId = i;
        rLottieImageView.setImageResource(i);
    }

    public void setIconColor(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (this.iconColor == i && this.iconColorMode == mode) {
            return;
        }
        RLottieImageView rLottieImageView = this.imageView;
        this.iconColor = i;
        this.iconColorMode = mode;
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public void setIconColorImage(int i) {
        BackupImageView backupImageView = this.backupImageView;
        if (backupImageView != null) {
            backupImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i) {
        this.itemHeight = i;
    }

    public void setMultiline(boolean z) {
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
        textViewEmojis.setLines(2);
        if (z) {
            textViewEmojis.setTextSize(1, 14.0f);
        } else {
            this.expandIfMultiline = true;
        }
        textViewEmojis.setSingleLine(false);
        textViewEmojis.setGravity(16);
    }

    public void setRightIcon(int i) {
        if (this.rightIcon == null) {
            ImageView imageView = new ImageView(getContext());
            this.rightIcon = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.rightIcon.setColorFilter(this.iconColor, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.rightIcon.setScaleX(-1.0f);
            }
            addView(this.rightIcon, LayoutHelper.createFrame(24, -1, (LocaleController.isRTL ? 3 : 5) | 16));
        }
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textViewEmojis.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.leftMargin = this.rightIcon != null ? AndroidUtilities.dp(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.rightIcon != null ? AndroidUtilities.dp(32.0f) : 0;
        }
        textViewEmojis.setLayoutParams(layoutParams);
        setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 18.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 8.0f), 0);
        if (i == 0) {
            this.rightIcon.setVisibility(8);
        } else {
            this.rightIcon.setVisibility(0);
            this.rightIcon.setImageResource(i);
        }
    }

    public void setSelectorColor(int i) {
        if (this.selectorColor != i) {
            this.selectorColor = i;
            updateBackground();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        if (this.subtextView == null) {
            TextView textView = new TextView(getContext());
            this.subtextView = textView;
            textView.setLines(1);
            this.subtextView.setSingleLine(true);
            this.subtextView.setGravity(3);
            this.subtextView.setEllipsize(TextUtils.TruncateAt.END);
            this.subtextView.setTextColor(Theme.getColor(Theme.key_groupcreate_sectionText, this.resourcesProvider));
            this.subtextView.setVisibility(8);
            this.subtextView.setTextSize(1, 13.0f);
            this.subtextView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.subtextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if ((!zIsEmpty) != (this.subtextView.getVisibility() == 0)) {
            this.subtextView.setVisibility(zIsEmpty ? 8 : 0);
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textViewEmojis.getLayoutParams();
            layoutParams.bottomMargin = zIsEmpty ? 0 : AndroidUtilities.dp(10.0f);
            textViewEmojis.setLayoutParams(layoutParams);
        }
        this.subtextView.setText(charSequence);
    }

    public void setSubtextColor(int i) {
        TextView textView = this.subtextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public final void setTextAndIcon(int i, CharSequence charSequence) {
        setTextAndIcon(charSequence, i, null);
    }

    public void setTextColor(int i) {
        if (this.textColor != i) {
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
            this.textColor = i;
            textViewEmojis.setTextColor(i);
        }
    }

    public void updateBackground() {
        setBackground(Theme.createRadSelectorDrawable(this.selectorColor, this.top ? this.selectorRad : 0, this.bottom ? this.selectorRad : 0));
    }

    public ActionBarMenuSubItem(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(context);
        this.selectorRad = 12;
        this.itemHeight = 48;
        this.resourcesProvider = resourcesProvider;
        this.top = z;
        this.bottom = z2;
        this.textColor = Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider);
        this.iconColor = Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider);
        this.iconColorMode = PorterDuff.Mode.MULTIPLY;
        this.selectorColor = Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider);
        updateBackground();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(this.iconColor, PorterDuff.Mode.SRC_IN));
        addView(rLottieImageView, LayoutHelper.createFrame(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
        this.textView = textViewEmojis;
        textViewEmojis.setLines(1);
        textViewEmojis.setSingleLine(true);
        textViewEmojis.setGravity(3);
        textViewEmojis.setEllipsize(TextUtils.TruncateAt.END);
        textViewEmojis.setTextColor(this.textColor);
        textViewEmojis.setTextSize(1, 16.0f);
        addView(textViewEmojis, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.checkViewLeft = LocaleController.isRTL;
        makeCheckView(i);
    }

    public void setIcon(Drawable drawable) {
        this.iconResId = 0;
        this.imageView.setImageDrawable(drawable);
    }

    public final void setTextAndIcon(CharSequence charSequence, int i, Drawable drawable) {
        int iDp;
        int iDp2;
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
        textViewEmojis.setText(charSequence);
        RLottieImageView rLottieImageView = this.imageView;
        if (i == 0 && drawable == null && this.checkView == null) {
            this.iconResId = 0;
            rLottieImageView.setVisibility(4);
            textViewEmojis.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.iconResId = 0;
            rLottieImageView.setImageDrawable(drawable);
        } else {
            this.iconResId = i;
            rLottieImageView.setImageResource(i);
        }
        rLottieImageView.setVisibility(0);
        if (this.checkViewLeft) {
            iDp = this.checkView != null ? AndroidUtilities.dp(43.0f) : 0;
        } else {
            iDp = AndroidUtilities.dp((i == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.checkViewLeft) {
            iDp2 = AndroidUtilities.dp((i == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            iDp2 = this.checkView != null ? AndroidUtilities.dp(43.0f) : 0;
        }
        textViewEmojis.setPadding(iDp, 0, iDp2, 0);
    }

    public final void setTextAndIcon(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
        textViewEmojis.setText(charSequence);
        textViewEmojis.setPadding((this.checkViewLeft && this.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!this.checkViewLeft && this.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        if (this.backupImageView == null) {
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.backupImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(5.0f));
            addView(this.backupImageView, LayoutHelper.createFrame(28, 28, (LocaleController.isRTL ? 5 : 3) | 16));
        }
        this.imageView.setVisibility(4);
        this.backupImageView.setImage(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }
}
