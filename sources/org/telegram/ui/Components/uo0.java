package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class uo0 implements Runnable {
    public final int f31005a;
    public final Object f31006b;

    public uo0(Object obj, int i10) {
        this.f31005a = i10;
        this.f31006b = obj;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.h6[] h6VarArr;
        o5[] o5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11 = this.f31005a;
        int i12 = 0;
        Object obj = this.f31006b;
        switch (i11) {
            case 0:
                ((vo0) obj).f31300b.b1(1);
                return;
            case 1:
                sp0 sp0Var = (sp0) obj;
                qp0[] qp0VarArr = sp0Var.f30320a;
                if (sp0Var.f30321b != 1) {
                    for (qp0 qp0Var : qp0VarArr) {
                        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) qp0Var.f29719f;
                        u5Var.setAlpha(1.0f);
                        u5Var.setScaleX(1.0f);
                        u5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.u5) qp0Var.h).setAlpha(0.0f);
                    }
                    sp0Var.E = false;
                    org.telegram.messenger.i0.h3(sp0Var.G, 4000L);
                    return;
                }
                sp0Var.E = !sp0Var.E;
                int length = qp0VarArr.length;
                while (i12 < length) {
                    qp0 qp0Var2 = qp0VarArr[i12];
                    org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) qp0Var2.f29719f;
                    org.telegram.ui.ActionBar.u5 u5Var3 = (org.telegram.ui.ActionBar.u5) qp0Var2.h;
                    u5Var2.setPivotX(0.0f);
                    u5Var3.setPivotX(0.0f);
                    if (sp0Var.E) {
                        u5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        u5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        u5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        u5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i12++;
                }
                org.telegram.messenger.i0.h3(sp0Var.G, 4000L);
                return;
            case 2:
                ((qp0) obj).setVisibility(8);
                return;
            case 3:
                zt0 zt0Var = ((uq0) obj).G;
                if (zt0Var.E1) {
                    zt0Var.l1(false);
                    return;
                }
                return;
            case 4:
                ((ds0) obj).f25530a.w1(false);
                return;
            case 5:
                org.telegram.ui.ActionBar.k2 k2Var = ((js0) obj).f27485f.f33240x1;
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 6:
                ((uo0) obj).run();
                return;
            case 7:
                it0 it0Var = (it0) obj;
                ArrayList arrayList3 = it0Var.f27078f;
                if (it0Var.h) {
                    it0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    while (i12 < arrayList3.size()) {
                        if (((org.telegram.messenger.fw) arrayList3.get(i12)).f15625b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.fw) arrayList3.get(i12)).f15624a));
                        }
                        i12++;
                    }
                    org.telegram.messenger.gw F1 = it0Var.f27084y.f33240x1.getMessagesController().F1();
                    ArrayList d = org.telegram.messenger.gw.d(F1.f15772j);
                    int i13 = F1.f15766a;
                    if (org.telegram.messenger.d20.i(i13).q()) {
                        i10 = org.telegram.messenger.vp.r1(i13).f18864o6;
                    } else {
                        i10 = org.telegram.messenger.vp.r1(i13).f18855n6;
                    }
                    if (arrayList4.size() <= i10 && !org.telegram.messenger.gw.k(d, arrayList4)) {
                        F1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((lt0) obj).F();
                return;
            case 9:
                ((uu0) obj).V();
                return;
            case 10:
                ((dv0) obj).getClass();
                return;
            case 11:
                ((bw0) obj).l0(0);
                return;
            case 12:
                wv0 wv0Var = (wv0) obj;
                if (!wv0Var.f32263x) {
                    wv0Var.D = 0.0f;
                    return;
                }
                return;
            case 13:
                ((jx0) obj).b();
                return;
            case 14:
                sx0 sx0Var = (sx0) obj;
                int i14 = sx0Var.f30368a;
                sx0Var.H = null;
                qx0 qx0Var = sx0Var.f30372c;
                if (qx0Var != null && qx0Var.getEditField() != null && sx0Var.f30372c.getFieldText() != null) {
                    int selectionStart = sx0Var.f30372c.getEditField().getSelectionStart();
                    int selectionEnd = sx0Var.f30372c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        sx0Var.f30380s = false;
                        jg.l0 l0Var = sx0Var.d;
                        if (l0Var != null) {
                            l0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = sx0Var.f30372c.getFieldText();
                    boolean z10 = fieldText instanceof Spanned;
                    if (z10) {
                        h6VarArr = (org.telegram.messenger.h6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.h6.class);
                    } else {
                        h6VarArr = null;
                    }
                    if (h6VarArr != null && h6VarArr.length > 0 && org.telegram.messenger.tz.F && org.telegram.messenger.d20.i(i14).q()) {
                        org.telegram.messenger.h6 h6Var = h6VarArr[h6VarArr.length - 1];
                        if (h6Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(h6Var);
                            int spanEnd = spanned.getSpanEnd(h6Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                sx0Var.f30380s = true;
                                sx0Var.c();
                                sx0Var.V = h6Var;
                                sx0Var.f30371b0 = null;
                                sx0Var.f30369a0 = null;
                                if (substring != null) {
                                    String str = sx0Var.J;
                                    if (str != null && sx0Var.I == 2 && str.equals(substring) && !sx0Var.f30383y && (arrayList2 = sx0Var.f30382x) != null && !arrayList2.isEmpty()) {
                                        sx0Var.f30381w = false;
                                        sx0Var.c();
                                        jg.l0 l0Var2 = sx0Var.d;
                                        if (l0Var2 != null) {
                                            l0Var2.setVisibility(0);
                                            sx0Var.d.invalidate();
                                        }
                                    } else {
                                        int i15 = sx0Var.K + 1;
                                        sx0Var.K = i15;
                                        Runnable runnable = sx0Var.M;
                                        if (runnable != null) {
                                            org.telegram.messenger.i0.r(runnable);
                                        }
                                        sx0Var.M = new ji0(sx0Var, substring, i15, 11);
                                        ArrayList arrayList5 = sx0Var.f30382x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            sx0Var.M.run();
                                        } else {
                                            org.telegram.messenger.i0.h3(sx0Var.M, 600L);
                                        }
                                    }
                                }
                                jg.l0 l0Var3 = sx0Var.d;
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
                            sx0Var.f30380s = true;
                            sx0Var.c();
                            sx0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = sx0Var.J;
                                if (str2 != null && sx0Var.I == 1 && str2.equals(substring2) && !sx0Var.f30383y && (arrayList = sx0Var.f30382x) != null && !arrayList.isEmpty()) {
                                    sx0Var.f30381w = false;
                                    sx0Var.c();
                                    sx0Var.d.setVisibility(0);
                                    sx0Var.W = org.telegram.messenger.i0.L(10.0f);
                                    sx0Var.d.invalidate();
                                } else {
                                    int i16 = sx0Var.K + 1;
                                    sx0Var.K = i16;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (sx0Var.L != null && Math.abs(currentTimeMillis - sx0Var.N) <= 360) {
                                        sx0Var.N = currentTimeMillis;
                                        G0 = sx0Var.L;
                                    } else {
                                        sx0Var.N = currentTimeMillis;
                                        G0 = org.telegram.messenger.i0.G0();
                                    }
                                    String[] strArr = sx0Var.L;
                                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                                        org.telegram.messenger.ui.b0(i14).M(G0, false);
                                    }
                                    sx0Var.L = G0;
                                    Runnable runnable2 = sx0Var.M;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.i0.r(runnable2);
                                        sx0Var.M = null;
                                    }
                                    sx0Var.M = new ag.g3(sx0Var, G0, substring2, i16, 27);
                                    ArrayList arrayList6 = sx0Var.f30382x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        sx0Var.M.run();
                                    } else {
                                        org.telegram.messenger.i0.h3(sx0Var.M, 600L);
                                    }
                                }
                            }
                            jg.l0 l0Var4 = sx0Var.d;
                            if (l0Var4 != null) {
                                l0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = sx0Var.M;
                    if (runnable3 != null) {
                        org.telegram.messenger.i0.r(runnable3);
                        sx0Var.M = null;
                    }
                    sx0Var.f30380s = false;
                    jg.l0 l0Var5 = sx0Var.d;
                    if (l0Var5 != null) {
                        l0Var5.invalidate();
                        return;
                    }
                    return;
                }
                sx0Var.f30380s = false;
                sx0Var.f30381w = true;
                jg.l0 l0Var6 = sx0Var.d;
                if (l0Var6 != null) {
                    l0Var6.invalidate();
                    return;
                }
                return;
            case 15:
                yx0 yx0Var = (yx0) obj;
                yx0Var.K = null;
                yx0Var.b();
                return;
            case 16:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences d12 = org.telegram.messenger.vp.d1();
                    d12.edit().putInt("showchattagsinfo", d12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 17:
                ((xz0) obj).a();
                return;
            case 18:
                ArrayList arrayList7 = ((e01) obj).f25583a;
                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                    ((View) arrayList7.get(i17)).setVisibility(8);
                    if (arrayList7.get(i17) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i17)).f3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i17)).h3(false, false, false);
                    }
                }
                return;
            case 19:
                e11 e11Var = (e11) obj;
                e11Var.J = null;
                e11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f26495f).start();
                return;
            case 20:
                i11 i11Var = (i11) obj;
                ViewPropertyAnimator duration = i11Var.animate().alpha(0.0f).setListener(new t60(i11Var, 29)).setDuration(300L);
                i11Var.f26864b = duration;
                duration.start();
                return;
            case 21:
                k11 k11Var = (k11) obj;
                org.telegram.messenger.q20 q20Var = k11Var.f27606b;
                if (q20Var != null) {
                    q20Var.a(Long.valueOf(k11Var.f27605a.f27985t));
                    return;
                }
                return;
            case 22:
                o21 o21Var = (o21) ((ha0) obj).f26683c;
                if (o21Var.l()) {
                    o21Var.m();
                    return;
                }
                return;
            case 23:
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                org.telegram.messenger.zs.f(jjVar.I1).k(115, jjVar);
                return;
            case 24:
                ((org.telegram.messenger.j20) obj).a(null, Boolean.FALSE);
                return;
            case 25:
                ((org.telegram.ui.ActionBar.k1) obj).dismiss();
                return;
            case 26:
                ((w31) obj).f31981c.setVisibility(8);
                return;
            case 27:
                ((org.telegram.ui.xk) obj).f25290c.presentFragment(new org.telegram.ui.e01());
                return;
            case 28:
                ((g41) obj).requestLayout();
                return;
            default:
                ((y41) obj).f();
                return;
        }
    }

    public uo0(vh.o1 o1Var, int i10) {
        this.f31005a = 11;
        this.f31006b = o1Var;
    }
}
