package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.qc0;
public final class a6 extends FrameLayout {
    public final TextView f21798a;
    public final TextView f21799b;
    public final ImageView f21800c;
    public final Switch d;
    public boolean f21801e;
    public boolean f21802f;
    public final org.telegram.ui.ActionBar.e6 h;

    public a6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        this.h = e6Var;
        ImageView imageView = new ImageView(context);
        this.f21800c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.x5.a(28.0f, 18.0f, 16.0f, 18.0f, 9.0f, 28, i10 | 48));
        TextView textView = new TextView(context);
        this.f21798a = textView;
        bi.o(org.telegram.ui.ActionBar.i6.G6, e6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        if (z10) {
            f7 = 66.0f;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 66.0f;
        }
        addView(textView, w7.x5.a(-2.0f, f7, 8.0f, f10, 0.0f, -1, i15));
        TextView textView2 = new TextView(context);
        this.f21799b = textView2;
        bi.o(org.telegram.ui.ActionBar.i6.f21199z6, e6Var, textView2, 1, 13.0f);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i16 = i14 | 48;
        if (z11) {
            f11 = 66.0f;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 66.0f;
        }
        addView(textView2, w7.x5.a(-2.0f, f11, 31.0f, f12, 10.0f, -2, i16));
        Switch r32 = new Switch(context, e6Var);
        this.d = r32;
        int i17 = org.telegram.ui.ActionBar.i6.M6;
        int i18 = org.telegram.ui.ActionBar.i6.N6;
        int i19 = org.telegram.ui.ActionBar.i6.f20797d6;
        r32.d(i17, i18, i19, i19);
        addView(r32, w7.x5.a(40.0f, 21.0f, 10.0f, 19.0f, 0.0f, 37, (LocaleController.isRTL ? 3 : 5) | 48));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, d50 d50Var, int i10, boolean z10) {
        boolean q6;
        this.f21798a.setText(str);
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        qc0 qc0Var = new qc0(1);
        qc0Var.b(d50Var.f25602a, d50Var.f25603b);
        qc0Var.f30145b = q6;
        ImageView imageView = this.f21800c;
        imageView.setBackground(qc0Var);
        imageView.setImageResource(i10);
        boolean z11 = this.f21801e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f21799b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f21802f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.h;
            if (e6Var != null) {
                paint = e6Var.F("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.i6.f20919k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.i6.f20919k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (LocaleController.isRTL) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(19.0f);
                }
                float f7 = dp;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(19.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21798a.getText());
        TextView textView = this.f21799b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f21801e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f21802f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f21799b.setText(charSequence);
    }
}
