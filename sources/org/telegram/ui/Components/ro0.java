package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class ro0 implements Runnable {
    public final int f39016a;
    public final Object f39017b;

    public ro0(hi.c2 c2Var, int i7) {
        this.f39016a = 9;
        this.f39017b = c2Var;
    }

    @Override
    public final void run() {
        int i7;
        org.telegram.messenger.g6[] g6VarArr;
        p5[] p5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        v4.b0 b0Var;
        int i10 = this.f39016a;
        Object obj = this.f39017b;
        switch (i10) {
            case 0:
                ((hi.k1) obj).setVisibility(8);
                return;
            case 1:
                ys0 ys0Var = ((vp0) obj).H;
                if (ys0Var.F1) {
                    ys0Var.q1(false);
                    return;
                }
                return;
            case 2:
                ((dr0) obj).f34055a.B1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.e2 e2Var = ((kr0) obj).f36594f.f42150y1;
                if (e2Var != null) {
                    e2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((ro0) obj).run();
                return;
            case 5:
                js0 js0Var = (js0) obj;
                ArrayList arrayList3 = js0Var.f36173f;
                if (js0Var.h) {
                    js0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.sv) arrayList3.get(i11)).f26570b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.sv) arrayList3.get(i11)).f26569a));
                        }
                    }
                    org.telegram.messenger.tv G1 = js0Var.f36179y.f42150y1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.tv.d(G1.f26740j);
                    int i12 = G1.f26733a;
                    if (org.telegram.messenger.m10.i(i12).q()) {
                        i7 = org.telegram.messenger.np.s1(i12).f25354o6;
                    } else {
                        i7 = org.telegram.messenger.np.s1(i12).f25346n6;
                    }
                    if (arrayList4.size() <= i7 && !org.telegram.messenger.tv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((ks0) obj).F();
                return;
            case 7:
                ((st0) obj).V();
                return;
            case 8:
                ((bu0) obj).getClass();
                return;
            case 9:
                ((av0) obj).l0(0);
                return;
            case 10:
                vu0 vu0Var = (vu0) obj;
                if (!vu0Var.f41155x) {
                    vu0Var.E = 0.0f;
                    return;
                }
                return;
            case 11:
                ((iw0) obj).b();
                return;
            case 12:
                rw0 rw0Var = (rw0) obj;
                int i13 = rw0Var.f39072a;
                rw0Var.I = null;
                pw0 pw0Var = rw0Var.f39076c;
                if (pw0Var != null && pw0Var.getEditField() != null && rw0Var.f39076c.getFieldText() != null) {
                    if (rw0Var.f39076c.a()) {
                        rw0Var.f39086s = false;
                        bi.g2 g2Var = rw0Var.d;
                        if (g2Var != null) {
                            g2Var.invalidate();
                            return;
                        }
                        return;
                    }
                    int selectionStart = rw0Var.f39076c.getEditField().getSelectionStart();
                    int selectionEnd = rw0Var.f39076c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        rw0Var.f39086s = false;
                        bi.g2 g2Var2 = rw0Var.d;
                        if (g2Var2 != null) {
                            g2Var2.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = rw0Var.f39076c.getFieldText();
                    boolean z10 = fieldText instanceof Spanned;
                    if (z10) {
                        g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.g6.class);
                    } else {
                        g6VarArr = null;
                    }
                    if (g6VarArr != null && g6VarArr.length > 0 && org.telegram.messenger.gz.F && org.telegram.messenger.m10.i(i13).q()) {
                        org.telegram.messenger.g6 g6Var = g6VarArr[g6VarArr.length - 1];
                        if (g6Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(g6Var);
                            int spanEnd = spanned.getSpanEnd(g6Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                rw0Var.f39086s = true;
                                rw0Var.c();
                                rw0Var.W = g6Var;
                                rw0Var.f39077c0 = null;
                                rw0Var.f39075b0 = null;
                                if (substring != null) {
                                    String str = rw0Var.K;
                                    if (str != null && rw0Var.J == 2 && str.equals(substring) && !rw0Var.f39089y && (arrayList2 = rw0Var.f39088x) != null && !arrayList2.isEmpty()) {
                                        rw0Var.f39087w = false;
                                        rw0Var.c();
                                        bi.g2 g2Var3 = rw0Var.d;
                                        if (g2Var3 != null) {
                                            g2Var3.setVisibility(0);
                                            rw0Var.d.invalidate();
                                        }
                                    } else {
                                        int i14 = rw0Var.L + 1;
                                        rw0Var.L = i14;
                                        Runnable runnable = rw0Var.N;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        rw0Var.N = new org.telegram.ui.f0(rw0Var, substring, i14, 27);
                                        ArrayList arrayList5 = rw0Var.f39088x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            rw0Var.N.run();
                                        } else {
                                            org.telegram.messenger.g0.i3(rw0Var.N, 600L);
                                        }
                                    }
                                }
                                bi.g2 g2Var4 = rw0Var.d;
                                if (g2Var4 != null) {
                                    g2Var4.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            p5VarArr = (p5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, p5.class);
                        } else {
                            p5VarArr = null;
                        }
                        if ((p5VarArr == null || p5VarArr.length == 0) && selectionEnd < 52) {
                            rw0Var.f39086s = true;
                            rw0Var.c();
                            rw0Var.W = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = rw0Var.K;
                                if (str2 != null && rw0Var.J == 1 && str2.equals(substring2) && !rw0Var.f39089y && (arrayList = rw0Var.f39088x) != null && !arrayList.isEmpty()) {
                                    rw0Var.f39087w = false;
                                    rw0Var.c();
                                    rw0Var.d.setVisibility(0);
                                    rw0Var.f39073a0 = org.telegram.messenger.g0.L(10.0f);
                                    rw0Var.d.invalidate();
                                } else {
                                    int i15 = rw0Var.L + 1;
                                    rw0Var.L = i15;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (rw0Var.M != null && Math.abs(currentTimeMillis - rw0Var.O) <= 360) {
                                        rw0Var.O = currentTimeMillis;
                                        G0 = rw0Var.M;
                                    } else {
                                        rw0Var.O = currentTimeMillis;
                                        G0 = org.telegram.messenger.g0.G0();
                                    }
                                    String[] strArr = G0;
                                    String[] strArr2 = rw0Var.M;
                                    if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                        org.telegram.messenger.si.b0(i13).M(strArr, false);
                                    }
                                    rw0Var.M = strArr;
                                    Runnable runnable2 = rw0Var.N;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.g0.r(runnable2);
                                        rw0Var.N = null;
                                    }
                                    rw0Var.N = new sp0(rw0Var, strArr, substring2, i15, 2);
                                    ArrayList arrayList6 = rw0Var.f39088x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        rw0Var.N.run();
                                    } else {
                                        org.telegram.messenger.g0.i3(rw0Var.N, 600L);
                                    }
                                }
                            }
                            bi.g2 g2Var5 = rw0Var.d;
                            if (g2Var5 != null) {
                                g2Var5.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = rw0Var.N;
                    if (runnable3 != null) {
                        org.telegram.messenger.g0.r(runnable3);
                        rw0Var.N = null;
                    }
                    rw0Var.f39086s = false;
                    bi.g2 g2Var6 = rw0Var.d;
                    if (g2Var6 != null) {
                        g2Var6.invalidate();
                        return;
                    }
                    return;
                }
                rw0Var.f39086s = false;
                rw0Var.f39087w = true;
                bi.g2 g2Var7 = rw0Var.d;
                if (g2Var7 != null) {
                    g2Var7.invalidate();
                    return;
                }
                return;
            case 13:
                xw0 xw0Var = (xw0) obj;
                xw0Var.L = null;
                xw0Var.b();
                return;
            case 14:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences e12 = org.telegram.messenger.np.e1();
                    e12.edit().putInt("showchattagsinfo", e12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 15:
                ((vy0) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((cz0) obj).f33722a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).k3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).m3(false, false, false);
                    }
                }
                return;
            case 17:
                b01 b01Var = (b01) obj;
                b01Var.K = null;
                b01Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f34420f).start();
                return;
            case 18:
                f01 f01Var = (f01) obj;
                ViewPropertyAnimator duration = f01Var.animate().alpha(0.0f).setListener(new h60(f01Var, 29)).setDuration(300L);
                f01Var.f34469b = duration;
                duration.start();
                return;
            case 19:
                h01 h01Var = (h01) obj;
                org.telegram.messenger.z10 z10Var = h01Var.f35139b;
                if (z10Var != null) {
                    z10Var.a(Long.valueOf(h01Var.f35138a.f35411t));
                    return;
                }
                return;
            case 20:
                v01 v01Var = (v01) obj;
                long j3 = v01Var.f40210b;
                if (!v01Var.d && v01Var.f40230y > 0.0f && (b0Var = (v4.b0) v01Var.f40226r.getLayoutManager()) != null && b0Var.N0() >= v01Var.f40227s.f38458c.size() - 3) {
                    org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(v01Var.f40208a).f25383r7;
                    long j10 = -j3;
                    if (!h00Var.e(j10)) {
                        h00Var.o(j10);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                p11 p11Var = (p11) ((org.telegram.ui.nn) obj).f49596c;
                if (p11Var.l()) {
                    p11Var.m();
                    return;
                }
                return;
            case 22:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                org.telegram.messenger.ns.f(gjVar.K1).k(115, gjVar);
                return;
            case 23:
                ((org.telegram.messenger.s10) obj).a(null, Boolean.FALSE);
                return;
            case 24:
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                return;
            case 25:
                ((z21) obj).f42221c.setVisibility(8);
                return;
            case 26:
                ((org.telegram.ui.bk) obj).f34505c.presentFragment(new org.telegram.ui.oy0());
                return;
            case 27:
                ((i31) obj).requestLayout();
                return;
            case 28:
                ((z31) obj).f();
                return;
            default:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f32774j0;
                undoView.getClass();
                try {
                    undoView.f32784f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }

    public ro0(Object obj, int i7) {
        this.f39016a = i7;
        this.f39017b = obj;
    }
}
