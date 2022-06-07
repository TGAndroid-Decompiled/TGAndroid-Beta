package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class TextDetailCell extends FrameLayout {
    private boolean contentDescriptionValueFirst;
    private final ImageView imageView;
    private boolean needDivider;
    private Theme.ResourcesProvider resourcesProvider;
    private final TextView textView;
    private final TextView valueTextView;

    public TextDetailCell(Context context) {
        this(context, null);
    }

    public TextDetailCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        textView.setTextSize(1, 16.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 23.0f, 8.0f, 23.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2", resourcesProvider));
        textView2.setTextSize(1, 13.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setImportantForAccessibility(2);
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 23.0f, 33.0f, 23.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, LayoutHelper.createFrameRelatively(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setTextAndValue(String str, String str2, boolean z) {
        this.textView.setText(str);
        this.valueTextView.setText(str2);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setImage(Drawable drawable) {
        setImage(drawable, null);
    }

    public void setImage(Drawable drawable, CharSequence charSequence) {
        this.imageView.setImageDrawable(drawable);
        int i = 0;
        this.imageView.setFocusable(drawable != null);
        this.imageView.setContentDescription(charSequence);
        if (drawable == null) {
            this.imageView.setBackground(null);
            this.imageView.setImportantForAccessibility(2);
        } else {
            this.imageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(48.0f), 0, Theme.getColor("listSelectorSDK21", this.resourcesProvider)));
            this.imageView.setImportantForAccessibility(1);
        }
        int dp = AndroidUtilities.dp(23.0f);
        if (drawable != null) {
            i = AndroidUtilities.dp(48.0f);
        }
        int i2 = dp + i;
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = i2;
        } else {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = i2;
        }
        this.textView.requestLayout();
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        this.imageView.setOnClickListener(onClickListener);
    }

    public void setTextWithEmojiAndValue(String str, CharSequence charSequence, boolean z) {
        TextView textView = this.textView;
        textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(14.0f), false));
        this.valueTextView.setText(charSequence);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setContentDescriptionValueFirst(boolean z) {
        this.contentDescriptionValueFirst = z;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.textView.invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.textView.getText();
        CharSequence text2 = this.valueTextView.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) (this.contentDescriptionValueFirst ? text2 : text));
            sb.append(": ");
            if (!this.contentDescriptionValueFirst) {
                text = text2;
            }
            sb.append((Object) text);
            accessibilityNodeInfo.setText(sb.toString());
        }
    }
}
