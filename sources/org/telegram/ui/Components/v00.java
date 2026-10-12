package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class v00 extends s4.j {
    public final d10 F;

    public v00(d10 d10Var) {
        this.F = d10Var;
    }

    @Override
    public final void C(s4.d1 d1Var, s4.i iVar) {
        super.C(d1Var, iVar);
        View view = d1Var.f47897a;
        if (view instanceof b10) {
            b10 b10Var = (b10) view;
            if (b10Var.f24533w) {
                ValueAnimator valueAnimator = b10Var.f24513a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    b10Var.f24513a.removeAllUpdateListeners();
                    b10Var.f24513a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new u00(b10Var, 0));
                ofFloat.addListener(new t8(b10Var, 21));
                b10Var.f24513a = ofFloat;
                ofFloat.setDuration(this.f47990e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.f47897a;
        view.setTranslationX(0.0f);
        if (view instanceof b10) {
            ((b10) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47958p.isEmpty();
        boolean isEmpty2 = this.f47960r.isEmpty();
        boolean isEmpty3 = this.f47961s.isEmpty();
        boolean isEmpty4 = this.f47959q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new m6(this, 24));
            ofFloat.setDuration(this.f47990e);
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
        View view = d1Var.f47897a;
        if (view instanceof b10) {
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
            b10 b10Var = (b10) view;
            d10 d10Var = b10Var.m0;
            TextPaint textPaint = d10Var.f25157b;
            TextPaint textPaint2 = d10Var.f25159c;
            int i27 = b10Var.f24515b.d;
            int i28 = b10Var.I;
            if (i27 != i28) {
                b10Var.H = true;
                b10Var.J = i28;
                b10Var.f24523f0 = b10Var.f24519d0;
                b10Var.f24524g0 = b10Var.f24521e0;
                if (i28 > 0 && i27 > 0) {
                    String valueOf = String.valueOf(i28);
                    String valueOf2 = String.valueOf(b10Var.f24515b.d);
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
                                spannableStringBuilder.setSpan(new e00(false), i29, i31, 0);
                                spannableStringBuilder2.setSpan(new e00(false), i29, i31, 0);
                            } else {
                                i24 = translationY;
                                spannableStringBuilder3.setSpan(new e00(false), i29, i29 + 1, 0);
                            }
                            i29++;
                            translationY = i24;
                            translationX = i30;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        b10Var.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        b10Var.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        b10Var.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        b10Var.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        b10Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i32 = b10Var.f24515b.d;
            if (i32 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i32);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                i17 = r32;
                str = null;
            }
            int i33 = b10Var.f24515b.f33242c;
            if (i17 != 0) {
                if (str != null) {
                    f10 = 1.0f;
                } else {
                    f10 = d10Var.f25184w;
                }
                i18 = AndroidUtilities.dp(f10 * 6.0f) + i17;
            } else {
                i18 = r32;
            }
            int i34 = i18 + i33;
            float f11 = b10Var.E;
            if ((b10Var.getMeasuredWidth() - i34) / 2 != f11) {
                b10Var.G = i16;
                b10Var.F = f11;
                z11 = i16;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = b10Var.N;
            if (charSequence3 != null && !b10Var.f24515b.f33241b.equals(charSequence3)) {
                if (b10Var.N.length() > b10Var.f24515b.f33241b.length()) {
                    charSequence = b10Var.N;
                    charSequence2 = b10Var.f24515b.f33241b;
                    z14 = i16;
                } else {
                    charSequence = b10Var.f24515b.f33241b;
                    charSequence2 = b10Var.N;
                    z14 = r32;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new e00((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new e00((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new e00((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i35 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    b10Var.P = staticLayout;
                    if (b10Var.f24529l0) {
                        if (b10Var.f24515b.f33245g) {
                            i23 = 26;
                        } else {
                            i23 = i35 == 1 ? 1 : 0;
                        }
                        x5 x5Var = b10Var.O;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i35 == 1 ? 1 : 0] = staticLayout;
                        b10Var.O = b6.update(i23, b10Var, x5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    b10Var.T = staticLayout2;
                    if (b10Var.f24529l0) {
                        if (b10Var.f24515b.f33245g) {
                            i22 = 26;
                        } else {
                            i22 = i35 == 1 ? 1 : 0;
                        }
                        x5 x5Var2 = b10Var.S;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i35 == 1 ? 1 : 0] = staticLayout2;
                        b10Var.S = b6.update(i22, b10Var, x5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    b10Var.U = z16;
                    b10Var.V = z19;
                    if (charSequenceIndexOf == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = -b10Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    b10Var.f24514a0 = f7;
                    b10Var.f24518c0 = b10Var.f24516b0;
                    b10Var.R = null;
                    b6.release(b10Var, b10Var.Q);
                    i21 = i35;
                } else {
                    int i36 = r32;
                    CharSequence charSequence4 = b10Var.f24515b.f33241b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    b10Var.P = staticLayout3;
                    if (b10Var.f24529l0) {
                        if (b10Var.f24515b.f33245g) {
                            i20 = 26;
                        } else {
                            i20 = i36;
                        }
                        x5 x5Var3 = b10Var.O;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i36] = staticLayout3;
                        b10Var.O = b6.update(i20, b10Var, x5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(b10Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    b10Var.R = staticLayout4;
                    if (b10Var.f24529l0) {
                        if (b10Var.f24515b.f33245g) {
                            i19 = 26;
                        } else {
                            i19 = i36;
                        }
                        x5 x5Var4 = b10Var.Q;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i36] = staticLayout4;
                        b10Var.Q = b6.update(i19, b10Var, x5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    b10Var.T = null;
                    b6.release(b10Var, b10Var.S);
                    b10Var.U = z15;
                    b10Var.f24514a0 = 0.0f;
                    b10Var.f24518c0 = b10Var.f24516b0;
                    i21 = i36;
                }
                z11 = true;
                z12 = i21;
            } else {
                z12 = r32;
            }
            if (i34 != b10Var.f24525h0 || b10Var.getMeasuredWidth() != b10Var.f24527j0) {
                z13 = true;
                b10Var.W = true;
                b10Var.f24526i0 = b10Var.f24525h0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                b10Var.f24534x = 0.0f;
                b10Var.f24533w = z13;
                d10 d10Var2 = this.F;
                d10Var2.F.invalidate();
                d10Var2.invalidate();
            }
            if (i25 == 0 && i26 == 0 && !z11) {
                v(d1Var);
                return z12;
            }
            this.f47960r.add(new s4.i(d1Var, i14, i15, i12, i13));
            return z13;
        }
        return super.r(d1Var, q0Var, i10, i11, i12, i13);
    }

    @Override
    public final void x(s4.d1 d1Var) {
        d1Var.f47897a.setTranslationX(0.0f);
        View view = d1Var.f47897a;
        if (view instanceof b10) {
            ((b10) view).a();
        }
    }
}
