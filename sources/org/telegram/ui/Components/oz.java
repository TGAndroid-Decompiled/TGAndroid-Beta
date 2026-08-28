package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class oz extends f2.n {
    public final vz F;

    public oz(vz vzVar) {
        this.F = vzVar;
    }

    @Override
    public final void C(f2.q1 q1Var, f2.m mVar) {
        super.C(q1Var, mVar);
        View view = q1Var.f5501a;
        if (view instanceof tz) {
            tz tzVar = (tz) view;
            if (tzVar.f32856w) {
                ValueAnimator valueAnimator = tzVar.f32839a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    tzVar.f32839a.removeAllUpdateListeners();
                    tzVar.f32839a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new nz(tzVar, 0));
                ofFloat.addListener(new org.telegram.ui.xp(tzVar, 27));
                tzVar.f32839a = ofFloat;
                ofFloat.setDuration(this.f5549e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(f2.q1 q1Var) {
        super.f(q1Var);
        View view = q1Var.f5501a;
        view.setTranslationX(0.0f);
        if (view instanceof tz) {
            ((tz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5450p.isEmpty();
        boolean isEmpty2 = this.f5452r.isEmpty();
        boolean isEmpty3 = this.f5453s.isEmpty();
        boolean isEmpty4 = this.f5451q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new e6(this, 23));
            ofFloat.setDuration(this.f5549e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(f2.q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        ?? r32;
        boolean z10;
        String str;
        int i16;
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
        boolean z16;
        float f10;
        int i20;
        int i21;
        float f11;
        boolean z17;
        boolean z18;
        int i22;
        View view = q1Var.f5501a;
        if (view instanceof tz) {
            int translationX = i9 + ((int) view.getTranslationX());
            int translationY = i10 + ((int) view.getTranslationY());
            R(q1Var);
            int i23 = i11 - translationX;
            int i24 = i12 - translationY;
            if (i23 != 0) {
                view.setTranslationX(-i23);
            }
            if (i24 != 0) {
                view.setTranslationY(-i24);
            }
            tz tzVar = (tz) view;
            vz vzVar = tzVar.f32852i0;
            TextPaint textPaint = vzVar.f34032b;
            TextPaint textPaint2 = vzVar.f34034c;
            int i25 = tzVar.f32841b.d;
            int i26 = tzVar.E;
            if (i25 != i26) {
                tzVar.D = true;
                tzVar.F = i26;
                tzVar.f32842b0 = tzVar.W;
                tzVar.f32844c0 = tzVar.f32840a0;
                if (i26 > 0 && i25 > 0) {
                    String valueOf = String.valueOf(i26);
                    String valueOf2 = String.valueOf(tzVar.f32841b.d);
                    if (valueOf.length() == valueOf2.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                        int i27 = 0;
                        while (i27 < valueOf.length()) {
                            int i28 = translationX;
                            if (valueOf.charAt(i27) == valueOf2.charAt(i27)) {
                                i22 = translationY;
                                int i29 = i27 + 1;
                                spannableStringBuilder.setSpan(new xy(false), i27, i29, 0);
                                spannableStringBuilder2.setSpan(new xy(false), i27, i29, 0);
                            } else {
                                i22 = translationY;
                                spannableStringBuilder3.setSpan(new xy(false), i27, i27 + 1, 0);
                            }
                            i27++;
                            translationY = i22;
                            translationX = i28;
                        }
                        i13 = translationX;
                        i14 = translationY;
                        z18 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.f6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z17 = true;
                        tzVar.H = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        tzVar.I = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        tzVar.G = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i13 = translationX;
                        i14 = translationY;
                        z17 = true;
                        z18 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        tzVar.H = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.f6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        tzVar.G = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.f6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z17 = true;
                    z18 = false;
                }
                z10 = true;
                i15 = z17;
                r32 = z18;
            } else {
                i13 = translationX;
                i14 = translationY;
                i15 = 1;
                r32 = 0;
                z10 = false;
            }
            int i30 = tzVar.f32841b.d;
            if (i30 > 0) {
                Object[] objArr = new Object[i15];
                objArr[r32] = Integer.valueOf(i30);
                str = String.format("%d", objArr);
                i16 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i16 = 0;
            }
            int i31 = tzVar.f32841b.f32574c;
            if (i16 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = vzVar.f34059w;
                }
                i17 = AndroidUtilities.dp(f11 * 6.0f) + i16;
            } else {
                i17 = 0;
            }
            int i32 = i17 + i31;
            float f12 = tzVar.A;
            if ((tzVar.getMeasuredWidth() - i32) / 2 != f12) {
                tzVar.C = i15;
                tzVar.B = f12;
                z11 = true;
            } else {
                z11 = z10;
            }
            CharSequence charSequence3 = tzVar.J;
            if (charSequence3 != null && !tzVar.f32841b.f32573b.equals(charSequence3)) {
                if (tzVar.J.length() > tzVar.f32841b.f32573b.length()) {
                    charSequence = tzVar.J;
                    charSequence2 = tzVar.f32841b.f32573b;
                    z14 = true;
                } else {
                    charSequence = tzVar.f32841b.f32573b;
                    charSequence2 = tzVar.J;
                    z14 = false;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new xy((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new xy((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new xy((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z19 = z14;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z12 = false;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    tzVar.L = staticLayout;
                    if (tzVar.f32851h0) {
                        if (tzVar.f32841b.f32577g) {
                            i21 = 26;
                        } else {
                            i21 = 0;
                        }
                        tzVar.K = t5.update(i21, tzVar, tzVar.K, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    tzVar.P = staticLayout2;
                    if (tzVar.f32851h0) {
                        if (tzVar.f32841b.f32577g) {
                            i20 = 26;
                        } else {
                            i20 = 0;
                        }
                        z16 = true;
                        tzVar.O = t5.update(i20, tzVar, tzVar.O, staticLayout2);
                    } else {
                        z16 = true;
                    }
                    tzVar.Q = z16;
                    tzVar.R = z19;
                    if (charSequenceIndexOf == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -tzVar.P.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    tzVar.T = f10;
                    tzVar.V = tzVar.U;
                    tzVar.N = null;
                    t5.release(tzVar, tzVar.M);
                } else {
                    z12 = false;
                    CharSequence charSequence4 = tzVar.f32841b.f32573b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    tzVar.L = staticLayout3;
                    if (tzVar.f32851h0) {
                        if (tzVar.f32841b.f32577g) {
                            i19 = 26;
                        } else {
                            i19 = 0;
                        }
                        tzVar.K = t5.update(i19, tzVar, tzVar.K, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(tzVar.J, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    tzVar.N = staticLayout4;
                    if (tzVar.f32851h0) {
                        if (tzVar.f32841b.f32577g) {
                            i18 = 26;
                        } else {
                            i18 = 0;
                        }
                        z15 = true;
                        tzVar.M = t5.update(i18, tzVar, tzVar.M, staticLayout4);
                    } else {
                        z15 = true;
                    }
                    tzVar.P = null;
                    t5.release(tzVar, tzVar.O);
                    tzVar.Q = z15;
                    tzVar.T = 0.0f;
                    tzVar.V = tzVar.U;
                }
                z11 = true;
            } else {
                z12 = false;
            }
            if (i32 != tzVar.f32845d0 || tzVar.getMeasuredWidth() != tzVar.f32849f0) {
                z13 = true;
                tzVar.S = true;
                tzVar.f32847e0 = tzVar.f32845d0;
                z11 = true;
            } else {
                z13 = true;
            }
            if (z11) {
                tzVar.f32857x = 0.0f;
                tzVar.f32856w = z13;
                vz vzVar2 = this.F;
                vzVar2.B.invalidate();
                vzVar2.invalidate();
            }
            if (i23 == 0 && i24 == 0 && !z11) {
                v(q1Var);
                return z12;
            }
            this.f5452r.add(new f2.m(q1Var, i13, i14, i11, i12));
            return z13;
        }
        return super.r(q1Var, pVar, i9, i10, i11, i12);
    }

    @Override
    public final void x(f2.q1 q1Var) {
        q1Var.f5501a.setTranslationX(0.0f);
        View view = q1Var.f5501a;
        if (view instanceof tz) {
            ((tz) view).a();
        }
    }
}
