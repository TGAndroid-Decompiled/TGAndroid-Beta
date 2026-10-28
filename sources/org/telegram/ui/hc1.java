package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hc1 extends AnimatorListenerAdapter {
    public final int f39852a;
    public final Object f39853b;

    public hc1(Object obj, int i10) {
        this.f39852a = i10;
        this.f39853b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12 = this.f39852a;
        int i13 = 4;
        float f7 = 1.0f;
        Object obj = this.f39853b;
        switch (i12) {
            case 0:
                vc1 vc1Var = ((jc1) obj).f40509a;
                if (!vc1Var.f44292q1.a()) {
                    vc1Var.S1.setVisibility(8);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((wd1) obj).f44647a = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((af1) obj).setScrollEnabled(true);
                return;
            case 3:
                eg1 eg1Var = (eg1) obj;
                if (animator.equals(eg1Var.d.K)) {
                    eg1Var.d.K = null;
                    return;
                }
                return;
            case 4:
                tg1 tg1Var = (tg1) obj;
                tg1Var.d = null;
                tg1Var.f43639a = null;
                tg1Var.f43640b = false;
                tg1Var.f43642f.f36348c.setAllowDrawCursor(true);
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
                k5Var.f36815n = null;
                k5Var.f36812b.setLayerType(0, null);
                return;
            case 9:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) obj;
                r5Var.N = 0.0f;
                r5Var.O = 0.0f;
                r5Var.f37193b0 = null;
                return;
            case 10:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.I = null;
                m6Var.f36985i0 = 1.0f;
                m6Var.f36984h0 = 0.0f;
                m6Var.f36983g0 = 0.0f;
                m6Var.e();
                return;
            case 11:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj;
                EditTextBoldCursor editTextBoldCursor = n8Var.f37057b;
                if (n8Var.f37062s == animator) {
                    n8Var.f37062s = null;
                    View view = n8Var.f37056a;
                    if (n8Var.f37064x) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    if (n8Var.f37064x) {
                        i13 = 0;
                    }
                    editTextBoldCursor.setVisibility(i13);
                    if (n8Var.f37064x && !n8Var.f37065y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                h9Var.f36670n = null;
                org.telegram.ui.Wallet.m6 m6Var2 = h9Var.d;
                if (h9Var.f36673w) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                m6Var2.setVisibility(i11);
                TextView textView = h9Var.f36669f;
                if (h9Var.f36674x) {
                    i13 = 0;
                }
                textView.setVisibility(i13);
                return;
            case 13:
                org.telegram.ui.Components.jg0 jg0Var = (org.telegram.ui.Components.jg0) obj;
                ((pi1) jg0Var.f29673b).getClass();
                ((pi1) jg0Var.f29673b).f42443c.setVisibility(4);
                return;
            case 14:
                ((org.telegram.ui.web.a1) obj).f44688s.setVisibility(8);
                return;
            case 15:
                rg.e0 e0Var = (rg.e0) obj;
                e0Var.f47426a.getPainting().c(null, e0Var.f47426a.getCurrentColor(), true, null);
                e0Var.f47440r = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                sg.l0 l0Var = (sg.l0) obj;
                ImageView imageView = l0Var.f48333c;
                l0Var.f48333c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 17:
                sg.s1 s1Var = (sg.s1) obj;
                if (animator == s1Var.f48546r) {
                    s1Var.f48544f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.f48546r = null;
                    return;
                }
                return;
            case 18:
                tg.p0 p0Var = (tg.p0) obj;
                if (!p0Var.f49018r) {
                    f7 = 0.0f;
                }
                p0Var.f49019s = f7;
                p0Var.e();
                return;
            case 19:
                tg.a2 a2Var = (tg.a2) ((fi.c0) obj).f10591b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 20:
                int i14 = ug.f.K;
                ((ug.f) ((ug.e) obj).f49803b).d();
                return;
            case 21:
                ug.f fVar = (ug.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 22:
                super.onAnimationEnd(animator);
                ug.n nVar = ((ug.i) obj).f49839b;
                nVar.f49851b.d = 0.0f;
                nVar.f49855d0 = null;
                nVar.j(nVar.L);
                return;
            case 23:
                vg.b bVar = (vg.b) obj;
                bVar.f50180b = 1.0f;
                bVar.invalidate();
                return;
            case 24:
                xh.g gVar = (xh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    xh.c cVar = (xh.c) it.next();
                    if (gVar.f51920c.size() < gVar.d) {
                        gVar.f51920c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f51931q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f51931q = null;
                }
                gVar.f51932r = null;
                gVar.invalidateSelf();
                return;
            default:
                ((zh.g0) obj).f53037b.f53101w.setVisibility(8);
                return;
        }
    }
}
