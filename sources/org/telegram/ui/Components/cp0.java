package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class cp0 implements Runnable {
    public final int f34274a;
    public final Object f34275b;

    public cp0(hi.c2 c2Var, int i7) {
        this.f34274a = 9;
        this.f34275b = c2Var;
    }

    @Override
    public final void run() {
        int i7;
        org.telegram.messenger.g6[] g6VarArr;
        y5[] y5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f34274a;
        Object obj = this.f34275b;
        switch (i10) {
            case 0:
                ((hi.k1) obj).setVisibility(8);
                return;
            case 1:
                jt0 jt0Var = ((fq0) obj).H;
                if (jt0Var.F1) {
                    jt0Var.q1(false);
                    return;
                }
                return;
            case 2:
                ((nr0) obj).f37966a.B1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.g2 g2Var = ((ur0) obj).f40576f.f36689y1;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((cp0) obj).run();
                return;
            case 5:
                us0 us0Var = (us0) obj;
                ArrayList arrayList3 = us0Var.f40582f;
                if (us0Var.h) {
                    us0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.ov) arrayList3.get(i11)).f26133b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.ov) arrayList3.get(i11)).f26132a));
                        }
                    }
                    org.telegram.messenger.pv I1 = us0Var.f40588y.f36689y1.getMessagesController().I1();
                    ArrayList d = org.telegram.messenger.pv.d(I1.f26328j);
                    int i12 = I1.f26321a;
                    if (org.telegram.messenger.j10.i(i12).q()) {
                        i7 = org.telegram.messenger.mp.u1(i12).f25769q6;
                    } else {
                        i7 = org.telegram.messenger.mp.u1(i12).f25760p6;
                    }
                    if (arrayList4.size() <= i7 && !org.telegram.messenger.pv.k(d, arrayList4)) {
                        I1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((vs0) obj).F();
                return;
            case 7:
                ((du0) obj).V();
                return;
            case 8:
                ((mu0) obj).getClass();
                return;
            case 9:
                ((lv0) obj).l0(0);
                return;
            case 10:
                gv0 gv0Var = (gv0) obj;
                if (!gv0Var.f35667x) {
                    gv0Var.E = 0.0f;
                    return;
                }
                return;
            case 11:
                ((rw0) obj).b();
                return;
            case 12:
                ax0 ax0Var = (ax0) obj;
                int i13 = ax0Var.f33639a;
                ax0Var.I = null;
                yw0 yw0Var = ax0Var.f33643c;
                if (yw0Var != null && yw0Var.getEditField() != null && ax0Var.f33643c.getFieldText() != null) {
                    if (ax0Var.f33643c.a()) {
                        ax0Var.f33653s = false;
                        bi.e3 e3Var = ax0Var.d;
                        if (e3Var != null) {
                            e3Var.invalidate();
                            return;
                        }
                        return;
                    }
                    int selectionStart = ax0Var.f33643c.getEditField().getSelectionStart();
                    int selectionEnd = ax0Var.f33643c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ax0Var.f33653s = false;
                        bi.e3 e3Var2 = ax0Var.d;
                        if (e3Var2 != null) {
                            e3Var2.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = ax0Var.f33643c.getFieldText();
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
                                ax0Var.f33653s = true;
                                ax0Var.c();
                                ax0Var.W = g6Var;
                                ax0Var.f33644c0 = null;
                                ax0Var.f33642b0 = null;
                                if (substring != null) {
                                    String str = ax0Var.K;
                                    if (str != null && ax0Var.J == 2 && str.equals(substring) && !ax0Var.f33656y && (arrayList2 = ax0Var.f33655x) != null && !arrayList2.isEmpty()) {
                                        ax0Var.f33654w = false;
                                        ax0Var.c();
                                        bi.e3 e3Var3 = ax0Var.d;
                                        if (e3Var3 != null) {
                                            e3Var3.setVisibility(0);
                                            ax0Var.d.invalidate();
                                        }
                                    } else {
                                        int i14 = ax0Var.L + 1;
                                        ax0Var.L = i14;
                                        Runnable runnable = ax0Var.N;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        ax0Var.N = new org.telegram.ui.b0(ax0Var, substring, i14, 28);
                                        ArrayList arrayList5 = ax0Var.f33655x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            ax0Var.N.run();
                                        } else {
                                            org.telegram.messenger.g0.h3(ax0Var.N, 600L);
                                        }
                                    }
                                }
                                bi.e3 e3Var4 = ax0Var.d;
                                if (e3Var4 != null) {
                                    e3Var4.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            y5VarArr = (y5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, y5.class);
                        } else {
                            y5VarArr = null;
                        }
                        if ((y5VarArr == null || y5VarArr.length == 0) && selectionEnd < 52) {
                            ax0Var.f33653s = true;
                            ax0Var.c();
                            ax0Var.W = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = ax0Var.K;
                                if (str2 != null && ax0Var.J == 1 && str2.equals(substring2) && !ax0Var.f33656y && (arrayList = ax0Var.f33655x) != null && !arrayList.isEmpty()) {
                                    ax0Var.f33654w = false;
                                    ax0Var.c();
                                    ax0Var.d.setVisibility(0);
                                    ax0Var.f33640a0 = org.telegram.messenger.g0.L(10.0f);
                                    ax0Var.d.invalidate();
                                } else {
                                    int i15 = ax0Var.L + 1;
                                    ax0Var.L = i15;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (ax0Var.M != null && Math.abs(currentTimeMillis - ax0Var.O) <= 360) {
                                        ax0Var.O = currentTimeMillis;
                                        G0 = ax0Var.M;
                                    } else {
                                        ax0Var.O = currentTimeMillis;
                                        G0 = org.telegram.messenger.g0.G0();
                                    }
                                    String[] strArr = G0;
                                    String[] strArr2 = ax0Var.M;
                                    if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                        org.telegram.messenger.ri.d0(i13).O(strArr, false);
                                    }
                                    ax0Var.M = strArr;
                                    Runnable runnable2 = ax0Var.N;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.g0.r(runnable2);
                                        ax0Var.N = null;
                                    }
                                    ax0Var.N = new mp0(ax0Var, strArr, substring2, i15, 3);
                                    ArrayList arrayList6 = ax0Var.f33655x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        ax0Var.N.run();
                                    } else {
                                        org.telegram.messenger.g0.h3(ax0Var.N, 600L);
                                    }
                                }
                            }
                            bi.e3 e3Var5 = ax0Var.d;
                            if (e3Var5 != null) {
                                e3Var5.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = ax0Var.N;
                    if (runnable3 != null) {
                        org.telegram.messenger.g0.r(runnable3);
                        ax0Var.N = null;
                    }
                    ax0Var.f33653s = false;
                    bi.e3 e3Var6 = ax0Var.d;
                    if (e3Var6 != null) {
                        e3Var6.invalidate();
                        return;
                    }
                    return;
                }
                ax0Var.f33653s = false;
                ax0Var.f33654w = true;
                bi.e3 e3Var7 = ax0Var.d;
                if (e3Var7 != null) {
                    e3Var7.invalidate();
                    return;
                }
                return;
            case 13:
                gx0 gx0Var = (gx0) obj;
                gx0Var.L = null;
                gx0Var.b();
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
                ((ez0) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((lz0) obj).f37325a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) arrayList7.get(i16)).l3(false, false);
                        ((org.telegram.ui.Cells.r1) arrayList7.get(i16)).n3(false, false, false);
                    }
                }
                return;
            case 17:
                l01 l01Var = (l01) obj;
                l01Var.K = null;
                l01Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(nr.f37956f).start();
                return;
            case 18:
                p01 p01Var = (p01) obj;
                ViewPropertyAnimator duration = p01Var.animate().alpha(0.0f).setListener(new s60(p01Var, 29)).setDuration(300L);
                p01Var.f38440b = duration;
                duration.start();
                return;
            case 19:
                r01 r01Var = (r01) obj;
                org.telegram.messenger.x10 x10Var = r01Var.f39037b;
                if (x10Var != null) {
                    x10Var.a(Long.valueOf(r01Var.f39036a.f39445t));
                    return;
                }
                return;
            case 20:
                b21 b21Var = (b21) ((org.telegram.ui.on) obj).f50626c;
                if (b21Var.l()) {
                    b21Var.m();
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
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                return;
            case 24:
                ((l31) obj).f37087c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.ck) obj).f39479c.presentFragment(new org.telegram.ui.sy0());
                return;
            case 26:
                ((v31) obj).requestLayout();
                return;
            case 27:
                ((m41) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f33204j0;
                undoView.getClass();
                try {
                    undoView.f33214f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((k51) obj).invalidateSelf();
                return;
        }
    }

    public cp0(Object obj, int i7) {
        this.f34274a = i7;
        this.f34275b = obj;
    }
}
