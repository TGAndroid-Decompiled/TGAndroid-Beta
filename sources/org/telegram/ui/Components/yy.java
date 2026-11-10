package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class yy extends v4.k {
    public final ez F;

    public yy(ez ezVar) {
        this.F = ezVar;
    }

    @Override
    public final void C(v4.d1 d1Var, v4.j jVar) {
        super.C(d1Var, jVar);
        View view = d1Var.f57052a;
        if (view instanceof cz) {
            cz czVar = (cz) view;
            if (czVar.f32825x) {
                ValueAnimator valueAnimator = czVar.f32804a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    czVar.f32804a.removeAllUpdateListeners();
                    czVar.f32804a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xy(czVar, 0));
                ofFloat.addListener(new y5(czVar, 26));
                czVar.f32804a = ofFloat;
                ofFloat.setDuration(this.f57125e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(v4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.f57052a;
        view.setTranslationX(0.0f);
        if (view instanceof cz) {
            ((cz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f57109p.isEmpty();
        boolean isEmpty2 = this.f57111r.isEmpty();
        boolean isEmpty3 = this.f57112s.isEmpty();
        boolean isEmpty4 = this.f57110q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new d6(this, 23));
            ofFloat.setDuration(this.f57125e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(v4.d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        ?? r32;
        boolean z9;
        int i16;
        String str;
        int i17;
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z13;
        boolean z14;
        int i18;
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
        View view = d1Var.f57052a;
        if (view instanceof cz) {
            int translationX = i7 + ((int) view.getTranslationX());
            int translationY = i10 + ((int) view.getTranslationY());
            R(d1Var);
            int i24 = i11 - translationX;
            int i25 = i12 - translationY;
            if (i24 != 0) {
                view.setTranslationX(-i24);
            }
            if (i25 != 0) {
                view.setTranslationY(-i25);
            }
            cz czVar = (cz) view;
            ez ezVar = czVar.m0;
            TextPaint textPaint = ezVar.f33365b;
            TextPaint textPaint2 = ezVar.f33367c;
            int i26 = czVar.f32806b.d;
            int i27 = czVar.I;
            if (i26 != i27) {
                czVar.H = true;
                czVar.J = i27;
                czVar.f32814f0 = czVar.f32810d0;
                czVar.f32815g0 = czVar.f32812e0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(czVar.f32806b.d);
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
                                spannableStringBuilder.setSpan(new hy(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new hy(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new hy(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i13 = translationX;
                        i14 = translationY;
                        z17 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z16 = true;
                        czVar.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        czVar.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        czVar.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i13 = translationX;
                        i14 = translationY;
                        z16 = true;
                        z17 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        czVar.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        czVar.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z16 = true;
                    z17 = false;
                }
                z9 = z16;
                i15 = z16;
                r32 = z17;
            } else {
                i13 = translationX;
                i14 = translationY;
                i15 = 1;
                r32 = 0;
                z9 = false;
            }
            int i31 = czVar.f32806b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i15];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
            } else {
                i16 = r32;
                str = null;
            }
            int i32 = czVar.f32806b.f32383c;
            if (i16 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = ezVar.f33394x;
                }
                i17 = org.telegram.messenger.g0.L(f11 * 6.0f) + i16;
            } else {
                i17 = r32;
            }
            int i33 = i17 + i32;
            float f12 = czVar.E;
            if ((czVar.getMeasuredWidth() - i33) / 2 != f12) {
                czVar.G = i15;
                czVar.F = f12;
                z10 = i15;
            } else {
                z10 = z9;
            }
            CharSequence charSequence3 = czVar.N;
            if (charSequence3 != null && !czVar.f32806b.f32382b.equals(charSequence3)) {
                if (czVar.N.length() > czVar.f32806b.f32382b.length()) {
                    charSequence = czVar.N;
                    charSequence2 = czVar.f32806b.f32382b;
                    z13 = i15;
                } else {
                    charSequence = czVar.f32806b.f32382b;
                    charSequence2 = czVar.N;
                    z13 = r32;
                }
                int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
                if (t6 >= 0) {
                    CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                    if (t6 != 0) {
                        spannableStringBuilder5.setSpan(new hy((boolean) r32), r32, t6, r32);
                    }
                    if (charSequence2.length() + t6 != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new hy((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new hy((boolean) r32), t6, charSequence2.length() + t6, r32);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    boolean z18 = z13;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i34 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    czVar.P = staticLayout;
                    if (czVar.f32820l0) {
                        if (czVar.f32806b.f32386g) {
                            i22 = 26;
                        } else {
                            i22 = i34 == 1 ? 1 : 0;
                        }
                        m5 m5Var = czVar.O;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i34 == 1 ? 1 : 0] = staticLayout;
                        czVar.O = q5.update(i22, czVar, m5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    czVar.T = staticLayout2;
                    if (czVar.f32820l0) {
                        if (czVar.f32806b.f32386g) {
                            i21 = 26;
                        } else {
                            i21 = i34 == 1 ? 1 : 0;
                        }
                        m5 m5Var2 = czVar.S;
                        z15 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i34 == 1 ? 1 : 0] = staticLayout2;
                        czVar.S = q5.update(i21, czVar, m5Var2, layoutArr2);
                    } else {
                        z15 = true;
                    }
                    czVar.U = z15;
                    czVar.V = z18;
                    if (t6 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -czVar.T.getPrimaryHorizontal(t6);
                    }
                    czVar.f32805a0 = f10;
                    czVar.f32809c0 = czVar.f32807b0;
                    czVar.R = null;
                    q5.release(czVar, czVar.Q);
                    i20 = i34;
                } else {
                    int i35 = r32;
                    CharSequence charSequence4 = czVar.f32806b.f32382b;
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                    czVar.P = staticLayout3;
                    if (czVar.f32820l0) {
                        if (czVar.f32806b.f32386g) {
                            i19 = 26;
                        } else {
                            i19 = i35;
                        }
                        m5 m5Var3 = czVar.O;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i35] = staticLayout3;
                        czVar.O = q5.update(i19, czVar, m5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(czVar.N, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                    czVar.R = staticLayout4;
                    if (czVar.f32820l0) {
                        if (czVar.f32806b.f32386g) {
                            i18 = 26;
                        } else {
                            i18 = i35;
                        }
                        m5 m5Var4 = czVar.Q;
                        z14 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i35] = staticLayout4;
                        czVar.Q = q5.update(i18, czVar, m5Var4, layoutArr4);
                    } else {
                        z14 = true;
                    }
                    czVar.T = null;
                    q5.release(czVar, czVar.S);
                    czVar.U = z14;
                    czVar.f32805a0 = 0.0f;
                    czVar.f32809c0 = czVar.f32807b0;
                    i20 = i35;
                }
                z10 = true;
                z11 = i20;
            } else {
                z11 = r32;
            }
            if (i33 != czVar.f32816h0 || czVar.getMeasuredWidth() != czVar.f32818j0) {
                z12 = true;
                czVar.W = true;
                czVar.f32817i0 = czVar.f32816h0;
                z10 = true;
            } else {
                z12 = true;
            }
            if (z10) {
                czVar.f32826y = 0.0f;
                czVar.f32825x = z12;
                ez ezVar2 = this.F;
                ezVar2.F.invalidate();
                ezVar2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z10) {
                v(d1Var);
                return z11;
            }
            this.f57111r.add(new v4.j(d1Var, i13, i14, i11, i12));
            return z12;
        }
        return super.r(d1Var, r0Var, i7, i10, i11, i12);
    }

    @Override
    public final void x(v4.d1 d1Var) {
        d1Var.f57052a.setTranslationX(0.0f);
        View view = d1Var.f57052a;
        if (view instanceof cz) {
            ((cz) view).a();
        }
    }
}
