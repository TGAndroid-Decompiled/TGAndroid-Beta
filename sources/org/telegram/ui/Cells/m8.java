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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ez;
public class m8 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final int V = 0;
    public boolean D;
    public final org.telegram.ui.ActionBar.f6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.g5 K;
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
    public final org.telegram.ui.ActionBar.k5 f29564a;
    public final org.telegram.ui.ActionBar.k5 f29565b;
    public final org.telegram.ui.Components.j6 f29566c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final ch0 f29567e;
    public Switch f29568f;
    public final ImageView h;
    public int f29569n;
    public boolean f29570r;
    public int f29571s;
    public int f29572w;
    public int f29573x;
    public boolean f29574y;

    public m8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        ez ezVar = new ez();
        ezVar.f45442f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false);
        ezVar.f45443n = false;
        spannableStringBuilder.setSpan(ezVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        if (k5Var.getTag() instanceof Integer) {
            i7 = ((Integer) k5Var.getTag()).intValue();
        } else {
            i7 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        if (i7 != org.telegram.ui.ActionBar.k6.f27957j5 && i7 != org.telegram.ui.ActionBar.k6.G6) {
            w02 = e(w02);
        }
        if (this.M) {
            k5Var.setTextColor(w02);
        }
        if (this.N) {
            ch0 ch0Var = this.f29567e;
            if (ch0Var.getTag() instanceof Integer) {
                int intValue = ((Integer) ch0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.k6.w0(intValue, f6Var);
                if (intValue != org.telegram.ui.ActionBar.k6.J5 && intValue != org.telegram.ui.ActionBar.k6.f28014m6) {
                    w03 = e(w03);
                }
                if (w03 != this.O || ch0Var.getColorFilter() != this.P) {
                    this.O = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.P = porterDuffColorFilter;
                    ch0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.f29565b.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28241y6, f6Var)));
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        this.f29566c.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
    }

    public final int c(boolean z9) {
        if (this.R) {
            if (z9) {
                return 52;
            }
            return 58;
        } else if (z9) {
            return 65;
        } else {
            return 71;
        }
    }

    public final boolean d() {
        Switch r02 = this.f29568f;
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
        if (this.H || this.J != 0.0f) {
            if (this.S == null) {
                Paint paint = new Paint(1);
                this.S = paint;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.E));
            }
            if (this.T) {
                float f12 = this.I + 0.016f;
                this.I = f12;
                if (f12 > 1.0f) {
                    this.I = 1.0f;
                    this.T = false;
                }
            } else {
                float f13 = this.I - 0.016f;
                this.I = f13;
                if (f13 < 0.0f) {
                    this.I = 0.0f;
                    this.T = true;
                }
            }
            int i7 = this.U;
            if (i7 > 0) {
                this.U = i7 - 15;
            } else {
                boolean z9 = this.H;
                if (z9) {
                    float f14 = this.J;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.J = f15;
                        if (f15 > 1.0f) {
                            this.J = 1.0f;
                        }
                    }
                }
                if (!z9) {
                    float f16 = this.J;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.J = f17;
                        if (f17 < 0.0f) {
                            this.J = 0.0f;
                        }
                    }
                }
            }
            this.S.setAlpha((int) (((this.I * 0.4f) + 0.6f) * this.J * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f)) - org.telegram.messenger.g0.L(this.G), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (hd.f22878a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.S);
            invalidate();
        }
        float f18 = 1.0f - this.J;
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var == null) {
            e10 = 1.0f;
        } else {
            e10 = 1.0f - g5Var.e();
        }
        float f19 = f18 * e10;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f29566c.setAlpha(f19 * f10);
        float f20 = 1.0f - this.J;
        org.telegram.ui.Components.g5 g5Var2 = this.K;
        if (g5Var2 == null) {
            e11 = 1.0f;
        } else {
            e11 = 1.0f - g5Var2.e();
        }
        float f21 = f20 * e11;
        if (!isEnabled()) {
            f11 = 0.5f;
        }
        this.d.setAlpha(f21 * f11);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.g5 g5Var3 = this.K;
        if (g5Var3 != null) {
            g5Var3.setBounds((getWidth() - this.K.f33828s) - org.telegram.messenger.g0.L(18.0f), (getHeight() - this.K.f33828s) / 2, getWidth() - org.telegram.messenger.g0.L(18.0f), (getHeight() + this.K.f33828s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void f(int i7, int i10, int i11) {
        float f10;
        boolean q10;
        this.f29571s = c(true);
        ch0 ch0Var = this.f29567e;
        ch0Var.setVisibility(0);
        ch0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        if (hd.f22878a0) {
            f10 = 0.0f;
        } else {
            f10 = -3.0f;
        }
        ch0Var.setTranslationX(org.telegram.messenger.g0.L(f10));
        ch0Var.setImageResource(i11);
        this.N = false;
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.f6 f6Var = this.E;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        da0 da0Var = new da0(1);
        da0Var.b(i7, i10);
        da0Var.f32849b = q10;
        ch0Var.setBackground(da0Var);
    }

    public final void g(int i7, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.setTextColor(w02);
        k5Var.setTag(Integer.valueOf(i10));
        this.M = true;
        if (i7 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), PorterDuff.Mode.SRC_IN);
            ch0 ch0Var = this.f29567e;
            ch0Var.setColorFilter(porterDuffColorFilter);
            ch0Var.setTag(Integer.valueOf(i7));
            this.N = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f29568f;
    }

    public int getDefaultImageLeft() {
        if (this.R) {
            return 16;
        }
        return 21;
    }

    public ch0 getImageView() {
        return this.f29567e;
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.f29564a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.f29566c;
    }

    public final void h(int i7, boolean z9, boolean z10) {
        float f10;
        this.H = z9;
        this.G = i7;
        if (!z10) {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.J = f10;
        }
        invalidate();
    }

    public final void i(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        super.setEnabled(z9);
        Switch r52 = this.f29568f;
        if (r52 != null) {
            r52.setEnabled(z9);
        }
        ViewPropertyAnimator animate = this.f29564a.animate();
        float f13 = 0.5f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
        ViewPropertyAnimator animate2 = this.f29565b.animate();
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        animate2.alpha(f11).start();
        ViewPropertyAnimator animate3 = this.f29566c.animate();
        if (z9) {
            f12 = 1.0f;
        } else {
            f12 = 0.5f;
        }
        animate3.alpha(f12).start();
        ViewPropertyAnimator animate4 = this.d.animate();
        if (z9) {
            f13 = 1.0f;
        }
        animate4.alpha(f13).start();
    }

    public final void j(int i7) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        if (i7 <= 0) {
            k5Var.i(null);
            return;
        }
        k5Var.i(new org.telegram.ui.ActionBar.u2(i7, getContext(), this.E, false));
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z9) {
        this.f29573x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        j6Var.c(null, false, true);
        this.f29567e.setVisibility(8);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f29570r = z9;
        setWillNotDraw(!z9);
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z9, boolean z10) {
        this.f29573x = getDefaultImageLeft();
        this.f29571s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.f29567e.setVisibility(8);
        this.h.setVisibility(8);
        this.f29570r = z10;
        Switch r62 = this.f29568f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f29568f.c(z9, false);
        }
        setWillNotDraw(!this.f29570r);
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z9, int i7, int i10, boolean z10) {
        int i11;
        this.f29573x = getDefaultImageLeft();
        this.f29571s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.f29566c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i10, i10, i7);
        if (this.f29568f == null) {
            Switch r11 = new Switch(getContext(), this.E);
            this.f29568f = r11;
            int i12 = org.telegram.ui.ActionBar.k6.M6;
            int i13 = org.telegram.ui.ActionBar.k6.N6;
            int i14 = org.telegram.ui.ActionBar.k6.f27849d6;
            r11.d(i12, i13, i14, i14);
            Switch r112 = this.f29568f;
            if (hd.f22878a0) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(r112, c8.ha.d(37, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r113 = this.f29568f;
        if (r113 != null) {
            r113.setVisibility(0);
            this.f29568f.c(z9, false);
        }
        this.f29570r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void n(int i7, String str, boolean z9) {
        this.f29573x = getDefaultImageLeft();
        this.f29571s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.f29566c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f29568f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f29568f.c(z9, false);
        }
        ch0 ch0Var = this.f29567e;
        ch0Var.setVisibility(0);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        ch0Var.setImageResource(i7);
        this.f29570r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void o(int i7, CharSequence charSequence, boolean z9) {
        this.f29573x = getDefaultImageLeft();
        this.f29571s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        j6Var.c(null, false, true);
        ch0 ch0Var = this.f29567e;
        ch0Var.setImageResource(i7);
        ch0Var.setVisibility(0);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f29570r = z9;
        setWillNotDraw(!z9);
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        int i7;
        float f10;
        if (this.f29570r) {
            org.telegram.ui.ActionBar.f6 f6Var = this.E;
            if (f6Var != null) {
                paint = f6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f27972k0;
            }
            Paint paint2 = paint;
            if (this.f29567e.getVisibility() == 0) {
                if (this.f29574y) {
                    i7 = 72;
                } else {
                    i7 = this.f29571s;
                }
            } else {
                i7 = this.f29569n;
            }
            int L = org.telegram.messenger.g0.L(i7);
            if (hd.f22878a0) {
                f10 = 0.0f;
            } else {
                f10 = L;
            }
            float f11 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!hd.f22878a0) {
                L = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        CharSequence text = k5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        if (!isEmpty) {
            CharSequence text2 = j6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f29568f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f29568f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k5Var.getText());
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
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
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        int textHeight = k5Var.getTextHeight();
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        int max = ((i16 - Math.max(textHeight, j6Var.getTextHeight())) / 2) + 1;
        if (hd.f22878a0) {
            measuredWidth = org.telegram.messenger.g0.L(this.f29569n - 6);
        } else {
            measuredWidth = (i17 - j6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f29569n - 6);
        }
        if (this.D && !hd.f22878a0) {
            measuredWidth = (i17 - j6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f29569n);
        }
        j6Var.layout(measuredWidth, max, j6Var.getMeasuredWidth() + measuredWidth, j6Var.getMeasuredHeight() + max);
        if (hd.f22878a0) {
            measuredWidth2 = org.telegram.messenger.g0.L(this.f29569n - 6);
        } else {
            measuredWidth2 = (i17 - k5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f29569n - 6);
        }
        k5Var.layout(measuredWidth2, max, k5Var.getMeasuredWidth() + measuredWidth2, k5Var.getMeasuredHeight() + max);
        boolean z10 = hd.f22878a0;
        ch0 ch0Var = this.f29567e;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f29564a;
        if (z10) {
            int measuredWidth6 = getMeasuredWidth() - k5Var2.getMeasuredWidth();
            if (ch0Var.getVisibility() == 0) {
                i15 = this.f29571s;
            } else {
                i15 = this.f29569n;
            }
            L = measuredWidth6 - org.telegram.messenger.g0.L(i15);
        } else {
            if (ch0Var.getVisibility() == 0) {
                i13 = this.f29571s;
            } else {
                i13 = this.f29569n;
            }
            L = org.telegram.messenger.g0.L(i13);
        }
        org.telegram.ui.ActionBar.k5 k5Var3 = this.f29565b;
        if (k5Var3.getVisibility() == 0) {
            if (this.f29572w > 50) {
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
        if (ch0Var.getVisibility() == 0) {
            if (this.f29572w > 50) {
                f10 = 0.0f;
            } else {
                f10 = 2.0f;
            }
            int L5 = org.telegram.messenger.g0.L(1.0f) + ((((i16 - ch0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.L(f10)) - ch0Var.getPaddingTop());
            if (!hd.f22878a0) {
                measuredWidth5 = org.telegram.messenger.g0.L(this.f29573x);
            } else {
                measuredWidth5 = (i17 - ch0Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f29573x);
            }
            ch0Var.layout(measuredWidth5, L5, ch0Var.getMeasuredWidth() + measuredWidth5, ch0Var.getMeasuredHeight() + L5);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L6 = org.telegram.messenger.g0.L(1.0f) + ((i16 - imageView.getMeasuredHeight()) / 2);
            if (hd.f22878a0) {
                measuredWidth4 = org.telegram.messenger.g0.L(23.0f);
            } else {
                measuredWidth4 = (i17 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            }
            imageView.layout(measuredWidth4, L6, imageView.getMeasuredWidth() + measuredWidth4, imageView.getMeasuredHeight() + L6);
        }
        Switch r92 = this.f29568f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i16 - this.f29568f.getMeasuredHeight()) / 2;
            if (hd.f22878a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(22.0f);
            } else {
                measuredWidth3 = (i17 - this.f29568f.getMeasuredWidth()) - org.telegram.messenger.g0.L(22.0f);
            }
            Switch r10 = this.f29568f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f29568f.getMeasuredHeight() + measuredHeight);
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
        int L = org.telegram.messenger.g0.L(this.f29572w);
        int i15 = this.L;
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        if (i15 != 0 && i15 != size && (charSequence = this.Q) != null) {
            j6Var.c(TextUtils.ellipsize(charSequence, j6Var.getPaint(), org.telegram.messenger.g0.f22544q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z9 = this.D;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29565b;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.d;
        org.telegram.ui.ActionBar.k5 k5Var3 = this.f29564a;
        if (z9) {
            k5Var3.measure(org.telegram.messenger.camera.q.c(this.f29569n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            k5Var.measure(org.telegram.messenger.camera.q.c(this.f29569n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L2 = (size - org.telegram.messenger.g0.L(this.f29569n + 103)) - k5Var3.getTextWidth();
            if (hd.f22878a0) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(L2, i13), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L3 = (size - org.telegram.messenger.g0.L(this.f29569n + 103)) - k5Var3.getTextWidth();
            if (hd.f22878a0) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec(L3, i14), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        } else {
            int L4 = size - org.telegram.messenger.g0.L(this.f29569n);
            if (hd.f22878a0) {
                i11 = Integer.MIN_VALUE;
            } else {
                i11 = 1073741824;
            }
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(L4, i11), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L5 = size - org.telegram.messenger.g0.L(this.f29569n);
            if (hd.f22878a0) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec(L5, i12), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int max = Math.max(j6Var.d(), k5Var2.getTextWidth());
            k5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.g0.L(this.f29569n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            k5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.f29569n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        ch0 ch0Var = this.f29567e;
        if (ch0Var.getVisibility() == 0) {
            ch0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        Switch r02 = this.f29568f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, L + (this.f29570r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z9) {
        this.f29571s = c(false);
        this.f29573x = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        j6Var.c(null, false, true);
        ch0 ch0Var = this.f29567e;
        ch0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof zg0) {
            ch0Var.setAnimation((zg0) drawable);
        } else {
            ch0Var.setImageDrawable(drawable);
        }
        ch0Var.setVisibility(0);
        j6Var.setVisibility(8);
        this.h.setVisibility(8);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.f29570r = z9;
        setWillNotDraw(!z9);
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        CharSequence ellipsize;
        this.f29573x = getDefaultImageLeft();
        this.f29571s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, j6Var.getPaint(), org.telegram.messenger.g0.f22544q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(ellipsize, z9, true);
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.f29567e.setVisibility(8);
        this.h.setVisibility(8);
        this.f29570r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f29568f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z9, int i7, int i10, int i11, boolean z10) {
        CharSequence ellipsize;
        this.f29573x = getDefaultImageLeft();
        this.f29571s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(str, false);
        k5Var.i(null);
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.Q = str2;
            ellipsize = TextUtils.ellipsize(str2, j6Var.getPaint(), org.telegram.messenger.g0.f22544q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(ellipsize, z9, true);
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i10, i11, i7);
        this.h.setVisibility(8);
        this.f29570r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f29568f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i7, boolean z9) {
        u(charSequence, charSequence2, false, i7, z9);
    }

    public void setChecked(boolean z9) {
        this.f29568f.c(z9, true);
    }

    public void setCompactLayout(boolean z9) {
        this.R = z9;
    }

    @Override
    public void setEnabled(boolean z9) {
        i(z9, true);
    }

    public void setImageLeft(int i7) {
        this.f29573x = i7;
    }

    public void setNeedDivider(boolean z9) {
        if (this.f29570r != z9) {
            this.f29570r = z9;
            setWillNotDraw(!z9);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i7) {
        this.f29571s = i7;
    }

    public void setPrioritizeTitleOverValue(boolean z9) {
        if (this.D != z9) {
            this.D = z9;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29565b;
        if (!isEmpty) {
            k5Var.setVisibility(0);
            k5Var.l(charSequence, false);
            return;
        }
        k5Var.setVisibility(8);
    }

    public void setTextColor(int i7) {
        this.M = false;
        this.f29564a.setTextColor(i7);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(30.0f), this);
            this.K = g5Var;
            if (this.F) {
                g5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z9) {
        this.f29571s = c(false);
        this.f29573x = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        j6Var.c(charSequence2, false, true);
        ch0 ch0Var = this.f29567e;
        ch0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof zg0) {
            ch0Var.setAnimation((zg0) drawable);
        } else {
            ch0Var.setImageDrawable(drawable);
        }
        ch0Var.setVisibility(0);
        j6Var.setVisibility(0);
        this.h.setVisibility(8);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.f29570r = z9;
        setWillNotDraw(!z9);
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i7, boolean z10) {
        this.f29573x = getDefaultImageLeft();
        this.f29571s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        ch0 ch0Var = this.f29567e;
        ch0Var.setVisibility(0);
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        if (charSequence2 != null) {
            float h = fi.m3.h(charSequence, k5Var.getTextPaint());
            this.Q = charSequence2;
            j6Var.c(TextUtils.ellipsize(charSequence2, j6Var.getPaint(), (int) Math.max(1.0f, org.telegram.messenger.g0.f22544q.x - ((h + org.telegram.messenger.g0.L(this.f29571s)) + org.telegram.messenger.g0.L(16.0f))), TextUtils.TruncateAt.END), z9, true);
        } else {
            j6Var.c("", z9, true);
        }
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ch0Var.setTranslationX(0.0f);
        ch0Var.setTranslationY(0.0f);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        ch0Var.setImageResource(i7);
        this.f29570r = z10;
        setWillNotDraw(!z10);
        Switch r92 = this.f29568f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var = this.E;
        if (!this.M && !this.N) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28241y6, f6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, f6Var);
                int e10 = e(w02);
                int e11 = e(w03);
                if (e10 == w02 && e11 == w03) {
                    return;
                }
                this.f29565b.setTextColor(e10);
                this.f29566c.setTextColor(e11);
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

    public final void v(CharSequence charSequence, Drawable drawable, boolean z9) {
        this.f29573x = getDefaultImageLeft();
        this.f29571s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f29564a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        j6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        ch0 ch0Var = this.f29567e;
        ch0Var.setVisibility(8);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f29570r = z9;
        setWillNotDraw(!z9);
        Switch r72 = this.f29568f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.g5 g5Var = this.K;
        if (g5Var != null) {
            g5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z9) {
        CharSequence ellipsize;
        org.telegram.ui.Components.j6 j6Var = this.f29566c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.Q = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, j6Var.getPaint(), org.telegram.messenger.g0.f22544q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(ellipsize, z9, true);
    }

    public m8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(20, context, f6Var, false, false);
    }

    public m8(int i7, Context context, boolean z9) {
        this(i7, context, null, z9, false);
    }

    public m8(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context);
        this.f29571s = 71;
        this.f29572w = 50;
        this.f29573x = 21;
        this.E = f6Var;
        this.f29569n = i7;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29564a = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, z9 ? org.telegram.ui.ActionBar.k6.f27957j5 : org.telegram.ui.ActionBar.k6.G6, f6Var);
        k5Var.setTextSize(16);
        k5Var.setGravity(hd.f22878a0 ? 5 : 3);
        k5Var.setImportantForAccessibility(2);
        addView(k5Var, c8.ha.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f29565b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, z9 ? org.telegram.ui.ActionBar.k6.f28068p5 : org.telegram.ui.ActionBar.k6.f28241y6, f6Var);
        k5Var2.setTextSize(13);
        k5Var2.setGravity(hd.f22878a0 ? 5 : 3);
        k5Var2.setImportantForAccessibility(2);
        addView(k5Var2, c8.ha.c(-1.0f, -2));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f29566c = j6Var;
        org.telegram.ui.ActionBar.r6.Z(j6Var, z9 ? org.telegram.ui.ActionBar.k6.f28030n5 : org.telegram.ui.ActionBar.k6.I6, f6Var);
        j6Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        j6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        j6Var.setGravity(hd.f22878a0 ? 3 : 5);
        j6Var.setImportantForAccessibility(2);
        j6Var.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        addView(j6Var);
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var3;
        Boolean bool = Boolean.FALSE;
        if (!k5Var3.P) {
            k5Var3.f27767n0 = true;
            k5Var3.f27769p0 = bool;
            k5Var3.m();
            k5Var3.b();
        }
        k5Var3.f27770q0 = 18;
        k5Var3.m();
        org.telegram.ui.ActionBar.r6.Y(k5Var3, z9 ? org.telegram.ui.ActionBar.k6.f28030n5 : org.telegram.ui.ActionBar.k6.I6, f6Var);
        k5Var3.setGravity(hd.f22878a0 ? 3 : 5);
        k5Var3.setTextSize(16);
        k5Var3.setImportantForAccessibility(2);
        k5Var3.setVisibility(8);
        addView(k5Var3);
        ?? imageView = new ImageView(context);
        this.f29567e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView, z9 ? org.telegram.ui.ActionBar.k6.J5 : org.telegram.ui.ActionBar.k6.f28014m6, f6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z10) {
            Switch r32 = new Switch(context, f6Var);
            this.f29568f = r32;
            int i10 = org.telegram.ui.ActionBar.k6.M6;
            int i11 = org.telegram.ui.ActionBar.k6.N6;
            int i12 = org.telegram.ui.ActionBar.k6.f27849d6;
            r32.d(i10, i11, i12, i12);
            addView(this.f29568f, c8.ha.d(37, 20.0f, (hd.f22878a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(30.0f), this);
            this.K = g5Var;
            if (this.F) {
                g5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.P();
        }
        addOnAttachStateChangeListener(new l8(imageReceiver, 0));
        imageReceiver.o0(str, "30_30", null, null, 0L);
        this.K.g(new fi.l3(imageReceiver, 6), true);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i7) {
        return i7;
    }
}
