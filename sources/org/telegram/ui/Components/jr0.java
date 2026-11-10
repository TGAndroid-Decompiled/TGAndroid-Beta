package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class jr0 implements Runnable {
    public final int f35055a;
    public final Object f35056b;

    public jr0(fi.d2 d2Var, int i7) {
        this.f35055a = 6;
        this.f35056b = d2Var;
    }

    @Override
    public final void run() {
        int i7;
        org.telegram.messenger.f6[] f6VarArr;
        q5[] q5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        v4.b0 b0Var;
        int i10 = this.f35055a;
        Object obj = this.f35056b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = ((kr0) obj).f35421f.f40719x1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 1:
                ((jr0) obj).run();
                return;
            case 2:
                js0 js0Var = (js0) obj;
                ArrayList arrayList3 = js0Var.f35063f;
                if (js0Var.h) {
                    js0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.uv) arrayList3.get(i11)).f25901b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.uv) arrayList3.get(i11)).f25900a));
                        }
                    }
                    org.telegram.messenger.vv G1 = js0Var.f35069y.f40719x1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.vv.d(G1.f26222j);
                    int i12 = G1.f26215a;
                    if (org.telegram.messenger.p10.i(i12).q()) {
                        i7 = org.telegram.messenger.qp.s1(i12).f24854n6;
                    } else {
                        i7 = org.telegram.messenger.qp.s1(i12).f24845m6;
                    }
                    if (arrayList4.size() <= i7 && !org.telegram.messenger.vv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((ks0) obj).F();
                return;
            case 4:
                ((st0) obj).V();
                return;
            case 5:
                ((bu0) obj).getClass();
                return;
            case 6:
                ((zu0) obj).l0(0);
                return;
            case 7:
                uu0 uu0Var = (uu0) obj;
                if (!uu0Var.f38749x) {
                    uu0Var.D = 0.0f;
                    return;
                }
                return;
            case 8:
                ((fw0) obj).b();
                return;
            case 9:
                ow0 ow0Var = (ow0) obj;
                int i13 = ow0Var.f36701a;
                ow0Var.H = null;
                mw0 mw0Var = ow0Var.f36705c;
                if (mw0Var != null && mw0Var.getEditField() != null && ow0Var.f36705c.getFieldText() != null) {
                    int selectionStart = ow0Var.f36705c.getEditField().getSelectionStart();
                    int selectionEnd = ow0Var.f36705c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ow0Var.f36714s = false;
                        bi.e5 e5Var = ow0Var.d;
                        if (e5Var != null) {
                            e5Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = ow0Var.f36705c.getFieldText();
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
                                ow0Var.f36714s = true;
                                ow0Var.c();
                                ow0Var.V = f6Var;
                                ow0Var.f36704b0 = null;
                                ow0Var.f36702a0 = null;
                                if (substring != null) {
                                    String str = ow0Var.J;
                                    if (str != null && ow0Var.I == 2 && str.equals(substring) && !ow0Var.f36717y && (arrayList2 = ow0Var.f36716x) != null && !arrayList2.isEmpty()) {
                                        ow0Var.f36715w = false;
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
                                        ArrayList arrayList5 = ow0Var.f36716x;
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
                            q5VarArr = (q5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, q5.class);
                        } else {
                            q5VarArr = null;
                        }
                        if ((q5VarArr == null || q5VarArr.length == 0) && selectionEnd < 52) {
                            ow0Var.f36714s = true;
                            ow0Var.c();
                            ow0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = ow0Var.J;
                                if (str2 != null && ow0Var.I == 1 && str2.equals(substring2) && !ow0Var.f36717y && (arrayList = ow0Var.f36716x) != null && !arrayList.isEmpty()) {
                                    ow0Var.f36715w = false;
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
                                    String[] strArr = G0;
                                    String[] strArr2 = ow0Var.L;
                                    if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                        org.telegram.messenger.ui.b0(i13).M(strArr, false);
                                    }
                                    ow0Var.L = strArr;
                                    Runnable runnable2 = ow0Var.M;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.g0.r(runnable2);
                                        ow0Var.M = null;
                                    }
                                    ow0Var.M = new pp0(ow0Var, strArr, substring2, i15, 2);
                                    ArrayList arrayList6 = ow0Var.f36716x;
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
                    ow0Var.f36714s = false;
                    bi.e5 e5Var5 = ow0Var.d;
                    if (e5Var5 != null) {
                        e5Var5.invalidate();
                        return;
                    }
                    return;
                }
                ow0Var.f36714s = false;
                ow0Var.f36715w = true;
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
                ((ty0) obj).a();
                return;
            case 13:
                ArrayList arrayList7 = ((az0) obj).f32038a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).j3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).l3(false, false, false);
                    }
                }
                return;
            case 14:
                zz0 zz0Var = (zz0) obj;
                zz0Var.J = null;
                zz0Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(wq.f40046f).start();
                return;
            case 15:
                d01 d01Var = (d01) obj;
                ViewPropertyAnimator duration = d01Var.animate().alpha(0.0f).setListener(new e60(d01Var, 29)).setDuration(300L);
                d01Var.f32845b = duration;
                duration.start();
                return;
            case 16:
                f01 f01Var = (f01) obj;
                org.telegram.messenger.c20 c20Var = f01Var.f33433b;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(f01Var.f33432a.f33725t));
                    return;
                }
                return;
            case 17:
                s01 s01Var = (s01) obj;
                long j3 = s01Var.f37793b;
                if (!s01Var.d && s01Var.f37813y > 0.0f && (b0Var = (v4.b0) s01Var.f37809r.getLayoutManager()) != null && b0Var.N0() >= s01Var.f37810s.f36185c.size() - 3) {
                    org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(s01Var.f37791a).f24881q7;
                    long j10 = -j3;
                    if (!k00Var.e(j10)) {
                        k00Var.o(j10);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                m11 m11Var = (m11) ((s9) obj).f37904c;
                if (m11Var.l()) {
                    m11Var.m();
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
                ((u21) obj).f38498c.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.dk) obj).f31683c.presentFragment(new org.telegram.ui.uy0());
                return;
            case 24:
                ((d31) obj).requestLayout();
                return;
            case 25:
                ((v31) obj).f();
                return;
            case 26:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f31609i0;
                undoView.getClass();
                try {
                    undoView.f31619f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                ((t41) obj).invalidateSelf();
                return;
            case 28:
                ry ryVar = ((i51) obj).f34534b;
                if (ryVar != null) {
                    ryVar.c(false, true, false);
                    return;
                }
                return;
            default:
                t51 t51Var = (t51) obj;
                l2.i0 i0Var = t51Var.d;
                if (i0Var != null) {
                    TextureView textureView = t51Var.f38208n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    t51Var.d.z1(t51Var.f38208n);
                    ArrayList arrayList8 = t51Var.N;
                    if (arrayList8 != null) {
                        t51Var.k0(arrayList8, t51Var.O);
                    } else if (t51Var.U) {
                        t51Var.l0(t51Var.Q, t51Var.S, t51Var.R, t51Var.T);
                    } else {
                        t51Var.j0(t51Var.Q, t51Var.S);
                    }
                    t51Var.h0();
                    return;
                }
                return;
        }
    }

    public jr0(Object obj, int i7) {
        this.f35055a = i7;
        this.f35056b = obj;
    }
}
