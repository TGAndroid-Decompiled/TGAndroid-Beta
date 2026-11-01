package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.ui.Components.uk0;
public final class f9 implements Runnable {
    public final int f21904a;
    public final w9 f21905b;

    public f9(w9 w9Var, int i10) {
        this.f21904a = i10;
        this.f21905b = w9Var;
    }

    @Override
    public final void run() {
        int m10;
        int i10;
        int p5;
        int i11;
        switch (this.f21904a) {
            case 0:
                w9 w9Var = this.f21905b;
                if (w9Var.N && w9Var.E != null) {
                    if (w9Var.Z && w9Var.W == null) {
                        m10 = org.telegram.messenger.i0.L(8.0f);
                    } else if (w9Var.W != null) {
                        m10 = w9Var.m() >> 1;
                    } else {
                        return;
                    }
                    if (!w9Var.Z && !w9Var.f23429j0) {
                        if (w9Var.O) {
                            if (w9Var.W.getBottom() - m10 < w9Var.F.getMeasuredHeight() - w9Var.o()) {
                                i10 = w9Var.W.getBottom() - w9Var.F.getMeasuredHeight();
                                p5 = w9Var.o();
                                m10 = i10 + p5;
                            }
                        } else if (w9Var.W.getTop() + m10 > w9Var.p()) {
                            i10 = -w9Var.W.getTop();
                            p5 = w9Var.p();
                            m10 = i10 + p5;
                        }
                    }
                    uk0 uk0Var = w9Var.E;
                    if (uk0Var != null) {
                        if (!w9Var.O) {
                            m10 = -m10;
                        }
                        uk0Var.scrollBy(0, m10);
                    }
                    org.telegram.messenger.i0.g3(this);
                    return;
                }
                return;
            case 1:
                w9 w9Var2 = this.f21905b;
                f fVar = w9Var2.m0;
                Rect rect = w9Var2.B;
                ge.b bVar = w9Var2.f23414a0;
                r9 r9Var = w9Var2.X;
                if (r9Var != null && w9Var2.C != null) {
                    r9 r9Var2 = w9Var2.W;
                    int i12 = 1;
                    CharSequence s10 = w9Var2.s(r9Var, true);
                    uk0 uk0Var2 = w9Var2.E;
                    if (uk0Var2 != null) {
                        uk0Var2.I0(false);
                    }
                    int i13 = w9Var2.f23442s;
                    int i14 = w9Var2.f23443t;
                    if (!rect.isEmpty()) {
                        int i15 = rect.right;
                        if (i13 > i15) {
                            i13 = i15 - 1;
                        }
                        int i16 = rect.left;
                        if (i13 < i16) {
                            i13 = i16 + 1;
                        }
                        int i17 = rect.top;
                        if (i14 < i17) {
                            i14 = i17 + 1;
                        }
                        int i18 = rect.bottom;
                        if (i14 > i18) {
                            i14 = i18 - 1;
                        }
                    }
                    int k10 = w9Var2.k(i13, i14, w9Var2.f23417c, w9Var2.d, r9Var, true);
                    if (k10 >= s10.length()) {
                        w9Var2.i(k10, bVar, true);
                        Layout layout = (Layout) bVar.d;
                        if (layout == null) {
                            w9Var2.v = -1;
                            w9Var2.f23444u = -1;
                            return;
                        }
                        int lineCount = layout.getLineCount() - 1;
                        float f7 = i13 - w9Var2.f23417c;
                        if (f7 < ((Layout) bVar.d).getLineRight(lineCount) + org.telegram.messenger.i0.L(4.0f) && f7 > ((Layout) bVar.d).getLineLeft(lineCount)) {
                            k10 = s10.length() - 1;
                        }
                    }
                    if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                        int i19 = w9Var2.f23417c;
                        int i20 = w9Var2.d;
                        w9Var2.f(false);
                        w9Var2.C.setVisibility(0);
                        w9Var2.L(r9Var, r9Var2);
                        w9Var2.f23444u = k10;
                        w9Var2.v = k10;
                        if (s10 instanceof Spanned) {
                            Spanned spanned = (Spanned) s10;
                            org.telegram.messenger.h6[] h6VarArr = (org.telegram.messenger.h6[]) spanned.getSpans(0, s10.length(), org.telegram.messenger.h6.class);
                            int length = h6VarArr.length;
                            int i21 = 0;
                            while (true) {
                                if (i21 < length) {
                                    org.telegram.messenger.h6 h6Var = h6VarArr[i21];
                                    i11 = i12;
                                    int spanStart = spanned.getSpanStart(h6Var);
                                    int spanEnd = spanned.getSpanEnd(h6Var);
                                    if (k10 >= spanStart && k10 <= spanEnd) {
                                        w9Var2.f23444u = spanStart;
                                        w9Var2.v = spanEnd;
                                    } else {
                                        i21++;
                                        i12 = i11;
                                    }
                                } else {
                                    i11 = i12;
                                    org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned.getSpans(0, s10.length(), org.telegram.ui.Components.o5.class);
                                    int length2 = o5VarArr.length;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 < length2) {
                                            org.telegram.ui.Components.o5 o5Var = o5VarArr[i22];
                                            int spanStart2 = spanned.getSpanStart(o5Var);
                                            int spanEnd2 = spanned.getSpanEnd(o5Var);
                                            if (k10 >= spanStart2 && k10 <= spanEnd2) {
                                                w9Var2.f23444u = spanStart2;
                                                w9Var2.v = spanEnd2;
                                            } else {
                                                i22++;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i11 = 1;
                        }
                        if (w9Var2.f23444u == w9Var2.v) {
                            while (true) {
                                int i23 = w9Var2.f23444u;
                                if (i23 > 0 && w9.y(s10.charAt(i23 - 1))) {
                                    w9Var2.f23444u--;
                                }
                            }
                            while (w9Var2.v < s10.length() && w9.y(s10.charAt(w9Var2.v))) {
                                w9Var2.v++;
                            }
                        }
                        w9Var2.f23413a = i19;
                        w9Var2.f23415b = i20;
                        w9Var2.W = r9Var;
                        try {
                            w9Var2.C.performHapticFeedback(0, i11);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.i0.r(fVar);
                        org.telegram.messenger.i0.g3(fVar);
                        w9Var2.U();
                        w9Var2.w();
                        if (r9Var2 != null) {
                            r9Var2.invalidate();
                        }
                        w7.x5 x5Var = w9Var2.D;
                        if (x5Var != null) {
                            x5Var.a(true);
                        }
                        w9Var2.f23426i = true;
                        w9Var2.R = true;
                        w9Var2.f23430k = true;
                        w9Var2.f23423g = 0.0f;
                        w9Var2.f23421f = 0.0f;
                        w9Var2.F();
                    }
                    w9Var2.f23448z = false;
                    w9Var2.e = false;
                    return;
                }
                return;
            default:
                w9 w9Var3 = this.f21905b;
                org.telegram.ui.ActionBar.d4 d4Var = w9Var3.Y;
                if (d4Var != null && !w9Var3.P) {
                    d4Var.hide(Long.MAX_VALUE);
                    org.telegram.messenger.i0.h3(w9Var3.f23436n0, 1000L);
                    return;
                }
                return;
        }
    }
}
