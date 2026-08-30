package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class c00 extends f2.l {
    public final j00 F;

    public c00(j00 j00Var) {
        this.F = j00Var;
    }

    @Override
    public final void C(f2.l1 l1Var, f2.k kVar) {
        super.C(l1Var, kVar);
        View view = l1Var.f5785a;
        if (view instanceof h00) {
            h00 h00Var = (h00) view;
            if (h00Var.f25301w) {
                ValueAnimator valueAnimator = h00Var.f25284a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    h00Var.f25284a.removeAllUpdateListeners();
                    h00Var.f25284a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b00(h00Var, 0));
                ofFloat.addListener(new a9(h00Var, 20));
                h00Var.f25284a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(f2.l1 l1Var) {
        super.f(l1Var);
        View view = l1Var.f5785a;
        view.setTranslationX(0.0f);
        if (view instanceof h00) {
            ((h00) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5774p.isEmpty();
        boolean isEmpty2 = this.f5776r.isEmpty();
        boolean isEmpty3 = this.f5777s.isEmpty();
        boolean isEmpty4 = this.f5775q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new f6(this, 23));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(f2.l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ?? r32;
        boolean z4;
        String str;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z13;
        boolean z14;
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
        View view = l1Var.f5785a;
        if (view instanceof h00) {
            int translationX = i10 + ((int) view.getTranslationX());
            int translationY = i11 + ((int) view.getTranslationY());
            R(l1Var);
            int i24 = i12 - translationX;
            int i25 = i13 - translationY;
            if (i24 != 0) {
                view.setTranslationX(-i24);
            }
            if (i25 != 0) {
                view.setTranslationY(-i25);
            }
            h00 h00Var = (h00) view;
            j00 j00Var = h00Var.f25297j0;
            TextPaint textPaint = j00Var.f25816b;
            TextPaint textPaint2 = j00Var.f25818c;
            int i26 = h00Var.f25286b.d;
            int i27 = h00Var.F;
            if (i26 != i27) {
                h00Var.E = true;
                h00Var.G = i27;
                h00Var.f25289c0 = h00Var.f25285a0;
                h00Var.f25290d0 = h00Var.f25287b0;
                if (i27 > 0 && i26 > 0) {
                    String valueOf = String.valueOf(i27);
                    String valueOf2 = String.valueOf(h00Var.f25286b.d);
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
                                spannableStringBuilder.setSpan(new lz(false), i28, i30, 0);
                                spannableStringBuilder2.setSpan(new lz(false), i28, i30, 0);
                            } else {
                                i23 = translationY;
                                spannableStringBuilder3.setSpan(new lz(false), i28, i28 + 1, 0);
                            }
                            i28++;
                            translationY = i23;
                            translationX = i29;
                        }
                        i14 = translationX;
                        i15 = translationY;
                        z17 = false;
                        int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        z16 = true;
                        h00Var.I = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        h00Var.J = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                        h00Var.H = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        i14 = translationX;
                        i15 = translationY;
                        z16 = true;
                        z17 = false;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        h00Var.I = new StaticLayout(valueOf, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf)), alignment2, 1.0f, 0.0f, false);
                        h00Var.H = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z16 = true;
                    z17 = false;
                }
                z4 = true;
                i16 = z16;
                r32 = z17;
            } else {
                i14 = translationX;
                i15 = translationY;
                i16 = 1;
                r32 = 0;
                z4 = false;
            }
            int i31 = h00Var.f25286b.d;
            if (i31 > 0) {
                Object[] objArr = new Object[i16];
                objArr[r32] = Integer.valueOf(i31);
                str = String.format("%d", objArr);
                i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i17 = 0;
            }
            int i32 = h00Var.f25286b.f25007c;
            if (i17 != 0) {
                if (str != null) {
                    f11 = 1.0f;
                } else {
                    f11 = j00Var.f25842w;
                }
                i18 = AndroidUtilities.dp(f11 * 6.0f) + i17;
            } else {
                i18 = 0;
            }
            int i33 = i18 + i32;
            float f12 = h00Var.B;
            if ((h00Var.getMeasuredWidth() - i33) / 2 != f12) {
                h00Var.D = i16;
                h00Var.C = f12;
                z10 = true;
            } else {
                z10 = z4;
            }
            CharSequence charSequence3 = h00Var.K;
            if (charSequence3 != null && !h00Var.f25286b.f25006b.equals(charSequence3)) {
                if (h00Var.K.length() > h00Var.f25286b.f25006b.length()) {
                    charSequence = h00Var.K;
                    charSequence2 = h00Var.f25286b.f25006b;
                    z13 = true;
                } else {
                    charSequence = h00Var.f25286b.f25006b;
                    charSequence2 = h00Var.K;
                    z13 = false;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new lz((boolean) r32), r32, charSequenceIndexOf, r32);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new lz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                    }
                    spannableStringBuilder4.setSpan(new lz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                    int dp = AndroidUtilities.dp(400.0f);
                    boolean z18 = z13;
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z11 = false;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                    h00Var.M = staticLayout;
                    if (h00Var.f25296i0) {
                        if (h00Var.f25286b.f25009g) {
                            i22 = 26;
                        } else {
                            i22 = 0;
                        }
                        h00Var.L = u5.update(i22, h00Var, h00Var.L, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    h00Var.Q = staticLayout2;
                    if (h00Var.f25296i0) {
                        if (h00Var.f25286b.f25009g) {
                            i21 = 26;
                        } else {
                            i21 = 0;
                        }
                        z15 = true;
                        h00Var.P = u5.update(i21, h00Var, h00Var.P, staticLayout2);
                    } else {
                        z15 = true;
                    }
                    h00Var.R = z15;
                    h00Var.S = z18;
                    if (charSequenceIndexOf == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -h00Var.Q.getPrimaryHorizontal(charSequenceIndexOf);
                    }
                    h00Var.U = f10;
                    h00Var.W = h00Var.V;
                    h00Var.O = null;
                    u5.release(h00Var, h00Var.N);
                } else {
                    z11 = false;
                    CharSequence charSequence4 = h00Var.f25286b.f25006b;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                    h00Var.M = staticLayout3;
                    if (h00Var.f25296i0) {
                        if (h00Var.f25286b.f25009g) {
                            i20 = 26;
                        } else {
                            i20 = 0;
                        }
                        h00Var.L = u5.update(i20, h00Var, h00Var.L, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(h00Var.K, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    h00Var.O = staticLayout4;
                    if (h00Var.f25296i0) {
                        if (h00Var.f25286b.f25009g) {
                            i19 = 26;
                        } else {
                            i19 = 0;
                        }
                        z14 = true;
                        h00Var.N = u5.update(i19, h00Var, h00Var.N, staticLayout4);
                    } else {
                        z14 = true;
                    }
                    h00Var.Q = null;
                    u5.release(h00Var, h00Var.P);
                    h00Var.R = z14;
                    h00Var.U = 0.0f;
                    h00Var.W = h00Var.V;
                }
                z10 = true;
            } else {
                z11 = false;
            }
            if (i33 != h00Var.f25291e0 || h00Var.getMeasuredWidth() != h00Var.f25294g0) {
                z12 = true;
                h00Var.T = true;
                h00Var.f25293f0 = h00Var.f25291e0;
                z10 = true;
            } else {
                z12 = true;
            }
            if (z10) {
                h00Var.f25302x = 0.0f;
                h00Var.f25301w = z12;
                j00 j00Var2 = this.F;
                j00Var2.C.invalidate();
                j00Var2.invalidate();
            }
            if (i24 == 0 && i25 == 0 && !z10) {
                v(l1Var);
                return z11;
            }
            this.f5776r.add(new f2.k(l1Var, i14, i15, i12, i13));
            return z12;
        }
        return super.r(l1Var, eVar, i10, i11, i12, i13);
    }

    @Override
    public final void x(f2.l1 l1Var) {
        l1Var.f5785a.setTranslationX(0.0f);
        View view = l1Var.f5785a;
        if (view instanceof h00) {
            ((h00) view).a();
        }
    }
}
