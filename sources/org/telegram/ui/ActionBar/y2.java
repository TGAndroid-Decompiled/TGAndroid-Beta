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
    public final org.telegram.ui.Components.x5 f23977a;
    public final ImageView f23978b;
    public final ImageView f23979c;
    public final int d;
    public boolean f23980e;
    public boolean f23981f;

    public y2(Context context, int i10, c6 c6Var) {
        super(context);
        int i11;
        int i12;
        this.f23981f = false;
        this.d = i10;
        if (i10 != 4) {
            setBackgroundDrawable(g6.J0(c6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f23978b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.J5, c6Var), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, i7.f6.e(56, 48, i11 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f23979c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23135h7, c6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, i7.f6.e(56, 48, i12 | 16));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f23977a = x5Var;
        x5Var.setLines(1);
        x5Var.setSingleLine(true);
        x5Var.setGravity(1);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 != 0 && i10 != 4) {
            if (i10 == 1) {
                x5Var.setGravity(17);
                x5Var.setTextColor(g6.v0(g6.f23169j5, c6Var));
                x5Var.setTextSize(1, 14.0f);
                x5Var.setTypeface(AndroidUtilities.bold());
                addView(x5Var, i7.f6.c(-1.0f, -1));
                return;
            } else if (i10 == 2) {
                x5Var.setGravity(17);
                x5Var.setTextColor(g6.v0(g6.Sh, c6Var));
                x5Var.setTextSize(1, 14.0f);
                x5Var.setTypeface(AndroidUtilities.bold());
                x5Var.setBackground(w5.e(new float[]{6.0f}, g6.v0(g6.Oh, c6Var)));
                addView(x5Var, i7.f6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        x5Var.setTextColor(g6.v0(g6.f23169j5, c6Var));
        x5Var.setTextSize(1, 16.0f);
        addView(x5Var, i7.f6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i10, Drawable drawable, boolean z10) {
        float f9;
        float f10;
        int dp;
        int i11;
        float f11;
        org.telegram.ui.Components.x5 x5Var = this.f23977a;
        x5Var.setText(charSequence);
        float f12 = 16.0f;
        float f13 = 21.0f;
        ImageView imageView = this.f23978b;
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
            f9 = 16.0f;
        } else {
            f9 = 72.0f;
        }
        int dp4 = AndroidUtilities.dp(f9);
        if (LocaleController.isRTL) {
            f12 = 72.0f;
        }
        x5Var.setPadding(dp4, 0, AndroidUtilities.dp(f12), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f23978b;
    }

    public org.telegram.ui.Components.x5 getTextView() {
        return this.f23977a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f23981f) {
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
        this.f23980e = z10;
        if (z10) {
            i10 = R.drawable.checkbig;
        } else {
            i10 = 0;
        }
        this.f23979c.setImageResource(i10);
    }

    public void setGravity(int i10) {
        this.f23977a.setGravity(i10);
    }

    public void setIconColor(int i10) {
        this.f23978b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i10) {
        this.f23977a.setTextColor(i10);
    }
}
