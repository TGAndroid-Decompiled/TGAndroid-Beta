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
import org.telegram.messenger.id;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.xq;
public class h5 extends FrameLayout {
    public final TextView f29273a;
    public final org.telegram.ui.Components.j6 f29274b;
    public final TextView f29275c;
    public final ImageView d;
    public final g5 f29276e;
    public boolean f29277f;
    public boolean h;
    public boolean f29278n;
    public final int f29279r;
    public boolean f29280s;

    public h5(Context context) {
        this(context, 21, 70, false, null);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i7, boolean z9, int i10, boolean z10, boolean z11, boolean z12) {
        this.f29273a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i7);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.J5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z13 = this.f29280s;
        g5 g5Var = this.f29276e;
        g5Var.b(i10, z9, z13);
        setMultiline(z10);
        boolean z14 = this.f29278n;
        org.telegram.ui.Components.j6 j6Var = this.f29274b;
        TextView textView = this.f29275c;
        if (z14) {
            textView.setText(charSequence2);
        } else {
            j6Var.c(charSequence2, z12, true);
        }
        if (this.f29278n) {
            j6Var = textView;
        }
        j6Var.setVisibility(0);
        g5Var.setContentDescription(charSequence);
        this.f29277f = z11;
    }

    public Switch getCheckBox() {
        return this.f29276e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int z9;
        int y10;
        float f10;
        float L;
        int i7;
        if (this.f29277f) {
            boolean z10 = id.f23157a0;
            float f11 = 20.0f;
            ImageView imageView = this.d;
            if (z10) {
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
            if (id.f23157a0) {
                if (imageView != null) {
                    f11 = 64.0f;
                }
                i7 = org.telegram.messenger.g0.L(f11);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
        }
        if (this.h) {
            if (id.f23157a0) {
                z9 = org.telegram.messenger.g0.L(76.0f);
            } else {
                z9 = org.telegram.messenger.k5.z(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(z9, org.telegram.messenger.camera.q.y(22.0f, getMeasuredHeight(), 2), z9 + 2, org.telegram.messenger.g0.L(22.0f) + y10, org.telegram.ui.ActionBar.k6.f27975k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29273a.getText());
        if (this.f29278n) {
            TextView textView = this.f29275c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.j6 j6Var = this.f29274b;
            if (j6Var != null && !TextUtils.isEmpty(j6Var.getText())) {
                sb2.append("\n");
                sb2.append(j6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f29276e.h);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f29278n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f29279r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z9) {
        this.f29280s = z9;
    }

    public void setChecked(boolean z9) {
        this.f29276e.c(z9, true);
    }

    public void setDrawLine(boolean z9) {
        this.h = z9;
    }

    public void setMultiline(boolean z9) {
        this.f29278n = z9;
        org.telegram.ui.Components.j6 j6Var = this.f29274b;
        TextView textView = this.f29275c;
        if (z9) {
            textView.setVisibility(0);
            j6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            return;
        }
        textView.setVisibility(8);
        j6Var.setVisibility(0);
        j6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f29278n) {
            this.f29275c.setText(charSequence);
        } else {
            this.f29274b.c(charSequence, true, true);
        }
    }

    public h5(Context context, int i7, int i10, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        this.h = true;
        setWillNotDraw(false);
        this.f29279r = i10;
        if (z9) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, c8.ha.d(48, 48.0f, (id.f23157a0 ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f29273a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((id.f23157a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = id.f23157a0;
        int i11 = (z10 ? 5 : 3) | 48;
        if (z10) {
            f10 = 80.0f;
        } else {
            f10 = z9 ? 64 : i7;
        }
        int i12 = (i10 - 70) / 2;
        float f16 = i12 + 13;
        if (z10) {
            f11 = z9 ? 64 : i7;
        } else {
            f11 = 80.0f;
        }
        addView(textView, c8.ha.d(-1, -2.0f, i11, f10, f16, f11, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f29274b = j6Var;
        j6Var.b(0.55f, 320L, xq.h);
        int i13 = org.telegram.ui.ActionBar.k6.f28262z6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i13, f6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var.setGravity(id.f23157a0 ? 5 : 3);
        j6Var.setPadding(0, 0, 0, 0);
        j6Var.setEllipsizeByGradient(true);
        boolean z11 = id.f23157a0;
        int i14 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f12 = 80.0f;
        } else {
            f12 = z9 ? 64 : i7;
        }
        float f17 = (29 - (z9 ? 2 : 0)) + i12;
        if (z11) {
            f13 = z9 ? 64 : i7;
        } else {
            f13 = 80.0f;
        }
        addView(j6Var, c8.ha.d(-1, -2.0f, i14, f12, f17, f13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f29275c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i13, f6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(id.f23157a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z12 = id.f23157a0;
        int i15 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f14 = 80.0f;
        } else {
            f14 = z9 ? 64 : i7;
        }
        float f18 = (38 - (z9 ? 2 : 0)) + i12;
        if (z12) {
            f15 = z9 ? 64 : i7;
        } else {
            f15 = 80.0f;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i15, f14, f18, f15, 0.0f));
        g5 g5Var = new g5(this, context, f6Var);
        this.f29276e = g5Var;
        int i16 = org.telegram.ui.ActionBar.k6.M6;
        int i17 = org.telegram.ui.ActionBar.k6.N6;
        int i18 = org.telegram.ui.ActionBar.k6.f27852d6;
        g5Var.d(i16, i17, i18, i18);
        addView(g5Var, c8.ha.d(37, 40.0f, (id.f23157a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        g5Var.setFocusable(false);
    }

    public int a(int i7) {
        return i7;
    }
}
