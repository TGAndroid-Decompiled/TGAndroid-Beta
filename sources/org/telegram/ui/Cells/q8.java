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
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.n00;
import org.telegram.ui.to0;
public class q8 extends FrameLayout {
    public static final int Q = 0;
    public final org.telegram.ui.ActionBar.d6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.p5 K;
    public int L;
    public CharSequence M;
    public Paint N;
    public boolean O;
    public int P;
    public final org.telegram.ui.ActionBar.j5 f22778a;
    public final org.telegram.ui.ActionBar.j5 f22779b;
    public final org.telegram.ui.Components.q6 f22780c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final xj0 e;
    public Switch f22781f;
    public final ImageView h;
    public int f22782n;
    public boolean f22783r;
    public int f22784s;
    public int v;
    public int f22785w;
    public boolean f22786x;
    public boolean f22787y;

    public q8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder a(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        n00 n00Var = new n00();
        n00Var.f39272f = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lj, false);
        spannableStringBuilder.setSpan(n00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f22781f;
        if (r02 != null && r02.h) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11, int i12) {
        float f7;
        boolean q6;
        this.f22784s = 52;
        xj0 xj0Var = this.e;
        xj0Var.setVisibility(0);
        xj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        if (LocaleController.isRTL) {
            f7 = 0.0f;
        } else {
            f7 = -3.0f;
        }
        xj0Var.setTranslationX(AndroidUtilities.dp(f7));
        xj0Var.setImageResource(i12);
        xj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        jc0 jc0Var = new jc0(1);
        jc0Var.b(i10, i11);
        jc0Var.f27503b = q6;
        xj0Var.setBackground(jc0Var);
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
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.O5, this.E));
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
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var == null) {
            e = 1.0f;
        } else {
            e = 1.0f - p5Var.e();
        }
        float f18 = f17 * e;
        if (isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        this.f22780c.setAlpha(f18 * f7);
        float f19 = 1.0f - this.J;
        org.telegram.ui.Components.p5 p5Var2 = this.K;
        if (p5Var2 == null) {
            e7 = 1.0f;
        } else {
            e7 = 1.0f - p5Var2.e();
        }
        float f20 = f19 * e7;
        if (!isEnabled()) {
            f10 = 0.5f;
        }
        this.d.setAlpha(f20 * f10);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.p5 p5Var3 = this.K;
        if (p5Var3 != null) {
            p5Var3.setBounds((getWidth() - this.K.f29181s) - AndroidUtilities.dp(18.0f), (getHeight() - this.K.f29181s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.K.f29181s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.setTextColor(w02);
        j5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN);
            xj0 xj0Var = this.e;
            xj0Var.setColorFilter(porterDuffColorFilter);
            xj0Var.setTag(Integer.valueOf(i10));
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
        Switch r02 = this.f22781f;
        if (r02 != null) {
            r02.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f22778a.animate();
        float f12 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).start();
        ViewPropertyAnimator animate2 = this.f22779b.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate2.alpha(f10).start();
        ViewPropertyAnimator animate3 = this.f22780c.animate();
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
        return this.f22781f;
    }

    public xj0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.j5 getTextView() {
        return this.f22778a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.q6 getValueTextView() {
        return this.f22780c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        if (i10 <= 0) {
            j5Var.i(null);
            return;
        }
        j5Var.i(new to0(i10, getContext(), this.E, false));
        j5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.f22785w = 16;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        q6Var.c(null, false, true);
        this.e.setVisibility(8);
        q6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f22783r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z10, boolean z11) {
        this.f22785w = 16;
        this.f22784s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f22783r = z11;
        Switch r62 = this.f22781f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f22781f.c(z10, false);
        }
        setWillNotDraw(!this.f22783r);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        this.f22785w = 21;
        this.f22784s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(str, false);
        j5Var.i(null);
        this.f22780c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f22781f == null) {
            Switch r12 = new Switch(getContext(), this.E);
            this.f22781f = r12;
            int i13 = org.telegram.ui.ActionBar.h6.M6;
            int i14 = org.telegram.ui.ActionBar.h6.N6;
            int i15 = org.telegram.ui.ActionBar.h6.f20986d6;
            r12.d(i13, i14, i15, i15);
            Switch r122 = this.f22781f;
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(r122, w7.z5.d(37, 20.0f, i12 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r123 = this.f22781f;
        if (r123 != null) {
            r123.setVisibility(0);
            this.f22781f.c(z10, false);
        }
        this.f22783r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z10) {
        this.f22785w = 16;
        this.f22784s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(str, false);
        j5Var.i(null);
        this.f22780c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f22781f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f22781f.c(z10, false);
        }
        xj0 xj0Var = this.e;
        xj0Var.setVisibility(0);
        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        xj0Var.setImageResource(i10);
        this.f22783r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z10) {
        this.f22785w = 16;
        this.f22784s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        q6Var.c(null, false, true);
        xj0 xj0Var = this.e;
        xj0Var.setImageResource(i10);
        xj0Var.setVisibility(0);
        q6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f22783r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f22784s = 58;
        this.f22785w = 18;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        q6Var.c(null, false, true);
        xj0 xj0Var = this.e;
        xj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof uj0) {
            xj0Var.setAnimation((uj0) drawable);
        } else {
            xj0Var.setImageDrawable(drawable);
        }
        xj0Var.setVisibility(0);
        q6Var.setVisibility(8);
        this.h.setVisibility(8);
        xj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f22783r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f22785w = 16;
        this.f22784s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = charSequence2;
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, q6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        q6Var.c(ellipsize, z10, true);
        q6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f22783r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f22781f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f7;
        float dp;
        int i10;
        int i11;
        if (this.f22783r) {
            org.telegram.ui.ActionBar.d6 d6Var = this.E;
            if (d6Var != null) {
                paint = d6Var.n("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.h6.f21107k0;
            }
            Paint paint2 = paint;
            boolean z10 = LocaleController.isRTL;
            float f10 = 20.0f;
            int i12 = 58;
            xj0 xj0Var = this.e;
            if (z10) {
                dp = 0.0f;
            } else {
                if (xj0Var.getVisibility() == 0) {
                    if (this.f22786x) {
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
                if (xj0Var.getVisibility() == 0) {
                    if (this.f22786x) {
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        CharSequence text = j5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        if (!isEmpty) {
            CharSequence text2 = q6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f22781f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f22781f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j5Var.getText());
            if (!TextUtils.isEmpty(q6Var.getText())) {
                sb2.append('\n');
                sb2.append(q6Var.getText());
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
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        int textHeight = j5Var.getTextHeight();
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        int max = ((i17 - Math.max(textHeight, q6Var.getTextHeight())) / 2) + 1;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(this.f22782n - 6);
        } else {
            measuredWidth = (i18 - q6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f22782n - 6);
        }
        if (this.f22787y && !LocaleController.isRTL) {
            measuredWidth = (i18 - q6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f22782n);
        }
        q6Var.layout(measuredWidth, max, q6Var.getMeasuredWidth() + measuredWidth, q6Var.getMeasuredHeight() + max);
        if (LocaleController.isRTL) {
            measuredWidth2 = AndroidUtilities.dp(this.f22782n - 6);
        } else {
            measuredWidth2 = (i18 - j5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f22782n - 6);
        }
        j5Var.layout(measuredWidth2, max, j5Var.getMeasuredWidth() + measuredWidth2, j5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        xj0 xj0Var = this.e;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f22778a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - j5Var2.getMeasuredWidth();
            if (xj0Var.getVisibility() == 0) {
                i16 = this.f22784s;
            } else {
                i16 = this.f22782n;
            }
            dp = measuredWidth6 - AndroidUtilities.dp(i16);
        } else {
            if (xj0Var.getVisibility() == 0) {
                i14 = this.f22784s;
            } else {
                i14 = this.f22782n;
            }
            dp = AndroidUtilities.dp(i14);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = this.f22779b;
        if (j5Var3.getVisibility() == 0) {
            if (this.v > 50) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            float f10 = i15;
            int dp2 = AndroidUtilities.dp(1.0f) + lk.A(f10, (i17 - j5Var2.getTextHeight()) - j5Var3.getTextHeight(), 2);
            j5Var2.layout(dp, dp2, j5Var2.getMeasuredWidth() + dp, j5Var2.getMeasuredHeight() + dp2);
            int dp3 = AndroidUtilities.dp(f10) + j5Var2.getTextHeight() + dp2;
            j5Var3.layout(dp, dp3, j5Var3.getMeasuredWidth() + dp, j5Var3.getMeasuredHeight() + dp3);
        } else {
            int dp4 = AndroidUtilities.dp(1.0f) + ((i17 - j5Var2.getTextHeight()) / 2);
            j5Var2.layout(dp, dp4, j5Var2.getMeasuredWidth() + dp, j5Var2.getMeasuredHeight() + dp4);
        }
        if (xj0Var.getVisibility() == 0) {
            if (this.v > 50) {
                f7 = 0.0f;
            } else {
                f7 = 2.0f;
            }
            int dp5 = AndroidUtilities.dp(1.0f) + ((((i17 - xj0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(f7)) - xj0Var.getPaddingTop());
            if (!LocaleController.isRTL) {
                measuredWidth5 = AndroidUtilities.dp(this.f22785w);
            } else {
                measuredWidth5 = (i18 - xj0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f22785w);
            }
            xj0Var.layout(measuredWidth5, dp5, xj0Var.getMeasuredWidth() + measuredWidth5, xj0Var.getMeasuredHeight() + dp5);
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
        Switch r92 = this.f22781f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i17 - this.f22781f.getMeasuredHeight()) / 2;
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth3 = (i18 - this.f22781f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
            }
            Switch r10 = this.f22781f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f22781f.getMeasuredHeight() + measuredHeight);
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
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        if (i16 != 0 && i16 != size && (charSequence = this.M) != null) {
            q6Var.c(TextUtils.ellipsize(charSequence, q6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z10 = this.f22787y;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22779b;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.d;
        org.telegram.ui.ActionBar.j5 j5Var3 = this.f22778a;
        if (z10) {
            j5Var3.measure(lk.c(this.f22782n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            j5Var.measure(lk.c(this.f22782n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp2 = (size - AndroidUtilities.dp(this.f22782n + 103)) - j5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            q6Var.measure(View.MeasureSpec.makeMeasureSpec(dp2, i14), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp3 = (size - AndroidUtilities.dp(this.f22782n + 103)) - j5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i15 = Integer.MIN_VALUE;
            } else {
                i15 = 1073741824;
            }
            j5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp3, i15), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            int dp4 = size - AndroidUtilities.dp(this.f22782n);
            if (LocaleController.isRTL) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            q6Var.measure(View.MeasureSpec.makeMeasureSpec(dp4, i12), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp5 = size - AndroidUtilities.dp(this.f22782n);
            if (LocaleController.isRTL) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            j5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp5, i13), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int max = Math.max(q6Var.d(), j5Var2.getTextWidth());
            j5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.f22782n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            j5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f22782n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        xj0 xj0Var = this.e;
        if (xj0Var.getVisibility() == 0) {
            xj0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        Switch r02 = this.f22781f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, dp + (this.f22783r ? 1 : 0));
    }

    public final void p(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence ellipsize;
        this.f22785w = 21;
        this.f22784s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(str, false);
        j5Var.i(null);
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.M = str2;
            ellipsize = TextUtils.ellipsize(str2, q6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        q6Var.c(ellipsize, z10, true);
        q6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i11, i12, i10);
        this.h.setVisibility(8);
        this.f22783r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f22781f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        s(charSequence, charSequence2, false, i10, z10);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f22784s = 58;
        this.f22785w = 18;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = charSequence2;
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        q6Var.c(charSequence2, false, true);
        xj0 xj0Var = this.e;
        xj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof uj0) {
            xj0Var.setAnimation((uj0) drawable);
        } else {
            xj0Var.setImageDrawable(drawable);
        }
        xj0Var.setVisibility(0);
        q6Var.setVisibility(0);
        this.h.setVisibility(8);
        xj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f22783r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.f22785w = 16;
        this.f22784s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        xj0 xj0Var = this.e;
        xj0Var.setVisibility(0);
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        if (charSequence2 != null) {
            float g10 = ei.x3.g(charSequence, j5Var.getTextPaint());
            this.M = charSequence2;
            q6Var.c(TextUtils.ellipsize(charSequence2, q6Var.getPaint(), (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((g10 + AndroidUtilities.dp(this.f22784s)) + AndroidUtilities.dp(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            q6Var.c("", z10, true);
        }
        q6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        xj0Var.setTranslationX(0.0f);
        xj0Var.setTranslationY(0.0f);
        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        xj0Var.setImageResource(i10);
        this.f22783r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f22781f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public void setChecked(boolean z10) {
        this.f22781f.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        g(z10);
    }

    public void setImageLeft(int i10) {
        this.f22785w = i10;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f22783r != z10) {
            this.f22783r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.f22784s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.f22787y != z10) {
            this.f22787y = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.j5 j5Var = this.f22779b;
        if (!isEmpty) {
            j5Var.setVisibility(0);
            j5Var.l(charSequence, false);
            return;
        }
        j5Var.setVisibility(8);
    }

    public void setTextColor(int i10) {
        this.f22778a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(30.0f), this);
            this.K = p5Var;
            if (this.F) {
                p5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f22785w = 16;
        this.f22784s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        q6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        q6Var.setVisibility(8);
        this.d.setVisibility(8);
        xj0 xj0Var = this.e;
        xj0Var.setVisibility(8);
        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f22783r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f22781f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.q6 q6Var = this.f22780c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.M = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, q6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        q6Var.c(ellipsize, z10, true);
    }

    public final void v() {
        int i10;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22778a;
        if (j5Var.getTag() instanceof Integer) {
            i10 = ((Integer) j5Var.getTag()).intValue();
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        if (i10 != org.telegram.ui.ActionBar.h6.f21092j5 && i10 != org.telegram.ui.ActionBar.h6.G6) {
            w02 = c(w02);
        }
        j5Var.setTextColor(w02);
        xj0 xj0Var = this.e;
        if (xj0Var.getTag() instanceof Integer) {
            int intValue = ((Integer) xj0Var.getTag()).intValue();
            int w03 = org.telegram.ui.ActionBar.h6.w0(intValue, d6Var);
            if (intValue != org.telegram.ui.ActionBar.h6.J5 && intValue != org.telegram.ui.ActionBar.h6.f21149m6) {
                w03 = c(w03);
            }
            xj0Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        this.f22779b.setTextColor(c(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21374y6, d6Var)));
        int i11 = org.telegram.ui.ActionBar.h6.I6;
        this.f22780c.setTextColor(c(org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
    }

    public q8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(20, context, d6Var, false, false);
    }

    public q8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public q8(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        this.f22784s = 58;
        this.v = 50;
        this.f22785w = 16;
        this.E = d6Var;
        this.f22782n = i10;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22778a = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.f21092j5 : org.telegram.ui.ActionBar.h6.G6, d6Var));
        j5Var.setTextSize(16);
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j5Var.setImportantForAccessibility(2);
        addView(j5Var, w7.z5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f22779b = j5Var2;
        j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.p5 : org.telegram.ui.ActionBar.h6.f21374y6, d6Var));
        j5Var2.setTextSize(13);
        j5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        j5Var2.setImportantForAccessibility(2);
        addView(j5Var2, w7.z5.c(-1.0f, -2));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
        this.f22780c = q6Var;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.f21168n5 : org.telegram.ui.ActionBar.h6.I6, d6Var));
        q6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        q6Var.setTextSize(AndroidUtilities.dp(16.0f));
        q6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        q6Var.setImportantForAccessibility(2);
        q6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(q6Var);
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var3;
        Boolean bool = Boolean.FALSE;
        if (!j5Var3.P) {
            j5Var3.f21434n0 = true;
            j5Var3.f21436p0 = bool;
            j5Var3.m();
            j5Var3.b();
        }
        j5Var3.f21437q0 = 18;
        j5Var3.m();
        j5Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.f21168n5 : org.telegram.ui.ActionBar.h6.I6, d6Var));
        j5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        j5Var3.setTextSize(16);
        j5Var3.setImportantForAccessibility(2);
        j5Var3.setVisibility(8);
        addView(j5Var3);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.J5 : org.telegram.ui.ActionBar.h6.f21149m6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r42 = new Switch(context, d6Var);
            this.f22781f = r42;
            int i11 = org.telegram.ui.ActionBar.h6.M6;
            int i12 = org.telegram.ui.ActionBar.h6.N6;
            int i13 = org.telegram.ui.ActionBar.h6.f20986d6;
            r42.d(i11, i12, i13, i13);
            addView(this.f22781f, w7.z5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(30.0f), this);
            this.K = p5Var;
            if (this.F) {
                p5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new p8(imageReceiver, 0));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.K.g(new ei.w3(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
