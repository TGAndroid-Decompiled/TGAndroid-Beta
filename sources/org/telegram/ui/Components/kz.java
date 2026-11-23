package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class kz extends v4.k {
    public final rz F;

    public kz(rz rzVar) {
        this.F = rzVar;
    }

    @Override
    public final void C(v4.f1 f1Var, v4.j jVar) {
        super.C(f1Var, jVar);
        View view = f1Var.f59165a;
        if (view instanceof pz) {
            pz pzVar = (pz) view;
            if (pzVar.f38711x) {
                ValueAnimator valueAnimator = pzVar.f38689a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    pzVar.f38689a.removeAllUpdateListeners();
                    pzVar.f38689a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jz(pzVar, 0));
                ofFloat.addListener(new y(pzVar, 27));
                pzVar.f38689a = ofFloat;
                ofFloat.setDuration(this.f59239e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(v4.f1 f1Var) {
        super.f(f1Var);
        View view = f1Var.f59165a;
        view.setTranslationX(0.0f);
        if (view instanceof pz) {
            ((pz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f59213p.isEmpty();
        boolean isEmpty2 = this.f59215r.isEmpty();
        boolean isEmpty3 = this.f59216s.isEmpty();
        boolean isEmpty4 = this.f59214q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new x(this, 25));
            ofFloat.setDuration(this.f59239e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
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
        View view = f1Var.f59165a;
        if (view instanceof pz) {
            int translationX = i7 + ((int) view.getTranslationX());
            int translationY = i10 + ((int) view.getTranslationY());
            R(f1Var);
            int i24 = i11 - translationX;
            int i25 = i12 - translationY;
            if (i24 != 0) {
                view.setTranslationX(-i24);
            }
            if (i25 != 0) {
                view.setTranslationY(-i25);
            }
            pz pzVar = (pz) view;
            rz rzVar = pzVar.f38707n0;
            TextPaint textPaint = rzVar.f39392b;
            TextPaint textPaint2 = rzVar.f39394c;
            int i26 = pzVar.f38691b.d;
            int i27 = pzVar.J;
            if (i26 != i27) {
                pzVar.I = true;
                pzVar.K = i27;
                pzVar.f38700g0 = pzVar.f38697e0;
                pzVar.f38701h0 = pzVar.f38699f0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(pzVar.f38691b.d);
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
                                spannableStringBuilder.setSpan(new uy(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new uy(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new uy(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i13 = translationX;
                        i14 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        pzVar.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        pzVar.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        pzVar.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i13 = translationX;
                        i14 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        pzVar.M = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        pzVar.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i31 = pzVar.f38691b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i15];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
            } else {
                i16 = r32;
                str = null;
            }
            int i32 = pzVar.f38691b.f38417c;
            if (i16 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = rzVar.f39421x;
                }
                i17 = org.telegram.messenger.g0.L(f11 * 6.0f) + i16;
            } else {
                i17 = r32;
            }
            int i33 = i17 + i32;
            float f12 = pzVar.F;
            if ((pzVar.getMeasuredWidth() - i33) / 2 != f12) {
                pzVar.H = i15;
                pzVar.G = f12;
                z11 = i15;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = pzVar.O;
            if (charSequence3 != null && !pzVar.f38691b.f38416b.equals(charSequence3)) {
                if (pzVar.O.length() > pzVar.f38691b.f38416b.length()) {
                    charSequence = pzVar.O;
                    charSequence2 = pzVar.f38691b.f38416b;
                    z14 = i15;
                } else {
                    charSequence = pzVar.f38691b.f38416b;
                    charSequence2 = pzVar.O;
                    z14 = r32;
                }
                int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
                if (t6 >= 0) {
                    CharSequence m10 = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                    if (t6 != 0) {
                        spannableStringBuilder5.setSpan(new uy((boolean) r32), r32, t6, r32);
                    }
                    if (charSequence2.length() + t6 != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new uy((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new uy((boolean) r32), t6, charSequence2.length() + t6, r32);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i34 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    pzVar.Q = staticLayout;
                    if (pzVar.m0) {
                        if (pzVar.f38691b.f38420g) {
                            i22 = 26;
                        } else {
                            i22 = i34 == 1 ? 1 : 0;
                        }
                        u5 u5Var = pzVar.P;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i34 == 1 ? 1 : 0] = staticLayout;
                        pzVar.P = y5.update(i22, pzVar, u5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    pzVar.U = staticLayout2;
                    if (pzVar.m0) {
                        if (pzVar.f38691b.f38420g) {
                            i21 = 26;
                        } else {
                            i21 = i34 == 1 ? 1 : 0;
                        }
                        u5 u5Var2 = pzVar.T;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i34 == 1 ? 1 : 0] = staticLayout2;
                        pzVar.T = y5.update(i21, pzVar, u5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    pzVar.V = z16;
                    pzVar.W = z19;
                    if (t6 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -pzVar.U.getPrimaryHorizontal(t6);
                    }
                    pzVar.f38692b0 = f10;
                    pzVar.f38695d0 = pzVar.f38694c0;
                    pzVar.S = null;
                    y5.release(pzVar, pzVar.R);
                    i20 = i34;
                } else {
                    int i35 = r32;
                    CharSequence charSequence4 = pzVar.f38691b.f38416b;
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                    pzVar.Q = staticLayout3;
                    if (pzVar.m0) {
                        if (pzVar.f38691b.f38420g) {
                            i19 = 26;
                        } else {
                            i19 = i35;
                        }
                        u5 u5Var3 = pzVar.P;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i35] = staticLayout3;
                        pzVar.P = y5.update(i19, pzVar, u5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(pzVar.O, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                    pzVar.S = staticLayout4;
                    if (pzVar.m0) {
                        if (pzVar.f38691b.f38420g) {
                            i18 = 26;
                        } else {
                            i18 = i35;
                        }
                        u5 u5Var4 = pzVar.R;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i35] = staticLayout4;
                        pzVar.R = y5.update(i18, pzVar, u5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    pzVar.U = null;
                    y5.release(pzVar, pzVar.T);
                    pzVar.V = z15;
                    pzVar.f38692b0 = 0.0f;
                    pzVar.f38695d0 = pzVar.f38694c0;
                    i20 = i35;
                }
                z11 = true;
                z12 = i20;
            } else {
                z12 = r32;
            }
            if (i33 != pzVar.f38702i0 || pzVar.getMeasuredWidth() != pzVar.f38704k0) {
                z13 = true;
                pzVar.f38690a0 = true;
                pzVar.f38703j0 = pzVar.f38702i0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                pzVar.f38712y = 0.0f;
                pzVar.f38711x = z13;
                rz rzVar2 = this.F;
                rzVar2.G.invalidate();
                rzVar2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z11) {
                v(f1Var);
                return z12;
            }
            this.f59215r.add(new v4.j(f1Var, i13, i14, i11, i12));
            return z13;
        }
        return super.r(f1Var, r0Var, i7, i10, i11, i12);
    }

    @Override
    public final void x(v4.f1 f1Var) {
        f1Var.f59165a.setTranslationX(0.0f);
        View view = f1Var.f59165a;
        if (view instanceof pz) {
            ((pz) view).a();
        }
    }
}
