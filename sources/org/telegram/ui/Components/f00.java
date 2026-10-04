package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class f00 extends s4.j {
    public final n00 F;

    public f00(n00 n00Var) {
        this.F = n00Var;
    }

    @Override
    public final void C(s4.c1 c1Var, s4.i iVar) {
        super.C(c1Var, iVar);
        View view = c1Var.f46523a;
        if (view instanceof l00) {
            l00 l00Var = (l00) view;
            if (l00Var.f28236w) {
                ValueAnimator valueAnimator = l00Var.f28216a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    l00Var.f28216a.removeAllUpdateListeners();
                    l00Var.f28216a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e00(l00Var, 0));
                ofFloat.addListener(new r8(l00Var, 21));
                l00Var.f28216a = ofFloat;
                ofFloat.setDuration(this.f46614e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s4.c1 c1Var) {
        super.f(c1Var);
        View view = c1Var.f46523a;
        view.setTranslationX(0.0f);
        if (view instanceof l00) {
            ((l00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f46589p.isEmpty();
        boolean isEmpty2 = this.f46591r.isEmpty();
        boolean isEmpty3 = this.f46592s.isEmpty();
        boolean isEmpty4 = this.f46590q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new k6(this, 23));
            ofFloat.setDuration(this.f46614e);
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
        float f7;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z13;
        int i19;
        int i20;
        float f10;
        int i21;
        int i22;
        float f11;
        boolean z14;
        boolean z15;
        int i23;
        View view = c1Var.f46523a;
        if (view instanceof l00) {
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
            l00 l00Var = (l00) view;
            n00 n00Var = l00Var.m0;
            TextPaint textPaint = n00Var.f28765b;
            TextPaint textPaint2 = n00Var.f28767c;
            int i26 = l00Var.f28218b.d;
            int i27 = l00Var.I;
            if (i26 != i27) {
                l00Var.H = true;
                l00Var.J = i27;
                l00Var.f28226f0 = l00Var.f28222d0;
                l00Var.f28227g0 = l00Var.f28224e0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(l00Var.f28218b.d);
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
                                spannableStringBuilder.setSpan(new oz(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new oz(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new oz(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z15 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf));
                        TextPaint textPaint3 = n00Var.f28767c;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        l00Var.L = new StaticLayout(spannableStringBuilder, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                        l00Var.M = new StaticLayout(spannableStringBuilder3, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                        l00Var.K = new StaticLayout(spannableStringBuilder2, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                        z14 = true;
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z15 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        z14 = true;
                        l00Var.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        l00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z14 = true;
                    z15 = false;
                }
                z10 = true;
                i16 = z14;
                r32 = z15;
            } else {
                i14 = translationX;
                i15 = translationY;
                i16 = 1;
                r32 = 0;
                z10 = false;
            }
            int i31 = l00Var.f28218b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i17 = 0;
            }
            int i32 = l00Var.f28218b.f27545c;
            if (i17 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = n00Var.f28792w;
                }
                i18 = AndroidUtilities.dp(f11 * 6.0f) + i17;
            } else {
                i18 = 0;
            }
            int i33 = i18 + i32;
            float f12 = l00Var.E;
            if ((l00Var.getMeasuredWidth() - i33) / 2 != f12) {
                l00Var.G = i16;
                l00Var.F = f12;
                z11 = true;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = l00Var.N;
            if (charSequence3 != null && !l00Var.f28218b.f27544b.equals(charSequence3)) {
                if (l00Var.N.length() > l00Var.f28218b.f27544b.length()) {
                    charSequence = l00Var.N;
                    charSequence2 = l00Var.f28218b.f27544b;
                    z13 = true;
                } else {
                    charSequence = l00Var.f28218b.f27544b;
                    charSequence2 = l00Var.N;
                    z13 = false;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    TextPaint textPaint4 = n00Var.f28765b;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint4.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new oz((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new oz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new oz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint4, dp, alignment3, 1.0f, 0.0f, false);
                    l00Var.P = staticLayout;
                    if (l00Var.f28232l0) {
                        if (l00Var.f28218b.f27548g) {
                            i22 = 26;
                        } else {
                            i22 = 0;
                        }
                        v5 v5Var = l00Var.O;
                        Layout[] layoutArr = new Layout[i16];
                        layoutArr[r32] = staticLayout;
                        l00Var.O = z5.update(i22, l00Var, v5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint4, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    l00Var.T = staticLayout2;
                    if (l00Var.f28232l0) {
                        if (l00Var.f28218b.f27548g) {
                            i21 = 26;
                        } else {
                            i21 = 0;
                        }
                        v5 v5Var2 = l00Var.S;
                        Layout[] layoutArr2 = new Layout[i16];
                        layoutArr2[r32] = staticLayout2;
                        l00Var.S = z5.update(i21, l00Var, v5Var2, layoutArr2);
                    }
                    l00Var.U = i16;
                    l00Var.V = z13;
                    if (charSequenceIndexOf == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -l00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    l00Var.f28217a0 = f10;
                    l00Var.f28221c0 = l00Var.f28219b0;
                    l00Var.R = null;
                    z5.release(l00Var, l00Var.Q);
                    z12 = false;
                    f7 = 0.0f;
                } else {
                    CharSequence charSequence4 = l00Var.f28218b.f27544b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    z12 = false;
                    f7 = 0.0f;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    l00Var.P = staticLayout3;
                    if (l00Var.f28232l0) {
                        if (l00Var.f28218b.f27548g) {
                            i20 = 26;
                        } else {
                            i20 = 0;
                        }
                        v5 v5Var3 = l00Var.O;
                        Layout[] layoutArr3 = new Layout[i16];
                        layoutArr3[0] = staticLayout3;
                        l00Var.O = z5.update(i20, l00Var, v5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(l00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    l00Var.R = staticLayout4;
                    if (l00Var.f28232l0) {
                        if (l00Var.f28218b.f27548g) {
                            i19 = 26;
                        } else {
                            i19 = 0;
                        }
                        v5 v5Var4 = l00Var.Q;
                        Layout[] layoutArr4 = new Layout[i16];
                        layoutArr4[0] = staticLayout4;
                        l00Var.Q = z5.update(i19, l00Var, v5Var4, layoutArr4);
                    }
                    l00Var.T = null;
                    z5.release(l00Var, l00Var.S);
                    l00Var.U = i16;
                    l00Var.f28217a0 = 0.0f;
                    l00Var.f28221c0 = l00Var.f28219b0;
                }
                z11 = true;
            } else {
                z12 = false;
                f7 = 0.0f;
            }
            if (i33 != l00Var.f28228h0 || l00Var.getMeasuredWidth() != l00Var.f28230j0) {
                l00Var.W = i16;
                l00Var.f28229i0 = l00Var.f28228h0;
                z11 = true;
            }
            if (z11) {
                l00Var.f28237x = f7;
                l00Var.f28236w = i16;
                n00 n00Var2 = this.F;
                n00Var2.F.invalidate();
                n00Var2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z11) {
                v(c1Var);
                return z12;
            }
            this.f46591r.add(new s4.i(c1Var, i14, i15, i12, i13));
            return true;
        }
        return super.r(c1Var, q0Var, i10, i11, i12, i13);
    }

    @Override
    public final void x(s4.c1 c1Var) {
        c1Var.f46523a.setTranslationX(0.0f);
        View view = c1Var.f46523a;
        if (view instanceof l00) {
            ((l00) view).a();
        }
    }
}
