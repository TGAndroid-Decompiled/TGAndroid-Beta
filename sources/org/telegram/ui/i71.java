package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i71 extends AnimatorListenerAdapter {
    public final int f48740a;
    public final Object f48741b;

    public i71(Object obj, int i7) {
        this.f48740a = i7;
        this.f48741b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f48740a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f48741b;
        switch (i11) {
            case 0:
                v71 v71Var = ((k71) obj).f49361a;
                if (!v71Var.f52895r1.b()) {
                    v71Var.T1.setVisibility(8);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((s81) obj).d = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((u91) obj).setScrollEnabled(true);
                return;
            case 3:
                ya1 ya1Var = (ya1) obj;
                if (animator.equals(ya1Var.d.L)) {
                    ya1Var.d.L = null;
                    return;
                }
                return;
            case 4:
                lb1 lb1Var = (lb1) obj;
                lb1Var.d = null;
                lb1Var.f49715a = null;
                lb1Var.f49716b = false;
                lb1Var.f49719f.f44022c.setAllowDrawCursor(true);
                return;
            case 5:
                ((org.telegram.ui.Wallet.g4) obj).L = null;
                return;
            case 6:
                ((org.telegram.ui.Wallet.n4) obj).f();
                return;
            case 7:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) obj;
                if (o6Var.N0 == animator) {
                    o6Var.N0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.f44667n = false;
                m6Var.f44668r = null;
                m6Var.f44664c.setLayerType(0, null);
                return;
            case 9:
                org.telegram.ui.Wallet.t6 t6Var = (org.telegram.ui.Wallet.t6) obj;
                t6Var.O = 0.0f;
                t6Var.P = 0.0f;
                t6Var.f45171c0 = null;
                return;
            case 10:
                org.telegram.ui.Wallet.n7 n7Var = (org.telegram.ui.Wallet.n7) obj;
                n7Var.J = null;
                n7Var.f44766j0 = 1.0f;
                n7Var.f44765i0 = 0.0f;
                n7Var.f44764h0 = 0.0f;
                n7Var.e();
                return;
            case 11:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) obj;
                EditTextBoldCursor editTextBoldCursor = k9Var.f44587b;
                if (k9Var.f44593s == animator) {
                    k9Var.f44593s = null;
                    View view = k9Var.f44586a;
                    if (k9Var.E) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    view.setVisibility(i7);
                    if (k9Var.E) {
                        i12 = 0;
                    }
                    editTextBoldCursor.setVisibility(i12);
                    if (k9Var.E && !k9Var.F) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) obj;
                daVar.f44180n = null;
                org.telegram.ui.Wallet.n7 n7Var2 = daVar.d;
                if (daVar.f44184x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                n7Var2.setVisibility(i10);
                TextView textView = daVar.f44179f;
                if (daVar.f44185y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 13:
                n1 n1Var = (n1) obj;
                ((ad1) n1Var.f50171b).getClass();
                ((ad1) n1Var.f50171b).f45698c.setVisibility(4);
                return;
            case 14:
                ((org.telegram.ui.web.v0) obj).f53599s.setVisibility(8);
                return;
            case 15:
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                ziVar.f28399j = false;
                ziVar.f28398i = false;
                return;
            case 16:
                sg.v vVar = (sg.v) obj;
                vVar.f57487a.getPainting().c(null, vVar.f57487a.getCurrentColor(), true, null);
                vVar.f57502r = null;
                return;
            case 17:
                super.onAnimationEnd(animator);
                tg.k0 k0Var = (tg.k0) obj;
                ImageView imageView = k0Var.f58013c;
                k0Var.f58013c = k0Var.d;
                k0Var.d = imageView;
                imageView.bringToFront();
                k0Var.d.setVisibility(8);
                k0Var.h = null;
                return;
            case 18:
                tg.m1 m1Var = (tg.m1) obj;
                if (animator == m1Var.f58084r) {
                    m1Var.f58082f = m1Var.h;
                    m1Var.h = -1;
                    m1Var.f58084r = null;
                    return;
                }
                return;
            case 19:
                ug.r0 r0Var = (ug.r0) obj;
                if (!r0Var.f58986r) {
                    f10 = 0.0f;
                }
                r0Var.f58987s = f10;
                r0Var.e();
                return;
            case 20:
                ug.x1 x1Var = (ug.x1) ((hi.l0) obj).f14808b;
                x1Var.G = true;
                x1Var.invalidate();
                return;
            case 21:
                int i13 = vg.e.L;
                ((vg.e) ((org.telegram.ui.Cells.y9) obj).f32576b).d();
                return;
            case 22:
                vg.e eVar = (vg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 23:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).f59578b;
                mVar.f59590b.d = 0.0f;
                mVar.f59596e0 = null;
                mVar.j(mVar.M);
                return;
            case 24:
                wg.b bVar = (wg.b) obj;
                bVar.f59829b = 1.0f;
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
                    if (fVar.f60677c.size() < fVar.d) {
                        fVar.f60677c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f60689q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f60689q = null;
                }
                fVar.f60690r = null;
                fVar.invalidateSelf();
                return;
        }
    }
}
