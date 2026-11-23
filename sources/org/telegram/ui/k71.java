package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k71 extends AnimatorListenerAdapter {
    public final int f49238a;
    public final Object f49239b;

    public k71(Object obj, int i7) {
        this.f49238a = i7;
        this.f49239b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f49238a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f49239b;
        switch (i11) {
            case 0:
                x71 x71Var = ((m71) obj).f49782a;
                if (!x71Var.f53765r1.d()) {
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
                nb1Var.f50168a = null;
                nb1Var.f50169b = false;
                nb1Var.f50172f.f43941c.setAllowDrawCursor(true);
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
                l6Var.f44540n = false;
                l6Var.f44541r = null;
                l6Var.f44537c.setLayerType(0, null);
                return;
            case 9:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                s6Var.O = 0.0f;
                s6Var.P = 0.0f;
                s6Var.f45043c0 = null;
                return;
            case 10:
                org.telegram.ui.Wallet.m7 m7Var = (org.telegram.ui.Wallet.m7) obj;
                m7Var.J = null;
                m7Var.f44626j0 = 1.0f;
                m7Var.f44625i0 = 0.0f;
                m7Var.f44624h0 = 0.0f;
                m7Var.e();
                return;
            case 11:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) obj;
                EditTextBoldCursor editTextBoldCursor = j9Var.f44460b;
                if (j9Var.f44466s == animator) {
                    j9Var.f44466s = null;
                    View view = j9Var.f44459a;
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
                caVar.f44054n = null;
                org.telegram.ui.Wallet.m7 m7Var2 = caVar.d;
                if (caVar.f44058x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                m7Var2.setVisibility(i10);
                TextView textView = caVar.f44053f;
                if (caVar.f44059y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 13:
                n1 n1Var = (n1) obj;
                ((cd1) n1Var.f50065b).getClass();
                ((cd1) n1Var.f50065b).f46522c.setVisibility(4);
                return;
            case 14:
                ((org.telegram.ui.web.v0) obj).f53365s.setVisibility(8);
                return;
            case 15:
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                ajVar.f22926j = false;
                ajVar.f22925i = false;
                return;
            case 16:
                sg.v vVar = (sg.v) obj;
                vVar.f57412a.getPainting().c(null, vVar.f57412a.getCurrentColor(), true, null);
                vVar.f57427r = null;
                return;
            case 17:
                super.onAnimationEnd(animator);
                tg.g0 g0Var = (tg.g0) obj;
                ImageView imageView = g0Var.f57893c;
                g0Var.f57893c = g0Var.d;
                g0Var.d = imageView;
                imageView.bringToFront();
                g0Var.d.setVisibility(8);
                g0Var.h = null;
                return;
            case 18:
                tg.i1 i1Var = (tg.i1) obj;
                if (animator == i1Var.f57967r) {
                    i1Var.f57965f = i1Var.h;
                    i1Var.h = -1;
                    i1Var.f57967r = null;
                    return;
                }
                return;
            case 19:
                ug.r0 r0Var = (ug.r0) obj;
                if (!r0Var.f58906r) {
                    f10 = 0.0f;
                }
                r0Var.f58907s = f10;
                r0Var.e();
                return;
            case 20:
                ug.w1 w1Var = (ug.w1) ((hi.e0) obj).f14583b;
                w1Var.G = true;
                w1Var.invalidate();
                return;
            case 21:
                int i13 = vg.e.L;
                ((vg.e) ((org.telegram.ui.Cells.z9) obj).f32557b).d();
                return;
            case 22:
                vg.e eVar = (vg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 23:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).f59493b;
                mVar.f59505b.d = 0.0f;
                mVar.f59511e0 = null;
                mVar.j(mVar.M);
                return;
            case 24:
                wg.b bVar = (wg.b) obj;
                bVar.f59762b = 1.0f;
                bVar.invalidate();
                return;
            case 25:
                ((wi.h) obj).v = null;
                return;
            default:
                xh.f fVar = (xh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    xh.b bVar2 = (xh.b) it.next();
                    if (fVar.f60594c.size() < fVar.d) {
                        fVar.f60594c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f60606q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f60606q = null;
                }
                fVar.f60607r = null;
                fVar.invalidateSelf();
                return;
        }
    }
}
