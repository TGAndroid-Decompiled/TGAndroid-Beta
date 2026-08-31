package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class e00 extends f2.l {
    public final l00 F;

    public e00(l00 l00Var) {
        this.F = l00Var;
    }

    @Override
    public final void C(f2.m1 m1Var, f2.k kVar) {
        super.C(m1Var, kVar);
        View view = m1Var.f5875a;
        if (view instanceof j00) {
            j00 j00Var = (j00) view;
            if (j00Var.f27960w) {
                ValueAnimator valueAnimator = j00Var.f27942a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    j00Var.f27942a.removeAllUpdateListeners();
                    j00Var.f27942a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d00(j00Var, 0));
                ofFloat.addListener(new a9(j00Var, 20));
                j00Var.f27942a = ofFloat;
                ofFloat.setDuration(this.f5931e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(f2.m1 m1Var) {
        super.f(m1Var);
        View view = m1Var.f5875a;
        view.setTranslationX(0.0f);
        if (view instanceof j00) {
            ((j00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5853p.isEmpty();
        boolean isEmpty2 = this.f5855r.isEmpty();
        boolean isEmpty3 = this.f5856s.isEmpty();
        boolean isEmpty4 = this.f5854q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new f6(this, 23));
            ofFloat.setDuration(this.f5931e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(f2.m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ?? r32;
        boolean z4;
        String str;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z13;
        boolean z14;
        int i19;
        int i20;
        boolean z15;
        float f10;
        int i21;
        int i22;
        float f11;
        boolean z16;
        boolean z17;
        int i23;
        View view = m1Var.f5875a;
        if (view instanceof j00) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(m1Var);
            int i24 = i12 - translationX;
            int i25 = i13 - translationY;
            if (i24 != 0) {
                view.setTranslationX(-i24);
            }
            if (i25 != 0) {
                view.setTranslationY(-i25);
            }
            j00 j00Var = (j00) view;
            l00 l00Var = j00Var.f27956j0;
            TextPaint textPaint = l00Var.f28488b;
            TextPaint textPaint2 = l00Var.f28490c;
            int i26 = j00Var.f27944b.d;
            int i27 = j00Var.F;
            if (i26 != i27) {
                j00Var.E = true;
                j00Var.G = i27;
                j00Var.f27947c0 = j00Var.f27943a0;
                j00Var.f27948d0 = j00Var.f27945b0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(j00Var.f27944b.d);
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
                                spannableStringBuilder.setSpan(new nz(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new nz(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new nz(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z17 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z16 = true;
                        j00Var.I = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        j00Var.J = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        j00Var.H = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z16 = true;
                        z17 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        j00Var.I = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        j00Var.H = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z16 = true;
                    z17 = false;
                }
                z4 = true;
                i16 = z16;
                r32 = z17;
            } else {
                i14 = translationX;
                i15 = translationY;
                i16 = 1;
                r32 = 0;
                z4 = false;
            }
            int i31 = j00Var.f27944b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i17 = 0;
            }
            int i32 = j00Var.f27944b.f27636c;
            if (i17 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = l00Var.f28515w;
                }
                i18 = AndroidUtilities.dp(f11 * 6.0f) + i17;
            } else {
                i18 = 0;
            }
            int i33 = i18 + i32;
            float f12 = j00Var.B;
            if ((j00Var.getMeasuredWidth() - i33) / 2 != f12) {
                j00Var.D = i16;
                j00Var.C = f12;
                z10 = true;
            } else {
                z10 = z4;
            }
            CharSequence charSequence3 = j00Var.K;
            if (charSequence3 != null && !j00Var.f27944b.f27635b.equals(charSequence3)) {
                if (j00Var.K.length() > j00Var.f27944b.f27635b.length()) {
                    charSequence = j00Var.K;
                    charSequence2 = j00Var.f27944b.f27635b;
                    z13 = true;
                } else {
                    charSequence = j00Var.f27944b.f27635b;
                    charSequence2 = j00Var.K;
                    z13 = false;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new nz((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new nz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new nz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z18 = z13;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z11 = false;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    j00Var.M = staticLayout;
                    if (j00Var.f27955i0) {
                        if (j00Var.f27944b.f27639g) {
                            i22 = 26;
                        } else {
                            i22 = 0;
                        }
                        j00Var.L = u5.update(i22, j00Var, j00Var.L, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    j00Var.Q = staticLayout2;
                    if (j00Var.f27955i0) {
                        if (j00Var.f27944b.f27639g) {
                            i21 = 26;
                        } else {
                            i21 = 0;
                        }
                        z15 = true;
                        j00Var.P = u5.update(i21, j00Var, j00Var.P, staticLayout2);
                    } else {
                        z15 = true;
                    }
                    j00Var.R = z15;
                    j00Var.S = z18;
                    if (charSequenceIndexOf == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -j00Var.Q.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    j00Var.U = f10;
                    j00Var.W = j00Var.V;
                    j00Var.O = null;
                    u5.release(j00Var, j00Var.N);
                } else {
                    z11 = false;
                    CharSequence charSequence4 = j00Var.f27944b.f27635b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    j00Var.M = staticLayout3;
                    if (j00Var.f27955i0) {
                        if (j00Var.f27944b.f27639g) {
                            i20 = 26;
                        } else {
                            i20 = 0;
                        }
                        j00Var.L = u5.update(i20, j00Var, j00Var.L, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(j00Var.K, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    j00Var.O = staticLayout4;
                    if (j00Var.f27955i0) {
                        if (j00Var.f27944b.f27639g) {
                            i19 = 26;
                        } else {
                            i19 = 0;
                        }
                        z14 = true;
                        j00Var.N = u5.update(i19, j00Var, j00Var.N, staticLayout4);
                    } else {
                        z14 = true;
                    }
                    j00Var.Q = null;
                    u5.release(j00Var, j00Var.P);
                    j00Var.R = z14;
                    j00Var.U = 0.0f;
                    j00Var.W = j00Var.V;
                }
                z10 = true;
            } else {
                z11 = false;
            }
            if (i33 != j00Var.f27950e0 || j00Var.getMeasuredWidth() != j00Var.f27953g0) {
                z12 = true;
                j00Var.T = true;
                j00Var.f27952f0 = j00Var.f27950e0;
                z10 = true;
            } else {
                z12 = true;
            }
            if (z10) {
                j00Var.f27961x = 0.0f;
                j00Var.f27960w = z12;
                l00 l00Var2 = this.F;
                l00Var2.C.invalidate();
                l00Var2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z10) {
                v(m1Var);
                return z11;
            }
            this.f5855r.add(new f2.k(m1Var, i14, i15, i12, i13));
            return z12;
        }
        return super.r(m1Var, eVar, i10, i11, i12, i13);
    }

    @Override
    public final void x(f2.m1 m1Var) {
        m1Var.f5875a.setTranslationX(0.0f);
        View view = m1Var.f5875a;
        if (view instanceof j00) {
            ((j00) view).a();
        }
    }
}
