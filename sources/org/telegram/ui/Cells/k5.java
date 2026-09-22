package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.qr;
public class k5 extends FrameLayout {
    public final TextView f20559a;
    public final org.telegram.ui.Components.o6 f20560b;
    public final TextView f20561c;
    public final ImageView d;
    public final j5 e;
    public boolean f20562f;
    public boolean h;
    public boolean f20563n;
    public final int f20564r;
    public boolean f20565s;

    public k5(Context context) {
        this(21, 70, context, null, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
        this.f20559a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i10);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J5, false), PorterDuff.Mode.MULTIPLY));
        }
        boolean z14 = this.f20565s;
        j5 j5Var = this.e;
        j5Var.b(i11, z10, z14);
        setMultiline(z11);
        boolean z15 = this.f20563n;
        org.telegram.ui.Components.o6 o6Var = this.f20560b;
        TextView textView = this.f20561c;
        if (z15) {
            textView.setText(charSequence2);
        } else {
            o6Var.c(charSequence2, z13, true);
        }
        if (this.f20563n) {
            o6Var = textView;
        }
        o6Var.setVisibility(0);
        j5Var.setContentDescription(charSequence);
        this.f20562f = z12;
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int B;
        int z10;
        float f7;
        float dp;
        int i10;
        if (this.f20562f) {
            boolean z11 = LocaleController.isRTL;
            float f10 = 20.0f;
            ImageView imageView = this.d;
            if (z11) {
                dp = 0.0f;
            } else {
                if (imageView != null) {
                    f7 = 64.0f;
                } else {
                    f7 = 20.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (imageView != null) {
                    f10 = 64.0f;
                }
                i10 = AndroidUtilities.dp(f10);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f19231k0);
        }
        if (this.h) {
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(76.0f);
            } else {
                B = org.telegram.messenger.l0.B(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(B, rk.z(22.0f, getMeasuredHeight(), 2), B + 2, AndroidUtilities.dp(22.0f) + z10, org.telegram.ui.ActionBar.j6.f19231k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20559a.getText());
        if (this.f20563n) {
            TextView textView = this.f20561c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.o6 o6Var = this.f20560b;
            if (o6Var != null && !TextUtils.isEmpty(o6Var.getText())) {
                sb2.append("\n");
                sb2.append(o6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f20563n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f20564r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f20565s = z10;
    }

    public void setChecked(boolean z10) {
        this.e.c(z10, true);
    }

    public void setDrawLine(boolean z10) {
        this.h = z10;
    }

    public void setMultiline(boolean z10) {
        this.f20563n = z10;
        org.telegram.ui.Components.o6 o6Var = this.f20560b;
        TextView textView = this.f20561c;
        if (z10) {
            textView.setVisibility(0);
            o6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            return;
        }
        textView.setVisibility(8);
        o6Var.setVisibility(0);
        o6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f20563n) {
            this.f20561c.setText(charSequence);
        } else {
            this.f20560b.c(charSequence, true, true);
        }
    }

    public k5(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        this.h = true;
        setWillNotDraw(false);
        this.f20564r = i11;
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, w7.y5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f20559a = textView;
        rk.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        int i12 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f7 = 80.0f;
        } else {
            f7 = z10 ? 64 : i10;
        }
        int i13 = (i11 - 70) / 2;
        float f15 = i13 + 13;
        if (z11) {
            f10 = z10 ? 64 : i10;
        } else {
            f10 = 80.0f;
        }
        addView(textView, w7.y5.d(-1, -2.0f, i12, f7, f15, f10, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f20560b = o6Var;
        o6Var.b(0.55f, 320L, qr.h);
        int i14 = org.telegram.ui.ActionBar.j6.f19511z6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        o6Var.setPadding(0, 0, 0, 0);
        o6Var.setEllipsizeByGradient(true);
        boolean z12 = LocaleController.isRTL;
        int i15 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f11 = 80.0f;
        } else {
            f11 = z10 ? 64 : i10;
        }
        float f16 = (29 - (z10 ? 2 : 0)) + i13;
        if (z12) {
            f12 = z10 ? 64 : i10;
        } else {
            f12 = 80.0f;
        }
        addView(o6Var, w7.y5.d(-1, -2.0f, i15, f11, f16, f12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f20561c = textView2;
        rk.n(i14, f6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        int i16 = (z13 ? 5 : 3) | 48;
        if (z13) {
            f13 = 80.0f;
        } else {
            f13 = z10 ? 64 : i10;
        }
        float f17 = (38 - (z10 ? 2 : 0)) + i13;
        if (z13) {
            f14 = z10 ? 64 : i10;
        } else {
            f14 = 80.0f;
        }
        addView(textView2, w7.y5.d(-2, -2.0f, i16, f13, f17, f14, 0.0f));
        j5 j5Var = new j5(this, context, f6Var);
        this.e = j5Var;
        int i17 = org.telegram.ui.ActionBar.j6.M6;
        int i18 = org.telegram.ui.ActionBar.j6.N6;
        int i19 = org.telegram.ui.ActionBar.j6.f19109d6;
        j5Var.d(i17, i18, i19, i19);
        addView(j5Var, w7.y5.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        j5Var.setFocusable(false);
    }

    public int a(int i10) {
        return i10;
    }
}
