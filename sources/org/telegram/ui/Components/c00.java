package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class c00 extends s4.j {
    public final k00 F;

    public c00(k00 k00Var) {
        this.F = k00Var;
    }

    @Override
    public final void C(s4.c1 c1Var, s4.i iVar) {
        super.C(c1Var, iVar);
        View view = c1Var.f45766a;
        if (view instanceof i00) {
            i00 i00Var = (i00) view;
            if (i00Var.f26945w) {
                ValueAnimator valueAnimator = i00Var.f26925a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    i00Var.f26925a.removeAllUpdateListeners();
                    i00Var.f26925a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b00(i00Var, 0));
                ofFloat.addListener(new j6(i00Var, 24));
                i00Var.f26925a = ofFloat;
                ofFloat.setDuration(this.f45857e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s4.c1 c1Var) {
        super.f(c1Var);
        View view = c1Var.f45766a;
        view.setTranslationX(0.0f);
        if (view instanceof i00) {
            ((i00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f45832p.isEmpty();
        boolean isEmpty2 = this.f45834r.isEmpty();
        boolean isEmpty3 = this.f45835s.isEmpty();
        boolean isEmpty4 = this.f45833q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new l6(this, 23));
            ofFloat.setDuration(this.f45857e);
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
        View view = c1Var.f45766a;
        if (view instanceof i00) {
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
            i00 i00Var = (i00) view;
            k00 k00Var = i00Var.m0;
            TextPaint textPaint = k00Var.f27633b;
            TextPaint textPaint2 = k00Var.f27635c;
            int i26 = i00Var.f26927b.d;
            int i27 = i00Var.I;
            if (i26 != i27) {
                i00Var.H = true;
                i00Var.J = i27;
                i00Var.f26935f0 = i00Var.f26931d0;
                i00Var.f26936g0 = i00Var.f26933e0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(i00Var.f26927b.d);
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
                                spannableStringBuilder.setSpan(new lz(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new lz(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new lz(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        i00Var.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        i00Var.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        i00Var.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        i00Var.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        i00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i31 = i00Var.f26927b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i17 = 0;
            }
            int i32 = i00Var.f26927b.f26246c;
            if (i17 != 0) {
                if (str != null) {
                    f10 = 1.0f;
                } else {
                    f10 = k00Var.f27660w;
                }
                i18 = AndroidUtilities.dp(f10 * 6.0f) + i17;
            } else {
                i18 = 0;
            }
            int i33 = i18 + i32;
            float f11 = i00Var.E;
            if ((i00Var.getMeasuredWidth() - i33) / 2 != f11) {
                i00Var.G = i16;
                i00Var.F = f11;
                z11 = true;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = i00Var.N;
            if (charSequence3 != null && !i00Var.f26927b.f26245b.equals(charSequence3)) {
                if (i00Var.N.length() > i00Var.f26927b.f26245b.length()) {
                    charSequence = i00Var.N;
                    charSequence2 = i00Var.f26927b.f26245b;
                    z14 = true;
                } else {
                    charSequence = i00Var.f26927b.f26245b;
                    charSequence2 = i00Var.N;
                    z14 = false;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new lz((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new lz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new lz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z12 = false;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    i00Var.P = staticLayout;
                    if (i00Var.f26941l0) {
                        if (i00Var.f26927b.f26249g) {
                            i22 = 26;
                        } else {
                            i22 = 0;
                        }
                        i00Var.O = z5.update(i22, i00Var, i00Var.O, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    i00Var.T = staticLayout2;
                    if (i00Var.f26941l0) {
                        if (i00Var.f26927b.f26249g) {
                            i21 = 26;
                        } else {
                            i21 = 0;
                        }
                        z16 = true;
                        i00Var.S = z5.update(i21, i00Var, i00Var.S, staticLayout2);
                    } else {
                        z16 = true;
                    }
                    i00Var.U = z16;
                    i00Var.V = z19;
                    if (charSequenceIndexOf == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = -i00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    i00Var.f26926a0 = f7;
                    i00Var.f26930c0 = i00Var.f26928b0;
                    i00Var.R = null;
                    z5.release(i00Var, i00Var.Q);
                } else {
                    z12 = false;
                    CharSequence charSequence4 = i00Var.f26927b.f26245b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    i00Var.P = staticLayout3;
                    if (i00Var.f26941l0) {
                        if (i00Var.f26927b.f26249g) {
                            i20 = 26;
                        } else {
                            i20 = 0;
                        }
                        i00Var.O = z5.update(i20, i00Var, i00Var.O, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(i00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    i00Var.R = staticLayout4;
                    if (i00Var.f26941l0) {
                        if (i00Var.f26927b.f26249g) {
                            i19 = 26;
                        } else {
                            i19 = 0;
                        }
                        z15 = true;
                        i00Var.Q = z5.update(i19, i00Var, i00Var.Q, staticLayout4);
                    } else {
                        z15 = true;
                    }
                    i00Var.T = null;
                    z5.release(i00Var, i00Var.S);
                    i00Var.U = z15;
                    i00Var.f26926a0 = 0.0f;
                    i00Var.f26930c0 = i00Var.f26928b0;
                }
                z11 = true;
            } else {
                z12 = false;
            }
            if (i33 != i00Var.f26937h0 || i00Var.getMeasuredWidth() != i00Var.f26939j0) {
                z13 = true;
                i00Var.W = true;
                i00Var.f26938i0 = i00Var.f26937h0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                i00Var.f26946x = 0.0f;
                i00Var.f26945w = z13;
                k00 k00Var2 = this.F;
                k00Var2.F.invalidate();
                k00Var2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z11) {
                v(c1Var);
                return z12;
            }
            this.f45834r.add(new s4.i(c1Var, i14, i15, i12, i13));
            return z13;
        }
        return super.r(c1Var, q0Var, i10, i11, i12, i13);
    }

    @Override
    public final void x(s4.c1 c1Var) {
        c1Var.f45766a.setTranslationX(0.0f);
        View view = c1Var.f45766a;
        if (view instanceof i00) {
            ((i00) view).a();
        }
    }
}
