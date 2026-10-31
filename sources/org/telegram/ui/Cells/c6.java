package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.va0;
public final class c6 extends FrameLayout {
    public final TextView f21789a;
    public final TextView f21790b;
    public final ImageView f21791c;
    public final Switch d;
    public boolean e;
    public boolean f21792f;
    public final org.telegram.ui.ActionBar.p6 h;

    public c6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
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
        this.h = p6Var;
        ImageView imageView = new ImageView(context);
        this.f21791c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.b6.d(28, 28.0f, i10 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f21789a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = cd.X;
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
        addView(textView, w7.b6.d(-1, -2.0f, i15, f7, 8.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f21790b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
        textView2.setTextSize(1, 13.0f);
        if (cd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(1.66f), 1.0f);
        boolean z11 = cd.X;
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
        addView(textView2, w7.b6.d(-2, -2.0f, i16, f11, 31.0f, f12, 10.0f));
        Switch r32 = new Switch(context, p6Var);
        this.d = r32;
        int i17 = org.telegram.ui.ActionBar.t6.M6;
        int i18 = org.telegram.ui.ActionBar.t6.N6;
        int i19 = org.telegram.ui.ActionBar.t6.f20929d6;
        r32.d(i17, i18, i19, i19);
        addView(r32, w7.b6.d(37, 40.0f, (cd.X ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, u30 u30Var, int i10, boolean z10) {
        boolean q6;
        this.f21789a.setText(str);
        org.telegram.ui.ActionBar.p6 p6Var = this.h;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        va0 va0Var = new va0(1);
        va0Var.b(u30Var.f30802a, u30Var.f30803b);
        va0Var.f31204b = q6;
        ImageView imageView = this.f21791c;
        imageView.setBackground(va0Var);
        imageView.setImageResource(i10);
        boolean z11 = this.e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f21790b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f21792f) {
            org.telegram.ui.ActionBar.p6 p6Var = this.h;
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (cd.X) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.i0.L(19.0f);
                }
                float f7 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (cd.X) {
                    i10 = org.telegram.messenger.i0.L(19.0f);
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
        sb2.append(this.f21789a.getText());
        TextView textView = this.f21790b;
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
        this.f21792f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f21790b.setText(charSequence);
    }
}
