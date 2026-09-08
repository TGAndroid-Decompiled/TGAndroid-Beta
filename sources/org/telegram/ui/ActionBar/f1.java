package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
public class f1 extends FrameLayout {
    public int E;
    public final f6 F;
    public Runnable G;
    public boolean H;
    public ValueAnimator I;
    public boolean J;
    public int K;
    public final org.telegram.ui.Components.y5 f20428a;
    public TextView f20429b;
    public final aj0 f20430c;
    public boolean d;
    public mp f20431e;
    public ImageView f20432f;
    public x9 h;
    public int f20433n;
    public int f20434r;
    public PorterDuff.Mode f20435s;
    public int v;
    public int f20436w;
    public boolean f20437x;
    public boolean f20438y;

    public f1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        int i11;
        int dp;
        int i12;
        int dp2;
        if (i10 > 0) {
            mp mpVar = new mp(getContext(), 26, this.F);
            this.f20431e = mpVar;
            mpVar.setDrawUnchecked(false);
            this.f20431e.b(-1, -1, j6.E8);
            this.f20431e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.y5 y5Var = this.f20428a;
            int i13 = 3;
            if (i10 == 1) {
                boolean z10 = LocaleController.isRTL;
                this.d = !z10;
                mp mpVar2 = this.f20431e;
                if (z10) {
                    i13 = 5;
                }
                addView(mpVar2, w7.x5.e(26, -1, i13 | 16));
                if (!LocaleController.isRTL) {
                    i12 = AndroidUtilities.dp(34.0f);
                } else {
                    i12 = 0;
                }
                if (!LocaleController.isRTL) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(34.0f);
                }
                y5Var.setPadding(i12, 0, dp2, 0);
                return;
            }
            mp mpVar3 = this.f20431e;
            if (!LocaleController.isRTL) {
                i13 = 5;
            }
            addView(mpVar3, w7.x5.e(26, -1, i13 | 16));
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(34.0f);
            } else {
                i11 = 0;
            }
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(34.0f);
            }
            y5Var.setPadding(i11, 0, dp, 0);
        }
    }

    public final void b() {
        Runnable runnable = this.G;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i10, int i11) {
        setTextColor(i10);
        setIconColor(i11);
    }

    public final void d(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (this.J) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.I = ofFloat;
        this.J = z10;
        ofFloat.addUpdateListener(new w0(this, 1));
        this.I.addListener(new ah.q0(19, this, z10));
        this.I.setInterpolator(pr.h);
        this.I.start();
    }

    public final void e(int i10, PorterDuff.Mode mode) {
        if (this.f20434r == i10 && this.f20435s == mode) {
            return;
        }
        this.f20434r = i10;
        this.f20435s = mode;
        this.f20430c.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public final void f(int i10, CharSequence charSequence) {
        g(charSequence, i10, null);
    }

    public final void g(CharSequence charSequence, int i10, Drawable drawable) {
        float f7;
        int dp;
        int i11;
        org.telegram.ui.Components.y5 y5Var = this.f20428a;
        y5Var.setText(charSequence);
        aj0 aj0Var = this.f20430c;
        if (i10 == 0 && drawable == null && this.f20431e == null) {
            this.K = 0;
            aj0Var.setVisibility(4);
            y5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.K = 0;
            aj0Var.setImageDrawable(drawable);
        } else {
            this.K = i10;
            aj0Var.setImageResource(i10);
        }
        aj0Var.setVisibility(0);
        float f10 = 0.0f;
        if (this.d) {
            if (this.f20431e != null) {
                dp = AndroidUtilities.dp(43.0f);
            } else {
                dp = 0;
            }
        } else {
            if (i10 == 0 && drawable == null) {
                f7 = 0.0f;
            } else {
                f7 = 43.0f;
            }
            dp = AndroidUtilities.dp(f7);
        }
        if (this.d) {
            i11 = AndroidUtilities.dp((i10 == 0 && drawable == null) ? 43.0f : 43.0f);
        } else if (this.f20431e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        y5Var.setPadding(dp, 0, i11, 0);
    }

    public mp getCheckView() {
        return this.f20431e;
    }

    public int getIconResId() {
        return this.K;
    }

    public ImageView getImageView() {
        return this.f20430c;
    }

    public ImageView getRightIcon() {
        return this.f20432f;
    }

    public org.telegram.ui.Components.y5 getTextView() {
        return this.f20428a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int dp;
        int i10;
        int i11;
        org.telegram.ui.Components.y5 y5Var = this.f20428a;
        y5Var.setText(charSequence);
        if (!this.d || this.f20431e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (this.d || this.f20431e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        y5Var.setPadding(dp, 0, i10, 0);
        if (this.h == null) {
            x9 x9Var = new x9(getContext());
            this.h = x9Var;
            x9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            x9 x9Var2 = this.h;
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(x9Var2, w7.x5.e(28, 28, i11 | 16));
        }
        this.f20430c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        int i10;
        int i11 = this.v;
        int i12 = 0;
        if (this.f20437x) {
            i10 = this.f20436w;
        } else {
            i10 = 0;
        }
        if (this.f20438y) {
            i12 = this.f20436w;
        }
        setBackground(j6.Y(i11, i10, i12));
    }

    public final void j(boolean z10, boolean z11) {
        if (this.f20437x == z10 && this.f20438y == z11) {
            return;
        }
        this.f20437x = z10;
        this.f20438y = z11;
        i();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f20437x == z10 && this.f20438y == z11 && this.f20436w == 12) {
            return;
        }
        this.f20437x = z10;
        this.f20438y = z11;
        this.f20436w = 12;
        i();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        mp mpVar = this.f20431e;
        if (mpVar != null && mpVar.f28504a.f23934q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f20431e.f28504a.f23934q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.E), 1073741824));
        if (this.H && this.f20428a.getLayout().getLineCount() > 1) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.E + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i10) {
        this.K = 0;
        this.f20430c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.f20431e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        mp mpVar = this.f20431e;
        if (mpVar == null) {
            return;
        }
        mpVar.a(z10, true);
    }

    public void setEmojiCacheType(int i10) {
        this.f20428a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.K = i10;
        this.f20430c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        e(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        x9 x9Var = this.h;
        if (x9Var != null) {
            x9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.E = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.y5 y5Var = this.f20428a;
        y5Var.setLines(2);
        if (z10) {
            y5Var.setTextSize(1, 14.0f);
        } else {
            this.H = true;
        }
        y5Var.setSingleLine(false);
        y5Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        int i11;
        float f7;
        int i12;
        int i13;
        if (this.f20432f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f20432f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f20432f.setColorFilter(this.f20434r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f20432f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f20432f;
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            addView(imageView2, w7.x5.e(24, -1, i13 | 16));
        }
        org.telegram.ui.Components.y5 y5Var = this.f20428a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            if (this.f20432f != null) {
                i12 = AndroidUtilities.dp(32.0f);
            } else {
                i12 = 0;
            }
            layoutParams.leftMargin = i12;
        } else {
            if (this.f20432f != null) {
                i11 = AndroidUtilities.dp(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
        }
        y5Var.setLayoutParams(layoutParams);
        float f10 = 18.0f;
        if (LocaleController.isRTL) {
            f7 = 8.0f;
        } else {
            f7 = 18.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (!LocaleController.isRTL) {
            f10 = 8.0f;
        }
        setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        if (i10 == 0) {
            this.f20432f.setVisibility(8);
            return;
        }
        this.f20432f.setVisibility(0);
        this.f20432f.setImageResource(i10);
    }

    public void setSelectorColor(int i10) {
        if (this.v != i10) {
            this.v = i10;
            i();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        int dp;
        int i10;
        int i11 = 8;
        boolean z10 = true;
        int i12 = 0;
        if (this.f20429b == null) {
            TextView textView = new TextView(getContext());
            this.f20429b = textView;
            textView.setLines(1);
            this.f20429b.setSingleLine(true);
            int i13 = 3;
            this.f20429b.setGravity(3);
            this.f20429b.setEllipsize(TextUtils.TruncateAt.END);
            this.f20429b.setTextColor(j6.v0(j6.f20645ai, this.F));
            this.f20429b.setVisibility(8);
            this.f20429b.setTextSize(1, 13.0f);
            TextView textView2 = this.f20429b;
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(43.0f);
            }
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(43.0f);
            } else {
                i10 = 0;
            }
            textView2.setPadding(dp, 0, i10, 0);
            TextView textView3 = this.f20429b;
            if (LocaleController.isRTL) {
                i13 = 5;
            }
            addView(textView3, w7.x5.d(-2, -2.0f, i13 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f20429b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f20429b;
            if (!isEmpty) {
                i11 = 0;
            }
            textView4.setVisibility(i11);
            org.telegram.ui.Components.y5 y5Var = this.f20428a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y5Var.getLayoutParams();
            if (!isEmpty) {
                i12 = AndroidUtilities.dp(10.0f);
            }
            layoutParams.bottomMargin = i12;
            y5Var.setLayoutParams(layoutParams);
        }
        this.f20429b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.f20429b;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f20428a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.f20433n != i10) {
            this.f20433n = i10;
            this.f20428a.setTextColor(i10);
        }
    }

    public f1(Context context, f6 f6Var, boolean z10, boolean z11) {
        this(0, context, f6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.K = 0;
        this.f20430c.setImageDrawable(drawable);
    }

    public f1(int i10, Context context, f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.f20436w = 12;
        this.E = 48;
        this.F = f6Var;
        this.f20437x = z10;
        this.f20438y = z11;
        this.f20433n = j6.v0(j6.E8, f6Var);
        this.f20434r = j6.v0(j6.F8, f6Var);
        this.f20435s = PorterDuff.Mode.MULTIPLY;
        this.v = j6.v0(j6.I5, f6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f20430c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(this.f20434r, PorterDuff.Mode.SRC_IN));
        addView((View) imageView, w7.x5.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(context);
        this.f20428a = y5Var;
        y5Var.setLines(1);
        y5Var.setSingleLine(true);
        y5Var.setGravity(3);
        y5Var.setEllipsize(TextUtils.TruncateAt.END);
        y5Var.setTextColor(this.f20433n);
        y5Var.setTextSize(1, 16.0f);
        addView(y5Var, w7.x5.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
