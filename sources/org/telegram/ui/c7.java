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
    public w6 f33031a;
    public final org.telegram.ui.ActionBar.f6 f33032b;
    public final TextView f33033c;
    public final org.telegram.ui.Components.k6 d;
    public final org.telegram.ui.Components.p9 e;
    public boolean f33034f;
    public boolean h;
    public org.telegram.ui.Components.kp f33035n;

    public c7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        this.f33032b = f6Var;
        TextView textView = new TextView(context);
        this.f33033c = textView;
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
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z4) {
            f10 = 21.0f;
        } else {
            f10 = 72.0f;
        }
        if (z4) {
            f11 = 72.0f;
        } else {
            f11 = 21.0f;
        }
        addView(textView, k7.b6.d(-1, -1.0f, i14, f10, 0.0f, f11, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, !LocaleController.isRTL);
        this.d = k6Var;
        k6Var.b(0.55f, 320L, org.telegram.ui.Components.mr.h);
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        k6Var.setGravity(i12 | 16);
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        int i15 = i13 | 48;
        if (z10) {
            f12 = 21.0f;
        } else {
            f12 = 72.0f;
        }
        if (z10) {
            f13 = 72.0f;
        } else {
            f13 = 21.0f;
        }
        addView(k6Var, k7.b6.d(-2, -1.0f, i15, f12, 0.0f, f13, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.e = p9Var;
        p9Var.getAvatarDrawable().f31293p = 0.8f;
        addView(p9Var, k7.b6.d(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f33033c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f33034f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.f33033c;
    }

    public org.telegram.ui.Components.k6 getValueTextView() {
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
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.f33033c.getText());
        org.telegram.ui.Components.k6 k6Var = this.d;
        if (k6Var != null && k6Var.getVisibility() == 0) {
            str = "\n" + ((Object) k6Var.getText());
        } else {
            str = "";
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f33034f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = measuredWidth / 2;
        org.telegram.ui.Components.p9 p9Var = this.e;
        if (p9Var.getVisibility() == 0) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824));
        }
        org.telegram.ui.Components.k6 k6Var = this.d;
        if (k6Var.getVisibility() == 0) {
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - k6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
        }
        int dp = AndroidUtilities.dp(12.0f) + k6Var.getMeasuredWidth();
        boolean z4 = LocaleController.isRTL;
        TextView textView = this.f33033c;
        if (z4) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dp;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.kp kpVar = this.f33035n;
        if (kpVar != null) {
            kpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
    }

    public void setCanDisable(boolean z4) {
        this.h = z4;
    }

    @Override
    public void setEnabled(boolean z4) {
        float f10;
        super.setEnabled(z4);
        float f11 = 1.0f;
        if (!z4 && this.h) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f33033c.setAlpha(f10);
        org.telegram.ui.Components.k6 k6Var = this.d;
        if (k6Var.getVisibility() == 0) {
            if (!z4 && this.h) {
                f11 = 0.5f;
            }
            k6Var.setAlpha(f11);
        }
    }

    public void setTextColor(int i10) {
        this.f33033c.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.d.setTextColor(i10);
    }
}
