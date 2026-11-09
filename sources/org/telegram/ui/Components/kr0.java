package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class kr0 implements Runnable {
    public final int f35464a;
    public final Object f35465b;

    public kr0(fi.d2 d2Var, int i7) {
        this.f35464a = 6;
        this.f35465b = d2Var;
    }

    @Override
    public final void run() {
        int i7;
        org.telegram.messenger.f6[] f6VarArr;
        r5[] r5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        v4.b0 b0Var;
        int i10 = this.f35464a;
        Object obj = this.f35465b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = ((lr0) obj).f35829f.f41127x1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 1:
                ((kr0) obj).run();
                return;
            case 2:
                ks0 ks0Var = (ks0) obj;
                ArrayList arrayList3 = ks0Var.f35472f;
                if (ks0Var.h) {
                    ks0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.uv) arrayList3.get(i11)).f25897b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.uv) arrayList3.get(i11)).f25896a));
                        }
                    }
                    org.telegram.messenger.vv G1 = ks0Var.f35478y.f41127x1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.vv.d(G1.f26218j);
                    int i12 = G1.f26211a;
                    if (org.telegram.messenger.p10.i(i12).q()) {
                        i7 = org.telegram.messenger.qp.s1(i12).f24850n6;
                    } else {
                        i7 = org.telegram.messenger.qp.s1(i12).f24841m6;
                    }
                    if (arrayList4.size() <= i7 && !org.telegram.messenger.vv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((ls0) obj).F();
                return;
            case 4:
                ((tt0) obj).V();
                return;
            case 5:
                ((cu0) obj).getClass();
                return;
            case 6:
                ((av0) obj).l0(0);
                return;
            case 7:
                vu0 vu0Var = (vu0) obj;
                if (!vu0Var.f39808x) {
                    vu0Var.D = 0.0f;
                    return;
                }
                return;
            case 8:
                ((gw0) obj).b();
                return;
            case 9:
                pw0 pw0Var = (pw0) obj;
                int i13 = pw0Var.f37102a;
                pw0Var.H = null;
                nw0 nw0Var = pw0Var.f37106c;
                if (nw0Var != null && nw0Var.getEditField() != null && pw0Var.f37106c.getFieldText() != null) {
                    int selectionStart = pw0Var.f37106c.getEditField().getSelectionStart();
                    int selectionEnd = pw0Var.f37106c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        pw0Var.f37115s = false;
                        bi.e5 e5Var = pw0Var.d;
                        if (e5Var != null) {
                            e5Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = pw0Var.f37106c.getFieldText();
                    boolean z9 = fieldText instanceof Spanned;
                    if (z9) {
                        f6VarArr = (org.telegram.messenger.f6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.f6.class);
                    } else {
                        f6VarArr = null;
                    }
                    if (f6VarArr != null && f6VarArr.length > 0 && org.telegram.messenger.iz.F && org.telegram.messenger.p10.i(i13).q()) {
                        org.telegram.messenger.f6 f6Var = f6VarArr[f6VarArr.length - 1];
                        if (f6Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(f6Var);
                            int spanEnd = spanned.getSpanEnd(f6Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                pw0Var.f37115s = true;
                                pw0Var.c();
                                pw0Var.V = f6Var;
                                pw0Var.f37105b0 = null;
                                pw0Var.f37103a0 = null;
                                if (substring != null) {
                                    String str = pw0Var.J;
                                    if (str != null && pw0Var.I == 2 && str.equals(substring) && !pw0Var.f37118y && (arrayList2 = pw0Var.f37117x) != null && !arrayList2.isEmpty()) {
                                        pw0Var.f37116w = false;
                                        pw0Var.c();
                                        bi.e5 e5Var2 = pw0Var.d;
                                        if (e5Var2 != null) {
                                            e5Var2.setVisibility(0);
                                            pw0Var.d.invalidate();
                                        }
                                    } else {
                                        int i14 = pw0Var.K + 1;
                                        pw0Var.K = i14;
                                        Runnable runnable = pw0Var.M;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        pw0Var.M = new org.telegram.ui.q8((Object) pw0Var, substring, i14, 24);
                                        ArrayList arrayList5 = pw0Var.f37117x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            pw0Var.M.run();
                                        } else {
                                            org.telegram.messenger.g0.i3(pw0Var.M, 600L);
                                        }
                                    }
                                }
                                bi.e5 e5Var3 = pw0Var.d;
                                if (e5Var3 != null) {
                                    e5Var3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z9) {
                            r5VarArr = (r5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, r5.class);
                        } else {
                            r5VarArr = null;
                        }
                        if ((r5VarArr == null || r5VarArr.length == 0) && selectionEnd < 52) {
                            pw0Var.f37115s = true;
                            pw0Var.c();
                            pw0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = pw0Var.J;
                                if (str2 != null && pw0Var.I == 1 && str2.equals(substring2) && !pw0Var.f37118y && (arrayList = pw0Var.f37117x) != null && !arrayList.isEmpty()) {
                                    pw0Var.f37116w = false;
                                    pw0Var.c();
                                    pw0Var.d.setVisibility(0);
                                    pw0Var.W = org.telegram.messenger.g0.L(10.0f);
                                    pw0Var.d.invalidate();
                                } else {
                                    int i15 = pw0Var.K + 1;
                                    pw0Var.K = i15;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (pw0Var.L != null && Math.abs(currentTimeMillis - pw0Var.N) <= 360) {
                                        pw0Var.N = currentTimeMillis;
                                        G0 = pw0Var.L;
                                    } else {
                                        pw0Var.N = currentTimeMillis;
                                        G0 = org.telegram.messenger.g0.G0();
                                    }
                                    String[] strArr = G0;
                                    String[] strArr2 = pw0Var.L;
                                    if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                        org.telegram.messenger.ui.b0(i13).M(strArr, false);
                                    }
                                    pw0Var.L = strArr;
                                    Runnable runnable2 = pw0Var.M;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.g0.r(runnable2);
                                        pw0Var.M = null;
                                    }
                                    pw0Var.M = new qp0(pw0Var, strArr, substring2, i15, 2);
                                    ArrayList arrayList6 = pw0Var.f37117x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        pw0Var.M.run();
                                    } else {
                                        org.telegram.messenger.g0.i3(pw0Var.M, 600L);
                                    }
                                }
                            }
                            bi.e5 e5Var4 = pw0Var.d;
                            if (e5Var4 != null) {
                                e5Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = pw0Var.M;
                    if (runnable3 != null) {
                        org.telegram.messenger.g0.r(runnable3);
                        pw0Var.M = null;
                    }
                    pw0Var.f37115s = false;
                    bi.e5 e5Var5 = pw0Var.d;
                    if (e5Var5 != null) {
                        e5Var5.invalidate();
                        return;
                    }
                    return;
                }
                pw0Var.f37115s = false;
                pw0Var.f37116w = true;
                bi.e5 e5Var6 = pw0Var.d;
                if (e5Var6 != null) {
                    e5Var6.invalidate();
                    return;
                }
                return;
            case 10:
                vw0 vw0Var = (vw0) obj;
                vw0Var.K = null;
                vw0Var.b();
                return;
            case 11:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    e12.edit().putInt("showchattagsinfo", e12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 12:
                ((uy0) obj).a();
                return;
            case 13:
                ArrayList arrayList7 = ((bz0) obj).f32446a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).j3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).l3(false, false, false);
                    }
                }
                return;
            case 14:
                a01 a01Var = (a01) obj;
                a01Var.J = null;
                a01Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f40458f).start();
                return;
            case 15:
                e01 e01Var = (e01) obj;
                ViewPropertyAnimator duration = e01Var.animate().alpha(0.0f).setListener(new f60(e01Var, 29)).setDuration(300L);
                e01Var.f33249b = duration;
                duration.start();
                return;
            case 16:
                g01 g01Var = (g01) obj;
                org.telegram.messenger.c20 c20Var = g01Var.f33835b;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(g01Var.f33834a.f34131t));
                    return;
                }
                return;
            case 17:
                t01 t01Var = (t01) obj;
                long j3 = t01Var.f38209b;
                if (!t01Var.d && t01Var.f38229y > 0.0f && (b0Var = (v4.b0) t01Var.f38225r.getLayoutManager()) != null && b0Var.N0() >= t01Var.f38226s.f36593c.size() - 3) {
                    org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(t01Var.f38207a).f24877q7;
                    long j10 = -j3;
                    if (!k00Var.e(j10)) {
                        k00Var.o(j10);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                n11 n11Var = (n11) ((t9) obj).f38330c;
                if (n11Var.l()) {
                    n11Var.m();
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                org.telegram.messenger.qs.f(ijVar.I1).k(115, ijVar);
                return;
            case 20:
                ((org.telegram.messenger.v10) obj).a(null, Boolean.FALSE);
                return;
            case 21:
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                return;
            case 22:
                ((v21) obj).f38904c.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.dk) obj).f32078c.presentFragment(new org.telegram.ui.ty0());
                return;
            case 24:
                ((e31) obj).requestLayout();
                return;
            case 25:
                ((w31) obj).f();
                return;
            case 26:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f31601i0;
                undoView.getClass();
                try {
                    undoView.f31611f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                ((t41) obj).invalidateSelf();
                return;
            case 28:
                sy syVar = ((i51) obj).f34577b;
                if (syVar != null) {
                    syVar.c(false, true, false);
                    return;
                }
                return;
            default:
                u51 u51Var = (u51) obj;
                l2.i0 i0Var = u51Var.d;
                if (i0Var != null) {
                    TextureView textureView = u51Var.f38617n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    u51Var.d.z1(u51Var.f38617n);
                    ArrayList arrayList8 = u51Var.N;
                    if (arrayList8 != null) {
                        u51Var.k0(arrayList8, u51Var.O);
                    } else if (u51Var.U) {
                        u51Var.l0(u51Var.Q, u51Var.S, u51Var.R, u51Var.T);
                    } else {
                        u51Var.j0(u51Var.Q, u51Var.S);
                    }
                    u51Var.h0();
                    return;
                }
                return;
        }
    }

    public kr0(Object obj, int i7) {
        this.f35464a = i7;
        this.f35465b = obj;
    }
}
