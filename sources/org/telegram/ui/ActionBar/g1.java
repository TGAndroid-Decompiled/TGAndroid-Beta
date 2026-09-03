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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
public class g1 extends FrameLayout {
    public int B;
    public final g6 C;
    public Runnable D;
    public boolean E;
    public ValueAnimator F;
    public boolean G;
    public int H;
    public final org.telegram.ui.Components.t5 f21375a;
    public TextView f21376b;
    public final kj0 f21377c;
    public boolean d;
    public np f21378e;
    public ImageView f21379f;
    public p9 h;
    public int f21380n;
    public int f21381r;
    public PorterDuff.Mode f21382s;
    public int v;
    public int f21383w;
    public boolean f21384x;
    public boolean f21385y;

    public g1(Context context, boolean z4, boolean z10) {
        this(0, context, null, z4, z10);
    }

    public final void a(int i10) {
        int i11;
        int dp;
        int i12;
        int dp2;
        if (i10 > 0) {
            np npVar = new np(getContext(), 26, this.C);
            this.f21378e = npVar;
            npVar.setDrawUnchecked(false);
            this.f21378e.b(-1, -1, k6.E8);
            this.f21378e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.t5 t5Var = this.f21375a;
            int i13 = 3;
            if (i10 == 1) {
                boolean z4 = LocaleController.isRTL;
                this.d = !z4;
                np npVar2 = this.f21378e;
                if (z4) {
                    i13 = 5;
                }
                addView(npVar2, k7.c6.e(26, -1, i13 | 16));
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
            np npVar3 = this.f21378e;
            if (!LocaleController.isRTL) {
                i13 = 5;
            }
            addView(npVar3, k7.c6.e(26, -1, i13 | 16));
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
        this.F.addListener(new eg.u2(8, this, z4));
        this.F.setInterpolator(pr.h);
        this.F.start();
    }

    public final void e(int i10, PorterDuff.Mode mode) {
        if (this.f21381r == i10 && this.f21382s == mode) {
            return;
        }
        this.f21381r = i10;
        this.f21382s = mode;
        this.f21377c.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public final void f(int i10, CharSequence charSequence) {
        g(charSequence, i10, null);
    }

    public final void g(CharSequence charSequence, int i10, Drawable drawable) {
        float f10;
        int dp;
        int i11;
        org.telegram.ui.Components.t5 t5Var = this.f21375a;
        t5Var.setText(charSequence);
        kj0 kj0Var = this.f21377c;
        if (i10 == 0 && drawable == null && this.f21378e == null) {
            this.H = 0;
            kj0Var.setVisibility(4);
            t5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.H = 0;
            kj0Var.setImageDrawable(drawable);
        } else {
            this.H = i10;
            kj0Var.setImageResource(i10);
        }
        kj0Var.setVisibility(0);
        float f11 = 0.0f;
        if (this.d) {
            if (this.f21378e != null) {
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
        } else if (this.f21378e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        t5Var.setPadding(dp, 0, i11, 0);
    }

    public np getCheckView() {
        return this.f21378e;
    }

    public int getIconResId() {
        return this.H;
    }

    public ImageView getImageView() {
        return this.f21377c;
    }

    public ImageView getRightIcon() {
        return this.f21379f;
    }

    public org.telegram.ui.Components.t5 getTextView() {
        return this.f21375a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int dp;
        int i10;
        int i11;
        org.telegram.ui.Components.t5 t5Var = this.f21375a;
        t5Var.setText(charSequence);
        if (!this.d || this.f21378e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (this.d || this.f21378e != null) {
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
            addView(p9Var2, k7.c6.e(28, 28, i11 | 16));
        }
        this.f21377c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        int i10;
        int i11 = this.v;
        int i12 = 0;
        if (this.f21384x) {
            i10 = this.f21383w;
        } else {
            i10 = 0;
        }
        if (this.f21385y) {
            i12 = this.f21383w;
        }
        setBackground(k6.Y(i11, i10, i12));
    }

    public final void j(boolean z4, boolean z10) {
        if (this.f21384x == z4 && this.f21385y == z10) {
            return;
        }
        this.f21384x = z4;
        this.f21385y = z10;
        i();
    }

    public final void k(boolean z4, boolean z10) {
        if (this.f21384x == z4 && this.f21385y == z10 && this.f21383w == 12) {
            return;
        }
        this.f21384x = z4;
        this.f21385y = z10;
        this.f21383w = 12;
        i();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        np npVar = this.f21378e;
        if (npVar != null && npVar.f29560a.f24811q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f21378e.f29560a.f24811q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.B), 1073741824));
        if (this.E && this.f21375a.getLayout().getLineCount() > 1) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.B + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i10) {
        this.H = 0;
        this.f21377c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.f21378e.b(-1, -1, i10);
    }

    public void setChecked(boolean z4) {
        np npVar = this.f21378e;
        if (npVar == null) {
            return;
        }
        npVar.a(z4, true);
    }

    public void setEmojiCacheType(int i10) {
        this.f21375a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.H = i10;
        this.f21377c.setImageResource(i10);
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
        org.telegram.ui.Components.t5 t5Var = this.f21375a;
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
        if (this.f21379f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f21379f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f21379f.setColorFilter(this.f21381r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f21379f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f21379f;
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            addView(imageView2, k7.c6.e(24, -1, i13 | 16));
        }
        org.telegram.ui.Components.t5 t5Var = this.f21375a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            if (this.f21379f != null) {
                i12 = AndroidUtilities.dp(32.0f);
            } else {
                i12 = 0;
            }
            layoutParams.leftMargin = i12;
        } else {
            if (this.f21379f != null) {
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
            this.f21379f.setVisibility(8);
            return;
        }
        this.f21379f.setVisibility(0);
        this.f21379f.setImageResource(i10);
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
        if (this.f21376b == null) {
            TextView textView = new TextView(getContext());
            this.f21376b = textView;
            textView.setLines(1);
            this.f21376b.setSingleLine(true);
            int i13 = 3;
            this.f21376b.setGravity(3);
            this.f21376b.setEllipsize(TextUtils.TruncateAt.END);
            this.f21376b.setTextColor(k6.v0(k6.ai, this.C));
            this.f21376b.setVisibility(8);
            this.f21376b.setTextSize(1, 13.0f);
            TextView textView2 = this.f21376b;
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
            TextView textView3 = this.f21376b;
            if (LocaleController.isRTL) {
                i13 = 5;
            }
            addView(textView3, k7.c6.d(-2, -2.0f, i13 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z10 = !isEmpty;
        if (this.f21376b.getVisibility() != 0) {
            z4 = false;
        }
        if (z10 != z4) {
            TextView textView4 = this.f21376b;
            if (!isEmpty) {
                i11 = 0;
            }
            textView4.setVisibility(i11);
            org.telegram.ui.Components.t5 t5Var = this.f21375a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
            if (!isEmpty) {
                i12 = AndroidUtilities.dp(10.0f);
            }
            layoutParams.bottomMargin = i12;
            t5Var.setLayoutParams(layoutParams);
        }
        this.f21376b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.f21376b;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f21375a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.f21380n != i10) {
            this.f21380n = i10;
            this.f21375a.setTextColor(i10);
        }
    }

    public g1(Context context, g6 g6Var, boolean z4, boolean z10) {
        this(0, context, g6Var, z4, z10);
    }

    public void setIcon(Drawable drawable) {
        this.H = 0;
        this.f21377c.setImageDrawable(drawable);
    }

    public g1(int i10, Context context, g6 g6Var, boolean z4, boolean z10) {
        super(context);
        this.f21383w = 12;
        this.B = 48;
        this.C = g6Var;
        this.f21384x = z4;
        this.f21385y = z10;
        this.f21380n = k6.v0(k6.E8, g6Var);
        this.f21381r = k6.v0(k6.F8, g6Var);
        this.f21382s = PorterDuff.Mode.MULTIPLY;
        this.v = k6.v0(k6.I5, g6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f21377c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(this.f21381r, PorterDuff.Mode.SRC_IN));
        addView((View) imageView, k7.c6.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.f21375a = t5Var;
        t5Var.setLines(1);
        t5Var.setSingleLine(true);
        t5Var.setGravity(3);
        t5Var.setEllipsize(TextUtils.TruncateAt.END);
        t5Var.setTextColor(this.f21380n);
        t5Var.setTextSize(1, 16.0f);
        addView(t5Var, k7.c6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
