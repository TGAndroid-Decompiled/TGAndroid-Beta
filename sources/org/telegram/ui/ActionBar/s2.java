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
import org.telegram.messenger.dd;
public final class s2 extends FrameLayout {
    public final org.telegram.ui.Components.n5 f20765a;
    public final ImageView f20766b;
    public final ImageView f20767c;
    public final int d;
    public boolean e;
    public boolean f20768f;

    public s2(int i10, Context context, p6 p6Var) {
        super(context);
        int i11;
        int i12;
        this.f20768f = false;
        this.d = i10;
        if (i10 != 4) {
            setBackgroundDrawable(t6.M0(p6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f20766b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        a7.t(imageView, t6.J5, p6Var, PorterDuff.Mode.MULTIPLY);
        if (dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, w7.b6.e(56, 48, i11 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f20767c = imageView2;
        imageView2.setScaleType(scaleType);
        a7.t(imageView2, t6.f21004h7, p6Var, PorterDuff.Mode.SRC_IN);
        if (dd.X) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, w7.b6.e(56, 48, i12 | 16));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.f20765a = n5Var;
        n5Var.setLines(1);
        n5Var.setSingleLine(true);
        n5Var.setGravity(1);
        n5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 != 0 && i10 != 4) {
            if (i10 == 1) {
                n5Var.setGravity(17);
                a7.V(n5Var, t6.f21038j5, p6Var);
                n5Var.setTextSize(1, 14.0f);
                n5Var.setTypeface(org.telegram.messenger.i0.o());
                addView(n5Var, w7.b6.c(-1.0f, -1));
                return;
            } else if (i10 == 2) {
                n5Var.setGravity(17);
                a7.V(n5Var, t6.Gi, p6Var);
                n5Var.setTextSize(1, 14.0f);
                n5Var.setTypeface(org.telegram.messenger.i0.o());
                n5Var.setBackground(j6.e(t6.w0(t6.Ci, p6Var), 6.0f));
                addView(n5Var, w7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        a7.V(n5Var, t6.f21038j5, p6Var);
        n5Var.setTextSize(1, 16.0f);
        addView(n5Var, w7.b6.e(-2, -2, (dd.X ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i10, Drawable drawable, boolean z10) {
        float f7;
        float f10;
        int L;
        int i11;
        float f11;
        org.telegram.ui.Components.n5 n5Var = this.f20765a;
        n5Var.setText(charSequence);
        float f12 = 16.0f;
        float f13 = 21.0f;
        ImageView imageView = this.f20766b;
        if (i10 == 0 && drawable == null) {
            imageView.setVisibility(4);
            if (z10) {
                f11 = 21.0f;
            } else {
                f11 = 16.0f;
            }
            int L2 = org.telegram.messenger.i0.L(f11);
            if (z10) {
                f12 = 21.0f;
            }
            n5Var.setPadding(L2, 0, org.telegram.messenger.i0.L(f12), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i10);
        }
        imageView.setVisibility(0);
        if (z10) {
            if (dd.X) {
                f10 = 21.0f;
            } else {
                f10 = 72.0f;
            }
            int L3 = org.telegram.messenger.i0.L(f10);
            if (dd.X) {
                f13 = 72.0f;
            }
            n5Var.setPadding(L3, 0, org.telegram.messenger.i0.L(f13), 0);
            if (dd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(5.0f);
            }
            if (dd.X) {
                i11 = org.telegram.messenger.i0.L(5.0f);
            } else {
                i11 = 5;
            }
            imageView.setPadding(L, 0, i11, 0);
            return;
        }
        if (dd.X) {
            f7 = 16.0f;
        } else {
            f7 = 72.0f;
        }
        int L4 = org.telegram.messenger.i0.L(f7);
        if (dd.X) {
            f12 = 72.0f;
        }
        n5Var.setPadding(L4, 0, org.telegram.messenger.i0.L(f12), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f20766b;
    }

    public org.telegram.ui.Components.n5 getTextView() {
        return this.f20765a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f20768f) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = this.d;
        if (i13 == 2) {
            i12 = 80;
        } else {
            i12 = 48;
        }
        if (i13 == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i12), 1073741824));
    }

    public void setChecked(boolean z10) {
        int i10;
        this.e = z10;
        if (z10) {
            i10 = 2131231004;
        } else {
            i10 = 0;
        }
        this.f20767c.setImageResource(i10);
    }

    public void setGravity(int i10) {
        this.f20765a.setGravity(i10);
    }

    public void setIconColor(int i10) {
        this.f20766b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i10) {
        this.f20765a.setTextColor(i10);
    }
}
