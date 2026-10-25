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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.x40;
public final class e6 extends FrameLayout {
    public final TextView f24026a;
    public final TextView f24027b;
    public final ImageView f24028c;
    public final Switch d;
    public boolean e;
    public boolean f24029f;
    public final org.telegram.ui.ActionBar.u6 h;

    public e6(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
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
        this.h = u6Var;
        ImageView imageView = new ImageView(context);
        this.f24028c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, gb1.h(28, 28.0f, i10 | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f24026a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        vh.r(textView, 1, 16.0f, 1, 1);
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
        addView(textView, gb1.h(-1, -2.0f, i15, f7, 8.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24027b = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        textView2.setTextSize(1, 13.0f);
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
        addView(textView2, gb1.h(-2, -2.0f, i16, f11, 31.0f, f12, 10.0f));
        Switch r32 = new Switch(context, u6Var);
        this.d = r32;
        int i17 = org.telegram.ui.ActionBar.y6.M6;
        int i18 = org.telegram.ui.ActionBar.y6.N6;
        int i19 = org.telegram.ui.ActionBar.y6.f23354d6;
        r32.d(i17, i18, i19, i19);
        addView(r32, gb1.h(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, x40 x40Var, int i10, boolean z10) {
        boolean q5;
        this.f24026a.setText(str);
        org.telegram.ui.ActionBar.u6 u6Var = this.h;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        ic0 ic0Var = new ic0(1);
        ic0Var.b(x40Var.f34618a, x40Var.f34619b);
        ic0Var.f29276b = q5;
        ImageView imageView = this.f24028c;
        imageView.setBackground(ic0Var);
        imageView.setImageResource(i10);
        boolean z11 = this.e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.f24027b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f24029f) {
            org.telegram.ui.ActionBar.u6 u6Var = this.h;
            if (u6Var != null) {
                paint = u6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.y6.f23476k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.y6.f23476k0;
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
        sb2.append(this.f24026a.getText());
        TextView textView = this.f24027b;
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
        this.f24029f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f24027b.setText(charSequence);
    }
}
