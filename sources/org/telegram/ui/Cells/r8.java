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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.o00;
import org.telegram.ui.to0;
public class r8 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int V = 0;
    public final org.telegram.ui.ActionBar.g6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.n5 K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public PorterDuffColorFilter P;
    public CharSequence Q;
    public boolean R;
    public Paint S;
    public boolean T;
    public int U;
    public final org.telegram.ui.ActionBar.n5 f23109a;
    public final org.telegram.ui.ActionBar.n5 f23110b;
    public final org.telegram.ui.Components.o6 f23111c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final ak0 e;
    public Switch f23112f;
    public final ImageView h;
    public int f23113n;
    public boolean f23114r;
    public int f23115s;
    public int v;
    public int f23116w;
    public boolean f23117x;
    public boolean f23118y;

    public r8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00();
        o00Var.f40046f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lj, false);
        o00Var.f40047n = false;
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        if (n5Var.getTag() instanceof Integer) {
            i10 = ((Integer) n5Var.getTag()).intValue();
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        if (i10 != org.telegram.ui.ActionBar.k6.f21290j5 && i10 != org.telegram.ui.ActionBar.k6.G6) {
            w02 = e(w02);
        }
        if (this.M) {
            n5Var.setTextColor(w02);
        }
        if (this.N) {
            ak0 ak0Var = this.e;
            if (ak0Var.getTag() instanceof Integer) {
                int intValue = ((Integer) ak0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.k6.w0(intValue, g6Var);
                if (intValue != org.telegram.ui.ActionBar.k6.J5 && intValue != org.telegram.ui.ActionBar.k6.f21347m6) {
                    w03 = e(w03);
                }
                if (w03 != this.O || ak0Var.getColorFilter() != this.P) {
                    this.O = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.P = porterDuffColorFilter;
                    ak0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.f23110b.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, g6Var)));
        int i11 = org.telegram.ui.ActionBar.k6.I6;
        this.f23111c.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
    }

    public final int c(boolean z10) {
        if (this.R) {
            if (z10) {
                return 52;
            }
            return 58;
        } else if (z10) {
            return 65;
        } else {
            return 71;
        }
    }

    public final boolean d() {
        Switch r02 = this.f23112f;
        if (r02 != null && r02.h) {
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float e;
        float f7;
        float e7;
        float f10 = 1.0f;
        if (this.H || this.J != 0.0f) {
            if (this.S == null) {
                Paint paint = new Paint(1);
                this.S = paint;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.E));
            }
            if (this.T) {
                float f11 = this.I + 0.016f;
                this.I = f11;
                if (f11 > 1.0f) {
                    this.I = 1.0f;
                    this.T = false;
                }
            } else {
                float f12 = this.I - 0.016f;
                this.I = f12;
                if (f12 < 0.0f) {
                    this.I = 0.0f;
                    this.T = true;
                }
            }
            int i10 = this.U;
            if (i10 > 0) {
                this.U = i10 - 15;
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
            this.S.setAlpha((int) (((this.I * 0.4f) + 0.6f) * this.J * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.G), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.S);
            invalidate();
        }
        float f17 = 1.0f - this.J;
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var == null) {
            e = 1.0f;
        } else {
            e = 1.0f - n5Var.e();
        }
        float f18 = f17 * e;
        if (isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        this.f23111c.setAlpha(f18 * f7);
        float f19 = 1.0f - this.J;
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 == null) {
            e7 = 1.0f;
        } else {
            e7 = 1.0f - n5Var2.e();
        }
        float f20 = f19 * e7;
        if (!isEnabled()) {
            f10 = 0.5f;
        }
        this.d.setAlpha(f20 * f10);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.n5 n5Var3 = this.K;
        if (n5Var3 != null) {
            n5Var3.setBounds((getWidth() - this.K.f28785s) - AndroidUtilities.dp(18.0f), (getHeight() - this.K.f28785s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.K.f28785s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void f(int i10, int i11, int i12) {
        float f7;
        boolean q6;
        this.f23115s = c(true);
        ak0 ak0Var = this.e;
        ak0Var.setVisibility(0);
        ak0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        if (LocaleController.isRTL) {
            f7 = 0.0f;
        } else {
            f7 = -3.0f;
        }
        ak0Var.setTranslationX(AndroidUtilities.dp(f7));
        ak0Var.setImageResource(i12);
        this.N = false;
        ak0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.g6 g6Var = this.E;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        kc0 kc0Var = new kc0(1);
        kc0Var.b(i10, i11);
        kc0Var.f28004b = q6;
        ak0Var.setBackground(kc0Var);
    }

    public final void g(int i10, int i11) {
        org.telegram.ui.ActionBar.g6 g6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.setTextColor(w02);
        n5Var.setTag(Integer.valueOf(i11));
        this.M = true;
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), PorterDuff.Mode.SRC_IN);
            ak0 ak0Var = this.e;
            ak0Var.setColorFilter(porterDuffColorFilter);
            ak0Var.setTag(Integer.valueOf(i10));
            this.N = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f23112f;
    }

    public int getDefaultImageLeft() {
        if (this.R) {
            return 16;
        }
        return 21;
    }

    public ak0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.n5 getTextView() {
        return this.f23109a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.f23111c;
    }

    public final void h(int i10, boolean z10, boolean z11) {
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

    public final void i(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        super.setEnabled(z10);
        Switch r52 = this.f23112f;
        if (r52 != null) {
            r52.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f23109a.animate();
        float f12 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).start();
        ViewPropertyAnimator animate2 = this.f23110b.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate2.alpha(f10).start();
        ViewPropertyAnimator animate3 = this.f23111c.animate();
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

    public final void j(int i10) {
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        if (i10 <= 0) {
            n5Var.i(null);
            return;
        }
        n5Var.i(new to0(i10, getContext(), this.E, false));
        n5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.f23116w = getDefaultImageLeft();
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        o6Var.c(null, false, true);
        this.e.setVisibility(8);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f23114r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.f23116w = getDefaultImageLeft();
        this.f23115s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f23114r = z11;
        Switch r62 = this.f23112f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f23112f.c(z10, false);
        }
        setWillNotDraw(!this.f23114r);
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        this.f23116w = getDefaultImageLeft();
        this.f23115s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(str, false);
        n5Var.i(null);
        this.f23111c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i11, i11, i10);
        if (this.f23112f == null) {
            Switch r11 = new Switch(getContext(), this.E);
            this.f23112f = r11;
            int i13 = org.telegram.ui.ActionBar.k6.M6;
            int i14 = org.telegram.ui.ActionBar.k6.N6;
            int i15 = org.telegram.ui.ActionBar.k6.f21184d6;
            r11.d(i13, i14, i15, i15);
            Switch r112 = this.f23112f;
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(r112, w7.z5.d(37, 20.0f, i12 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r113 = this.f23112f;
        if (r113 != null) {
            r113.setVisibility(0);
            this.f23112f.c(z10, false);
        }
        this.f23114r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void n(int i10, String str, boolean z10) {
        this.f23116w = getDefaultImageLeft();
        this.f23115s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(str, false);
        n5Var.i(null);
        this.f23111c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f23112f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f23112f.c(z10, false);
        }
        ak0 ak0Var = this.e;
        ak0Var.setVisibility(0);
        ak0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        ak0Var.setImageResource(i10);
        this.f23114r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void o(int i10, CharSequence charSequence, boolean z10) {
        this.f23116w = getDefaultImageLeft();
        this.f23115s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        o6Var.c(null, false, true);
        ak0 ak0Var = this.e;
        ak0Var.setImageResource(i10);
        ak0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ak0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f23114r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        int i10;
        float f7;
        if (this.f23114r) {
            org.telegram.ui.ActionBar.g6 g6Var = this.E;
            if (g6Var != null) {
                paint = g6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f21305k0;
            }
            Paint paint2 = paint;
            if (this.e.getVisibility() == 0) {
                if (this.f23117x) {
                    i10 = 72;
                } else {
                    i10 = this.f23115s;
                }
            } else {
                i10 = this.f23113n;
            }
            int dp = AndroidUtilities.dp(i10);
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = dp;
            }
            float f10 = f7;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                dp = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - dp, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        CharSequence text = n5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        if (!isEmpty) {
            CharSequence text2 = o6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f23112f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f23112f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(n5Var.getText());
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
        float f7;
        int measuredWidth5;
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i12 - i10;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        int textHeight = n5Var.getTextHeight();
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        int max = ((i17 - Math.max(textHeight, o6Var.getTextHeight())) / 2) + 1;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(this.f23113n - 6);
        } else {
            measuredWidth = (i18 - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f23113n - 6);
        }
        if (this.f23118y && !LocaleController.isRTL) {
            measuredWidth = (i18 - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f23113n);
        }
        o6Var.layout(measuredWidth, max, o6Var.getMeasuredWidth() + measuredWidth, o6Var.getMeasuredHeight() + max);
        if (LocaleController.isRTL) {
            measuredWidth2 = AndroidUtilities.dp(this.f23113n - 6);
        } else {
            measuredWidth2 = (i18 - n5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f23113n - 6);
        }
        n5Var.layout(measuredWidth2, max, n5Var.getMeasuredWidth() + measuredWidth2, n5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        ak0 ak0Var = this.e;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f23109a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - n5Var2.getMeasuredWidth();
            if (ak0Var.getVisibility() == 0) {
                i16 = this.f23115s;
            } else {
                i16 = this.f23113n;
            }
            dp = measuredWidth6 - AndroidUtilities.dp(i16);
        } else {
            if (ak0Var.getVisibility() == 0) {
                i14 = this.f23115s;
            } else {
                i14 = this.f23113n;
            }
            dp = AndroidUtilities.dp(i14);
        }
        org.telegram.ui.ActionBar.n5 n5Var3 = this.f23110b;
        if (n5Var3.getVisibility() == 0) {
            if (this.v > 50) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            float f10 = i15;
            int dp2 = AndroidUtilities.dp(1.0f) + tl.A(f10, (i17 - n5Var2.getTextHeight()) - n5Var3.getTextHeight(), 2);
            n5Var2.layout(dp, dp2, n5Var2.getMeasuredWidth() + dp, n5Var2.getMeasuredHeight() + dp2);
            int dp3 = AndroidUtilities.dp(f10) + n5Var2.getTextHeight() + dp2;
            n5Var3.layout(dp, dp3, n5Var3.getMeasuredWidth() + dp, n5Var3.getMeasuredHeight() + dp3);
        } else {
            int dp4 = AndroidUtilities.dp(1.0f) + ((i17 - n5Var2.getTextHeight()) / 2);
            n5Var2.layout(dp, dp4, n5Var2.getMeasuredWidth() + dp, n5Var2.getMeasuredHeight() + dp4);
        }
        if (ak0Var.getVisibility() == 0) {
            if (this.v > 50) {
                f7 = 0.0f;
            } else {
                f7 = 2.0f;
            }
            int dp5 = AndroidUtilities.dp(1.0f) + ((((i17 - ak0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(f7)) - ak0Var.getPaddingTop());
            if (!LocaleController.isRTL) {
                measuredWidth5 = AndroidUtilities.dp(this.f23116w);
            } else {
                measuredWidth5 = (i18 - ak0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f23116w);
            }
            ak0Var.layout(measuredWidth5, dp5, ak0Var.getMeasuredWidth() + measuredWidth5, ak0Var.getMeasuredHeight() + dp5);
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
        Switch r92 = this.f23112f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i17 - this.f23112f.getMeasuredHeight()) / 2;
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth3 = (i18 - this.f23112f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
            }
            Switch r10 = this.f23112f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f23112f.getMeasuredHeight() + measuredHeight);
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
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        if (i16 != 0 && i16 != size && (charSequence = this.Q) != null) {
            o6Var.c(TextUtils.ellipsize(charSequence, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z10 = this.f23118y;
        org.telegram.ui.ActionBar.n5 n5Var = this.f23110b;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.d;
        org.telegram.ui.ActionBar.n5 n5Var3 = this.f23109a;
        if (z10) {
            n5Var3.measure(tl.c(this.f23113n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            n5Var.measure(tl.c(this.f23113n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp2 = (size - AndroidUtilities.dp(this.f23113n + 103)) - n5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp2, i14), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp3 = (size - AndroidUtilities.dp(this.f23113n + 103)) - n5Var3.getTextWidth();
            if (LocaleController.isRTL) {
                i15 = Integer.MIN_VALUE;
            } else {
                i15 = 1073741824;
            }
            n5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp3, i15), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            int dp4 = size - AndroidUtilities.dp(this.f23113n);
            if (LocaleController.isRTL) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp4, i12), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int dp5 = size - AndroidUtilities.dp(this.f23113n);
            if (LocaleController.isRTL) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            n5Var2.measure(View.MeasureSpec.makeMeasureSpec(dp5, i13), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int max = Math.max(o6Var.d(), n5Var2.getTextWidth());
            n5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.f23113n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            n5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f23113n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ak0 ak0Var = this.e;
        if (ak0Var.getVisibility() == 0) {
            ak0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        Switch r02 = this.f23112f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, dp + (this.f23114r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f23115s = c(false);
        this.f23116w = 18;
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        o6Var.c(null, false, true);
        ak0 ak0Var = this.e;
        ak0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof xj0) {
            ak0Var.setAnimation((xj0) drawable);
        } else {
            ak0Var.setImageDrawable(drawable);
        }
        ak0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.h.setVisibility(8);
        ak0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f23114r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f23116w = getDefaultImageLeft();
        this.f23115s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f23114r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f23112f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence ellipsize;
        this.f23116w = getDefaultImageLeft();
        this.f23115s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(str, false);
        n5Var.i(null);
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.Q = str2;
            ellipsize = TextUtils.ellipsize(str2, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i11, i12, i10);
        this.h.setVisibility(8);
        this.f23114r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f23112f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        u(charSequence, charSequence2, false, i10, z10);
    }

    public void setChecked(boolean z10) {
        this.f23112f.c(z10, true);
    }

    public void setCompactLayout(boolean z10) {
        this.R = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        i(z10, true);
    }

    public void setImageLeft(int i10) {
        this.f23116w = i10;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f23114r != z10) {
            this.f23114r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.f23115s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.f23118y != z10) {
            this.f23118y = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23110b;
        if (!isEmpty) {
            n5Var.setVisibility(0);
            n5Var.l(charSequence, false);
            return;
        }
        n5Var.setVisibility(8);
    }

    public void setTextColor(int i10) {
        this.M = false;
        this.f23109a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(30.0f), this);
            this.K = n5Var;
            if (this.F) {
                n5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f23115s = c(false);
        this.f23116w = 18;
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        o6Var.c(charSequence2, false, true);
        ak0 ak0Var = this.e;
        ak0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof xj0) {
            ak0Var.setAnimation((xj0) drawable);
        } else {
            ak0Var.setImageDrawable(drawable);
        }
        ak0Var.setVisibility(0);
        o6Var.setVisibility(0);
        this.h.setVisibility(8);
        ak0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f23114r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.f23116w = getDefaultImageLeft();
        this.f23115s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        ak0 ak0Var = this.e;
        ak0Var.setVisibility(0);
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        if (charSequence2 != null) {
            float g10 = ei.x3.g(charSequence, n5Var.getTextPaint());
            this.Q = charSequence2;
            o6Var.c(TextUtils.ellipsize(charSequence2, o6Var.getPaint(), (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((g10 + AndroidUtilities.dp(this.f23115s)) + AndroidUtilities.dp(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            o6Var.c("", z10, true);
        }
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ak0Var.setTranslationX(0.0f);
        ak0Var.setTranslationY(0.0f);
        ak0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        ak0Var.setImageResource(i10);
        this.f23114r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f23112f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.E;
        if (!this.M && !this.N) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, g6Var);
                int e = e(w02);
                int e7 = e(w03);
                if (e == w02 && e7 == w03) {
                    return;
                }
                this.f23110b.setTextColor(e);
                this.f23111c.setTextColor(e7);
                this.d.setTextColor(e7);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        try {
            a();
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f23116w = getDefaultImageLeft();
        this.f23115s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f23109a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        o6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        ak0 ak0Var = this.e;
        ak0Var.setVisibility(8);
        ak0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f23114r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f23112f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        if (n5Var2 != null) {
            n5Var2.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.o6 o6Var = this.f23111c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.Q = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
    }

    public r8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(20, context, g6Var, false, false);
    }

    public r8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public r8(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context);
        this.f23115s = 71;
        this.v = 50;
        this.f23116w = 21;
        this.E = g6Var;
        this.f23113n = i10;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f23109a = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, z10 ? org.telegram.ui.ActionBar.k6.f21290j5 : org.telegram.ui.ActionBar.k6.G6, g6Var);
        n5Var.setTextSize(16);
        n5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        n5Var.setImportantForAccessibility(2);
        addView(n5Var, w7.z5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f23110b = n5Var2;
        org.telegram.ui.ActionBar.r6.Z(n5Var2, z10 ? org.telegram.ui.ActionBar.k6.p5 : org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
        n5Var2.setTextSize(13);
        n5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        n5Var2.setImportantForAccessibility(2);
        addView(n5Var2, w7.z5.c(-1.0f, -2));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f23111c = o6Var;
        org.telegram.ui.ActionBar.r6.a0(o6Var, z10 ? org.telegram.ui.ActionBar.k6.f21366n5 : org.telegram.ui.ActionBar.k6.I6, g6Var);
        o6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        o6Var.setImportantForAccessibility(2);
        o6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(o6Var);
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var3;
        Boolean bool = Boolean.FALSE;
        if (!n5Var3.P) {
            n5Var3.f21693n0 = true;
            n5Var3.f21695p0 = bool;
            n5Var3.m();
            n5Var3.b();
        }
        n5Var3.f21696q0 = 18;
        n5Var3.m();
        org.telegram.ui.ActionBar.r6.Z(n5Var3, z10 ? org.telegram.ui.ActionBar.k6.f21366n5 : org.telegram.ui.ActionBar.k6.I6, g6Var);
        n5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        n5Var3.setTextSize(16);
        n5Var3.setImportantForAccessibility(2);
        n5Var3.setVisibility(8);
        addView(n5Var3);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView, z10 ? org.telegram.ui.ActionBar.k6.J5 : org.telegram.ui.ActionBar.k6.f21347m6, g6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r32 = new Switch(context, g6Var);
            this.f23112f = r32;
            int i11 = org.telegram.ui.ActionBar.k6.M6;
            int i12 = org.telegram.ui.ActionBar.k6.N6;
            int i13 = org.telegram.ui.ActionBar.k6.f21184d6;
            r32.d(i11, i12, i13, i13);
            addView(this.f23112f, w7.z5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(30.0f), this);
            this.K = n5Var;
            if (this.F) {
                n5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new q8(imageReceiver, 0));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.K.g(new ei.w3(imageReceiver, 4), true);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i10) {
        return i10;
    }
}
