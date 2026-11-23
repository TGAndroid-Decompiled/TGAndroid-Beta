package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import org.telegram.messenger.gd;
public final class p2 extends FrameLayout {
    public final org.telegram.ui.Components.w5 f29933a;
    public final ImageView f29934b;
    public final ImageView f29935c;
    public final int d;
    public boolean f29936e;
    public boolean f29937f;

    public p2(int i7, Context context, i6 i6Var) {
        super(context);
        int i10;
        int i11;
        this.f29937f = false;
        this.d = i7;
        if (i7 != 4) {
            setBackgroundDrawable(n6.M0(i6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f29934b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        u6.s(imageView, n6.J5, i6Var, PorterDuff.Mode.MULTIPLY);
        if (gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, na.e(56, 48, i10 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f29935c = imageView2;
        imageView2.setScaleType(scaleType);
        u6.s(imageView2, n6.h7, i6Var, PorterDuff.Mode.SRC_IN);
        if (gd.f24314a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, na.e(56, 48, i11 | 16));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.f29933a = w5Var;
        w5Var.setLines(1);
        w5Var.setSingleLine(true);
        w5Var.setGravity(1);
        w5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 != 0 && i7 != 4) {
            if (i7 == 1) {
                w5Var.setGravity(17);
                u6.U(w5Var, n6.f29559j5, i6Var);
                w5Var.setTextSize(1, 14.0f);
                w5Var.setTypeface(org.telegram.messenger.g0.o());
                addView(w5Var, na.c(-1.0f, -1));
                return;
            } else if (i7 == 2) {
                w5Var.setGravity(17);
                u6.U(w5Var, n6.Ji, i6Var);
                w5Var.setTextSize(1, 14.0f);
                w5Var.setTypeface(org.telegram.messenger.g0.o());
                w5Var.setBackground(b6.e(n6.w0(n6.Fi, i6Var), 6.0f));
                addView(w5Var, na.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        u6.U(w5Var, n6.f29559j5, i6Var);
        w5Var.setTextSize(1, 16.0f);
        addView(w5Var, na.e(-2, -2, (gd.f24314a0 ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i7, Drawable drawable, boolean z10) {
        float f10;
        float f11;
        int L;
        int i10;
        float f12;
        org.telegram.ui.Components.w5 w5Var = this.f29933a;
        w5Var.setText(charSequence);
        float f13 = 16.0f;
        float f14 = 21.0f;
        ImageView imageView = this.f29934b;
        if (i7 == 0 && drawable == null) {
            imageView.setVisibility(4);
            if (z10) {
                f12 = 21.0f;
            } else {
                f12 = 16.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f12);
            if (z10) {
                f13 = 21.0f;
            }
            w5Var.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i7);
        }
        imageView.setVisibility(0);
        if (z10) {
            if (gd.f24314a0) {
                f11 = 21.0f;
            } else {
                f11 = 72.0f;
            }
            int L3 = org.telegram.messenger.g0.L(f11);
            if (gd.f24314a0) {
                f14 = 72.0f;
            }
            w5Var.setPadding(L3, 0, org.telegram.messenger.g0.L(f14), 0);
            if (gd.f24314a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(5.0f);
            }
            if (gd.f24314a0) {
                i10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                i10 = 5;
            }
            imageView.setPadding(L, 0, i10, 0);
            return;
        }
        if (gd.f24314a0) {
            f10 = 16.0f;
        } else {
            f10 = 72.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f10);
        if (gd.f24314a0) {
            f13 = 72.0f;
        }
        w5Var.setPadding(L4, 0, org.telegram.messenger.g0.L(f13), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f29934b;
    }

    public org.telegram.ui.Components.w5 getTextView() {
        return this.f29933a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f29937f) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12 = this.d;
        if (i12 == 2) {
            i11 = 80;
        } else {
            i11 = 48;
        }
        if (i12 == 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11), 1073741824));
    }

    public void setChecked(boolean z10) {
        int i7;
        this.f29936e = z10;
        if (z10) {
            i7 = 2131231006;
        } else {
            i7 = 0;
        }
        this.f29935c.setImageResource(i7);
    }

    public void setGravity(int i7) {
        this.f29933a.setGravity(i7);
    }

    public void setIconColor(int i7) {
        this.f29934b.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i7) {
        this.f29933a.setTextColor(i7);
    }
}
