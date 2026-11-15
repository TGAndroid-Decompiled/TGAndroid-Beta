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
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.fz;
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
    public final org.telegram.ui.ActionBar.j5 f30653a;
    public final org.telegram.ui.ActionBar.j5 f30654b;
    public final org.telegram.ui.Components.h6 f30655c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final fh0 f30656e;
    public Switch f30657f;
    public final ImageView h;
    public int f30658n;
    public boolean f30659r;
    public int f30660s;
    public int f30661w;
    public int f30662x;
    public boolean f30663y;

    public l8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        fz fzVar = new fz();
        fzVar.f47239f = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ck, false);
        fzVar.f47240n = false;
        spannableStringBuilder.setSpan(fzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        if (j5Var.getTag() instanceof Integer) {
            i7 = ((Integer) j5Var.getTag()).intValue();
        } else {
            i7 = org.telegram.ui.ActionBar.j6.G6;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        if (i7 != org.telegram.ui.ActionBar.j6.f28957j5 && i7 != org.telegram.ui.ActionBar.j6.G6) {
            w02 = e(w02);
        }
        if (this.N) {
            j5Var.setTextColor(w02);
        }
        if (this.O) {
            fh0 fh0Var = this.f30656e;
            if (fh0Var.getTag() instanceof Integer) {
                int intValue = ((Integer) fh0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.j6.w0(intValue, e6Var);
                if (intValue != org.telegram.ui.ActionBar.j6.J5 && intValue != org.telegram.ui.ActionBar.j6.f29014m6) {
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
        this.f30654b.setTextColor(e(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, e6Var)));
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        this.f30655c.setTextColor(e(org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
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
        Switch r02 = this.f30657f;
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
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.O5, this.F));
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
            if (hd.f24101a0) {
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
        this.f30655c.setAlpha(f19 * f10);
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
            e5Var3.setBounds((getWidth() - this.L.f34197s) - org.telegram.messenger.g0.L(18.0f), (getHeight() - this.L.f34197s) / 2, getWidth() - org.telegram.messenger.g0.L(18.0f), (getHeight() + this.L.f34197s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i7, int i10, int i11) {
        float f10;
        boolean q10;
        this.f30660s = c(true);
        fh0 fh0Var = this.f30656e;
        fh0Var.setVisibility(0);
        fh0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        if (hd.f24101a0) {
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
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        ea0 ea0Var = new ea0(1);
        ea0Var.b(i7, i10);
        ea0Var.f34267b = q10;
        fh0Var.setBackground(ea0Var);
    }

    public final void g(int i7, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.setTextColor(w02);
        j5Var.setTag(Integer.valueOf(i10));
        this.N = true;
        if (i7 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), PorterDuff.Mode.SRC_IN);
            fh0 fh0Var = this.f30656e;
            fh0Var.setColorFilter(porterDuffColorFilter);
            fh0Var.setTag(Integer.valueOf(i7));
            this.O = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f30657f;
    }

    public int getDefaultImageLeft() {
        if (this.S) {
            return 16;
        }
        return 21;
    }

    public fh0 getImageView() {
        return this.f30656e;
    }

    public org.telegram.ui.ActionBar.j5 getTextView() {
        return this.f30653a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.h6 getValueTextView() {
        return this.f30655c;
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
        Switch r52 = this.f30657f;
        if (r52 != null) {
            r52.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f30653a.animate();
        float f13 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
        ViewPropertyAnimator animate2 = this.f30654b.animate();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        animate2.alpha(f11).start();
        ViewPropertyAnimator animate3 = this.f30655c.animate();
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        if (i7 <= 0) {
            j5Var.i(null);
            return;
        }
        j5Var.i(new org.telegram.ui.ActionBar.t2(i7, getContext(), this.F, false));
        j5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.f30662x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        h6Var.c(null, false, true);
        this.f30656e.setVisibility(8);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f30659r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.f30662x = getDefaultImageLeft();
        this.f30660s = c(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.f30656e.setVisibility(8);
        this.h.setVisibility(8);
        this.f30659r = z11;
        Switch r62 = this.f30657f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f30657f.c(z10, false);
        }
        setWillNotDraw(!this.f30659r);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i7, int i10, boolean z11) {
        int i11;
        this.f30662x = getDefaultImageLeft();
        this.f30660s = c(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(str, false);
        j5Var.i(null);
        this.f30655c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i10, i10, i7);
        if (this.f30657f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f30657f = r11;
            int i12 = org.telegram.ui.ActionBar.j6.M6;
            int i13 = org.telegram.ui.ActionBar.j6.N6;
            int i14 = org.telegram.ui.ActionBar.j6.f28849d6;
            r11.d(i12, i13, i14, i14);
            Switch r112 = this.f30657f;
            if (hd.f24101a0) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(r112, c8.ja.d(37, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r113 = this.f30657f;
        if (r113 != null) {
            r113.setVisibility(0);
            this.f30657f.c(z10, false);
        }
        this.f30659r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void n(int i7, String str, boolean z10) {
        this.f30662x = getDefaultImageLeft();
        this.f30660s = c(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(str, false);
        j5Var.i(null);
        this.f30655c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f30657f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f30657f.c(z10, false);
        }
        fh0 fh0Var = this.f30656e;
        fh0Var.setVisibility(0);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        fh0Var.setImageResource(i7);
        this.f30659r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void o(int i7, CharSequence charSequence, boolean z10) {
        this.f30662x = getDefaultImageLeft();
        this.f30660s = c(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        h6Var.c(null, false, true);
        fh0 fh0Var = this.f30656e;
        fh0Var.setImageResource(i7);
        fh0Var.setVisibility(0);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f30659r = z10;
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
        int i7;
        float f10;
        if (this.f30659r) {
            org.telegram.ui.ActionBar.e6 e6Var = this.F;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint2 = paint;
            if (this.f30656e.getVisibility() == 0) {
                if (this.f30663y) {
                    i7 = 72;
                } else {
                    i7 = this.f30660s;
                }
            } else {
                i7 = this.f30658n;
            }
            int L = org.telegram.messenger.g0.L(i7);
            if (hd.f24101a0) {
                f10 = 0.0f;
            } else {
                f10 = L;
            }
            float f11 = f10;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!hd.f24101a0) {
                L = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        CharSequence text = j5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        if (!isEmpty) {
            CharSequence text2 = h6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f30657f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f30657f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j5Var.getText());
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
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        int textHeight = j5Var.getTextHeight();
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        int max = ((i16 - Math.max(textHeight, h6Var.getTextHeight())) / 2) + 1;
        if (hd.f24101a0) {
            measuredWidth = org.telegram.messenger.g0.L(this.f30658n - 6);
        } else {
            measuredWidth = (i17 - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f30658n - 6);
        }
        if (this.E && !hd.f24101a0) {
            measuredWidth = (i17 - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f30658n);
        }
        h6Var.layout(measuredWidth, max, h6Var.getMeasuredWidth() + measuredWidth, h6Var.getMeasuredHeight() + max);
        if (hd.f24101a0) {
            measuredWidth2 = org.telegram.messenger.g0.L(this.f30658n - 6);
        } else {
            measuredWidth2 = (i17 - j5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f30658n - 6);
        }
        j5Var.layout(measuredWidth2, max, j5Var.getMeasuredWidth() + measuredWidth2, j5Var.getMeasuredHeight() + max);
        boolean z11 = hd.f24101a0;
        fh0 fh0Var = this.f30656e;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f30653a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - j5Var2.getMeasuredWidth();
            if (fh0Var.getVisibility() == 0) {
                i15 = this.f30660s;
            } else {
                i15 = this.f30658n;
            }
            L = measuredWidth6 - org.telegram.messenger.g0.L(i15);
        } else {
            if (fh0Var.getVisibility() == 0) {
                i13 = this.f30660s;
            } else {
                i13 = this.f30658n;
            }
            L = org.telegram.messenger.g0.L(i13);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = this.f30654b;
        if (j5Var3.getVisibility() == 0) {
            if (this.f30661w > 50) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            float f11 = i14;
            int L2 = org.telegram.messenger.g0.L(1.0f) + i20.y(f11, (i16 - j5Var2.getTextHeight()) - j5Var3.getTextHeight(), 2);
            j5Var2.layout(L, L2, j5Var2.getMeasuredWidth() + L, j5Var2.getMeasuredHeight() + L2);
            int L3 = org.telegram.messenger.g0.L(f11) + j5Var2.getTextHeight() + L2;
            j5Var3.layout(L, L3, j5Var3.getMeasuredWidth() + L, j5Var3.getMeasuredHeight() + L3);
        } else {
            int L4 = org.telegram.messenger.g0.L(1.0f) + ((i16 - j5Var2.getTextHeight()) / 2);
            j5Var2.layout(L, L4, j5Var2.getMeasuredWidth() + L, j5Var2.getMeasuredHeight() + L4);
        }
        if (fh0Var.getVisibility() == 0) {
            if (this.f30661w > 50) {
                f10 = 0.0f;
            } else {
                f10 = 2.0f;
            }
            int L5 = org.telegram.messenger.g0.L(1.0f) + ((((i16 - fh0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.L(f10)) - fh0Var.getPaddingTop());
            if (!hd.f24101a0) {
                measuredWidth5 = org.telegram.messenger.g0.L(this.f30662x);
            } else {
                measuredWidth5 = (i17 - fh0Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.f30662x);
            }
            fh0Var.layout(measuredWidth5, L5, fh0Var.getMeasuredWidth() + measuredWidth5, fh0Var.getMeasuredHeight() + L5);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L6 = org.telegram.messenger.g0.L(1.0f) + ((i16 - imageView.getMeasuredHeight()) / 2);
            if (hd.f24101a0) {
                measuredWidth4 = org.telegram.messenger.g0.L(23.0f);
            } else {
                measuredWidth4 = (i17 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            }
            imageView.layout(measuredWidth4, L6, imageView.getMeasuredWidth() + measuredWidth4, imageView.getMeasuredHeight() + L6);
        }
        Switch r92 = this.f30657f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i16 - this.f30657f.getMeasuredHeight()) / 2;
            if (hd.f24101a0) {
                measuredWidth3 = org.telegram.messenger.g0.L(22.0f);
            } else {
                measuredWidth3 = (i17 - this.f30657f.getMeasuredWidth()) - org.telegram.messenger.g0.L(22.0f);
            }
            Switch r10 = this.f30657f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f30657f.getMeasuredHeight() + measuredHeight);
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
        int L = org.telegram.messenger.g0.L(this.f30661w);
        int i15 = this.M;
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        if (i15 != 0 && i15 != size && (charSequence = this.R) != null) {
            h6Var.c(TextUtils.ellipsize(charSequence, h6Var.getPaint(), org.telegram.messenger.g0.f23609q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.j5 j5Var = this.f30654b;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.d;
        org.telegram.ui.ActionBar.j5 j5Var3 = this.f30653a;
        if (z10) {
            j5Var3.measure(i20.c(this.f30658n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            j5Var.measure(i20.c(this.f30658n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L2 = (size - org.telegram.messenger.g0.L(this.f30658n + 103)) - j5Var3.getTextWidth();
            if (hd.f24101a0) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(L2, i13), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L3 = (size - org.telegram.messenger.g0.L(this.f30658n + 103)) - j5Var3.getTextWidth();
            if (hd.f24101a0) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            j5Var2.measure(View.MeasureSpec.makeMeasureSpec(L3, i14), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        } else {
            int L4 = size - org.telegram.messenger.g0.L(this.f30658n);
            if (hd.f24101a0) {
                i11 = Integer.MIN_VALUE;
            } else {
                i11 = 1073741824;
            }
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(L4, i11), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int L5 = size - org.telegram.messenger.g0.L(this.f30658n);
            if (hd.f24101a0) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            j5Var2.measure(View.MeasureSpec.makeMeasureSpec(L5, i12), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            int max = Math.max(h6Var.d(), j5Var2.getTextWidth());
            j5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.g0.L(this.f30658n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
            j5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.f30658n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        fh0 fh0Var = this.f30656e;
        if (fh0Var.getVisibility() == 0) {
            fh0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        Switch r02 = this.f30657f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, L + (this.f30659r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f30660s = c(false);
        this.f30662x = 18;
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        h6Var.c(null, false, true);
        fh0 fh0Var = this.f30656e;
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
        this.f30659r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f30662x = getDefaultImageLeft();
        this.f30660s = c(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, h6Var.getPaint(), org.telegram.messenger.g0.f23609q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        h6Var.c(ellipsize, z10, true);
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.f30656e.setVisibility(8);
        this.h.setVisibility(8);
        this.f30659r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f30657f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i7, int i10, int i11, boolean z11) {
        CharSequence ellipsize;
        this.f30662x = getDefaultImageLeft();
        this.f30660s = c(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(str, false);
        j5Var.i(null);
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.R = str2;
            ellipsize = TextUtils.ellipsize(str2, h6Var.getPaint(), org.telegram.messenger.g0.f23609q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        h6Var.c(ellipsize, z10, true);
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i10, i11, i7);
        this.h.setVisibility(8);
        this.f30659r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f30657f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i7, boolean z10) {
        u(charSequence, charSequence2, false, i7, z10);
    }

    public void setChecked(boolean z10) {
        this.f30657f.c(z10, true);
    }

    public void setCompactLayout(boolean z10) {
        this.S = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        i(z10, true);
    }

    public void setImageLeft(int i7) {
        this.f30662x = i7;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f30659r != z10) {
            this.f30659r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i7) {
        this.f30660s = i7;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30654b;
        if (!isEmpty) {
            j5Var.setVisibility(0);
            j5Var.l(charSequence, false);
            return;
        }
        j5Var.setVisibility(8);
    }

    public void setTextColor(int i7) {
        this.N = false;
        this.f30653a.setTextColor(i7);
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
        this.f30660s = c(false);
        this.f30662x = 18;
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        h6Var.c(charSequence2, false, true);
        fh0 fh0Var = this.f30656e;
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
        this.f30659r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i7, boolean z11) {
        this.f30662x = getDefaultImageLeft();
        this.f30660s = c(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        fh0 fh0Var = this.f30656e;
        fh0Var.setVisibility(0);
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        if (charSequence2 != null) {
            float h = hi.l3.h(charSequence, j5Var.getTextPaint());
            this.R = charSequence2;
            h6Var.c(TextUtils.ellipsize(charSequence2, h6Var.getPaint(), (int) Math.max(1.0f, org.telegram.messenger.g0.f23609q.x - ((h + org.telegram.messenger.g0.L(this.f30660s)) + org.telegram.messenger.g0.L(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            h6Var.c("", z10, true);
        }
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        fh0Var.setTranslationX(0.0f);
        fh0Var.setTranslationY(0.0f);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        fh0Var.setImageResource(i7);
        this.f30659r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f30657f;
        if (r92 != null) {
            r92.setVisibility(8);
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
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.I6, e6Var);
                int e10 = e(w02);
                int e11 = e(w03);
                if (e10 == w02 && e11 == w03) {
                    return;
                }
                this.f30654b.setTextColor(e10);
                this.f30655c.setTextColor(e11);
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
        this.f30662x = getDefaultImageLeft();
        this.f30660s = c(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f30653a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        h6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        fh0 fh0Var = this.f30656e;
        fh0Var.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f30659r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f30657f;
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
        org.telegram.ui.Components.h6 h6Var = this.f30655c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, h6Var.getPaint(), org.telegram.messenger.g0.f23609q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        h6Var.c(ellipsize, z10, true);
    }

    public l8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(20, context, e6Var, false, false);
    }

    public l8(int i7, Context context, boolean z10) {
        this(i7, context, null, z10, false);
    }

    public l8(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.f30660s = 71;
        this.f30661w = 50;
        this.f30662x = 21;
        this.F = e6Var;
        this.f30658n = i7;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30653a = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, z10 ? org.telegram.ui.ActionBar.j6.f28957j5 : org.telegram.ui.ActionBar.j6.G6, e6Var);
        j5Var.setTextSize(16);
        j5Var.setGravity(hd.f24101a0 ? 5 : 3);
        j5Var.setImportantForAccessibility(2);
        addView(j5Var, c8.ja.c(-1.0f, -2));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f30654b = j5Var2;
        org.telegram.ui.ActionBar.q6.X(j5Var2, z10 ? org.telegram.ui.ActionBar.j6.f29068p5 : org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        j5Var2.setTextSize(13);
        j5Var2.setGravity(hd.f24101a0 ? 5 : 3);
        j5Var2.setImportantForAccessibility(2);
        addView(j5Var2, c8.ja.c(-1.0f, -2));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f30655c = h6Var;
        org.telegram.ui.ActionBar.q6.Y(h6Var, z10 ? org.telegram.ui.ActionBar.j6.f29030n5 : org.telegram.ui.ActionBar.j6.I6, e6Var);
        h6Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setGravity(hd.f24101a0 ? 3 : 5);
        h6Var.setImportantForAccessibility(2);
        h6Var.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        addView(h6Var);
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var3;
        Boolean bool = Boolean.FALSE;
        if (!j5Var3.Q) {
            j5Var3.f28767o0 = true;
            j5Var3.f28769q0 = bool;
            j5Var3.m();
            j5Var3.b();
        }
        j5Var3.f28771r0 = 18;
        j5Var3.m();
        org.telegram.ui.ActionBar.q6.X(j5Var3, z10 ? org.telegram.ui.ActionBar.j6.f29030n5 : org.telegram.ui.ActionBar.j6.I6, e6Var);
        j5Var3.setGravity(hd.f24101a0 ? 3 : 5);
        j5Var3.setTextSize(16);
        j5Var3.setImportantForAccessibility(2);
        j5Var3.setVisibility(8);
        addView(j5Var3);
        ?? imageView = new ImageView(context);
        this.f30656e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView, z10 ? org.telegram.ui.ActionBar.j6.J5 : org.telegram.ui.ActionBar.j6.f29014m6, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r32 = new Switch(context, e6Var);
            this.f30657f = r32;
            int i10 = org.telegram.ui.ActionBar.j6.M6;
            int i11 = org.telegram.ui.ActionBar.j6.N6;
            int i12 = org.telegram.ui.ActionBar.j6.f28849d6;
            r32.d(i10, i11, i12, i12);
            addView(this.f30657f, c8.ja.d(37, 20.0f, (hd.f24101a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
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
