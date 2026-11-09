package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.ui.Components.qj0;
public final class d9 implements Runnable {
    public final int f29041a;
    public final v9 f29042b;

    public d9(v9 v9Var, int i7) {
        this.f29041a = i7;
        this.f29042b = v9Var;
    }

    @Override
    public final void run() {
        int m10;
        int i7;
        int p10;
        int i10;
        switch (this.f29041a) {
            case 0:
                v9 v9Var = this.f29042b;
                if (v9Var.N && v9Var.E != null) {
                    if (v9Var.Z && v9Var.W == null) {
                        m10 = org.telegram.messenger.g0.L(8.0f);
                    } else if (v9Var.W != null) {
                        m10 = v9Var.m() >> 1;
                    } else {
                        return;
                    }
                    if (!v9Var.Z && !v9Var.f30669j0) {
                        if (v9Var.O) {
                            if (v9Var.W.getBottom() - m10 < v9Var.F.getMeasuredHeight() - v9Var.o()) {
                                i7 = v9Var.W.getBottom() - v9Var.F.getMeasuredHeight();
                                p10 = v9Var.o();
                                m10 = i7 + p10;
                            }
                        } else if (v9Var.W.getTop() + m10 > v9Var.p()) {
                            i7 = -v9Var.W.getTop();
                            p10 = v9Var.p();
                            m10 = i7 + p10;
                        }
                    }
                    qj0 qj0Var = v9Var.E;
                    if (qj0Var != null) {
                        if (!v9Var.O) {
                            m10 = -m10;
                        }
                        qj0Var.scrollBy(0, m10);
                    }
                    org.telegram.messenger.g0.h3(this);
                    return;
                }
                return;
            case 1:
                v9 v9Var2 = this.f29042b;
                f fVar = v9Var2.m0;
                Rect rect = v9Var2.B;
                l9 l9Var = v9Var2.f30653a0;
                q9 q9Var = v9Var2.X;
                if (q9Var != null && v9Var2.C != null) {
                    q9 q9Var2 = v9Var2.W;
                    int i11 = 1;
                    CharSequence s5 = v9Var2.s(q9Var, true);
                    qj0 qj0Var2 = v9Var2.E;
                    if (qj0Var2 != null) {
                        qj0Var2.I0(false);
                    }
                    int i12 = v9Var2.f30682s;
                    int i13 = v9Var2.f30683t;
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
                    int k10 = v9Var2.k(i12, i13, v9Var2.f30656c, v9Var2.d, q9Var, true);
                    if (k10 >= s5.length()) {
                        v9Var2.i(k10, l9Var, true);
                        Layout layout = (Layout) l9Var.d;
                        if (layout == null) {
                            v9Var2.v = -1;
                            v9Var2.f30684u = -1;
                            return;
                        }
                        int lineCount = layout.getLineCount() - 1;
                        float f10 = i12 - v9Var2.f30656c;
                        if (f10 < ((Layout) l9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) l9Var.d).getLineLeft(lineCount)) {
                            k10 = s5.length() - 1;
                        }
                    }
                    if (k10 >= 0 && k10 < s5.length() && s5.charAt(k10) != '\n') {
                        int i18 = v9Var2.f30656c;
                        int i19 = v9Var2.d;
                        v9Var2.f(false);
                        v9Var2.C.setVisibility(0);
                        v9Var2.L(q9Var, q9Var2);
                        v9Var2.f30684u = k10;
                        v9Var2.v = k10;
                        if (s5 instanceof Spanned) {
                            Spanned spanned = (Spanned) s5;
                            org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spanned.getSpans(0, s5.length(), org.telegram.messenger.f6.class);
                            int length = f6VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 < length) {
                                    org.telegram.messenger.f6 f6Var = f6VarArr[i20];
                                    i10 = i11;
                                    int spanStart = spanned.getSpanStart(f6Var);
                                    int spanEnd = spanned.getSpanEnd(f6Var);
                                    if (k10 >= spanStart && k10 <= spanEnd) {
                                        v9Var2.f30684u = spanStart;
                                        v9Var2.v = spanEnd;
                                    } else {
                                        i20++;
                                        i11 = i10;
                                    }
                                } else {
                                    i10 = i11;
                                    org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spanned.getSpans(0, s5.length(), org.telegram.ui.Components.r5.class);
                                    int length2 = r5VarArr.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length2) {
                                            org.telegram.ui.Components.r5 r5Var = r5VarArr[i21];
                                            int spanStart2 = spanned.getSpanStart(r5Var);
                                            int spanEnd2 = spanned.getSpanEnd(r5Var);
                                            if (k10 >= spanStart2 && k10 <= spanEnd2) {
                                                v9Var2.f30684u = spanStart2;
                                                v9Var2.v = spanEnd2;
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
                        if (v9Var2.f30684u == v9Var2.v) {
                            while (true) {
                                int i22 = v9Var2.f30684u;
                                if (i22 > 0 && v9.y(s5.charAt(i22 - 1))) {
                                    v9Var2.f30684u--;
                                }
                            }
                            while (v9Var2.v < s5.length() && v9.y(s5.charAt(v9Var2.v))) {
                                v9Var2.v++;
                            }
                        }
                        v9Var2.f30652a = i18;
                        v9Var2.f30654b = i19;
                        v9Var2.W = q9Var;
                        try {
                            v9Var2.C.performHapticFeedback(0, i10);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.r(fVar);
                        org.telegram.messenger.g0.h3(fVar);
                        v9Var2.U();
                        v9Var2.w();
                        if (q9Var2 != null) {
                            q9Var2.invalidate();
                        }
                        c8.da daVar = v9Var2.D;
                        if (daVar != null) {
                            daVar.a(true);
                        }
                        v9Var2.f30666i = true;
                        v9Var2.R = true;
                        v9Var2.f30670k = true;
                        v9Var2.f30663g = 0.0f;
                        v9Var2.f30661f = 0.0f;
                        v9Var2.F();
                    }
                    v9Var2.f30688z = false;
                    v9Var2.f30659e = false;
                    return;
                }
                return;
            default:
                v9 v9Var3 = this.f29042b;
                org.telegram.ui.ActionBar.w3 w3Var = v9Var3.Y;
                if (w3Var != null && !v9Var3.P) {
                    w3Var.hide(Long.MAX_VALUE);
                    org.telegram.messenger.g0.i3(v9Var3.f30676n0, 1000L);
                    return;
                }
                return;
        }
    }
}
