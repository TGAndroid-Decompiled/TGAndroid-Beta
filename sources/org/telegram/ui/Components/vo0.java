package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class vo0 implements Runnable {
    public final int f31356a;
    public final Object f31357b;

    public vo0(Object obj, int i10) {
        this.f31356a = i10;
        this.f31357b = obj;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.h6[] h6VarArr;
        o5[] o5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11 = this.f31356a;
        int i12 = 0;
        Object obj = this.f31357b;
        switch (i11) {
            case 0:
                ((wo0) obj).f32291b.b1(1);
                return;
            case 1:
                tp0 tp0Var = (tp0) obj;
                rp0[] rp0VarArr = tp0Var.f30690a;
                if (tp0Var.f30691b != 1) {
                    for (rp0 rp0Var : rp0VarArr) {
                        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) rp0Var.f30059f;
                        u5Var.setAlpha(1.0f);
                        u5Var.setScaleX(1.0f);
                        u5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.u5) rp0Var.h).setAlpha(0.0f);
                    }
                    tp0Var.E = false;
                    org.telegram.messenger.i0.h3(tp0Var.G, 4000L);
                    return;
                }
                tp0Var.E = !tp0Var.E;
                int length = rp0VarArr.length;
                while (i12 < length) {
                    rp0 rp0Var2 = rp0VarArr[i12];
                    org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) rp0Var2.f30059f;
                    org.telegram.ui.ActionBar.u5 u5Var3 = (org.telegram.ui.ActionBar.u5) rp0Var2.h;
                    u5Var2.setPivotX(0.0f);
                    u5Var3.setPivotX(0.0f);
                    if (tp0Var.E) {
                        u5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        u5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        u5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        u5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i12++;
                }
                org.telegram.messenger.i0.h3(tp0Var.G, 4000L);
                return;
            case 2:
                ((rp0) obj).setVisibility(8);
                return;
            case 3:
                au0 au0Var = ((vq0) obj).G;
                if (au0Var.E1) {
                    au0Var.m1(false);
                    return;
                }
                return;
            case 4:
                ((es0) obj).f25922a.x1(false);
                return;
            case 5:
                org.telegram.ui.ActionBar.k2 k2Var = ((ks0) obj).f27954f.f24568x1;
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 6:
                ((vo0) obj).run();
                return;
            case 7:
                jt0 jt0Var = (jt0) obj;
                ArrayList arrayList3 = jt0Var.f27566f;
                if (jt0Var.h) {
                    jt0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    while (i12 < arrayList3.size()) {
                        if (((org.telegram.messenger.gw) arrayList3.get(i12)).f15966b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.gw) arrayList3.get(i12)).f15965a));
                        }
                        i12++;
                    }
                    org.telegram.messenger.hw F1 = jt0Var.f27572y.f24568x1.getMessagesController().F1();
                    ArrayList d = org.telegram.messenger.hw.d(F1.f16121j);
                    int i13 = F1.f16115a;
                    if (org.telegram.messenger.e20.i(i13).q()) {
                        i10 = org.telegram.messenger.wp.r1(i13).f19207o6;
                    } else {
                        i10 = org.telegram.messenger.wp.r1(i13).f19198n6;
                    }
                    if (arrayList4.size() <= i10 && !org.telegram.messenger.hw.k(d, arrayList4)) {
                        F1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((mt0) obj).F();
                return;
            case 9:
                ((vu0) obj).V();
                return;
            case 10:
                ((ev0) obj).getClass();
                return;
            case 11:
                ((cw0) obj).l0(0);
                return;
            case 12:
                xv0 xv0Var = (xv0) obj;
                if (!xv0Var.f32643x) {
                    xv0Var.D = 0.0f;
                    return;
                }
                return;
            case 13:
                ((kx0) obj).b();
                return;
            case 14:
                tx0 tx0Var = (tx0) obj;
                int i14 = tx0Var.f30728a;
                tx0Var.H = null;
                rx0 rx0Var = tx0Var.f30732c;
                if (rx0Var != null && rx0Var.getEditField() != null && tx0Var.f30732c.getFieldText() != null) {
                    int selectionStart = tx0Var.f30732c.getEditField().getSelectionStart();
                    int selectionEnd = tx0Var.f30732c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        tx0Var.f30740s = false;
                        jg.l0 l0Var = tx0Var.d;
                        if (l0Var != null) {
                            l0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = tx0Var.f30732c.getFieldText();
                    boolean z10 = fieldText instanceof Spanned;
                    if (z10) {
                        h6VarArr = (org.telegram.messenger.h6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.h6.class);
                    } else {
                        h6VarArr = null;
                    }
                    if (h6VarArr != null && h6VarArr.length > 0 && org.telegram.messenger.uz.F && org.telegram.messenger.e20.i(i14).q()) {
                        org.telegram.messenger.h6 h6Var = h6VarArr[h6VarArr.length - 1];
                        if (h6Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(h6Var);
                            int spanEnd = spanned.getSpanEnd(h6Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                tx0Var.f30740s = true;
                                tx0Var.c();
                                tx0Var.V = h6Var;
                                tx0Var.f30731b0 = null;
                                tx0Var.f30729a0 = null;
                                if (substring != null) {
                                    String str = tx0Var.J;
                                    if (str != null && tx0Var.I == 2 && str.equals(substring) && !tx0Var.f30743y && (arrayList2 = tx0Var.f30742x) != null && !arrayList2.isEmpty()) {
                                        tx0Var.f30741w = false;
                                        tx0Var.c();
                                        jg.l0 l0Var2 = tx0Var.d;
                                        if (l0Var2 != null) {
                                            l0Var2.setVisibility(0);
                                            tx0Var.d.invalidate();
                                        }
                                    } else {
                                        int i15 = tx0Var.K + 1;
                                        tx0Var.K = i15;
                                        Runnable runnable = tx0Var.M;
                                        if (runnable != null) {
                                            org.telegram.messenger.i0.r(runnable);
                                        }
                                        tx0Var.M = new ki0(tx0Var, substring, i15, 11);
                                        ArrayList arrayList5 = tx0Var.f30742x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            tx0Var.M.run();
                                        } else {
                                            org.telegram.messenger.i0.h3(tx0Var.M, 600L);
                                        }
                                    }
                                }
                                jg.l0 l0Var3 = tx0Var.d;
                                if (l0Var3 != null) {
                                    l0Var3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            o5VarArr = (o5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, o5.class);
                        } else {
                            o5VarArr = null;
                        }
                        if ((o5VarArr == null || o5VarArr.length == 0) && selectionEnd < 52) {
                            tx0Var.f30740s = true;
                            tx0Var.c();
                            tx0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = tx0Var.J;
                                if (str2 != null && tx0Var.I == 1 && str2.equals(substring2) && !tx0Var.f30743y && (arrayList = tx0Var.f30742x) != null && !arrayList.isEmpty()) {
                                    tx0Var.f30741w = false;
                                    tx0Var.c();
                                    tx0Var.d.setVisibility(0);
                                    tx0Var.W = org.telegram.messenger.i0.L(10.0f);
                                    tx0Var.d.invalidate();
                                } else {
                                    int i16 = tx0Var.K + 1;
                                    tx0Var.K = i16;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (tx0Var.L != null && Math.abs(currentTimeMillis - tx0Var.N) <= 360) {
                                        tx0Var.N = currentTimeMillis;
                                        G0 = tx0Var.L;
                                    } else {
                                        tx0Var.N = currentTimeMillis;
                                        G0 = org.telegram.messenger.i0.G0();
                                    }
                                    String[] strArr = tx0Var.L;
                                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                                        org.telegram.messenger.vi.b0(i14).M(G0, false);
                                    }
                                    tx0Var.L = G0;
                                    Runnable runnable2 = tx0Var.M;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.i0.r(runnable2);
                                        tx0Var.M = null;
                                    }
                                    tx0Var.M = new ag.g3(tx0Var, G0, substring2, i16, 27);
                                    ArrayList arrayList6 = tx0Var.f30742x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        tx0Var.M.run();
                                    } else {
                                        org.telegram.messenger.i0.h3(tx0Var.M, 600L);
                                    }
                                }
                            }
                            jg.l0 l0Var4 = tx0Var.d;
                            if (l0Var4 != null) {
                                l0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = tx0Var.M;
                    if (runnable3 != null) {
                        org.telegram.messenger.i0.r(runnable3);
                        tx0Var.M = null;
                    }
                    tx0Var.f30740s = false;
                    jg.l0 l0Var5 = tx0Var.d;
                    if (l0Var5 != null) {
                        l0Var5.invalidate();
                        return;
                    }
                    return;
                }
                tx0Var.f30740s = false;
                tx0Var.f30741w = true;
                jg.l0 l0Var6 = tx0Var.d;
                if (l0Var6 != null) {
                    l0Var6.invalidate();
                    return;
                }
                return;
            case 15:
                zx0 zx0Var = (zx0) obj;
                zx0Var.K = null;
                zx0Var.b();
                return;
            case 16:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences d12 = org.telegram.messenger.wp.d1();
                    d12.edit().putInt("showchattagsinfo", d12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 17:
                ((yz0) obj).a();
                return;
            case 18:
                ArrayList arrayList7 = ((f01) obj).f25996a;
                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                    ((View) arrayList7.get(i17)).setVisibility(8);
                    if (arrayList7.get(i17) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i17)).f3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i17)).h3(false, false, false);
                    }
                }
                return;
            case 19:
                f11 f11Var = (f11) obj;
                f11Var.J = null;
                f11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f26523f).start();
                return;
            case 20:
                j11 j11Var = (j11) obj;
                ViewPropertyAnimator duration = j11Var.animate().alpha(0.0f).setListener(new t60(j11Var, 29)).setDuration(300L);
                j11Var.f27250b = duration;
                duration.start();
                return;
            case 21:
                l11 l11Var = (l11) obj;
                org.telegram.messenger.r20 r20Var = l11Var.f28020b;
                if (r20Var != null) {
                    r20Var.a(Long.valueOf(l11Var.f28019a.f28339t));
                    return;
                }
                return;
            case 22:
                p21 p21Var = (p21) ((ha0) obj).f26741c;
                if (p21Var.l()) {
                    p21Var.m();
                    return;
                }
                return;
            case 23:
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                org.telegram.messenger.at.f(kjVar.I1).k(115, kjVar);
                return;
            case 24:
                ((org.telegram.messenger.k20) obj).a(null, Boolean.FALSE);
                return;
            case 25:
                ((org.telegram.ui.ActionBar.k1) obj).dismiss();
                return;
            case 26:
                ((x31) obj).f32369c.setVisibility(8);
                return;
            case 27:
                ((org.telegram.ui.xk) obj).f25684c.presentFragment(new org.telegram.ui.e01());
                return;
            case 28:
                ((h41) obj).requestLayout();
                return;
            default:
                ((z41) obj).f();
                return;
        }
    }

    public vo0(vh.o1 o1Var, int i10) {
        this.f31356a = 11;
        this.f31357b = o1Var;
    }
}
