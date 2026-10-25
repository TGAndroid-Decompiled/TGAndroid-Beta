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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public class n5 extends FrameLayout {
    public final TextView f24531a;
    public final org.telegram.ui.Components.s6 f24532b;
    public final TextView f24533c;
    public final ImageView d;
    public final m5 e;
    public boolean f24534f;
    public boolean h;
    public boolean f24535n;
    public final int f24536r;
    public boolean f24537s;

    public n5(Context context) {
        this(21, 70, context, null, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
        this.f24531a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i10);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.J5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z14 = this.f24537s;
        m5 m5Var = this.e;
        m5Var.b(i11, z10, z14);
        setMultiline(z11);
        boolean z15 = this.f24535n;
        org.telegram.ui.Components.s6 s6Var = this.f24532b;
        TextView textView = this.f24533c;
        if (z15) {
            textView.setText(charSequence2);
        } else {
            s6Var.c(charSequence2, z13, true);
        }
        if (this.f24535n) {
            s6Var = textView;
        }
        s6Var.setVisibility(0);
        m5Var.setContentDescription(charSequence);
        this.f24534f = z12;
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int C;
        int B;
        float f7;
        float dp;
        int i10;
        if (this.f24534f) {
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
        }
        if (this.h) {
            if (LocaleController.isRTL) {
                C = AndroidUtilities.dp(76.0f);
            } else {
                C = org.telegram.messenger.t.C(76.0f, getMeasuredWidth(), 1);
            }
            canvas.drawRect(C, vh.B(22.0f, getMeasuredHeight(), 2), C + 2, AndroidUtilities.dp(22.0f) + B, org.telegram.ui.ActionBar.y6.f23476k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24531a.getText());
        if (this.f24535n) {
            TextView textView = this.f24533c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb2.append("\n");
                sb2.append(textView.getText());
            }
        } else {
            org.telegram.ui.Components.s6 s6Var = this.f24532b;
            if (s6Var != null && !TextUtils.isEmpty(s6Var.getText())) {
                sb2.append("\n");
                sb2.append(s6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f24535n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24536r), 1073741824));
        }
    }

    public void setAnimationsEnabled(boolean z10) {
        this.f24537s = z10;
    }

    public void setChecked(boolean z10) {
        this.e.c(z10, true);
    }

    public void setDrawLine(boolean z10) {
        this.h = z10;
    }

    public void setMultiline(boolean z10) {
        this.f24535n = z10;
        org.telegram.ui.Components.s6 s6Var = this.f24532b;
        TextView textView = this.f24533c;
        if (z10) {
            textView.setVisibility(0);
            s6Var.setVisibility(8);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            return;
        }
        textView.setVisibility(8);
        s6Var.setVisibility(0);
        s6Var.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        if (this.f24535n) {
            this.f24533c.setText(charSequence);
        } else {
            this.f24532b.c(charSequence, true, true);
        }
    }

    public n5(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        this.h = true;
        setWillNotDraw(false);
        this.f24536r = i11;
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, gb1.h(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.f24531a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        vh.r(textView, 1, 16.0f, 1, 1);
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
        addView(textView, gb1.h(-1, -2.0f, i12, f7, f15, f10, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.f24532b = s6Var;
        s6Var.b(0.55f, 320L, ds.h);
        int i14 = org.telegram.ui.ActionBar.y6.f23765z6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i14, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        s6Var.setPadding(0, 0, 0, 0);
        s6Var.setEllipsizeByGradient(true);
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
        addView(s6Var, gb1.h(-1, -2.0f, i15, f11, f16, f12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24533c = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i14, u6Var);
        textView2.setTextSize(1, 13.0f);
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
        addView(textView2, gb1.h(-2, -2.0f, i16, f13, f17, f14, 0.0f));
        m5 m5Var = new m5(this, context, u6Var);
        this.e = m5Var;
        int i17 = org.telegram.ui.ActionBar.y6.M6;
        int i18 = org.telegram.ui.ActionBar.y6.N6;
        int i19 = org.telegram.ui.ActionBar.y6.f23354d6;
        m5Var.d(i17, i18, i19, i19);
        addView(m5Var, gb1.h(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        m5Var.setFocusable(false);
    }

    public int a(int i10) {
        return i10;
    }
}
