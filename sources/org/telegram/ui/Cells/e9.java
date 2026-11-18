package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.ui.Components.ck0;
public final class e9 implements Runnable {
    public final int f30588a;
    public final w9 f30589b;

    public e9(w9 w9Var, int i7) {
        this.f30588a = i7;
        this.f30589b = w9Var;
    }

    @Override
    public final void run() {
        int m10;
        int i7;
        int p10;
        int i10;
        switch (this.f30588a) {
            case 0:
                w9 w9Var = this.f30589b;
                if (w9Var.N && w9Var.E != null) {
                    if (w9Var.Z && w9Var.W == null) {
                        m10 = org.telegram.messenger.g0.L(8.0f);
                    } else if (w9Var.W != null) {
                        m10 = w9Var.m() >> 1;
                    } else {
                        return;
                    }
                    if (!w9Var.Z && !w9Var.f32254j0) {
                        if (w9Var.O) {
                            if (w9Var.W.getBottom() - m10 < w9Var.F.getMeasuredHeight() - w9Var.o()) {
                                i7 = w9Var.W.getBottom() - w9Var.F.getMeasuredHeight();
                                p10 = w9Var.o();
                                m10 = i7 + p10;
                            }
                        } else if (w9Var.W.getTop() + m10 > w9Var.p()) {
                            i7 = -w9Var.W.getTop();
                            p10 = w9Var.p();
                            m10 = i7 + p10;
                        }
                    }
                    ck0 ck0Var = w9Var.E;
                    if (ck0Var != null) {
                        if (!w9Var.O) {
                            m10 = -m10;
                        }
                        ck0Var.scrollBy(0, m10);
                    }
                    org.telegram.messenger.g0.g3(this);
                    return;
                }
                return;
            case 1:
                w9 w9Var2 = this.f30589b;
                f fVar = w9Var2.m0;
                Rect rect = w9Var2.B;
                m9 m9Var = w9Var2.f32238a0;
                r9 r9Var = w9Var2.X;
                if (r9Var != null && w9Var2.C != null) {
                    r9 r9Var2 = w9Var2.W;
                    int i11 = 1;
                    CharSequence s5 = w9Var2.s(r9Var, true);
                    ck0 ck0Var2 = w9Var2.E;
                    if (ck0Var2 != null) {
                        ck0Var2.I0(false);
                    }
                    int i12 = w9Var2.f32267s;
                    int i13 = w9Var2.f32268t;
                    if (!rect.isEmpty()) {
                        int i14 = rect.right;
                        if (i12 > i14) {
                            i12 = i14 - 1;
                        }
                        int i15 = rect.left;
                        if (i12 < i15) {
                            i12 = i15 + 1;
                        }
                        int i16 = rect.top;
                        if (i13 < i16) {
                            i13 = i16 + 1;
                        }
                        int i17 = rect.bottom;
                        if (i13 > i17) {
                            i13 = i17 - 1;
                        }
                    }
                    int k10 = w9Var2.k(i12, i13, w9Var2.f32241c, w9Var2.d, r9Var, true);
                    if (k10 >= s5.length()) {
                        w9Var2.i(k10, m9Var, true);
                        Layout layout = (Layout) m9Var.d;
                        if (layout == null) {
                            w9Var2.v = -1;
                            w9Var2.f32269u = -1;
                            return;
                        }
                        int lineCount = layout.getLineCount() - 1;
                        float f10 = i12 - w9Var2.f32241c;
                        if (f10 < ((Layout) m9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) m9Var.d).getLineLeft(lineCount)) {
                            k10 = s5.length() - 1;
                        }
                    }
                    if (k10 >= 0 && k10 < s5.length() && s5.charAt(k10) != '\n') {
                        int i18 = w9Var2.f32241c;
                        int i19 = w9Var2.d;
                        w9Var2.f(false);
                        w9Var2.C.setVisibility(0);
                        w9Var2.L(r9Var, r9Var2);
                        w9Var2.f32269u = k10;
                        w9Var2.v = k10;
                        if (s5 instanceof Spanned) {
                            Spanned spanned = (Spanned) s5;
                            org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spanned.getSpans(0, s5.length(), org.telegram.messenger.g6.class);
                            int length = g6VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 < length) {
                                    org.telegram.messenger.g6 g6Var = g6VarArr[i20];
                                    i10 = i11;
                                    int spanStart = spanned.getSpanStart(g6Var);
                                    int spanEnd = spanned.getSpanEnd(g6Var);
                                    if (k10 >= spanStart && k10 <= spanEnd) {
                                        w9Var2.f32269u = spanStart;
                                        w9Var2.v = spanEnd;
                                    } else {
                                        i20++;
                                        i11 = i10;
                                    }
                                } else {
                                    i10 = i11;
                                    org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spanned.getSpans(0, s5.length(), org.telegram.ui.Components.x5.class);
                                    int length2 = x5VarArr.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length2) {
                                            org.telegram.ui.Components.x5 x5Var = x5VarArr[i21];
                                            int spanStart2 = spanned.getSpanStart(x5Var);
                                            int spanEnd2 = spanned.getSpanEnd(x5Var);
                                            if (k10 >= spanStart2 && k10 <= spanEnd2) {
                                                w9Var2.f32269u = spanStart2;
                                                w9Var2.v = spanEnd2;
                                            } else {
                                                i21++;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i10 = 1;
                        }
                        if (w9Var2.f32269u == w9Var2.v) {
                            while (true) {
                                int i22 = w9Var2.f32269u;
                                if (i22 > 0 && w9.y(s5.charAt(i22 - 1))) {
                                    w9Var2.f32269u--;
                                }
                            }
                            while (w9Var2.v < s5.length() && w9.y(s5.charAt(w9Var2.v))) {
                                w9Var2.v++;
                            }
                        }
                        w9Var2.f32237a = i18;
                        w9Var2.f32239b = i19;
                        w9Var2.W = r9Var;
                        try {
                            w9Var2.C.performHapticFeedback(0, i10);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.r(fVar);
                        org.telegram.messenger.g0.g3(fVar);
                        w9Var2.U();
                        w9Var2.w();
                        if (r9Var2 != null) {
                            r9Var2.invalidate();
                        }
                        c8.ha haVar = w9Var2.D;
                        if (haVar != null) {
                            haVar.a(true);
                        }
                        w9Var2.f32251i = true;
                        w9Var2.R = true;
                        w9Var2.f32255k = true;
                        w9Var2.f32248g = 0.0f;
                        w9Var2.f32246f = 0.0f;
                        w9Var2.F();
                    }
                    w9Var2.f32273z = false;
                    w9Var2.f32244e = false;
                    return;
                }
                return;
            default:
                w9 w9Var3 = this.f30589b;
                org.telegram.ui.ActionBar.y3 y3Var = w9Var3.Y;
                if (y3Var != null && !w9Var3.P) {
                    y3Var.hide(Long.MAX_VALUE);
                    org.telegram.messenger.g0.h3(w9Var3.f32261n0, 1000L);
                    return;
                }
                return;
        }
    }
}
