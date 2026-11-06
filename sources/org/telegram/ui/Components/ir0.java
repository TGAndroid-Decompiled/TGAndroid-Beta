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
    public final int f34756a;
    public final Object f34757b;

    public ir0(fi.d2 d2Var, int i7) {
        this.f34756a = 6;
        this.f34757b = d2Var;
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
        int i10 = this.f34756a;
        Object obj = this.f34757b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = ((jr0) obj).f35049f.f40440x1;
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
                ArrayList arrayList3 = is0Var.f34771f;
                if (is0Var.h) {
                    is0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.uv) arrayList3.get(i11)).f25895b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.uv) arrayList3.get(i11)).f25894a));
                        }
                    }
                    org.telegram.messenger.vv G1 = is0Var.f34777y.f40440x1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.vv.d(G1.f26212j);
                    int i12 = G1.f26205a;
                    if (org.telegram.messenger.p10.i(i12).q()) {
                        i7 = org.telegram.messenger.qp.s1(i12).f24843n6;
                    } else {
                        i7 = org.telegram.messenger.qp.s1(i12).f24834m6;
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
                if (!tu0Var.f38397x) {
                    tu0Var.D = 0.0f;
                    return;
                }
                return;
            case 8:
                ((fw0) obj).b();
                return;
            case 9:
                ow0 ow0Var = (ow0) obj;
                int i13 = ow0Var.f36685a;
                ow0Var.H = null;
                mw0 mw0Var = ow0Var.f36689c;
                if (mw0Var != null && mw0Var.getEditField() != null && ow0Var.f36689c.getFieldText() != null) {
                    int selectionStart = ow0Var.f36689c.getEditField().getSelectionStart();
                    int selectionEnd = ow0Var.f36689c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ow0Var.f36698s = false;
                        bi.e5 e5Var = ow0Var.d;
                        if (e5Var != null) {
                            e5Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = ow0Var.f36689c.getFieldText();
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
                                ow0Var.f36698s = true;
                                ow0Var.c();
                                ow0Var.V = f6Var;
                                ow0Var.f36688b0 = null;
                                ow0Var.f36686a0 = null;
                                if (substring != null) {
                                    String str = ow0Var.J;
                                    if (str != null && ow0Var.I == 2 && str.equals(substring) && !ow0Var.f36701y && (arrayList2 = ow0Var.f36700x) != null && !arrayList2.isEmpty()) {
                                        ow0Var.f36699w = false;
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
                                        ArrayList arrayList5 = ow0Var.f36700x;
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
                            ow0Var.f36698s = true;
                            ow0Var.c();
                            ow0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = ow0Var.J;
                                if (str2 != null && ow0Var.I == 1 && str2.equals(substring2) && !ow0Var.f36701y && (arrayList = ow0Var.f36700x) != null && !arrayList.isEmpty()) {
                                    ow0Var.f36699w = false;
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
                                    ArrayList arrayList6 = ow0Var.f36700x;
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
                    ow0Var.f36698s = false;
                    bi.e5 e5Var5 = ow0Var.d;
                    if (e5Var5 != null) {
                        e5Var5.invalidate();
                        return;
                    }
                    return;
                }
                ow0Var.f36698s = false;
                ow0Var.f36699w = true;
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
                ArrayList arrayList7 = ((az0) obj).f31950a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).i3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).k3(false, false, false);
                    }
                }
                return;
            case 14:
                zz0 zz0Var = (zz0) obj;
                zz0Var.J = null;
                zz0Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f40345f).start();
                return;
            case 15:
                d01 d01Var = (d01) obj;
                ViewPropertyAnimator duration = d01Var.animate().alpha(0.0f).setListener(new e60(d01Var, 29)).setDuration(300L);
                d01Var.f32746b = duration;
                duration.start();
                return;
            case 16:
                f01 f01Var = (f01) obj;
                org.telegram.messenger.c20 c20Var = f01Var.f33429b;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(f01Var.f33428a.f33746t));
                    return;
                }
                return;
            case 17:
                s01 s01Var = (s01) obj;
                long j3 = s01Var.f37815b;
                if (!s01Var.d && s01Var.f37835y > 0.0f && (b0Var = (v4.b0) s01Var.f37831r.getLayoutManager()) != null && b0Var.N0() >= s01Var.f37832s.f36161c.size() - 3) {
                    org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(s01Var.f37813a).f24870q7;
                    long j10 = -j3;
                    if (!k00Var.e(j10)) {
                        k00Var.o(j10);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                m11 m11Var = (m11) ((t9) obj).f38280c;
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
                ((u21) obj).f38488c.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.bk) obj).f31671c.presentFragment(new org.telegram.ui.qy0());
                return;
            case 24:
                ((d31) obj).requestLayout();
                return;
            case 25:
                ((v31) obj).f();
                return;
            case 26:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f31592i0;
                undoView.getClass();
                try {
                    undoView.f31602f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                ((s41) obj).invalidateSelf();
                return;
            case 28:
                ry ryVar = ((h51) obj).f34179b;
                if (ryVar != null) {
                    ryVar.c(false, true, false);
                    return;
                }
                return;
            default:
                t51 t51Var = (t51) obj;
                l2.i0 i0Var = t51Var.d;
                if (i0Var != null) {
                    TextureView textureView = t51Var.f38235n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    t51Var.d.z1(t51Var.f38235n);
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

    public ir0(Object obj, int i7) {
        this.f34756a = i7;
        this.f34757b = obj;
    }
}
