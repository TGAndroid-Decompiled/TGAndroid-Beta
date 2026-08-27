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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.er;

public class g5 extends FrameLayout {

    public final TextView f24389a;

    public final org.telegram.ui.Components.j6 f24390b;

    public final TextView f24391c;
    public final ImageView d;

    public final f5 f24392e;

    public boolean f24393f;
    public boolean h;

    public boolean f24394n;

    public final int f24395r;

    public boolean f24396s;

    public g5(Context context) {
        this(21, 70, context, null, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
        this.f24389a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i10);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J5, false), PorterDuff.Mode.MULTIPLY));
        }
        boolean z14 = this.f24396s;
        f5 f5Var = this.f24392e;
        f5Var.b(i11, z10, z14);
        setMultiline(z11);
        boolean z15 = this.f24394n;
        org.telegram.ui.Components.j6 j6Var = this.f24390b;
        TextView textView = this.f24391c;
        if (z15) {
            textView.setText(charSequence2);
        } else {
            j6Var.c(charSequence2, z13, true);
        }
        View view = j6Var;
        if (this.f24394n) {
            view = textView;
        }
        view.setVisibility(0);
        f5Var.setContentDescription(charSequence);
        this.f24393f = z12;
    }

    public Switch getCheckBox() {
        return this.f24392e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        int iDp;
        if (this.f24393f) {
            boolean z10 = LocaleController.isRTL;
            ImageView imageView = this.d;
            if (z10) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(imageView != null ? 64.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(imageView != null ? 64.0f : 20.0f);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
        if (this.h) {
            int iDp2 = LocaleController.isRTL ? AndroidUtilities.dp(76.0f) : org.telegram.messenger.y1.B(76.0f, getMeasuredWidth(), 1);
            int iX = rl.x(22.0f, getMeasuredHeight(), 2);
            canvas.drawRect(iDp2, iX, iDp2 + 2, AndroidUtilities.dp(22.0f) + iX, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24389a.getText());
        if (this.f24394n) {
            TextView textView = this.f24391c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.j6 j6Var = this.f24390b;
            if (j6Var != null && !TextUtils.isEmpty(j6Var.getText())) {
                sb2.append("\n");
                sb2.append(j6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f24392e.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f24394n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24395r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f24396s = z10;
    }

    public void setChecked(boolean z10) {
        this.f24392e.c(z10, true);
    }

    public void setDrawLine(boolean z10) {
        this.h = z10;
    }

    public void setMultiline(boolean z10) {
        this.f24394n = z10;
        org.telegram.ui.Components.j6 j6Var = this.f24390b;
        TextView textView = this.f24391c;
        if (z10) {
            textView.setVisibility(0);
            j6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        } else {
            textView.setVisibility(8);
            j6Var.setVisibility(0);
            j6Var.setPadding(0, 0, 0, 0);
        }
    }

    public void setValue(CharSequence charSequence) {
        if (this.f24394n) {
            this.f24391c.setText(charSequence);
        } else {
            this.f24390b.c(charSequence, true, true);
        }
    }

    public g5(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        super(context);
        this.h = true;
        setWillNotDraw(false);
        this.f24395r = i11;
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f24389a = textView;
        rl.l(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        int i12 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f10 = 80.0f;
        } else {
            f10 = z10 ? 64 : i10;
        }
        int i13 = (i11 - 70) / 2;
        float f16 = i13 + 13;
        if (z11) {
            f11 = z10 ? 64 : i10;
        } else {
            f11 = 80.0f;
        }
        addView(textView, h7.z5.d(-1, -2.0f, i12, f10, f16, f11, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f24390b = j6Var;
        j6Var.b(0.55f, 320L, er.h);
        int i14 = org.telegram.ui.ActionBar.g6.f23441z6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j6Var.setPadding(0, 0, 0, 0);
        j6Var.setEllipsizeByGradient(true);
        boolean z12 = LocaleController.isRTL;
        int i15 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f12 = 80.0f;
        } else {
            f12 = z10 ? 64 : i10;
        }
        float f17 = (29 - (z10 ? 2 : 0)) + i13;
        if (z12) {
            f13 = z10 ? 64 : i10;
        } else {
            f13 = 80.0f;
        }
        addView(j6Var, h7.z5.d(-1, -2.0f, i15, f12, f17, f13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24391c = textView2;
        rl.l(i14, c6Var, textView2, 1, 13.0f);
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
            f14 = 80.0f;
        } else {
            f14 = z10 ? 64 : i10;
        }
        float f18 = (38 - (z10 ? 2 : 0)) + i13;
        if (z13) {
            f15 = z10 ? 64 : i10;
        } else {
            f15 = 80.0f;
        }
        addView(textView2, h7.z5.d(-2, -2.0f, i16, f14, f18, f15, 0.0f));
        f5 f5Var = new f5(this, context, c6Var);
        this.f24392e = f5Var;
        int i17 = org.telegram.ui.ActionBar.g6.M6;
        int i18 = org.telegram.ui.ActionBar.g6.N6;
        int i19 = org.telegram.ui.ActionBar.g6.f23053d6;
        f5Var.d(i17, i18, i19, i19);
        addView(f5Var, h7.z5.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        f5Var.setFocusable(false);
    }

    public int a(int i10) {
        return i10;
    }
}
