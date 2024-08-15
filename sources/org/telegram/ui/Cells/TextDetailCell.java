package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
public class TextDetailCell extends FrameLayout {
    private boolean contentDescriptionValueFirst;
    private final ImageView imageView;
    private boolean multiline;
    private boolean needDivider;
    private Theme.ResourcesProvider resourcesProvider;
    private final TextView showMoreTextView;
    public final LinkSpanDrawable.LinksTextView textView;
    public final LinkSpanDrawable.LinksTextView valueTextView;

    protected int processColor(int i) {
        return i;
    }

    public TextDetailCell(Context context) {
        this(context, null);
    }

    public TextDetailCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, resourcesProvider, false);
    }

    public TextDetailCell(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.showMoreTextView = null;
        this.resourcesProvider = resourcesProvider;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider) {
            @Override
            protected int processColor(int i) {
                return TextDetailCell.this.processColor(i);
            }

            @Override
            public int overrideColor() {
                return processColor(super.overrideColor());
            }
        };
        this.textView = linksTextView;
        linksTextView.setOnLinkLongPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
            @Override
            public final void run(ClickableSpan clickableSpan) {
                TextDetailCell.this.lambda$new$0(clickableSpan);
            }
        });
        linksTextView.setTextSize(1, 16.0f);
        linksTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        linksTextView.setLines(1);
        linksTextView.setMaxLines(1);
        linksTextView.setSingleLine(true);
        linksTextView.setEllipsize(TextUtils.TruncateAt.END);
        linksTextView.setImportantForAccessibility(2);
        linksTextView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 17.0f, 6.0f, 17.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider) {
            @Override
            protected int processColor(int i) {
                return TextDetailCell.this.processColor(i);
            }

            @Override
            public int overrideColor() {
                return processColor(super.overrideColor());
            }
        };
        this.valueTextView = linksTextView2;
        linksTextView2.setOnLinkLongPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
            @Override
            public final void run(ClickableSpan clickableSpan) {
                TextDetailCell.this.lambda$new$1(clickableSpan);
            }
        });
        this.multiline = z;
        if (z) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            linksTextView2.setLines(1);
            linksTextView2.setSingleLine(true);
        }
        linksTextView2.setTextSize(1, 13.0f);
        linksTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linksTextView2.setImportantForAccessibility(2);
        linksTextView2.setEllipsize(TextUtils.TruncateAt.END);
        linksTextView2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        addView(linksTextView2, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 23.0f, 32.0f, 23.0f, 4.0f));
        updateColors();
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, LayoutHelper.createFrameRelatively(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public void lambda$new$0(ClickableSpan clickableSpan) {
        if (clickableSpan != null) {
            try {
                performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            clickableSpan.onClick(this.textView);
        }
    }

    public void lambda$new$1(ClickableSpan clickableSpan) {
        if (clickableSpan != null) {
            try {
                performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            clickableSpan.onClick(this.valueTextView);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.valueTextView.hit(((int) motionEvent.getX()) - this.valueTextView.getLeft(), ((int) motionEvent.getY()) - this.valueTextView.getTop()) != null;
        if (!z) {
            z = this.textView.hit(((int) motionEvent.getX()) - this.textView.getLeft(), ((int) motionEvent.getY()) - this.textView.getTop()) != null;
        }
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.multiline) {
            i2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.needDivider ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.textView.setText(charSequence);
        this.valueTextView.setText(charSequence2);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setImage(Drawable drawable) {
        setImage(drawable, null);
    }

    public void setImage(Drawable drawable, CharSequence charSequence) {
        ((ViewGroup.MarginLayoutParams) this.valueTextView.getLayoutParams()).rightMargin = (LocaleController.isRTL || drawable == null) ? AndroidUtilities.dp(23.0f) : AndroidUtilities.dp(58.0f);
        this.imageView.setImageDrawable(drawable);
        this.imageView.setFocusable(drawable != null);
        this.imageView.setContentDescription(charSequence);
        if (drawable == null) {
            this.imageView.setBackground(null);
            this.imageView.setImportantForAccessibility(2);
        } else {
            this.imageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(48.0f), 0, Theme.getColor(Theme.key_listSelector, this.resourcesProvider)));
            this.imageView.setImportantForAccessibility(1);
        }
        int dp = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = dp;
        }
        this.textView.requestLayout();
    }

    public boolean hasImage() {
        return this.imageView.getDrawable() != null;
    }

    public ImageView getImageView() {
        return this.imageView;
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        this.imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            this.imageView.setClickable(false);
        }
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
        if (TextUtils.isEmpty(text) || TextUtils.isEmpty(text2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) (this.contentDescriptionValueFirst ? text2 : text));
        sb.append(": ");
        if (!this.contentDescriptionValueFirst) {
            text = text2;
        }
        sb.append((Object) text);
        accessibilityNodeInfo.setText(sb.toString());
    }

    public void updateColors() {
        LinkSpanDrawable.LinksTextView linksTextView = this.textView;
        int i = Theme.key_chat_messageLinkIn;
        linksTextView.setLinkTextColor(processColor(Theme.getColor(i, this.resourcesProvider)));
        this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.textView.invalidate();
        this.valueTextView.setLinkTextColor(processColor(Theme.getColor(i, this.resourcesProvider)));
        this.valueTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider));
        this.valueTextView.invalidate();
    }
}
