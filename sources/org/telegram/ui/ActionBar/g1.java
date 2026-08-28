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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pi0;
public class g1 extends FrameLayout {
    public int A;
    public final b6 B;
    public Runnable C;
    public boolean D;
    public ValueAnimator E;
    public boolean F;
    public int G;
    public final org.telegram.ui.Components.s5 f23403a;
    public TextView f23404b;
    public final pi0 f23405c;
    public boolean d;
    public dp f23406e;
    public ImageView f23407f;
    public o9 h;
    public int f23408n;
    public int f23409r;
    public PorterDuff.Mode f23410s;
    public int v;
    public int f23411w;
    public boolean f23412x;
    public boolean f23413y;

    public g1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i9) {
        int i10;
        int dp;
        int i11;
        int dp2;
        if (i9 > 0) {
            dp dpVar = new dp(getContext(), 26, this.B);
            this.f23406e = dpVar;
            dpVar.setDrawUnchecked(false);
            this.f23406e.b(-1, -1, f6.E8);
            this.f23406e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.s5 s5Var = this.f23403a;
            int i12 = 3;
            if (i9 == 1) {
                boolean z10 = LocaleController.isRTL;
                this.d = !z10;
                dp dpVar2 = this.f23406e;
                if (z10) {
                    i12 = 5;
                }
                addView(dpVar2, g7.e6.e(26, -1, i12 | 16));
                if (!LocaleController.isRTL) {
                    i11 = AndroidUtilities.dp(34.0f);
                } else {
                    i11 = 0;
                }
                if (!LocaleController.isRTL) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(34.0f);
                }
                s5Var.setPadding(i11, 0, dp2, 0);
                return;
            }
            dp dpVar3 = this.f23406e;
            if (!LocaleController.isRTL) {
                i12 = 5;
            }
            addView(dpVar3, g7.e6.e(26, -1, i12 | 16));
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(34.0f);
            } else {
                i10 = 0;
            }
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(34.0f);
            }
            s5Var.setPadding(i10, 0, dp, 0);
        }
    }

    public final void b() {
        Runnable runnable = this.C;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i9, int i10) {
        setTextColor(i9);
        setIconColor(i10);
    }

    public final void d(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (this.F) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.E = ofFloat;
        this.F = z10;
        ofFloat.addUpdateListener(new x0(this, 1));
        this.E.addListener(new hg.b0(18, this, z10));
        this.E.setInterpolator(gr.h);
        this.E.start();
    }

    public final void e(int i9, PorterDuff.Mode mode) {
        if (this.f23409r == i9 && this.f23410s == mode) {
            return;
        }
        this.f23409r = i9;
        this.f23410s = mode;
        this.f23405c.setColorFilter(new PorterDuffColorFilter(i9, mode));
    }

    public final void f(int i9, CharSequence charSequence) {
        g(charSequence, i9, null);
    }

    public final void g(CharSequence charSequence, int i9, Drawable drawable) {
        float f10;
        int dp;
        int i10;
        org.telegram.ui.Components.s5 s5Var = this.f23403a;
        s5Var.setText(charSequence);
        pi0 pi0Var = this.f23405c;
        if (i9 == 0 && drawable == null && this.f23406e == null) {
            this.G = 0;
            pi0Var.setVisibility(4);
            s5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.G = 0;
            pi0Var.setImageDrawable(drawable);
        } else {
            this.G = i9;
            pi0Var.setImageResource(i9);
        }
        pi0Var.setVisibility(0);
        float f11 = 0.0f;
        if (this.d) {
            if (this.f23406e != null) {
                dp = AndroidUtilities.dp(43.0f);
            } else {
                dp = 0;
            }
        } else {
            if (i9 == 0 && drawable == null) {
                f10 = 0.0f;
            } else {
                f10 = 43.0f;
            }
            dp = AndroidUtilities.dp(f10);
        }
        if (this.d) {
            i10 = AndroidUtilities.dp((i9 == 0 && drawable == null) ? 43.0f : 43.0f);
        } else if (this.f23406e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        s5Var.setPadding(dp, 0, i10, 0);
    }

    public dp getCheckView() {
        return this.f23406e;
    }

    public int getIconResId() {
        return this.G;
    }

    public ImageView getImageView() {
        return this.f23405c;
    }

    public ImageView getRightIcon() {
        return this.f23407f;
    }

    public org.telegram.ui.Components.s5 getTextView() {
        return this.f23403a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int dp;
        int i9;
        int i10;
        org.telegram.ui.Components.s5 s5Var = this.f23403a;
        s5Var.setText(charSequence);
        if (!this.d || this.f23406e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (this.d || this.f23406e != null) {
            i9 = AndroidUtilities.dp(43.0f);
        } else {
            i9 = 0;
        }
        s5Var.setPadding(dp, 0, i9, 0);
        if (this.h == null) {
            o9 o9Var = new o9(getContext());
            this.h = o9Var;
            o9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            o9 o9Var2 = this.h;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(o9Var2, g7.e6.e(28, 28, i10 | 16));
        }
        this.f23405c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        int i9;
        int i10 = this.v;
        int i11 = 0;
        if (this.f23412x) {
            i9 = this.f23411w;
        } else {
            i9 = 0;
        }
        if (this.f23413y) {
            i11 = this.f23411w;
        }
        setBackground(f6.Y(i10, i9, i11));
    }

    public final void j(boolean z10, boolean z11) {
        if (this.f23412x == z10 && this.f23413y == z11) {
            return;
        }
        this.f23412x = z10;
        this.f23413y = z11;
        i();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f23412x == z10 && this.f23413y == z11 && this.f23411w == 12) {
            return;
        }
        this.f23412x = z10;
        this.f23413y = z11;
        this.f23411w = 12;
        i();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        dp dpVar = this.f23406e;
        if (dpVar != null && dpVar.f27781a.f26313q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f23406e.f27781a.f26313q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.A), 1073741824));
        if (this.D && this.f23403a.getLayout().getLineCount() > 1) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.A + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i9) {
        this.G = 0;
        this.f23405c.f(i9, 24, 24, null);
    }

    public void setCheckColor(int i9) {
        this.f23406e.b(-1, -1, i9);
    }

    public void setChecked(boolean z10) {
        dp dpVar = this.f23406e;
        if (dpVar == null) {
            return;
        }
        dpVar.a(z10, true);
    }

    public void setEmojiCacheType(int i9) {
        this.f23403a.setCacheType(i9);
    }

    public void setIcon(int i9) {
        this.G = i9;
        this.f23405c.setImageResource(i9);
    }

    public void setIconColor(int i9) {
        e(i9, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i9) {
        o9 o9Var = this.h;
        if (o9Var != null) {
            o9Var.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i9) {
        this.A = i9;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.s5 s5Var = this.f23403a;
        s5Var.setLines(2);
        if (z10) {
            s5Var.setTextSize(1, 14.0f);
        } else {
            this.D = true;
        }
        s5Var.setSingleLine(false);
        s5Var.setGravity(16);
    }

    public void setRightIcon(int i9) {
        int i10;
        float f10;
        int i11;
        int i12;
        if (this.f23407f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f23407f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f23407f.setColorFilter(this.f23409r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f23407f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f23407f;
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(imageView2, g7.e6.e(24, -1, i12 | 16));
        }
        org.telegram.ui.Components.s5 s5Var = this.f23403a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            if (this.f23407f != null) {
                i11 = AndroidUtilities.dp(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.leftMargin = i11;
        } else {
            if (this.f23407f != null) {
                i10 = AndroidUtilities.dp(32.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
        }
        s5Var.setLayoutParams(layoutParams);
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
        if (i9 == 0) {
            this.f23407f.setVisibility(8);
            return;
        }
        this.f23407f.setVisibility(0);
        this.f23407f.setImageResource(i9);
    }

    public void setSelectorColor(int i9) {
        if (this.v != i9) {
            this.v = i9;
            i();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        int dp;
        int i9;
        int i10 = 8;
        boolean z10 = true;
        int i11 = 0;
        if (this.f23404b == null) {
            TextView textView = new TextView(getContext());
            this.f23404b = textView;
            textView.setLines(1);
            this.f23404b.setSingleLine(true);
            int i12 = 3;
            this.f23404b.setGravity(3);
            this.f23404b.setEllipsize(TextUtils.TruncateAt.END);
            this.f23404b.setTextColor(f6.v0(f6.ai, this.B));
            this.f23404b.setVisibility(8);
            this.f23404b.setTextSize(1, 13.0f);
            TextView textView2 = this.f23404b;
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(43.0f);
            }
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(43.0f);
            } else {
                i9 = 0;
            }
            textView2.setPadding(dp, 0, i9, 0);
            TextView textView3 = this.f23404b;
            if (LocaleController.isRTL) {
                i12 = 5;
            }
            addView(textView3, g7.e6.d(-2, -2.0f, i12 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f23404b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f23404b;
            if (!isEmpty) {
                i10 = 0;
            }
            textView4.setVisibility(i10);
            org.telegram.ui.Components.s5 s5Var = this.f23403a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
            if (!isEmpty) {
                i11 = AndroidUtilities.dp(10.0f);
            }
            layoutParams.bottomMargin = i11;
            s5Var.setLayoutParams(layoutParams);
        }
        this.f23404b.setText(charSequence);
    }

    public void setSubtextColor(int i9) {
        TextView textView = this.f23404b;
        if (textView != null) {
            textView.setTextColor(i9);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f23403a.setText(charSequence);
    }

    public void setTextColor(int i9) {
        if (this.f23408n != i9) {
            this.f23408n = i9;
            this.f23403a.setTextColor(i9);
        }
    }

    public g1(Context context, b6 b6Var, boolean z10, boolean z11) {
        this(0, context, b6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.G = 0;
        this.f23405c.setImageDrawable(drawable);
    }

    public g1(int i9, Context context, b6 b6Var, boolean z10, boolean z11) {
        super(context);
        this.f23411w = 12;
        this.A = 48;
        this.B = b6Var;
        this.f23412x = z10;
        this.f23413y = z11;
        this.f23408n = f6.v0(f6.E8, b6Var);
        this.f23409r = f6.v0(f6.F8, b6Var);
        this.f23410s = PorterDuff.Mode.MULTIPLY;
        this.v = f6.v0(f6.I5, b6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f23405c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(this.f23409r, PorterDuff.Mode.SRC_IN));
        addView((View) imageView, g7.e6.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f23403a = s5Var;
        s5Var.setLines(1);
        s5Var.setSingleLine(true);
        s5Var.setGravity(3);
        s5Var.setEllipsize(TextUtils.TruncateAt.END);
        s5Var.setTextColor(this.f23408n);
        s5Var.setTextSize(1, 16.0f);
        addView(s5Var, g7.e6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i9);
    }
}
