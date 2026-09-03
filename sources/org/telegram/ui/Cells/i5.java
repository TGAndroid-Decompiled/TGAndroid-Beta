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
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.mr;
public class i5 extends FrameLayout {
    public final TextView f21181a;
    public final org.telegram.ui.Components.k6 f21182b;
    public final TextView f21183c;
    public final ImageView d;
    public final h5 e;
    public boolean f21184f;
    public boolean h;
    public boolean f21185n;
    public final int f21186r;
    public boolean f21187s;

    public i5(Context context) {
        this(21, 70, context, null, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z4, int i11, boolean z10, boolean z11, boolean z12) {
        this.f21181a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i10);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J5, false), PorterDuff.Mode.MULTIPLY));
        }
        boolean z13 = this.f21187s;
        h5 h5Var = this.e;
        h5Var.b(i11, z4, z13);
        setMultiline(z10);
        boolean z14 = this.f21185n;
        org.telegram.ui.Components.k6 k6Var = this.f21182b;
        TextView textView = this.f21183c;
        if (z14) {
            textView.setText(charSequence2);
        } else {
            k6Var.c(charSequence2, z12, true);
        }
        if (this.f21185n) {
            k6Var = textView;
        }
        k6Var.setVisibility(0);
        h5Var.setContentDescription(charSequence);
        this.f21184f = z11;
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int B;
        int x10;
        float f10;
        float dp;
        int i10;
        if (this.f21184f) {
            boolean z4 = LocaleController.isRTL;
            float f11 = 20.0f;
            ImageView imageView = this.d;
            if (z4) {
                dp = 0.0f;
            } else {
                if (imageView != null) {
                    f10 = 64.0f;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (imageView != null) {
                    f11 = 64.0f;
                }
                i10 = AndroidUtilities.dp(f11);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
        if (this.h) {
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(76.0f);
            } else {
                B = org.telegram.messenger.y3.B(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(B, org.telegram.ui.b.x(22.0f, getMeasuredHeight(), 2), B + 2, AndroidUtilities.dp(22.0f) + x10, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21181a.getText());
        if (this.f21185n) {
            TextView textView = this.f21183c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb.append("\n");
                sb.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.k6 k6Var = this.f21182b;
            if (k6Var != null && !TextUtils.isEmpty(k6Var.getText())) {
                sb.append("\n");
                sb.append(k6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f21185n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f21186r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z4) {
        this.f21187s = z4;
    }

    public void setChecked(boolean z4) {
        this.e.c(z4, true);
    }

    public void setDrawLine(boolean z4) {
        this.h = z4;
    }

    public void setMultiline(boolean z4) {
        this.f21185n = z4;
        org.telegram.ui.Components.k6 k6Var = this.f21182b;
        TextView textView = this.f21183c;
        if (z4) {
            textView.setVisibility(0);
            k6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            return;
        }
        textView.setVisibility(8);
        k6Var.setVisibility(0);
        k6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f21185n) {
            this.f21183c.setText(charSequence);
        } else {
            this.f21182b.c(charSequence, true, true);
        }
    }

    public i5(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.h = true;
        setWillNotDraw(false);
        this.f21186r = i11;
        if (z4) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, k7.b6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f21181a = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        int i12 = (z10 ? 5 : 3) | 48;
        if (z10) {
            f10 = 80.0f;
        } else {
            f10 = z4 ? 64 : i10;
        }
        int i13 = (i11 - 70) / 2;
        float f16 = i13 + 13;
        if (z10) {
            f11 = z4 ? 64 : i10;
        } else {
            f11 = 80.0f;
        }
        addView(textView, k7.b6.d(-1, -2.0f, i12, f10, f16, f11, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f21182b = k6Var;
        k6Var.b(0.55f, 320L, mr.h);
        int i14 = org.telegram.ui.ActionBar.j6.f20273z6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        k6Var.setPadding(0, 0, 0, 0);
        k6Var.setEllipsizeByGradient(true);
        boolean z11 = LocaleController.isRTL;
        int i15 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f12 = 80.0f;
        } else {
            f12 = z4 ? 64 : i10;
        }
        float f17 = (29 - (z4 ? 2 : 0)) + i13;
        if (z11) {
            f13 = z4 ? 64 : i10;
        } else {
            f13 = 80.0f;
        }
        addView(k6Var, k7.b6.d(-1, -2.0f, i15, f12, f17, f13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f21183c = textView2;
        org.telegram.ui.b.l(i14, f6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        int i16 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f14 = 80.0f;
        } else {
            f14 = z4 ? 64 : i10;
        }
        float f18 = (38 - (z4 ? 2 : 0)) + i13;
        if (z12) {
            f15 = z4 ? 64 : i10;
        } else {
            f15 = 80.0f;
        }
        addView(textView2, k7.b6.d(-2, -2.0f, i16, f14, f18, f15, 0.0f));
        h5 h5Var = new h5(this, context, f6Var);
        this.e = h5Var;
        int i17 = org.telegram.ui.ActionBar.j6.M6;
        int i18 = org.telegram.ui.ActionBar.j6.N6;
        int i19 = org.telegram.ui.ActionBar.j6.f19881d6;
        h5Var.d(i17, i18, i19, i19);
        addView(h5Var, k7.b6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        h5Var.setFocusable(false);
    }

    public int a(int i10) {
        return i10;
    }
}
