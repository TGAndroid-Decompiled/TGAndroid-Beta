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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.cp0;
import org.telegram.ui.z00;
public class r8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.o5 K;
    public int L;
    public CharSequence M;
    public Paint N;
    public boolean O;
    public int P;
    public final org.telegram.ui.ActionBar.h5 f20875a;
    public final org.telegram.ui.ActionBar.h5 f20876b;
    public final org.telegram.ui.Components.p6 f20877c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final lj0 e;
    public Switch f20878f;
    public final ImageView h;
    public int f20879n;
    public boolean f20880r;
    public int f20881s;
    public int v;
    public int f20882w;
    public boolean f20883x;
    public boolean f20884y;

    public r8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        z00 z00Var = new z00();
        z00Var.f40305f = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Lj, false);
        spannableStringBuilder.setSpan(z00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f20878f;
        if (r02 != null && r02.h) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11, int i12) {
        float f7;
        boolean q6;
        this.f20881s = 52;
        lj0 lj0Var = this.e;
        lj0Var.setVisibility(0);
        lj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        if (LocaleController.isRTL) {
            f7 = 0.0f;
        } else {
            f7 = -3.0f;
        }
        lj0Var.setTranslationX(AndroidUtilities.dp(f7));
        lj0Var.setImageResource(i12);
        lj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        ac0 ac0Var = new ac0(1);
        ac0Var.b(i10, i11);
        ac0Var.f22655b = q6;
        lj0Var.setBackground(ac0Var);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float e;
        float f7;
        float e7;
        float f10 = 1.0f;
        if (this.H || this.J != 0.0f) {
            if (this.N == null) {
                Paint paint = new Paint(1);
                this.N = paint;
                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.O5, this.E));
            }
            if (this.O) {
                float f11 = this.I + 0.016f;
                this.I = f11;
                if (f11 > 1.0f) {
                    this.I = 1.0f;
                    this.O = false;
                }
            } else {
                float f12 = this.I - 0.016f;
                this.I = f12;
                if (f12 < 0.0f) {
                    this.I = 0.0f;
                    this.O = true;
                }
            }
            int i10 = this.P;
            if (i10 > 0) {
                this.P = i10 - 15;
            } else {
                boolean z10 = this.H;
                if (z10) {
                    float f13 = this.J;
                    if (f13 != 1.0f) {
                        float f14 = f13 + 0.10666667f;
                        this.J = f14;
                        if (f14 > 1.0f) {
                            this.J = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f15 = this.J;
                    if (f15 != 0.0f) {
                        float f16 = f15 - 0.10666667f;
                        this.J = f16;
                        if (f16 < 0.0f) {
                            this.J = 0.0f;
                        }
                    }
                }
            }
            this.N.setAlpha((int) (((this.I * 0.4f) + 0.6f) * this.J * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.G), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.N);
            invalidate();
        }
        float f17 = 1.0f - this.J;
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var == null) {
            e = 1.0f;
        } else {
            e = 1.0f - o5Var.e();
        }
        float f18 = f17 * e;
        if (isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        this.f20877c.setAlpha(f18 * f7);
        float f19 = 1.0f - this.J;
        org.telegram.ui.Components.o5 o5Var2 = this.K;
        if (o5Var2 == null) {
            e7 = 1.0f;
        } else {
            e7 = 1.0f - o5Var2.e();
        }
        float f20 = f19 * e7;
        if (!isEnabled()) {
            f10 = 0.5f;
        }
        this.d.setAlpha(f20 * f10);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.o5 o5Var3 = this.K;
        if (o5Var3 != null) {
            o5Var3.setBounds((getWidth() - this.K.f26924s) - AndroidUtilities.dp(18.0f), (getHeight() - this.K.f26924s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.K.f26924s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.setTextColor(v02);
        h5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN);
            lj0 lj0Var = this.e;
            lj0Var.setColorFilter(porterDuffColorFilter);
            lj0Var.setTag(Integer.valueOf(i10));
        }
        v();
    }

    public final void f(int i10, boolean z10, boolean z11) {
        float f7;
        this.H = z10;
        this.G = i10;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.J = f7;
        }
        invalidate();
    }

    public final void g(boolean z10) {
        float f7;
        float f10;
        float f11;
        super.setEnabled(z10);
        Switch r02 = this.f20878f;
        if (r02 != null) {
            r02.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f20875a.animate();
        float f12 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).start();
        ViewPropertyAnimator animate2 = this.f20876b.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate2.alpha(f10).start();
        ViewPropertyAnimator animate3 = this.f20877c.animate();
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
        return this.f20878f;
    }

    public lj0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.f20875a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.p6 getValueTextView() {
        return this.f20877c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        if (i10 <= 0) {
            h5Var.i(null);
            return;
        }
        h5Var.i(new cp0(i10, getContext(), this.E, false));
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.f20882w = 16;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        p6Var.c(null, false, true);
        this.e.setVisibility(8);
        p6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f20880r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z10, boolean z11) {
        this.f20882w = 16;
        this.f20881s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f20880r = z11;
        Switch r62 = this.f20878f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f20878f.c(z10, false);
        }
        setWillNotDraw(!this.f20880r);
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        this.f20882w = 16;
        this.f20881s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.f20877c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f20878f == null) {
            Switch r13 = new Switch(getContext(), this.E);
            this.f20878f = r13;
            int i13 = org.telegram.ui.ActionBar.h6.M6;
            int i14 = org.telegram.ui.ActionBar.h6.N6;
            int i15 = org.telegram.ui.ActionBar.h6.f19060d6;
            r13.d(i13, i14, i15, i15);
            Switch r132 = this.f20878f;
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(r132, w7.y5.d(37, 20.0f, i12 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r133 = this.f20878f;
        if (r133 != null) {
            r133.setVisibility(0);
            this.f20878f.c(z10, false);
        }
        this.f20880r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z10) {
        this.f20882w = 16;
        this.f20881s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.f20877c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f20878f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f20878f.c(z10, false);
        }
        lj0 lj0Var = this.e;
        lj0Var.setVisibility(0);
        lj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        lj0Var.setImageResource(i10);
        this.f20880r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z10) {
        this.f20882w = 16;
        this.f20881s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        p6Var.c(null, false, true);
        lj0 lj0Var = this.e;
        lj0Var.setImageResource(i10);
        lj0Var.setVisibility(0);
        p6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        lj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f20880r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f20881s = 58;
        this.f20882w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        p6Var.c(null, false, true);
        lj0 lj0Var = this.e;
        lj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof ij0) {
            lj0Var.setAnimation((ij0) drawable);
        } else {
            lj0Var.setImageDrawable(drawable);
        }
        lj0Var.setVisibility(0);
        p6Var.setVisibility(8);
        this.h.setVisibility(8);
        lj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f20880r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f20882w = 16;
        this.f20881s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.M = charSequence2;
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, p6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        p6Var.c(ellipsize, z10, true);
        p6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f20880r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f20878f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f7;
        float dp;
        int i10;
        int i11;
        if (this.f20880r) {
            org.telegram.ui.ActionBar.d6 d6Var = this.E;
            if (d6Var != null) {
                paint = d6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.h6.f19181k0;
            }
            Paint paint2 = paint;
            boolean z10 = LocaleController.isRTL;
            float f10 = 20.0f;
            int i12 = 58;
            lj0 lj0Var = this.e;
            if (z10) {
                dp = 0.0f;
            } else {
                if (lj0Var.getVisibility() == 0) {
                    if (this.f20883x) {
                        i10 = 72;
                    } else {
                        i10 = 58;
                    }
                    f7 = i10;
                } else {
                    f7 = 20.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (lj0Var.getVisibility() == 0) {
                    if (this.f20883x) {
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        CharSequence text = h5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        if (!isEmpty) {
            CharSequence text2 = p6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f20878f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f20878f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h5Var.getText());
            if (!TextUtils.isEmpty(p6Var.getText())) {
                sb2.append('\n');
                sb2.append(p6Var.getText());
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
        float f7;
        int measuredWidth5;
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i12 - i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int textHeight = h5Var.getTextHeight();
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        int max = ((i17 - Math.max(textHeight, p6Var.getTextHeight())) / 2) + 1;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(this.f20879n - 6);
        } else {
            measuredWidth = (i18 - p6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f20879n - 6);
        }
        if (this.f20884y && !LocaleController.isRTL) {
            measuredWidth = (i18 - p6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f20879n);
        }
        p6Var.layout(measuredWidth, max, p6Var.getMeasuredWidth() + measuredWidth, p6Var.getMeasuredHeight() + max);
        if (LocaleController.isRTL) {
            measuredWidth2 = AndroidUtilities.dp(this.f20879n - 6);
        } else {
            measuredWidth2 = (i18 - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f20879n - 6);
        }
        h5Var.layout(measuredWidth2, max, h5Var.getMeasuredWidth() + measuredWidth2, h5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        lj0 lj0Var = this.e;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f20875a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - h5Var2.getMeasuredWidth();
            if (lj0Var.getVisibility() == 0) {
                i16 = this.f20881s;
            } else {
                i16 = this.f20879n;
            }
            dp = measuredWidth6 - AndroidUtilities.dp(i16);
        } else {
            if (lj0Var.getVisibility() == 0) {
                i14 = this.f20881s;
            } else {
                i14 = this.f20879n;
            }
            dp = AndroidUtilities.dp(i14);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f20876b;
        if (h5Var3.getVisibility() == 0) {
            if (this.v > 50) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            float f10 = i15;
            int dp2 = AndroidUtilities.dp(1.0f) + ok.A(f10, (i17 - h5Var2.getTextHeight()) - h5Var3.getTextHeight(), 2);
            h5Var2.layout(dp, dp2, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp2);
            int dp3 = AndroidUtilities.dp(f10) + h5Var2.getTextHeight() + dp2;
            h5Var3.layout(dp, dp3, h5Var3.getMeasuredWidth() + dp, h5Var3.getMeasuredHeight() + dp3);
        } else {
            int dp4 = AndroidUtilities.dp(1.0f) + ((i17 - h5Var2.getTextHeight()) / 2);
            h5Var2.layout(dp, dp4, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp4);
        }
        if (lj0Var.getVisibility() == 0) {
            if (this.v > 50) {
                f7 = 0.0f;
            } else {
                f7 = 2.0f;
            }
            int dp5 = AndroidUtilities.dp(1.0f) + ((((i17 - lj0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(f7)) - lj0Var.getPaddingTop());
            if (!LocaleController.isRTL) {
                measuredWidth5 = AndroidUtilities.dp(this.f20882w);
            } else {
                measuredWidth5 = (i18 - lj0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f20882w);
            }
            lj0Var.layout(measuredWidth5, dp5, lj0Var.getMeasuredWidth() + measuredWidth5, lj0Var.getMeasuredHeight() + dp5);
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
        Switch r92 = this.f20878f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i17 - this.f20878f.getMeasuredHeight()) / 2;
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth3 = (i18 - this.f20878f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
            }
            Switch r10 = this.f20878f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f20878f.getMeasuredHeight() + measuredHeight);
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
        int i16 = this.L;
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        if (i16 != 0 && i16 != size && (charSequence = this.M) != null) {
            p6Var.c(TextUtils.ellipsize(charSequence, p6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z10 = this.f20884y;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20876b;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.d;
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f20875a;
        if (z10) {
            h5Var3.measure(ok.c(this.f20879n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var.measure(ok.c(this.f20879n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp2 = (size - AndroidUtilities.dp(this.f20879n + 103)) - h5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            p6Var.measure(View.MeasureSpec.makeMeasureSpec(dp2, i14), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp3 = (size - AndroidUtilities.dp(this.f20879n + 103)) - h5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i15 = Integer.MIN_VALUE;
            } else {
                i15 = 1073741824;
            }
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp3, i15), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            int dp4 = size - AndroidUtilities.dp(this.f20879n);
            if (LocaleController.isRTL) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            p6Var.measure(View.MeasureSpec.makeMeasureSpec(dp4, i12), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp5 = size - AndroidUtilities.dp(this.f20879n);
            if (LocaleController.isRTL) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp5, i13), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int max = Math.max(p6Var.d(), h5Var2.getTextWidth());
            h5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.f20879n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f20879n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        lj0 lj0Var = this.e;
        if (lj0Var.getVisibility() == 0) {
            lj0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        Switch r02 = this.f20878f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, dp + (this.f20880r ? 1 : 0));
    }

    public final void p(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence ellipsize;
        this.f20882w = 16;
        this.f20881s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(str, false);
        h5Var.i(null);
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.M = str2;
            ellipsize = TextUtils.ellipsize(str2, p6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        p6Var.c(ellipsize, z10, true);
        p6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i11, i12, i10);
        this.h.setVisibility(8);
        this.f20880r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f20878f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        s(charSequence, charSequence2, false, i10, z10);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f20881s = 58;
        this.f20882w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.M = charSequence2;
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        p6Var.c(charSequence2, false, true);
        lj0 lj0Var = this.e;
        lj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof ij0) {
            lj0Var.setAnimation((ij0) drawable);
        } else {
            lj0Var.setImageDrawable(drawable);
        }
        lj0Var.setVisibility(0);
        p6Var.setVisibility(0);
        this.h.setVisibility(8);
        lj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f20880r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.f20882w = 16;
        this.f20881s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        lj0 lj0Var = this.e;
        lj0Var.setVisibility(0);
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        if (charSequence2 != null) {
            float g10 = ci.e4.g(charSequence, h5Var.getTextPaint());
            this.M = charSequence2;
            p6Var.c(TextUtils.ellipsize(charSequence2, p6Var.getPaint(), (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((g10 + AndroidUtilities.dp(this.f20881s)) + AndroidUtilities.dp(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            p6Var.c("", z10, true);
        }
        p6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        lj0Var.setTranslationX(0.0f);
        lj0Var.setTranslationY(0.0f);
        lj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        lj0Var.setImageResource(i10);
        this.f20880r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f20878f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public void setChecked(boolean z10) {
        this.f20878f.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        g(z10);
    }

    public void setImageLeft(int i10) {
        this.f20882w = i10;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f20880r != z10) {
            this.f20880r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.f20881s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.f20884y != z10) {
            this.f20884y = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.h5 h5Var = this.f20876b;
        if (!isEmpty) {
            h5Var.setVisibility(0);
            h5Var.l(charSequence, false);
            return;
        }
        h5Var.setVisibility(8);
    }

    public void setTextColor(int i10) {
        this.f20875a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(30.0f), this);
            this.K = o5Var;
            if (this.F) {
                o5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f20882w = 16;
        this.f20881s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        p6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        p6Var.setVisibility(8);
        this.d.setVisibility(8);
        lj0 lj0Var = this.e;
        lj0Var.setVisibility(8);
        lj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f20880r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f20878f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.o5 o5Var = this.K;
        if (o5Var != null) {
            o5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.p6 p6Var = this.f20877c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.M = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, p6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        p6Var.c(ellipsize, z10, true);
    }

    public final void v() {
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.f20875a;
        if (h5Var.getTag() instanceof Integer) {
            i10 = ((Integer) h5Var.getTag()).intValue();
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        if (i10 != org.telegram.ui.ActionBar.h6.f19166j5 && i10 != org.telegram.ui.ActionBar.h6.G6) {
            v02 = c(v02);
        }
        h5Var.setTextColor(v02);
        lj0 lj0Var = this.e;
        if (lj0Var.getTag() instanceof Integer) {
            int intValue = ((Integer) lj0Var.getTag()).intValue();
            int v03 = org.telegram.ui.ActionBar.h6.v0(intValue, d6Var);
            if (intValue != org.telegram.ui.ActionBar.h6.J5 && intValue != org.telegram.ui.ActionBar.h6.f19224m6) {
                v03 = c(v03);
            }
            lj0Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        }
        this.f20876b.setTextColor(c(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19443y6, d6Var)));
        int i11 = org.telegram.ui.ActionBar.h6.I6;
        this.f20877c.setTextColor(c(org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
    }

    public r8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(23, context, d6Var, false, false);
    }

    public r8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public r8(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        this.f20881s = 58;
        this.v = 50;
        this.f20882w = 16;
        this.E = d6Var;
        this.f20879n = i10;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f20875a = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(z10 ? org.telegram.ui.ActionBar.h6.f19166j5 : org.telegram.ui.ActionBar.h6.G6, d6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setImportantForAccessibility(2);
        addView(h5Var, w7.y5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f20876b = h5Var2;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(z10 ? org.telegram.ui.ActionBar.h6.p5 : org.telegram.ui.ActionBar.h6.f19443y6, d6Var));
        h5Var2.setTextSize(13);
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var2.setImportantForAccessibility(2);
        addView(h5Var2, w7.y5.c(-1.0f, -2));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.f20877c = p6Var;
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(z10 ? org.telegram.ui.ActionBar.h6.f19243n5 : org.telegram.ui.ActionBar.h6.I6, d6Var));
        p6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        p6Var.setTextSize(AndroidUtilities.dp(16.0f));
        p6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        p6Var.setImportantForAccessibility(2);
        p6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(p6Var);
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var3;
        Boolean bool = Boolean.FALSE;
        if (!h5Var3.P) {
            h5Var3.f18979n0 = true;
            h5Var3.f18981p0 = bool;
            h5Var3.m();
            h5Var3.b();
        }
        h5Var3.f18982q0 = 18;
        h5Var3.m();
        h5Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(z10 ? org.telegram.ui.ActionBar.h6.f19243n5 : org.telegram.ui.ActionBar.h6.I6, d6Var));
        h5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        h5Var3.setTextSize(16);
        h5Var3.setImportantForAccessibility(2);
        h5Var3.setVisibility(8);
        addView(h5Var3);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(z10 ? org.telegram.ui.ActionBar.h6.J5 : org.telegram.ui.ActionBar.h6.f19224m6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r42 = new Switch(context, d6Var);
            this.f20878f = r42;
            int i11 = org.telegram.ui.ActionBar.h6.M6;
            int i12 = org.telegram.ui.ActionBar.h6.N6;
            int i13 = org.telegram.ui.ActionBar.h6.f19060d6;
            r42.d(i11, i12, i13, i13);
            addView(this.f20878f, w7.y5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(30.0f), this);
            this.K = o5Var;
            if (this.F) {
                o5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new q8(imageReceiver, 0));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.K.g(new ci.d4(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
