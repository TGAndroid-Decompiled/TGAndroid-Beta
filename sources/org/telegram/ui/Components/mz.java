package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class mz extends s4.j {
    public final tz F;

    public mz(tz tzVar) {
        this.F = tzVar;
    }

    @Override
    public final void C(s4.c1 c1Var, s4.i iVar) {
        super.C(c1Var, iVar);
        View view = c1Var.f47898a;
        if (view instanceof rz) {
            rz rzVar = (rz) view;
            if (rzVar.f30067x) {
                ValueAnimator valueAnimator = rzVar.f30047a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    rzVar.f30047a.removeAllUpdateListeners();
                    rzVar.f30047a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lz(rzVar, 0));
                ofFloat.addListener(new w5(rzVar, 26));
                rzVar.f30047a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s4.c1 c1Var) {
        super.f(c1Var);
        View view = c1Var.f47898a;
        view.setTranslationX(0.0f);
        if (view instanceof rz) {
            ((rz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47946p.isEmpty();
        boolean isEmpty2 = this.f47948r.isEmpty();
        boolean isEmpty3 = this.f47949s.isEmpty();
        boolean isEmpty4 = this.f47947q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new a6(this, 23));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(s4.c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
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
        View view = c1Var.f47898a;
        if (view instanceof rz) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(c1Var);
            int i25 = i12 - translationX;
            int i26 = i13 - translationY;
            if (i25 != 0) {
                view.setTranslationX(-i25);
            }
            if (i26 != 0) {
                view.setTranslationY(-i26);
            }
            rz rzVar = (rz) view;
            tz tzVar = rzVar.m0;
            TextPaint textPaint = tzVar.f30703b;
            TextPaint textPaint2 = tzVar.f30705c;
            int i27 = rzVar.f30049b.d;
            int i28 = rzVar.I;
            if (i27 != i28) {
                rzVar.H = true;
                rzVar.J = i28;
                rzVar.f30056f0 = rzVar.f30053d0;
                rzVar.f30057g0 = rzVar.f30054e0;
                if (i28 > 0 && i27 > 0) {
                    String valueOf = String.valueOf(i28);
                    String valueOf2 = String.valueOf(rzVar.f30049b.d);
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
                                spannableStringBuilder.setSpan(new wy(false), i29, i31, 0);
                                spannableStringBuilder2.setSpan(new wy(false), i29, i31, 0);
                            } else {
                                i24 = translationY;
                                spannableStringBuilder3.setSpan(new wy(false), i29, i29 + 1, 0);
                            }
                            i29++;
                            translationY = i24;
                            translationX = i30;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.t6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        rzVar.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        rzVar.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        rzVar.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        rzVar.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.t6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        rzVar.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.t6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i32 = rzVar.f30049b.d;
            if (i32 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i32);
                str = String.format("%d", objArr);
                i17 = Math.max(org.telegram.messenger.i0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.i0.L(10.0f);
            } else {
                i17 = r32;
                str = null;
            }
            int i33 = rzVar.f30049b.f29473c;
            if (i17 != 0) {
                if (str != null) {
                    f10 = 1.0f;
                } else {
                    f10 = tzVar.f30731x;
                }
                i18 = org.telegram.messenger.i0.L(f10 * 6.0f) + i17;
            } else {
                i18 = r32;
            }
            int i34 = i18 + i33;
            float f11 = rzVar.E;
            if ((rzVar.getMeasuredWidth() - i34) / 2 != f11) {
                rzVar.G = i16;
                rzVar.F = f11;
                z11 = i16;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = rzVar.N;
            if (charSequence3 != null && !rzVar.f30049b.f29472b.equals(charSequence3)) {
                if (rzVar.N.length() > rzVar.f30049b.f29472b.length()) {
                    charSequence = rzVar.N;
                    charSequence2 = rzVar.f30049b.f29472b;
                    z14 = i16;
                } else {
                    charSequence = rzVar.f30049b.f29472b;
                    charSequence2 = rzVar.N;
                    z14 = r32;
                }
                int t10 = org.telegram.messenger.i0.t(charSequence, charSequence2);
                if (t10 >= 0) {
                    CharSequence m10 = org.telegram.messenger.k6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                    if (t10 != 0) {
                        spannableStringBuilder5.setSpan(new wy((boolean) r32), r32, t10, r32);
                    }
                    if (charSequence2.length() + t10 != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new wy((boolean) r32), charSequence2.length() + t10, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new wy((boolean) r32), t10, charSequence2.length() + t10, r32);
                    int L = org.telegram.messenger.i0.L(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i35 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    rzVar.P = staticLayout;
                    if (rzVar.f30062l0) {
                        if (rzVar.f30049b.f29475g) {
                            i23 = 26;
                        } else {
                            i23 = i35 == 1 ? 1 : 0;
                        }
                        k5 k5Var = rzVar.O;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i35 == 1 ? 1 : 0] = staticLayout;
                        rzVar.O = o5.update(i23, rzVar, k5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.i0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    rzVar.T = staticLayout2;
                    if (rzVar.f30062l0) {
                        if (rzVar.f30049b.f29475g) {
                            i22 = 26;
                        } else {
                            i22 = i35 == 1 ? 1 : 0;
                        }
                        k5 k5Var2 = rzVar.S;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i35 == 1 ? 1 : 0] = staticLayout2;
                        rzVar.S = o5.update(i22, rzVar, k5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    rzVar.U = z16;
                    rzVar.V = z19;
                    if (t10 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = -rzVar.T.getPrimaryHorizontal(t10);
                    }
                    rzVar.f30048a0 = f7;
                    rzVar.f30052c0 = rzVar.f30050b0;
                    rzVar.R = null;
                    o5.release(rzVar, rzVar.Q);
                    i21 = i35;
                } else {
                    int i36 = r32;
                    CharSequence charSequence4 = rzVar.f30049b.f29472b;
                    int L2 = org.telegram.messenger.i0.L(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                    rzVar.P = staticLayout3;
                    if (rzVar.f30062l0) {
                        if (rzVar.f30049b.f29475g) {
                            i20 = 26;
                        } else {
                            i20 = i36;
                        }
                        k5 k5Var3 = rzVar.O;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i36] = staticLayout3;
                        rzVar.O = o5.update(i20, rzVar, k5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(rzVar.N, textPaint, org.telegram.messenger.i0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                    rzVar.R = staticLayout4;
                    if (rzVar.f30062l0) {
                        if (rzVar.f30049b.f29475g) {
                            i19 = 26;
                        } else {
                            i19 = i36;
                        }
                        k5 k5Var4 = rzVar.Q;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i36] = staticLayout4;
                        rzVar.Q = o5.update(i19, rzVar, k5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    rzVar.T = null;
                    o5.release(rzVar, rzVar.S);
                    rzVar.U = z15;
                    rzVar.f30048a0 = 0.0f;
                    rzVar.f30052c0 = rzVar.f30050b0;
                    i21 = i36;
                }
                z11 = true;
                z12 = i21;
            } else {
                z12 = r32;
            }
            if (i34 != rzVar.f30058h0 || rzVar.getMeasuredWidth() != rzVar.f30060j0) {
                z13 = true;
                rzVar.W = true;
                rzVar.f30059i0 = rzVar.f30058h0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                rzVar.f30068y = 0.0f;
                rzVar.f30067x = z13;
                tz tzVar2 = this.F;
                tzVar2.F.invalidate();
                tzVar2.invalidate();
            }
            if (i25 == 0 && i26 == 0 && !z11) {
                v(c1Var);
                return z12;
            }
            this.f47948r.add(new s4.i(c1Var, i14, i15, i12, i13));
            return z13;
        }
        return super.r(c1Var, gVar, i10, i11, i12, i13);
    }

    @Override
    public final void x(s4.c1 c1Var) {
        c1Var.f47898a.setTranslationX(0.0f);
        View view = c1Var.f47898a;
        if (view instanceof rz) {
            ((rz) view).a();
        }
    }
}
