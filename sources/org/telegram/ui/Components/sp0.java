package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;
public final class sp0 implements Runnable {
    public final int f38105a;
    public final Object f38106b;

    public sp0(gi.c2 c2Var, int i3) {
        this.f38105a = 8;
        this.f38106b = c2Var;
    }

    @Override
    public final void run() {
        int i3;
        org.telegram.messenger.f6[] f6VarArr;
        p5[] p5VarArr;
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f38105a;
        Object obj = this.f38106b;
        switch (i10) {
            case 0:
                ws0 ws0Var = ((tp0) obj).H;
                if (ws0Var.F1) {
                    ws0Var.o1(false);
                    return;
                }
                return;
            case 1:
                ((cr0) obj).f32825a.z1(false);
                return;
            case 2:
                org.telegram.ui.ActionBar.d2 d2Var = ((ir0) obj).f34804f.f40142y1;
                if (d2Var != null) {
                    d2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 3:
                ((sp0) obj).run();
                return;
            case 4:
                hs0 hs0Var = (hs0) obj;
                ArrayList arrayList3 = hs0Var.f34493f;
                if (hs0Var.h) {
                    hs0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((org.telegram.messenger.mv) arrayList3.get(i11)).f24265b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.mv) arrayList3.get(i11)).f24264a));
                        }
                    }
                    org.telegram.messenger.nv G1 = hs0Var.f34499y.f40142y1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.nv.d(G1.f24441j);
                    int i12 = G1.f24434a;
                    if (org.telegram.messenger.h10.i(i12).q()) {
                        i3 = org.telegram.messenger.hp.s1(i12).f23074n6;
                    } else {
                        i3 = org.telegram.messenger.hp.s1(i12).f23065m6;
                    }
                    if (arrayList4.size() <= i3 && !org.telegram.messenger.nv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((is0) obj).F();
                return;
            case 6:
                ((qt0) obj).V();
                return;
            case 7:
                ((zt0) obj).getClass();
                return;
            case 8:
                ((xu0) obj).l0(0);
                return;
            case 9:
                su0 su0Var = (su0) obj;
                if (!su0Var.f38122x) {
                    su0Var.E = 0.0f;
                    return;
                }
                return;
            case 10:
                ((ew0) obj).b();
                return;
            case 11:
                ow0 ow0Var = (ow0) obj;
                int i13 = ow0Var.f36958a;
                ow0Var.I = null;
                mw0 mw0Var = ow0Var.f36962c;
                if (mw0Var != null && mw0Var.getEditField() != null && ow0Var.f36962c.getFieldText() != null) {
                    int selectionStart = ow0Var.f36962c.getEditField().getSelectionStart();
                    int selectionEnd = ow0Var.f36962c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ow0Var.f36972s = false;
                        kw0 kw0Var = ow0Var.d;
                        if (kw0Var != null) {
                            kw0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = ow0Var.f36962c.getFieldText();
                    boolean z10 = fieldText instanceof Spanned;
                    if (z10) {
                        f6VarArr = (org.telegram.messenger.f6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.f6.class);
                    } else {
                        f6VarArr = null;
                    }
                    if (f6VarArr != null && f6VarArr.length > 0 && org.telegram.messenger.az.F && org.telegram.messenger.h10.i(i13).q()) {
                        org.telegram.messenger.f6 f6Var = f6VarArr[f6VarArr.length - 1];
                        if (f6Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(f6Var);
                            int spanEnd = spanned.getSpanEnd(f6Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                ow0Var.f36972s = true;
                                ow0Var.c();
                                ow0Var.W = f6Var;
                                ow0Var.f36963c0 = null;
                                ow0Var.f36961b0 = null;
                                if (substring != null) {
                                    String str = ow0Var.K;
                                    if (str != null && ow0Var.J == 2 && str.equals(substring) && !ow0Var.f36975y && (arrayList2 = ow0Var.f36974x) != null && !arrayList2.isEmpty()) {
                                        ow0Var.f36973w = false;
                                        ow0Var.c();
                                        kw0 kw0Var2 = ow0Var.d;
                                        if (kw0Var2 != null) {
                                            kw0Var2.setVisibility(0);
                                            ow0Var.d.invalidate();
                                        }
                                    } else {
                                        int i14 = ow0Var.L + 1;
                                        ow0Var.L = i14;
                                        Runnable runnable = ow0Var.N;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        ow0Var.N = new org.telegram.ui.f4(ow0Var, substring, i14, 25);
                                        ArrayList arrayList5 = ow0Var.f36974x;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            ow0Var.N.run();
                                        } else {
                                            org.telegram.messenger.g0.i3(ow0Var.N, 600L);
                                        }
                                    }
                                }
                                kw0 kw0Var3 = ow0Var.d;
                                if (kw0Var3 != null) {
                                    kw0Var3.invalidate();
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
                            ow0Var.f36972s = true;
                            ow0Var.c();
                            ow0Var.W = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = ow0Var.K;
                                if (str2 != null && ow0Var.J == 1 && str2.equals(substring2) && !ow0Var.f36975y && (arrayList = ow0Var.f36974x) != null && !arrayList.isEmpty()) {
                                    ow0Var.f36973w = false;
                                    ow0Var.c();
                                    ow0Var.d.setVisibility(0);
                                    ow0Var.f36959a0 = org.telegram.messenger.g0.L(10.0f);
                                    ow0Var.d.invalidate();
                                } else {
                                    int i15 = ow0Var.L + 1;
                                    ow0Var.L = i15;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (ow0Var.M != null && Math.abs(currentTimeMillis - ow0Var.O) <= 360) {
                                        ow0Var.O = currentTimeMillis;
                                        G0 = ow0Var.M;
                                    } else {
                                        ow0Var.O = currentTimeMillis;
                                        G0 = org.telegram.messenger.g0.G0();
                                    }
                                    String[] strArr = G0;
                                    String[] strArr2 = ow0Var.M;
                                    if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                        org.telegram.messenger.li.b0(i13).M(strArr, false);
                                    }
                                    ow0Var.M = strArr;
                                    Runnable runnable2 = ow0Var.N;
                                    if (runnable2 != null) {
                                        org.telegram.messenger.g0.r(runnable2);
                                        ow0Var.N = null;
                                    }
                                    ow0Var.N = new zo0(ow0Var, strArr, substring2, i15, 3);
                                    ArrayList arrayList6 = ow0Var.f36974x;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        ow0Var.N.run();
                                    } else {
                                        org.telegram.messenger.g0.i3(ow0Var.N, 600L);
                                    }
                                }
                            }
                            kw0 kw0Var4 = ow0Var.d;
                            if (kw0Var4 != null) {
                                kw0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = ow0Var.N;
                    if (runnable3 != null) {
                        org.telegram.messenger.g0.r(runnable3);
                        ow0Var.N = null;
                    }
                    ow0Var.f36972s = false;
                    kw0 kw0Var5 = ow0Var.d;
                    if (kw0Var5 != null) {
                        kw0Var5.invalidate();
                        return;
                    }
                    return;
                }
                ow0Var.f36972s = false;
                ow0Var.f36973w = true;
                kw0 kw0Var6 = ow0Var.d;
                if (kw0Var6 != null) {
                    kw0Var6.invalidate();
                    return;
                }
                return;
            case 12:
                uw0 uw0Var = (uw0) obj;
                uw0Var.L = null;
                uw0Var.b();
                return;
            case 13:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences e12 = org.telegram.messenger.hp.e1();
                    e12.edit().putInt("showchattagsinfo", e12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 14:
                ((sy0) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((zy0) obj).f41170a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).h3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).j3(false, false, false);
                    }
                }
                return;
            case 16:
                yz0 yz0Var = (yz0) obj;
                yz0Var.K = null;
                yz0Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f40452f).start();
                return;
            case 17:
                c01 c01Var = (c01) obj;
                ViewPropertyAnimator duration = c01Var.animate().alpha(0.0f).setListener(new a60(c01Var, 29)).setDuration(300L);
                c01Var.f32494b = duration;
                duration.start();
                return;
            case 18:
                e01 e01Var = (e01) obj;
                org.telegram.messenger.u10 u10Var = e01Var.f33260b;
                if (u10Var != null) {
                    u10Var.a(Long.valueOf(e01Var.f33259a.f33637t));
                    return;
                }
                return;
            case 19:
                g11 g11Var = (g11) ((s9) obj).f37952c;
                if (g11Var.l()) {
                    g11Var.m();
                    return;
                }
                return;
            case 20:
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                org.telegram.messenger.hs.f(ziVar.I1).k(115, ziVar);
                return;
            case 21:
                ((org.telegram.messenger.n10) obj).a(null, Boolean.FALSE);
                return;
            case 22:
                ((org.telegram.ui.ActionBar.f1) obj).dismiss();
                return;
            case 23:
                ((p21) obj).f37041c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.xj) obj).f38974c.presentFragment(new org.telegram.ui.gy0());
                return;
            case 25:
                ((y21) obj).requestLayout();
                return;
            case 26:
                ((p31) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i17 = UndoView.f31669j0;
                undoView.getClass();
                try {
                    undoView.f31679f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((o41) obj).invalidateSelf();
                return;
            default:
                py pyVar = ((b51) obj).f32088b;
                if (pyVar != null) {
                    pyVar.c(false, true, false);
                    return;
                }
                return;
        }
    }

    public sp0(Object obj, int i3) {
        this.f38105a = i3;
        this.f38106b = obj;
    }
}
