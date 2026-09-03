package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class d00 extends f2.l {
    public final k00 F;

    public d00(k00 k00Var) {
        this.F = k00Var;
    }

    @Override
    public final void C(f2.l1 l1Var, f2.k kVar) {
        super.C(l1Var, kVar);
        View view = l1Var.f5774a;
        if (view instanceof i00) {
            i00 i00Var = (i00) view;
            if (i00Var.f25549w) {
                ValueAnimator valueAnimator = i00Var.f25532a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    i00Var.f25532a.removeAllUpdateListeners();
                    i00Var.f25532a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new c00(i00Var, 0));
                ofFloat.addListener(new a9(i00Var, 20));
                i00Var.f25532a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(f2.l1 l1Var) {
        super.f(l1Var);
        View view = l1Var.f5774a;
        view.setTranslationX(0.0f);
        if (view instanceof i00) {
            ((i00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5763p.isEmpty();
        boolean isEmpty2 = this.f5765r.isEmpty();
        boolean isEmpty3 = this.f5766s.isEmpty();
        boolean isEmpty4 = this.f5764q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new f6(this, 23));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(f2.l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
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
        View view = l1Var.f5774a;
        if (view instanceof i00) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(l1Var);
            int i24 = i12 - translationX;
            int i25 = i13 - translationY;
            if (i24 != 0) {
                view.setTranslationX(-i24);
            }
            if (i25 != 0) {
                view.setTranslationY(-i25);
            }
            i00 i00Var = (i00) view;
            k00 k00Var = i00Var.f25545j0;
            TextPaint textPaint = k00Var.f26092b;
            TextPaint textPaint2 = k00Var.f26094c;
            int i26 = i00Var.f25534b.d;
            int i27 = i00Var.F;
            if (i26 != i27) {
                i00Var.E = true;
                i00Var.G = i27;
                i00Var.f25537c0 = i00Var.f25533a0;
                i00Var.f25538d0 = i00Var.f25535b0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(i00Var.f25534b.d);
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
                        z17 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z16 = true;
                        i00Var.I = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        i00Var.J = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        i00Var.H = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z16 = true;
                        z17 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        i00Var.I = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        i00Var.H = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i31 = i00Var.f25534b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i17 = 0;
            }
            int i32 = i00Var.f25534b.f25282c;
            if (i17 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = k00Var.f26118w;
                }
                i18 = AndroidUtilities.dp(f11 * 6.0f) + i17;
            } else {
                i18 = 0;
            }
            int i33 = i18 + i32;
            float f12 = i00Var.B;
            if ((i00Var.getMeasuredWidth() - i33) / 2 != f12) {
                i00Var.D = i16;
                i00Var.C = f12;
                z10 = true;
            } else {
                z10 = z4;
            }
            CharSequence charSequence3 = i00Var.K;
            if (charSequence3 != null && !i00Var.f25534b.f25281b.equals(charSequence3)) {
                if (i00Var.K.length() > i00Var.f25534b.f25281b.length()) {
                    charSequence = i00Var.K;
                    charSequence2 = i00Var.f25534b.f25281b;
                    z13 = true;
                } else {
                    charSequence = i00Var.f25534b.f25281b;
                    charSequence2 = i00Var.K;
                    z13 = false;
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
                    boolean z18 = z13;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z11 = false;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    i00Var.M = staticLayout;
                    if (i00Var.f25544i0) {
                        if (i00Var.f25534b.f25284g) {
                            i22 = 26;
                        } else {
                            i22 = 0;
                        }
                        i00Var.L = u5.update(i22, i00Var, i00Var.L, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    i00Var.Q = staticLayout2;
                    if (i00Var.f25544i0) {
                        if (i00Var.f25534b.f25284g) {
                            i21 = 26;
                        } else {
                            i21 = 0;
                        }
                        z15 = true;
                        i00Var.P = u5.update(i21, i00Var, i00Var.P, staticLayout2);
                    } else {
                        z15 = true;
                    }
                    i00Var.R = z15;
                    i00Var.S = z18;
                    if (charSequenceIndexOf == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -i00Var.Q.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    i00Var.U = f10;
                    i00Var.W = i00Var.V;
                    i00Var.O = null;
                    u5.release(i00Var, i00Var.N);
                } else {
                    z11 = false;
                    CharSequence charSequence4 = i00Var.f25534b.f25281b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    i00Var.M = staticLayout3;
                    if (i00Var.f25544i0) {
                        if (i00Var.f25534b.f25284g) {
                            i20 = 26;
                        } else {
                            i20 = 0;
                        }
                        i00Var.L = u5.update(i20, i00Var, i00Var.L, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(i00Var.K, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    i00Var.O = staticLayout4;
                    if (i00Var.f25544i0) {
                        if (i00Var.f25534b.f25284g) {
                            i19 = 26;
                        } else {
                            i19 = 0;
                        }
                        z14 = true;
                        i00Var.N = u5.update(i19, i00Var, i00Var.N, staticLayout4);
                    } else {
                        z14 = true;
                    }
                    i00Var.Q = null;
                    u5.release(i00Var, i00Var.P);
                    i00Var.R = z14;
                    i00Var.U = 0.0f;
                    i00Var.W = i00Var.V;
                }
                z10 = true;
            } else {
                z11 = false;
            }
            if (i33 != i00Var.f25539e0 || i00Var.getMeasuredWidth() != i00Var.f25542g0) {
                z12 = true;
                i00Var.T = true;
                i00Var.f25541f0 = i00Var.f25539e0;
                z10 = true;
            } else {
                z12 = true;
            }
            if (z10) {
                i00Var.f25550x = 0.0f;
                i00Var.f25549w = z12;
                k00 k00Var2 = this.F;
                k00Var2.C.invalidate();
                k00Var2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z10) {
                v(l1Var);
                return z11;
            }
            this.f5765r.add(new f2.k(l1Var, i14, i15, i12, i13));
            return z12;
        }
        return super.r(l1Var, eVar, i10, i11, i12, i13);
    }

    @Override
    public final void x(f2.l1 l1Var) {
        l1Var.f5774a.setTranslationX(0.0f);
        View view = l1Var.f5774a;
        if (view instanceof i00) {
            ((i00) view).a();
        }
    }
}
