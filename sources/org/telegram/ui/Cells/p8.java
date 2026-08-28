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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.l00;
import org.telegram.ui.lo0;
public class p8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 A;
    public boolean B;
    public int C;
    public boolean D;
    public float E;
    public float F;
    public org.telegram.ui.Components.i5 G;
    public int H;
    public CharSequence I;
    public Paint J;
    public boolean K;
    public int L;
    public final org.telegram.ui.ActionBar.h5 f24872a;
    public final org.telegram.ui.ActionBar.h5 f24873b;
    public final org.telegram.ui.Components.j6 f24874c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final pi0 f24875e;
    public Switch f24876f;
    public final ImageView h;
    public int f24877n;
    public boolean f24878r;
    public int f24879s;
    public int v;
    public int f24880w;
    public boolean f24881x;
    public boolean f24882y;

    public p8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        l00 l00Var = new l00();
        l00Var.f39963f = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false);
        spannableStringBuilder.setSpan(l00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f24876f;
        if (r02 != null && r02.h) {
            return true;
        }
        return false;
    }

    public final void d(int i9, int i10, int i11) {
        float f10;
        boolean q10;
        this.f24879s = 52;
        pi0 pi0Var = this.f24875e;
        pi0Var.setVisibility(0);
        pi0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        if (LocaleController.isRTL) {
            f10 = 0.0f;
        } else {
            f10 = -3.0f;
        }
        pi0Var.setTranslationX(AndroidUtilities.dp(f10));
        pi0Var.setImageResource(i11);
        pi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.b6 b6Var = this.A;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        xa0 xa0Var = new xa0(1);
        xa0Var.b(i9, i10);
        xa0Var.f34630b = q10;
        pi0Var.setBackground(xa0Var);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float e10;
        float f10;
        float e11;
        float f11 = 1.0f;
        if (this.D || this.F != 0.0f) {
            if (this.J == null) {
                Paint paint = new Paint(1);
                this.J = paint;
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.O5, this.A));
            }
            if (this.K) {
                float f12 = this.E + 0.016f;
                this.E = f12;
                if (f12 > 1.0f) {
                    this.E = 1.0f;
                    this.K = false;
                }
            } else {
                float f13 = this.E - 0.016f;
                this.E = f13;
                if (f13 < 0.0f) {
                    this.E = 0.0f;
                    this.K = true;
                }
            }
            int i9 = this.L;
            if (i9 > 0) {
                this.L = i9 - 15;
            } else {
                boolean z10 = this.D;
                if (z10) {
                    float f14 = this.F;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.F = f15;
                        if (f15 > 1.0f) {
                            this.F = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f16 = this.F;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.F = f17;
                        if (f17 < 0.0f) {
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
        float f18 = 1.0f - this.F;
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var == null) {
            e10 = 1.0f;
        } else {
            e10 = 1.0f - i5Var.e();
        }
        float f19 = f18 * e10;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f24874c.setAlpha(f19 * f10);
        float f20 = 1.0f - this.F;
        org.telegram.ui.Components.i5 i5Var2 = this.G;
        if (i5Var2 == null) {
            e11 = 1.0f;
        } else {
            e11 = 1.0f - i5Var2.e();
        }
        float f21 = f20 * e11;
        if (!isEnabled()) {
            f11 = 0.5f;
        }
        this.d.setAlpha(f21 * f11);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.i5 i5Var3 = this.G;
        if (i5Var3 != null) {
            i5Var3.setBounds((getWidth() - this.G.f29322s) - AndroidUtilities.dp(18.0f), (getHeight() - this.G.f29322s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.G.f29322s) / 2);
            this.G.draw(canvas);
        }
    }

    public final void e(int i9, int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.A;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.setTextColor(v02);
        h5Var.setTag(Integer.valueOf(i10));
        if (i9 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN);
            pi0 pi0Var = this.f24875e;
            pi0Var.setColorFilter(porterDuffColorFilter);
            pi0Var.setTag(Integer.valueOf(i9));
        }
        v();
    }

    public final void f(int i9, boolean z10, boolean z11) {
        float f10;
        this.D = z10;
        this.C = i9;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.F = f10;
        }
        invalidate();
    }

    public final void g(boolean z10) {
        float f10;
        float f11;
        float f12;
        super.setEnabled(z10);
        Switch r02 = this.f24876f;
        if (r02 != null) {
            r02.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f24872a.animate();
        float f13 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
        ViewPropertyAnimator animate2 = this.f24873b.animate();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        animate2.alpha(f11).start();
        ViewPropertyAnimator animate3 = this.f24874c.animate();
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.5f;
        }
        animate3.alpha(f12).start();
        ViewPropertyAnimator animate4 = this.d.animate();
        if (z10) {
            f13 = 1.0f;
        }
        animate4.alpha(f13).start();
    }

    public Switch getCheckBox() {
        return this.f24876f;
    }

    public pi0 getImageView() {
        return this.f24875e;
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.f24872a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.f24874c;
    }

    public final void h(int i9) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        if (i9 <= 0) {
            h5Var.i(null);
            return;
        }
        h5Var.i(new lo0(i9, getContext(), this.A, false));
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.f24880w = 16;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        j6Var.c(null, false, true);
        this.f24875e.setVisibility(8);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f24878r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z10, boolean z11) {
        this.f24880w = 16;
        this.f24879s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.f24875e.setVisibility(8);
        this.h.setVisibility(8);
        this.f24878r = z11;
        Switch r62 = this.f24876f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f24876f.c(z10, false);
        }
        setWillNotDraw(!this.f24878r);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i9, int i10, boolean z11) {
        int i11;
        this.f24880w = 16;
        this.f24879s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.f24874c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i10, i10, i9);
        if (this.f24876f == null) {
            Switch r13 = new Switch(getContext(), this.A);
            this.f24876f = r13;
            int i12 = org.telegram.ui.ActionBar.f6.M6;
            int i13 = org.telegram.ui.ActionBar.f6.N6;
            int i14 = org.telegram.ui.ActionBar.f6.f23001d6;
            r13.d(i12, i13, i14, i14);
            Switch r132 = this.f24876f;
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(r132, g7.e6.d(37, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r133 = this.f24876f;
        if (r133 != null) {
            r133.setVisibility(0);
            this.f24876f.c(z10, false);
        }
        this.f24878r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void l(int i9, String str, boolean z10) {
        this.f24880w = 16;
        this.f24879s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.f24874c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f24876f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f24876f.c(z10, false);
        }
        pi0 pi0Var = this.f24875e;
        pi0Var.setVisibility(0);
        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        pi0Var.setImageResource(i9);
        this.f24878r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void m(int i9, CharSequence charSequence, boolean z10) {
        this.f24880w = 16;
        this.f24879s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        j6Var.c(null, false, true);
        pi0 pi0Var = this.f24875e;
        pi0Var.setImageResource(i9);
        pi0Var.setVisibility(0);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f24878r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f24879s = 58;
        this.f24880w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        j6Var.c(null, false, true);
        pi0 pi0Var = this.f24875e;
        pi0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof mi0) {
            pi0Var.setAnimation((mi0) drawable);
        } else {
            pi0Var.setImageDrawable(drawable);
        }
        pi0Var.setVisibility(0);
        j6Var.setVisibility(8);
        this.h.setVisibility(8);
        pi0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f24878r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f24880w = 16;
        this.f24879s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(ellipsize, z10, true);
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.f24875e.setVisibility(8);
        this.h.setVisibility(8);
        this.f24878r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f24876f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = true;
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B = false;
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f10;
        float dp;
        int i9;
        int i10;
        if (this.f24878r) {
            org.telegram.ui.ActionBar.b6 b6Var = this.A;
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            Paint paint2 = paint;
            boolean z10 = LocaleController.isRTL;
            float f11 = 20.0f;
            int i11 = 58;
            pi0 pi0Var = this.f24875e;
            if (z10) {
                dp = 0.0f;
            } else {
                if (pi0Var.getVisibility() == 0) {
                    if (this.f24881x) {
                        i9 = 72;
                    } else {
                        i9 = 58;
                    }
                    f10 = i9;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (pi0Var.getVisibility() == 0) {
                    if (this.f24881x) {
                        i11 = 72;
                    }
                    f11 = i11;
                }
                i10 = AndroidUtilities.dp(f11);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        CharSequence text = h5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        if (!isEmpty) {
            CharSequence text2 = j6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f24876f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f24876f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h5Var.getText());
            if (!TextUtils.isEmpty(j6Var.getText())) {
                sb2.append('\n');
                sb2.append(j6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredWidth;
        int measuredWidth2;
        int i13;
        int dp;
        int measuredWidth3;
        int measuredWidth4;
        float f10;
        int measuredWidth5;
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i11 - i9;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int textHeight = h5Var.getTextHeight();
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        int max = ((i16 - Math.max(textHeight, j6Var.getTextHeight())) / 2) + 1;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(this.f24877n - 6);
        } else {
            measuredWidth = (i17 - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24877n - 6);
        }
        if (this.f24882y && !LocaleController.isRTL) {
            measuredWidth = (i17 - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24877n);
        }
        j6Var.layout(measuredWidth, max, j6Var.getMeasuredWidth() + measuredWidth, j6Var.getMeasuredHeight() + max);
        if (LocaleController.isRTL) {
            measuredWidth2 = AndroidUtilities.dp(this.f24877n - 6);
        } else {
            measuredWidth2 = (i17 - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24877n - 6);
        }
        h5Var.layout(measuredWidth2, max, h5Var.getMeasuredWidth() + measuredWidth2, h5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        pi0 pi0Var = this.f24875e;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24872a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - h5Var2.getMeasuredWidth();
            if (pi0Var.getVisibility() == 0) {
                i15 = this.f24879s;
            } else {
                i15 = this.f24877n;
            }
            dp = measuredWidth6 - AndroidUtilities.dp(i15);
        } else {
            if (pi0Var.getVisibility() == 0) {
                i13 = this.f24879s;
            } else {
                i13 = this.f24877n;
            }
            dp = AndroidUtilities.dp(i13);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f24873b;
        if (h5Var3.getVisibility() == 0) {
            if (this.v > 50) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            float f11 = i14;
            int dp2 = AndroidUtilities.dp(1.0f) + ll.y(f11, (i16 - h5Var2.getTextHeight()) - h5Var3.getTextHeight(), 2);
            h5Var2.layout(dp, dp2, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp2);
            int dp3 = AndroidUtilities.dp(f11) + h5Var2.getTextHeight() + dp2;
            h5Var3.layout(dp, dp3, h5Var3.getMeasuredWidth() + dp, h5Var3.getMeasuredHeight() + dp3);
        } else {
            int dp4 = AndroidUtilities.dp(1.0f) + ((i16 - h5Var2.getTextHeight()) / 2);
            h5Var2.layout(dp, dp4, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp4);
        }
        if (pi0Var.getVisibility() == 0) {
            if (this.v > 50) {
                f10 = 0.0f;
            } else {
                f10 = 2.0f;
            }
            int dp5 = AndroidUtilities.dp(1.0f) + ((((i16 - pi0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(f10)) - pi0Var.getPaddingTop());
            if (!LocaleController.isRTL) {
                measuredWidth5 = AndroidUtilities.dp(this.f24880w);
            } else {
                measuredWidth5 = (i17 - pi0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24880w);
            }
            pi0Var.layout(measuredWidth5, dp5, pi0Var.getMeasuredWidth() + measuredWidth5, pi0Var.getMeasuredHeight() + dp5);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int dp6 = AndroidUtilities.dp(1.0f) + ((i16 - imageView.getMeasuredHeight()) / 2);
            if (LocaleController.isRTL) {
                measuredWidth4 = AndroidUtilities.dp(23.0f);
            } else {
                measuredWidth4 = (i17 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            }
            imageView.layout(measuredWidth4, dp6, imageView.getMeasuredWidth() + measuredWidth4, imageView.getMeasuredHeight() + dp6);
        }
        Switch r92 = this.f24876f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i16 - this.f24876f.getMeasuredHeight()) / 2;
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth3 = (i17 - this.f24876f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
            }
            Switch r10 = this.f24876f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f24876f.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(this.v);
        int i15 = this.H;
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        if (i15 != 0 && i15 != size && (charSequence = this.I) != null) {
            j6Var.c(TextUtils.ellipsize(charSequence, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.H = size;
        boolean z10 = this.f24882y;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24873b;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.d;
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f24872a;
        if (z10) {
            h5Var3.measure(ll.d(this.f24877n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var.measure(ll.d(this.f24877n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp2 = (size - AndroidUtilities.dp(this.f24877n + 103)) - h5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(dp2, i13), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp3 = (size - AndroidUtilities.dp(this.f24877n + 103)) - h5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp3, i14), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            int dp4 = size - AndroidUtilities.dp(this.f24877n);
            if (LocaleController.isRTL) {
                i11 = Integer.MIN_VALUE;
            } else {
                i11 = 1073741824;
            }
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(dp4, i11), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp5 = size - AndroidUtilities.dp(this.f24877n);
            if (LocaleController.isRTL) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp5, i12), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int max = Math.max(j6Var.d(), h5Var2.getTextWidth());
            h5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.f24877n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f24877n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        pi0 pi0Var = this.f24875e;
        if (pi0Var.getVisibility() == 0) {
            pi0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        Switch r02 = this.f24876f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, dp + (this.f24878r ? 1 : 0));
    }

    public final void p(String str, String str2, boolean z10, int i9, int i10, int i11, boolean z11) {
        CharSequence ellipsize;
        this.f24880w = 16;
        this.f24879s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(str, false);
        h5Var.i(null);
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.I = str2;
            ellipsize = TextUtils.ellipsize(str2, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(ellipsize, z10, true);
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i10, i11, i9);
        this.h.setVisibility(8);
        this.f24878r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f24876f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i9, boolean z10) {
        s(charSequence, charSequence2, false, i9, z10);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f24879s = 58;
        this.f24880w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        j6Var.c(charSequence2, false, true);
        pi0 pi0Var = this.f24875e;
        pi0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof mi0) {
            pi0Var.setAnimation((mi0) drawable);
        } else {
            pi0Var.setImageDrawable(drawable);
        }
        pi0Var.setVisibility(0);
        j6Var.setVisibility(0);
        this.h.setVisibility(8);
        pi0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f24878r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i9, boolean z11) {
        this.f24880w = 16;
        this.f24879s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        pi0 pi0Var = this.f24875e;
        pi0Var.setVisibility(0);
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        if (charSequence2 != null) {
            float g10 = kh.x3.g(charSequence, h5Var.getTextPaint());
            this.I = charSequence2;
            j6Var.c(TextUtils.ellipsize(charSequence2, j6Var.getPaint(), (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((g10 + AndroidUtilities.dp(this.f24879s)) + AndroidUtilities.dp(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            j6Var.c("", z10, true);
        }
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        pi0Var.setTranslationX(0.0f);
        pi0Var.setTranslationY(0.0f);
        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        pi0Var.setImageResource(i9);
        this.f24878r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f24876f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public void setChecked(boolean z10) {
        this.f24876f.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        g(z10);
    }

    public void setImageLeft(int i9) {
        this.f24880w = i9;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f24878r != z10) {
            this.f24878r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i9) {
        this.f24879s = i9;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.f24882y != z10) {
            this.f24882y = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24873b;
        if (!isEmpty) {
            h5Var.setVisibility(0);
            h5Var.l(charSequence, false);
            return;
        }
        h5Var.setVisibility(8);
    }

    public void setTextColor(int i9) {
        this.f24872a.setTextColor(i9);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.G == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(30.0f), this);
            this.G = i5Var;
            if (this.B) {
                i5Var.a();
            }
        }
        this.G.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f24880w = 16;
        this.f24879s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        j6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        pi0 pi0Var = this.f24875e;
        pi0Var.setVisibility(8);
        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f24878r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f24876f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.j6 j6Var = this.f24874c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.I = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(ellipsize, z10, true);
    }

    public final void v() {
        int i9;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24872a;
        if (h5Var.getTag() instanceof Integer) {
            i9 = ((Integer) h5Var.getTag()).intValue();
        } else {
            i9 = org.telegram.ui.ActionBar.f6.G6;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.A;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        if (i9 != org.telegram.ui.ActionBar.f6.f23108j5 && i9 != org.telegram.ui.ActionBar.f6.G6) {
            v02 = c(v02);
        }
        h5Var.setTextColor(v02);
        pi0 pi0Var = this.f24875e;
        if (pi0Var.getTag() instanceof Integer) {
            int intValue = ((Integer) pi0Var.getTag()).intValue();
            int v03 = org.telegram.ui.ActionBar.f6.v0(intValue, b6Var);
            if (intValue != org.telegram.ui.ActionBar.f6.J5 && intValue != org.telegram.ui.ActionBar.f6.f23162m6) {
                v03 = c(v03);
            }
            pi0Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        }
        this.f24873b.setTextColor(c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var)));
        int i10 = org.telegram.ui.ActionBar.f6.I6;
        this.f24874c.setTextColor(c(org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
    }

    public p8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(23, context, b6Var, false, false);
    }

    public p8(int i9, Context context, boolean z10) {
        this(i9, context, null, z10, false);
    }

    public p8(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        this.f24879s = 58;
        this.v = 50;
        this.f24880w = 16;
        this.A = b6Var;
        this.f24877n = i9;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24872a = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.f23108j5 : org.telegram.ui.ActionBar.f6.G6, b6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setImportantForAccessibility(2);
        addView(h5Var, g7.e6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24873b = h5Var2;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.f23211p5 : org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        h5Var2.setTextSize(13);
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var2.setImportantForAccessibility(2);
        addView(h5Var2, g7.e6.c(-1.0f, -2));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f24874c = j6Var;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.f23178n5 : org.telegram.ui.ActionBar.f6.I6, b6Var));
        j6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        j6Var.setImportantForAccessibility(2);
        j6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(j6Var);
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var3;
        Boolean bool = Boolean.FALSE;
        if (!h5Var3.L) {
            h5Var3.f23472j0 = true;
            h5Var3.f23474l0 = bool;
            h5Var3.m();
            h5Var3.b();
        }
        h5Var3.m0 = 18;
        h5Var3.m();
        h5Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.f23178n5 : org.telegram.ui.ActionBar.f6.I6, b6Var));
        h5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        h5Var3.setTextSize(16);
        h5Var3.setImportantForAccessibility(2);
        h5Var3.setVisibility(8);
        addView(h5Var3);
        ?? imageView = new ImageView(context);
        this.f24875e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.J5 : org.telegram.ui.ActionBar.f6.f23162m6, b6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r42 = new Switch(context, b6Var);
            this.f24876f = r42;
            int i10 = org.telegram.ui.ActionBar.f6.M6;
            int i11 = org.telegram.ui.ActionBar.f6.N6;
            int i12 = org.telegram.ui.ActionBar.f6.f23001d6;
            r42.d(i10, i11, i12, i12);
            addView(this.f24876f, g7.e6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.G == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(30.0f), this);
            this.G = i5Var;
            if (this.B) {
                i5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new o8(imageReceiver, 0));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.G.g(new kh.w3(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i9) {
        return i9;
    }
}
