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
public final class y2 extends FrameLayout {
    public final org.telegram.ui.Components.s5 f23972a;
    public final ImageView f23973b;
    public final ImageView f23974c;
    public final int d;
    public boolean f23975e;
    public boolean f23976f;

    public y2(Context context, int i9, b6 b6Var) {
        super(context);
        int i10;
        int i11;
        this.f23976f = false;
        this.d = i9;
        if (i9 != 4) {
            setBackgroundDrawable(f6.J0(b6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f23973b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.J5, b6Var), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, g7.e6.e(56, 48, i10 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f23974c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.f23074h7, b6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView2, g7.e6.e(56, 48, i11 | 16));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f23972a = s5Var;
        s5Var.setLines(1);
        s5Var.setSingleLine(true);
        s5Var.setGravity(1);
        s5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i9 != 0 && i9 != 4) {
            if (i9 == 1) {
                s5Var.setGravity(17);
                s5Var.setTextColor(f6.v0(f6.f23108j5, b6Var));
                s5Var.setTextSize(1, 14.0f);
                s5Var.setTypeface(AndroidUtilities.bold());
                addView(s5Var, g7.e6.c(-1.0f, -1));
                return;
            } else if (i9 == 2) {
                s5Var.setGravity(17);
                s5Var.setTextColor(f6.v0(f6.Sh, b6Var));
                s5Var.setTextSize(1, 14.0f);
                s5Var.setTypeface(AndroidUtilities.bold());
                s5Var.setBackground(v5.e(new float[]{6.0f}, f6.v0(f6.Oh, b6Var)));
                addView(s5Var, g7.e6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        s5Var.setTextColor(f6.v0(f6.f23108j5, b6Var));
        s5Var.setTextSize(1, 16.0f);
        addView(s5Var, g7.e6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i9, Drawable drawable, boolean z10) {
        float f10;
        float f11;
        int dp;
        int i10;
        float f12;
        org.telegram.ui.Components.s5 s5Var = this.f23972a;
        s5Var.setText(charSequence);
        float f13 = 16.0f;
        float f14 = 21.0f;
        ImageView imageView = this.f23973b;
        if (i9 == 0 && drawable == null) {
            imageView.setVisibility(4);
            if (z10) {
                f12 = 21.0f;
            } else {
                f12 = 16.0f;
            }
            int dp2 = AndroidUtilities.dp(f12);
            if (z10) {
                f13 = 21.0f;
            }
            s5Var.setPadding(dp2, 0, AndroidUtilities.dp(f13), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i9);
        }
        imageView.setVisibility(0);
        if (z10) {
            if (LocaleController.isRTL) {
                f11 = 21.0f;
            } else {
                f11 = 72.0f;
            }
            int dp3 = AndroidUtilities.dp(f11);
            if (LocaleController.isRTL) {
                f14 = 72.0f;
            }
            s5Var.setPadding(dp3, 0, AndroidUtilities.dp(f14), 0);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(5.0f);
            }
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(5.0f);
            } else {
                i10 = 5;
            }
            imageView.setPadding(dp, 0, i10, 0);
            return;
        }
        if (LocaleController.isRTL) {
            f10 = 16.0f;
        } else {
            f10 = 72.0f;
        }
        int dp4 = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            f13 = 72.0f;
        }
        s5Var.setPadding(dp4, 0, AndroidUtilities.dp(f13), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f23973b;
    }

    public org.telegram.ui.Components.s5 getTextView() {
        return this.f23972a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f23976f) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12 = this.d;
        if (i12 == 2) {
            i11 = 80;
        } else {
            i11 = 48;
        }
        if (i12 == 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i11), 1073741824));
    }

    public void setChecked(boolean z10) {
        int i9;
        this.f23975e = z10;
        if (z10) {
            i9 = R.drawable.checkbig;
        } else {
            i9 = 0;
        }
        this.f23974c.setImageResource(i9);
    }

    public void setGravity(int i9) {
        this.f23972a.setGravity(i9);
    }

    public void setIconColor(int i9) {
        this.f23973b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i9) {
        this.f23972a.setTextColor(i9);
    }
}
