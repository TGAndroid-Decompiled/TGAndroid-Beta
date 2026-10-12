package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class c7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public w6 f34744a;
    public final org.telegram.ui.ActionBar.c6 f34745b;
    public final TextView f34746c;
    public final org.telegram.ui.Components.s6 d;
    public final org.telegram.ui.Components.z9 e;
    public boolean f34747f;
    public boolean h;
    public org.telegram.ui.Components.aq f34748n;

    public c7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        this.f34745b = c6Var;
        TextView textView = new TextView(context);
        this.f34746c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f7 = 21.0f;
        } else {
            f7 = 72.0f;
        }
        if (z10) {
            f10 = 72.0f;
        } else {
            f10 = 21.0f;
        }
        addView(textView, w7.a6.a(-1.0f, f7, 0.0f, f10, 0.0f, -1, i14));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, !LocaleController.isRTL);
        this.d = s6Var;
        s6Var.b(0.55f, 320L, org.telegram.ui.Components.es.h);
        s6Var.setTextSize(AndroidUtilities.dp(16.0f));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        s6Var.setGravity(i12 | 16);
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        int i15 = i13 | 48;
        if (z11) {
            f11 = 21.0f;
        } else {
            f11 = 72.0f;
        }
        if (z11) {
            f12 = 72.0f;
        } else {
            f12 = 21.0f;
        }
        addView(s6Var, w7.a6.a(-1.0f, f11, 0.0f, f12, 0.0f, -2, i15));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.e = z9Var;
        z9Var.getAvatarDrawable().f26627p = 0.8f;
        addView(z9Var, w7.a6.a(38.0f, 17.0f, 0.0f, 17.0f, 0.0f, 38, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f34746c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f34747f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f20022k0);
        }
    }

    public org.telegram.ui.Components.z9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.f34746c;
    }

    public org.telegram.ui.Components.s6 getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f34746c.getText());
        org.telegram.ui.Components.s6 s6Var = this.d;
        if (s6Var != null && s6Var.getVisibility() == 0) {
            str = "\n" + ((Object) s6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f34747f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = measuredWidth / 2;
        org.telegram.ui.Components.z9 z9Var = this.e;
        if (z9Var.getVisibility() == 0) {
            z9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824));
        }
        org.telegram.ui.Components.s6 s6Var = this.d;
        if (s6Var.getVisibility() == 0) {
            s6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - s6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
        }
        int dp = AndroidUtilities.dp(12.0f) + s6Var.getMeasuredWidth();
        boolean z10 = LocaleController.isRTL;
        TextView textView = this.f34746c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dp;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.aq aqVar = this.f34748n;
        if (aqVar != null) {
            aqVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
    }

    public void setCanDisable(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        super.setEnabled(z10);
        float f10 = 1.0f;
        if (!z10 && this.h) {
            f7 = 0.5f;
        } else {
            f7 = 1.0f;
        }
        this.f34746c.setAlpha(f7);
        org.telegram.ui.Components.s6 s6Var = this.d;
        if (s6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f10 = 0.5f;
            }
            s6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i10) {
        this.f34746c.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.d.setTextColor(i10);
    }
}
