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
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
public class g1 extends FrameLayout {
    public int E;
    public final f6 F;
    public Runnable G;
    public boolean H;
    public ValueAnimator I;
    public boolean J;
    public int K;
    public final org.telegram.ui.Components.x5 f17723a;
    public TextView f17724b;
    public final kj0 f17725c;
    public boolean d;
    public tp e;
    public ImageView f17726f;
    public w9 h;
    public int f17727n;
    public int f17728r;
    public PorterDuff.Mode f17729s;
    public int v;
    public int f17730w;
    public boolean f17731x;
    public boolean f17732y;

    public g1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        int i11;
        int dp;
        int i12;
        int dp2;
        if (i10 > 0) {
            tp tpVar = new tp(getContext(), 26, this.F);
            this.e = tpVar;
            tpVar.setDrawUnchecked(false);
            this.e.b(-1, -1, j6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.x5 x5Var = this.f17723a;
            int i13 = 3;
            if (i10 == 1) {
                boolean z10 = LocaleController.isRTL;
                this.d = !z10;
                tp tpVar2 = this.e;
                if (z10) {
                    i13 = 5;
                }
                addView(tpVar2, w7.a6.e(26, -1, i13 | 16));
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
                x5Var.setPadding(i12, 0, dp2, 0);
                return;
            }
            tp tpVar3 = this.e;
            if (!LocaleController.isRTL) {
                i13 = 5;
            }
            addView(tpVar3, w7.a6.e(26, -1, i13 | 16));
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
            x5Var.setPadding(i11, 0, dp, 0);
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
        ofFloat.addUpdateListener(new x0(this, 1));
        this.I.addListener(new ai.e(14, this, z10));
        this.I.setInterpolator(wr.h);
        this.I.start();
    }

    public final void e(int i10, PorterDuff.Mode mode) {
        if (this.f17728r == i10 && this.f17729s == mode) {
            return;
        }
        this.f17728r = i10;
        this.f17729s = mode;
        this.f17725c.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public final void f(int i10, CharSequence charSequence) {
        g(charSequence, i10, null);
    }

    public final void g(CharSequence charSequence, int i10, Drawable drawable) {
        float f7;
        int dp;
        int i11;
        org.telegram.ui.Components.x5 x5Var = this.f17723a;
        x5Var.setText(charSequence);
        kj0 kj0Var = this.f17725c;
        if (i10 == 0 && drawable == null && this.e == null) {
            this.K = 0;
            kj0Var.setVisibility(4);
            x5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.K = 0;
            kj0Var.setImageDrawable(drawable);
        } else {
            this.K = i10;
            kj0Var.setImageResource(i10);
        }
        kj0Var.setVisibility(0);
        float f10 = 0.0f;
        if (this.d) {
            if (this.e != null) {
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
        } else if (this.e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        x5Var.setPadding(dp, 0, i11, 0);
    }

    public tp getCheckView() {
        return this.e;
    }

    public int getIconResId() {
        return this.K;
    }

    public ImageView getImageView() {
        return this.f17725c;
    }

    public ImageView getRightIcon() {
        return this.f17726f;
    }

    public org.telegram.ui.Components.x5 getTextView() {
        return this.f17723a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int dp;
        int i10;
        int i11;
        org.telegram.ui.Components.x5 x5Var = this.f17723a;
        x5Var.setText(charSequence);
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
        x5Var.setPadding(dp, 0, i10, 0);
        if (this.h == null) {
            w9 w9Var = new w9(getContext());
            this.h = w9Var;
            w9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            w9 w9Var2 = this.h;
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(w9Var2, w7.a6.e(28, 28, i11 | 16));
        }
        this.f17725c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        int i10;
        int i11 = this.v;
        int i12 = 0;
        if (this.f17731x) {
            i10 = this.f17730w;
        } else {
            i10 = 0;
        }
        if (this.f17732y) {
            i12 = this.f17730w;
        }
        setBackground(j6.Y(i11, i10, i12));
    }

    public final void j(boolean z10, boolean z11) {
        if (this.f17731x == z10 && this.f17732y == z11) {
            return;
        }
        this.f17731x = z10;
        this.f17732y = z11;
        i();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.f17731x == z10 && this.f17732y == z11 && this.f17730w == 12) {
            return;
        }
        this.f17731x = z10;
        this.f17732y = z11;
        this.f17730w = 12;
        i();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        tp tpVar = this.e;
        if (tpVar != null && tpVar.f27462a.f21057q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.e.f27462a.f21057q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.E), 1073741824));
        if (this.H && this.f17723a.getLayout().getLineCount() > 1) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.E + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i10) {
        this.K = 0;
        this.f17725c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        tp tpVar = this.e;
        if (tpVar == null) {
            return;
        }
        tpVar.a(z10, true);
    }

    public void setEmojiCacheType(int i10) {
        this.f17723a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.K = i10;
        this.f17725c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        e(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        w9 w9Var = this.h;
        if (w9Var != null) {
            w9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.E = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.x5 x5Var = this.f17723a;
        x5Var.setLines(2);
        if (z10) {
            x5Var.setTextSize(1, 14.0f);
        } else {
            this.H = true;
        }
        x5Var.setSingleLine(false);
        x5Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        int i11;
        float f7;
        int i12;
        int i13;
        if (this.f17726f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f17726f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f17726f.setColorFilter(this.f17728r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f17726f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f17726f;
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            addView(imageView2, w7.a6.e(24, -1, i13 | 16));
        }
        org.telegram.ui.Components.x5 x5Var = this.f17723a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            if (this.f17726f != null) {
                i12 = AndroidUtilities.dp(32.0f);
            } else {
                i12 = 0;
            }
            layoutParams.leftMargin = i12;
        } else {
            if (this.f17726f != null) {
                i11 = AndroidUtilities.dp(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
        }
        x5Var.setLayoutParams(layoutParams);
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
            this.f17726f.setVisibility(8);
            return;
        }
        this.f17726f.setVisibility(0);
        this.f17726f.setImageResource(i10);
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
        if (this.f17724b == null) {
            TextView textView = new TextView(getContext());
            this.f17724b = textView;
            textView.setLines(1);
            this.f17724b.setSingleLine(true);
            int i13 = 3;
            this.f17724b.setGravity(3);
            this.f17724b.setEllipsize(TextUtils.TruncateAt.END);
            this.f17724b.setTextColor(j6.v0(j6.f17883ai, this.F));
            this.f17724b.setVisibility(8);
            this.f17724b.setTextSize(1, 13.0f);
            TextView textView2 = this.f17724b;
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
            TextView textView3 = this.f17724b;
            if (LocaleController.isRTL) {
                i13 = 5;
            }
            addView(textView3, w7.a6.d(-2, -2.0f, i13 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f17724b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f17724b;
            if (!isEmpty) {
                i11 = 0;
            }
            textView4.setVisibility(i11);
            org.telegram.ui.Components.x5 x5Var = this.f17723a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            if (!isEmpty) {
                i12 = AndroidUtilities.dp(10.0f);
            }
            layoutParams.bottomMargin = i12;
            x5Var.setLayoutParams(layoutParams);
        }
        this.f17724b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.f17724b;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f17723a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.f17727n != i10) {
            this.f17727n = i10;
            this.f17723a.setTextColor(i10);
        }
    }

    public g1(Context context, f6 f6Var, boolean z10, boolean z11) {
        this(0, context, f6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.K = 0;
        this.f17725c.setImageDrawable(drawable);
    }

    public g1(int i10, Context context, f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.f17730w = 12;
        this.E = 48;
        this.F = f6Var;
        this.f17731x = z10;
        this.f17732y = z11;
        this.f17727n = j6.v0(j6.E8, f6Var);
        this.f17728r = j6.v0(j6.F8, f6Var);
        this.f17729s = PorterDuff.Mode.MULTIPLY;
        this.v = j6.v0(j6.I5, f6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f17725c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(this.f17728r, PorterDuff.Mode.SRC_IN));
        addView((View) imageView, w7.a6.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f17723a = x5Var;
        x5Var.setLines(1);
        x5Var.setSingleLine(true);
        x5Var.setGravity(3);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.setTextColor(this.f17727n);
        x5Var.setTextSize(1, 16.0f);
        addView(x5Var, w7.a6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
