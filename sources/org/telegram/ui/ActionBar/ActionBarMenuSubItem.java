package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
public class ActionBarMenuSubItem extends FrameLayout {
    boolean bottom;
    private CheckBox2 checkView;
    private int iconColor;
    private RLottieImageView imageView;
    private int itemHeight;
    Runnable openSwipeBackLayout;
    private final Theme.ResourcesProvider resourcesProvider;
    private ImageView rightIcon;
    private int selectorColor;
    private TextView subtextView;
    private int textColor;
    private TextView textView;
    boolean top;

    public ActionBarMenuSubItem(Context context, boolean z, boolean z2) {
        this(context, false, z, z2);
    }

    public ActionBarMenuSubItem(Context context, boolean z, boolean z2, boolean z3) {
        this(context, z ? 1 : 0, z2, z3, (Theme.ResourcesProvider) null);
    }

    public ActionBarMenuSubItem(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this(context, 0, z, z2, resourcesProvider);
    }

    public ActionBarMenuSubItem(Context context, boolean z, boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        this(context, z ? 1 : 0, z2, z3, resourcesProvider);
    }

    public ActionBarMenuSubItem(Context context, int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.itemHeight = 48;
        this.resourcesProvider = resourcesProvider;
        this.top = z;
        this.bottom = z2;
        this.textColor = getThemedColor(Theme.key_actionBarDefaultSubmenuItem);
        this.iconColor = getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon);
        this.selectorColor = getThemedColor(Theme.key_dialogButtonSelector);
        updateBackground();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(this.iconColor, PorterDuff.Mode.MULTIPLY));
        addView(this.imageView, LayoutHelper.createFrame(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setLines(1);
        this.textView.setSingleLine(true);
        this.textView.setGravity(3);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        this.textView.setTextColor(this.textColor);
        this.textView.setTextSize(1, 16.0f);
        addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        if (i > 0) {
            CheckBox2 checkBox2 = new CheckBox2(context, 26, resourcesProvider);
            this.checkView = checkBox2;
            checkBox2.setDrawUnchecked(false);
            this.checkView.setColor(-1, -1, Theme.key_radioBackgroundChecked);
            this.checkView.setDrawBackgroundAsArc(-1);
            if (i == 1) {
                addView(this.checkView, LayoutHelper.createFrame(26, -1, (LocaleController.isRTL ? 5 : 3) | 16));
                return;
            }
            addView(this.checkView, LayoutHelper.createFrame(26, -1, (LocaleController.isRTL ? 3 : 5) | 16));
            this.textView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.itemHeight), 1073741824));
    }

    public void setItemHeight(int i) {
        this.itemHeight = i;
    }

    public void setChecked(boolean z) {
        CheckBox2 checkBox2 = this.checkView;
        if (checkBox2 == null) {
            return;
        }
        checkBox2.setChecked(z, true);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        CheckBox2 checkBox2 = this.checkView;
        if (checkBox2 == null || !checkBox2.isChecked()) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkView.isChecked());
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    public void setCheckColor(int i) {
        this.checkView.setColor(-1, -1, i);
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
        setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 18.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 8.0f), 0);
        this.rightIcon.setImageResource(i);
    }

    public void setTextAndIcon(CharSequence charSequence, int i) {
        setTextAndIcon(charSequence, i, null);
    }

    public void setTextAndIcon(CharSequence charSequence, int i, Drawable drawable) {
        this.textView.setText(charSequence);
        if (i != 0 || drawable != null || this.checkView != null) {
            if (drawable != null) {
                this.imageView.setImageDrawable(drawable);
            } else {
                this.imageView.setImageResource(i);
            }
            this.imageView.setVisibility(0);
            this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            return;
        }
        this.imageView.setVisibility(4);
        this.textView.setPadding(0, 0, 0, 0);
    }

    public ActionBarMenuSubItem setColors(int i, int i2) {
        setTextColor(i);
        setIconColor(i2);
        return this;
    }

    public void setTextColor(int i) {
        if (this.textColor != i) {
            TextView textView = this.textView;
            this.textColor = i;
            textView.setTextColor(i);
        }
    }

    public void setIconColor(int i) {
        if (this.iconColor != i) {
            RLottieImageView rLottieImageView = this.imageView;
            this.iconColor = i;
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void setIcon(int i) {
        this.imageView.setImageResource(i);
    }

    public void setAnimatedIcon(int i) {
        this.imageView.setAnimation(i, 24, 24);
    }

    public void onItemShown() {
        if (this.imageView.getAnimatedDrawable() != null) {
            this.imageView.getAnimatedDrawable().start();
        }
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setSubtextColor(int i) {
        this.subtextView.setTextColor(i);
    }

    public void setSubtext(String str) {
        if (this.subtextView == null) {
            TextView textView = new TextView(getContext());
            this.subtextView = textView;
            textView.setLines(1);
            this.subtextView.setSingleLine(true);
            this.subtextView.setGravity(3);
            this.subtextView.setEllipsize(TextUtils.TruncateAt.END);
            this.subtextView.setTextColor(getThemedColor(Theme.key_groupcreate_sectionText));
            this.subtextView.setVisibility(8);
            this.subtextView.setTextSize(1, 13.0f);
            this.subtextView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.subtextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean z = !TextUtils.isEmpty(str);
        if (z != (this.subtextView.getVisibility() == 0)) {
            this.subtextView.setVisibility(z ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textView.getLayoutParams();
            layoutParams.bottomMargin = z ? AndroidUtilities.dp(10.0f) : 0;
            this.textView.setLayoutParams(layoutParams);
        }
        this.subtextView.setText(str);
    }

    public TextView getTextView() {
        return this.textView;
    }

    public ImageView getImageView() {
        return this.imageView;
    }

    public void setSelectorColor(int i) {
        if (this.selectorColor != i) {
            this.selectorColor = i;
            updateBackground();
        }
    }

    public void updateSelectorBackground(boolean z, boolean z2) {
        if (this.top == z && this.bottom == z2) {
            return;
        }
        this.top = z;
        this.bottom = z2;
        updateBackground();
    }

    void updateBackground() {
        setBackground(Theme.createRadSelectorDrawable(this.selectorColor, this.top ? 6 : 0, this.bottom ? 6 : 0));
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public CheckBox2 getCheckView() {
        return this.checkView;
    }

    public void openSwipeBack() {
        Runnable runnable = this.openSwipeBackLayout;
        if (runnable != null) {
            runnable.run();
        }
    }

    public ImageView getRightIcon() {
        return this.rightIcon;
    }
}
