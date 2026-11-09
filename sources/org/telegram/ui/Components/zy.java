package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class zy extends v4.k {
    public final fz F;

    public zy(fz fzVar) {
        this.F = fzVar;
    }

    @Override
    public final void C(v4.d1 d1Var, v4.j jVar) {
        super.C(d1Var, jVar);
        View view = d1Var.f57056a;
        if (view instanceof dz) {
            dz dzVar = (dz) view;
            if (dzVar.f33228x) {
                ValueAnimator valueAnimator = dzVar.f33207a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    dzVar.f33207a.removeAllUpdateListeners();
                    dzVar.f33207a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yy(dzVar, 0));
                ofFloat.addListener(new z5(dzVar, 26));
                dzVar.f33207a = ofFloat;
                ofFloat.setDuration(this.f57129e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(v4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.f57056a;
        view.setTranslationX(0.0f);
        if (view instanceof dz) {
            ((dz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f57113p.isEmpty();
        boolean isEmpty2 = this.f57115r.isEmpty();
        boolean isEmpty3 = this.f57116s.isEmpty();
        boolean isEmpty4 = this.f57114q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new e6(this, 23));
            ofFloat.setDuration(this.f57129e);
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
        View view = d1Var.f57056a;
        if (view instanceof dz) {
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
            dz dzVar = (dz) view;
            fz fzVar = dzVar.m0;
            TextPaint textPaint = fzVar.f33767b;
            TextPaint textPaint2 = fzVar.f33769c;
            int i26 = dzVar.f33209b.d;
            int i27 = dzVar.I;
            if (i26 != i27) {
                dzVar.H = true;
                dzVar.J = i27;
                dzVar.f33217f0 = dzVar.f33213d0;
                dzVar.f33218g0 = dzVar.f33215e0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(dzVar.f33209b.d);
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
                                spannableStringBuilder.setSpan(new iy(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new iy(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new iy(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i13 = translationX;
                        i14 = translationY;
                        z17 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.l6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z16 = true;
                        dzVar.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        dzVar.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        dzVar.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i13 = translationX;
                        i14 = translationY;
                        z16 = true;
                        z17 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        dzVar.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.l6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        dzVar.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.l6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i31 = dzVar.f33209b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i15];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
            } else {
                i16 = r32;
                str = null;
            }
            int i32 = dzVar.f33209b.f32792c;
            if (i16 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = fzVar.f33796x;
                }
                i17 = org.telegram.messenger.g0.L(f11 * 6.0f) + i16;
            } else {
                i17 = r32;
            }
            int i33 = i17 + i32;
            float f12 = dzVar.E;
            if ((dzVar.getMeasuredWidth() - i33) / 2 != f12) {
                dzVar.G = i15;
                dzVar.F = f12;
                z10 = i15;
            } else {
                z10 = z9;
            }
            CharSequence charSequence3 = dzVar.N;
            if (charSequence3 != null && !dzVar.f33209b.f32791b.equals(charSequence3)) {
                if (dzVar.N.length() > dzVar.f33209b.f32791b.length()) {
                    charSequence = dzVar.N;
                    charSequence2 = dzVar.f33209b.f32791b;
                    z13 = i15;
                } else {
                    charSequence = dzVar.f33209b.f32791b;
                    charSequence2 = dzVar.N;
                    z13 = r32;
                }
                int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
                if (t6 >= 0) {
                    CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                    if (t6 != 0) {
                        spannableStringBuilder5.setSpan(new iy((boolean) r32), r32, t6, r32);
                    }
                    if (charSequence2.length() + t6 != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new iy((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new iy((boolean) r32), t6, charSequence2.length() + t6, r32);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    boolean z18 = z13;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i34 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    dzVar.P = staticLayout;
                    if (dzVar.f33223l0) {
                        if (dzVar.f33209b.f32795g) {
                            i22 = 26;
                        } else {
                            i22 = i34 == 1 ? 1 : 0;
                        }
                        n5 n5Var = dzVar.O;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i34 == 1 ? 1 : 0] = staticLayout;
                        dzVar.O = r5.update(i22, dzVar, n5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    dzVar.T = staticLayout2;
                    if (dzVar.f33223l0) {
                        if (dzVar.f33209b.f32795g) {
                            i21 = 26;
                        } else {
                            i21 = i34 == 1 ? 1 : 0;
                        }
                        n5 n5Var2 = dzVar.S;
                        z15 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i34 == 1 ? 1 : 0] = staticLayout2;
                        dzVar.S = r5.update(i21, dzVar, n5Var2, layoutArr2);
                    } else {
                        z15 = true;
                    }
                    dzVar.U = z15;
                    dzVar.V = z18;
                    if (t6 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -dzVar.T.getPrimaryHorizontal(t6);
                    }
                    dzVar.f33208a0 = f10;
                    dzVar.f33212c0 = dzVar.f33210b0;
                    dzVar.R = null;
                    r5.release(dzVar, dzVar.Q);
                    i20 = i34;
                } else {
                    int i35 = r32;
                    CharSequence charSequence4 = dzVar.f33209b.f32791b;
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                    dzVar.P = staticLayout3;
                    if (dzVar.f33223l0) {
                        if (dzVar.f33209b.f32795g) {
                            i19 = 26;
                        } else {
                            i19 = i35;
                        }
                        n5 n5Var3 = dzVar.O;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i35] = staticLayout3;
                        dzVar.O = r5.update(i19, dzVar, n5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(dzVar.N, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                    dzVar.R = staticLayout4;
                    if (dzVar.f33223l0) {
                        if (dzVar.f33209b.f32795g) {
                            i18 = 26;
                        } else {
                            i18 = i35;
                        }
                        n5 n5Var4 = dzVar.Q;
                        z14 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i35] = staticLayout4;
                        dzVar.Q = r5.update(i18, dzVar, n5Var4, layoutArr4);
                    } else {
                        z14 = true;
                    }
                    dzVar.T = null;
                    r5.release(dzVar, dzVar.S);
                    dzVar.U = z14;
                    dzVar.f33208a0 = 0.0f;
                    dzVar.f33212c0 = dzVar.f33210b0;
                    i20 = i35;
                }
                z10 = true;
                z11 = i20;
            } else {
                z11 = r32;
            }
            if (i33 != dzVar.f33219h0 || dzVar.getMeasuredWidth() != dzVar.f33221j0) {
                z12 = true;
                dzVar.W = true;
                dzVar.f33220i0 = dzVar.f33219h0;
                z10 = true;
            } else {
                z12 = true;
            }
            if (z10) {
                dzVar.f33229y = 0.0f;
                dzVar.f33228x = z12;
                fz fzVar2 = this.F;
                fzVar2.F.invalidate();
                fzVar2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z10) {
                v(d1Var);
                return z11;
            }
            this.f57115r.add(new v4.j(d1Var, i13, i14, i11, i12));
            return z12;
        }
        return super.r(d1Var, r0Var, i7, i10, i11, i12);
    }

    @Override
    public final void x(v4.d1 d1Var) {
        d1Var.f57056a.setTranslationX(0.0f);
        View view = d1Var.f57056a;
        if (view instanceof dz) {
            ((dz) view).a();
        }
    }
}
