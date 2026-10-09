package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class s00 extends s4.j {
    public final a10 F;

    public s00(a10 a10Var) {
        this.F = a10Var;
    }

    @Override
    public final void C(s4.d1 d1Var, s4.i iVar) {
        super.C(d1Var, iVar);
        View view = d1Var.f47658a;
        if (view instanceof y00) {
            y00 y00Var = (y00) view;
            if (y00Var.f33085w) {
                ValueAnimator valueAnimator = y00Var.f33065a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    y00Var.f33065a.removeAllUpdateListeners();
                    y00Var.f33065a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r00(y00Var, 0));
                ofFloat.addListener(new t8(y00Var, 21));
                y00Var.f33065a = ofFloat;
                ofFloat.setDuration(this.f47751e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.f47658a;
        view.setTranslationX(0.0f);
        if (view instanceof y00) {
            ((y00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47719p.isEmpty();
        boolean isEmpty2 = this.f47721r.isEmpty();
        boolean isEmpty3 = this.f47722s.isEmpty();
        boolean isEmpty4 = this.f47720q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new m6(this, 24));
            ofFloat.setDuration(this.f47751e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
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
        View view = d1Var.f47658a;
        if (view instanceof y00) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(d1Var);
            int i25 = i12 - translationX;
            int i26 = i13 - translationY;
            if (i25 != 0) {
                view.setTranslationX(-i25);
            }
            if (i26 != 0) {
                view.setTranslationY(-i26);
            }
            y00 y00Var = (y00) view;
            a10 a10Var = y00Var.m0;
            TextPaint textPaint = a10Var.f24500b;
            TextPaint textPaint2 = a10Var.f24502c;
            int i27 = y00Var.f33067b.d;
            int i28 = y00Var.I;
            if (i27 != i28) {
                y00Var.H = true;
                y00Var.J = i28;
                y00Var.f33075f0 = y00Var.f33071d0;
                y00Var.f33076g0 = y00Var.f33073e0;
                if (i28 > 0 && i27 > 0) {
                    String valueOf = String.valueOf(i28);
                    String valueOf2 = String.valueOf(y00Var.f33067b.d);
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
                                spannableStringBuilder.setSpan(new b00(false), i29, i31, 0);
                                spannableStringBuilder2.setSpan(new b00(false), i29, i31, 0);
                            } else {
                                i24 = translationY;
                                spannableStringBuilder3.setSpan(new b00(false), i29, i29 + 1, 0);
                            }
                            i29++;
                            translationY = i24;
                            translationX = i30;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        y00Var.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        y00Var.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        y00Var.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        y00Var.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        y00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i32 = y00Var.f33067b.d;
            if (i32 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i32);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                i17 = r32;
                str = null;
            }
            int i33 = y00Var.f33067b.f32500c;
            if (i17 != 0) {
                if (str != null) {
                    f10 = 1.0f;
                } else {
                    f10 = a10Var.f24527w;
                }
                i18 = AndroidUtilities.dp(f10 * 6.0f) + i17;
            } else {
                i18 = r32;
            }
            int i34 = i18 + i33;
            float f11 = y00Var.E;
            if ((y00Var.getMeasuredWidth() - i34) / 2 != f11) {
                y00Var.G = i16;
                y00Var.F = f11;
                z11 = i16;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = y00Var.N;
            if (charSequence3 != null && !y00Var.f33067b.f32499b.equals(charSequence3)) {
                if (y00Var.N.length() > y00Var.f33067b.f32499b.length()) {
                    charSequence = y00Var.N;
                    charSequence2 = y00Var.f33067b.f32499b;
                    z14 = i16;
                } else {
                    charSequence = y00Var.f33067b.f32499b;
                    charSequence2 = y00Var.N;
                    z14 = r32;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new b00((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new b00((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new b00((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i35 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    y00Var.P = staticLayout;
                    if (y00Var.f33081l0) {
                        if (y00Var.f33067b.f32503g) {
                            i23 = 26;
                        } else {
                            i23 = i35 == 1 ? 1 : 0;
                        }
                        x5 x5Var = y00Var.O;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i35 == 1 ? 1 : 0] = staticLayout;
                        y00Var.O = b6.update(i23, y00Var, x5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    y00Var.T = staticLayout2;
                    if (y00Var.f33081l0) {
                        if (y00Var.f33067b.f32503g) {
                            i22 = 26;
                        } else {
                            i22 = i35 == 1 ? 1 : 0;
                        }
                        x5 x5Var2 = y00Var.S;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i35 == 1 ? 1 : 0] = staticLayout2;
                        y00Var.S = b6.update(i22, y00Var, x5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    y00Var.U = z16;
                    y00Var.V = z19;
                    if (charSequenceIndexOf == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = -y00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    y00Var.f33066a0 = f7;
                    y00Var.f33070c0 = y00Var.f33068b0;
                    y00Var.R = null;
                    b6.release(y00Var, y00Var.Q);
                    i21 = i35;
                } else {
                    int i36 = r32;
                    CharSequence charSequence4 = y00Var.f33067b.f32499b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    y00Var.P = staticLayout3;
                    if (y00Var.f33081l0) {
                        if (y00Var.f33067b.f32503g) {
                            i20 = 26;
                        } else {
                            i20 = i36;
                        }
                        x5 x5Var3 = y00Var.O;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i36] = staticLayout3;
                        y00Var.O = b6.update(i20, y00Var, x5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(y00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    y00Var.R = staticLayout4;
                    if (y00Var.f33081l0) {
                        if (y00Var.f33067b.f32503g) {
                            i19 = 26;
                        } else {
                            i19 = i36;
                        }
                        x5 x5Var4 = y00Var.Q;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i36] = staticLayout4;
                        y00Var.Q = b6.update(i19, y00Var, x5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    y00Var.T = null;
                    b6.release(y00Var, y00Var.S);
                    y00Var.U = z15;
                    y00Var.f33066a0 = 0.0f;
                    y00Var.f33070c0 = y00Var.f33068b0;
                    i21 = i36;
                }
                z11 = true;
                z12 = i21;
            } else {
                z12 = r32;
            }
            if (i34 != y00Var.f33077h0 || y00Var.getMeasuredWidth() != y00Var.f33079j0) {
                z13 = true;
                y00Var.W = true;
                y00Var.f33078i0 = y00Var.f33077h0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                y00Var.f33086x = 0.0f;
                y00Var.f33085w = z13;
                a10 a10Var2 = this.F;
                a10Var2.F.invalidate();
                a10Var2.invalidate();
            }
            if (i25 == 0 && i26 == 0 && !z11) {
                v(d1Var);
                return z12;
            }
            this.f47721r.add(new s4.i(d1Var, i14, i15, i12, i13));
            return z13;
        }
        return super.r(d1Var, q0Var, i10, i11, i12, i13);
    }

    @Override
    public final void x(s4.d1 d1Var) {
        d1Var.f47658a.setTranslationX(0.0f);
        View view = d1Var.f47658a;
        if (view instanceof y00) {
            ((y00) view).a();
        }
    }
}
