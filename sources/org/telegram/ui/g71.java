package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g71 extends AnimatorListenerAdapter {
    public final int f47369a;
    public final Object f47370b;

    public g71(Object obj, int i7) {
        this.f47369a = i7;
        this.f47370b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f47369a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f47370b;
        switch (i11) {
            case 0:
                t71 t71Var = ((i71) obj).f47937a;
                if (!t71Var.f51458r1.a()) {
                    t71Var.T1.setVisibility(8);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((q81) obj).d = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((s91) obj).setScrollEnabled(true);
                return;
            case 3:
                wa1 wa1Var = (wa1) obj;
                if (animator.equals(wa1Var.d.L)) {
                    wa1Var.d.L = null;
                    return;
                }
                return;
            case 4:
                jb1 jb1Var = (jb1) obj;
                jb1Var.d = null;
                jb1Var.f48294a = null;
                jb1Var.f48295b = false;
                jb1Var.f48298f.f43450c.setAllowDrawCursor(true);
                return;
            case 5:
                ((org.telegram.ui.Wallet.v3) obj).L = null;
                return;
            case 6:
                ((org.telegram.ui.Wallet.c4) obj).f();
                return;
            case 7:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.K0 == animator) {
                    y5Var.K0 = null;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                w5Var.f44630n = false;
                w5Var.f44631r = null;
                w5Var.f44627c.setLayerType(0, null);
                return;
            case 9:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                c6Var.O = 0.0f;
                c6Var.P = 0.0f;
                c6Var.f43624c0 = null;
                return;
            case 10:
                org.telegram.ui.Wallet.w6 w6Var = (org.telegram.ui.Wallet.w6) obj;
                w6Var.J = null;
                w6Var.f44646j0 = 1.0f;
                w6Var.f44645i0 = 0.0f;
                w6Var.f44644h0 = 0.0f;
                w6Var.e();
                return;
            case 11:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) obj;
                EditTextBoldCursor editTextBoldCursor = u8Var.f44566b;
                if (u8Var.f44572s == animator) {
                    u8Var.f44572s = null;
                    View view = u8Var.f44565a;
                    if (u8Var.f44575y) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    view.setVisibility(i7);
                    if (u8Var.f44575y) {
                        i12 = 0;
                    }
                    editTextBoldCursor.setVisibility(i12);
                    if (u8Var.f44575y && !u8Var.E) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.J3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) obj;
                o9Var.f44278n = null;
                org.telegram.ui.Wallet.w6 w6Var2 = o9Var.d;
                if (o9Var.f44282x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                w6Var2.setVisibility(i10);
                TextView textView = o9Var.f44277f;
                if (o9Var.f44283y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 13:
                n1 n1Var = (n1) obj;
                ((zc1) n1Var.f49358b).getClass();
                ((zc1) n1Var.f49358b).f53938c.setVisibility(4);
                return;
            case 14:
                ((org.telegram.ui.web.v0) obj).f52835s.setVisibility(8);
                return;
            case 15:
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                ajVar.f22523j = false;
                ajVar.f22522i = false;
                return;
            case 16:
                sg.v vVar = (sg.v) obj;
                vVar.f56793a.getPainting().c(null, vVar.f56793a.getCurrentColor(), true, null);
                vVar.f56808r = null;
                return;
            case 17:
                super.onAnimationEnd(animator);
                tg.f0 f0Var = (tg.f0) obj;
                ImageView imageView = f0Var.f57230c;
                f0Var.f57230c = f0Var.d;
                f0Var.d = imageView;
                imageView.bringToFront();
                f0Var.d.setVisibility(8);
                f0Var.h = null;
                return;
            case 18:
                tg.h1 h1Var = (tg.h1) obj;
                if (animator == h1Var.f57328r) {
                    h1Var.f57326f = h1Var.h;
                    h1Var.h = -1;
                    h1Var.f57328r = null;
                    return;
                }
                return;
            case 19:
                ug.q0 q0Var = (ug.q0) obj;
                if (!q0Var.f58269r) {
                    f10 = 0.0f;
                }
                q0Var.f58270s = f10;
                q0Var.e();
                return;
            case 20:
                ug.w1 w1Var = (ug.w1) ((hi.c0) obj).f13956b;
                w1Var.G = true;
                w1Var.invalidate();
                return;
            case 21:
                int i13 = vg.e.L;
                ((vg.e) ((org.telegram.ui.Cells.x9) obj).f32048b).d();
                return;
            case 22:
                vg.e eVar = (vg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 23:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).f58881b;
                mVar.f58893b.d = 0.0f;
                mVar.f58899e0 = null;
                mVar.j(mVar.M);
                return;
            case 24:
                wg.b bVar = (wg.b) obj;
                bVar.f59131b = 1.0f;
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
                    if (fVar.f59983c.size() < fVar.d) {
                        fVar.f59983c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f59995q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f59995q = null;
                }
                fVar.f59996r = null;
                fVar.invalidateSelf();
                return;
        }
    }
}
