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
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p9;
public class g1 extends FrameLayout {
    public int B;
    public final f6 C;
    public Runnable D;
    public boolean E;
    public ValueAnimator F;
    public boolean G;
    public int H;
    public final org.telegram.ui.Components.t5 f19677a;
    public TextView f19678b;
    public final jj0 f19679c;
    public boolean d;
    public kp e;
    public ImageView f19680f;
    public p9 h;
    public int f19681n;
    public int f19682r;
    public PorterDuff.Mode f19683s;
    public int v;
    public int f19684w;
    public boolean f19685x;
    public boolean f19686y;

    public g1(Context context, boolean z4, boolean z10) {
        this(0, context, null, z4, z10);
    }

    public final void a(int i10) {
        int i11;
        int dp;
        int i12;
        int dp2;
        if (i10 > 0) {
            kp kpVar = new kp(getContext(), 26, this.C);
            this.e = kpVar;
            kpVar.setDrawUnchecked(false);
            this.e.b(-1, -1, j6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.t5 t5Var = this.f19677a;
            int i13 = 3;
            if (i10 == 1) {
                boolean z4 = LocaleController.isRTL;
                this.d = !z4;
                kp kpVar2 = this.e;
                if (z4) {
                    i13 = 5;
                }
                addView(kpVar2, k7.b6.e(26, -1, i13 | 16));
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
                t5Var.setPadding(i12, 0, dp2, 0);
                return;
            }
            kp kpVar3 = this.e;
            if (!LocaleController.isRTL) {
                i13 = 5;
            }
            addView(kpVar3, k7.b6.e(26, -1, i13 | 16));
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
            t5Var.setPadding(i11, 0, dp, 0);
        }
    }

    public final void b() {
        Runnable runnable = this.D;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i10, int i11) {
        setTextColor(i10);
        setIconColor(i11);
    }

    public final void d(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (this.G) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.F = ofFloat;
        this.G = z4;
        ofFloat.addUpdateListener(new x0(this, 1));
        this.F.addListener(new dg.w2(10, this, z4));
        this.F.setInterpolator(mr.h);
        this.F.start();
    }

    public final void e(int i10, PorterDuff.Mode mode) {
        if (this.f19682r == i10 && this.f19683s == mode) {
            return;
        }
        this.f19682r = i10;
        this.f19683s = mode;
        this.f19679c.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public final void f(int i10, CharSequence charSequence) {
        g(charSequence, i10, null);
    }

    public final void g(CharSequence charSequence, int i10, Drawable drawable) {
        float f10;
        int dp;
        int i11;
        org.telegram.ui.Components.t5 t5Var = this.f19677a;
        t5Var.setText(charSequence);
        jj0 jj0Var = this.f19679c;
        if (i10 == 0 && drawable == null && this.e == null) {
            this.H = 0;
            jj0Var.setVisibility(4);
            t5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.H = 0;
            jj0Var.setImageDrawable(drawable);
        } else {
            this.H = i10;
            jj0Var.setImageResource(i10);
        }
        jj0Var.setVisibility(0);
        float f11 = 0.0f;
        if (this.d) {
            if (this.e != null) {
                dp = AndroidUtilities.dp(43.0f);
            } else {
                dp = 0;
            }
        } else {
            if (i10 == 0 && drawable == null) {
                f10 = 0.0f;
            } else {
                f10 = 43.0f;
            }
            dp = AndroidUtilities.dp(f10);
        }
        if (this.d) {
            i11 = AndroidUtilities.dp((i10 == 0 && drawable == null) ? 43.0f : 43.0f);
        } else if (this.e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        t5Var.setPadding(dp, 0, i11, 0);
    }

    public kp getCheckView() {
        return this.e;
    }

    public int getIconResId() {
        return this.H;
    }

    public ImageView getImageView() {
        return this.f19679c;
    }

    public ImageView getRightIcon() {
        return this.f19680f;
    }

    public org.telegram.ui.Components.t5 getTextView() {
        return this.f19677a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int dp;
        int i10;
        int i11;
        org.telegram.ui.Components.t5 t5Var = this.f19677a;
        t5Var.setText(charSequence);
        if (!this.d || this.e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (this.d || this.e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        t5Var.setPadding(dp, 0, i10, 0);
        if (this.h == null) {
            p9 p9Var = new p9(getContext());
            this.h = p9Var;
            p9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            p9 p9Var2 = this.h;
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(p9Var2, k7.b6.e(28, 28, i11 | 16));
        }
        this.f19679c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        int i10;
        int i11 = this.v;
        int i12 = 0;
        if (this.f19685x) {
            i10 = this.f19684w;
        } else {
            i10 = 0;
        }
        if (this.f19686y) {
            i12 = this.f19684w;
        }
        setBackground(j6.Y(i11, i10, i12));
    }

    public final void j(boolean z4, boolean z10) {
        if (this.f19685x == z4 && this.f19686y == z10) {
            return;
        }
        this.f19685x = z4;
        this.f19686y = z10;
        i();
    }

    public final void k(boolean z4, boolean z10) {
        if (this.f19685x == z4 && this.f19686y == z10 && this.f19684w == 12) {
            return;
        }
        this.f19685x = z4;
        this.f19686y = z10;
        this.f19684w = 12;
        i();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        kp kpVar = this.e;
        if (kpVar != null && kpVar.f26377a.f22938q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.e.f26377a.f22938q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.B), 1073741824));
        if (this.E && this.f19677a.getLayout().getLineCount() > 1) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.B + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i10) {
        this.H = 0;
        this.f19679c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.e.b(-1, -1, i10);
    }

    public void setChecked(boolean z4) {
        kp kpVar = this.e;
        if (kpVar == null) {
            return;
        }
        kpVar.a(z4, true);
    }

    public void setEmojiCacheType(int i10) {
        this.f19677a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.H = i10;
        this.f19679c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        e(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        p9 p9Var = this.h;
        if (p9Var != null) {
            p9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.B = i10;
    }

    public void setMultiline(boolean z4) {
        org.telegram.ui.Components.t5 t5Var = this.f19677a;
        t5Var.setLines(2);
        if (z4) {
            t5Var.setTextSize(1, 14.0f);
        } else {
            this.E = true;
        }
        t5Var.setSingleLine(false);
        t5Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        int i11;
        float f10;
        int i12;
        int i13;
        if (this.f19680f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f19680f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f19680f.setColorFilter(this.f19682r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f19680f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f19680f;
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            addView(imageView2, k7.b6.e(24, -1, i13 | 16));
        }
        org.telegram.ui.Components.t5 t5Var = this.f19677a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            if (this.f19680f != null) {
                i12 = AndroidUtilities.dp(32.0f);
            } else {
                i12 = 0;
            }
            layoutParams.leftMargin = i12;
        } else {
            if (this.f19680f != null) {
                i11 = AndroidUtilities.dp(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
        }
        t5Var.setLayoutParams(layoutParams);
        float f11 = 18.0f;
        if (LocaleController.isRTL) {
            f10 = 8.0f;
        } else {
            f10 = 18.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (!LocaleController.isRTL) {
            f11 = 8.0f;
        }
        setPadding(dp, 0, AndroidUtilities.dp(f11), 0);
        if (i10 == 0) {
            this.f19680f.setVisibility(8);
            return;
        }
        this.f19680f.setVisibility(0);
        this.f19680f.setImageResource(i10);
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
        boolean z4 = true;
        int i12 = 0;
        if (this.f19678b == null) {
            TextView textView = new TextView(getContext());
            this.f19678b = textView;
            textView.setLines(1);
            this.f19678b.setSingleLine(true);
            int i13 = 3;
            this.f19678b.setGravity(3);
            this.f19678b.setEllipsize(TextUtils.TruncateAt.END);
            this.f19678b.setTextColor(j6.v0(j6.ai, this.C));
            this.f19678b.setVisibility(8);
            this.f19678b.setTextSize(1, 13.0f);
            TextView textView2 = this.f19678b;
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
            TextView textView3 = this.f19678b;
            if (LocaleController.isRTL) {
                i13 = 5;
            }
            addView(textView3, k7.b6.d(-2, -2.0f, i13 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z10 = !isEmpty;
        if (this.f19678b.getVisibility() != 0) {
            z4 = false;
        }
        if (z10 != z4) {
            TextView textView4 = this.f19678b;
            if (!isEmpty) {
                i11 = 0;
            }
            textView4.setVisibility(i11);
            org.telegram.ui.Components.t5 t5Var = this.f19677a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
            if (!isEmpty) {
                i12 = AndroidUtilities.dp(10.0f);
            }
            layoutParams.bottomMargin = i12;
            t5Var.setLayoutParams(layoutParams);
        }
        this.f19678b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.f19678b;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f19677a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.f19681n != i10) {
            this.f19681n = i10;
            this.f19677a.setTextColor(i10);
        }
    }

    public g1(Context context, f6 f6Var, boolean z4, boolean z10) {
        this(0, context, f6Var, z4, z10);
    }

    public void setIcon(Drawable drawable) {
        this.H = 0;
        this.f19679c.setImageDrawable(drawable);
    }

    public g1(int i10, Context context, f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.f19684w = 12;
        this.B = 48;
        this.C = f6Var;
        this.f19685x = z4;
        this.f19686y = z10;
        this.f19681n = j6.v0(j6.E8, f6Var);
        this.f19682r = j6.v0(j6.F8, f6Var);
        this.f19683s = PorterDuff.Mode.MULTIPLY;
        this.v = j6.v0(j6.I5, f6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f19679c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(this.f19682r, PorterDuff.Mode.SRC_IN));
        addView((View) imageView, k7.b6.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.f19677a = t5Var;
        t5Var.setLines(1);
        t5Var.setSingleLine(true);
        t5Var.setGravity(3);
        t5Var.setEllipsize(TextUtils.TruncateAt.END);
        t5Var.setTextColor(this.f19681n);
        t5Var.setTextSize(1, 16.0f);
        addView(t5Var, k7.b6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
