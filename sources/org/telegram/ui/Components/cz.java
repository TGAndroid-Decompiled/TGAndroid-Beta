package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class cz extends v4.k {
    public final iz F;

    public cz(iz izVar) {
        this.F = izVar;
    }

    @Override
    public final void C(v4.e1 e1Var, v4.j jVar) {
        super.C(e1Var, jVar);
        View view = e1Var.f58535a;
        if (view instanceof gz) {
            gz gzVar = (gz) view;
            if (gzVar.f35125x) {
                ValueAnimator valueAnimator = gzVar.f35103a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    gzVar.f35103a.removeAllUpdateListeners();
                    gzVar.f35103a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new bz(gzVar, 0));
                ofFloat.addListener(new x5(gzVar, 26));
                gzVar.f35103a = ofFloat;
                ofFloat.setDuration(this.f58609e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(v4.e1 e1Var) {
        super.f(e1Var);
        View view = e1Var.f58535a;
        view.setTranslationX(0.0f);
        if (view instanceof gz) {
            ((gz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f58587p.isEmpty();
        boolean isEmpty2 = this.f58589r.isEmpty();
        boolean isEmpty3 = this.f58590s.isEmpty();
        boolean isEmpty4 = this.f58588q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new c6(this, 23));
            ofFloat.setDuration(this.f58609e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(v4.e1 e1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        ?? r32;
        boolean z10;
        int i16;
        String str;
        int i17;
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z14;
        boolean z15;
        int i18;
        int i19;
        int i20;
        boolean z16;
        float f10;
        int i21;
        int i22;
        float f11;
        boolean z17;
        boolean z18;
        int i23;
        View view = e1Var.f58535a;
        if (view instanceof gz) {
            int translationX = i7 + ((int) view.getTranslationX());
            int translationY = i10 + ((int) view.getTranslationY());
            R(e1Var);
            int i24 = i11 - translationX;
            int i25 = i12 - translationY;
            if (i24 != 0) {
                view.setTranslationX(-i24);
            }
            if (i25 != 0) {
                view.setTranslationY(-i25);
            }
            gz gzVar = (gz) view;
            iz izVar = gzVar.f35121n0;
            TextPaint textPaint = izVar.f35770b;
            TextPaint textPaint2 = izVar.f35772c;
            int i26 = gzVar.f35105b.d;
            int i27 = gzVar.J;
            if (i26 != i27) {
                gzVar.I = true;
                gzVar.K = i27;
                gzVar.f35114g0 = gzVar.f35111e0;
                gzVar.f35115h0 = gzVar.f35113f0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(gzVar.f35105b.d);
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
                                spannableStringBuilder.setSpan(new my(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new my(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new my(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i13 = translationX;
                        i14 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        gzVar.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        gzVar.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        gzVar.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i13 = translationX;
                        i14 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        gzVar.M = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        gzVar.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z17 = true;
                    z18 = false;
                }
                z10 = z17;
                i15 = z17;
                r32 = z18;
            } else {
                i13 = translationX;
                i14 = translationY;
                i15 = 1;
                r32 = 0;
                z10 = false;
            }
            int i31 = gzVar.f35105b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i15];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
            } else {
                i16 = r32;
                str = null;
            }
            int i32 = gzVar.f35105b.f34754c;
            if (i16 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = izVar.f35799x;
                }
                i17 = org.telegram.messenger.g0.L(f11 * 6.0f) + i16;
            } else {
                i17 = r32;
            }
            int i33 = i17 + i32;
            float f12 = gzVar.F;
            if ((gzVar.getMeasuredWidth() - i33) / 2 != f12) {
                gzVar.H = i15;
                gzVar.G = f12;
                z11 = i15;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = gzVar.O;
            if (charSequence3 != null && !gzVar.f35105b.f34753b.equals(charSequence3)) {
                if (gzVar.O.length() > gzVar.f35105b.f34753b.length()) {
                    charSequence = gzVar.O;
                    charSequence2 = gzVar.f35105b.f34753b;
                    z14 = i15;
                } else {
                    charSequence = gzVar.f35105b.f34753b;
                    charSequence2 = gzVar.O;
                    z14 = r32;
                }
                int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
                if (t6 >= 0) {
                    CharSequence m10 = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                    if (t6 != 0) {
                        spannableStringBuilder5.setSpan(new my((boolean) r32), r32, t6, r32);
                    }
                    if (charSequence2.length() + t6 != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new my((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new my((boolean) r32), t6, charSequence2.length() + t6, r32);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i34 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    gzVar.Q = staticLayout;
                    if (gzVar.m0) {
                        if (gzVar.f35105b.f34757g) {
                            i22 = 26;
                        } else {
                            i22 = i34 == 1 ? 1 : 0;
                        }
                        l5 l5Var = gzVar.P;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i34 == 1 ? 1 : 0] = staticLayout;
                        gzVar.P = p5.update(i22, gzVar, l5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    gzVar.U = staticLayout2;
                    if (gzVar.m0) {
                        if (gzVar.f35105b.f34757g) {
                            i21 = 26;
                        } else {
                            i21 = i34 == 1 ? 1 : 0;
                        }
                        l5 l5Var2 = gzVar.T;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i34 == 1 ? 1 : 0] = staticLayout2;
                        gzVar.T = p5.update(i21, gzVar, l5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    gzVar.V = z16;
                    gzVar.W = z19;
                    if (t6 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -gzVar.U.getPrimaryHorizontal(t6);
                    }
                    gzVar.f35106b0 = f10;
                    gzVar.f35109d0 = gzVar.f35108c0;
                    gzVar.S = null;
                    p5.release(gzVar, gzVar.R);
                    i20 = i34;
                } else {
                    int i35 = r32;
                    CharSequence charSequence4 = gzVar.f35105b.f34753b;
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                    gzVar.Q = staticLayout3;
                    if (gzVar.m0) {
                        if (gzVar.f35105b.f34757g) {
                            i19 = 26;
                        } else {
                            i19 = i35;
                        }
                        l5 l5Var3 = gzVar.P;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i35] = staticLayout3;
                        gzVar.P = p5.update(i19, gzVar, l5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(gzVar.O, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                    gzVar.S = staticLayout4;
                    if (gzVar.m0) {
                        if (gzVar.f35105b.f34757g) {
                            i18 = 26;
                        } else {
                            i18 = i35;
                        }
                        l5 l5Var4 = gzVar.R;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i35] = staticLayout4;
                        gzVar.R = p5.update(i18, gzVar, l5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    gzVar.U = null;
                    p5.release(gzVar, gzVar.T);
                    gzVar.V = z15;
                    gzVar.f35106b0 = 0.0f;
                    gzVar.f35109d0 = gzVar.f35108c0;
                    i20 = i35;
                }
                z11 = true;
                z12 = i20;
            } else {
                z12 = r32;
            }
            if (i33 != gzVar.f35116i0 || gzVar.getMeasuredWidth() != gzVar.f35118k0) {
                z13 = true;
                gzVar.f35104a0 = true;
                gzVar.f35117j0 = gzVar.f35116i0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                gzVar.f35126y = 0.0f;
                gzVar.f35125x = z13;
                iz izVar2 = this.F;
                izVar2.G.invalidate();
                izVar2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z11) {
                v(e1Var);
                return z12;
            }
            this.f58589r.add(new v4.j(e1Var, i13, i14, i11, i12));
            return z13;
        }
        return super.r(e1Var, r0Var, i7, i10, i11, i12);
    }

    @Override
    public final void x(v4.e1 e1Var) {
        e1Var.f58535a.setTranslationX(0.0f);
        View view = e1Var.f58535a;
        if (view instanceof gz) {
            ((gz) view).a();
        }
    }
}
