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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.gr;
public class j5 extends FrameLayout {
    public final TextView f24563a;
    public final org.telegram.ui.Components.j6 f24564b;
    public final TextView f24565c;
    public final ImageView d;
    public final i5 f24566e;
    public boolean f24567f;
    public boolean h;
    public boolean f24568n;
    public final int f24569r;
    public boolean f24570s;

    public j5(Context context) {
        this(21, 70, context, null, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i9, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        this.f24563a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i9);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J5, false), PorterDuff.Mode.MULTIPLY));
        }
        boolean z14 = this.f24570s;
        i5 i5Var = this.f24566e;
        i5Var.b(i10, z10, z14);
        setMultiline(z11);
        boolean z15 = this.f24568n;
        org.telegram.ui.Components.j6 j6Var = this.f24564b;
        TextView textView = this.f24565c;
        if (z15) {
            textView.setText(charSequence2);
        } else {
            j6Var.c(charSequence2, z13, true);
        }
        if (this.f24568n) {
            j6Var = textView;
        }
        j6Var.setVisibility(0);
        i5Var.setContentDescription(charSequence);
        this.f24567f = z12;
    }

    public Switch getCheckBox() {
        return this.f24566e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int B;
        int y10;
        float f10;
        float dp;
        int i9;
        if (this.f24567f) {
            boolean z10 = LocaleController.isRTL;
            float f11 = 20.0f;
            ImageView imageView = this.d;
            if (z10) {
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
                i9 = AndroidUtilities.dp(f11);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
        if (this.h) {
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(76.0f);
            } else {
                B = org.telegram.messenger.l0.B(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(B, ll.y(22.0f, getMeasuredHeight(), 2), B + 2, AndroidUtilities.dp(22.0f) + y10, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24563a.getText());
        if (this.f24568n) {
            TextView textView = this.f24565c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.j6 j6Var = this.f24564b;
            if (j6Var != null && !TextUtils.isEmpty(j6Var.getText())) {
                sb2.append("\n");
                sb2.append(j6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f24566e.h);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.f24568n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24569r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f24570s = z10;
    }

    public void setChecked(boolean z10) {
        this.f24566e.c(z10, true);
    }

    public void setDrawLine(boolean z10) {
        this.h = z10;
    }

    public void setMultiline(boolean z10) {
        this.f24568n = z10;
        org.telegram.ui.Components.j6 j6Var = this.f24564b;
        TextView textView = this.f24565c;
        if (z10) {
            textView.setVisibility(0);
            j6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            return;
        }
        textView.setVisibility(8);
        j6Var.setVisibility(0);
        j6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f24568n) {
            this.f24565c.setText(charSequence);
        } else {
            this.f24564b.c(charSequence, true, true);
        }
    }

    public j5(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.h = true;
        setWillNotDraw(false);
        this.f24569r = i10;
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f24563a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        int i11 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f10 = 80.0f;
        } else {
            f10 = z10 ? 64 : i9;
        }
        int i12 = (i10 - 70) / 2;
        float f16 = i12 + 13;
        if (z11) {
            f11 = z10 ? 64 : i9;
        } else {
            f11 = 80.0f;
        }
        addView(textView, g7.e6.d(-1, -2.0f, i11, f10, f16, f11, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f24564b = j6Var;
        j6Var.b(0.55f, 320L, gr.h);
        int i13 = org.telegram.ui.ActionBar.f6.f23386z6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j6Var.setPadding(0, 0, 0, 0);
        j6Var.setEllipsizeByGradient(true);
        boolean z12 = LocaleController.isRTL;
        int i14 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f12 = 80.0f;
        } else {
            f12 = z10 ? 64 : i9;
        }
        float f17 = (29 - (z10 ? 2 : 0)) + i12;
        if (z12) {
            f13 = z10 ? 64 : i9;
        } else {
            f13 = 80.0f;
        }
        addView(j6Var, g7.e6.d(-1, -2.0f, i14, f12, f17, f13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24565c = textView2;
        ll.n(i13, b6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        int i15 = (z13 ? 5 : 3) | 48;
        if (z13) {
            f14 = 80.0f;
        } else {
            f14 = z10 ? 64 : i9;
        }
        float f18 = (38 - (z10 ? 2 : 0)) + i12;
        if (z13) {
            f15 = z10 ? 64 : i9;
        } else {
            f15 = 80.0f;
        }
        addView(textView2, g7.e6.d(-2, -2.0f, i15, f14, f18, f15, 0.0f));
        i5 i5Var = new i5(this, context, b6Var);
        this.f24566e = i5Var;
        int i16 = org.telegram.ui.ActionBar.f6.M6;
        int i17 = org.telegram.ui.ActionBar.f6.N6;
        int i18 = org.telegram.ui.ActionBar.f6.f23001d6;
        i5Var.d(i16, i17, i18, i18);
        addView(i5Var, g7.e6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        i5Var.setFocusable(false);
    }

    public int a(int i9) {
        return i9;
    }
}
