package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class xz extends f2.l {
    public final f00 F;

    public xz(f00 f00Var) {
        this.F = f00Var;
    }

    @Override
    public final void C(f2.n1 n1Var, f2.k kVar) {
        super.C(n1Var, kVar);
        View view = n1Var.f6432a;
        if (view instanceof d00) {
            d00 d00Var = (d00) view;
            if (d00Var.f27623w) {
                ValueAnimator valueAnimator = d00Var.f27606a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    d00Var.f27606a.removeAllUpdateListeners();
                    d00Var.f27606a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wz(d00Var, 0));
                ofFloat.addListener(new org.telegram.ui.bm(d00Var, 29));
                d00Var.f27606a = ofFloat;
                ofFloat.setDuration(this.f6487e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(f2.n1 n1Var) {
        super.f(n1Var);
        View view = n1Var.f6432a;
        view.setTranslationX(0.0f);
        if (view instanceof d00) {
            ((d00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f6405p.isEmpty();
        boolean isEmpty2 = this.f6407r.isEmpty();
        boolean isEmpty3 = this.f6408s.isEmpty();
        boolean isEmpty4 = this.f6406q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new j6(this, 23));
            ofFloat.setDuration(this.f6487e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(f2.n1 n1Var, a5.e eVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ?? r32;
        boolean z10;
        String str;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z14;
        boolean z15;
        int i19;
        int i20;
        boolean z16;
        float f9;
        int i21;
        int i22;
        float f10;
        boolean z17;
        boolean z18;
        int i23;
        View view = n1Var.f6432a;
        if (view instanceof d00) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(n1Var);
            int i24 = i12 - translationX;
            int i25 = i13 - translationY;
            if (i24 != 0) {
                view.setTranslationX(-i24);
            }
            if (i25 != 0) {
                view.setTranslationY(-i25);
            }
            d00 d00Var = (d00) view;
            f00 f00Var = d00Var.f27619i0;
            TextPaint textPaint = f00Var.f28228b;
            TextPaint textPaint2 = f00Var.f28230c;
            int i26 = d00Var.f27608b.d;
            int i27 = d00Var.E;
            if (i26 != i27) {
                d00Var.D = true;
                d00Var.F = i27;
                d00Var.f27609b0 = d00Var.W;
                d00Var.f27611c0 = d00Var.f27607a0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(d00Var.f27608b.d);
                    if (valueOf.length() == valueOf2.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                        int i28 = 0;
                        while (i28 < valueOf.length()) {
                            int i29 = translationX;
                            if (valueOf.charAt(i28) == valueOf2.charAt(i28)) {
                                i23 = translationY;
                                int i30 = i28 + 1;
                                spannableStringBuilder.setSpan(new gz(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new gz(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new gz(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        d00Var.H = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        d00Var.I = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        d00Var.G = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        d00Var.H = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        d00Var.G = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z17 = true;
                    z18 = false;
                }
                z10 = true;
                i16 = z17;
                r32 = z18;
            } else {
                i14 = translationX;
                i15 = translationY;
                i16 = 1;
                r32 = 0;
                z10 = false;
            }
            int i31 = d00Var.f27608b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i17 = 0;
            }
            int i32 = d00Var.f27608b.f27253c;
            if (i17 != 0) {
                if (str != null) {
                    f10 = 1.0f;
                } else {
                    f10 = f00Var.f28255w;
                }
                i18 = AndroidUtilities.dp(f10 * 6.0f) + i17;
            } else {
                i18 = 0;
            }
            int i33 = i18 + i32;
            float f11 = d00Var.A;
            if ((d00Var.getMeasuredWidth() - i33) / 2 != f11) {
                d00Var.C = i16;
                d00Var.B = f11;
                z11 = true;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = d00Var.J;
            if (charSequence3 != null && !d00Var.f27608b.f27252b.equals(charSequence3)) {
                if (d00Var.J.length() > d00Var.f27608b.f27252b.length()) {
                    charSequence = d00Var.J;
                    charSequence2 = d00Var.f27608b.f27252b;
                    z14 = true;
                } else {
                    charSequence = d00Var.f27608b.f27252b;
                    charSequence2 = d00Var.J;
                    z14 = false;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new gz((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new gz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new gz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z12 = false;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    d00Var.L = staticLayout;
                    if (d00Var.f27618h0) {
                        if (d00Var.f27608b.f27256g) {
                            i22 = 26;
                        } else {
                            i22 = 0;
                        }
                        d00Var.K = y5.update(i22, d00Var, d00Var.K, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    d00Var.P = staticLayout2;
                    if (d00Var.f27618h0) {
                        if (d00Var.f27608b.f27256g) {
                            i21 = 26;
                        } else {
                            i21 = 0;
                        }
                        z16 = true;
                        d00Var.O = y5.update(i21, d00Var, d00Var.O, staticLayout2);
                    } else {
                        z16 = true;
                    }
                    d00Var.Q = z16;
                    d00Var.R = z19;
                    if (charSequenceIndexOf == 0) {
                        f9 = 0.0f;
                    } else {
                        f9 = -d00Var.P.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    d00Var.T = f9;
                    d00Var.V = d00Var.U;
                    d00Var.N = null;
                    y5.release(d00Var, d00Var.M);
                } else {
                    z12 = false;
                    CharSequence charSequence4 = d00Var.f27608b.f27252b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    d00Var.L = staticLayout3;
                    if (d00Var.f27618h0) {
                        if (d00Var.f27608b.f27256g) {
                            i20 = 26;
                        } else {
                            i20 = 0;
                        }
                        d00Var.K = y5.update(i20, d00Var, d00Var.K, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(d00Var.J, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    d00Var.N = staticLayout4;
                    if (d00Var.f27618h0) {
                        if (d00Var.f27608b.f27256g) {
                            i19 = 26;
                        } else {
                            i19 = 0;
                        }
                        z15 = true;
                        d00Var.M = y5.update(i19, d00Var, d00Var.M, staticLayout4);
                    } else {
                        z15 = true;
                    }
                    d00Var.P = null;
                    y5.release(d00Var, d00Var.O);
                    d00Var.Q = z15;
                    d00Var.T = 0.0f;
                    d00Var.V = d00Var.U;
                }
                z11 = true;
            } else {
                z12 = false;
            }
            if (i33 != d00Var.f27612d0 || d00Var.getMeasuredWidth() != d00Var.f27616f0) {
                z13 = true;
                d00Var.S = true;
                d00Var.f27614e0 = d00Var.f27612d0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                d00Var.f27624x = 0.0f;
                d00Var.f27623w = z13;
                f00 f00Var2 = this.F;
                f00Var2.B.invalidate();
                f00Var2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z11) {
                v(n1Var);
                return z12;
            }
            this.f6407r.add(new f2.k(n1Var, i14, i15, i12, i13));
            return z13;
        }
        return super.r(n1Var, eVar, i10, i11, i12, i13);
    }

    @Override
    public final void x(f2.n1 n1Var) {
        n1Var.f6432a.setTranslationX(0.0f);
        View view = n1Var.f6432a;
        if (view instanceof d00) {
            ((d00) view).a();
        }
    }
}
