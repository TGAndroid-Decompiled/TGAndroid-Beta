package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.y90;
public final class x5 extends FrameLayout {
    public final TextView f30958a;
    public final TextView f30959b;
    public final ImageView f30960c;
    public final Switch d;
    public boolean f30961e;
    public boolean f30962f;
    public final org.telegram.ui.ActionBar.e6 h;

    public x5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
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
        this.f30960c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(imageView, mf.d(28, 28.0f, i3 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f30958a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = bd.f21784a0;
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
        addView(textView, mf.d(-1, -2.0f, i14, f10, 8.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30959b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        textView2.setTextSize(1, 13.0f);
        if (bd.f21784a0) {
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
        boolean z11 = bd.f21784a0;
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
        addView(textView2, mf.d(-2, -2.0f, i15, f12, 31.0f, f13, 10.0f));
        Switch r32 = new Switch(context, e6Var);
        this.d = r32;
        int i16 = org.telegram.ui.ActionBar.k6.M6;
        int i17 = org.telegram.ui.ActionBar.k6.N6;
        int i18 = org.telegram.ui.ActionBar.k6.f27878d6;
        r32.d(i16, i17, i18, i18);
        addView(r32, mf.d(37, 40.0f, (bd.f21784a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, y20 y20Var, int i3, boolean z10) {
        boolean q10;
        this.f30958a.setText(str);
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        y90 y90Var = new y90(1);
        y90Var.b(y20Var.f40592a, y20Var.f40593b);
        y90Var.f40668b = q10;
        ImageView imageView = this.f30960c;
        imageView.setBackground(y90Var);
        imageView.setImageResource(i3);
        boolean z11 = this.f30961e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f30959b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i3;
        super.dispatchDraw(canvas);
        if (this.f30962f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.h;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (bd.f21784a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(19.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (bd.f21784a0) {
                    i3 = org.telegram.messenger.g0.L(19.0f);
                } else {
                    i3 = 0;
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, paint2);
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
        sb2.append(this.f30958a.getText());
        TextView textView = this.f30959b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f30961e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f30962f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f30959b.setText(charSequence);
    }
}
