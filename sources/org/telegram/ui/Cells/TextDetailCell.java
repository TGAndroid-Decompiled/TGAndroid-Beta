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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public class TextDetailCell extends FrameLayout {
    public boolean contentDescriptionValueFirst;
    public final ImageView imageView;
    public final boolean multiline;
    public boolean needDivider;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnonymousClass1 rightValueTextView;
    public final SpoilersTextView textView;
    public final AnonymousClass1 valueTextView;

    public TextDetailCell(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        boolean z3 = z || z2;
        this.multiline = z3;
        SpoilersTextView spoilersTextView = new SpoilersTextView(context, resourcesProvider, true);
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
                        TextDetailCell textDetailCell = this.f$0;
                        textDetailCell.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(textDetailCell.textView);
                        }
                        break;
                    case 1:
                        TextDetailCell textDetailCell2 = this.f$0;
                        textDetailCell2.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell2.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(textDetailCell2.valueTextView);
                        }
                        break;
                    default:
                        TextDetailCell textDetailCell3 = this.f$0;
                        textDetailCell3.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell3.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(textDetailCell3.valueTextView);
                        }
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
        final int i3 = 0;
        ?? r7 = new LinkSpanDrawable.LinksTextView(this, context, resourcesProvider) {
            public final TextDetailCell this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final int overrideColor() {
                switch (i3) {
                    case 0:
                        return this.this$0.processColor(Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider));
                    default:
                        return this.this$0.processColor(Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider));
                }
            }

            @Override
            public final int processColor(int i4) {
                switch (i3) {
                    case 0:
                        break;
                }
                return this.this$0.processColor(i4);
            }
        };
        this.valueTextView = r7;
        final int i4 = 1;
        r7.setOnLinkLongPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress(this) {
            public final TextDetailCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(ClickableSpan clickableSpan) {
                switch (i4) {
                    case 0:
                        TextDetailCell textDetailCell = this.f$0;
                        textDetailCell.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(textDetailCell.textView);
                        }
                        break;
                    case 1:
                        TextDetailCell textDetailCell2 = this.f$0;
                        textDetailCell2.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell2.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(textDetailCell2.valueTextView);
                        }
                        break;
                    default:
                        TextDetailCell textDetailCell3 = this.f$0;
                        textDetailCell3.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell3.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(textDetailCell3.valueTextView);
                        }
                        break;
                }
            }
        });
        if (z2) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            r7.setLines(1);
            r7.setSingleLine(true);
        }
        r7.setTextSize(1, 13.0f);
        r7.setGravity(LocaleController.isRTL ? 5 : 3);
        r7.setImportantForAccessibility(2);
        r7.setEllipsize(truncateAt);
        r7.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z) {
            float f2 = i;
            addView((View) r7, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f2, 32.0f, f2, 4.0f));
        } else {
            float f3 = i;
            addView((View) r7, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f3, 32.0f, f3, 4.0f));
        }
        final int i5 = 1;
        ?? r8 = new LinkSpanDrawable.LinksTextView(this, context, resourcesProvider) {
            public final TextDetailCell this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final int overrideColor() {
                switch (i5) {
                    case 0:
                        return this.this$0.processColor(Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider));
                    default:
                        return this.this$0.processColor(Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider));
                }
            }

            @Override
            public final int processColor(int i6) {
                switch (i5) {
                    case 0:
                        break;
                }
                return this.this$0.processColor(i6);
            }
        };
        this.rightValueTextView = r8;
        final int i6 = 2;
        r8.setOnLinkLongPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress(this) {
            public final TextDetailCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(ClickableSpan clickableSpan) {
                switch (i6) {
                    case 0:
                        TextDetailCell textDetailCell = this.f$0;
                        textDetailCell.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(textDetailCell.textView);
                        }
                        break;
                    case 1:
                        TextDetailCell textDetailCell2 = this.f$0;
                        textDetailCell2.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell2.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(textDetailCell2.valueTextView);
                        }
                        break;
                    default:
                        TextDetailCell textDetailCell3 = this.f$0;
                        textDetailCell3.getClass();
                        if (clickableSpan != null) {
                            try {
                                textDetailCell3.performHapticFeedback(0, 1);
                                break;
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(textDetailCell3.valueTextView);
                        }
                        break;
                }
            }
        });
        this.multiline = z3;
        if (z3) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            r8.setLines(1);
            r8.setSingleLine(true);
        }
        r8.setTextSize(1, 13.0f);
        r8.setGravity(LocaleController.isRTL ? 3 : 5);
        r8.setImportantForAccessibility(2);
        r8.setEllipsize(truncateAt);
        r8.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z) {
            float f4 = i;
            addView((View) r8, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f4, 32.0f, f4, 4.0f));
        } else {
            float f5 = i;
            addView((View) r8, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f5, 32.0f, f5, 4.0f));
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

    @Override
    public final void invalidate() {
        super.invalidate();
        this.textView.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
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
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.textView.getText();
        CharSequence text2 = getText();
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
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.multiline) {
            i2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.needDivider ? 1 : 0), 1073741824);
        }
        super.onMeasure(iMakeMeasureSpec, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        AnonymousClass1 anonymousClass1 = this.valueTextView;
        ClickableSpan clickableSpanHit = anonymousClass1.hit(x - anonymousClass1.getLeft(), ((int) motionEvent.getY()) - anonymousClass1.getTop());
        boolean z = false;
        boolean z2 = clickableSpanHit != null;
        if (z2) {
            z = z2;
        } else {
            SpoilersTextView spoilersTextView = this.textView;
            if (spoilersTextView.hit(((int) motionEvent.getX()) - spoilersTextView.getLeft(), ((int) motionEvent.getY()) - spoilersTextView.getTop()) != null) {
                z = true;
            }
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
        ImageView imageView = this.imageView;
        imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            imageView.setClickable(false);
        }
    }

    public final void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.textView.setText(charSequence);
        setText(charSequence2);
        setVisibility(8);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public final void updateColors() {
        int i = Theme.key_chat_messageLinkIn;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iProcessColor = processColor(Theme.getColor(i, resourcesProvider));
        SpoilersTextView spoilersTextView = this.textView;
        spoilersTextView.setLinkTextColor(iProcessColor);
        spoilersTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        spoilersTextView.invalidate();
        int iProcessColor2 = processColor(Theme.getColor(i, resourcesProvider));
        AnonymousClass1 anonymousClass1 = this.valueTextView;
        anonymousClass1.setLinkTextColor(iProcessColor2);
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        anonymousClass1.setTextColor(Theme.getColor(i2, resourcesProvider));
        setTextColor(Theme.getColor(i2, resourcesProvider));
        anonymousClass1.invalidate();
    }

    public final void setImage(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin = (LocaleController.isRTL || drawable == null) ? AndroidUtilities.dp(23.0f) : AndroidUtilities.dp(58.0f);
        ImageView imageView = this.imageView;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(48.0f), 0, Theme.getColor(Theme.key_listSelector, this.resourcesProvider)));
            imageView.setImportantForAccessibility(1);
        }
        int iDp = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        boolean z = LocaleController.isRTL;
        SpoilersTextView spoilersTextView = this.textView;
        if (z) {
            ((ViewGroup.MarginLayoutParams) spoilersTextView.getLayoutParams()).leftMargin = iDp;
        } else {
            ((ViewGroup.MarginLayoutParams) spoilersTextView.getLayoutParams()).rightMargin = iDp;
        }
        spoilersTextView.requestLayout();
    }

    public final void setTextAndValue(CharSequence charSequence, String str, String str2) {
        this.textView.setText(charSequence);
        setText(str);
        AnonymousClass1 anonymousClass1 = this.rightValueTextView;
        anonymousClass1.setVisibility(0);
        anonymousClass1.setText(str2);
        this.needDivider = false;
        setWillNotDraw(true);
    }
}
