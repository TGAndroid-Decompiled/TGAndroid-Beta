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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a3 extends FrameLayout {
    public final org.telegram.ui.Components.x5 f17537a;
    public final ImageView f17538b;
    public final ImageView f17539c;
    public final int d;
    public boolean e;
    public boolean f17540f;

    public a3(Context context, int i10, f6 f6Var) {
        super(context);
        int i11;
        int i12;
        this.f17540f = false;
        this.d = i10;
        if (i10 != 4) {
            setBackgroundDrawable(j6.J0(f6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f17538b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.J5, f6Var), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, w7.a6.e(56, 48, i11 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f17539c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f18000h7, f6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, w7.a6.e(56, 48, i12 | 16));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f17537a = x5Var;
        x5Var.setLines(1);
        x5Var.setSingleLine(true);
        x5Var.setGravity(1);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 != 0 && i10 != 4) {
            if (i10 == 1) {
                x5Var.setGravity(17);
                x5Var.setTextColor(j6.v0(j6.f18034j5, f6Var));
                x5Var.setTextSize(1, 14.0f);
                x5Var.setTypeface(AndroidUtilities.bold());
                addView(x5Var, w7.a6.c(-1.0f, -1));
                return;
            } else if (i10 == 2) {
                x5Var.setGravity(17);
                x5Var.setTextColor(j6.v0(j6.Sh, f6Var));
                x5Var.setTextSize(1, 14.0f);
                x5Var.setTypeface(AndroidUtilities.bold());
                x5Var.setBackground(z5.e(new float[]{6.0f}, j6.v0(j6.Oh, f6Var)));
                addView(x5Var, w7.a6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        x5Var.setTextColor(j6.v0(j6.f18034j5, f6Var));
        x5Var.setTextSize(1, 16.0f);
        addView(x5Var, w7.a6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i10, Drawable drawable, boolean z10) {
        float f7;
        float f10;
        int dp;
        int i11;
        float f11;
        org.telegram.ui.Components.x5 x5Var = this.f17537a;
        x5Var.setText(charSequence);
        float f12 = 16.0f;
        float f13 = 21.0f;
        ImageView imageView = this.f17538b;
        if (i10 == 0 && drawable == null) {
            imageView.setVisibility(4);
            if (z10) {
                f11 = 21.0f;
            } else {
                f11 = 16.0f;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (z10) {
                f12 = 21.0f;
            }
            x5Var.setPadding(dp2, 0, AndroidUtilities.dp(f12), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i10);
        }
        imageView.setVisibility(0);
        if (z10) {
            if (LocaleController.isRTL) {
                f10 = 21.0f;
            } else {
                f10 = 72.0f;
            }
            int dp3 = AndroidUtilities.dp(f10);
            if (LocaleController.isRTL) {
                f13 = 72.0f;
            }
            x5Var.setPadding(dp3, 0, AndroidUtilities.dp(f13), 0);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(5.0f);
            }
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(5.0f);
            } else {
                i11 = 5;
            }
            imageView.setPadding(dp, 0, i11, 0);
            return;
        }
        if (LocaleController.isRTL) {
            f7 = 16.0f;
        } else {
            f7 = 72.0f;
        }
        int dp4 = AndroidUtilities.dp(f7);
        if (LocaleController.isRTL) {
            f12 = 72.0f;
        }
        x5Var.setPadding(dp4, 0, AndroidUtilities.dp(f12), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f17538b;
    }

    public org.telegram.ui.Components.x5 getTextView() {
        return this.f17537a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f17540f) {
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12), 1073741824));
    }

    public void setChecked(boolean z10) {
        int i10;
        this.e = z10;
        if (z10) {
            i10 = R.drawable.checkbig;
        } else {
            i10 = 0;
        }
        this.f17539c.setImageResource(i10);
    }

    public void setGravity(int i10) {
        this.f17537a.setGravity(i10);
    }

    public void setIconColor(int i10) {
        this.f17538b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i10) {
        this.f17537a.setTextColor(i10);
    }
}
