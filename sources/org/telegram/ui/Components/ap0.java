package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class ap0 implements Runnable {
    public final int f33415a;
    public final Object f33416b;

    public ap0(hi.d2 d2Var, int i7) {
        this.f33415a = 9;
        this.f33416b = d2Var;
    }

    @Override
    public final void run() {
        int i7;
        org.telegram.messenger.g6[] g6VarArr;
        x5[] x5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f33415a;
        Object obj = this.f33416b;
        switch (i10) {
            case 0:
                ((hi.k1) obj).setVisibility(8);
                return;
            case 1:
                gt0 gt0Var = ((dq0) obj).H;
                if (gt0Var.F1) {
                    gt0Var.q1(false);
                    return;
                }
                return;
            case 2:
                ((lr0) obj).f37218a.B1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.h2 h2Var = ((sr0) obj).f39833f.f35642y1;
                if (h2Var != null) {
                    h2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((ap0) obj).run();
                return;
            case 5:
                rs0 rs0Var = (rs0) obj;
                ArrayList arrayList3 = rs0Var.f39294f;
                if (rs0Var.h) {
                    rs0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.ov) arrayList3.get(i11)).f26105b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.ov) arrayList3.get(i11)).f26104a));
                        }
                    }
                    org.telegram.messenger.pv I1 = rs0Var.f39300y.f35642y1.getMessagesController().I1();
                    ArrayList d = org.telegram.messenger.pv.d(I1.f26300j);
                    int i12 = I1.f26293a;
                    if (org.telegram.messenger.j10.i(i12).q()) {
                        i7 = org.telegram.messenger.mp.u1(i12).f25741q6;
                    } else {
                        i7 = org.telegram.messenger.mp.u1(i12).f25732p6;
                    }
                    if (arrayList4.size() <= i7 && !org.telegram.messenger.pv.k(d, arrayList4)) {
                        I1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((ss0) obj).F();
                return;
            case 7:
                ((au0) obj).V();
                return;
            case 8:
                ((ju0) obj).getClass();
                return;
            case 9:
                ((iv0) obj).l0(0);
                return;
            case 10:
                dv0 dv0Var = (dv0) obj;
                if (!dv0Var.f34519x) {
                    dv0Var.E = 0.0f;
                    return;
                }
                return;
            case 11:
                ((pw0) obj).b();
                return;
            case 12:
                yw0 yw0Var = (yw0) obj;
                int i13 = yw0Var.f42643a;
                yw0Var.I = null;
                ww0 ww0Var = yw0Var.f42647c;
                if (ww0Var != null && ww0Var.getEditField() != null && yw0Var.f42647c.getFieldText() != null) {
                    if (yw0Var.f42647c.a()) {
                        yw0Var.f42657s = false;
                        bi.a3 a3Var = yw0Var.d;
                        if (a3Var != null) {
                            a3Var.invalidate();
                            return;
                        }
                        return;
                    }
                    int selectionStart = yw0Var.f42647c.getEditField().getSelectionStart();
                    int selectionEnd = yw0Var.f42647c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        yw0Var.f42657s = false;
                        bi.a3 a3Var2 = yw0Var.d;
                        if (a3Var2 != null) {
                            a3Var2.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = yw0Var.f42647c.getFieldText();
                    boolean z10 = fieldText instanceof Spanned;
                    if (z10) {
                        g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.g6.class);
                    } else {
                        g6VarArr = null;
                    }
                    if (g6VarArr != null && g6VarArr.length > 0 && org.telegram.messenger.bz.F && org.telegram.messenger.j10.i(i13).q()) {
                        org.telegram.messenger.g6 g6Var = g6VarArr[g6VarArr.length - 1];
                        if (g6Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(g6Var);
                            int spanEnd = spanned.getSpanEnd(g6Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                yw0Var.f42657s = true;
                                yw0Var.c();
                                yw0Var.W = g6Var;
                                yw0Var.f42648c0 = null;
                                yw0Var.f42646b0 = null;
                                if (substring != null) {
                                    String str = yw0Var.K;
                                    if (str != null && yw0Var.J == 2 && str.equals(substring) && !yw0Var.f42660y && (arrayList2 = yw0Var.f42659x) != null && !arrayList2.isEmpty()) {
                                        yw0Var.f42658w = false;
                                        yw0Var.c();
                                        bi.a3 a3Var3 = yw0Var.d;
                                        if (a3Var3 != null) {
                                            a3Var3.setVisibility(0);
                                            yw0Var.d.invalidate();
                                        }
                                    } else {
                                        int i14 = yw0Var.L + 1;
                                        yw0Var.L = i14;
                                        Runnable runnable = yw0Var.N;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        yw0Var.N = new org.telegram.ui.b0(yw0Var, substring, i14, 28);
                                        ArrayList arrayList5 = yw0Var.f42659x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            yw0Var.N.run();
                                        } else {
                                            org.telegram.messenger.g0.h3(yw0Var.N, 600L);
                                        }
                                    }
                                }
                                bi.a3 a3Var4 = yw0Var.d;
                                if (a3Var4 != null) {
                                    a3Var4.invalidate();
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
                            yw0Var.f42657s = true;
                            yw0Var.c();
                            yw0Var.W = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = yw0Var.K;
                                if (str2 != null && yw0Var.J == 1 && str2.equals(substring2) && !yw0Var.f42660y && (arrayList = yw0Var.f42659x) != null && !arrayList.isEmpty()) {
                                    yw0Var.f42658w = false;
                                    yw0Var.c();
                                    yw0Var.d.setVisibility(0);
                                    yw0Var.f42644a0 = org.telegram.messenger.g0.L(10.0f);
                                    yw0Var.d.invalidate();
                                } else {
                                    int i15 = yw0Var.L + 1;
                                    yw0Var.L = i15;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (yw0Var.M != null && Math.abs(currentTimeMillis - yw0Var.O) <= 360) {
                                        yw0Var.O = currentTimeMillis;
                                        G0 = yw0Var.M;
                                    } else {
                                        yw0Var.O = currentTimeMillis;
                                        G0 = org.telegram.messenger.g0.G0();
                                    }
                                    String[] strArr = G0;
                                    String[] strArr2 = yw0Var.M;
                                    if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                        org.telegram.messenger.ri.d0(i13).O(strArr, false);
                                    }
                                    yw0Var.M = strArr;
                                    Runnable runnable2 = yw0Var.N;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.g0.r(runnable2);
                                        yw0Var.N = null;
                                    }
                                    yw0Var.N = new kp0(yw0Var, strArr, substring2, i15, 3);
                                    ArrayList arrayList6 = yw0Var.f42659x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        yw0Var.N.run();
                                    } else {
                                        org.telegram.messenger.g0.h3(yw0Var.N, 600L);
                                    }
                                }
                            }
                            bi.a3 a3Var5 = yw0Var.d;
                            if (a3Var5 != null) {
                                a3Var5.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = yw0Var.N;
                    if (runnable3 != null) {
                        org.telegram.messenger.g0.r(runnable3);
                        yw0Var.N = null;
                    }
                    yw0Var.f42657s = false;
                    bi.a3 a3Var6 = yw0Var.d;
                    if (a3Var6 != null) {
                        a3Var6.invalidate();
                        return;
                    }
                    return;
                }
                yw0Var.f42657s = false;
                yw0Var.f42658w = true;
                bi.a3 a3Var7 = yw0Var.d;
                if (a3Var7 != null) {
                    a3Var7.invalidate();
                    return;
                }
                return;
            case 13:
                ex0 ex0Var = (ex0) obj;
                ex0Var.L = null;
                ex0Var.b();
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
                ((cz0) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((jz0) obj).f36562a;
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
                j01Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(lr.f37208f).start();
                return;
            case 18:
                n01 n01Var = (n01) obj;
                ViewPropertyAnimator duration = n01Var.animate().alpha(0.0f).setListener(new q60(n01Var, 29)).setDuration(300L);
                n01Var.f37686b = duration;
                duration.start();
                return;
            case 19:
                p01 p01Var = (p01) obj;
                org.telegram.messenger.x10 x10Var = p01Var.f38225b;
                if (x10Var != null) {
                    x10Var.a(Long.valueOf(p01Var.f38224a.f38676t));
                    return;
                }
                return;
            case 20:
                z11 z11Var = (z11) ((org.telegram.ui.on) obj).f50593c;
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
                ((org.telegram.messenger.q10) obj).a(null, Boolean.FALSE);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.h1) obj).dismiss();
                return;
            case 24:
                ((j31) obj).f36321c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.ck) obj).f38257c.presentFragment(new org.telegram.ui.sy0());
                return;
            case 26:
                ((s31) obj).requestLayout();
                return;
            case 27:
                ((j41) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f33171j0;
                undoView.getClass();
                try {
                    undoView.f33181f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((h51) obj).invalidateSelf();
                return;
        }
    }

    public ap0(Object obj, int i7) {
        this.f33415a = i7;
        this.f33416b = obj;
    }
}
