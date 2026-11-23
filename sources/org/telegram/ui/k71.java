package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k71 extends AnimatorListenerAdapter {
    public final int f49195a;
    public final Object f49196b;

    public k71(Object obj, int i7) {
        this.f49195a = i7;
        this.f49196b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f49195a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f49196b;
        switch (i11) {
            case 0:
                x71 x71Var = ((m71) obj).f49755a;
                if (!x71Var.f53687r1.d()) {
                    x71Var.T1.setVisibility(8);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((u81) obj).d = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((w91) obj).setScrollEnabled(true);
                return;
            case 3:
                ab1 ab1Var = (ab1) obj;
                if (animator.equals(ab1Var.d.L)) {
                    ab1Var.d.L = null;
                    return;
                }
                return;
            case 4:
                nb1 nb1Var = (nb1) obj;
                nb1Var.d = null;
                nb1Var.f50156a = null;
                nb1Var.f50157b = false;
                nb1Var.f50160f.f43906c.setAllowDrawCursor(true);
                return;
            case 5:
                ((org.telegram.ui.Wallet.f4) obj).L = null;
                return;
            case 6:
                ((org.telegram.ui.Wallet.m4) obj).f();
                return;
            case 7:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var.N0 == animator) {
                    n6Var.N0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) obj;
                l6Var.f44506n = false;
                l6Var.f44507r = null;
                l6Var.f44503c.setLayerType(0, null);
                return;
            case 9:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                s6Var.O = 0.0f;
                s6Var.P = 0.0f;
                s6Var.f45009c0 = null;
                return;
            case 10:
                org.telegram.ui.Wallet.m7 m7Var = (org.telegram.ui.Wallet.m7) obj;
                m7Var.J = null;
                m7Var.f44592j0 = 1.0f;
                m7Var.f44591i0 = 0.0f;
                m7Var.f44590h0 = 0.0f;
                m7Var.e();
                return;
            case 11:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) obj;
                EditTextBoldCursor editTextBoldCursor = j9Var.f44426b;
                if (j9Var.f44432s == animator) {
                    j9Var.f44432s = null;
                    View view = j9Var.f44425a;
                    if (j9Var.E) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    view.setVisibility(i7);
                    if (j9Var.E) {
                        i12 = 0;
                    }
                    editTextBoldCursor.setVisibility(i12);
                    if (j9Var.E && !j9Var.F) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) obj;
                caVar.f44020n = null;
                org.telegram.ui.Wallet.m7 m7Var2 = caVar.d;
                if (caVar.f44024x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                m7Var2.setVisibility(i10);
                TextView textView = caVar.f44019f;
                if (caVar.f44025y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 13:
                n1 n1Var = (n1) obj;
                ((cd1) n1Var.f50045b).getClass();
                ((cd1) n1Var.f50045b).f46508c.setVisibility(4);
                return;
            case 14:
                ((org.telegram.ui.web.v0) obj).f53329s.setVisibility(8);
                return;
            case 15:
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                ajVar.f22890j = false;
                ajVar.f22889i = false;
                return;
            case 16:
                sg.v vVar = (sg.v) obj;
                vVar.f57377a.getPainting().c(null, vVar.f57377a.getCurrentColor(), true, null);
                vVar.f57392r = null;
                return;
            case 17:
                super.onAnimationEnd(animator);
                tg.g0 g0Var = (tg.g0) obj;
                ImageView imageView = g0Var.f57858c;
                g0Var.f57858c = g0Var.d;
                g0Var.d = imageView;
                imageView.bringToFront();
                g0Var.d.setVisibility(8);
                g0Var.h = null;
                return;
            case 18:
                tg.i1 i1Var = (tg.i1) obj;
                if (animator == i1Var.f57932r) {
                    i1Var.f57930f = i1Var.h;
                    i1Var.h = -1;
                    i1Var.f57932r = null;
                    return;
                }
                return;
            case 19:
                ug.r0 r0Var = (ug.r0) obj;
                if (!r0Var.f58871r) {
                    f10 = 0.0f;
                }
                r0Var.f58872s = f10;
                r0Var.e();
                return;
            case 20:
                ug.w1 w1Var = (ug.w1) ((hi.d0) obj).f14319b;
                w1Var.G = true;
                w1Var.invalidate();
                return;
            case 21:
                int i13 = vg.f.L;
                ((vg.f) ((org.telegram.ui.Cells.z9) obj).f32523b).d();
                return;
            case 22:
                vg.f fVar = (vg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 23:
                super.onAnimationEnd(animator);
                vg.n nVar = ((vg.i) obj).f59458b;
                nVar.f59470b.d = 0.0f;
                nVar.f59476e0 = null;
                nVar.j(nVar.M);
                return;
            case 24:
                wg.b bVar = (wg.b) obj;
                bVar.f59727b = 1.0f;
                bVar.invalidate();
                return;
            case 25:
                ((wi.h) obj).v = null;
                return;
            default:
                xh.f fVar2 = (xh.f) obj;
                Iterator it = fVar2.h.iterator();
                while (it.hasNext()) {
                    xh.b bVar2 = (xh.b) it.next();
                    if (fVar2.f60559c.size() < fVar2.d) {
                        fVar2.f60559c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar2.f60571q;
                if (runnable != null) {
                    runnable.run();
                    fVar2.f60571q = null;
                }
                fVar2.f60572r = null;
                fVar2.invalidateSelf();
                return;
        }
    }
}
