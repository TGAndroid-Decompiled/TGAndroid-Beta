package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class o00 extends s4.k {
    public final w00 F;

    public o00(w00 w00Var) {
        this.F = w00Var;
    }

    @Override
    public final void C(s4.b1 b1Var, s4.j jVar) {
        super.C(b1Var, jVar);
        View view = b1Var.f44838a;
        if (view instanceof u00) {
            u00 u00Var = (u00) view;
            if (u00Var.f29554w) {
                ValueAnimator valueAnimator = u00Var.f29535a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    u00Var.f29535a.removeAllUpdateListeners();
                    u00Var.f29535a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new n00(u00Var, 0));
                ofFloat.addListener(new l6(u00Var, 24));
                u00Var.f29535a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s4.b1 b1Var) {
        super.f(b1Var);
        View view = b1Var.f44838a;
        view.setTranslationX(0.0f);
        if (view instanceof u00) {
            ((u00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f44902p.isEmpty();
        boolean isEmpty2 = this.f44904r.isEmpty();
        boolean isEmpty3 = this.f44905s.isEmpty();
        boolean isEmpty4 = this.f44903q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new n6(this, 24));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(s4.b1 b1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ?? r32;
        boolean z10;
        int i17;
        String str;
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
        int i21;
        boolean z16;
        float f7;
        int i22;
        int i23;
        float f10;
        boolean z17;
        boolean z18;
        int i24;
        View view = b1Var.f44838a;
        if (view instanceof u00) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(b1Var);
            int i25 = i12 - translationX;
            int i26 = i13 - translationY;
            if (i25 != 0) {
                view.setTranslationX(-i25);
            }
            if (i26 != 0) {
                view.setTranslationY(-i26);
            }
            u00 u00Var = (u00) view;
            w00 w00Var = u00Var.m0;
            TextPaint textPaint = w00Var.f30697b;
            TextPaint textPaint2 = w00Var.f30699c;
            int i27 = u00Var.f29537b.d;
            int i28 = u00Var.I;
            if (i27 != i28) {
                u00Var.H = true;
                u00Var.J = i28;
                u00Var.f29544f0 = u00Var.f29541d0;
                u00Var.f29545g0 = u00Var.f29542e0;
                if (i28 > 0 && i27 > 0) {
                    String valueOf = String.valueOf(i28);
                    String valueOf2 = String.valueOf(u00Var.f29537b.d);
                    if (valueOf.length() == valueOf2.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                        int i29 = 0;
                        while (i29 < valueOf.length()) {
                            int i30 = translationX;
                            if (valueOf.charAt(i29) == valueOf2.charAt(i29)) {
                                i24 = translationY;
                                int i31 = i29 + 1;
                                spannableStringBuilder.setSpan(new xz(false), i29, i31, 0);
                                spannableStringBuilder2.setSpan(new xz(false), i29, i31, 0);
                            } else {
                                i24 = translationY;
                                spannableStringBuilder3.setSpan(new xz(false), i29, i29 + 1, 0);
                            }
                            i29++;
                            translationY = i24;
                            translationX = i30;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        u00Var.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        u00Var.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        u00Var.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        u00Var.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        u00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z17 = true;
                    z18 = false;
                }
                z10 = z17;
                i16 = z17;
                r32 = z18;
            } else {
                i14 = translationX;
                i15 = translationY;
                i16 = 1;
                r32 = 0;
                z10 = false;
            }
            int i32 = u00Var.f29537b.d;
            if (i32 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i32);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                i17 = r32;
                str = null;
            }
            int i33 = u00Var.f29537b.f28980c;
            if (i17 != 0) {
                if (str != null) {
                    f10 = 1.0f;
                } else {
                    f10 = w00Var.f30723w;
                }
                i18 = AndroidUtilities.dp(f10 * 6.0f) + i17;
            } else {
                i18 = r32;
            }
            int i34 = i18 + i33;
            float f11 = u00Var.E;
            if ((u00Var.getMeasuredWidth() - i34) / 2 != f11) {
                u00Var.G = i16;
                u00Var.F = f11;
                z11 = i16;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = u00Var.N;
            if (charSequence3 != null && !u00Var.f29537b.f28979b.equals(charSequence3)) {
                if (u00Var.N.length() > u00Var.f29537b.f28979b.length()) {
                    charSequence = u00Var.N;
                    charSequence2 = u00Var.f29537b.f28979b;
                    z14 = i16;
                } else {
                    charSequence = u00Var.f29537b.f28979b;
                    charSequence2 = u00Var.N;
                    z14 = r32;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new xz((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new xz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new xz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i35 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    u00Var.P = staticLayout;
                    if (u00Var.f29550l0) {
                        if (u00Var.f29537b.f28982g) {
                            i23 = 26;
                        } else {
                            i23 = i35 == 1 ? 1 : 0;
                        }
                        x5 x5Var = u00Var.O;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i35 == 1 ? 1 : 0] = staticLayout;
                        u00Var.O = b6.update(i23, u00Var, x5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    u00Var.T = staticLayout2;
                    if (u00Var.f29550l0) {
                        if (u00Var.f29537b.f28982g) {
                            i22 = 26;
                        } else {
                            i22 = i35 == 1 ? 1 : 0;
                        }
                        x5 x5Var2 = u00Var.S;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i35 == 1 ? 1 : 0] = staticLayout2;
                        u00Var.S = b6.update(i22, u00Var, x5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    u00Var.U = z16;
                    u00Var.V = z19;
                    if (charSequenceIndexOf == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = -u00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    u00Var.f29536a0 = f7;
                    u00Var.f29540c0 = u00Var.f29538b0;
                    u00Var.R = null;
                    b6.release(u00Var, u00Var.Q);
                    i21 = i35;
                } else {
                    int i36 = r32;
                    CharSequence charSequence4 = u00Var.f29537b.f28979b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    u00Var.P = staticLayout3;
                    if (u00Var.f29550l0) {
                        if (u00Var.f29537b.f28982g) {
                            i20 = 26;
                        } else {
                            i20 = i36;
                        }
                        x5 x5Var3 = u00Var.O;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i36] = staticLayout3;
                        u00Var.O = b6.update(i20, u00Var, x5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(u00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    u00Var.R = staticLayout4;
                    if (u00Var.f29550l0) {
                        if (u00Var.f29537b.f28982g) {
                            i19 = 26;
                        } else {
                            i19 = i36;
                        }
                        x5 x5Var4 = u00Var.Q;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i36] = staticLayout4;
                        u00Var.Q = b6.update(i19, u00Var, x5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    u00Var.T = null;
                    b6.release(u00Var, u00Var.S);
                    u00Var.U = z15;
                    u00Var.f29536a0 = 0.0f;
                    u00Var.f29540c0 = u00Var.f29538b0;
                    i21 = i36;
                }
                z11 = true;
                z12 = i21;
            } else {
                z12 = r32;
            }
            if (i34 != u00Var.f29546h0 || u00Var.getMeasuredWidth() != u00Var.f29548j0) {
                z13 = true;
                u00Var.W = true;
                u00Var.f29547i0 = u00Var.f29546h0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                u00Var.f29555x = 0.0f;
                u00Var.f29554w = z13;
                w00 w00Var2 = this.F;
                w00Var2.F.invalidate();
                w00Var2.invalidate();
            }
            if (i25 == 0 && i26 == 0 && !z11) {
                v(b1Var);
                return z12;
            }
            this.f44904r.add(new s4.j(b1Var, i14, i15, i12, i13));
            return z13;
        }
        return super.r(b1Var, v0Var, i10, i11, i12, i13);
    }

    @Override
    public final void x(s4.b1 b1Var) {
        b1Var.f44838a.setTranslationX(0.0f);
        View view = b1Var.f44838a;
        if (view instanceof u00) {
            ((u00) view).a();
        }
    }
}
