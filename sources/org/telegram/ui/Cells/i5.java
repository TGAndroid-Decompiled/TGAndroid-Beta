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
import org.telegram.messenger.kk;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.bs;
public class i5 extends FrameLayout {
    public final TextView f22422a;
    public final org.telegram.ui.Components.q6 f22423b;
    public final TextView f22424c;
    public final ImageView d;
    public final h5 e;
    public boolean f22425f;
    public boolean h;
    public boolean f22426n;
    public final int f22427r;
    public boolean f22428s;

    public i5(Context context) {
        this(21, 70, context, null, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
        this.f22422a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i10);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J5, false), PorterDuff.Mode.MULTIPLY));
        }
        boolean z14 = this.f22428s;
        h5 h5Var = this.e;
        h5Var.b(i11, z10, z14);
        setMultiline(z11);
        boolean z15 = this.f22426n;
        org.telegram.ui.Components.q6 q6Var = this.f22423b;
        TextView textView = this.f22424c;
        if (z15) {
            textView.setText(charSequence2);
        } else {
            q6Var.c(charSequence2, z13, true);
        }
        if (this.f22426n) {
            q6Var = textView;
        }
        q6Var.setVisibility(0);
        h5Var.setContentDescription(charSequence);
        this.f22425f = z12;
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int B;
        int A;
        float f7;
        float dp;
        int i10;
        if (this.f22425f) {
            boolean z10 = LocaleController.isRTL;
            float f10 = 20.0f;
            ImageView imageView = this.d;
            if (z10) {
                dp = 0.0f;
            } else {
                if (imageView != null) {
                    f7 = 64.0f;
                } else {
                    f7 = 20.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            float f11 = dp;
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21114k0);
        }
        if (this.h) {
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(76.0f);
            } else {
                B = org.telegram.messenger.g0.B(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(B, kk.A(22.0f, getMeasuredHeight(), 2), B + 2, AndroidUtilities.dp(22.0f) + A, org.telegram.ui.ActionBar.h6.f21114k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22422a.getText());
        if (this.f22426n) {
            TextView textView = this.f22424c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.q6 q6Var = this.f22423b;
            if (q6Var != null && !TextUtils.isEmpty(q6Var.getText())) {
                sb2.append("\n");
                sb2.append(q6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f22426n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f22427r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f22428s = z10;
    }

    public void setChecked(boolean z10) {
        this.e.c(z10, true);
    }

    public void setDrawLine(boolean z10) {
        this.h = z10;
    }

    public void setMultiline(boolean z10) {
        this.f22426n = z10;
        org.telegram.ui.Components.q6 q6Var = this.f22423b;
        TextView textView = this.f22424c;
        if (z10) {
            textView.setVisibility(0);
            q6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            return;
        }
        textView.setVisibility(8);
        q6Var.setVisibility(0);
        q6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f22426n) {
            this.f22424c.setText(charSequence);
        } else {
            this.f22423b.c(charSequence, true, true);
        }
    }

    public i5(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        this.h = true;
        setWillNotDraw(false);
        this.f22427r = i11;
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, w7.z5.a(48.0f, 8.0f, 0.0f, 8.0f, 0.0f, 48, (LocaleController.isRTL ? 5 : 3) | 16));
        }
        TextView textView = new TextView(context);
        this.f22422a = textView;
        kk.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 16.0f);
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
        addView(textView, w7.z5.a(-2.0f, f7, f15, f10, 0.0f, -1, i12));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.f22423b = q6Var;
        q6Var.b(0.55f, 320L, bs.h);
        int i14 = org.telegram.ui.ActionBar.h6.f21398z6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        q6Var.setPadding(0, 0, 0, 0);
        q6Var.setEllipsizeByGradient(true);
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
        addView(q6Var, w7.z5.a(-2.0f, f11, f16, f12, 0.0f, -1, i15));
        TextView textView2 = new TextView(context);
        this.f22424c = textView2;
        kk.o(i14, d6Var, textView2, 1, 13.0f);
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
        addView(textView2, w7.z5.a(-2.0f, f13, f17, f14, 0.0f, -2, i16));
        h5 h5Var = new h5(this, context, d6Var);
        this.e = h5Var;
        int i17 = org.telegram.ui.ActionBar.h6.M6;
        int i18 = org.telegram.ui.ActionBar.h6.N6;
        int i19 = org.telegram.ui.ActionBar.h6.f20993d6;
        h5Var.d(i17, i18, i19, i19);
        addView(h5Var, w7.z5.a(40.0f, 21.0f, 0.0f, 21.0f, 0.0f, 37, (LocaleController.isRTL ? 3 : 5) | 16));
        h5Var.setFocusable(false);
    }

    public int a(int i10) {
        return i10;
    }
}
