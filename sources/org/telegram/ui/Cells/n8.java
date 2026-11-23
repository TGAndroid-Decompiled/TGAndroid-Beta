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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.iz;
public class n8 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int W = 0;
    public boolean E;
    public final org.telegram.ui.ActionBar.h6 F;
    public boolean G;
    public int H;
    public boolean I;
    public float J;
    public float K;
    public org.telegram.ui.Components.n5 L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public PorterDuffColorFilter Q;
    public CharSequence R;
    public boolean S;
    public Paint T;
    public boolean U;
    public int V;
    public final org.telegram.ui.ActionBar.m5 f31165a;
    public final org.telegram.ui.ActionBar.m5 f31166b;
    public final org.telegram.ui.Components.o6 f31167c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final rh0 f31168e;
    public Switch f31169f;
    public final ImageView h;
    public int f31170n;
    public boolean f31171r;
    public int f31172s;
    public int f31173w;
    public int f31174x;
    public boolean f31175y;

    public n8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        iz izVar = new iz();
        izVar.f48847f = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ck, false);
        izVar.f48848n = false;
        spannableStringBuilder.setSpan(izVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        if (m5Var.getTag() instanceof Integer) {
            i7 = ((Integer) m5Var.getTag()).intValue();
        } else {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        if (i7 != org.telegram.ui.ActionBar.m6.f29489j5 && i7 != org.telegram.ui.ActionBar.m6.G6) {
            w02 = e(w02);
        }
        if (this.N) {
            m5Var.setTextColor(w02);
        }
        if (this.O) {
            rh0 rh0Var = this.f31168e;
            if (rh0Var.getTag() instanceof Integer) {
                int intValue = ((Integer) rh0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.m6.w0(intValue, h6Var);
                if (intValue != org.telegram.ui.ActionBar.m6.J5 && intValue != org.telegram.ui.ActionBar.m6.f29546m6) {
                    w03 = e(w03);
                }
                if (w03 != this.P || rh0Var.getColorFilter() != this.Q) {
                    this.P = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.Q = porterDuffColorFilter;
                    rh0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.f31166b.setTextColor(e(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29773y6, h6Var)));
        int i10 = org.telegram.ui.ActionBar.m6.I6;
        this.f31167c.setTextColor(e(org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
    }

    public final int c(boolean z10) {
        if (this.S) {
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
        Switch r02 = this.f31169f;
        if (r02 != null && r02.h) {
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float e10;
        float f10;
        float e11;
        float f11 = 1.0f;
        if (this.I || this.K != 0.0f) {
            if (this.T == null) {
                Paint paint = new Paint(1);
                this.T = paint;
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, this.F));
            }
            if (this.U) {
                float f12 = this.J + 0.016f;
                this.J = f12;
                if (f12 > 1.0f) {
                    this.J = 1.0f;
                    this.U = false;
                }
            } else {
                float f13 = this.J - 0.016f;
                this.J = f13;
                if (f13 < 0.0f) {
                    this.J = 0.0f;
                    this.U = true;
                }
            }
            int i7 = this.V;
            if (i7 > 0) {
                this.V = i7 - 15;
            } else {
                boolean z10 = this.I;
                if (z10) {
                    float f14 = this.K;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.K = f15;
                        if (f15 > 1.0f) {
                            this.K = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f16 = this.K;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.K = f17;
                        if (f17 < 0.0f) {
                            this.K = 0.0f;
                        }
                    }
                }
            }
            this.T.setAlpha((int) (((this.J * 0.4f) + 0.6f) * this.K * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f)) - org.telegram.messenger.g0.L(this.H), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (hd.f24444a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.T);
            invalidate();
        }
        float f18 = 1.0f - this.K;
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var == null) {
            e10 = 1.0f;
        } else {
            e10 = 1.0f - n5Var.e();
        }
        float f19 = f18 * e10;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f31167c.setAlpha(f19 * f10);
        float f20 = 1.0f - this.K;
        org.telegram.ui.Components.n5 n5Var2 = this.L;
        if (n5Var2 == null) {
            e11 = 1.0f;
        } else {
            e11 = 1.0f - n5Var2.e();
        }
        float f21 = f20 * e11;
        if (!isEnabled()) {
            f11 = 0.5f;
        }
        this.d.setAlpha(f21 * f11);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.n5 n5Var3 = this.L;
        if (n5Var3 != null) {
            n5Var3.setBounds((getWidth() - this.L.f37780s) - org.telegram.messenger.g0.L(18.0f), (getHeight() - this.L.f37780s) / 2, getWidth() - org.telegram.messenger.g0.L(18.0f), (getHeight() + this.L.f37780s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i7, int i10, int i11) {
        float f10;
        boolean q10;
        this.f31172s = c(true);
        rh0 rh0Var = this.f31168e;
        rh0Var.setVisibility(0);
        rh0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        if (hd.f24444a0) {
            f10 = 0.0f;
        } else {
            f10 = -3.0f;
        }
        rh0Var.setTranslationX(org.telegram.messenger.g0.L(f10));
        rh0Var.setImageResource(i11);
        this.O = false;
        rh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.h6 h6Var = this.F;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        ra0 ra0Var = new ra0(1);
        ra0Var.b(i7, i10);
        ra0Var.f39137b = q10;
        rh0Var.setBackground(ra0Var);
    }

    public final void g(int i7, int i10) {
        org.telegram.ui.ActionBar.h6 h6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.setTextColor(w02);
        m5Var.setTag(Integer.valueOf(i10));
        this.N = true;
        if (i7 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), PorterDuff.Mode.SRC_IN);
            rh0 rh0Var = this.f31168e;
            rh0Var.setColorFilter(porterDuffColorFilter);
            rh0Var.setTag(Integer.valueOf(i7));
            this.O = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f31169f;
    }

    public int getDefaultImageLeft() {
        if (this.S) {
            return 16;
        }
        return 21;
    }

    public rh0 getImageView() {
        return this.f31168e;
    }

    public org.telegram.ui.ActionBar.m5 getTextView() {
        return this.f31165a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.f31167c;
    }

    public final void h(int i7, boolean z10, boolean z11) {
        float f10;
        this.I = z10;
        this.H = i7;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.K = f10;
        }
        invalidate();
    }

    public final void i(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        super.setEnabled(z10);
        Switch r52 = this.f31169f;
        if (r52 != null) {
            r52.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f31165a.animate();
        float f13 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
        ViewPropertyAnimator animate2 = this.f31166b.animate();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        animate2.alpha(f11).start();
        ViewPropertyAnimator animate3 = this.f31167c.animate();
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

    public final void j(int i7) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        if (i7 <= 0) {
            m5Var.i(null);
            return;
        }
        m5Var.i(new org.telegram.ui.ActionBar.v2(i7, getContext(), this.F, false));
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.f31174x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        o6Var.c(null, false, true);
        this.f31168e.setVisibility(8);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f31171r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.f31174x = getDefaultImageLeft();
        this.f31172s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.f31168e.setVisibility(8);
        this.h.setVisibility(8);
        this.f31171r = z11;
        Switch r62 = this.f31169f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f31169f.c(z10, false);
        }
        setWillNotDraw(!this.f31171r);
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i7, int i10, boolean z11) {
        int i11;
        this.f31174x = getDefaultImageLeft();
        this.f31172s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(str, false);
        m5Var.i(null);
        this.f31167c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i10, i10, i7);
        if (this.f31169f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f31169f = r11;
            int i12 = org.telegram.ui.ActionBar.m6.M6;
            int i13 = org.telegram.ui.ActionBar.m6.N6;
            int i14 = org.telegram.ui.ActionBar.m6.f29381d6;
            r11.d(i12, i13, i14, i14);
            Switch r112 = this.f31169f;
            if (hd.f24444a0) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(r112, c8.ma.d(37, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r113 = this.f31169f;
        if (r113 != null) {
            r113.setVisibility(0);
            this.f31169f.c(z10, false);
        }
        this.f31171r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void n(int i7, String str, boolean z10) {
        this.f31174x = getDefaultImageLeft();
        this.f31172s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(str, false);
        m5Var.i(null);
        this.f31167c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f31169f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f31169f.c(z10, false);
        }
        rh0 rh0Var = this.f31168e;
        rh0Var.setVisibility(0);
        rh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        rh0Var.setImageResource(i7);
        this.f31171r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void o(int i7, CharSequence charSequence, boolean z10) {
        this.f31174x = getDefaultImageLeft();
        this.f31172s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        o6Var.c(null, false, true);
        rh0 rh0Var = this.f31168e;
        rh0Var.setImageResource(i7);
        rh0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        rh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f31171r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        int i7;
        float f10;
        if (this.f31171r) {
            org.telegram.ui.ActionBar.h6 h6Var = this.F;
            if (h6Var != null) {
                paint = h6Var.g("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.m6.f29504k0;
            }
            Paint paint2 = paint;
            if (this.f31168e.getVisibility() == 0) {
                if (this.f31175y) {
                    i7 = 72;
                } else {
                    i7 = this.f31172s;
                }
            } else {
                i7 = this.f31170n;
            }
            int L = org.telegram.messenger.g0.L(i7);
            if (hd.f24444a0) {
                f10 = 0.0f;
            } else {
                f10 = L;
            }
            float f11 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!hd.f24444a0) {
                L = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        CharSequence text = m5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        if (!isEmpty) {
            CharSequence text2 = o6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f31169f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f31169f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m5Var.getText());
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth;
        int measuredWidth2;
        int i13;
        int L;
        int measuredWidth3;
        int measuredWidth4;
        float f10;
        int measuredWidth5;
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i11 - i7;
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        int textHeight = m5Var.getTextHeight();
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        int max = ((i16 - Math.max(textHeight, o6Var.getTextHeight())) / 2) + 1;
        if (hd.f24444a0) {
            measuredWidth = org.telegram.messenger.g0.L(this.f31170n - 6);
        } else {
            measuredWidth = (i17 - o6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f31170n - 6);
        }
        if (this.E && !hd.f24444a0) {
            measuredWidth = (i17 - o6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f31170n);
        }
        o6Var.layout(measuredWidth, max, o6Var.getMeasuredWidth() + measuredWidth, o6Var.getMeasuredHeight() + max);
        if (hd.f24444a0) {
            measuredWidth2 = org.telegram.messenger.g0.L(this.f31170n - 6);
        } else {
            measuredWidth2 = (i17 - m5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f31170n - 6);
        }
        m5Var.layout(measuredWidth2, max, m5Var.getMeasuredWidth() + measuredWidth2, m5Var.getMeasuredHeight() + max);
        boolean z11 = hd.f24444a0;
        rh0 rh0Var = this.f31168e;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f31165a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - m5Var2.getMeasuredWidth();
            if (rh0Var.getVisibility() == 0) {
                i15 = this.f31172s;
            } else {
                i15 = this.f31170n;
            }
            L = measuredWidth6 - org.telegram.messenger.g0.L(i15);
        } else {
            if (rh0Var.getVisibility() == 0) {
                i13 = this.f31172s;
            } else {
                i13 = this.f31170n;
            }
            L = org.telegram.messenger.g0.L(i13);
        }
        org.telegram.ui.ActionBar.m5 m5Var3 = this.f31166b;
        if (m5Var3.getVisibility() == 0) {
            if (this.f31173w > 50) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            float f11 = i14;
            int L2 = org.telegram.messenger.g0.L(1.0f) + o10.z(f11, (i16 - m5Var2.getTextHeight()) - m5Var3.getTextHeight(), 2);
            m5Var2.layout(L, L2, m5Var2.getMeasuredWidth() + L, m5Var2.getMeasuredHeight() + L2);
            int L3 = org.telegram.messenger.g0.L(f11) + m5Var2.getTextHeight() + L2;
            m5Var3.layout(L, L3, m5Var3.getMeasuredWidth() + L, m5Var3.getMeasuredHeight() + L3);
        } else {
            int L4 = org.telegram.messenger.g0.L(1.0f) + ((i16 - m5Var2.getTextHeight()) / 2);
            m5Var2.layout(L, L4, m5Var2.getMeasuredWidth() + L, m5Var2.getMeasuredHeight() + L4);
        }
        if (rh0Var.getVisibility() == 0) {
            if (this.f31173w > 50) {
                f10 = 0.0f;
            } else {
                f10 = 2.0f;
            }
            int L5 = org.telegram.messenger.g0.L(1.0f) + ((((i16 - rh0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.L(f10)) - rh0Var.getPaddingTop());
            if (!hd.f24444a0) {
                measuredWidth5 = org.telegram.messenger.g0.L(this.f31174x);
            } else {
                measuredWidth5 = (i17 - rh0Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f31174x);
            }
            rh0Var.layout(measuredWidth5, L5, rh0Var.getMeasuredWidth() + measuredWidth5, rh0Var.getMeasuredHeight() + L5);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L6 = org.telegram.messenger.g0.L(1.0f) + ((i16 - imageView.getMeasuredHeight()) / 2);
            if (hd.f24444a0) {
                measuredWidth4 = org.telegram.messenger.g0.L(23.0f);
            } else {
                measuredWidth4 = (i17 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            }
            imageView.layout(measuredWidth4, L6, imageView.getMeasuredWidth() + measuredWidth4, imageView.getMeasuredHeight() + L6);
        }
        Switch r92 = this.f31169f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i16 - this.f31169f.getMeasuredHeight()) / 2;
            if (hd.f24444a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(22.0f);
            } else {
                measuredWidth3 = (i17 - this.f31169f.getMeasuredWidth()) - org.telegram.messenger.g0.L(22.0f);
            }
            Switch r10 = this.f31169f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f31169f.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(this.f31173w);
        int i15 = this.M;
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        if (i15 != 0 && i15 != size && (charSequence = this.R) != null) {
            o6Var.c(TextUtils.ellipsize(charSequence, o6Var.getPaint(), org.telegram.messenger.g0.f24046q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.m5 m5Var = this.f31166b;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.d;
        org.telegram.ui.ActionBar.m5 m5Var3 = this.f31165a;
        if (z10) {
            m5Var3.measure(o10.c(this.f31170n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            m5Var.measure(o10.c(this.f31170n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L2 = (size - org.telegram.messenger.g0.L(this.f31170n + 103)) - m5Var3.getTextWidth();
            if (hd.f24444a0) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(L2, i13), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L3 = (size - org.telegram.messenger.g0.L(this.f31170n + 103)) - m5Var3.getTextWidth();
            if (hd.f24444a0) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            m5Var2.measure(View.MeasureSpec.makeMeasureSpec(L3, i14), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        } else {
            int L4 = size - org.telegram.messenger.g0.L(this.f31170n);
            if (hd.f24444a0) {
                i11 = Integer.MIN_VALUE;
            } else {
                i11 = 1073741824;
            }
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(L4, i11), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L5 = size - org.telegram.messenger.g0.L(this.f31170n);
            if (hd.f24444a0) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            m5Var2.measure(View.MeasureSpec.makeMeasureSpec(L5, i12), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int max = Math.max(o6Var.d(), m5Var2.getTextWidth());
            m5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.g0.L(this.f31170n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            m5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.f31170n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        rh0 rh0Var = this.f31168e;
        if (rh0Var.getVisibility() == 0) {
            rh0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        Switch r02 = this.f31169f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, L + (this.f31171r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f31172s = c(false);
        this.f31174x = 18;
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        o6Var.c(null, false, true);
        rh0 rh0Var = this.f31168e;
        rh0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof oh0) {
            rh0Var.setAnimation((oh0) drawable);
        } else {
            rh0Var.setImageDrawable(drawable);
        }
        rh0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.h.setVisibility(8);
        rh0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.f31171r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f31174x = getDefaultImageLeft();
        this.f31172s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, o6Var.getPaint(), org.telegram.messenger.g0.f24046q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.f31168e.setVisibility(8);
        this.h.setVisibility(8);
        this.f31171r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f31169f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i7, int i10, int i11, boolean z11) {
        CharSequence ellipsize;
        this.f31174x = getDefaultImageLeft();
        this.f31172s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(str, false);
        m5Var.i(null);
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.R = str2;
            ellipsize = TextUtils.ellipsize(str2, o6Var.getPaint(), org.telegram.messenger.g0.f24046q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i10, i11, i7);
        this.h.setVisibility(8);
        this.f31171r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f31169f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i7, boolean z10) {
        u(charSequence, charSequence2, false, i7, z10);
    }

    public void setChecked(boolean z10) {
        this.f31169f.c(z10, true);
    }

    public void setCompactLayout(boolean z10) {
        this.S = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        i(z10, true);
    }

    public void setImageLeft(int i7) {
        this.f31174x = i7;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f31171r != z10) {
            this.f31171r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i7) {
        this.f31172s = i7;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31166b;
        if (!isEmpty) {
            m5Var.setVisibility(0);
            m5Var.l(charSequence, false);
            return;
        }
        m5Var.setVisibility(8);
    }

    public void setTextColor(int i7) {
        this.N = false;
        this.f31165a.setTextColor(i7);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.L == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(30.0f), this);
            this.L = n5Var;
            if (this.G) {
                n5Var.a();
            }
        }
        this.L.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f31172s = c(false);
        this.f31174x = 18;
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        o6Var.c(charSequence2, false, true);
        rh0 rh0Var = this.f31168e;
        rh0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof oh0) {
            rh0Var.setAnimation((oh0) drawable);
        } else {
            rh0Var.setImageDrawable(drawable);
        }
        rh0Var.setVisibility(0);
        o6Var.setVisibility(0);
        this.h.setVisibility(8);
        rh0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.f31171r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i7, boolean z11) {
        this.f31174x = getDefaultImageLeft();
        this.f31172s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        rh0 rh0Var = this.f31168e;
        rh0Var.setVisibility(0);
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        if (charSequence2 != null) {
            float h = hi.l3.h(charSequence, m5Var.getTextPaint());
            this.R = charSequence2;
            o6Var.c(TextUtils.ellipsize(charSequence2, o6Var.getPaint(), (int) Math.max(1.0f, org.telegram.messenger.g0.f24046q.x - ((h + org.telegram.messenger.g0.L(this.f31172s)) + org.telegram.messenger.g0.L(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            o6Var.c("", z10, true);
        }
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        rh0Var.setTranslationX(0.0f);
        rh0Var.setTranslationY(0.0f);
        rh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        rh0Var.setImageResource(i7);
        this.f31171r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f31169f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.F;
        if (!this.N && !this.O) {
            try {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I6, h6Var);
                int e10 = e(w02);
                int e11 = e(w03);
                if (e10 == w02 && e11 == w03) {
                    return;
                }
                this.f31166b.setTextColor(e10);
                this.f31167c.setTextColor(e11);
                this.d.setTextColor(e11);
                return;
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
                return;
            }
        }
        try {
            a();
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f31174x = getDefaultImageLeft();
        this.f31172s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31165a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        o6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        rh0 rh0Var = this.f31168e;
        rh0Var.setVisibility(8);
        rh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f31171r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f31169f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.L;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.o6 o6Var = this.f31167c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, o6Var.getPaint(), org.telegram.messenger.g0.f24046q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
    }

    public n8(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(20, context, h6Var, false, false);
    }

    public n8(int i7, Context context, boolean z10) {
        this(i7, context, null, z10, false);
    }

    public n8(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        this.f31172s = 71;
        this.f31173w = 50;
        this.f31174x = 21;
        this.F = h6Var;
        this.f31170n = i7;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f31165a = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, z10 ? org.telegram.ui.ActionBar.m6.f29489j5 : org.telegram.ui.ActionBar.m6.G6, h6Var);
        m5Var.setTextSize(16);
        m5Var.setGravity(hd.f24444a0 ? 5 : 3);
        m5Var.setImportantForAccessibility(2);
        addView(m5Var, c8.ma.c(-1.0f, -2));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f31166b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, z10 ? org.telegram.ui.ActionBar.m6.f29600p5 : org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
        m5Var2.setTextSize(13);
        m5Var2.setGravity(hd.f24444a0 ? 5 : 3);
        m5Var2.setImportantForAccessibility(2);
        addView(m5Var2, c8.ma.c(-1.0f, -2));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f31167c = o6Var;
        org.telegram.ui.ActionBar.t6.Y(o6Var, z10 ? org.telegram.ui.ActionBar.m6.f29562n5 : org.telegram.ui.ActionBar.m6.I6, h6Var);
        o6Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        o6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        o6Var.setGravity(hd.f24444a0 ? 3 : 5);
        o6Var.setImportantForAccessibility(2);
        o6Var.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        addView(o6Var);
        org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var3;
        Boolean bool = Boolean.FALSE;
        if (!m5Var3.Q) {
            m5Var3.f29299o0 = true;
            m5Var3.f29301q0 = bool;
            m5Var3.m();
            m5Var3.b();
        }
        m5Var3.f29303r0 = 18;
        m5Var3.m();
        org.telegram.ui.ActionBar.t6.X(m5Var3, z10 ? org.telegram.ui.ActionBar.m6.f29562n5 : org.telegram.ui.ActionBar.m6.I6, h6Var);
        m5Var3.setGravity(hd.f24444a0 ? 3 : 5);
        m5Var3.setTextSize(16);
        m5Var3.setImportantForAccessibility(2);
        m5Var3.setVisibility(8);
        addView(m5Var3);
        ?? imageView = new ImageView(context);
        this.f31168e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView, z10 ? org.telegram.ui.ActionBar.m6.J5 : org.telegram.ui.ActionBar.m6.f29546m6, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r32 = new Switch(context, h6Var);
            this.f31169f = r32;
            int i10 = org.telegram.ui.ActionBar.m6.M6;
            int i11 = org.telegram.ui.ActionBar.m6.N6;
            int i12 = org.telegram.ui.ActionBar.m6.f29381d6;
            r32.d(i10, i11, i12, i12);
            addView(this.f31169f, c8.ma.d(37, 20.0f, (hd.f24444a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.L == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(30.0f), this);
            this.L = n5Var;
            if (this.G) {
                n5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.P();
        }
        addOnAttachStateChangeListener(new m8(imageReceiver, 0));
        imageReceiver.o0(str, "30_30", null, null, 0L);
        this.L.g(new hi.k3(imageReceiver, 6), true);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i7) {
        return i7;
    }
}
