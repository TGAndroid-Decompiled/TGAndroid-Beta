package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.nr;
public class j5 extends FrameLayout {
    public final TextView f30905a;
    public final org.telegram.ui.Components.o6 f30906b;
    public final TextView f30907c;
    public final ImageView d;
    public final i5 f30908e;
    public boolean f30909f;
    public boolean h;
    public boolean f30910n;
    public final int f30911r;
    public boolean f30912s;

    public j5(Context context) {
        this(context, 21, 70, false, null);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i7, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        this.f30905a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i7);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.J5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z14 = this.f30912s;
        i5 i5Var = this.f30908e;
        i5Var.b(i10, z10, z14);
        setMultiline(z11);
        boolean z15 = this.f30910n;
        org.telegram.ui.Components.o6 o6Var = this.f30906b;
        TextView textView = this.f30907c;
        if (z15) {
            textView.setText(charSequence2);
        } else {
            o6Var.c(charSequence2, z13, true);
        }
        if (this.f30910n) {
            o6Var = textView;
        }
        o6Var.setVisibility(0);
        i5Var.setContentDescription(charSequence);
        this.f30909f = z12;
    }

    public Switch getCheckBox() {
        return this.f30908e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int z10;
        int z11;
        float f10;
        float L;
        int i7;
        if (this.f30909f) {
            boolean z12 = gd.f24241a0;
            float f11 = 20.0f;
            ImageView imageView = this.d;
            if (z12) {
                L = 0.0f;
            } else {
                if (imageView != null) {
                    f10 = 64.0f;
                } else {
                    f10 = 20.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            float f12 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24241a0) {
                if (imageView != null) {
                    f11 = 64.0f;
                }
                i7 = org.telegram.messenger.g0.L(f11);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29501k0);
        }
        if (this.h) {
            if (gd.f24241a0) {
                z10 = org.telegram.messenger.g0.L(76.0f);
            } else {
                z10 = org.telegram.messenger.f3.z(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(z10, n10.z(22.0f, getMeasuredHeight(), 2), z10 + 2, org.telegram.messenger.g0.L(22.0f) + z11, org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30905a.getText());
        if (this.f30910n) {
            TextView textView = this.f30907c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.o6 o6Var = this.f30906b;
            if (o6Var != null && !TextUtils.isEmpty(o6Var.getText())) {
                sb2.append("\n");
                sb2.append(o6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f30908e.h);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f30910n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30911r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f30912s = z10;
    }

    public void setChecked(boolean z10) {
        this.f30908e.c(z10, true);
    }

    public void setDrawLine(boolean z10) {
        this.h = z10;
    }

    public void setMultiline(boolean z10) {
        this.f30910n = z10;
        org.telegram.ui.Components.o6 o6Var = this.f30906b;
        TextView textView = this.f30907c;
        if (z10) {
            textView.setVisibility(0);
            o6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            return;
        }
        textView.setVisibility(8);
        o6Var.setVisibility(0);
        o6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f30910n) {
            this.f30907c.setText(charSequence);
        } else {
            this.f30906b.c(charSequence, true, true);
        }
    }

    public j5(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.h = true;
        setWillNotDraw(false);
        this.f30911r = i10;
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, c8.ma.d(48, 48.0f, (gd.f24241a0 ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f30905a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((gd.f24241a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = gd.f24241a0;
        int i11 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f10 = 80.0f;
        } else {
            f10 = z10 ? 64 : i7;
        }
        int i12 = (i10 - 70) / 2;
        float f16 = i12 + 13;
        if (z11) {
            f11 = z10 ? 64 : i7;
        } else {
            f11 = 80.0f;
        }
        addView(textView, c8.ma.d(-1, -2.0f, i11, f10, f16, f11, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f30906b = o6Var;
        o6Var.b(0.55f, 320L, nr.h);
        int i13 = org.telegram.ui.ActionBar.m6.f29789z6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i13, h6Var);
        o6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        o6Var.setGravity(gd.f24241a0 ? 5 : 3);
        o6Var.setPadding(0, 0, 0, 0);
        o6Var.setEllipsizeByGradient(true);
        boolean z12 = gd.f24241a0;
        int i14 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f12 = 80.0f;
        } else {
            f12 = z10 ? 64 : i7;
        }
        float f17 = (29 - (z10 ? 2 : 0)) + i12;
        if (z12) {
            f13 = z10 ? 64 : i7;
        } else {
            f13 = 80.0f;
        }
        addView(o6Var, c8.ma.d(-1, -2.0f, i14, f12, f17, f13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30907c = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i13, h6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(gd.f24241a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z13 = gd.f24241a0;
        int i15 = (z13 ? 5 : 3) | 48;
        if (z13) {
            f14 = 80.0f;
        } else {
            f14 = z10 ? 64 : i7;
        }
        float f18 = (38 - (z10 ? 2 : 0)) + i12;
        if (z13) {
            f15 = z10 ? 64 : i7;
        } else {
            f15 = 80.0f;
        }
        addView(textView2, c8.ma.d(-2, -2.0f, i15, f14, f18, f15, 0.0f));
        i5 i5Var = new i5(this, context, h6Var);
        this.f30908e = i5Var;
        int i16 = org.telegram.ui.ActionBar.m6.M6;
        int i17 = org.telegram.ui.ActionBar.m6.N6;
        int i18 = org.telegram.ui.ActionBar.m6.f29378d6;
        i5Var.d(i16, i17, i18, i18);
        addView(i5Var, c8.ma.d(37, 40.0f, (gd.f24241a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        i5Var.setFocusable(false);
    }

    public int a(int i7) {
        return i7;
    }
}
