package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class bp0 implements Runnable {
    public final int f33789a;
    public final Object f33790b;

    public bp0(hi.k2 k2Var, int i7) {
        this.f33789a = 9;
        this.f33790b = k2Var;
    }

    @Override
    public final void run() {
        int i7;
        org.telegram.messenger.g6[] g6VarArr;
        x5[] x5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f33789a;
        Object obj = this.f33790b;
        switch (i10) {
            case 0:
                ((hi.s1) obj).setVisibility(8);
                return;
            case 1:
                it0 it0Var = ((eq0) obj).H;
                if (it0Var.F1) {
                    it0Var.q1(false);
                    return;
                }
                return;
            case 2:
                ((mr0) obj).f37530a.B1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.g2 g2Var = ((tr0) obj).f40139f.f36166y1;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((bp0) obj).run();
                return;
            case 5:
                ts0 ts0Var = (ts0) obj;
                ArrayList arrayList3 = ts0Var.f40144f;
                if (ts0Var.h) {
                    ts0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.ov) arrayList3.get(i11)).f26202b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.ov) arrayList3.get(i11)).f26201a));
                        }
                    }
                    org.telegram.messenger.pv I1 = ts0Var.f40150y.f36166y1.getMessagesController().I1();
                    ArrayList d = org.telegram.messenger.pv.d(I1.f26394j);
                    int i12 = I1.f26387a;
                    if (org.telegram.messenger.i10.i(i12).q()) {
                        i7 = org.telegram.messenger.mp.u1(i12).f25836q6;
                    } else {
                        i7 = org.telegram.messenger.mp.u1(i12).f25827p6;
                    }
                    if (arrayList4.size() <= i7 && !org.telegram.messenger.pv.k(d, arrayList4)) {
                        I1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((us0) obj).F();
                return;
            case 7:
                ((cu0) obj).V();
                return;
            case 8:
                ((lu0) obj).getClass();
                return;
            case 9:
                ((kv0) obj).l0(0);
                return;
            case 10:
                fv0 fv0Var = (fv0) obj;
                if (!fv0Var.f35207x) {
                    fv0Var.E = 0.0f;
                    return;
                }
                return;
            case 11:
                ((qw0) obj).b();
                return;
            case 12:
                zw0 zw0Var = (zw0) obj;
                int i13 = zw0Var.f43054a;
                zw0Var.I = null;
                xw0 xw0Var = zw0Var.f43058c;
                if (xw0Var != null && xw0Var.getEditField() != null && zw0Var.f43058c.getFieldText() != null) {
                    if (zw0Var.f43058c.a()) {
                        zw0Var.f43068s = false;
                        bi.g3 g3Var = zw0Var.d;
                        if (g3Var != null) {
                            g3Var.invalidate();
                            return;
                        }
                        return;
                    }
                    int selectionStart = zw0Var.f43058c.getEditField().getSelectionStart();
                    int selectionEnd = zw0Var.f43058c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        zw0Var.f43068s = false;
                        bi.g3 g3Var2 = zw0Var.d;
                        if (g3Var2 != null) {
                            g3Var2.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = zw0Var.f43058c.getFieldText();
                    boolean z10 = fieldText instanceof Spanned;
                    if (z10) {
                        g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.g6.class);
                    } else {
                        g6VarArr = null;
                    }
                    if (g6VarArr != null && g6VarArr.length > 0 && org.telegram.messenger.bz.F && org.telegram.messenger.i10.i(i13).q()) {
                        org.telegram.messenger.g6 g6Var = g6VarArr[g6VarArr.length - 1];
                        if (g6Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(g6Var);
                            int spanEnd = spanned.getSpanEnd(g6Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                zw0Var.f43068s = true;
                                zw0Var.c();
                                zw0Var.W = g6Var;
                                zw0Var.f43059c0 = null;
                                zw0Var.f43057b0 = null;
                                if (substring != null) {
                                    String str = zw0Var.K;
                                    if (str != null && zw0Var.J == 2 && str.equals(substring) && !zw0Var.f43071y && (arrayList2 = zw0Var.f43070x) != null && !arrayList2.isEmpty()) {
                                        zw0Var.f43069w = false;
                                        zw0Var.c();
                                        bi.g3 g3Var3 = zw0Var.d;
                                        if (g3Var3 != null) {
                                            g3Var3.setVisibility(0);
                                            zw0Var.d.invalidate();
                                        }
                                    } else {
                                        int i14 = zw0Var.L + 1;
                                        zw0Var.L = i14;
                                        Runnable runnable = zw0Var.N;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        zw0Var.N = new org.telegram.ui.f0(zw0Var, substring, i14, 27);
                                        ArrayList arrayList5 = zw0Var.f43070x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            zw0Var.N.run();
                                        } else {
                                            org.telegram.messenger.g0.h3(zw0Var.N, 600L);
                                        }
                                    }
                                }
                                bi.g3 g3Var4 = zw0Var.d;
                                if (g3Var4 != null) {
                                    g3Var4.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            x5VarArr = (x5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, x5.class);
                        } else {
                            x5VarArr = null;
                        }
                        if ((x5VarArr == null || x5VarArr.length == 0) && selectionEnd < 52) {
                            zw0Var.f43068s = true;
                            zw0Var.c();
                            zw0Var.W = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = zw0Var.K;
                                if (str2 != null && zw0Var.J == 1 && str2.equals(substring2) && !zw0Var.f43071y && (arrayList = zw0Var.f43070x) != null && !arrayList.isEmpty()) {
                                    zw0Var.f43069w = false;
                                    zw0Var.c();
                                    zw0Var.d.setVisibility(0);
                                    zw0Var.f43055a0 = org.telegram.messenger.g0.L(10.0f);
                                    zw0Var.d.invalidate();
                                } else {
                                    int i15 = zw0Var.L + 1;
                                    zw0Var.L = i15;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (zw0Var.M != null && Math.abs(currentTimeMillis - zw0Var.O) <= 360) {
                                        zw0Var.O = currentTimeMillis;
                                        G0 = zw0Var.M;
                                    } else {
                                        zw0Var.O = currentTimeMillis;
                                        G0 = org.telegram.messenger.g0.G0();
                                    }
                                    String[] strArr = G0;
                                    String[] strArr2 = zw0Var.M;
                                    if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                        org.telegram.messenger.ri.d0(i13).O(strArr, false);
                                    }
                                    zw0Var.M = strArr;
                                    Runnable runnable2 = zw0Var.N;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.g0.r(runnable2);
                                        zw0Var.N = null;
                                    }
                                    zw0Var.N = new kp0(zw0Var, strArr, substring2, i15, 4);
                                    ArrayList arrayList6 = zw0Var.f43070x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        zw0Var.N.run();
                                    } else {
                                        org.telegram.messenger.g0.h3(zw0Var.N, 600L);
                                    }
                                }
                            }
                            bi.g3 g3Var5 = zw0Var.d;
                            if (g3Var5 != null) {
                                g3Var5.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = zw0Var.N;
                    if (runnable3 != null) {
                        org.telegram.messenger.g0.r(runnable3);
                        zw0Var.N = null;
                    }
                    zw0Var.f43068s = false;
                    bi.g3 g3Var6 = zw0Var.d;
                    if (g3Var6 != null) {
                        g3Var6.invalidate();
                        return;
                    }
                    return;
                }
                zw0Var.f43068s = false;
                zw0Var.f43069w = true;
                bi.g3 g3Var7 = zw0Var.d;
                if (g3Var7 != null) {
                    g3Var7.invalidate();
                    return;
                }
                return;
            case 13:
                fx0 fx0Var = (fx0) obj;
                fx0Var.L = null;
                fx0Var.b();
                return;
            case 14:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences g12 = org.telegram.messenger.mp.g1();
                    g12.edit().putInt("showchattagsinfo", g12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 15:
                ((dz0) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((kz0) obj).f36930a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) arrayList7.get(i16)).l3(false, false);
                        ((org.telegram.ui.Cells.r1) arrayList7.get(i16)).n3(false, false, false);
                    }
                }
                return;
            case 17:
                j01 j01Var = (j01) obj;
                j01Var.K = null;
                j01Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(kr.f36858f).start();
                return;
            case 18:
                n01 n01Var = (n01) obj;
                ViewPropertyAnimator duration = n01Var.animate().alpha(0.0f).setListener(new p60(n01Var, 29)).setDuration(300L);
                n01Var.f37609b = duration;
                duration.start();
                return;
            case 19:
                p01 p01Var = (p01) obj;
                org.telegram.messenger.w10 w10Var = p01Var.f38355b;
                if (w10Var != null) {
                    w10Var.a(Long.valueOf(p01Var.f38354a.f38656t));
                    return;
                }
                return;
            case 20:
                z11 z11Var = (z11) ((org.telegram.ui.on) obj).f50730c;
                if (z11Var.l()) {
                    z11Var.m();
                    return;
                }
                return;
            case 21:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                org.telegram.messenger.ks.f(fjVar.K1).k(115, fjVar);
                return;
            case 22:
                ((org.telegram.messenger.p10) obj).a(null, Boolean.FALSE);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                return;
            case 24:
                ((k31) obj).f36635c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.ck) obj).f39171c.presentFragment(new org.telegram.ui.ry0());
                return;
            case 26:
                ((u31) obj).requestLayout();
                return;
            case 27:
                ((l41) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f33271j0;
                undoView.getClass();
                try {
                    undoView.f33281f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((j51) obj).invalidateSelf();
                return;
        }
    }

    public bp0(Object obj, int i7) {
        this.f33789a = i7;
        this.f33790b = obj;
    }
}
