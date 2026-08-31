package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class ec0 implements Runnable {
    public final int f26503a;
    public final Object f26504b;

    public ec0(Object obj, int i10) {
        this.f26503a = i10;
        this.f26504b = obj;
    }

    @Override
    public final void run() {
        float f10;
        k71 k71Var;
        switch (this.f26503a) {
            case 0:
                ((fc0) this.f26504b).z();
                return;
            case 1:
                ((lc0) this.f26504b).invalidateSelf();
                return;
            case 2:
                ((oc0) this.f26504b).invalidateSelf();
                return;
            case 3:
                ((hd0) this.f26504b).d();
                return;
            case 4:
                rd0 rd0Var = (rd0) this.f26504b;
                rd0Var.getClass();
                try {
                    rd0Var.d.F.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((fe0) this.f26504b).f26901f.start();
                return;
            case 6:
                xz xzVar = ((kf0) this.f26504b).f28384c.f30047i0;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                nf0 nf0Var = (nf0) this.f26504b;
                nf0Var.f29467r = false;
                nf0Var.invalidate();
                return;
            case 8:
                ((qf0) this.f26504b).h = null;
                return;
            case 9:
                qf0 qf0Var = (qf0) ((n7.qa) this.f26504b).f15700c;
                qf0Var.d.L(qf0Var.f30387e, false);
                return;
            case 10:
                org.telegram.ui.pt0 pt0Var = (org.telegram.ui.pt0) this.f26504b;
                if (pt0Var.f33068x) {
                    pt0Var.h("pollPosition();");
                }
                if (pt0Var.D) {
                    AndroidUtilities.runOnUIThread(pt0Var.I, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f26504b).invalidate();
                return;
            case 12:
                ng0 ng0Var = (ng0) ((jg0) this.f26504b).f28111b;
                ng0Var.d.invalidate();
                ng0Var.f29492e.requestLayout();
                return;
            case 13:
                ((pg0) this.f26504b).f();
                return;
            case 14:
                try {
                    ni0 ni0Var = ((mi0) this.f26504b).f29119b;
                    if (ni0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ni0Var.getParent()).removeView(ni0Var);
                    }
                    ni0Var.N.run();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 15:
                ((RLottieNative) this.f26504b).d();
                return;
            case 16:
                rk0 rk0Var = (rk0) this.f26504b;
                rk0Var.f30786u0 = null;
                rk0Var.j();
                qk0 qk0Var = rk0Var.f30761d0;
                if (qk0Var != null) {
                    qk0Var.m();
                    return;
                }
                return;
            case 17:
                ((ok0) this.f26504b).E.f30098a.setVisibility(4);
                return;
            case 18:
                sk0 sk0Var = (sk0) this.f26504b;
                k71 k71Var2 = sk0Var.f31080n;
                if (k71Var2 != null) {
                    boolean y10 = k71Var2.y();
                    float n10 = ((float) sk0Var.f31080n.n()) / ((float) sk0Var.f31080n.p());
                    if (n10 < sk0Var.f31082s) {
                        sk0Var.f31080n.L(f10 * ((float) k71Var.p()), false);
                    } else if (n10 > sk0Var.v) {
                        sk0Var.setPlaying(false);
                        y10 = false;
                    }
                    if (y10) {
                        AndroidUtilities.runOnUIThread(sk0Var.f31084x, 16L);
                    }
                }
                sk0Var.invalidate();
                return;
            case 19:
                tl0 tl0Var = (tl0) this.f26504b;
                tl0Var.S1 = null;
                tl0Var.R1 = null;
                org.telegram.ui.Cells.z zVar = tl0Var.A1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = tl0Var.A1;
                if (zVar2 != null && zVar2.isStateful()) {
                    tl0Var.A1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                en0 en0Var = (en0) this.f26504b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = en0Var.d;
                FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(i10).getRecentLoadingFiles(arrayList2);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (FileLoader.getInstance(i10).getPathToMessage(arrayList.get(i11).messageOwner).exists()) {
                        arrayList3.add(arrayList.get(i11));
                    }
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (!FileLoader.getInstance(i10).getPathToMessage(arrayList2.get(i12).messageOwner).exists()) {
                        arrayList4.add(arrayList2.get(i12));
                    }
                }
                AndroidUtilities.runOnUIThread(new jp(en0Var, arrayList3, arrayList4, 14));
                return;
            case 21:
                ((gn0) this.f26504b).invalidateSelf();
                return;
            case 22:
                ((pn0) this.f26504b).f30132f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.yx) this.f26504b).s();
                return;
            case 24:
                ((q70) this.f26504b).s();
                return;
            case 25:
                ((lo0) this.f26504b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((no0) this.f26504b).f29594n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 27:
                po0 po0Var = (po0) this.f26504b;
                po0Var.f30154q = false;
                po0Var.f30141b.run();
                return;
            case 28:
                ((mq0) ((eh.c) this.f26504b).f5618b).a1(1);
                return;
            default:
                rq0 rq0Var = (rq0) this.f26504b;
                pq0[] pq0VarArr = rq0Var.f30819a;
                if (rq0Var.f30820b != 1) {
                    for (pq0 pq0Var : pq0VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var = pq0Var.d;
                        l5Var.setAlpha(1.0f);
                        l5Var.setScaleX(1.0f);
                        l5Var.setScaleY(1.0f);
                        pq0Var.f30178e.setAlpha(0.0f);
                    }
                    rq0Var.B = false;
                    AndroidUtilities.runOnUIThread(rq0Var.D, 4000L);
                    return;
                }
                rq0Var.B = !rq0Var.B;
                for (pq0 pq0Var2 : pq0VarArr) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = pq0Var2.d;
                    org.telegram.ui.ActionBar.l5 l5Var3 = pq0Var2.f30178e;
                    l5Var2.setPivotX(0.0f);
                    l5Var3.setPivotX(0.0f);
                    if (rq0Var.B) {
                        l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        l5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        l5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(rq0Var.D, 4000L);
                return;
        }
    }
}
