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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.so0;
import org.telegram.ui.z00;
public class o8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 B;
    public boolean C;
    public int D;
    public boolean E;
    public float F;
    public float G;
    public org.telegram.ui.Components.j5 H;
    public int I;
    public CharSequence J;
    public Paint K;
    public boolean L;
    public int M;
    public final org.telegram.ui.ActionBar.k5 f21527a;
    public final org.telegram.ui.ActionBar.k5 f21528b;
    public final org.telegram.ui.Components.k6 f21529c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final jj0 e;
    public Switch f21530f;
    public final ImageView h;
    public int f21531n;
    public boolean f21532r;
    public int f21533s;
    public int v;
    public int f21534w;
    public boolean f21535x;
    public boolean f21536y;

    public o8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        z00 z00Var = new z00();
        z00Var.f40623f = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false);
        spannableStringBuilder.setSpan(z00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f21530f;
        if (r02 != null && r02.h) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11, int i12) {
        float f10;
        boolean q10;
        this.f21533s = 52;
        jj0 jj0Var = this.e;
        jj0Var.setVisibility(0);
        jj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        if (LocaleController.isRTL) {
            f10 = 0.0f;
        } else {
            f10 = -3.0f;
        }
        jj0Var.setTranslationX(AndroidUtilities.dp(f10));
        jj0Var.setImageResource(i12);
        jj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.f6 f6Var = this.B;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        rb0 rb0Var = new rb0(1);
        rb0Var.b(i10, i11);
        rb0Var.f28438b = q10;
        jj0Var.setBackground(rb0Var);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float e;
        float f10;
        float e6;
        float f11 = 1.0f;
        if (this.E || this.G != 0.0f) {
            if (this.K == null) {
                Paint paint = new Paint(1);
                this.K = paint;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.O5, this.B));
            }
            if (this.L) {
                float f12 = this.F + 0.016f;
                this.F = f12;
                if (f12 > 1.0f) {
                    this.F = 1.0f;
                    this.L = false;
                }
            } else {
                float f13 = this.F - 0.016f;
                this.F = f13;
                if (f13 < 0.0f) {
                    this.F = 0.0f;
                    this.L = true;
                }
            }
            int i10 = this.M;
            if (i10 > 0) {
                this.M = i10 - 15;
            } else {
                boolean z4 = this.E;
                if (z4) {
                    float f14 = this.G;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.G = f15;
                        if (f15 > 1.0f) {
                            this.G = 1.0f;
                        }
                    }
                }
                if (!z4) {
                    float f16 = this.G;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.G = f17;
                        if (f17 < 0.0f) {
                            this.G = 0.0f;
                        }
                    }
                }
            }
            this.K.setAlpha((int) (((this.F * 0.4f) + 0.6f) * this.G * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.D), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.K);
            invalidate();
        }
        float f18 = 1.0f - this.G;
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var == null) {
            e = 1.0f;
        } else {
            e = 1.0f - j5Var.e();
        }
        float f19 = f18 * e;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f21529c.setAlpha(f19 * f10);
        float f20 = 1.0f - this.G;
        org.telegram.ui.Components.j5 j5Var2 = this.H;
        if (j5Var2 == null) {
            e6 = 1.0f;
        } else {
            e6 = 1.0f - j5Var2.e();
        }
        float f21 = f20 * e6;
        if (!isEnabled()) {
            f11 = 0.5f;
        }
        this.d.setAlpha(f21 * f11);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.j5 j5Var3 = this.H;
        if (j5Var3 != null) {
            j5Var3.setBounds((getWidth() - this.H.f25878s) - AndroidUtilities.dp(18.0f), (getHeight() - this.H.f25878s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.H.f25878s) / 2);
            this.H.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.f6 f6Var = this.B;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.setTextColor(v02);
        k5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN);
            jj0 jj0Var = this.e;
            jj0Var.setColorFilter(porterDuffColorFilter);
            jj0Var.setTag(Integer.valueOf(i10));
        }
        v();
    }

    public final void f(int i10, boolean z4, boolean z10) {
        float f10;
        this.E = z4;
        this.D = i10;
        if (!z10) {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.G = f10;
        }
        invalidate();
    }

    public final void g(boolean z4) {
        float f10;
        float f11;
        float f12;
        super.setEnabled(z4);
        Switch r02 = this.f21530f;
        if (r02 != null) {
            r02.setEnabled(z4);
        }
        ViewPropertyAnimator animate = this.f21527a.animate();
        float f13 = 0.5f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
        ViewPropertyAnimator animate2 = this.f21528b.animate();
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        animate2.alpha(f11).start();
        ViewPropertyAnimator animate3 = this.f21529c.animate();
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.5f;
        }
        animate3.alpha(f12).start();
        ViewPropertyAnimator animate4 = this.d.animate();
        if (z4) {
            f13 = 1.0f;
        }
        animate4.alpha(f13).start();
    }

    public Switch getCheckBox() {
        return this.f21530f;
    }

    public jj0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.f21527a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.k6 getValueTextView() {
        return this.f21529c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        if (i10 <= 0) {
            k5Var.i(null);
            return;
        }
        k5Var.i(new so0(i10, getContext(), this.B, false));
        k5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void i(CharSequence charSequence, boolean z4) {
        this.f21534w = 16;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = null;
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        k6Var.c(null, false, true);
        this.e.setVisibility(8);
        k6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f21532r = z4;
        setWillNotDraw(!z4);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z4, boolean z10) {
        this.f21534w = 16;
        this.f21533s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f21532r = z10;
        Switch r62 = this.f21530f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f21530f.c(z4, false);
        }
        setWillNotDraw(!this.f21532r);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z4, int i10, int i11, boolean z10) {
        int i12;
        this.f21534w = 16;
        this.f21533s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.f21529c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f21530f == null) {
            Switch r13 = new Switch(getContext(), this.B);
            this.f21530f = r13;
            int i13 = org.telegram.ui.ActionBar.j6.M6;
            int i14 = org.telegram.ui.ActionBar.j6.N6;
            int i15 = org.telegram.ui.ActionBar.j6.f19906d6;
            r13.d(i13, i14, i15, i15);
            Switch r132 = this.f21530f;
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(r132, k7.b6.d(37, 20.0f, i12 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r133 = this.f21530f;
        if (r133 != null) {
            r133.setVisibility(0);
            this.f21530f.c(z4, false);
        }
        this.f21532r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z4) {
        this.f21534w = 16;
        this.f21533s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.f21529c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f21530f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f21530f.c(z4, false);
        }
        jj0 jj0Var = this.e;
        jj0Var.setVisibility(0);
        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        jj0Var.setImageResource(i10);
        this.f21532r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z4) {
        this.f21534w = 16;
        this.f21533s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = null;
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        k6Var.c(null, false, true);
        jj0 jj0Var = this.e;
        jj0Var.setImageResource(i10);
        jj0Var.setVisibility(0);
        k6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f21532r = z4;
        setWillNotDraw(!z4);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z4) {
        this.f21533s = 58;
        this.f21534w = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = null;
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        k6Var.c(null, false, true);
        jj0 jj0Var = this.e;
        jj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof gj0) {
            jj0Var.setAnimation((gj0) drawable);
        } else {
            jj0Var.setImageDrawable(drawable);
        }
        jj0Var.setVisibility(0);
        k6Var.setVisibility(8);
        this.h.setVisibility(8);
        jj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f21532r = z4;
        setWillNotDraw(!z4);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z4, boolean z10) {
        CharSequence ellipsize;
        this.f21534w = 16;
        this.f21533s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = charSequence2;
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, k6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        k6Var.c(ellipsize, z4, true);
        k6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f21532r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f21530f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = true;
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = false;
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f10;
        float dp;
        int i10;
        int i11;
        if (this.f21532r) {
            org.telegram.ui.ActionBar.f6 f6Var = this.B;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20025k0;
            }
            Paint paint2 = paint;
            boolean z4 = LocaleController.isRTL;
            float f11 = 20.0f;
            int i12 = 58;
            jj0 jj0Var = this.e;
            if (z4) {
                dp = 0.0f;
            } else {
                if (jj0Var.getVisibility() == 0) {
                    if (this.f21535x) {
                        i10 = 72;
                    } else {
                        i10 = 58;
                    }
                    f10 = i10;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (jj0Var.getVisibility() == 0) {
                    if (this.f21535x) {
                        i12 = 72;
                    }
                    f11 = i12;
                }
                i11 = AndroidUtilities.dp(f11);
            } else {
                i11 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        CharSequence text = k5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        if (!isEmpty) {
            CharSequence text2 = k6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f21530f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f21530f.h);
            StringBuilder sb = new StringBuilder();
            sb.append(k5Var.getText());
            if (!TextUtils.isEmpty(k6Var.getText())) {
                sb.append('\n');
                sb.append(k6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int measuredWidth2;
        int i14;
        int dp;
        int measuredWidth3;
        int measuredWidth4;
        float f10;
        int measuredWidth5;
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i12 - i10;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        int textHeight = k5Var.getTextHeight();
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        int max = ((i17 - Math.max(textHeight, k6Var.getTextHeight())) / 2) + 1;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(this.f21531n - 6);
        } else {
            measuredWidth = (i18 - k6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f21531n - 6);
        }
        if (this.f21536y && !LocaleController.isRTL) {
            measuredWidth = (i18 - k6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f21531n);
        }
        k6Var.layout(measuredWidth, max, k6Var.getMeasuredWidth() + measuredWidth, k6Var.getMeasuredHeight() + max);
        if (LocaleController.isRTL) {
            measuredWidth2 = AndroidUtilities.dp(this.f21531n - 6);
        } else {
            measuredWidth2 = (i18 - k5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f21531n - 6);
        }
        k5Var.layout(measuredWidth2, max, k5Var.getMeasuredWidth() + measuredWidth2, k5Var.getMeasuredHeight() + max);
        boolean z10 = LocaleController.isRTL;
        jj0 jj0Var = this.e;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f21527a;
        if (z10) {
            int measuredWidth6 = getMeasuredWidth() - k5Var2.getMeasuredWidth();
            if (jj0Var.getVisibility() == 0) {
                i16 = this.f21533s;
            } else {
                i16 = this.f21531n;
            }
            dp = measuredWidth6 - AndroidUtilities.dp(i16);
        } else {
            if (jj0Var.getVisibility() == 0) {
                i14 = this.f21533s;
            } else {
                i14 = this.f21531n;
            }
            dp = AndroidUtilities.dp(i14);
        }
        org.telegram.ui.ActionBar.k5 k5Var3 = this.f21528b;
        if (k5Var3.getVisibility() == 0) {
            if (this.v > 50) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            float f11 = i15;
            int dp2 = AndroidUtilities.dp(1.0f) + org.telegram.ui.b.x(f11, (i17 - k5Var2.getTextHeight()) - k5Var3.getTextHeight(), 2);
            k5Var2.layout(dp, dp2, k5Var2.getMeasuredWidth() + dp, k5Var2.getMeasuredHeight() + dp2);
            int dp3 = AndroidUtilities.dp(f11) + k5Var2.getTextHeight() + dp2;
            k5Var3.layout(dp, dp3, k5Var3.getMeasuredWidth() + dp, k5Var3.getMeasuredHeight() + dp3);
        } else {
            int dp4 = AndroidUtilities.dp(1.0f) + ((i17 - k5Var2.getTextHeight()) / 2);
            k5Var2.layout(dp, dp4, k5Var2.getMeasuredWidth() + dp, k5Var2.getMeasuredHeight() + dp4);
        }
        if (jj0Var.getVisibility() == 0) {
            if (this.v > 50) {
                f10 = 0.0f;
            } else {
                f10 = 2.0f;
            }
            int dp5 = AndroidUtilities.dp(1.0f) + ((((i17 - jj0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(f10)) - jj0Var.getPaddingTop());
            if (!LocaleController.isRTL) {
                measuredWidth5 = AndroidUtilities.dp(this.f21534w);
            } else {
                measuredWidth5 = (i18 - jj0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f21534w);
            }
            jj0Var.layout(measuredWidth5, dp5, jj0Var.getMeasuredWidth() + measuredWidth5, jj0Var.getMeasuredHeight() + dp5);
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
        Switch r92 = this.f21530f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i17 - this.f21530f.getMeasuredHeight()) / 2;
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth3 = (i18 - this.f21530f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
            }
            Switch r10 = this.f21530f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f21530f.getMeasuredHeight() + measuredHeight);
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
        int i16 = this.I;
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        if (i16 != 0 && i16 != size && (charSequence = this.J) != null) {
            k6Var.c(TextUtils.ellipsize(charSequence, k6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.I = size;
        boolean z4 = this.f21536y;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21528b;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.d;
        org.telegram.ui.ActionBar.k5 k5Var3 = this.f21527a;
        if (z4) {
            k5Var3.measure(org.telegram.ui.b.d(this.f21531n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            k5Var.measure(org.telegram.ui.b.d(this.f21531n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp2 = (size - AndroidUtilities.dp(this.f21531n + 103)) - k5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(dp2, i14), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp3 = (size - AndroidUtilities.dp(this.f21531n + 103)) - k5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i15 = Integer.MIN_VALUE;
            } else {
                i15 = 1073741824;
            }
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp3, i15), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            int dp4 = size - AndroidUtilities.dp(this.f21531n);
            if (LocaleController.isRTL) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(dp4, i12), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp5 = size - AndroidUtilities.dp(this.f21531n);
            if (LocaleController.isRTL) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp5, i13), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int max = Math.max(k6Var.d(), k5Var2.getTextWidth());
            k5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.f21531n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            k5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f21531n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        jj0 jj0Var = this.e;
        if (jj0Var.getVisibility() == 0) {
            jj0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        Switch r02 = this.f21530f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, dp + (this.f21532r ? 1 : 0));
    }

    public final void p(String str, String str2, boolean z4, int i10, int i11, int i12, boolean z10) {
        CharSequence ellipsize;
        this.f21534w = 16;
        this.f21533s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(str, false);
        k5Var.i(null);
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.J = str2;
            ellipsize = TextUtils.ellipsize(str2, k6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        k6Var.c(ellipsize, z4, true);
        k6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i11, i12, i10);
        this.h.setVisibility(8);
        this.f21532r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f21530f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z4) {
        s(charSequence, charSequence2, false, i10, z4);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z4) {
        this.f21533s = 58;
        this.f21534w = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = charSequence2;
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        k6Var.c(charSequence2, false, true);
        jj0 jj0Var = this.e;
        jj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof gj0) {
            jj0Var.setAnimation((gj0) drawable);
        } else {
            jj0Var.setImageDrawable(drawable);
        }
        jj0Var.setVisibility(0);
        k6Var.setVisibility(0);
        this.h.setVisibility(8);
        jj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f21532r = z4;
        setWillNotDraw(!z4);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i10, boolean z10) {
        this.f21534w = 16;
        this.f21533s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        jj0 jj0Var = this.e;
        jj0Var.setVisibility(0);
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        if (charSequence2 != null) {
            float g10 = ph.f3.g(charSequence, k5Var.getTextPaint());
            this.J = charSequence2;
            k6Var.c(TextUtils.ellipsize(charSequence2, k6Var.getPaint(), (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((g10 + AndroidUtilities.dp(this.f21533s)) + AndroidUtilities.dp(16.0f))), TextUtils.TruncateAt.END), z4, true);
        } else {
            k6Var.c("", z4, true);
        }
        k6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        jj0Var.setTranslationX(0.0f);
        jj0Var.setTranslationY(0.0f);
        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        jj0Var.setImageResource(i10);
        this.f21532r = z10;
        setWillNotDraw(!z10);
        Switch r92 = this.f21530f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public void setChecked(boolean z4) {
        this.f21530f.c(z4, true);
    }

    @Override
    public void setEnabled(boolean z4) {
        g(z4);
    }

    public void setImageLeft(int i10) {
        this.f21534w = i10;
    }

    public void setNeedDivider(boolean z4) {
        if (this.f21532r != z4) {
            this.f21532r = z4;
            setWillNotDraw(!z4);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.f21533s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z4) {
        if (this.f21536y != z4) {
            this.f21536y = z4;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.k5 k5Var = this.f21528b;
        if (!isEmpty) {
            k5Var.setVisibility(0);
            k5Var.l(charSequence, false);
            return;
        }
        k5Var.setVisibility(8);
    }

    public void setTextColor(int i10) {
        this.f21527a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.H == null) {
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(30.0f), this);
            this.H = j5Var;
            if (this.C) {
                j5Var.a();
            }
        }
        this.H.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z4) {
        this.f21534w = 16;
        this.f21533s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = null;
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        k6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        k6Var.setVisibility(8);
        this.d.setVisibility(8);
        jj0 jj0Var = this.e;
        jj0Var.setVisibility(8);
        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f21532r = z4;
        setWillNotDraw(!z4);
        Switch r72 = this.f21530f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z4) {
        CharSequence ellipsize;
        org.telegram.ui.Components.k6 k6Var = this.f21529c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.J = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, k6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        k6Var.c(ellipsize, z4, true);
    }

    public final void v() {
        int i10;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21527a;
        if (k5Var.getTag() instanceof Integer) {
            i10 = ((Integer) k5Var.getTag()).intValue();
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.B;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        if (i10 != org.telegram.ui.ActionBar.j6.f20012j5 && i10 != org.telegram.ui.ActionBar.j6.G6) {
            v02 = c(v02);
        }
        k5Var.setTextColor(v02);
        jj0 jj0Var = this.e;
        if (jj0Var.getTag() instanceof Integer) {
            int intValue = ((Integer) jj0Var.getTag()).intValue();
            int v03 = org.telegram.ui.ActionBar.j6.v0(intValue, f6Var);
            if (intValue != org.telegram.ui.ActionBar.j6.J5 && intValue != org.telegram.ui.ActionBar.j6.f20067m6) {
                v03 = c(v03);
            }
            jj0Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        }
        this.f21528b.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var)));
        int i11 = org.telegram.ui.ActionBar.j6.I6;
        this.f21529c.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
    }

    public o8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(23, context, f6Var, false, false);
    }

    public o8(int i10, Context context, boolean z4) {
        this(i10, context, null, z4, false);
    }

    public o8(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.f21533s = 58;
        this.v = 50;
        this.f21534w = 16;
        this.B = f6Var;
        this.f21531n = i10;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f21527a = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.f20012j5 : org.telegram.ui.ActionBar.j6.G6, f6Var));
        k5Var.setTextSize(16);
        k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        k5Var.setImportantForAccessibility(2);
        addView(k5Var, k7.b6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f21528b = k5Var2;
        k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.f20120p5 : org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
        k5Var2.setTextSize(13);
        k5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        k5Var2.setImportantForAccessibility(2);
        addView(k5Var2, k7.b6.c(-1.0f, -2));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.f21529c = k6Var;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.f20084n5 : org.telegram.ui.ActionBar.j6.I6, f6Var));
        k6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        k6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        k6Var.setImportantForAccessibility(2);
        k6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(k6Var);
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var3;
        Boolean bool = Boolean.FALSE;
        if (!k5Var3.M) {
            k5Var3.f20396k0 = true;
            k5Var3.m0 = bool;
            k5Var3.m();
            k5Var3.b();
        }
        k5Var3.f20399n0 = 18;
        k5Var3.m();
        k5Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.f20084n5 : org.telegram.ui.ActionBar.j6.I6, f6Var));
        k5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        k5Var3.setTextSize(16);
        k5Var3.setImportantForAccessibility(2);
        k5Var3.setVisibility(8);
        addView(k5Var3);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.J5 : org.telegram.ui.ActionBar.j6.f20067m6, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z10) {
            Switch r42 = new Switch(context, f6Var);
            this.f21530f = r42;
            int i11 = org.telegram.ui.ActionBar.j6.M6;
            int i12 = org.telegram.ui.ActionBar.j6.N6;
            int i13 = org.telegram.ui.ActionBar.j6.f19906d6;
            r42.d(i11, i12, i13, i13);
            addView(this.f21530f, k7.b6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.H == null) {
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(30.0f), this);
            this.H = j5Var;
            if (this.C) {
                j5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new eh.f(imageReceiver, 1));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.H.g(new dg.k1(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
