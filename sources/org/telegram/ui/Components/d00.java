package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class d00 extends s4.j {
    public final l00 F;

    public d00(l00 l00Var) {
        this.F = l00Var;
    }

    @Override
    public final void C(s4.c1 c1Var, s4.i iVar) {
        super.C(c1Var, iVar);
        View view = c1Var.f42961a;
        if (view instanceof j00) {
            j00 j00Var = (j00) view;
            if (j00Var.f25227w) {
                ValueAnimator valueAnimator = j00Var.f25208a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    j00Var.f25208a.removeAllUpdateListeners();
                    j00Var.f25208a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new c00(j00Var, 0));
                ofFloat.addListener(new r8(j00Var, 21));
                j00Var.f25208a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s4.c1 c1Var) {
        super.f(c1Var);
        View view = c1Var.f42961a;
        view.setTranslationX(0.0f);
        if (view instanceof j00) {
            ((j00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f43019p.isEmpty();
        boolean isEmpty2 = this.f43021r.isEmpty();
        boolean isEmpty3 = this.f43022s.isEmpty();
        boolean isEmpty4 = this.f43020q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new k6(this, 23));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
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
        float f7;
        int i21;
        int i22;
        float f10;
        boolean z17;
        boolean z18;
        int i23;
        View view = c1Var.f42961a;
        if (view instanceof j00) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(c1Var);
            int i24 = i12 - translationX;
            int i25 = i13 - translationY;
            if (i24 != 0) {
                view.setTranslationX(-i24);
            }
            if (i25 != 0) {
                view.setTranslationY(-i25);
            }
            j00 j00Var = (j00) view;
            l00 l00Var = j00Var.m0;
            TextPaint textPaint = l00Var.f25937b;
            TextPaint textPaint2 = l00Var.f25939c;
            int i26 = j00Var.f25210b.d;
            int i27 = j00Var.I;
            if (i26 != i27) {
                j00Var.H = true;
                j00Var.J = i27;
                j00Var.f25217f0 = j00Var.f25214d0;
                j00Var.f25218g0 = j00Var.f25215e0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(j00Var.f25210b.d);
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
                                spannableStringBuilder.setSpan(new mz(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new mz(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new mz(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        j00Var.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        j00Var.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        j00Var.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        j00Var.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        j00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i31 = j00Var.f25210b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i17 = 0;
            }
            int i32 = j00Var.f25210b.f24586c;
            if (i17 != 0) {
                if (str != null) {
                    f10 = 1.0f;
                } else {
                    f10 = l00Var.f25963w;
                }
                i18 = AndroidUtilities.dp(f10 * 6.0f) + i17;
            } else {
                i18 = 0;
            }
            int i33 = i18 + i32;
            float f11 = j00Var.E;
            if ((j00Var.getMeasuredWidth() - i33) / 2 != f11) {
                j00Var.G = i16;
                j00Var.F = f11;
                z11 = true;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = j00Var.N;
            if (charSequence3 != null && !j00Var.f25210b.f24585b.equals(charSequence3)) {
                if (j00Var.N.length() > j00Var.f25210b.f24585b.length()) {
                    charSequence = j00Var.N;
                    charSequence2 = j00Var.f25210b.f24585b;
                    z14 = true;
                } else {
                    charSequence = j00Var.f25210b.f24585b;
                    charSequence2 = j00Var.N;
                    z14 = false;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new mz((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new mz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new mz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z12 = false;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    j00Var.P = staticLayout;
                    if (j00Var.f25223l0) {
                        if (j00Var.f25210b.f24588g) {
                            i22 = 26;
                        } else {
                            i22 = 0;
                        }
                        j00Var.O = z5.update(i22, j00Var, j00Var.O, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    j00Var.T = staticLayout2;
                    if (j00Var.f25223l0) {
                        if (j00Var.f25210b.f24588g) {
                            i21 = 26;
                        } else {
                            i21 = 0;
                        }
                        z16 = true;
                        j00Var.S = z5.update(i21, j00Var, j00Var.S, staticLayout2);
                    } else {
                        z16 = true;
                    }
                    j00Var.U = z16;
                    j00Var.V = z19;
                    if (charSequenceIndexOf == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = -j00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    j00Var.f25209a0 = f7;
                    j00Var.f25213c0 = j00Var.f25211b0;
                    j00Var.R = null;
                    z5.release(j00Var, j00Var.Q);
                } else {
                    z12 = false;
                    CharSequence charSequence4 = j00Var.f25210b.f24585b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    j00Var.P = staticLayout3;
                    if (j00Var.f25223l0) {
                        if (j00Var.f25210b.f24588g) {
                            i20 = 26;
                        } else {
                            i20 = 0;
                        }
                        j00Var.O = z5.update(i20, j00Var, j00Var.O, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(j00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    j00Var.R = staticLayout4;
                    if (j00Var.f25223l0) {
                        if (j00Var.f25210b.f24588g) {
                            i19 = 26;
                        } else {
                            i19 = 0;
                        }
                        z15 = true;
                        j00Var.Q = z5.update(i19, j00Var, j00Var.Q, staticLayout4);
                    } else {
                        z15 = true;
                    }
                    j00Var.T = null;
                    z5.release(j00Var, j00Var.S);
                    j00Var.U = z15;
                    j00Var.f25209a0 = 0.0f;
                    j00Var.f25213c0 = j00Var.f25211b0;
                }
                z11 = true;
            } else {
                z12 = false;
            }
            if (i33 != j00Var.f25219h0 || j00Var.getMeasuredWidth() != j00Var.f25221j0) {
                z13 = true;
                j00Var.W = true;
                j00Var.f25220i0 = j00Var.f25219h0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                j00Var.f25228x = 0.0f;
                j00Var.f25227w = z13;
                l00 l00Var2 = this.F;
                l00Var2.F.invalidate();
                l00Var2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z11) {
                v(c1Var);
                return z12;
            }
            this.f43021r.add(new s4.i(c1Var, i14, i15, i12, i13));
            return z13;
        }
        return super.r(c1Var, q0Var, i10, i11, i12, i13);
    }

    @Override
    public final void x(s4.c1 c1Var) {
        c1Var.f42961a.setTranslationX(0.0f);
        View view = c1Var.f42961a;
        if (view instanceof j00) {
            ((j00) view).a();
        }
    }
}
