package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class l00 extends s4.k {
    public final s00 F;

    public l00(s00 s00Var) {
        this.F = s00Var;
    }

    @Override
    public final void C(s4.b1 b1Var, s4.j jVar) {
        super.C(b1Var, jVar);
        View view = b1Var.f45917a;
        if (view instanceof q00) {
            q00 q00Var = (q00) view;
            if (q00Var.f29447w) {
                ValueAnimator valueAnimator = q00Var.f29428a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    q00Var.f29428a.removeAllUpdateListeners();
                    q00Var.f29428a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new k00(q00Var, 0));
                ofFloat.addListener(new org.telegram.ui.nq(q00Var, 26));
                q00Var.f29428a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s4.b1 b1Var) {
        super.f(b1Var);
        View view = b1Var.f45917a;
        view.setTranslationX(0.0f);
        if (view instanceof q00) {
            ((q00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f45981p.isEmpty();
        boolean isEmpty2 = this.f45983r.isEmpty();
        boolean isEmpty3 = this.f45984s.isEmpty();
        boolean isEmpty4 = this.f45982q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new l6(this, 24));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(s4.b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
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
        View view = b1Var.f45917a;
        if (view instanceof q00) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(b1Var);
            int i25 = i12 - translationX;
            int i26 = i13 - translationY;
            if (i25 != 0) {
                view.setTranslationX(-i25);
            }
            if (i26 != 0) {
                view.setTranslationY(-i26);
            }
            q00 q00Var = (q00) view;
            s00 s00Var = q00Var.m0;
            TextPaint textPaint = s00Var.f30066b;
            TextPaint textPaint2 = s00Var.f30068c;
            int i27 = q00Var.f29430b.d;
            int i28 = q00Var.I;
            if (i27 != i28) {
                q00Var.H = true;
                q00Var.J = i28;
                q00Var.f29437f0 = q00Var.f29434d0;
                q00Var.f29438g0 = q00Var.f29435e0;
                if (i28 > 0 && i27 > 0) {
                    String valueOf = String.valueOf(i28);
                    String valueOf2 = String.valueOf(q00Var.f29430b.d);
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
                                spannableStringBuilder.setSpan(new uz(false), i29, i31, 0);
                                spannableStringBuilder2.setSpan(new uz(false), i29, i31, 0);
                            } else {
                                i24 = translationY;
                                spannableStringBuilder3.setSpan(new uz(false), i29, i29 + 1, 0);
                            }
                            i29++;
                            translationY = i24;
                            translationX = i30;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        q00Var.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        q00Var.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        q00Var.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        q00Var.L = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        q00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.h6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
            int i32 = q00Var.f29430b.d;
            if (i32 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i32);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                i17 = r32;
                str = null;
            }
            int i33 = q00Var.f29430b.f29177c;
            if (i17 != 0) {
                if (str != null) {
                    f10 = 1.0f;
                } else {
                    f10 = s00Var.f30092w;
                }
                i18 = AndroidUtilities.dp(f10 * 6.0f) + i17;
            } else {
                i18 = r32;
            }
            int i34 = i18 + i33;
            float f11 = q00Var.E;
            if ((q00Var.getMeasuredWidth() - i34) / 2 != f11) {
                q00Var.G = i16;
                q00Var.F = f11;
                z11 = i16;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = q00Var.N;
            if (charSequence3 != null && !q00Var.f29430b.f29176b.equals(charSequence3)) {
                if (q00Var.N.length() > q00Var.f29430b.f29176b.length()) {
                    charSequence = q00Var.N;
                    charSequence2 = q00Var.f29430b.f29176b;
                    z14 = i16;
                } else {
                    charSequence = q00Var.f29430b.f29176b;
                    charSequence2 = q00Var.N;
                    z14 = r32;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new uz((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new uz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new uz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    int i35 = r32;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    q00Var.P = staticLayout;
                    if (q00Var.f29443l0) {
                        if (q00Var.f29430b.f29179g) {
                            i23 = 26;
                        } else {
                            i23 = i35 == 1 ? 1 : 0;
                        }
                        w5 w5Var = q00Var.O;
                        Layout[] layoutArr = new Layout[1];
                        layoutArr[i35 == 1 ? 1 : 0] = staticLayout;
                        q00Var.O = a6.update(i23, q00Var, w5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    q00Var.T = staticLayout2;
                    if (q00Var.f29443l0) {
                        if (q00Var.f29430b.f29179g) {
                            i22 = 26;
                        } else {
                            i22 = i35 == 1 ? 1 : 0;
                        }
                        w5 w5Var2 = q00Var.S;
                        z16 = true;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i35 == 1 ? 1 : 0] = staticLayout2;
                        q00Var.S = a6.update(i22, q00Var, w5Var2, layoutArr2);
                    } else {
                        z16 = true;
                    }
                    q00Var.U = z16;
                    q00Var.V = z19;
                    if (charSequenceIndexOf == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = -q00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    q00Var.f29429a0 = f7;
                    q00Var.f29433c0 = q00Var.f29431b0;
                    q00Var.R = null;
                    a6.release(q00Var, q00Var.Q);
                    i21 = i35;
                } else {
                    int i36 = r32;
                    CharSequence charSequence4 = q00Var.f29430b.f29176b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    q00Var.P = staticLayout3;
                    if (q00Var.f29443l0) {
                        if (q00Var.f29430b.f29179g) {
                            i20 = 26;
                        } else {
                            i20 = i36;
                        }
                        w5 w5Var3 = q00Var.O;
                        Layout[] layoutArr3 = new Layout[1];
                        layoutArr3[i36] = staticLayout3;
                        q00Var.O = a6.update(i20, q00Var, w5Var3, layoutArr3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(q00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    q00Var.R = staticLayout4;
                    if (q00Var.f29443l0) {
                        if (q00Var.f29430b.f29179g) {
                            i19 = 26;
                        } else {
                            i19 = i36;
                        }
                        w5 w5Var4 = q00Var.Q;
                        z15 = true;
                        Layout[] layoutArr4 = new Layout[1];
                        layoutArr4[i36] = staticLayout4;
                        q00Var.Q = a6.update(i19, q00Var, w5Var4, layoutArr4);
                    } else {
                        z15 = true;
                    }
                    q00Var.T = null;
                    a6.release(q00Var, q00Var.S);
                    q00Var.U = z15;
                    q00Var.f29429a0 = 0.0f;
                    q00Var.f29433c0 = q00Var.f29431b0;
                    i21 = i36;
                }
                z11 = true;
                z12 = i21;
            } else {
                z12 = r32;
            }
            if (i34 != q00Var.f29439h0 || q00Var.getMeasuredWidth() != q00Var.f29441j0) {
                z13 = true;
                q00Var.W = true;
                q00Var.f29440i0 = q00Var.f29439h0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                q00Var.f29448x = 0.0f;
                q00Var.f29447w = z13;
                s00 s00Var2 = this.F;
                s00Var2.F.invalidate();
                s00Var2.invalidate();
            }
            if (i25 == 0 && i26 == 0 && !z11) {
                v(b1Var);
                return z12;
            }
            this.f45983r.add(new s4.j(b1Var, i14, i15, i12, i13));
            return z13;
        }
        return super.r(b1Var, u0Var, i10, i11, i12, i13);
    }

    @Override
    public final void x(s4.b1 b1Var) {
        b1Var.f45917a.setTranslationX(0.0f);
        View view = b1Var.f45917a;
        if (view instanceof q00) {
            ((q00) view).a();
        }
    }
}
