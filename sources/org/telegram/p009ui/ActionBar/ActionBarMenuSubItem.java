package org.telegram.p009ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.LayoutHelper;

public class ActionBarMenuSubItem extends FrameLayout {
    boolean bottom;
    private CheckBox2 checkView;
    private int iconColor;
    private ImageView imageView;
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
        this(context, z, z2, z3, null);
    }

    public ActionBarMenuSubItem(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this(context, false, z, z2, resourcesProvider);
    }

    public ActionBarMenuSubItem(Context context, boolean z, boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.itemHeight = 48;
        this.resourcesProvider = resourcesProvider;
        this.top = z2;
        this.bottom = z3;
        this.textColor = getThemedColor("actionBarDefaultSubmenuItem");
        this.iconColor = getThemedColor("actionBarDefaultSubmenuItemIcon");
        this.selectorColor = getThemedColor("dialogButtonSelector");
        updateBackground();
        setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(this.iconColor, PorterDuff.Mode.MULTIPLY));
        int i = 5;
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
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 26, resourcesProvider);
            this.checkView = checkBox2;
            checkBox2.setDrawUnchecked(false);
            this.checkView.setColor(null, null, "radioBackgroundChecked");
            this.checkView.setDrawBackgroundAsArc(-1);
            addView(this.checkView, LayoutHelper.createFrame(26, -1, (!LocaleController.isRTL ? 3 : i) | 16));
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(this.itemHeight), 1073741824));
    }

    public void setItemHeight(int i) {
        this.itemHeight = i;
    }

    public void setChecked(boolean z) {
        CheckBox2 checkBox2 = this.checkView;
        if (checkBox2 != null) {
            checkBox2.setChecked(z, true);
        }
    }

    public void setCheckColor(String str) {
        this.checkView.setColor(null, null, str);
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
        float f = 8.0f;
        int dp = AndroidUtilities.m34dp(LocaleController.isRTL ? 8.0f : 18.0f);
        if (LocaleController.isRTL) {
            f = 18.0f;
        }
        setPadding(dp, 0, AndroidUtilities.m34dp(f), 0);
        this.rightIcon.setImageResource(i);
    }

    public void setTextAndIcon(CharSequence charSequence, int i) {
        setTextAndIcon(charSequence, i, null);
    }

    public void setMultiline() {
        this.textView.setLines(2);
        this.textView.setTextSize(1, 14.0f);
        this.textView.setSingleLine(false);
        this.textView.setGravity(16);
    }

    public void setTextAndIcon(CharSequence charSequence, int i, Drawable drawable) {
        this.textView.setText(charSequence);
        if (i == 0 && drawable == null && this.checkView == null) {
            this.imageView.setVisibility(4);
            this.textView.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.imageView.setImageDrawable(drawable);
        } else {
            this.imageView.setImageResource(i);
        }
        this.imageView.setVisibility(0);
        this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.m34dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.m34dp(43.0f) : 0, 0);
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
            ImageView imageView = this.imageView;
            this.iconColor = i;
            imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void setIcon(int i) {
        this.imageView.setImageResource(i);
    }

    public void setText(String str) {
        this.textView.setText(str);
    }

    public void setSubtextColor(int i) {
        this.subtextView.setTextColor(i);
    }

    public void setSubtext(String str) {
        int i = 8;
        boolean z = true;
        int i2 = 0;
        if (this.subtextView == null) {
            TextView textView = new TextView(getContext());
            this.subtextView = textView;
            textView.setLines(1);
            this.subtextView.setSingleLine(true);
            int i3 = 3;
            this.subtextView.setGravity(3);
            this.subtextView.setEllipsize(TextUtils.TruncateAt.END);
            this.subtextView.setTextColor(-8617338);
            this.subtextView.setVisibility(8);
            this.subtextView.setTextSize(1, 13.0f);
            this.subtextView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.m34dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.m34dp(43.0f) : 0, 0);
            TextView textView2 = this.subtextView;
            if (LocaleController.isRTL) {
                i3 = 5;
            }
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, i3 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean z2 = !TextUtils.isEmpty(str);
        if (this.subtextView.getVisibility() != 0) {
            z = false;
        }
        if (z2 != z) {
            TextView textView3 = this.subtextView;
            if (z2) {
                i = 0;
            }
            textView3.setVisibility(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textView.getLayoutParams();
            if (z2) {
                i2 = AndroidUtilities.m34dp(10.0f);
            }
            layoutParams.bottomMargin = i2;
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
        if (this.top != z || this.bottom != z2) {
            this.top = z;
            this.bottom = z2;
            updateBackground();
        }
    }

    void updateBackground() {
        int i = 6;
        int i2 = this.top ? 6 : 0;
        if (!this.bottom) {
            i = 0;
        }
        setBackground(Theme.createRadSelectorDrawable(this.selectorColor, i2, i));
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
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
