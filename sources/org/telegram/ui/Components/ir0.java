package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class ir0 implements Runnable {
    public final int f34763a;
    public final Object f34764b;

    public ir0(fi.d2 d2Var, int i7) {
        this.f34763a = 6;
        this.f34764b = d2Var;
    }

    @Override
    public final void run() {
        int i7;
        org.telegram.messenger.f6[] f6VarArr;
        r5[] r5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f34763a;
        Object obj = this.f34764b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = ((jr0) obj).f35062f.f40405x1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 1:
                ((ir0) obj).run();
                return;
            case 2:
                is0 is0Var = (is0) obj;
                ArrayList arrayList3 = is0Var.f34778f;
                if (is0Var.h) {
                    is0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.uv) arrayList3.get(i11)).f25887b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.uv) arrayList3.get(i11)).f25886a));
                        }
                    }
                    org.telegram.messenger.vv G1 = is0Var.f34784y.f40405x1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.vv.d(G1.f26204j);
                    int i12 = G1.f26197a;
                    if (org.telegram.messenger.p10.i(i12).q()) {
                        i7 = org.telegram.messenger.qp.s1(i12).f24835n6;
                    } else {
                        i7 = org.telegram.messenger.qp.s1(i12).f24826m6;
                    }
                    if (arrayList4.size() <= i7 && !org.telegram.messenger.vv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((js0) obj).F();
                return;
            case 4:
                ((rt0) obj).V();
                return;
            case 5:
                ((au0) obj).getClass();
                return;
            case 6:
                ((yu0) obj).l0(0);
                return;
            case 7:
                tu0 tu0Var = (tu0) obj;
                if (!tu0Var.f38417x) {
                    tu0Var.D = 0.0f;
                    return;
                }
                return;
            case 8:
                ((fw0) obj).b();
                return;
            case 9:
                ow0 ow0Var = (ow0) obj;
                int i13 = ow0Var.f36789a;
                ow0Var.H = null;
                mw0 mw0Var = ow0Var.f36793c;
                if (mw0Var != null && mw0Var.getEditField() != null && ow0Var.f36793c.getFieldText() != null) {
                    int selectionStart = ow0Var.f36793c.getEditField().getSelectionStart();
                    int selectionEnd = ow0Var.f36793c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ow0Var.f36802s = false;
                        bi.e5 e5Var = ow0Var.d;
                        if (e5Var != null) {
                            e5Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = ow0Var.f36793c.getFieldText();
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
                                ow0Var.f36802s = true;
                                ow0Var.c();
                                ow0Var.V = f6Var;
                                ow0Var.f36792b0 = null;
                                ow0Var.f36790a0 = null;
                                if (substring != null) {
                                    String str = ow0Var.J;
                                    if (str != null && ow0Var.I == 2 && str.equals(substring) && !ow0Var.f36805y && (arrayList2 = ow0Var.f36804x) != null && !arrayList2.isEmpty()) {
                                        ow0Var.f36803w = false;
                                        ow0Var.c();
                                        bi.e5 e5Var2 = ow0Var.d;
                                        if (e5Var2 != null) {
                                            e5Var2.setVisibility(0);
                                            ow0Var.d.invalidate();
                                        }
                                    } else {
                                        int i14 = ow0Var.K + 1;
                                        ow0Var.K = i14;
                                        Runnable runnable = ow0Var.M;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        ow0Var.M = new org.telegram.ui.q8((Object) ow0Var, substring, i14, 24);
                                        ArrayList arrayList5 = ow0Var.f36804x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            ow0Var.M.run();
                                        } else {
                                            org.telegram.messenger.g0.i3(ow0Var.M, 600L);
                                        }
                                    }
                                }
                                bi.e5 e5Var3 = ow0Var.d;
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
                            ow0Var.f36802s = true;
                            ow0Var.c();
                            ow0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = ow0Var.J;
                                if (str2 != null && ow0Var.I == 1 && str2.equals(substring2) && !ow0Var.f36805y && (arrayList = ow0Var.f36804x) != null && !arrayList.isEmpty()) {
                                    ow0Var.f36803w = false;
                                    ow0Var.c();
                                    ow0Var.d.setVisibility(0);
                                    ow0Var.W = org.telegram.messenger.g0.L(10.0f);
                                    ow0Var.d.invalidate();
                                } else {
                                    int i15 = ow0Var.K + 1;
                                    ow0Var.K = i15;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (ow0Var.L != null && Math.abs(currentTimeMillis - ow0Var.N) <= 360) {
                                        ow0Var.N = currentTimeMillis;
                                        G0 = ow0Var.L;
                                    } else {
                                        ow0Var.N = currentTimeMillis;
                                        G0 = org.telegram.messenger.g0.G0();
                                    }
                                    String[] strArr = ow0Var.L;
                                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                                        org.telegram.messenger.ui.b0(i13).M(G0, false);
                                    }
                                    ow0Var.L = G0;
                                    Runnable runnable2 = ow0Var.M;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.g0.r(runnable2);
                                        ow0Var.M = null;
                                    }
                                    ow0Var.M = new pp0(ow0Var, G0, substring2, i15, 2);
                                    ArrayList arrayList6 = ow0Var.f36804x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        ow0Var.M.run();
                                    } else {
                                        org.telegram.messenger.g0.i3(ow0Var.M, 600L);
                                    }
                                }
                            }
                            bi.e5 e5Var4 = ow0Var.d;
                            if (e5Var4 != null) {
                                e5Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = ow0Var.M;
                    if (runnable3 != null) {
                        org.telegram.messenger.g0.r(runnable3);
                        ow0Var.M = null;
                    }
                    ow0Var.f36802s = false;
                    bi.e5 e5Var5 = ow0Var.d;
                    if (e5Var5 != null) {
                        e5Var5.invalidate();
                        return;
                    }
                    return;
                }
                ow0Var.f36802s = false;
                ow0Var.f36803w = true;
                bi.e5 e5Var6 = ow0Var.d;
                if (e5Var6 != null) {
                    e5Var6.invalidate();
                    return;
                }
                return;
            case 10:
                uw0 uw0Var = (uw0) obj;
                uw0Var.K = null;
                uw0Var.b();
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
                ((sy0) obj).a();
                return;
            case 13:
                ArrayList arrayList7 = ((zy0) obj).f41112a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).i3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).k3(false, false, false);
                    }
                }
                return;
            case 14:
                yz0 yz0Var = (yz0) obj;
                yz0Var.J = null;
                yz0Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f40310f).start();
                return;
            case 15:
                c01 c01Var = (c01) obj;
                ViewPropertyAnimator duration = c01Var.animate().alpha(0.0f).setListener(new e60(c01Var, 29)).setDuration(300L);
                c01Var.f32353b = duration;
                duration.start();
                return;
            case 16:
                e01 e01Var = (e01) obj;
                org.telegram.messenger.c20 c20Var = e01Var.f33077b;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(e01Var.f33076a.f33440t));
                    return;
                }
                return;
            case 17:
                g11 g11Var = (g11) ((t9) obj).f38300c;
                if (g11Var.l()) {
                    g11Var.m();
                    return;
                }
                return;
            case 18:
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                org.telegram.messenger.qs.f(ijVar.I1).k(115, ijVar);
                return;
            case 19:
                ((org.telegram.messenger.v10) obj).a(null, Boolean.FALSE);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                return;
            case 21:
                ((o21) obj).f36578c.setVisibility(8);
                return;
            case 22:
                ((org.telegram.ui.bk) obj).f38506c.presentFragment(new org.telegram.ui.qy0());
                return;
            case 23:
                ((x21) obj).requestLayout();
                return;
            case 24:
                ((p31) obj).f();
                return;
            case 25:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f31591i0;
                undoView.getClass();
                try {
                    undoView.f31601f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                ((m41) obj).invalidateSelf();
                return;
            case 27:
                ry ryVar = ((c51) obj).f32421b;
                if (ryVar != null) {
                    ryVar.c(false, true, false);
                    return;
                }
                return;
            case 28:
                n51 n51Var = (n51) obj;
                l2.i0 i0Var = n51Var.d;
                if (i0Var != null) {
                    TextureView textureView = n51Var.f36303n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    n51Var.d.z1(n51Var.f36303n);
                    ArrayList arrayList8 = n51Var.N;
                    if (arrayList8 != null) {
                        n51Var.k0(arrayList8, n51Var.O);
                    } else if (n51Var.U) {
                        n51Var.l0(n51Var.Q, n51Var.S, n51Var.R, n51Var.T);
                    } else {
                        n51Var.j0(n51Var.Q, n51Var.S);
                    }
                    n51Var.h0();
                    return;
                }
                return;
            default:
                n51 n51Var2 = (n51) ((li.b6) obj).f18482f;
                n51Var2.f36290a0.removeCallbacksAndMessages(null);
                n51Var2.K.F(false, null);
                return;
        }
    }

    public ir0(Object obj, int i7) {
        this.f34763a = i7;
        this.f34764b = obj;
    }
}
