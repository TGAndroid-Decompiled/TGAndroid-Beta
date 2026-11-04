package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class vy extends u4.k {
    public final bz F;

    public vy(bz bzVar) {
        this.F = bzVar;
    }

    @Override
    public final void C(u4.d1 d1Var, u4.j jVar) {
        super.C(d1Var, jVar);
        View view = d1Var.f55540a;
        if (view instanceof zy) {
            zy zyVar = (zy) view;
            if (zyVar.f41168x) {
                ValueAnimator valueAnimator = zyVar.f41146a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    zyVar.f41146a.removeAllUpdateListeners();
                    zyVar.f41146a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new uy(zyVar, 0));
                ofFloat.addListener(new x5(zyVar, 26));
                zyVar.f41146a = ofFloat;
                ofFloat.setDuration(this.f55617e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(u4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.f55540a;
        view.setTranslationX(0.0f);
        if (view instanceof zy) {
            ((zy) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f55598p.isEmpty();
        boolean isEmpty2 = this.f55600r.isEmpty();
        boolean isEmpty3 = this.f55601s.isEmpty();
        boolean isEmpty4 = this.f55599q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new c6(this, 23));
            ofFloat.setDuration(this.f55617e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(u4.d1 d1Var, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
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
        View view = d1Var.f55540a;
        if (view instanceof zy) {
            int translationX = i3 + ((int) view.getTranslationX());
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
            zy zyVar = (zy) view;
            bz bzVar = zyVar.f41164n0;
            TextPaint textPaint = bzVar.f32444b;
            TextPaint textPaint2 = bzVar.f32446c;
            int i26 = zyVar.f41148b.d;
            int i27 = zyVar.J;
            if (i26 != i27) {
                zyVar.I = true;
                zyVar.K = i27;
                zyVar.f41157g0 = zyVar.f41154e0;
                zyVar.f41158h0 = zyVar.f41156f0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(zyVar.f41148b.d);
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
                                spannableStringBuilder.setSpan(new fy(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new fy(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new fy(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i13 = translationX;
                        i14 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        zyVar.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        zyVar.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        zyVar.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i13 = translationX;
                        i14 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        zyVar.M = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        zyVar.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i31 = zyVar.f41148b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i15];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
            } else {
                i16 = r32;
                str = null;
            }
            int i32 = zyVar.f41148b.f40855c;
            if (i16 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = bzVar.f32473x;
                }
                i17 = org.telegram.messenger.g0.L(f11 * 6.0f) + i16;
            } else {
                i17 = r32;
            }
            int i33 = i17 + i32;
            float f12 = zyVar.F;
            if ((zyVar.getMeasuredWidth() - i33) / 2 != f12) {
                zyVar.H = i15;
                zyVar.G = f12;
                z11 = i15;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = zyVar.O;
            if (charSequence3 != null && !zyVar.f41148b.f40854b.equals(charSequence3)) {
                if (zyVar.O.length() > zyVar.f41148b.f40854b.length()) {
                    charSequence = zyVar.O;
                    charSequence2 = zyVar.f41148b.f40854b;
                    z14 = i15;
                } else {
                    charSequence = zyVar.f41148b.f40854b;
                    charSequence2 = zyVar.O;
                    z14 = r32;
                }
                int t10 = org.telegram.messenger.g0.t(charSequence, charSequence2);
                if (t10 >= 0) {
                    CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                    if (t10 != 0) {
                        spannableStringBuilder5.setSpan(new fy((boolean) r32), r32, t10, r32);
                    }
                    if (charSequence2.length() + t10 != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new fy((boolean) r32), charSequence2.length() + t10, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new fy((boolean) r32), t10, charSequence2.length() + t10, r32);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i34 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    zyVar.Q = staticLayout;
                    if (zyVar.m0) {
                        if (zyVar.f41148b.f40858g) {
                            i22 = 26;
                        } else {
                            i22 = i34 == 1 ? 1 : 0;
                        }
                        l5 l5Var = zyVar.P;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i34 == 1 ? 1 : 0] = staticLayout;
                        zyVar.P = p5.update(i22, zyVar, l5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    zyVar.U = staticLayout2;
                    if (zyVar.m0) {
                        if (zyVar.f41148b.f40858g) {
                            i21 = 26;
                        } else {
                            i21 = i34 == 1 ? 1 : 0;
                        }
                        l5 l5Var2 = zyVar.T;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i34 == 1 ? 1 : 0] = staticLayout2;
                        zyVar.T = p5.update(i21, zyVar, l5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    zyVar.V = z16;
                    zyVar.W = z19;
                    if (t10 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -zyVar.U.getPrimaryHorizontal(t10);
                    }
                    zyVar.f41149b0 = f10;
                    zyVar.f41152d0 = zyVar.f41151c0;
                    zyVar.S = null;
                    p5.release(zyVar, zyVar.R);
                    i20 = i34;
                } else {
                    int i35 = r32;
                    CharSequence charSequence4 = zyVar.f41148b.f40854b;
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                    zyVar.Q = staticLayout3;
                    if (zyVar.m0) {
                        if (zyVar.f41148b.f40858g) {
                            i19 = 26;
                        } else {
                            i19 = i35;
                        }
                        l5 l5Var3 = zyVar.P;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i35] = staticLayout3;
                        zyVar.P = p5.update(i19, zyVar, l5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(zyVar.O, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                    zyVar.S = staticLayout4;
                    if (zyVar.m0) {
                        if (zyVar.f41148b.f40858g) {
                            i18 = 26;
                        } else {
                            i18 = i35;
                        }
                        l5 l5Var4 = zyVar.R;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i35] = staticLayout4;
                        zyVar.R = p5.update(i18, zyVar, l5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    zyVar.U = null;
                    p5.release(zyVar, zyVar.T);
                    zyVar.V = z15;
                    zyVar.f41149b0 = 0.0f;
                    zyVar.f41152d0 = zyVar.f41151c0;
                    i20 = i35;
                }
                z11 = true;
                z12 = i20;
            } else {
                z12 = r32;
            }
            if (i33 != zyVar.f41159i0 || zyVar.getMeasuredWidth() != zyVar.f41161k0) {
                z13 = true;
                zyVar.f41147a0 = true;
                zyVar.f41160j0 = zyVar.f41159i0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                zyVar.f41169y = 0.0f;
                zyVar.f41168x = z13;
                bz bzVar2 = this.F;
                bzVar2.G.invalidate();
                bzVar2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z11) {
                v(d1Var);
                return z12;
            }
            this.f55600r.add(new u4.j(d1Var, i13, i14, i11, i12));
            return z13;
        }
        return super.r(d1Var, t0Var, i3, i10, i11, i12);
    }

    @Override
    public final void x(u4.d1 d1Var) {
        d1Var.f55540a.setTranslationX(0.0f);
        View view = d1Var.f55540a;
        if (view instanceof zy) {
            ((zy) view).a();
        }
    }
}
