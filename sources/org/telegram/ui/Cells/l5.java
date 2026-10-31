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
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.gr;
public class l5 extends FrameLayout {
    public final TextView f22237a;
    public final org.telegram.ui.Components.f6 f22238b;
    public final TextView f22239c;
    public final ImageView d;
    public final k5 e;
    public boolean f22240f;
    public boolean h;
    public boolean f22241n;
    public final int f22242r;
    public boolean f22243s;

    public l5(Context context) {
        this(21, 70, context, null, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
        this.f22237a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i10);
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.J5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z14 = this.f22243s;
        k5 k5Var = this.e;
        k5Var.b(i11, z10, z14);
        setMultiline(z11);
        boolean z15 = this.f22241n;
        org.telegram.ui.Components.f6 f6Var = this.f22238b;
        TextView textView = this.f22239c;
        if (z15) {
            textView.setText(charSequence2);
        } else {
            f6Var.c(charSequence2, z13, true);
        }
        if (this.f22241n) {
            f6Var = textView;
        }
        f6Var.setVisibility(0);
        k5Var.setContentDescription(charSequence);
        this.f22240f = z12;
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int z10;
        int y3;
        float f7;
        float L;
        int i10;
        if (this.f22240f) {
            boolean z11 = cd.X;
            float f10 = 20.0f;
            ImageView imageView = this.d;
            if (z11) {
                L = 0.0f;
            } else {
                if (imageView != null) {
                    f7 = 64.0f;
                } else {
                    f7 = 20.0f;
                }
                L = org.telegram.messenger.i0.L(f7);
            }
            float f11 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                if (imageView != null) {
                    f10 = 64.0f;
                }
                i10 = org.telegram.messenger.i0.L(f10);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
        if (this.h) {
            if (cd.X) {
                z10 = org.telegram.messenger.i0.L(76.0f);
            } else {
                z10 = org.telegram.messenger.m5.z(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(z10, z20.y(22.0f, getMeasuredHeight(), 2), z10 + 2, org.telegram.messenger.i0.L(22.0f) + y3, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22237a.getText());
        if (this.f22241n) {
            TextView textView = this.f22239c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.f6 f6Var = this.f22238b;
            if (f6Var != null && !TextUtils.isEmpty(f6Var.getText())) {
                sb2.append("\n");
                sb2.append(f6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f22241n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.f22242r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f22243s = z10;
    }

    public void setChecked(boolean z10) {
        this.e.c(z10, true);
    }

    public void setDrawLine(boolean z10) {
        this.h = z10;
    }

    public void setMultiline(boolean z10) {
        this.f22241n = z10;
        org.telegram.ui.Components.f6 f6Var = this.f22238b;
        TextView textView = this.f22239c;
        if (z10) {
            textView.setVisibility(0);
            f6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(14.0f));
            return;
        }
        textView.setVisibility(8);
        f6Var.setVisibility(0);
        f6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f22241n) {
            this.f22239c.setText(charSequence);
        } else {
            this.f22238b.c(charSequence, true, true);
        }
    }

    public l5(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        this.h = true;
        setWillNotDraw(false);
        this.f22242r = i11;
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, w7.b6.d(48, 48.0f, (cd.X ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f22237a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((cd.X ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = cd.X;
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
        addView(textView, w7.b6.d(-1, -2.0f, i12, f7, f15, f10, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.f22238b = f6Var;
        f6Var.b(0.55f, 320L, gr.h);
        int i14 = org.telegram.ui.ActionBar.t6.f21330z6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i14, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var.setGravity(cd.X ? 5 : 3);
        f6Var.setPadding(0, 0, 0, 0);
        f6Var.setEllipsizeByGradient(true);
        boolean z12 = cd.X;
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
        addView(f6Var, w7.b6.d(-1, -2.0f, i15, f11, f16, f12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22239c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i14, p6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(cd.X ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z13 = cd.X;
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
        addView(textView2, w7.b6.d(-2, -2.0f, i16, f13, f17, f14, 0.0f));
        k5 k5Var = new k5(this, context, p6Var);
        this.e = k5Var;
        int i17 = org.telegram.ui.ActionBar.t6.M6;
        int i18 = org.telegram.ui.ActionBar.t6.N6;
        int i19 = org.telegram.ui.ActionBar.t6.f20929d6;
        k5Var.d(i17, i18, i19, i19);
        addView(k5Var, w7.b6.d(37, 40.0f, (cd.X ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        k5Var.setFocusable(false);
    }

    public int a(int i10) {
        return i10;
    }
}
