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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.cz;
public class l8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int W = 0;
    public boolean E;
    public final org.telegram.ui.ActionBar.e6 F;
    public boolean G;
    public int H;
    public boolean I;
    public float J;
    public float K;
    public org.telegram.ui.Components.e5 L;
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
    public final org.telegram.ui.ActionBar.k5 f29592a;
    public final org.telegram.ui.ActionBar.k5 f29593b;
    public final org.telegram.ui.Components.h6 f29594c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final fh0 f29595e;
    public Switch f29596f;
    public final ImageView h;
    public int f29597n;
    public boolean f29598r;
    public int f29599s;
    public int f29600w;
    public int f29601x;
    public boolean f29602y;

    public l8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        cz czVar = new cz();
        czVar.f44492f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false);
        czVar.f44493n = false;
        spannableStringBuilder.setSpan(czVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        int i3;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        if (k5Var.getTag() instanceof Integer) {
            i3 = ((Integer) k5Var.getTag()).intValue();
        } else {
            i3 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        if (i3 != org.telegram.ui.ActionBar.k6.f27988j5 && i3 != org.telegram.ui.ActionBar.k6.G6) {
            w02 = e(w02);
        }
        if (this.N) {
            k5Var.setTextColor(w02);
        }
        if (this.O) {
            fh0 fh0Var = this.f29595e;
            if (fh0Var.getTag() instanceof Integer) {
                int intValue = ((Integer) fh0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.k6.w0(intValue, e6Var);
                if (intValue != org.telegram.ui.ActionBar.k6.J5 && intValue != org.telegram.ui.ActionBar.k6.f28043m6) {
                    w03 = e(w03);
                }
                if (w03 != this.P || fh0Var.getColorFilter() != this.Q) {
                    this.P = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.Q = porterDuffColorFilter;
                    fh0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.f29593b.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var)));
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        this.f29594c.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
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
        Switch r02 = this.f29596f;
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
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.F));
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
            int i3 = this.V;
            if (i3 > 0) {
                this.V = i3 - 15;
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
            if (bd.f21784a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.T);
            invalidate();
        }
        float f18 = 1.0f - this.K;
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var == null) {
            e10 = 1.0f;
        } else {
            e10 = 1.0f - e5Var.e();
        }
        float f19 = f18 * e10;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f29594c.setAlpha(f19 * f10);
        float f20 = 1.0f - this.K;
        org.telegram.ui.Components.e5 e5Var2 = this.L;
        if (e5Var2 == null) {
            e11 = 1.0f;
        } else {
            e11 = 1.0f - e5Var2.e();
        }
        float f21 = f20 * e11;
        if (!isEnabled()) {
            f11 = 0.5f;
        }
        this.d.setAlpha(f21 * f11);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.e5 e5Var3 = this.L;
        if (e5Var3 != null) {
            e5Var3.setBounds((getWidth() - this.L.f33289s) - org.telegram.messenger.g0.L(18.0f), (getHeight() - this.L.f33289s) / 2, getWidth() - org.telegram.messenger.g0.L(18.0f), (getHeight() + this.L.f33289s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i3, int i10, int i11) {
        float f10;
        boolean q10;
        this.f29599s = c(true);
        fh0 fh0Var = this.f29595e;
        fh0Var.setVisibility(0);
        fh0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        if (bd.f21784a0) {
            f10 = 0.0f;
        } else {
            f10 = -3.0f;
        }
        fh0Var.setTranslationX(org.telegram.messenger.g0.L(f10));
        fh0Var.setImageResource(i11);
        this.O = false;
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        y90 y90Var = new y90(1);
        y90Var.b(i3, i10);
        y90Var.f40668b = q10;
        fh0Var.setBackground(y90Var);
    }

    public final void g(int i3, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.setTextColor(w02);
        k5Var.setTag(Integer.valueOf(i10));
        this.N = true;
        if (i3 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), PorterDuff.Mode.SRC_IN);
            fh0 fh0Var = this.f29595e;
            fh0Var.setColorFilter(porterDuffColorFilter);
            fh0Var.setTag(Integer.valueOf(i3));
            this.O = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f29596f;
    }

    public int getDefaultImageLeft() {
        if (this.S) {
            return 16;
        }
        return 21;
    }

    public fh0 getImageView() {
        return this.f29595e;
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.f29592a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.h6 getValueTextView() {
        return this.f29594c;
    }

    public final void h(int i3, boolean z10, boolean z11) {
        float f10;
        this.I = z10;
        this.H = i3;
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
        Switch r5 = this.f29596f;
        if (r5 != null) {
            r5.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f29592a.animate();
        float f13 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
        ViewPropertyAnimator animate2 = this.f29593b.animate();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        animate2.alpha(f11).start();
        ViewPropertyAnimator animate3 = this.f29594c.animate();
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

    public final void j(int i3) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        if (i3 <= 0) {
            k5Var.i(null);
            return;
        }
        k5Var.i(new org.telegram.ui.ActionBar.s2(i3, getContext(), this.F, false));
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.f29601x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        h6Var.c(null, false, true);
        this.f29595e.setVisibility(8);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f29598r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.f29601x = getDefaultImageLeft();
        this.f29599s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.f29595e.setVisibility(8);
        this.h.setVisibility(8);
        this.f29598r = z11;
        Switch r62 = this.f29596f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f29596f.c(z10, false);
        }
        setWillNotDraw(!this.f29598r);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i3, int i10, boolean z11) {
        int i11;
        this.f29601x = getDefaultImageLeft();
        this.f29599s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.f29594c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i10, i10, i3);
        if (this.f29596f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f29596f = r11;
            int i12 = org.telegram.ui.ActionBar.k6.M6;
            int i13 = org.telegram.ui.ActionBar.k6.N6;
            int i14 = org.telegram.ui.ActionBar.k6.f27878d6;
            r11.d(i12, i13, i14, i14);
            Switch r112 = this.f29596f;
            if (bd.f21784a0) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(r112, mf.d(37, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r113 = this.f29596f;
        if (r113 != null) {
            r113.setVisibility(0);
            this.f29596f.c(z10, false);
        }
        this.f29598r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void n(int i3, String str, boolean z10) {
        this.f29601x = getDefaultImageLeft();
        this.f29599s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.f29594c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f29596f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f29596f.c(z10, false);
        }
        fh0 fh0Var = this.f29595e;
        fh0Var.setVisibility(0);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        fh0Var.setImageResource(i3);
        this.f29598r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void o(int i3, CharSequence charSequence, boolean z10) {
        this.f29601x = getDefaultImageLeft();
        this.f29599s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        h6Var.c(null, false, true);
        fh0 fh0Var = this.f29595e;
        fh0Var.setImageResource(i3);
        fh0Var.setVisibility(0);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f29598r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        int i3;
        float f10;
        if (this.f29598r) {
            org.telegram.ui.ActionBar.e6 e6Var = this.F;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint2 = paint;
            if (this.f29595e.getVisibility() == 0) {
                if (this.f29602y) {
                    i3 = 72;
                } else {
                    i3 = this.f29599s;
                }
            } else {
                i3 = this.f29597n;
            }
            int L = org.telegram.messenger.g0.L(i3);
            if (bd.f21784a0) {
                f10 = 0.0f;
            } else {
                f10 = L;
            }
            float f11 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!bd.f21784a0) {
                L = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        CharSequence text = k5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        if (!isEmpty) {
            CharSequence text2 = h6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f29596f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f29596f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k5Var.getText());
            if (!TextUtils.isEmpty(h6Var.getText())) {
                sb2.append('\n');
                sb2.append(h6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
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
        int i17 = i11 - i3;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        int textHeight = k5Var.getTextHeight();
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        int max = ((i16 - Math.max(textHeight, h6Var.getTextHeight())) / 2) + 1;
        if (bd.f21784a0) {
            measuredWidth = org.telegram.messenger.g0.L(this.f29597n - 6);
        } else {
            measuredWidth = (i17 - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f29597n - 6);
        }
        if (this.E && !bd.f21784a0) {
            measuredWidth = (i17 - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f29597n);
        }
        h6Var.layout(measuredWidth, max, h6Var.getMeasuredWidth() + measuredWidth, h6Var.getMeasuredHeight() + max);
        if (bd.f21784a0) {
            measuredWidth2 = org.telegram.messenger.g0.L(this.f29597n - 6);
        } else {
            measuredWidth2 = (i17 - k5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f29597n - 6);
        }
        k5Var.layout(measuredWidth2, max, k5Var.getMeasuredWidth() + measuredWidth2, k5Var.getMeasuredHeight() + max);
        boolean z11 = bd.f21784a0;
        fh0 fh0Var = this.f29595e;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f29592a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - k5Var2.getMeasuredWidth();
            if (fh0Var.getVisibility() == 0) {
                i15 = this.f29599s;
            } else {
                i15 = this.f29597n;
            }
            L = measuredWidth6 - org.telegram.messenger.g0.L(i15);
        } else {
            if (fh0Var.getVisibility() == 0) {
                i13 = this.f29599s;
            } else {
                i13 = this.f29597n;
            }
            L = org.telegram.messenger.g0.L(i13);
        }
        org.telegram.ui.ActionBar.k5 k5Var3 = this.f29593b;
        if (k5Var3.getVisibility() == 0) {
            if (this.f29600w > 50) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            float f11 = i14;
            int L2 = org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.camera.q.y(f11, (i16 - k5Var2.getTextHeight()) - k5Var3.getTextHeight(), 2);
            k5Var2.layout(L, L2, k5Var2.getMeasuredWidth() + L, k5Var2.getMeasuredHeight() + L2);
            int L3 = org.telegram.messenger.g0.L(f11) + k5Var2.getTextHeight() + L2;
            k5Var3.layout(L, L3, k5Var3.getMeasuredWidth() + L, k5Var3.getMeasuredHeight() + L3);
        } else {
            int L4 = org.telegram.messenger.g0.L(1.0f) + ((i16 - k5Var2.getTextHeight()) / 2);
            k5Var2.layout(L, L4, k5Var2.getMeasuredWidth() + L, k5Var2.getMeasuredHeight() + L4);
        }
        if (fh0Var.getVisibility() == 0) {
            if (this.f29600w > 50) {
                f10 = 0.0f;
            } else {
                f10 = 2.0f;
            }
            int L5 = org.telegram.messenger.g0.L(1.0f) + ((((i16 - fh0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.L(f10)) - fh0Var.getPaddingTop());
            if (!bd.f21784a0) {
                measuredWidth5 = org.telegram.messenger.g0.L(this.f29601x);
            } else {
                measuredWidth5 = (i17 - fh0Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f29601x);
            }
            fh0Var.layout(measuredWidth5, L5, fh0Var.getMeasuredWidth() + measuredWidth5, fh0Var.getMeasuredHeight() + L5);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L6 = org.telegram.messenger.g0.L(1.0f) + ((i16 - imageView.getMeasuredHeight()) / 2);
            if (bd.f21784a0) {
                measuredWidth4 = org.telegram.messenger.g0.L(23.0f);
            } else {
                measuredWidth4 = (i17 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            }
            imageView.layout(measuredWidth4, L6, imageView.getMeasuredWidth() + measuredWidth4, imageView.getMeasuredHeight() + L6);
        }
        Switch r9 = this.f29596f;
        if (r9 != null && r9.getVisibility() == 0) {
            int measuredHeight = (i16 - this.f29596f.getMeasuredHeight()) / 2;
            if (bd.f21784a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(22.0f);
            } else {
                measuredWidth3 = (i17 - this.f29596f.getMeasuredWidth()) - org.telegram.messenger.g0.L(22.0f);
            }
            Switch r10 = this.f29596f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f29596f.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(this.f29600w);
        int i15 = this.M;
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        if (i15 != 0 && i15 != size && (charSequence = this.R) != null) {
            h6Var.c(TextUtils.ellipsize(charSequence, h6Var.getPaint(), org.telegram.messenger.g0.f22608q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29593b;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.d;
        org.telegram.ui.ActionBar.k5 k5Var3 = this.f29592a;
        if (z10) {
            k5Var3.measure(org.telegram.messenger.camera.q.c(this.f29597n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            k5Var.measure(org.telegram.messenger.camera.q.c(this.f29597n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L2 = (size - org.telegram.messenger.g0.L(this.f29597n + 103)) - k5Var3.getTextWidth();
            if (bd.f21784a0) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(L2, i13), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L3 = (size - org.telegram.messenger.g0.L(this.f29597n + 103)) - k5Var3.getTextWidth();
            if (bd.f21784a0) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec(L3, i14), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        } else {
            int L4 = size - org.telegram.messenger.g0.L(this.f29597n);
            if (bd.f21784a0) {
                i11 = Integer.MIN_VALUE;
            } else {
                i11 = 1073741824;
            }
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(L4, i11), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L5 = size - org.telegram.messenger.g0.L(this.f29597n);
            if (bd.f21784a0) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec(L5, i12), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int max = Math.max(h6Var.d(), k5Var2.getTextWidth());
            k5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.g0.L(this.f29597n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            k5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.f29597n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        fh0 fh0Var = this.f29595e;
        if (fh0Var.getVisibility() == 0) {
            fh0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        Switch r02 = this.f29596f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, L + (this.f29598r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f29599s = c(false);
        this.f29601x = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        h6Var.c(null, false, true);
        fh0 fh0Var = this.f29595e;
        fh0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof ch0) {
            fh0Var.setAnimation((ch0) drawable);
        } else {
            fh0Var.setImageDrawable(drawable);
        }
        fh0Var.setVisibility(0);
        h6Var.setVisibility(8);
        this.h.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.f29598r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f29601x = getDefaultImageLeft();
        this.f29599s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, h6Var.getPaint(), org.telegram.messenger.g0.f22608q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        h6Var.c(ellipsize, z10, true);
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.f29595e.setVisibility(8);
        this.h.setVisibility(8);
        this.f29598r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f29596f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i3, int i10, int i11, boolean z11) {
        CharSequence ellipsize;
        this.f29601x = getDefaultImageLeft();
        this.f29599s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(str, false);
        k5Var.i(null);
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.R = str2;
            ellipsize = TextUtils.ellipsize(str2, h6Var.getPaint(), org.telegram.messenger.g0.f22608q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        h6Var.c(ellipsize, z10, true);
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i10, i11, i3);
        this.h.setVisibility(8);
        this.f29598r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f29596f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i3, boolean z10) {
        u(charSequence, charSequence2, false, i3, z10);
    }

    public void setChecked(boolean z10) {
        this.f29596f.c(z10, true);
    }

    public void setCompactLayout(boolean z10) {
        this.S = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        i(z10, true);
    }

    public void setImageLeft(int i3) {
        this.f29601x = i3;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f29598r != z10) {
            this.f29598r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i3) {
        this.f29599s = i3;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29593b;
        if (!isEmpty) {
            k5Var.setVisibility(0);
            k5Var.l(charSequence, false);
            return;
        }
        k5Var.setVisibility(8);
    }

    public void setTextColor(int i3) {
        this.N = false;
        this.f29592a.setTextColor(i3);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.L == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(30.0f), this);
            this.L = e5Var;
            if (this.G) {
                e5Var.a();
            }
        }
        this.L.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f29599s = c(false);
        this.f29601x = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        h6Var.c(charSequence2, false, true);
        fh0 fh0Var = this.f29595e;
        fh0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof ch0) {
            fh0Var.setAnimation((ch0) drawable);
        } else {
            fh0Var.setImageDrawable(drawable);
        }
        fh0Var.setVisibility(0);
        h6Var.setVisibility(0);
        this.h.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.f29598r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i3, boolean z11) {
        this.f29601x = getDefaultImageLeft();
        this.f29599s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        fh0 fh0Var = this.f29595e;
        fh0Var.setVisibility(0);
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        if (charSequence2 != null) {
            float h = gi.l3.h(charSequence, k5Var.getTextPaint());
            this.R = charSequence2;
            h6Var.c(TextUtils.ellipsize(charSequence2, h6Var.getPaint(), (int) Math.max(1.0f, org.telegram.messenger.g0.f22608q.x - ((h + org.telegram.messenger.g0.L(this.f29599s)) + org.telegram.messenger.g0.L(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            h6Var.c("", z10, true);
        }
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        fh0Var.setTranslationX(0.0f);
        fh0Var.setTranslationY(0.0f);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        fh0Var.setImageResource(i3);
        this.f29598r = z11;
        setWillNotDraw(!z11);
        Switch r9 = this.f29596f;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        if (!this.N && !this.O) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, e6Var);
                int e10 = e(w02);
                int e11 = e(w03);
                if (e10 == w02 && e11 == w03) {
                    return;
                }
                this.f29593b.setTextColor(e10);
                this.f29594c.setTextColor(e11);
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
        this.f29601x = getDefaultImageLeft();
        this.f29599s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29592a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        h6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        fh0 fh0Var = this.f29595e;
        fh0Var.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f29598r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f29596f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.h6 h6Var = this.f29594c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, h6Var.getPaint(), org.telegram.messenger.g0.f22608q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        h6Var.c(ellipsize, z10, true);
    }

    public l8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(20, context, e6Var, false, false);
    }

    public l8(int i3, Context context, boolean z10) {
        this(i3, context, null, z10, false);
    }

    public l8(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.f29599s = 71;
        this.f29600w = 50;
        this.f29601x = 21;
        this.F = e6Var;
        this.f29597n = i3;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29592a = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, z10 ? org.telegram.ui.ActionBar.k6.f27988j5 : org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setTextSize(16);
        k5Var.setGravity(bd.f21784a0 ? 5 : 3);
        k5Var.setImportantForAccessibility(2);
        addView(k5Var, mf.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f29593b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, z10 ? org.telegram.ui.ActionBar.k6.f28100p5 : org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        k5Var2.setTextSize(13);
        k5Var2.setGravity(bd.f21784a0 ? 5 : 3);
        k5Var2.setImportantForAccessibility(2);
        addView(k5Var2, mf.c(-1.0f, -2));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f29594c = h6Var;
        org.telegram.ui.ActionBar.r6.Z(h6Var, z10 ? org.telegram.ui.ActionBar.k6.f28061n5 : org.telegram.ui.ActionBar.k6.I6, e6Var);
        h6Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setGravity(bd.f21784a0 ? 3 : 5);
        h6Var.setImportantForAccessibility(2);
        h6Var.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        addView(h6Var);
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var3;
        Boolean bool = Boolean.FALSE;
        if (!k5Var3.Q) {
            k5Var3.f27799o0 = true;
            k5Var3.f27801q0 = bool;
            k5Var3.m();
            k5Var3.b();
        }
        k5Var3.f27803r0 = 18;
        k5Var3.m();
        org.telegram.ui.ActionBar.r6.Y(k5Var3, z10 ? org.telegram.ui.ActionBar.k6.f28061n5 : org.telegram.ui.ActionBar.k6.I6, e6Var);
        k5Var3.setGravity(bd.f21784a0 ? 3 : 5);
        k5Var3.setTextSize(16);
        k5Var3.setImportantForAccessibility(2);
        k5Var3.setVisibility(8);
        addView(k5Var3);
        ?? imageView = new ImageView(context);
        this.f29595e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView, z10 ? org.telegram.ui.ActionBar.k6.J5 : org.telegram.ui.ActionBar.k6.f28043m6, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r32 = new Switch(context, e6Var);
            this.f29596f = r32;
            int i10 = org.telegram.ui.ActionBar.k6.M6;
            int i11 = org.telegram.ui.ActionBar.k6.N6;
            int i12 = org.telegram.ui.ActionBar.k6.f27878d6;
            r32.d(i10, i11, i12, i12);
            addView(this.f29596f, mf.d(37, 20.0f, (bd.f21784a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.L == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(30.0f), this);
            this.L = e5Var;
            if (this.G) {
                e5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.P();
        }
        addOnAttachStateChangeListener(new k8(imageReceiver, 0));
        imageReceiver.o0(str, "30_30", null, null, 0L);
        this.L.g(new gi.k3(imageReceiver, 6), true);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i3) {
        return i3;
    }
}
