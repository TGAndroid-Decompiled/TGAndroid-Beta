package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;
public final class yu extends MetricAffectingSpan {
    public final cv f26656a;
    public final int f26657b;
    public final boolean f26658c;
    public boolean d;
    public int f26659e;

    public yu(cv cvVar, int i3, boolean z10) {
        this.f26656a = cvVar;
        this.f26657b = i3;
        this.f26658c = z10;
    }

    public final void a(TextPaint textPaint) {
        boolean z10;
        Typeface typeface;
        int L;
        int i3;
        int w02;
        int i10;
        int i11;
        int i12 = this.f26657b;
        int i13 = i12 & 15;
        if (i13 == 8) {
            typeface = Typeface.MONOSPACE;
        } else if (i13 == 11) {
            typeface = g0.o();
        } else if (i13 >= 1 && i13 <= 6) {
            if (TLObject.hasFlag(i12, 32)) {
                typeface = g0.o1("fonts/rmediumitalic.ttf");
            } else {
                typeface = g0.o();
            }
        } else if (TLObject.hasFlag(i12, 256)) {
            typeface = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i12, 16);
            if (!TLObject.hasFlag(i12, 32) && i13 != 12) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (hasFlag && z10) {
                typeface = g0.o1("fonts/rmediumitalic.ttf");
            } else if (hasFlag) {
                typeface = g0.o();
            } else if (z10) {
                typeface = g0.o1("fonts/ritalic.ttf");
            } else {
                typeface = null;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i14 = az.W0;
        if (i13 == 14 && this.d) {
            L = g0.L(i14);
        } else {
            switch (i13) {
                case 1:
                    L = g0.L(i14 + 4);
                    break;
                case 2:
                    L = g0.L(i14 + 2);
                    break;
                case 3:
                    L = g0.L(i14 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = g0.L(i14);
                    break;
                case 7:
                case 13:
                    L = g0.L(i14 - 2);
                    break;
                case 8:
                    int i15 = i14 - 2;
                    L = g0.L(Math.max(Math.min(10, i15), i15 - this.f26659e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = g0.L(i14 - 2);
                    break;
                case 10:
                    L = g0.L(i14 - 2);
                    break;
                case 14:
                    L = g0.L(Math.max(8, i14 - 2));
                    break;
                case 15:
                    L = g0.L(i14 - 2);
                    break;
                default:
                    L = g0.L(i14);
                    break;
            }
        }
        if (TLObject.hasFlag(i12, 6144)) {
            L -= g0.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.f26658c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i12, 64)), 16, TLObject.hasFlag(i12, 128)));
            if (i13 != 8) {
                cv cvVar = this.f26656a;
                if (i13 == 11) {
                    if (cvVar.E()) {
                        i11 = org.telegram.ui.ActionBar.k6.Qb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.Kd;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.w0(i11, cvVar.D);
                } else if (i13 == 10) {
                    if (cvVar.E()) {
                        i10 = org.telegram.ui.ActionBar.k6.Tc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.Sc;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D));
                } else {
                    if (cvVar.E()) {
                        i3 = org.telegram.ui.ActionBar.k6.Tc;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.Sc;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
                }
                textPaint.setColor(w02);
            }
        }
        if (TLObject.hasFlag(i12, 4096)) {
            textPaint.baselineShift -= g0.L(6.0f);
        } else if (TLObject.hasFlag(i12, 2048)) {
            textPaint.baselineShift = g0.L(2.0f) + textPaint.baselineShift;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
