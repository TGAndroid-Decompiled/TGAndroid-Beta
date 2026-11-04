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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.xq;
public class h5 extends FrameLayout {
    public final TextView f29337a;
    public final org.telegram.ui.Components.h6 f29338b;
    public final TextView f29339c;
    public final ImageView d;
    public final g5 f29340e;
    public boolean f29341f;
    public boolean h;
    public boolean f29342n;
    public final int f29343r;
    public boolean f29344s;

    public h5(Context context) {
        this(context, 21, 70, false, null);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i3, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        this.f29337a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i3);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.J5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z14 = this.f29344s;
        g5 g5Var = this.f29340e;
        g5Var.b(i10, z10, z14);
        setMultiline(z11);
        boolean z15 = this.f29342n;
        org.telegram.ui.Components.h6 h6Var = this.f29338b;
        TextView textView = this.f29339c;
        if (z15) {
            textView.setText(charSequence2);
        } else {
            h6Var.c(charSequence2, z13, true);
        }
        if (this.f29342n) {
            h6Var = textView;
        }
        h6Var.setVisibility(0);
        g5Var.setContentDescription(charSequence);
        this.f29341f = z12;
    }

    public Switch getCheckBox() {
        return this.f29340e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int z10;
        int y9;
        float f10;
        float L;
        int i3;
        if (this.f29341f) {
            boolean z11 = bd.f21784a0;
            float f11 = 20.0f;
            ImageView imageView = this.d;
            if (z11) {
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
            if (bd.f21784a0) {
                if (imageView != null) {
                    f11 = 64.0f;
                }
                i3 = org.telegram.messenger.g0.L(f11);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
        if (this.h) {
            if (bd.f21784a0) {
                z10 = org.telegram.messenger.g0.L(76.0f);
            } else {
                z10 = org.telegram.messenger.k5.z(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(z10, org.telegram.messenger.camera.q.y(22.0f, getMeasuredHeight(), 2), z10 + 2, org.telegram.messenger.g0.L(22.0f) + y9, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29337a.getText());
        if (this.f29342n) {
            TextView textView = this.f29339c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.h6 h6Var = this.f29338b;
            if (h6Var != null && !TextUtils.isEmpty(h6Var.getText())) {
                sb2.append("\n");
                sb2.append(h6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f29340e.h);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (this.f29342n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f29343r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f29344s = z10;
    }

    public void setChecked(boolean z10) {
        this.f29340e.c(z10, true);
    }

    public void setDrawLine(boolean z10) {
        this.h = z10;
    }

    public void setMultiline(boolean z10) {
        this.f29342n = z10;
        org.telegram.ui.Components.h6 h6Var = this.f29338b;
        TextView textView = this.f29339c;
        if (z10) {
            textView.setVisibility(0);
            h6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            return;
        }
        textView.setVisibility(8);
        h6Var.setVisibility(0);
        h6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f29342n) {
            this.f29339c.setText(charSequence);
        } else {
            this.f29338b.c(charSequence, true, true);
        }
    }

    public h5(Context context, int i3, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.h = true;
        setWillNotDraw(false);
        this.f29343r = i10;
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, mf.d(48, 48.0f, (bd.f21784a0 ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f29337a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((bd.f21784a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = bd.f21784a0;
        int i11 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f10 = 80.0f;
        } else {
            f10 = z10 ? 64 : i3;
        }
        int i12 = (i10 - 70) / 2;
        float f16 = i12 + 13;
        if (z11) {
            f11 = z10 ? 64 : i3;
        } else {
            f11 = 80.0f;
        }
        addView(textView, mf.d(-1, -2.0f, i11, f10, f16, f11, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f29338b = h6Var;
        h6Var.b(0.55f, 320L, xq.h);
        int i13 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i13, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var.setGravity(bd.f21784a0 ? 5 : 3);
        h6Var.setPadding(0, 0, 0, 0);
        h6Var.setEllipsizeByGradient(true);
        boolean z12 = bd.f21784a0;
        int i14 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f12 = 80.0f;
        } else {
            f12 = z10 ? 64 : i3;
        }
        float f17 = (29 - (z10 ? 2 : 0)) + i12;
        if (z12) {
            f13 = z10 ? 64 : i3;
        } else {
            f13 = 80.0f;
        }
        addView(h6Var, mf.d(-1, -2.0f, i14, f12, f17, f13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f29339c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i13, e6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(bd.f21784a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z13 = bd.f21784a0;
        int i15 = (z13 ? 5 : 3) | 48;
        if (z13) {
            f14 = 80.0f;
        } else {
            f14 = z10 ? 64 : i3;
        }
        float f18 = (38 - (z10 ? 2 : 0)) + i12;
        if (z13) {
            f15 = z10 ? 64 : i3;
        } else {
            f15 = 80.0f;
        }
        addView(textView2, mf.d(-2, -2.0f, i15, f14, f18, f15, 0.0f));
        g5 g5Var = new g5(this, context, e6Var);
        this.f29340e = g5Var;
        int i16 = org.telegram.ui.ActionBar.k6.M6;
        int i17 = org.telegram.ui.ActionBar.k6.N6;
        int i18 = org.telegram.ui.ActionBar.k6.f27878d6;
        g5Var.d(i16, i17, i18, i18);
        addView(g5Var, mf.d(37, 40.0f, (bd.f21784a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        g5Var.setFocusable(false);
    }

    public int a(int i3) {
        return i3;
    }
}
