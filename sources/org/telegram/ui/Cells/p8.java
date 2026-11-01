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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.f00;
public class p8 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int V = 0;
    public boolean D;
    public final org.telegram.ui.ActionBar.p6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.d5 K;
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
    public final org.telegram.ui.ActionBar.u5 f22458a;
    public final org.telegram.ui.ActionBar.u5 f22459b;
    public final org.telegram.ui.Components.f6 f22460c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final fi0 e;
    public Switch f22461f;
    public final ImageView h;
    public int f22462n;
    public boolean f22463r;
    public int f22464s;
    public int f22465w;
    public int f22466x;
    public boolean f22467y;

    public p8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        f00 f00Var = new f00();
        f00Var.f36947f = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false);
        f00Var.f36948n = false;
        spannableStringBuilder.setSpan(f00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        if (u5Var.getTag() instanceof Integer) {
            i10 = ((Integer) u5Var.getTag()).intValue();
        } else {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        if (i10 != org.telegram.ui.ActionBar.t6.f21038j5 && i10 != org.telegram.ui.ActionBar.t6.G6) {
            w02 = e(w02);
        }
        if (this.M) {
            u5Var.setTextColor(w02);
        }
        if (this.N) {
            fi0 fi0Var = this.e;
            if (fi0Var.getTag() instanceof Integer) {
                int intValue = ((Integer) fi0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.t6.w0(intValue, p6Var);
                if (intValue != org.telegram.ui.ActionBar.t6.J5 && intValue != org.telegram.ui.ActionBar.t6.f21096m6) {
                    w03 = e(w03);
                }
                if (w03 != this.O || fi0Var.getColorFilter() != this.P) {
                    this.O = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.P = porterDuffColorFilter;
                    fi0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.f22459b.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var)));
        int i11 = org.telegram.ui.ActionBar.t6.I6;
        this.f22460c.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
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
        Switch r02 = this.f22461f;
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
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.O5, this.E));
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
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.i0.L(21.0f)) - org.telegram.messenger.i0.L(this.G), measuredHeight - org.telegram.messenger.i0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(3.0f) + measuredHeight);
            if (dd.X) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), this.S);
            invalidate();
        }
        float f17 = 1.0f - this.J;
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var == null) {
            e = 1.0f;
        } else {
            e = 1.0f - d5Var.e();
        }
        float f18 = f17 * e;
        if (isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        this.f22460c.setAlpha(f18 * f7);
        float f19 = 1.0f - this.J;
        org.telegram.ui.Components.d5 d5Var2 = this.K;
        if (d5Var2 == null) {
            e7 = 1.0f;
        } else {
            e7 = 1.0f - d5Var2.e();
        }
        float f20 = f19 * e7;
        if (!isEnabled()) {
            f10 = 0.5f;
        }
        this.d.setAlpha(f20 * f10);
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.d5 d5Var3 = this.K;
        if (d5Var3 != null) {
            d5Var3.setBounds((getWidth() - this.K.f25375s) - org.telegram.messenger.i0.L(18.0f), (getHeight() - this.K.f25375s) / 2, getWidth() - org.telegram.messenger.i0.L(18.0f), (getHeight() + this.K.f25375s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void f(int i10, int i11, int i12) {
        float f7;
        boolean q6;
        this.f22464s = c(true);
        fi0 fi0Var = this.e;
        fi0Var.setVisibility(0);
        fi0Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        if (dd.X) {
            f7 = 0.0f;
        } else {
            f7 = -3.0f;
        }
        fi0Var.setTranslationX(org.telegram.messenger.i0.L(f7));
        fi0Var.setImageResource(i12);
        this.N = false;
        fi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.p6 p6Var = this.E;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        va0 va0Var = new va0(1);
        va0Var.b(i10, i11);
        va0Var.f31239b = q6;
        fi0Var.setBackground(va0Var);
    }

    public final void g(int i10, int i11) {
        org.telegram.ui.ActionBar.p6 p6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.setTextColor(w02);
        u5Var.setTag(Integer.valueOf(i11));
        this.M = true;
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), PorterDuff.Mode.SRC_IN);
            fi0 fi0Var = this.e;
            fi0Var.setColorFilter(porterDuffColorFilter);
            fi0Var.setTag(Integer.valueOf(i10));
            this.N = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f22461f;
    }

    public int getDefaultImageLeft() {
        if (this.R) {
            return 16;
        }
        return 21;
    }

    public fi0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.u5 getTextView() {
        return this.f22458a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.f6 getValueTextView() {
        return this.f22460c;
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
        Switch r52 = this.f22461f;
        if (r52 != null) {
            r52.setEnabled(z10);
        }
        ViewPropertyAnimator animate = this.f22458a.animate();
        float f12 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).start();
        ViewPropertyAnimator animate2 = this.f22459b.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate2.alpha(f10).start();
        ViewPropertyAnimator animate3 = this.f22460c.animate();
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
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        if (i10 <= 0) {
            u5Var.i(null);
            return;
        }
        u5Var.i(new org.telegram.ui.ActionBar.y2(i10, getContext(), this.E, false));
        u5Var.setDrawablePadding(org.telegram.messenger.i0.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.f22466x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        f6Var.c(null, false, true);
        this.e.setVisibility(8);
        f6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f22463r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.f22466x = getDefaultImageLeft();
        this.f22464s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f22463r = z11;
        Switch r62 = this.f22461f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f22461f.c(z10, false);
        }
        setWillNotDraw(!this.f22463r);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        this.f22466x = getDefaultImageLeft();
        this.f22464s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(str, false);
        u5Var.i(null);
        this.f22460c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i11, i11, i10);
        if (this.f22461f == null) {
            Switch r11 = new Switch(getContext(), this.E);
            this.f22461f = r11;
            int i13 = org.telegram.ui.ActionBar.t6.M6;
            int i14 = org.telegram.ui.ActionBar.t6.N6;
            int i15 = org.telegram.ui.ActionBar.t6.f20930d6;
            r11.d(i13, i14, i15, i15);
            Switch r112 = this.f22461f;
            if (dd.X) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(r112, w7.b6.d(37, 20.0f, i12 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r113 = this.f22461f;
        if (r113 != null) {
            r113.setVisibility(0);
            this.f22461f.c(z10, false);
        }
        this.f22463r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void n(int i10, String str, boolean z10) {
        this.f22466x = getDefaultImageLeft();
        this.f22464s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(str, false);
        u5Var.i(null);
        this.f22460c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f22461f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f22461f.c(z10, false);
        }
        fi0 fi0Var = this.e;
        fi0Var.setVisibility(0);
        fi0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        fi0Var.setImageResource(i10);
        this.f22463r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void o(int i10, CharSequence charSequence, boolean z10) {
        this.f22466x = getDefaultImageLeft();
        this.f22464s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        f6Var.c(null, false, true);
        fi0 fi0Var = this.e;
        fi0Var.setImageResource(i10);
        fi0Var.setVisibility(0);
        f6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        fi0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        this.f22463r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        int i10;
        float f7;
        if (this.f22463r) {
            org.telegram.ui.ActionBar.p6 p6Var = this.E;
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.t6.f21053k0;
            }
            Paint paint2 = paint;
            if (this.e.getVisibility() == 0) {
                if (this.f22467y) {
                    i10 = 72;
                } else {
                    i10 = this.f22464s;
                }
            } else {
                i10 = this.f22462n;
            }
            int L = org.telegram.messenger.i0.L(i10);
            if (dd.X) {
                f7 = 0.0f;
            } else {
                f7 = L;
            }
            float f10 = f7;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!dd.X) {
                L = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        CharSequence text = u5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        if (!isEmpty) {
            CharSequence text2 = f6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f22461f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f22461f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(u5Var.getText());
            if (!TextUtils.isEmpty(f6Var.getText())) {
                sb2.append('\n');
                sb2.append(f6Var.getText());
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
        int L;
        int measuredWidth3;
        int measuredWidth4;
        float f7;
        int measuredWidth5;
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        int textHeight = u5Var.getTextHeight();
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        int max = ((i17 - Math.max(textHeight, f6Var.getTextHeight())) / 2) + 1;
        if (dd.X) {
            measuredWidth = org.telegram.messenger.i0.L(this.f22462n - 6);
        } else {
            measuredWidth = (i18 - f6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(this.f22462n - 6);
        }
        if (this.D && !dd.X) {
            measuredWidth = (i18 - f6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(this.f22462n);
        }
        f6Var.layout(measuredWidth, max, f6Var.getMeasuredWidth() + measuredWidth, f6Var.getMeasuredHeight() + max);
        if (dd.X) {
            measuredWidth2 = org.telegram.messenger.i0.L(this.f22462n - 6);
        } else {
            measuredWidth2 = (i18 - u5Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(this.f22462n - 6);
        }
        u5Var.layout(measuredWidth2, max, u5Var.getMeasuredWidth() + measuredWidth2, u5Var.getMeasuredHeight() + max);
        boolean z11 = dd.X;
        fi0 fi0Var = this.e;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f22458a;
        if (z11) {
            int measuredWidth6 = getMeasuredWidth() - u5Var2.getMeasuredWidth();
            if (fi0Var.getVisibility() == 0) {
                i16 = this.f22464s;
            } else {
                i16 = this.f22462n;
            }
            L = measuredWidth6 - org.telegram.messenger.i0.L(i16);
        } else {
            if (fi0Var.getVisibility() == 0) {
                i14 = this.f22464s;
            } else {
                i14 = this.f22462n;
            }
            L = org.telegram.messenger.i0.L(i14);
        }
        org.telegram.ui.ActionBar.u5 u5Var3 = this.f22459b;
        if (u5Var3.getVisibility() == 0) {
            if (this.f22465w > 50) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            float f10 = i15;
            int L2 = org.telegram.messenger.i0.L(1.0f) + a30.y(f10, (i17 - u5Var2.getTextHeight()) - u5Var3.getTextHeight(), 2);
            u5Var2.layout(L, L2, u5Var2.getMeasuredWidth() + L, u5Var2.getMeasuredHeight() + L2);
            int L3 = org.telegram.messenger.i0.L(f10) + u5Var2.getTextHeight() + L2;
            u5Var3.layout(L, L3, u5Var3.getMeasuredWidth() + L, u5Var3.getMeasuredHeight() + L3);
        } else {
            int L4 = org.telegram.messenger.i0.L(1.0f) + ((i17 - u5Var2.getTextHeight()) / 2);
            u5Var2.layout(L, L4, u5Var2.getMeasuredWidth() + L, u5Var2.getMeasuredHeight() + L4);
        }
        if (fi0Var.getVisibility() == 0) {
            if (this.f22465w > 50) {
                f7 = 0.0f;
            } else {
                f7 = 2.0f;
            }
            int L5 = org.telegram.messenger.i0.L(1.0f) + ((((i17 - fi0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.i0.L(f7)) - fi0Var.getPaddingTop());
            if (!dd.X) {
                measuredWidth5 = org.telegram.messenger.i0.L(this.f22466x);
            } else {
                measuredWidth5 = (i18 - fi0Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(this.f22466x);
            }
            fi0Var.layout(measuredWidth5, L5, fi0Var.getMeasuredWidth() + measuredWidth5, fi0Var.getMeasuredHeight() + L5);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L6 = org.telegram.messenger.i0.L(1.0f) + ((i17 - imageView.getMeasuredHeight()) / 2);
            if (dd.X) {
                measuredWidth4 = org.telegram.messenger.i0.L(23.0f);
            } else {
                measuredWidth4 = (i18 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(23.0f);
            }
            imageView.layout(measuredWidth4, L6, imageView.getMeasuredWidth() + measuredWidth4, imageView.getMeasuredHeight() + L6);
        }
        Switch r92 = this.f22461f;
        if (r92 != null && r92.getVisibility() == 0) {
            int measuredHeight = (i17 - this.f22461f.getMeasuredHeight()) / 2;
            if (dd.X) {
                measuredWidth3 = org.telegram.messenger.i0.L(22.0f);
            } else {
                measuredWidth3 = (i18 - this.f22461f.getMeasuredWidth()) - org.telegram.messenger.i0.L(22.0f);
            }
            Switch r10 = this.f22461f;
            r10.layout(measuredWidth3, measuredHeight, r10.getMeasuredWidth() + measuredWidth3, this.f22461f.getMeasuredHeight() + measuredHeight);
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
        int L = org.telegram.messenger.i0.L(this.f22465w);
        int i16 = this.L;
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        if (i16 != 0 && i16 != size && (charSequence = this.Q) != null) {
            f6Var.c(TextUtils.ellipsize(charSequence, f6Var.getPaint(), org.telegram.messenger.i0.f16172q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z10 = this.D;
        org.telegram.ui.ActionBar.u5 u5Var = this.f22459b;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.d;
        org.telegram.ui.ActionBar.u5 u5Var3 = this.f22458a;
        if (z10) {
            u5Var3.measure(a30.c(this.f22462n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
            u5Var.measure(a30.c(this.f22462n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
            int L2 = (size - org.telegram.messenger.i0.L(this.f22462n + 103)) - u5Var3.getTextWidth();
            if (dd.X) {
                i14 = Integer.MIN_VALUE;
            } else {
                i14 = 1073741824;
            }
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(L2, i14), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
            int L3 = (size - org.telegram.messenger.i0.L(this.f22462n + 103)) - u5Var3.getTextWidth();
            if (dd.X) {
                i15 = Integer.MIN_VALUE;
            } else {
                i15 = 1073741824;
            }
            u5Var2.measure(View.MeasureSpec.makeMeasureSpec(L3, i15), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        } else {
            int L4 = size - org.telegram.messenger.i0.L(this.f22462n);
            if (dd.X) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 1073741824;
            }
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(L4, i12), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
            int L5 = size - org.telegram.messenger.i0.L(this.f22462n);
            if (dd.X) {
                i13 = Integer.MIN_VALUE;
            } else {
                i13 = 1073741824;
            }
            u5Var2.measure(View.MeasureSpec.makeMeasureSpec(L5, i13), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
            int max = Math.max(f6Var.d(), u5Var2.getTextWidth());
            u5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.i0.L(this.f22462n + 71)) - max), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
            u5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.i0.L(this.f22462n + 71)) - max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        }
        fi0 fi0Var = this.e;
        if (fi0Var.getVisibility() == 0) {
            fi0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        }
        Switch r02 = this.f22461f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, L + (this.f22463r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f22464s = c(false);
        this.f22466x = 18;
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        f6Var.c(null, false, true);
        fi0 fi0Var = this.e;
        fi0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof ci0) {
            fi0Var.setAnimation((ci0) drawable);
        } else {
            fi0Var.setImageDrawable(drawable);
        }
        fi0Var.setVisibility(0);
        f6Var.setVisibility(8);
        this.h.setVisibility(8);
        fi0Var.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, 0);
        this.f22463r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        CharSequence ellipsize;
        this.f22466x = getDefaultImageLeft();
        this.f22464s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        if (charSequence2 == null) {
            ellipsize = null;
        } else {
            ellipsize = TextUtils.ellipsize(charSequence2, f6Var.getPaint(), org.telegram.messenger.i0.f16172q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        f6Var.c(ellipsize, z10, true);
        f6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f22463r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f22461f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence ellipsize;
        this.f22466x = getDefaultImageLeft();
        this.f22464s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(str, false);
        u5Var.i(null);
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.Q = str2;
            ellipsize = TextUtils.ellipsize(str2, f6Var.getPaint(), org.telegram.messenger.i0.f16172q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        f6Var.c(ellipsize, z10, true);
        f6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i11, i12, i10);
        this.h.setVisibility(8);
        this.f22463r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f22461f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        u(charSequence, charSequence2, false, i10, z10);
    }

    public void setChecked(boolean z10) {
        this.f22461f.c(z10, true);
    }

    public void setCompactLayout(boolean z10) {
        this.R = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        i(z10, true);
    }

    public void setImageLeft(int i10) {
        this.f22466x = i10;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f22463r != z10) {
            this.f22463r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.f22464s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22459b;
        if (!isEmpty) {
            u5Var.setVisibility(0);
            u5Var.l(charSequence, false);
            return;
        }
        u5Var.setVisibility(8);
    }

    public void setTextColor(int i10) {
        this.M = false;
        this.f22458a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(30.0f), this);
            this.K = d5Var;
            if (this.F) {
                d5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f22464s = c(false);
        this.f22466x = 18;
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        f6Var.c(charSequence2, false, true);
        fi0 fi0Var = this.e;
        fi0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof ci0) {
            fi0Var.setAnimation((ci0) drawable);
        } else {
            fi0Var.setImageDrawable(drawable);
        }
        fi0Var.setVisibility(0);
        f6Var.setVisibility(0);
        this.h.setVisibility(8);
        fi0Var.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, 0);
        this.f22463r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.f22466x = getDefaultImageLeft();
        this.f22464s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        fi0 fi0Var = this.e;
        fi0Var.setVisibility(0);
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        if (charSequence2 != null) {
            float g10 = vh.p2.g(charSequence, u5Var.getTextPaint());
            this.Q = charSequence2;
            f6Var.c(TextUtils.ellipsize(charSequence2, f6Var.getPaint(), (int) Math.max(1.0f, org.telegram.messenger.i0.f16172q.x - ((g10 + org.telegram.messenger.i0.L(this.f22464s)) + org.telegram.messenger.i0.L(16.0f))), TextUtils.TruncateAt.END), z10, true);
        } else {
            f6Var.c("", z10, true);
        }
        f6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        fi0Var.setTranslationX(0.0f);
        fi0Var.setTranslationY(0.0f);
        fi0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        fi0Var.setImageResource(i10);
        this.f22463r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f22461f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.E;
        if (!this.M && !this.N) {
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I6, p6Var);
                int e = e(w02);
                int e7 = e(w03);
                if (e == w02 && e7 == w03) {
                    return;
                }
                this.f22459b.setTextColor(e);
                this.f22460c.setTextColor(e7);
                this.d.setTextColor(e7);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.f8.g(e10, true);
                return;
            }
        }
        try {
            a();
        } catch (Exception e11) {
            org.telegram.messenger.f8.g(e11, true);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f22466x = getDefaultImageLeft();
        this.f22464s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22458a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        f6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        f6Var.setVisibility(8);
        this.d.setVisibility(8);
        fi0 fi0Var = this.e;
        fi0Var.setVisibility(8);
        fi0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        this.f22463r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f22461f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.f6 f6Var = this.f22460c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.Q = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, f6Var.getPaint(), org.telegram.messenger.i0.f16172q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        f6Var.c(ellipsize, z10, true);
    }

    public p8(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(20, context, p6Var, false, false);
    }

    public p8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public p8(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.f22464s = 71;
        this.f22465w = 50;
        this.f22466x = 21;
        this.E = p6Var;
        this.f22462n = i10;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f22458a = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, z10 ? org.telegram.ui.ActionBar.t6.f21038j5 : org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTextSize(16);
        u5Var.setGravity(dd.X ? 5 : 3);
        u5Var.setImportantForAccessibility(2);
        addView(u5Var, w7.b6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.f22459b = u5Var2;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, z10 ? org.telegram.ui.ActionBar.t6.p5 : org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        u5Var2.setTextSize(13);
        u5Var2.setGravity(dd.X ? 5 : 3);
        u5Var2.setImportantForAccessibility(2);
        addView(u5Var2, w7.b6.c(-1.0f, -2));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
        this.f22460c = f6Var;
        org.telegram.ui.ActionBar.a7.Z(f6Var, z10 ? org.telegram.ui.ActionBar.t6.f21115n5 : org.telegram.ui.ActionBar.t6.I6, p6Var);
        f6Var.setPadding(0, org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f));
        f6Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
        f6Var.setGravity(dd.X ? 3 : 5);
        f6Var.setImportantForAccessibility(2);
        f6Var.setTranslationY(org.telegram.messenger.i0.L(-2.0f));
        addView(f6Var);
        org.telegram.ui.ActionBar.u5 u5Var3 = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var3;
        Boolean bool = Boolean.FALSE;
        if (!u5Var3.P) {
            u5Var3.f21369n0 = true;
            u5Var3.f21371p0 = bool;
            u5Var3.m();
            u5Var3.b();
        }
        u5Var3.f21372q0 = 18;
        u5Var3.m();
        org.telegram.ui.ActionBar.a7.Y(u5Var3, z10 ? org.telegram.ui.ActionBar.t6.f21115n5 : org.telegram.ui.ActionBar.t6.I6, p6Var);
        u5Var3.setGravity(dd.X ? 3 : 5);
        u5Var3.setTextSize(16);
        u5Var3.setImportantForAccessibility(2);
        u5Var3.setVisibility(8);
        addView(u5Var3);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView, z10 ? org.telegram.ui.ActionBar.t6.J5 : org.telegram.ui.ActionBar.t6.f21096m6, p6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2);
        if (z11) {
            Switch r32 = new Switch(context, p6Var);
            this.f22461f = r32;
            int i11 = org.telegram.ui.ActionBar.t6.M6;
            int i12 = org.telegram.ui.ActionBar.t6.N6;
            int i13 = org.telegram.ui.ActionBar.t6.f20930d6;
            r32.d(i11, i12, i13, i13);
            addView(this.f22461f, w7.b6.d(37, 20.0f, (dd.X ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(30.0f), this);
            this.K = d5Var;
            if (this.F) {
                d5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.P();
        }
        addOnAttachStateChangeListener(new jh.f(imageReceiver, 1));
        imageReceiver.o0(str, "30_30", null, null, 0L);
        this.K.g(new jg.x0(imageReceiver, 6), true);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i10) {
        return i10;
    }
}
