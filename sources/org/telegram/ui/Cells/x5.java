package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fa0;
public final class x5 extends FrameLayout {
    public final TextView f32035a;
    public final TextView f32036b;
    public final ImageView f32037c;
    public final Switch d;
    public boolean f32038e;
    public boolean f32039f;
    public final org.telegram.ui.ActionBar.e6 h;

    public x5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.h = e6Var;
        ImageView imageView = new ImageView(context);
        this.f32037c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.ja.d(28, 28.0f, i7 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f32035a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = hd.f24104a0;
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
        addView(textView, c8.ja.d(-1, -2.0f, i14, f10, 8.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f32036b = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        textView2.setTextSize(1, 13.0f);
        if (hd.f24104a0) {
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
        boolean z11 = hd.f24104a0;
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
        addView(textView2, c8.ja.d(-2, -2.0f, i15, f12, 31.0f, f13, 10.0f));
        Switch r32 = new Switch(context, e6Var);
        this.d = r32;
        int i16 = org.telegram.ui.ActionBar.j6.M6;
        int i17 = org.telegram.ui.ActionBar.j6.N6;
        int i18 = org.telegram.ui.ActionBar.j6.f28849d6;
        r32.d(i16, i17, i18, i18);
        addView(r32, c8.ja.d(37, 40.0f, (hd.f24104a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, f30 f30Var, int i7, boolean z10) {
        boolean q10;
        this.f32035a.setText(str);
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        fa0 fa0Var = new fa0(1);
        fa0Var.b(f30Var.f34500a, f30Var.f34501b);
        fa0Var.f34552b = q10;
        ImageView imageView = this.f32037c;
        imageView.setBackground(fa0Var);
        imageView.setImageResource(i7);
        boolean z11 = this.f32038e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f32036b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i7;
        super.dispatchDraw(canvas);
        if (this.f32039f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.h;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (hd.f24104a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(19.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (hd.f24104a0) {
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
        sb2.append(this.f32035a.getText());
        TextView textView = this.f32036b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f32038e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f32039f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f32036b.setText(charSequence);
    }
}
