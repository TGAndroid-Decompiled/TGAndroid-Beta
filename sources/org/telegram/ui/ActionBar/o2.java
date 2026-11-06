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
import org.telegram.messenger.hd;
public final class o2 extends FrameLayout {
    public final org.telegram.ui.Components.q5 f28331a;
    public final ImageView f28332b;
    public final ImageView f28333c;
    public final int d;
    public boolean f28334e;
    public boolean f28335f;

    public o2(int i7, Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        this.f28335f = false;
        this.d = i7;
        if (i7 != 4) {
            setBackgroundDrawable(k6.M0(f6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f28332b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        r6.t(imageView, k6.J5, f6Var, PorterDuff.Mode.MULTIPLY);
        if (hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, ha.e(56, 48, i10 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f28333c = imageView2;
        imageView2.setScaleType(scaleType);
        r6.t(imageView2, k6.h7, f6Var, PorterDuff.Mode.SRC_IN);
        if (hd.f22878a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, ha.e(56, 48, i11 | 16));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.f28331a = q5Var;
        q5Var.setLines(1);
        q5Var.setSingleLine(true);
        q5Var.setGravity(1);
        q5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 != 0 && i7 != 4) {
            if (i7 == 1) {
                q5Var.setGravity(17);
                r6.V(q5Var, k6.f27957j5, f6Var);
                q5Var.setTextSize(1, 14.0f);
                q5Var.setTypeface(org.telegram.messenger.g0.o());
                addView(q5Var, ha.c(-1.0f, -1));
                return;
            } else if (i7 == 2) {
                q5Var.setGravity(17);
                r6.V(q5Var, k6.Gi, f6Var);
                q5Var.setTextSize(1, 14.0f);
                q5Var.setTypeface(org.telegram.messenger.g0.o());
                q5Var.setBackground(z5.e(k6.w0(k6.Ci, f6Var), 6.0f));
                addView(q5Var, ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        r6.V(q5Var, k6.f27957j5, f6Var);
        q5Var.setTextSize(1, 16.0f);
        addView(q5Var, ha.e(-2, -2, (hd.f22878a0 ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i7, Drawable drawable, boolean z9) {
        float f10;
        float f11;
        int L;
        int i10;
        float f12;
        org.telegram.ui.Components.q5 q5Var = this.f28331a;
        q5Var.setText(charSequence);
        float f13 = 16.0f;
        float f14 = 21.0f;
        ImageView imageView = this.f28332b;
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
            q5Var.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i7);
        }
        imageView.setVisibility(0);
        if (z9) {
            if (hd.f22878a0) {
                f11 = 21.0f;
            } else {
                f11 = 72.0f;
            }
            int L3 = org.telegram.messenger.g0.L(f11);
            if (hd.f22878a0) {
                f14 = 72.0f;
            }
            q5Var.setPadding(L3, 0, org.telegram.messenger.g0.L(f14), 0);
            if (hd.f22878a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(5.0f);
            }
            if (hd.f22878a0) {
                i10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                i10 = 5;
            }
            imageView.setPadding(L, 0, i10, 0);
            return;
        }
        if (hd.f22878a0) {
            f10 = 16.0f;
        } else {
            f10 = 72.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f10);
        if (hd.f22878a0) {
            f13 = 72.0f;
        }
        q5Var.setPadding(L4, 0, org.telegram.messenger.g0.L(f13), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f28332b;
    }

    public org.telegram.ui.Components.q5 getTextView() {
        return this.f28331a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f28335f) {
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
        this.f28334e = z9;
        if (z9) {
            i7 = 2131231004;
        } else {
            i7 = 0;
        }
        this.f28333c.setImageResource(i7);
    }

    public void setGravity(int i7) {
        this.f28331a.setGravity(i7);
    }

    public void setIconColor(int i7) {
        this.f28332b.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i7) {
        this.f28331a.setTextColor(i7);
    }
}
