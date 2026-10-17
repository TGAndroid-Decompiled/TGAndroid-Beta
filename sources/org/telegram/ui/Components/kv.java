package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kv extends s4.r0 {
    public final int f27988a;
    public final Object f27989b;

    public kv(Object obj, int i10) {
        this.f27988a = i10;
        this.f27989b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        sl0 sl0Var;
        org.telegram.ui.Wallet.q8 q8Var;
        int i11 = this.f27988a;
        sg.o1 o1Var = null;
        boolean z11 = false;
        Object obj = this.f27989b;
        switch (i11) {
            case 3:
                hb0 hb0Var = (hb0) obj;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hb0Var.V2 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                hb0Var.W2 = z11;
                return;
            case 5:
                kh0 kh0Var = (kh0) obj;
                eh0 eh0Var = kh0Var.f27875b;
                if (i10 == 0 && kh0.J(kh0Var) + ((kh0Var.E - kh0.I(kh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && eh0Var.canScrollVertically(1)) {
                    eh0Var.getChildAt(0);
                    sl0 sl0Var2 = (sl0) eh0Var.K(0);
                    if (sl0Var2 != null) {
                        View view = sl0Var2.f45938a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            eh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                im0 im0Var = (im0) obj;
                if (i10 == 0) {
                    if (im0Var.f27296t2) {
                        im0Var.f27296t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!im0Var.f27296t2 && im0Var.f27299v1) {
                    im0Var.f27296t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && im0Var.L1 != null) {
                    am0 am0Var = im0Var.f27262c1;
                    if (am0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(am0Var);
                        im0Var.f27262c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        im0Var.K1.j0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    im0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = im0Var.L1;
                    im0Var.h1(view2, 0.0f, 0.0f, false);
                    im0Var.L1 = null;
                    im0Var.k1(null, view2);
                    im0Var.N1 = false;
                }
                s4.r0 r0Var = im0Var.Y0;
                if (r0Var != null) {
                    r0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                im0Var.I1 = z11;
                if (z11) {
                    im0Var.J1 = true;
                    return;
                }
                return;
            case 8:
                tn0 tn0Var = (tn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(tn0Var.F.getCurrentFocus());
                }
                tn0Var.a();
                return;
            case 12:
                j71 j71Var = (j71) obj;
                ai.u1 u1Var = j71Var.d;
                if (i10 == 0 && j71Var.G && AndroidUtilities.dp(13.0f) + j71.n(j71Var) + j71Var.f27437y < AndroidUtilities.statusBarHeight * 2 && u1Var.canScrollVertically(1) && (sl0Var = (sl0) u1Var.K(0)) != null) {
                    View view3 = sl0Var.f45938a;
                    if (view3.getTop() > 0) {
                        u1Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                if (i10 == 1 && (q8Var = ((org.telegram.ui.Wallet.l5) obj).f34490j0) != null) {
                    q8Var.a();
                    return;
                }
                return;
            case 19:
                sg.s0 s0Var = (sg.s0) obj;
                if (i10 == 1) {
                    s0Var.f46388b3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        sg.o1 o1Var2 = (sg.o1) s0Var.getChildAt(i12);
                        if (o1Var == null || o1Var2.f46367a > o1Var.f46367a) {
                            o1Var = o1Var2;
                        }
                    }
                    if (o1Var != null) {
                        s0Var.x1(o1Var, true);
                        s0Var.f46388b3 = false;
                        s0Var.v0(0, o1Var.getTop() - ((s0Var.getMeasuredHeight() - o1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.f46389c3);
                return;
            case 20:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.x0) obj).Y.getEditText());
                    return;
                }
                return;
            case 25:
                zh.c cVar = (zh.c) obj;
                if (i10 == 1) {
                    z11 = true;
                }
                cVar.f51928c0 = z11;
                if (i10 != 0) {
                    cVar.f51924a0 = zh.c.b();
                }
                cVar.invalidate();
                return;
            case 26:
                if (i10 == 0) {
                    ((zh.k0) obj).v = false;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int N0;
        int i12;
        String str;
        TLRPC.User user;
        String str2;
        pl0 pl0Var;
        org.telegram.ui.Wallet.h5 h5Var;
        float f7;
        switch (this.f27988a) {
            case 0:
                aw awVar = (aw) this.f27989b;
                qv qvVar = awVar.f24721f;
                if (qvVar != null && awVar.h.I1 && qvVar.f29763w) {
                    qvVar.f29763w = false;
                    qvVar.invalidate();
                    return;
                }
                return;
            case 1:
                s00 s00Var = (s00) this.f27989b;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 2:
                v00.H((v00) this.f27989b);
                return;
            case 3:
                hb0 hb0Var = (hb0) this.f27989b;
                s4.n0 layoutManager = hb0Var.getLayoutManager();
                ib0 ib0Var = hb0Var.Z2;
                bb0 bb0Var = ib0Var.d;
                if (layoutManager == bb0Var) {
                    N0 = bb0Var.N0();
                } else {
                    N0 = ib0Var.f27170c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    hg.j1 j1Var = ib0Var.f27171f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f11944u0 == 0 && (str = j1Var.f11942s0) != null && str.length() != 0 && (user = j1Var.f11947w0) != null && (str2 = j1Var.f11940r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f11942s0);
                    }
                }
                hb0Var.canScrollVertically(1);
                ib0Var.n(!hb0Var.canScrollVertically(-1));
                ib0Var.b();
                return;
            case 4:
                ic0 ic0Var = (ic0) this.f27989b;
                org.telegram.ui.y8 y8Var = ic0Var.f27182b;
                bc0 bc0Var = ic0Var.f27186f;
                for (int i13 = 0; i13 < bc0Var.getChildCount(); i13++) {
                    View childAt = bc0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt).Z3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                ac0 ac0Var = ic0Var.e;
                if (ac0Var != null) {
                    ac0Var.w();
                    return;
                }
                return;
            case 5:
                kh0 kh0Var = (kh0) this.f27989b;
                if (kh0Var.f27875b.getChildCount() > 0) {
                    kh0.v(kh0Var);
                    return;
                }
                return;
            case 6:
                cl0 cl0Var = (cl0) this.f27989b;
                ai.u1 u1Var = cl0Var.f25260b;
                int[] iArr = cl0Var.f25271f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    cl0.b(cl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    cl0.b(cl0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < u1Var.getChildCount() - 1; i15++) {
                    cl0.b(cl0Var, u1Var.getChildAt(i15), 1.0f);
                }
                cl0Var.invalidate();
                return;
            case 7:
                im0 im0Var = (im0) this.f27989b;
                Rect rect = im0Var.E1;
                s4.r0 r0Var = im0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
                }
                if (im0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = im0Var.B1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    im0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                im0Var.L0(false);
                if (i11 != 0 && (pl0Var = im0Var.f27264d1) != null) {
                    pl0Var.b();
                }
                tl0 tl0Var = im0Var.S1;
                if (tl0Var != null) {
                    im0Var.e1(tl0Var, 700, false);
                    return;
                }
                return;
            case 8:
            case 20:
            default:
                return;
            case 9:
                wv0.n((wv0) this.f27989b);
                return;
            case 10:
                ((yw0) this.f27989b).X.V();
                return;
            case 11:
                oy0.P((oy0) this.f27989b);
                return;
            case 12:
                ((j71) this.f27989b).M();
                return;
            case 13:
                ((b91) this.f27989b).invalidate();
                return;
            case 14:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.f27989b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (h5Var = l5Var.f34499r0) != null && h5Var.f34263f) {
                    h5Var.d = true;
                }
                l5Var.M0();
                return;
            case 15:
                int[] iArr2 = (int[]) this.f27989b;
                iArr2[0] = iArr2[0] + i11;
                return;
            case 16:
                org.telegram.ui.Wallet.t9 t9Var = (org.telegram.ui.Wallet.t9) this.f27989b;
                if (t9Var.f31190a.I1) {
                    AndroidUtilities.hideKeyboard(t9Var.M);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.f27989b;
                if (!oVar.f31190a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(oVar.f42692s)) {
                        oVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = oVar.e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (oVar.f31190a.I1) {
                    AndroidUtilities.hideKeyboard(oVar.fragmentView);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f27989b;
                if (f1Var.f31190a.I1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    return;
                }
                return;
            case 19:
                sg.s0 s0Var = (sg.s0) this.f27989b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.x1(null, true);
                }
                s0Var.invalidate();
                return;
            case 21:
                ((uh.f) this.f27989b).S();
                return;
            case 22:
                s4.b0 b0Var = (s4.b0) recyclerView.getLayoutManager();
                xh.k kVar = (xh.k) this.f27989b;
                xh.e eVar = kVar.C;
                if (kVar.f49898x && !kVar.f49897w && b0Var != null) {
                    if (kVar.f49882f.h() - b0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                yh.h4 h4Var = (yh.h4) this.f27989b;
                int i16 = 0;
                while (true) {
                    if (i16 < h4Var.f50311n.getChildCount()) {
                        if (h4Var.f50311n.getChildAt(i16) instanceof b10) {
                            h4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = h4Var.h.animate();
                if (h4Var.K && h4Var.f50311n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.wh.t(animate.alpha(f7), bs.h, 320L);
                return;
            case 24:
                ((yh.g4) this.f27989b).a0();
                return;
            case 25:
                zh.c cVar = (zh.c) this.f27989b;
                if (i11 != 0) {
                    cVar.f51924a0 = zh.c.b();
                    cVar.invalidate();
                    return;
                }
                return;
            case 26:
                zh.k0 k0Var = (zh.k0) this.f27989b;
                if (!k0Var.v) {
                    k0Var.h.a(k0Var.f(k0Var.c()), true);
                    return;
                }
                return;
        }
    }
}
