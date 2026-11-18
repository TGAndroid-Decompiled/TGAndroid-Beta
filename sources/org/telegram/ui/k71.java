package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k71 extends AnimatorListenerAdapter {
    public final int f49194a;
    public final Object f49195b;

    public k71(Object obj, int i7) {
        this.f49194a = i7;
        this.f49195b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f49194a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f49195b;
        switch (i11) {
            case 0:
                x71 x71Var = ((m71) obj).f49734a;
                if (!x71Var.f53720r1.d()) {
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
                nb1Var.f50137a = null;
                nb1Var.f50138b = false;
                nb1Var.f50141f.f43896c.setAllowDrawCursor(true);
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
                l6Var.f44496n = false;
                l6Var.f44497r = null;
                l6Var.f44493c.setLayerType(0, null);
                return;
            case 9:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                s6Var.O = 0.0f;
                s6Var.P = 0.0f;
                s6Var.f44999c0 = null;
                return;
            case 10:
                org.telegram.ui.Wallet.m7 m7Var = (org.telegram.ui.Wallet.m7) obj;
                m7Var.J = null;
                m7Var.f44582j0 = 1.0f;
                m7Var.f44581i0 = 0.0f;
                m7Var.f44580h0 = 0.0f;
                m7Var.e();
                return;
            case 11:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) obj;
                EditTextBoldCursor editTextBoldCursor = j9Var.f44416b;
                if (j9Var.f44422s == animator) {
                    j9Var.f44422s = null;
                    View view = j9Var.f44415a;
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
                caVar.f44010n = null;
                org.telegram.ui.Wallet.m7 m7Var2 = caVar.d;
                if (caVar.f44014x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                m7Var2.setVisibility(i10);
                TextView textView = caVar.f44009f;
                if (caVar.f44015y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 13:
                n1 n1Var = (n1) obj;
                ((cd1) n1Var.f50026b).getClass();
                ((cd1) n1Var.f50026b).f46491c.setVisibility(4);
                return;
            case 14:
                ((org.telegram.ui.web.v0) obj).f53318s.setVisibility(8);
                return;
            case 15:
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                ziVar.f28307j = false;
                ziVar.f28306i = false;
                return;
            case 16:
                sg.v vVar = (sg.v) obj;
                vVar.f57367a.getPainting().c(null, vVar.f57367a.getCurrentColor(), true, null);
                vVar.f57382r = null;
                return;
            case 17:
                super.onAnimationEnd(animator);
                tg.f0 f0Var = (tg.f0) obj;
                ImageView imageView = f0Var.f57833c;
                f0Var.f57833c = f0Var.d;
                f0Var.d = imageView;
                imageView.bringToFront();
                f0Var.d.setVisibility(8);
                f0Var.h = null;
                return;
            case 18:
                tg.h1 h1Var = (tg.h1) obj;
                if (animator == h1Var.f57904r) {
                    h1Var.f57902f = h1Var.h;
                    h1Var.h = -1;
                    h1Var.f57904r = null;
                    return;
                }
                return;
            case 19:
                ug.s0 s0Var = (ug.s0) obj;
                if (!s0Var.f58866r) {
                    f10 = 0.0f;
                }
                s0Var.f58867s = f10;
                s0Var.e();
                return;
            case 20:
                ug.x1 x1Var = (ug.x1) ((hi.d0) obj).f14355b;
                x1Var.G = true;
                x1Var.invalidate();
                return;
            case 21:
                int i13 = vg.e.L;
                ((vg.e) ((org.telegram.ui.Cells.z9) obj).f32526b).d();
                return;
            case 22:
                vg.e eVar = (vg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 23:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).f59451b;
                mVar.f59463b.d = 0.0f;
                mVar.f59469e0 = null;
                mVar.j(mVar.M);
                return;
            case 24:
                wg.b bVar = (wg.b) obj;
                bVar.f59720b = 1.0f;
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
                    if (fVar.f60549c.size() < fVar.d) {
                        fVar.f60549c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f60561q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f60561q = null;
                }
                fVar.f60562r = null;
                fVar.invalidateSelf();
                return;
        }
    }
}
