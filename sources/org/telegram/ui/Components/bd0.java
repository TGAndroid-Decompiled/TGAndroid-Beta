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
public final class bd0 implements Runnable {
    public final int f24979a;
    public final Object f24980b;

    public bd0(Object obj, int i10) {
        this.f24979a = i10;
        this.f24980b = obj;
    }

    @Override
    public final void run() {
        float f7;
        k81 k81Var;
        switch (this.f24979a) {
            case 0:
                ((cd0) this.f24980b).z();
                return;
            case 1:
                ((ci.u) this.f24980b).invalidateSelf();
                return;
            case 2:
                ((kd0) this.f24980b).invalidateSelf();
                return;
            case 3:
                ((ee0) this.f24980b).d();
                return;
            case 4:
                oe0 oe0Var = (oe0) this.f24980b;
                oe0Var.getClass();
                try {
                    oe0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((bf0) this.f24980b).f24999f.start();
                return;
            case 6:
                l00 l00Var = ((fg0) this.f24980b).f26364c.f27987l0;
                if (l00Var != null) {
                    l00Var.e(false, true, false);
                    return;
                }
                return;
            case 7:
                ig0 ig0Var = (ig0) this.f24980b;
                ig0Var.f27378r = false;
                ig0Var.invalidate();
                return;
            case 8:
                ((lg0) this.f24980b).h = null;
                return;
            case 9:
                lg0 lg0Var = (lg0) ((org.telegram.ui.ActionBar.b5) this.f24980b).f20462c;
                lg0Var.d.L(lg0Var.f28455e, false);
                return;
            case 10:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) this.f24980b;
                if (ju0Var.f30791x) {
                    ju0Var.h("pollPosition();");
                }
                if (ju0Var.G) {
                    AndroidUtilities.runOnUIThread(ju0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f24980b).invalidate();
                return;
            case 12:
                gh0 gh0Var = (gh0) ((lg.b) this.f24980b).f15506b;
                gh0Var.d.invalidate();
                gh0Var.f26708e.requestLayout();
                return;
            case 13:
                ((ih0) this.f24980b).f();
                return;
            case 14:
                try {
                    jj0 jj0Var = ((ij0) this.f24980b).f27411b;
                    if (jj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jj0Var.getParent()).removeView(jj0Var);
                    }
                    jj0Var.Q.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 15:
                ((RLottieNative) this.f24980b).d();
                return;
            case 16:
                kl0 kl0Var = (kl0) this.f24980b;
                kl0Var.f28106x0 = null;
                kl0Var.j();
                jl0 jl0Var = kl0Var.f28081g0;
                if (jl0Var != null) {
                    jl0Var.s();
                    return;
                }
                return;
            case 17:
                ((hl0) this.f24980b).H.f27420a.setVisibility(4);
                return;
            case 18:
                ll0 ll0Var = (ll0) this.f24980b;
                k81 k81Var2 = ll0Var.f28479n;
                if (k81Var2 != null) {
                    boolean y3 = k81Var2.y();
                    float n10 = ((float) ll0Var.f28479n.n()) / ((float) ll0Var.f28479n.p());
                    if (n10 < ll0Var.f28481s) {
                        ll0Var.f28479n.L(f7 * ((float) k81Var.p()), false);
                    } else if (n10 > ll0Var.v) {
                        ll0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(ll0Var.f28483x, 16L);
                    }
                }
                ll0Var.invalidate();
                return;
            case 19:
                qm0 qm0Var = (qm0) this.f24980b;
                qm0Var.T1 = null;
                qm0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = qm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = qm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    qm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                bo0 bo0Var = (bo0) this.f24980b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = bo0Var.d;
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
                AndroidUtilities.runOnUIThread(new og0(bo0Var, arrayList3, arrayList4, 2));
                return;
            case 21:
                ((do0) this.f24980b).invalidateSelf();
                return;
            case 22:
                ((no0) this.f24980b).f29223f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.dy) this.f24980b).s();
                return;
            case 24:
                ((p80) this.f24980b).s();
                return;
            case 25:
                ((kp0) this.f24980b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((np0) this.f24980b).f29243n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 27:
                pp0 pp0Var = (pp0) this.f24980b;
                pp0Var.f29915q = false;
                pp0Var.f29902b.run();
                return;
            case 28:
                ((mr0) ((ci.h2) this.f24980b).f5156b).b1(1);
                return;
            default:
                rr0 rr0Var = (rr0) this.f24980b;
                pr0[] pr0VarArr = rr0Var.f30487a;
                if (rr0Var.f30488b != 1) {
                    for (pr0 pr0Var : pr0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = pr0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        pr0Var.f29933e.setAlpha(0.0f);
                    }
                    rr0Var.E = false;
                    AndroidUtilities.runOnUIThread(rr0Var.G, 4000L);
                    return;
                }
                rr0Var.E = !rr0Var.E;
                for (pr0 pr0Var2 : pr0VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = pr0Var2.d;
                    org.telegram.ui.ActionBar.j5 j5Var3 = pr0Var2.f29933e;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (rr0Var.E) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(rr0Var.G, 4000L);
                return;
        }
    }
}
