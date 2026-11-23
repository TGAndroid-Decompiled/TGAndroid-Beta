package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.oa0;
public final class y5 extends FrameLayout {
    public final TextView f32563a;
    public final TextView f32564b;
    public final ImageView f32565c;
    public final Switch d;
    public boolean f32566e;
    public boolean f32567f;
    public final org.telegram.ui.ActionBar.i6 h;

    public y5(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        this.h = i6Var;
        ImageView imageView = new ImageView(context);
        this.f32565c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.na.d(28, 28.0f, i7 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f32563a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        m10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = gd.f24314a0;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f10 = 66.0f;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 66.0f;
        }
        addView(textView, c8.na.d(-1, -2.0f, i14, f10, 8.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f32564b = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        textView2.setTextSize(1, 13.0f);
        if (gd.f24314a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        boolean z11 = gd.f24314a0;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i15 = i13 | 48;
        if (z11) {
            f12 = 66.0f;
        } else {
            f12 = 64.0f;
        }
        if (z11) {
            f13 = 64.0f;
        } else {
            f13 = 66.0f;
        }
        addView(textView2, c8.na.d(-2, -2.0f, i15, f12, 31.0f, f13, 10.0f));
        Switch r32 = new Switch(context, i6Var);
        this.d = r32;
        int i16 = org.telegram.ui.ActionBar.n6.M6;
        int i17 = org.telegram.ui.ActionBar.n6.N6;
        int i18 = org.telegram.ui.ActionBar.n6.f29451d6;
        r32.d(i16, i17, i18, i18);
        addView(r32, c8.na.d(37, 40.0f, (gd.f24314a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, n30 n30Var, int i7, boolean z10) {
        boolean q10;
        this.f32563a.setText(str);
        org.telegram.ui.ActionBar.i6 i6Var = this.h;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        oa0 oa0Var = new oa0(1);
        oa0Var.b(n30Var.f37639a, n30Var.f37640b);
        oa0Var.f38079b = q10;
        ImageView imageView = this.f32565c;
        imageView.setBackground(oa0Var);
        imageView.setImageResource(i7);
        boolean z11 = this.f32566e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f32564b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i7;
        super.dispatchDraw(canvas);
        if (this.f32567f) {
            org.telegram.ui.ActionBar.i6 i6Var = this.h;
            if (i6Var != null) {
                paint = i6Var.e("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.n6.f29574k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.n6.f29574k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (gd.f24314a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(19.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (gd.f24314a0) {
                    i7 = org.telegram.messenger.g0.L(19.0f);
                } else {
                    i7 = 0;
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
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
        sb2.append(this.f32563a.getText());
        TextView textView = this.f32564b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f32566e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f32567f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f32564b.setText(charSequence);
    }
}
