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
    public final org.telegram.ui.Components.t5 f21175a;
    public final ImageView f21176b;
    public final ImageView f21177c;
    public final int d;
    public boolean f21178e;
    public boolean f21179f;

    public a3(Context context, int i10, g6 g6Var) {
        super(context);
        int i11;
        int i12;
        this.f21179f = false;
        this.d = i10;
        if (i10 != 4) {
            setBackgroundDrawable(k6.J0(g6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.f21176b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.J5, g6Var), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, k7.c6.e(56, 48, i11 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f21177c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.f21733h7, g6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, k7.c6.e(56, 48, i12 | 16));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.f21175a = t5Var;
        t5Var.setLines(1);
        t5Var.setSingleLine(true);
        t5Var.setGravity(1);
        t5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 != 0 && i10 != 4) {
            if (i10 == 1) {
                t5Var.setGravity(17);
                t5Var.setTextColor(k6.v0(k6.f21766j5, g6Var));
                t5Var.setTextSize(1, 14.0f);
                t5Var.setTypeface(AndroidUtilities.bold());
                addView(t5Var, k7.c6.c(-1.0f, -1));
                return;
            } else if (i10 == 2) {
                t5Var.setGravity(17);
                t5Var.setTextColor(k6.v0(k6.Sh, g6Var));
                t5Var.setTextSize(1, 14.0f);
                t5Var.setTypeface(AndroidUtilities.bold());
                t5Var.setBackground(a6.e(new float[]{6.0f}, k6.v0(k6.Oh, g6Var)));
                addView(t5Var, k7.c6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        t5Var.setTextColor(k6.v0(k6.f21766j5, g6Var));
        t5Var.setTextSize(1, 16.0f);
        addView(t5Var, k7.c6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i10, Drawable drawable, boolean z4) {
        float f10;
        float f11;
        int dp;
        int i11;
        float f12;
        org.telegram.ui.Components.t5 t5Var = this.f21175a;
        t5Var.setText(charSequence);
        float f13 = 16.0f;
        float f14 = 21.0f;
        ImageView imageView = this.f21176b;
        if (i10 == 0 && drawable == null) {
            imageView.setVisibility(4);
            if (z4) {
                f12 = 21.0f;
            } else {
                f12 = 16.0f;
            }
            int dp2 = AndroidUtilities.dp(f12);
            if (z4) {
                f13 = 21.0f;
            }
            t5Var.setPadding(dp2, 0, AndroidUtilities.dp(f13), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i10);
        }
        imageView.setVisibility(0);
        if (z4) {
            if (LocaleController.isRTL) {
                f11 = 21.0f;
            } else {
                f11 = 72.0f;
            }
            int dp3 = AndroidUtilities.dp(f11);
            if (LocaleController.isRTL) {
                f14 = 72.0f;
            }
            t5Var.setPadding(dp3, 0, AndroidUtilities.dp(f14), 0);
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
            f10 = 16.0f;
        } else {
            f10 = 72.0f;
        }
        int dp4 = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            f13 = 72.0f;
        }
        t5Var.setPadding(dp4, 0, AndroidUtilities.dp(f13), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.f21176b;
    }

    public org.telegram.ui.Components.t5 getTextView() {
        return this.f21175a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f21179f) {
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

    public void setChecked(boolean z4) {
        int i10;
        this.f21178e = z4;
        if (z4) {
            i10 = R.drawable.checkbig;
        } else {
            i10 = 0;
        }
        this.f21177c.setImageResource(i10);
    }

    public void setGravity(int i10) {
        this.f21175a.setGravity(i10);
    }

    public void setIconColor(int i10) {
        this.f21176b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i10) {
        this.f21175a.setTextColor(i10);
    }
}
