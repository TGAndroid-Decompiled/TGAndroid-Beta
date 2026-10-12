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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.z40;
public final class a6 extends FrameLayout {
    public final TextView f20912a;
    public final TextView f20913b;
    public final ImageView f20914c;
    public final Switch d;
    public boolean e;
    public boolean f20915f;
    public final org.telegram.ui.ActionBar.c6 h;

    public a6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.h = c6Var;
        ImageView imageView = new ImageView(context);
        this.f20914c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.a6.a(28.0f, 18.0f, 16.0f, 18.0f, 9.0f, 28, i10 | 48));
        TextView textView = new TextView(context);
        this.f20912a = textView;
        yh.n(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
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
        addView(textView, w7.a6.a(-2.0f, f7, 8.0f, f10, 0.0f, -1, i15));
        TextView textView2 = new TextView(context);
        this.f20913b = textView2;
        yh.n(org.telegram.ui.ActionBar.g6.f20305z6, c6Var, textView2, 1, 13.0f);
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
        addView(textView2, w7.a6.a(-2.0f, f11, 31.0f, f12, 10.0f, -2, i16));
        Switch r32 = new Switch(context, c6Var);
        this.d = r32;
        int i17 = org.telegram.ui.ActionBar.g6.M6;
        int i18 = org.telegram.ui.ActionBar.g6.N6;
        int i19 = org.telegram.ui.ActionBar.g6.f19901d6;
        r32.d(i17, i18, i19, i19);
        addView(r32, w7.a6.a(40.0f, 21.0f, 10.0f, 19.0f, 0.0f, 37, (LocaleController.isRTL ? 3 : 5) | 48));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, z40 z40Var, int i10, boolean z10) {
        boolean q6;
        this.f20912a.setText(str);
        org.telegram.ui.ActionBar.c6 c6Var = this.h;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        qc0 qc0Var = new qc0(1);
        qc0Var.b(z40Var.f31762a, z40Var.f31763b);
        qc0Var.f28580b = q6;
        ImageView imageView = this.f20914c;
        imageView.setBackground(qc0Var);
        imageView.setImageResource(i10);
        boolean z11 = this.e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f20913b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f20915f) {
            org.telegram.ui.ActionBar.c6 c6Var = this.h;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.g6.f20022k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.g6.f20022k0;
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
        sb2.append(this.f20912a.getText());
        TextView textView = this.f20913b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f20915f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f20913b.setText(charSequence);
    }
}
