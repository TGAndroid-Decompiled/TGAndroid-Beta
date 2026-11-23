package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class hz extends v4.l {
    public final oz F;

    public hz(oz ozVar) {
        this.F = ozVar;
    }

    @Override
    public final void C(v4.f1 f1Var, v4.k kVar) {
        super.C(f1Var, kVar);
        View view = f1Var.f59245a;
        if (view instanceof mz) {
            mz mzVar = (mz) view;
            if (mzVar.f37594x) {
                ValueAnimator valueAnimator = mzVar.f37572a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mzVar.f37572a.removeAllUpdateListeners();
                    mzVar.f37572a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gz(mzVar, 0));
                ofFloat.addListener(new x(mzVar, 27));
                mzVar.f37572a = ofFloat;
                ofFloat.setDuration(this.f59319e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(v4.f1 f1Var) {
        super.f(f1Var);
        View view = f1Var.f59245a;
        view.setTranslationX(0.0f);
        if (view instanceof mz) {
            ((mz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f59297p.isEmpty();
        boolean isEmpty2 = this.f59299r.isEmpty();
        boolean isEmpty3 = this.f59300s.isEmpty();
        boolean isEmpty4 = this.f59298q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new w(this, 25));
            ofFloat.setDuration(this.f59319e);
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
        View view = f1Var.f59245a;
        if (view instanceof mz) {
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
            mz mzVar = (mz) view;
            oz ozVar = mzVar.f37590n0;
            TextPaint textPaint = ozVar.f38291b;
            TextPaint textPaint2 = ozVar.f38293c;
            int i26 = mzVar.f37574b.d;
            int i27 = mzVar.J;
            if (i26 != i27) {
                mzVar.I = true;
                mzVar.K = i27;
                mzVar.f37583g0 = mzVar.f37580e0;
                mzVar.f37584h0 = mzVar.f37582f0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(mzVar.f37574b.d);
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
                                spannableStringBuilder.setSpan(new ry(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new ry(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new ry(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i13 = translationX;
                        i14 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.n6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        mzVar.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        mzVar.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        mzVar.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i13 = translationX;
                        i14 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        mzVar.M = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.n6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        mzVar.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.n6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i31 = mzVar.f37574b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i15];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
            } else {
                i16 = r32;
                str = null;
            }
            int i32 = mzVar.f37574b.f37263c;
            if (i16 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = ozVar.f38320x;
                }
                i17 = org.telegram.messenger.g0.L(f11 * 6.0f) + i16;
            } else {
                i17 = r32;
            }
            int i33 = i17 + i32;
            float f12 = mzVar.F;
            if ((mzVar.getMeasuredWidth() - i33) / 2 != f12) {
                mzVar.H = i15;
                mzVar.G = f12;
                z11 = i15;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = mzVar.O;
            if (charSequence3 != null && !mzVar.f37574b.f37262b.equals(charSequence3)) {
                if (mzVar.O.length() > mzVar.f37574b.f37262b.length()) {
                    charSequence = mzVar.O;
                    charSequence2 = mzVar.f37574b.f37262b;
                    z14 = i15;
                } else {
                    charSequence = mzVar.f37574b.f37262b;
                    charSequence2 = mzVar.O;
                    z14 = r32;
                }
                int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
                if (t6 >= 0) {
                    CharSequence m10 = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                    if (t6 != 0) {
                        spannableStringBuilder5.setSpan(new ry((boolean) r32), r32, t6, r32);
                    }
                    if (charSequence2.length() + t6 != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new ry((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new ry((boolean) r32), t6, charSequence2.length() + t6, r32);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i34 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    mzVar.Q = staticLayout;
                    if (mzVar.m0) {
                        if (mzVar.f37574b.f37266g) {
                            i22 = 26;
                        } else {
                            i22 = i34 == 1 ? 1 : 0;
                        }
                        t5 t5Var = mzVar.P;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i34 == 1 ? 1 : 0] = staticLayout;
                        mzVar.P = x5.update(i22, mzVar, t5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    mzVar.U = staticLayout2;
                    if (mzVar.m0) {
                        if (mzVar.f37574b.f37266g) {
                            i21 = 26;
                        } else {
                            i21 = i34 == 1 ? 1 : 0;
                        }
                        t5 t5Var2 = mzVar.T;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i34 == 1 ? 1 : 0] = staticLayout2;
                        mzVar.T = x5.update(i21, mzVar, t5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    mzVar.V = z16;
                    mzVar.W = z19;
                    if (t6 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -mzVar.U.getPrimaryHorizontal(t6);
                    }
                    mzVar.f37575b0 = f10;
                    mzVar.f37578d0 = mzVar.f37577c0;
                    mzVar.S = null;
                    x5.release(mzVar, mzVar.R);
                    i20 = i34;
                } else {
                    int i35 = r32;
                    CharSequence charSequence4 = mzVar.f37574b.f37262b;
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                    mzVar.Q = staticLayout3;
                    if (mzVar.m0) {
                        if (mzVar.f37574b.f37266g) {
                            i19 = 26;
                        } else {
                            i19 = i35;
                        }
                        t5 t5Var3 = mzVar.P;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i35] = staticLayout3;
                        mzVar.P = x5.update(i19, mzVar, t5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(mzVar.O, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                    mzVar.S = staticLayout4;
                    if (mzVar.m0) {
                        if (mzVar.f37574b.f37266g) {
                            i18 = 26;
                        } else {
                            i18 = i35;
                        }
                        t5 t5Var4 = mzVar.R;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i35] = staticLayout4;
                        mzVar.R = x5.update(i18, mzVar, t5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    mzVar.U = null;
                    x5.release(mzVar, mzVar.T);
                    mzVar.V = z15;
                    mzVar.f37575b0 = 0.0f;
                    mzVar.f37578d0 = mzVar.f37577c0;
                    i20 = i35;
                }
                z11 = true;
                z12 = i20;
            } else {
                z12 = r32;
            }
            if (i33 != mzVar.f37585i0 || mzVar.getMeasuredWidth() != mzVar.f37587k0) {
                z13 = true;
                mzVar.f37573a0 = true;
                mzVar.f37586j0 = mzVar.f37585i0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                mzVar.f37595y = 0.0f;
                mzVar.f37594x = z13;
                oz ozVar2 = this.F;
                ozVar2.G.invalidate();
                ozVar2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z11) {
                v(f1Var);
                return z12;
            }
            this.f59299r.add(new v4.k(f1Var, i13, i14, i11, i12));
            return z13;
        }
        return super.r(f1Var, r0Var, i7, i10, i11, i12);
    }

    @Override
    public final void x(v4.f1 f1Var) {
        f1Var.f59245a.setTranslationX(0.0f);
        View view = f1Var.f59245a;
        if (view instanceof mz) {
            ((mz) view).a();
        }
    }
}
