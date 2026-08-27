package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

public final class qz extends f2.l {
    public final yz F;

    public qz(yz yzVar) {
        this.F = yzVar;
    }

    @Override
    public final void C(f2.o1 o1Var, f2.k kVar) {
        super.C(o1Var, kVar);
        View view = o1Var.f5789a;
        if (view instanceof wz) {
            wz wzVar = (wz) view;
            if (wzVar.f34395w) {
                ValueAnimator valueAnimator = wzVar.f34378a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    wzVar.f34378a.removeAllUpdateListeners();
                    wzVar.f34378a.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new pz(wzVar, 0));
                valueAnimatorOfFloat.addListener(new org.telegram.ui.am(wzVar, 29));
                wzVar.f34378a = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(this.f5843e);
                valueAnimatorOfFloat.start();
            }
        }
    }

    @Override
    public final void f(f2.o1 o1Var) {
        super.f(o1Var);
        View view = o1Var.f5789a;
        view.setTranslationX(0.0f);
        if (view instanceof wz) {
            ((wz) view).a();
        }
    }

    @Override
    public final void m() {
        boolean zIsEmpty = this.f5738p.isEmpty();
        boolean zIsEmpty2 = this.f5740r.isEmpty();
        boolean zIsEmpty3 = this.f5741s.isEmpty();
        boolean zIsEmpty4 = this.f5739q.isEmpty();
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.1f);
            valueAnimatorOfFloat.addUpdateListener(new e6(this, 23));
            valueAnimatorOfFloat.setDuration(this.f5843e);
            valueAnimatorOfFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(f2.o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ?? r10;
        boolean z10;
        String str;
        int iMax;
        int iDp;
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        View view = o1Var.f5789a;
        if (!(view instanceof wz)) {
            return super.r(o1Var, pVar, i10, i11, i12, i13);
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(o1Var);
        int i17 = i12 - translationX;
        int i18 = i13 - translationY;
        if (i17 != 0) {
            view.setTranslationX(-i17);
        }
        if (i18 != 0) {
            view.setTranslationY(-i18);
        }
        wz wzVar = (wz) view;
        yz yzVar = wzVar.f34391i0;
        TextPaint textPaint = yzVar.f35070b;
        TextPaint textPaint2 = yzVar.f35072c;
        int i19 = wzVar.f34380b.d;
        int i20 = wzVar.E;
        if (i19 != i20) {
            wzVar.D = true;
            wzVar.F = i20;
            wzVar.f34381b0 = wzVar.W;
            wzVar.f34383c0 = wzVar.f34379a0;
            if (i20 <= 0 || i19 <= 0) {
                i14 = translationX;
                i15 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String strValueOf = String.valueOf(i20);
                String strValueOf2 = String.valueOf(wzVar.f34380b.d);
                if (strValueOf.length() == strValueOf2.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strValueOf2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strValueOf2);
                    int i21 = 0;
                    while (i21 < strValueOf.length()) {
                        int i22 = translationX;
                        if (strValueOf.charAt(i21) == strValueOf2.charAt(i21)) {
                            boolean z19 = false;
                            int i23 = i21 + 1;
                            spannableStringBuilder.setSpan(new zy(z19), i21, i23, 0);
                            spannableStringBuilder2.setSpan(new zy(z19), i21, i23, 0);
                        } else {
                            spannableStringBuilder3.setSpan(new zy(false), i21, i21 + 1, 0);
                        }
                        i21++;
                        translationY = translationY;
                        translationX = i22;
                    }
                    i14 = translationX;
                    i15 = translationY;
                    z18 = false;
                    int iCeil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(strValueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    wzVar.H = new StaticLayout(spannableStringBuilder, textPaint2, iCeil, alignment, 1.0f, 0.0f, false);
                    wzVar.I = new StaticLayout(spannableStringBuilder3, textPaint2, iCeil, alignment, 1.0f, 0.0f, false);
                    wzVar.G = new StaticLayout(spannableStringBuilder2, textPaint2, iCeil, alignment, 1.0f, 0.0f, false);
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z17 = true;
                    z18 = false;
                    int iCeil2 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(strValueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    wzVar.H = new StaticLayout(strValueOf, textPaint2, iCeil2, alignment2, 1.0f, 0.0f, false);
                    wzVar.G = new StaticLayout(strValueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(strValueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z10 = true;
            i16 = z17;
            r10 = z18;
        } else {
            i14 = translationX;
            i15 = translationY;
            i16 = 1;
            r10 = 0;
            z10 = false;
        }
        int i24 = wzVar.f34380b.d;
        if (i24 > 0) {
            Object[] objArr = new Object[i16];
            objArr[r10] = Integer.valueOf(i24);
            str = String.format("%d", objArr);
            iMax = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
        } else {
            str = null;
            iMax = 0;
        }
        int i25 = wzVar.f34380b.f34074c;
        if (iMax != 0) {
            iDp = AndroidUtilities.dp((str != null ? 1.0f : yzVar.f35097w) * 6.0f) + iMax;
        } else {
            iDp = 0;
        }
        int i26 = iDp + i25;
        float measuredWidth = (wzVar.getMeasuredWidth() - i26) / 2;
        float f10 = wzVar.A;
        if (measuredWidth != f10) {
            wzVar.C = i16;
            wzVar.B = f10;
            z11 = true;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = wzVar.J;
        if (charSequence3 == null || wzVar.f34380b.f34073b.equals(charSequence3)) {
            z12 = false;
        } else {
            if (wzVar.J.length() > wzVar.f34380b.f34073b.length()) {
                charSequence = wzVar.J;
                charSequence2 = wzVar.f34380b.f34073b;
                z14 = true;
            } else {
                charSequence = wzVar.f34380b.f34073b;
                charSequence2 = wzVar.J;
                z14 = false;
            }
            int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
            if (iCharSequenceIndexOf >= 0) {
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r10);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequenceReplaceEmoji);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequenceReplaceEmoji);
                if (iCharSequenceIndexOf != 0) {
                    spannableStringBuilder5.setSpan(new zy((boolean) r10), r10, iCharSequenceIndexOf, r10);
                }
                if (charSequence2.length() + iCharSequenceIndexOf != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new zy((boolean) r10), charSequence2.length() + iCharSequenceIndexOf, charSequence.length(), r10);
                }
                spannableStringBuilder4.setSpan(new zy((boolean) r10), iCharSequenceIndexOf, charSequence2.length() + iCharSequenceIndexOf, r10);
                int iDp2 = AndroidUtilities.dp(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = false;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, iDp2, alignment3, 1.0f, 0.0f, false);
                wzVar.L = staticLayout;
                if (wzVar.f34390h0) {
                    wzVar.K = t5.update(wzVar.f34380b.f34077g ? 26 : 0, wzVar, wzVar.K, staticLayout);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                wzVar.P = staticLayout2;
                if (wzVar.f34390h0) {
                    z16 = true;
                    wzVar.O = t5.update(wzVar.f34380b.f34077g ? 26 : 0, wzVar, wzVar.O, staticLayout2);
                } else {
                    z16 = true;
                }
                wzVar.Q = z16;
                wzVar.R = z20;
                wzVar.T = iCharSequenceIndexOf == 0 ? 0.0f : -wzVar.P.getPrimaryHorizontal(iCharSequenceIndexOf);
                wzVar.V = wzVar.U;
                wzVar.N = null;
                t5.release(wzVar, wzVar.M);
            } else {
                z12 = false;
                CharSequence charSequence4 = wzVar.f34380b.f34073b;
                int iDp3 = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, iDp3, alignment4, 1.0f, 0.0f, false);
                wzVar.L = staticLayout3;
                if (wzVar.f34390h0) {
                    wzVar.K = t5.update(wzVar.f34380b.f34077g ? 26 : 0, wzVar, wzVar.K, staticLayout3);
                }
                StaticLayout staticLayout4 = new StaticLayout(wzVar.J, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                wzVar.N = staticLayout4;
                if (wzVar.f34390h0) {
                    z15 = true;
                    wzVar.M = t5.update(wzVar.f34380b.f34077g ? 26 : 0, wzVar, wzVar.M, staticLayout4);
                } else {
                    z15 = true;
                }
                wzVar.P = null;
                t5.release(wzVar, wzVar.O);
                wzVar.Q = z15;
                wzVar.T = 0.0f;
                wzVar.V = wzVar.U;
            }
            z11 = true;
        }
        if (i26 == wzVar.f34384d0 && wzVar.getMeasuredWidth() == wzVar.f34388f0) {
            z13 = true;
        } else {
            z13 = true;
            wzVar.S = true;
            wzVar.f34386e0 = wzVar.f34384d0;
            z11 = true;
        }
        if (z11) {
            wzVar.f34396x = 0.0f;
            wzVar.f34395w = z13;
            yz yzVar2 = this.F;
            yzVar2.B.invalidate();
            yzVar2.invalidate();
        }
        if (i17 == 0 && i18 == 0 && !z11) {
            v(o1Var);
            return z12;
        }
        this.f5740r.add(new f2.k(o1Var, i14, i15, i12, i13));
        return z13;
    }

    @Override
    public final void x(f2.o1 o1Var) {
        o1Var.f5789a.setTranslationX(0.0f);
        View view = o1Var.f5789a;
        if (view instanceof wz) {
            ((wz) view).a();
        }
    }
}
