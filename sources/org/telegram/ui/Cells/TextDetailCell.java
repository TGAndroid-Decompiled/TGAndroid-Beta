package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public class TextDetailCell extends FrameLayout {
    private boolean contentDescriptionValueFirst;
    private final ImageView imageView;
    private boolean multiline;
    private boolean needDivider;
    private Theme.ResourcesProvider resourcesProvider;
    public final LinkSpanDrawable.LinksTextView rightValueTextView;
    private final TextView showMoreTextView;
    public final SpoilersTextView textView;
    public final LinkSpanDrawable.LinksTextView valueTextView;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            view.setId(uItem.id);
            ((TextDetailCell) view).setTextAndValue(uItem.text, uItem.subtext, z);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new TextDetailCell(18, context, resourcesProvider, false, false);
        }
    }

    public TextDetailCell(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(context);
        this.showMoreTextView = null;
        this.resourcesProvider = resourcesProvider;
        this.multiline = z || z2;
        SpoilersTextView spoilersTextView = new SpoilersTextView(context, true, resourcesProvider);
        this.textView = spoilersTextView;
        final int i2 = 0;
        spoilersTextView.setOnLinkLongPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress(this) {
            public final TextDetailCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(ClickableSpan clickableSpan) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0(clickableSpan);
                        break;
                    case 1:
                        this.f$0.lambda$new$1(clickableSpan);
                        break;
                    default:
                        this.f$0.lambda$new$2(clickableSpan);
                        break;
                }
            }
        });
        spoilersTextView.setTextSize(1, 16.0f);
        spoilersTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            spoilersTextView.setLines(1);
            spoilersTextView.setMaxLines(1);
            spoilersTextView.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        spoilersTextView.setEllipsize(truncateAt);
        spoilersTextView.setImportantForAccessibility(2);
        spoilersTextView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f = i - 6;
        addView(spoilersTextView, LayoutHelper.createFrame(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f, 6.0f, f, z ? 27.0f : 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider) {
            @Override
            public final int overrideColor() {
                return TextDetailCell.this.processColor(super.overrideColor());
            }

            @Override
            public final int processColor(int i3) {
                return TextDetailCell.this.processColor(i3);
            }
        };
        this.valueTextView = linksTextView;
        final int i3 = 1;
        linksTextView.setOnLinkLongPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress(this) {
            public final TextDetailCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(ClickableSpan clickableSpan) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$0(clickableSpan);
                        break;
                    case 1:
                        this.f$0.lambda$new$1(clickableSpan);
                        break;
                    default:
                        this.f$0.lambda$new$2(clickableSpan);
                        break;
                }
            }
        });
        if (z2) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            linksTextView.setLines(1);
            linksTextView.setSingleLine(true);
        }
        linksTextView.setTextSize(1, 13.0f);
        linksTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        linksTextView.setImportantForAccessibility(2);
        linksTextView.setEllipsize(truncateAt);
        linksTextView.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z) {
            float f2 = i;
            addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f2, 32.0f, f2, 4.0f));
        } else {
            float f3 = i;
            addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f3, 32.0f, f3, 4.0f));
        }
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider) {
            @Override
            public final int overrideColor() {
                return TextDetailCell.this.processColor(super.overrideColor());
            }

            @Override
            public final int processColor(int i4) {
                return TextDetailCell.this.processColor(i4);
            }
        };
        this.rightValueTextView = linksTextView2;
        final int i4 = 2;
        linksTextView2.setOnLinkLongPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress(this) {
            public final TextDetailCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(ClickableSpan clickableSpan) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$0(clickableSpan);
                        break;
                    case 1:
                        this.f$0.lambda$new$1(clickableSpan);
                        break;
                    default:
                        this.f$0.lambda$new$2(clickableSpan);
                        break;
                }
            }
        });
        boolean z3 = this.multiline;
        this.multiline = z3;
        if (z3) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            linksTextView2.setLines(1);
            linksTextView2.setSingleLine(true);
        }
        linksTextView2.setTextSize(1, 13.0f);
        linksTextView2.setGravity(LocaleController.isRTL ? 3 : 5);
        linksTextView2.setImportantForAccessibility(2);
        linksTextView2.setEllipsize(truncateAt);
        linksTextView2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z) {
            float f4 = i;
            addView(linksTextView2, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f4, 32.0f, f4, 4.0f));
        } else {
            float f5 = i;
            addView(linksTextView2, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f5, 32.0f, f5, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, LayoutHelper.createFrameRelatively(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public ImageView getImageView() {
        return this.imageView;
    }

    public boolean hasImage() {
        return this.imageView.getDrawable() != null;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.textView.invalidate();
    }

    public final void lambda$new$0(ClickableSpan clickableSpan) {
        if (clickableSpan != null) {
            try {
                performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            clickableSpan.onClick(this.textView);
        }
    }

    public final void lambda$new$1(ClickableSpan clickableSpan) {
        if (clickableSpan != null) {
            try {
                performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            clickableSpan.onClick(this.valueTextView);
        }
    }

    public final void lambda$new$2(ClickableSpan clickableSpan) {
        if (clickableSpan != null) {
            try {
                performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            clickableSpan.onClick(this.valueTextView);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.needDivider) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : Theme.dividerPaint;
            if (paint == null) {
                paint = Theme.dividerPaint;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, paint);
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

    @Override
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.multiline) {
            i2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.needDivider ? 1 : 0), 1073741824);
        }
        super.onMeasure(iMakeMeasureSpec, i2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        boolean z2 = this.valueTextView.hit(((int) motionEvent.getX()) - this.valueTextView.getLeft(), ((int) motionEvent.getY()) - this.valueTextView.getTop()) != null;
        if (z2) {
            z = z2;
        } else if (this.textView.hit(((int) motionEvent.getX()) - this.textView.getLeft(), ((int) motionEvent.getY()) - this.textView.getTop()) != null) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public int processColor(int i) {
        return i;
    }

    public void setContentDescriptionValueFirst(boolean z) {
        this.contentDescriptionValueFirst = z;
    }

    public void setImage(Drawable drawable) {
        setImage(drawable, null);
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        this.imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            this.imageView.setClickable(false);
        }
    }

    public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.textView.setText(charSequence);
        this.valueTextView.setText(charSequence2);
        this.rightValueTextView.setVisibility(8);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setTextWithEmojiAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        SpoilersTextView spoilersTextView = this.textView;
        spoilersTextView.setText(Emoji.replaceEmoji(charSequence, spoilersTextView.getPaint().getFontMetricsInt(), false));
        this.valueTextView.setText(charSequence2);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void updateColors() {
        SpoilersTextView spoilersTextView = this.textView;
        int i = Theme.key_chat_messageLinkIn;
        spoilersTextView.setLinkTextColor(processColor(Theme.getColor(i, this.resourcesProvider)));
        this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.textView.invalidate();
        this.valueTextView.setLinkTextColor(processColor(Theme.getColor(i, this.resourcesProvider)));
        LinkSpanDrawable.LinksTextView linksTextView = this.valueTextView;
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        linksTextView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        this.rightValueTextView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        this.valueTextView.invalidate();
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
        int iDp = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = iDp;
        } else {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = iDp;
        }
        this.textView.requestLayout();
    }

    public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        this.textView.setText(charSequence);
        this.valueTextView.setText(charSequence2);
        this.rightValueTextView.setVisibility(0);
        this.rightValueTextView.setText(charSequence3);
        this.needDivider = z;
        setWillNotDraw(!z);
    }
}
