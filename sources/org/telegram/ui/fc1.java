package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fc1 extends AnimatorListenerAdapter {
    public final int f39336a;
    public final Object f39337b;

    public fc1(Object obj, int i10) {
        this.f39336a = i10;
        this.f39337b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12 = this.f39336a;
        int i13 = 4;
        float f7 = 1.0f;
        Object obj = this.f39337b;
        switch (i12) {
            case 0:
                tc1 tc1Var = ((hc1) obj).f39979a;
                if (!tc1Var.f43779q1.a()) {
                    tc1Var.S1.setVisibility(8);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((ud1) obj).f44109a = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((ye1) obj).setScrollEnabled(true);
                return;
            case 3:
                cg1 cg1Var = (cg1) obj;
                if (animator.equals(cg1Var.d.K)) {
                    cg1Var.d.K = null;
                    return;
                }
                return;
            case 4:
                rg1 rg1Var = (rg1) obj;
                rg1Var.d = null;
                rg1Var.f43151a = null;
                rg1Var.f43152b = false;
                rg1Var.f43154f.f36321c.setAllowDrawCursor(true);
                return;
            case 5:
                ((org.telegram.ui.Wallet.f3) obj).K = null;
                return;
            case 6:
                ((org.telegram.ui.Wallet.m3) obj).f();
                return;
            case 7:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                if (m5Var.J0 == animator) {
                    m5Var.J0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Wallet.k5 k5Var = (org.telegram.ui.Wallet.k5) obj;
                k5Var.h = false;
                k5Var.f36786n = null;
                k5Var.f36783b.setLayerType(0, null);
                return;
            case 9:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) obj;
                r5Var.N = 0.0f;
                r5Var.O = 0.0f;
                r5Var.f37166b0 = null;
                return;
            case 10:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) obj;
                l6Var.I = null;
                l6Var.f36855i0 = 1.0f;
                l6Var.f36854h0 = 0.0f;
                l6Var.f36853g0 = 0.0f;
                l6Var.e();
                return;
            case 11:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj;
                EditTextBoldCursor editTextBoldCursor = n8Var.f37029b;
                if (n8Var.f37034s == animator) {
                    n8Var.f37034s = null;
                    View view = n8Var.f37028a;
                    if (n8Var.f37036x) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    if (n8Var.f37036x) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (n8Var.f37036x && !n8Var.f37037y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                h9Var.f36642n = null;
                org.telegram.ui.Wallet.l6 l6Var2 = h9Var.d;
                if (h9Var.f36645w) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                l6Var2.setVisibility(i11);
                TextView textView = h9Var.f36641f;
                if (h9Var.f36646x) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 13:
                org.telegram.ui.Components.ig0 ig0Var = (org.telegram.ui.Components.ig0) obj;
                ((ni1) ig0Var.f29288b).getClass();
                ((ni1) ig0Var.f29288b).f41937c.setVisibility(4);
                return;
            case 14:
                ((org.telegram.ui.web.a1) obj).f45174s.setVisibility(8);
                return;
            case 15:
                rg.e0 e0Var = (rg.e0) obj;
                e0Var.f47388a.getPainting().c(null, e0Var.f47388a.getCurrentColor(), true, null);
                e0Var.f47402r = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                sg.m0 m0Var = (sg.m0) obj;
                ImageView imageView = m0Var.f48304c;
                m0Var.f48304c = m0Var.d;
                m0Var.d = imageView;
                imageView.bringToFront();
                m0Var.d.setVisibility(8);
                m0Var.h = null;
                return;
            case 17:
                sg.t1 t1Var = (sg.t1) obj;
                if (animator == t1Var.f48518r) {
                    t1Var.f48516f = t1Var.h;
                    t1Var.h = -1;
                    t1Var.f48518r = null;
                    return;
                }
                return;
            case 18:
                tg.p0 p0Var = (tg.p0) obj;
                if (!p0Var.f48980r) {
                    f7 = 0.0f;
                }
                p0Var.f48981s = f7;
                p0Var.e();
                return;
            case 19:
                tg.a2 a2Var = (tg.a2) ((fi.c0) obj).f10592b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 20:
                int i14 = ug.f.K;
                ((ug.f) ((ug.e) obj).f49765b).d();
                return;
            case 21:
                ug.f fVar = (ug.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 22:
                super.onAnimationEnd(animator);
                ug.n nVar = ((ug.i) obj).f49801b;
                nVar.f49813b.d = 0.0f;
                nVar.f49817d0 = null;
                nVar.j(nVar.L);
                return;
            case 23:
                vg.b bVar = (vg.b) obj;
                bVar.f50142b = 1.0f;
                bVar.invalidate();
                return;
            case 24:
                xh.g gVar = (xh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    xh.c cVar = (xh.c) it.next();
                    if (gVar.f51859c.size() < gVar.d) {
                        gVar.f51859c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f51870q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f51870q = null;
                }
                gVar.f51871r = null;
                gVar.invalidateSelf();
                return;
            default:
                ((zh.g0) obj).f52976b.f53040w.setVisibility(8);
                return;
        }
    }
}
