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
import b8.mf;
import org.telegram.messenger.bd;
public final class m2 extends FrameLayout {
    public final org.telegram.ui.Components.o5 f28332a;
    public final ImageView f28333b;
    public final ImageView f28334c;
    public final int d;
    public boolean f28335e;
    public boolean f28336f;

    public m2(int i3, Context context, e6 e6Var) {
        super(context);
        int i10;
        int i11;
        this.f28336f = false;
        this.d = i3;
        if (i3 != 4) {
            setBackgroundDrawable(k6.M0(e6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f28333b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        r6.t(imageView, k6.J5, e6Var, PorterDuff.Mode.MULTIPLY);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, mf.e(56, 48, i10 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f28334c = imageView2;
        imageView2.setScaleType(scaleType);
        r6.t(imageView2, k6.h7, e6Var, PorterDuff.Mode.SRC_IN);
        if (bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, mf.e(56, 48, i11 | 16));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.f28332a = o5Var;
        o5Var.setLines(1);
        o5Var.setSingleLine(true);
        o5Var.setGravity(1);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i3 != 0 && i3 != 4) {
            if (i3 == 1) {
                o5Var.setGravity(17);
                r6.V(o5Var, k6.f27988j5, e6Var);
                o5Var.setTextSize(1, 14.0f);
                o5Var.setTypeface(org.telegram.messenger.g0.o());
                addView(o5Var, mf.c(-1.0f, -1));
                return;
            } else if (i3 == 2) {
                o5Var.setGravity(17);
                r6.V(o5Var, k6.Gi, e6Var);
                o5Var.setTextSize(1, 14.0f);
                o5Var.setTypeface(org.telegram.messenger.g0.o());
                o5Var.setBackground(y5.e(k6.w0(k6.Ci, e6Var), 6.0f));
                addView(o5Var, mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        r6.V(o5Var, k6.f27988j5, e6Var);
        o5Var.setTextSize(1, 16.0f);
        addView(o5Var, mf.e(-2, -2, (bd.f21784a0 ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i3, Drawable drawable, boolean z10) {
        float f10;
        float f11;
        int L;
        int i10;
        float f12;
        org.telegram.ui.Components.o5 o5Var = this.f28332a;
        o5Var.setText(charSequence);
        float f13 = 16.0f;
        float f14 = 21.0f;
        ImageView imageView = this.f28333b;
        if (i3 == 0 && drawable == null) {
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
            o5Var.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i3);
        }
        imageView.setVisibility(0);
        if (z10) {
            if (bd.f21784a0) {
                f11 = 21.0f;
            } else {
                f11 = 72.0f;
            }
            int L3 = org.telegram.messenger.g0.L(f11);
            if (bd.f21784a0) {
                f14 = 72.0f;
            }
            o5Var.setPadding(L3, 0, org.telegram.messenger.g0.L(f14), 0);
            if (bd.f21784a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(5.0f);
            }
            if (bd.f21784a0) {
                i10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                i10 = 5;
            }
            imageView.setPadding(L, 0, i10, 0);
            return;
        }
        if (bd.f21784a0) {
            f10 = 16.0f;
        } else {
            f10 = 72.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f10);
        if (bd.f21784a0) {
            f13 = 72.0f;
        }
        o5Var.setPadding(L4, 0, org.telegram.messenger.g0.L(f13), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f28333b;
    }

    public org.telegram.ui.Components.o5 getTextView() {
        return this.f28332a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f28336f) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12 = this.d;
        if (i12 == 2) {
            i11 = 80;
        } else {
            i11 = 48;
        }
        if (i12 == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11), 1073741824));
    }

    public void setChecked(boolean z10) {
        int i3;
        this.f28335e = z10;
        if (z10) {
            i3 = 2131231004;
        } else {
            i3 = 0;
        }
        this.f28334c.setImageResource(i3);
    }

    public void setGravity(int i3) {
        this.f28332a.setGravity(i3);
    }

    public void setIconColor(int i3) {
        this.f28333b.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i3) {
        this.f28332a.setTextColor(i3);
    }
}
