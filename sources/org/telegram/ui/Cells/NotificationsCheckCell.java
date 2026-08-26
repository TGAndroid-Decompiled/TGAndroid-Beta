package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Switch;

public class NotificationsCheckCell extends FrameLayout {
    public boolean animationsEnabled;
    public final AnonymousClass1 checkBox;
    public final int currentHeight;
    public boolean drawLine;
    public final ImageView imageView;
    public boolean isMultiline;
    public final TextView multilineValueTextView;
    public boolean needDivider;
    public final TextView textView;
    public final AnimatedTextView valueTextView;

    public NotificationsCheckCell(Context context) {
        this(context, 21, 70, false, null);
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        int iDp;
        if (this.needDivider) {
            boolean z = LocaleController.isRTL;
            ImageView imageView = this.imageView;
            if (z) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(imageView != null ? 64.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(imageView != null ? 64.0f : 20.0f);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, Theme.dividerPaint);
        }
        if (this.drawLine) {
            int iDp2 = LocaleController.isRTL ? AndroidUtilities.dp(76.0f) : RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredWidth(), 76.0f, 1);
            int iM$2 = OKLCH.m$2(22.0f, getMeasuredHeight(), 2);
            canvas.drawRect(iDp2, iM$2, iDp2 + 2, AndroidUtilities.dp(22.0f) + iM$2, Theme.dividerPaint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.textView.getText());
        if (this.isMultiline) {
            TextView textView = this.multilineValueTextView;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb.append("\n");
                sb.append(textView.getText());
            }
        } else {
            AnimatedTextView animatedTextView = this.valueTextView;
            if (animatedTextView != null && !TextUtils.isEmpty(animatedTextView.getText())) {
                sb.append("\n");
                sb.append(animatedTextView.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBox.isChecked);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.isMultiline) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.currentHeight), 1073741824));
        }
    }

    public int processColor(int i) {
        return i;
    }

    public void setAnimationsEnabled(boolean z) {
        this.animationsEnabled = z;
    }

    public void setChecked(boolean z) {
        AnonymousClass1 anonymousClass1 = this.checkBox;
        anonymousClass1.setChecked(anonymousClass1.drawIconType, z, true);
    }

    public void setDrawLine(boolean z) {
        this.drawLine = z;
    }

    public void setMultiline(boolean z) {
        this.isMultiline = z;
        AnimatedTextView animatedTextView = this.valueTextView;
        TextView textView = this.multilineValueTextView;
        if (z) {
            textView.setVisibility(0);
            animatedTextView.setVisibility(8);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        } else {
            textView.setVisibility(8);
            animatedTextView.setVisibility(0);
            animatedTextView.setPadding(0, 0, 0, 0);
        }
    }

    public final void setTextAndValueAndIconAndCheck(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
        this.textView.setText(charSequence);
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageResource(i);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogIcon, false), PorterDuff.Mode.MULTIPLY));
        }
        boolean z5 = this.animationsEnabled;
        AnonymousClass1 anonymousClass1 = this.checkBox;
        anonymousClass1.setChecked(i2, z, z5);
        setMultiline(z2);
        boolean z6 = this.isMultiline;
        AnimatedTextView animatedTextView = this.valueTextView;
        TextView textView = this.multilineValueTextView;
        if (z6) {
            textView.setText(charSequence2);
        } else {
            animatedTextView.setText(charSequence2, z4, true);
        }
        View view = animatedTextView;
        if (this.isMultiline) {
            view = textView;
        }
        view.setVisibility(0);
        anonymousClass1.setContentDescription(charSequence);
        this.needDivider = z3;
    }

    public void setValue(CharSequence charSequence) {
        if (this.isMultiline) {
            this.multilineValueTextView.setText(charSequence);
        } else {
            this.valueTextView.setText(charSequence, true, true);
        }
    }

    public NotificationsCheckCell(Context context, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        super(context);
        this.drawLine = true;
        setWillNotDraw(false);
        this.currentHeight = i2;
        if (z) {
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.textView = textView;
        OKLCH.m(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider, textView, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = LocaleController.isRTL;
        int i3 = (z2 ? 5 : 3) | 48;
        if (z2) {
            f = 80.0f;
        } else {
            f = z ? 64 : i;
        }
        int i4 = (i2 - 70) / 2;
        float f7 = i4 + 13;
        if (z2) {
            f2 = z ? 64 : i;
        } else {
            f2 = 80.0f;
        }
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, i3, f, f7, f2, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
        this.valueTextView = animatedTextView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
        animatedTextDrawable.moveAmplitude = 0.55f;
        animatedTextDrawable.animateDuration = 320L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        int i5 = Theme.key_windowBackgroundWhiteGrayText2;
        animatedTextView.setTextColor(Theme.getColor(i5, resourcesProvider));
        animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        animatedTextView.setPadding(0, 0, 0, 0);
        animatedTextView.setEllipsizeByGradient(true);
        boolean z3 = LocaleController.isRTL;
        int i6 = (z3 ? 5 : 3) | 48;
        if (z3) {
            f3 = 80.0f;
        } else {
            f3 = z ? 64 : i;
        }
        float f8 = (29 - (z ? 2 : 0)) + i4;
        if (z3) {
            f4 = z ? 64 : i;
        } else {
            f4 = 80.0f;
        }
        addView(animatedTextView, LayoutHelper.createFrame(-1, -2.0f, i6, f3, f8, f4, 0.0f));
        TextView textView2 = new TextView(context);
        this.multilineValueTextView = textView2;
        OKLCH.m(i5, resourcesProvider, textView2, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z4 = LocaleController.isRTL;
        int i7 = (z4 ? 5 : 3) | 48;
        if (z4) {
            f5 = 80.0f;
        } else {
            f5 = z ? 64 : i;
        }
        float f9 = (38 - (z ? 2 : 0)) + i4;
        if (z4) {
            f6 = z ? 64 : i;
        } else {
            f6 = 80.0f;
        }
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, i7, f5, f9, f6, 0.0f));
        ?? r2 = new Switch(context, resourcesProvider) {
            @Override
            public final int processColor(int i8) {
                return NotificationsCheckCell.this.processColor(i8);
            }
        };
        this.checkBox = r2;
        int i8 = Theme.key_switchTrack;
        int i9 = Theme.key_switchTrackChecked;
        int i10 = Theme.key_windowBackgroundWhite;
        r2.trackColorKey = i8;
        r2.trackCheckedColorKey = i9;
        r2.thumbColorKey = i10;
        r2.thumbCheckedColorKey = i10;
        addView((View) r2, LayoutHelper.createFrame(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        r2.setFocusable(false);
    }
}
