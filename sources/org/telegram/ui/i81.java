package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i81 extends AnimatorListenerAdapter {
    public final int f46194a;
    public final Object f46195b;

    public i81(Object obj, int i3) {
        this.f46194a = i3;
        this.f46195b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        int i10;
        int i11 = this.f46194a;
        int i12 = 4;
        float f10 = 1.0f;
        Object obj = this.f46195b;
        switch (i11) {
            case 0:
                super.onAnimationEnd(animator);
                ((j81) obj).d = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((k91) obj).setScrollEnabled(true);
                return;
            case 2:
                qa1 qa1Var = (qa1) obj;
                if (animator.equals(qa1Var.d.L)) {
                    qa1Var.d.L = null;
                    return;
                }
                return;
            case 3:
                db1 db1Var = (db1) obj;
                db1Var.d = null;
                db1Var.f44616a = null;
                db1Var.f44617b = false;
                db1Var.f44620f.f42107c.setAllowDrawCursor(true);
                return;
            case 4:
                ((org.telegram.ui.Wallet.u3) obj).L = null;
                return;
            case 5:
                ((org.telegram.ui.Wallet.b4) obj).f();
                return;
            case 6:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                if (w5Var.K0 == animator) {
                    w5Var.K0 = null;
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.u5 u5Var = (org.telegram.ui.Wallet.u5) obj;
                u5Var.h = false;
                u5Var.f43244n = null;
                u5Var.f43240b.setLayerType(0, null);
                return;
            case 8:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) obj;
                a6Var.O = 0.0f;
                a6Var.P = 0.0f;
                a6Var.f42141c0 = null;
                return;
            case 9:
                org.telegram.ui.Wallet.u6 u6Var = (org.telegram.ui.Wallet.u6) obj;
                u6Var.J = null;
                u6Var.f43259j0 = 1.0f;
                u6Var.f43258i0 = 0.0f;
                u6Var.f43257h0 = 0.0f;
                u6Var.e();
                return;
            case 10:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) obj;
                EditTextBoldCursor editTextBoldCursor = s8Var.f43166b;
                if (s8Var.f43172s == animator) {
                    s8Var.f43172s = null;
                    View view = s8Var.f43165a;
                    if (s8Var.f43175y) {
                        i3 = 4;
                    } else {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                    if (s8Var.f43175y) {
                        i12 = 0;
                    }
                    editTextBoldCursor.setVisibility(i12);
                    if (s8Var.f43175y && !s8Var.E) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) obj;
                l9Var.f42798n = null;
                org.telegram.ui.Wallet.u6 u6Var2 = l9Var.d;
                if (l9Var.f42802x) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                u6Var2.setVisibility(i10);
                TextView textView = l9Var.f42797f;
                if (l9Var.f42803y) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 12:
                o1 o1Var = (o1) obj;
                ((uc1) o1Var.f48167b).getClass();
                ((uc1) o1Var.f48167b).f50045c.setVisibility(4);
                return;
            case 13:
                ((org.telegram.ui.web.w0) obj).f51084s.setVisibility(8);
                return;
            case 14:
                ((CropAreaView) obj).f31375d0 = null;
                return;
            case 15:
                tg.w wVar = (tg.w) obj;
                wVar.f55339a.getPainting().c(null, wVar.f55339a.getCurrentColor(), true, null);
                wVar.f55354r = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ug.e0 e0Var = (ug.e0) obj;
                ImageView imageView = e0Var.f55953c;
                e0Var.f55953c = e0Var.d;
                e0Var.d = imageView;
                imageView.bringToFront();
                e0Var.d.setVisibility(8);
                e0Var.h = null;
                return;
            case 17:
                ug.g1 g1Var = (ug.g1) obj;
                if (animator == g1Var.f56020r) {
                    g1Var.f56018f = g1Var.h;
                    g1Var.h = -1;
                    g1Var.f56020r = null;
                    return;
                }
                return;
            case 18:
                vg.o0 o0Var = (vg.o0) obj;
                if (!o0Var.f56765r) {
                    f10 = 0.0f;
                }
                o0Var.f56766s = f10;
                o0Var.e();
                return;
            case 19:
                vg.w1 w1Var = (vg.w1) ((gi.c0) obj).f12476b;
                w1Var.G = true;
                w1Var.invalidate();
                return;
            case 20:
                int i13 = wg.e.L;
                ((wg.e) ((org.telegram.ui.Cells.x9) obj).f30971b).d();
                return;
            case 21:
                wg.e eVar = (wg.e) obj;
                eVar.d = null;
                eVar.e();
                return;
            case 22:
                super.onAnimationEnd(animator);
                wg.m mVar = ((wg.h) obj).f57654b;
                mVar.f57666b.d = 0.0f;
                mVar.f57672e0 = null;
                mVar.j(mVar.M);
                return;
            case 23:
                xg.b bVar = (xg.b) obj;
                bVar.f58653b = 1.0f;
                bVar.invalidate();
                return;
            default:
                yh.f fVar = (yh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    yh.b bVar2 = (yh.b) it.next();
                    if (fVar.f59509c.size() < fVar.d) {
                        fVar.f59509c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.f59521q;
                if (runnable != null) {
                    runnable.run();
                    fVar.f59521q = null;
                }
                fVar.f59522r = null;
                fVar.invalidateSelf();
                return;
        }
    }
}
