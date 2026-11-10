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
import c8.ha;
import org.telegram.messenger.id;
public final class p2 extends FrameLayout {
    public final org.telegram.ui.Components.p5 f28371a;
    public final ImageView f28372b;
    public final ImageView f28373c;
    public final int d;
    public boolean f28374e;
    public boolean f28375f;

    public p2(int i7, Context context, h6 h6Var) {
        super(context);
        int i10;
        int i11;
        this.f28375f = false;
        this.d = i7;
        if (i7 != 4) {
            setBackgroundDrawable(m6.M0(h6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f28372b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        t6.s(imageView, m6.J5, h6Var, PorterDuff.Mode.MULTIPLY);
        if (id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, ha.e(56, 48, i10 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f28373c = imageView2;
        imageView2.setScaleType(scaleType);
        t6.s(imageView2, m6.h7, h6Var, PorterDuff.Mode.SRC_IN);
        if (id.f23161a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, ha.e(56, 48, i11 | 16));
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(context);
        this.f28371a = p5Var;
        p5Var.setLines(1);
        p5Var.setSingleLine(true);
        p5Var.setGravity(1);
        p5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 != 0 && i7 != 4) {
            if (i7 == 1) {
                p5Var.setGravity(17);
                t6.U(p5Var, m6.f27998j5, h6Var);
                p5Var.setTextSize(1, 14.0f);
                p5Var.setTypeface(org.telegram.messenger.g0.o());
                addView(p5Var, ha.c(-1.0f, -1));
                return;
            } else if (i7 == 2) {
                p5Var.setGravity(17);
                t6.U(p5Var, m6.Gi, h6Var);
                p5Var.setTextSize(1, 14.0f);
                p5Var.setTypeface(org.telegram.messenger.g0.o());
                p5Var.setBackground(b6.e(m6.w0(m6.Ci, h6Var), 6.0f));
                addView(p5Var, ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        t6.U(p5Var, m6.f27998j5, h6Var);
        p5Var.setTextSize(1, 16.0f);
        addView(p5Var, ha.e(-2, -2, (id.f23161a0 ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i7, Drawable drawable, boolean z9) {
        float f10;
        float f11;
        int L;
        int i10;
        float f12;
        org.telegram.ui.Components.p5 p5Var = this.f28371a;
        p5Var.setText(charSequence);
        float f13 = 16.0f;
        float f14 = 21.0f;
        ImageView imageView = this.f28372b;
        if (i7 == 0 && drawable == null) {
            imageView.setVisibility(4);
            if (z9) {
                f12 = 21.0f;
            } else {
                f12 = 16.0f;
            }
            int L2 = org.telegram.messenger.g0.L(f12);
            if (z9) {
                f13 = 21.0f;
            }
            p5Var.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i7);
        }
        imageView.setVisibility(0);
        if (z9) {
            if (id.f23161a0) {
                f11 = 21.0f;
            } else {
                f11 = 72.0f;
            }
            int L3 = org.telegram.messenger.g0.L(f11);
            if (id.f23161a0) {
                f14 = 72.0f;
            }
            p5Var.setPadding(L3, 0, org.telegram.messenger.g0.L(f14), 0);
            if (id.f23161a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(5.0f);
            }
            if (id.f23161a0) {
                i10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                i10 = 5;
            }
            imageView.setPadding(L, 0, i10, 0);
            return;
        }
        if (id.f23161a0) {
            f10 = 16.0f;
        } else {
            f10 = 72.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f10);
        if (id.f23161a0) {
            f13 = 72.0f;
        }
        p5Var.setPadding(L4, 0, org.telegram.messenger.g0.L(f13), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f28372b;
    }

    public org.telegram.ui.Components.p5 getTextView() {
        return this.f28371a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f28375f) {
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

    public void setChecked(boolean z9) {
        int i7;
        this.f28374e = z9;
        if (z9) {
            i7 = 2131231004;
        } else {
            i7 = 0;
        }
        this.f28373c.setImageResource(i7);
    }

    public void setGravity(int i7) {
        this.f28371a.setGravity(i7);
    }

    public void setIconColor(int i7) {
        this.f28372b.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i7) {
        this.f28371a.setTextColor(i7);
    }
}
