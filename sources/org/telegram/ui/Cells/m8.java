package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ko0;
import org.telegram.ui.n00;
public class m8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 A;
    public boolean B;
    public int C;
    public boolean D;
    public float E;
    public float F;
    public org.telegram.ui.Components.n5 G;
    public int H;
    public CharSequence I;
    public Paint J;
    public boolean K;
    public int L;
    public final org.telegram.ui.ActionBar.h5 f24708a;
    public final org.telegram.ui.ActionBar.h5 f24709b;
    public final org.telegram.ui.Components.o6 f24710c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final aj0 f24711e;
    public Switch f24712f;
    public final ImageView h;
    public int f24713n;
    public boolean f24714r;
    public int f24715s;
    public int v;
    public int f24716w;
    public boolean f24717x;
    public boolean f24718y;

    public m8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        n00 n00Var = new n00();
        n00Var.f40665f = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false);
        spannableStringBuilder.setSpan(n00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f24712f;
        if (r02 != null && r02.h) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11, int i12) {
        float f9;
        boolean q6;
        this.f24715s = 52;
        aj0 aj0Var = this.f24711e;
        aj0Var.setVisibility(0);
        aj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        if (LocaleController.isRTL) {
            f9 = 0.0f;
        } else {
            f9 = -3.0f;
        }
        aj0Var.setTranslationX(AndroidUtilities.dp(f9));
        aj0Var.setImageResource(i12);
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        mb0 mb0Var = new mb0(1);
        mb0Var.b(i10, i11);
        mb0Var.f30641b = q6;
        aj0Var.setBackground(mb0Var);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float e10;
        float f9;
        float e11;
        float f10 = 1.0f;
        if (this.D || this.F != 0.0f) {
            if (this.J == null) {
                Paint paint = new Paint(1);
                this.J = paint;
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.O5, this.A));
            }
            if (this.K) {
                float f11 = this.E + 0.016f;
                this.E = f11;
                if (f11 > 1.0f) {
                    this.E = 1.0f;
                    this.K = false;
                }
            } else {
                float f12 = this.E - 0.016f;
                this.E = f12;
                if (f12 < 0.0f) {
                    this.E = 0.0f;
                    this.K = true;
                }
            }
            int i10 = this.L;
            if (i10 > 0) {
                this.L = i10 - 15;
            } else {
                boolean z10 = this.D;
                if (z10) {
                    float f13 = this.F;
                    if (f13 != 1.0f) {
                        float f14 = f13 + 0.10666667f;
                        this.F = f14;
                        if (f14 > 1.0f) {
                            this.F = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f15 = this.F;
                    if (f15 != 0.0f) {
                        float f16 = f15 - 0.10666667f;
                        this.F = f16;
                        if (f16 < 0.0f) {
                            this.F = 0.0f;
                        }
                    }
                }
            }
            this.J.setAlpha((int) (((this.E * 0.4f) + 0.6f) * this.F * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.C), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.J);
            invalidate();
        }
        float f17 = 1.0f - this.F;
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var == null) {
            e10 = 1.0f;
        } else {
            e10 = 1.0f - n5Var.e();
        }
        float f18 = f17 * e10;
        if (isEnabled()) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        this.f24710c.setAlpha(f18 * f9);
        float f19 = 1.0f - this.F;
        org.telegram.ui.Components.n5 n5Var2 = this.G;
        if (n5Var2 == null) {
            e11 = 1.0f;
        } else {
            e11 = 1.0f - n5Var2.e();
        }
        float f20 = f19 * e11;
        if (!isEnabled()) {
            f10 = 0.5f;
        }
        this.d.setAlpha(f20 * f10);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.n5 n5Var3 = this.G;
        if (n5Var3 != null) {
            n5Var3.setBounds((getWidth() - this.G.f30852s) - AndroidUtilities.dp(18.0f), (getHeight() - this.G.f30852s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.G.f30852s) / 2);
            this.G.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.setTextColor(v02);
        h5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN);
            aj0 aj0Var = this.f24711e;
            aj0Var.setColorFilter(porterDuffColorFilter);
            aj0Var.setTag(Integer.valueOf(i10));
        }
        v();
    }

    public final void f(int i10, boolean z10, boolean z11) {
        float f9;
        this.D = z10;
        this.C = i10;
        if (!z11) {
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.F = f9;
        }
        invalidate();
    }

    public final void g(boolean z10) {
        float f9;
        float f10;
        float f11;
        super.setEnabled(z10);
        Switch r02 = this.f24712f;
        if (r02 != null) {
            r02.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f24708a.animate();
        float f12 = 0.5f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        animate.alpha(f9).start();
        ViewPropertyAnimator animate2 = this.f24709b.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate2.alpha(f10).start();
        ViewPropertyAnimator animate3 = this.f24710c.animate();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        animate3.alpha(f11).start();
        ViewPropertyAnimator animate4 = this.d.animate();
        if (z10) {
            f12 = 1.0f;
        }
        animate4.alpha(f12).start();
    }

    public Switch getCheckBox() {
        return this.f24712f;
    }

    public aj0 getImageView() {
        return this.f24711e;
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.f24708a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.f24710c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        if (i10 <= 0) {
            h5Var.i(null);
            return;
        }
        h5Var.i(new ko0(i10, getContext(), this.A, false));
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.f24716w = 16;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        o6Var.c(null, false, true);
        this.f24711e.setVisibility(8);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f24714r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z10, boolean z11) {
        this.f24716w = 16;
        this.f24715s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.f24711e.setVisibility(8);
        this.h.setVisibility(8);
        this.f24714r = z11;
        Switch r6 = this.f24712f;
        if (r6 != null) {
            r6.setVisibility(0);
            this.f24712f.c(z10, false);
        }
        setWillNotDraw(!this.f24714r);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        this.f24716w = 16;
        this.f24715s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.f24710c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f24712f == null) {
            Switch r13 = new Switch(getContext(), this.A);
            this.f24712f = r13;
            int i13 = org.telegram.ui.ActionBar.g6.M6;
            int i14 = org.telegram.ui.ActionBar.g6.N6;
            int i15 = org.telegram.ui.ActionBar.g6.f23062d6;
            r13.d(i13, i14, i15, i15);
            Switch r132 = this.f24712f;
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(r132, i7.f6.d(37, 20.0f, i12 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r133 = this.f24712f;
        if (r133 != null) {
            r133.setVisibility(0);
            this.f24712f.c(z10, false);
        }
        this.f24714r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z10) {
        this.f24716w = 16;
        this.f24715s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.f24710c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f24712f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f24712f.c(z10, false);
        }
        aj0 aj0Var = this.f24711e;
        aj0Var.setVisibility(0);
        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        aj0Var.setImageResource(i10);
        this.f24714r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z10) {
        this.f24716w = 16;
        this.f24715s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        o6Var.c(null, false, true);
        aj0 aj0Var = this.f24711e;
        aj0Var.setImageResource(i10);
        aj0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f24714r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f24715s = 58;
        this.f24716w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        o6Var.c(null, false, true);
        aj0 aj0Var = this.f24711e;
        aj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof xi0) {
            aj0Var.setAnimation((xi0) drawable);
        } else {
            aj0Var.setImageDrawable(drawable);
        }
        aj0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.h.setVisibility(8);
        aj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f24714r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f24716w = 16;
        this.f24715s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.f24711e.setVisibility(8);
        this.h.setVisibility(8);
        this.f24714r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f24712f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = true;
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B = false;
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f9;
        float dp;
        int i10;
        int i11;
        if (this.f24714r) {
            org.telegram.ui.ActionBar.c6 c6Var = this.A;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            Paint paint2 = paint;
            boolean z10 = LocaleController.isRTL;
            float f10 = 20.0f;
            int i12 = 58;
            aj0 aj0Var = this.f24711e;
            if (z10) {
                dp = 0.0f;
            } else {
                if (aj0Var.getVisibility() == 0) {
                    if (this.f24717x) {
                        i10 = 72;
                    } else {
                        i10 = 58;
                    }
                    f9 = i10;
                } else {
                    f9 = 20.0f;
                }
                dp = AndroidUtilities.dp(f9);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (aj0Var.getVisibility() == 0) {
                    if (this.f24717x) {
                        i12 = 72;
                    }
                    f10 = i12;
                }
                i11 = AndroidUtilities.dp(f10);
            } else {
                i11 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        CharSequence text = h5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        if (!isEmpty) {
            CharSequence text2 = o6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f24712f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f24712f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h5Var.getText());
            if (!TextUtils.isEmpty(o6Var.getText())) {
                sb2.append('\n');
                sb2.append(o6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int measuredWidth2;
        int i14;
        int dp;
        int measuredWidth3;
        int measuredWidth4;
        float f9;
        int measuredWidth5;
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i12 - i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int textHeight = h5Var.getTextHeight();
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        int max = ((i17 - Math.max(textHeight, o6Var.getTextHeight())) / 2) + 1;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(this.f24713n - 6);
        } else {
            measuredWidth = (i18 - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24713n - 6);
        }
        if (this.f24718y && !LocaleController.isRTL) {
            measuredWidth = (i18 - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24713n);
        }
        o6Var.layout(measuredWidth, max, o6Var.getMeasuredWidth() + measuredWidth, o6Var.getMeasuredHeight() + max);
        if (LocaleController.isRTL) {
            measuredWidth2 = AndroidUtilities.dp(this.f24713n - 6);
        } else {
            measuredWidth2 = (i18 - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24713n - 6);
        }
        h5Var.layout(measuredWidth2, max, h5Var.getMeasuredWidth() + measuredWidth2, h5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        aj0 aj0Var = this.f24711e;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24708a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - h5Var2.getMeasuredWidth();
            if (aj0Var.getVisibility() == 0) {
                i16 = this.f24715s;
            } else {
                i16 = this.f24713n;
            }
            dp = measuredWidth6 - AndroidUtilities.dp(i16);
        } else {
            if (aj0Var.getVisibility() == 0) {
                i14 = this.f24715s;
            } else {
                i14 = this.f24713n;
            }
            dp = AndroidUtilities.dp(i14);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f24709b;
        if (h5Var3.getVisibility() == 0) {
            if (this.v > 50) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            float f10 = i15;
            int dp2 = AndroidUtilities.dp(1.0f) + org.telegram.ui.b.x(f10, (i17 - h5Var2.getTextHeight()) - h5Var3.getTextHeight(), 2);
            h5Var2.layout(dp, dp2, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp2);
            int dp3 = AndroidUtilities.dp(f10) + h5Var2.getTextHeight() + dp2;
            h5Var3.layout(dp, dp3, h5Var3.getMeasuredWidth() + dp, h5Var3.getMeasuredHeight() + dp3);
        } else {
            int dp4 = AndroidUtilities.dp(1.0f) + ((i17 - h5Var2.getTextHeight()) / 2);
            h5Var2.layout(dp, dp4, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp4);
        }
        if (aj0Var.getVisibility() == 0) {
            if (this.v > 50) {
                f9 = 0.0f;
            } else {
                f9 = 2.0f;
            }
            int dp5 = AndroidUtilities.dp(1.0f) + ((((i17 - aj0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(f9)) - aj0Var.getPaddingTop());
            if (!LocaleController.isRTL) {
                measuredWidth5 = AndroidUtilities.dp(this.f24716w);
            } else {
                measuredWidth5 = (i18 - aj0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24716w);
            }
            aj0Var.layout(measuredWidth5, dp5, aj0Var.getMeasuredWidth() + measuredWidth5, aj0Var.getMeasuredHeight() + dp5);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int dp6 = AndroidUtilities.dp(1.0f) + ((i17 - imageView.getMeasuredHeight()) / 2);
            if (LocaleController.isRTL) {
                measuredWidth4 = AndroidUtilities.dp(23.0f);
            } else {
                measuredWidth4 = (i18 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            }
            imageView.layout(measuredWidth4, dp6, imageView.getMeasuredWidth() + measuredWidth4, imageView.getMeasuredHeight() + dp6);
        }
        Switch r9 = this.f24712f;
        if (r9 != null && r9.getVisibility() == 0) {
            int measuredHeight = (i17 - this.f24712f.getMeasuredHeight()) / 2;
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth3 = (i18 - this.f24712f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
            }
            Switch r10 = this.f24712f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f24712f.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(this.v);
        int i16 = this.H;
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        if (i16 != 0 && i16 != size && (charSequence = this.I) != null) {
            o6Var.c(TextUtils.ellipsize(charSequence, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.H = size;
        boolean z10 = this.f24718y;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24709b;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.d;
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f24708a;
        if (z10) {
            h5Var3.measure(org.telegram.ui.b.d(this.f24713n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var.measure(org.telegram.ui.b.d(this.f24713n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp2 = (size - AndroidUtilities.dp(this.f24713n + 103)) - h5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp2, i14), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp3 = (size - AndroidUtilities.dp(this.f24713n + 103)) - h5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i15 = Integer.MIN_VALUE;
            } else {
                i15 = 1073741824;
            }
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp3, i15), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            int dp4 = size - AndroidUtilities.dp(this.f24713n);
            if (LocaleController.isRTL) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp4, i12), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp5 = size - AndroidUtilities.dp(this.f24713n);
            if (LocaleController.isRTL) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp5, i13), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int max = Math.max(o6Var.d(), h5Var2.getTextWidth());
            h5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.f24713n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f24713n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        aj0 aj0Var = this.f24711e;
        if (aj0Var.getVisibility() == 0) {
            aj0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        Switch r02 = this.f24712f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, dp + (this.f24714r ? 1 : 0));
    }

    public final void p(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence ellipsize;
        this.f24716w = 16;
        this.f24715s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(str, false);
        h5Var.i(null);
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.I = str2;
            ellipsize = TextUtils.ellipsize(str2, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i11, i12, i10);
        this.h.setVisibility(8);
        this.f24714r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f24712f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        s(charSequence, charSequence2, false, i10, z10);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f24715s = 58;
        this.f24716w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        o6Var.c(charSequence2, false, true);
        aj0 aj0Var = this.f24711e;
        aj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof xi0) {
            aj0Var.setAnimation((xi0) drawable);
        } else {
            aj0Var.setImageDrawable(drawable);
        }
        aj0Var.setVisibility(0);
        o6Var.setVisibility(0);
        this.h.setVisibility(8);
        aj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f24714r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.f24716w = 16;
        this.f24715s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        aj0 aj0Var = this.f24711e;
        aj0Var.setVisibility(0);
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        if (charSequence2 != null) {
            float g10 = nh.t3.g(charSequence, h5Var.getTextPaint());
            this.I = charSequence2;
            o6Var.c(TextUtils.ellipsize(charSequence2, o6Var.getPaint(), (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((g10 + AndroidUtilities.dp(this.f24715s)) + AndroidUtilities.dp(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            o6Var.c("", z10, true);
        }
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        aj0Var.setTranslationX(0.0f);
        aj0Var.setTranslationY(0.0f);
        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        aj0Var.setImageResource(i10);
        this.f24714r = z11;
        setWillNotDraw(!z11);
        Switch r9 = this.f24712f;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public void setChecked(boolean z10) {
        this.f24712f.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        g(z10);
    }

    public void setImageLeft(int i10) {
        this.f24716w = i10;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f24714r != z10) {
            this.f24714r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.f24715s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.f24718y != z10) {
            this.f24718y = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24709b;
        if (!isEmpty) {
            h5Var.setVisibility(0);
            h5Var.l(charSequence, false);
            return;
        }
        h5Var.setVisibility(8);
    }

    public void setTextColor(int i10) {
        this.f24708a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.G == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(30.0f), this);
            this.G = n5Var;
            if (this.B) {
                n5Var.a();
            }
        }
        this.G.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f24716w = 16;
        this.f24715s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        o6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        aj0 aj0Var = this.f24711e;
        aj0Var.setVisibility(8);
        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f24714r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f24712f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.o6 o6Var = this.f24710c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.I = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
    }

    public final void v() {
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708a;
        if (h5Var.getTag() instanceof Integer) {
            i10 = ((Integer) h5Var.getTag()).intValue();
        } else {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        if (i10 != org.telegram.ui.ActionBar.g6.f23169j5 && i10 != org.telegram.ui.ActionBar.g6.G6) {
            v02 = c(v02);
        }
        h5Var.setTextColor(v02);
        aj0 aj0Var = this.f24711e;
        if (aj0Var.getTag() instanceof Integer) {
            int intValue = ((Integer) aj0Var.getTag()).intValue();
            int v03 = org.telegram.ui.ActionBar.g6.v0(intValue, c6Var);
            if (intValue != org.telegram.ui.ActionBar.g6.J5 && intValue != org.telegram.ui.ActionBar.g6.f23223m6) {
                v03 = c(v03);
            }
            aj0Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        }
        this.f24709b.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var)));
        int i11 = org.telegram.ui.ActionBar.g6.I6;
        this.f24710c.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
    }

    public m8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(23, context, c6Var, false, false);
    }

    public m8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public m8(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f24715s = 58;
        this.v = 50;
        this.f24716w = 16;
        this.A = c6Var;
        this.f24713n = i10;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24708a = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23169j5 : org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setImportantForAccessibility(2);
        addView(h5Var, i7.f6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24709b = h5Var2;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23277p5 : org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        h5Var2.setTextSize(13);
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var2.setImportantForAccessibility(2);
        addView(h5Var2, i7.f6.c(-1.0f, -2));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f24710c = o6Var;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23240n5 : org.telegram.ui.ActionBar.g6.I6, c6Var));
        o6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        o6Var.setImportantForAccessibility(2);
        o6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(o6Var);
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var3;
        Boolean bool = Boolean.FALSE;
        if (!h5Var3.L) {
            h5Var3.f23493j0 = true;
            h5Var3.f23495l0 = bool;
            h5Var3.m();
            h5Var3.b();
        }
        h5Var3.m0 = 18;
        h5Var3.m();
        h5Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23240n5 : org.telegram.ui.ActionBar.g6.I6, c6Var));
        h5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        h5Var3.setTextSize(16);
        h5Var3.setImportantForAccessibility(2);
        h5Var3.setVisibility(8);
        addView(h5Var3);
        ?? imageView = new ImageView(context);
        this.f24711e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.J5 : org.telegram.ui.ActionBar.g6.f23223m6, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r42 = new Switch(context, c6Var);
            this.f24712f = r42;
            int i11 = org.telegram.ui.ActionBar.g6.M6;
            int i12 = org.telegram.ui.ActionBar.g6.N6;
            int i13 = org.telegram.ui.ActionBar.g6.f23062d6;
            r42.d(i11, i12, i13, i13);
            addView(this.f24712f, i7.f6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.G == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(30.0f), this);
            this.G = n5Var;
            if (this.B) {
                n5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new ch.f(imageReceiver, 1));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.G.g(new bg.m1(imageReceiver, 5), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
