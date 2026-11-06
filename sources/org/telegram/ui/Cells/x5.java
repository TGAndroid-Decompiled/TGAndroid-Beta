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
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.da0;
public final class x5 extends FrameLayout {
    public final TextView f30880a;
    public final TextView f30881b;
    public final ImageView f30882c;
    public final Switch d;
    public boolean f30883e;
    public boolean f30884f;
    public final org.telegram.ui.ActionBar.f6 h;

    public x5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.h = f6Var;
        ImageView imageView = new ImageView(context);
        this.f30882c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.ha.d(28, 28.0f, i7 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f30880a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z9 = hd.f22871a0;
        if (z9) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z9) {
            f10 = 66.0f;
        } else {
            f10 = 64.0f;
        }
        if (z9) {
            f11 = 64.0f;
        } else {
            f11 = 66.0f;
        }
        addView(textView, c8.ha.d(-1, -2.0f, i14, f10, 8.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30881b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28258z6, f6Var);
        textView2.setTextSize(1, 13.0f);
        if (hd.f22871a0) {
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
        boolean z10 = hd.f22871a0;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i15 = i13 | 48;
        if (z10) {
            f12 = 66.0f;
        } else {
            f12 = 64.0f;
        }
        if (z10) {
            f13 = 64.0f;
        } else {
            f13 = 66.0f;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i15, f12, 31.0f, f13, 10.0f));
        Switch r32 = new Switch(context, f6Var);
        this.d = r32;
        int i16 = org.telegram.ui.ActionBar.k6.M6;
        int i17 = org.telegram.ui.ActionBar.k6.N6;
        int i18 = org.telegram.ui.ActionBar.k6.f27848d6;
        r32.d(i16, i17, i18, i18);
        addView(r32, c8.ha.d(37, 40.0f, (hd.f22871a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, c30 c30Var, int i7, boolean z9) {
        boolean q10;
        this.f30880a.setText(str);
        org.telegram.ui.ActionBar.f6 f6Var = this.h;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        da0 da0Var = new da0(1);
        da0Var.b(c30Var.f32391a, c30Var.f32392b);
        da0Var.f32820b = q10;
        ImageView imageView = this.f30882c;
        imageView.setBackground(da0Var);
        imageView.setImageResource(i7);
        boolean z10 = this.f30883e;
        Switch r02 = this.d;
        r02.b(0, z9, z10);
        this.f30881b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i7;
        super.dispatchDraw(canvas);
        if (this.f30884f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.h;
            if (f6Var != null) {
                paint = f6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f27971k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f27971k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (hd.f22871a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(19.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (hd.f22871a0) {
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
        sb2.append(this.f30880a.getText());
        TextView textView = this.f30881b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z9) {
        this.f30883e = z9;
    }

    public void setChecked(boolean z9) {
        this.d.b(0, z9, true);
    }

    public void setDivider(boolean z9) {
        this.f30884f = z9;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f30881b.setText(charSequence);
    }
}
