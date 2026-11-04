package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import b8.hf;
import org.telegram.ui.Components.tj0;
public final class c9 implements Runnable {
    public final int f29066a;
    public final u9 f29067b;

    public c9(u9 u9Var, int i3) {
        this.f29066a = i3;
        this.f29067b = u9Var;
    }

    @Override
    public final void run() {
        int m10;
        int i3;
        int p10;
        int i10;
        switch (this.f29066a) {
            case 0:
                u9 u9Var = this.f29067b;
                if (u9Var.N && u9Var.E != null) {
                    if (u9Var.Z && u9Var.W == null) {
                        m10 = org.telegram.messenger.g0.L(8.0f);
                    } else if (u9Var.W != null) {
                        m10 = u9Var.m() >> 1;
                    } else {
                        return;
                    }
                    if (!u9Var.Z && !u9Var.f30676j0) {
                        if (u9Var.O) {
                            if (u9Var.W.getBottom() - m10 < u9Var.F.getMeasuredHeight() - u9Var.o()) {
                                i3 = u9Var.W.getBottom() - u9Var.F.getMeasuredHeight();
                                p10 = u9Var.o();
                                m10 = i3 + p10;
                            }
                        } else if (u9Var.W.getTop() + m10 > u9Var.p()) {
                            i3 = -u9Var.W.getTop();
                            p10 = u9Var.p();
                            m10 = i3 + p10;
                        }
                    }
                    tj0 tj0Var = u9Var.E;
                    if (tj0Var != null) {
                        if (!u9Var.O) {
                            m10 = -m10;
                        }
                        tj0Var.scrollBy(0, m10);
                    }
                    org.telegram.messenger.g0.h3(this);
                    return;
                }
                return;
            case 1:
                u9 u9Var2 = this.f29067b;
                f fVar = u9Var2.m0;
                Rect rect = u9Var2.B;
                k9 k9Var = u9Var2.f30660a0;
                p9 p9Var = u9Var2.X;
                if (p9Var != null && u9Var2.C != null) {
                    p9 p9Var2 = u9Var2.W;
                    int i11 = 1;
                    CharSequence s6 = u9Var2.s(p9Var, true);
                    tj0 tj0Var2 = u9Var2.E;
                    if (tj0Var2 != null) {
                        tj0Var2.I0(false);
                    }
                    int i12 = u9Var2.f30689s;
                    int i13 = u9Var2.f30690t;
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
                    int k10 = u9Var2.k(i12, i13, u9Var2.f30663c, u9Var2.d, p9Var, true);
                    if (k10 >= s6.length()) {
                        u9Var2.i(k10, k9Var, true);
                        Layout layout = (Layout) k9Var.d;
                        if (layout == null) {
                            u9Var2.v = -1;
                            u9Var2.f30691u = -1;
                            return;
                        }
                        int lineCount = layout.getLineCount() - 1;
                        float f10 = i12 - u9Var2.f30663c;
                        if (f10 < ((Layout) k9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) k9Var.d).getLineLeft(lineCount)) {
                            k10 = s6.length() - 1;
                        }
                    }
                    if (k10 >= 0 && k10 < s6.length() && s6.charAt(k10) != '\n') {
                        int i18 = u9Var2.f30663c;
                        int i19 = u9Var2.d;
                        u9Var2.f(false);
                        u9Var2.C.setVisibility(0);
                        u9Var2.L(p9Var, p9Var2);
                        u9Var2.f30691u = k10;
                        u9Var2.v = k10;
                        if (s6 instanceof Spanned) {
                            Spanned spanned = (Spanned) s6;
                            org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spanned.getSpans(0, s6.length(), org.telegram.messenger.f6.class);
                            int length = f6VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 < length) {
                                    org.telegram.messenger.f6 f6Var = f6VarArr[i20];
                                    i10 = i11;
                                    int spanStart = spanned.getSpanStart(f6Var);
                                    int spanEnd = spanned.getSpanEnd(f6Var);
                                    if (k10 >= spanStart && k10 <= spanEnd) {
                                        u9Var2.f30691u = spanStart;
                                        u9Var2.v = spanEnd;
                                    } else {
                                        i20++;
                                        i11 = i10;
                                    }
                                } else {
                                    i10 = i11;
                                    org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned.getSpans(0, s6.length(), org.telegram.ui.Components.p5.class);
                                    int length2 = p5VarArr.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length2) {
                                            org.telegram.ui.Components.p5 p5Var = p5VarArr[i21];
                                            int spanStart2 = spanned.getSpanStart(p5Var);
                                            int spanEnd2 = spanned.getSpanEnd(p5Var);
                                            if (k10 >= spanStart2 && k10 <= spanEnd2) {
                                                u9Var2.f30691u = spanStart2;
                                                u9Var2.v = spanEnd2;
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
                        if (u9Var2.f30691u == u9Var2.v) {
                            while (true) {
                                int i22 = u9Var2.f30691u;
                                if (i22 > 0 && u9.y(s6.charAt(i22 - 1))) {
                                    u9Var2.f30691u--;
                                }
                            }
                            while (u9Var2.v < s6.length() && u9.y(s6.charAt(u9Var2.v))) {
                                u9Var2.v++;
                            }
                        }
                        u9Var2.f30659a = i18;
                        u9Var2.f30661b = i19;
                        u9Var2.W = p9Var;
                        try {
                            u9Var2.C.performHapticFeedback(0, i10);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.r(fVar);
                        org.telegram.messenger.g0.h3(fVar);
                        u9Var2.U();
                        u9Var2.w();
                        if (p9Var2 != null) {
                            p9Var2.invalidate();
                        }
                        hf hfVar = u9Var2.D;
                        if (hfVar != null) {
                            hfVar.a(true);
                        }
                        u9Var2.f30673i = true;
                        u9Var2.R = true;
                        u9Var2.f30677k = true;
                        u9Var2.f30670g = 0.0f;
                        u9Var2.f30668f = 0.0f;
                        u9Var2.F();
                    }
                    u9Var2.f30695z = false;
                    u9Var2.f30666e = false;
                    return;
                }
                return;
            default:
                u9 u9Var3 = this.f29067b;
                org.telegram.ui.ActionBar.u3 u3Var = u9Var3.Y;
                if (u3Var != null && !u9Var3.P) {
                    u3Var.hide(Long.MAX_VALUE);
                    org.telegram.messenger.g0.i3(u9Var3.f30683n0, 1000L);
                    return;
                }
                return;
        }
    }
}
