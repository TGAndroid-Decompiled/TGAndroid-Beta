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
public final class ib0 implements Runnable {
    public final int f29412a;
    public final Object f29413b;

    public ib0(Object obj, int i9) {
        this.f29412a = i9;
        this.f29413b = obj;
    }

    @Override
    public final void run() {
        float f10;
        k61 k61Var;
        switch (this.f29412a) {
            case 0:
                ((jb0) this.f29413b).z();
                return;
            case 1:
                ((kh.v) this.f29413b).invalidateSelf();
                return;
            case 2:
                ((rb0) this.f29413b).invalidateSelf();
                return;
            case 3:
                ((kc0) this.f29413b).d();
                return;
            case 4:
                tc0 tc0Var = (tc0) this.f29413b;
                tc0Var.getClass();
                try {
                    tc0Var.d.E.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((hd0) this.f29413b).f29049f.start();
                return;
            case 6:
                hz hzVar = ((le0) this.f29413b).f30426c.f31902h0;
                if (hzVar != null) {
                    hzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                oe0 oe0Var = (oe0) this.f29413b;
                oe0Var.f31371r = false;
                oe0Var.invalidate();
                return;
            case 8:
                ((re0) this.f29413b).h = null;
                return;
            case 9:
                re0 re0Var = (re0) ((org.telegram.ui.Cells.e3) this.f29413b).f24287c;
                re0Var.d.M(re0Var.f32149e, false);
                return;
            case 10:
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) this.f29413b;
                if (gt0Var.f35295x) {
                    gt0Var.h("pollPosition();");
                }
                if (gt0Var.C) {
                    AndroidUtilities.runOnUIThread(gt0Var.H, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f29413b).invalidate();
                return;
            case 12:
                pf0 pf0Var = (pf0) ((mf0) this.f29413b).f30809b;
                pf0Var.d.invalidate();
                pf0Var.f31630e.requestLayout();
                return;
            case 13:
                ((rf0) this.f29413b).f();
                return;
            case 14:
                try {
                    qh0 qh0Var = ((ph0) this.f29413b).f31664b;
                    if (qh0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) qh0Var.getParent()).removeView(qh0Var);
                    }
                    qh0Var.M.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                ((RLottieNative) this.f29413b).d();
                return;
            case 16:
                uj0 uj0Var = (uj0) this.f29413b;
                uj0Var.f33074t0 = null;
                uj0Var.j();
                tj0 tj0Var = uj0Var.f33049c0;
                if (tj0Var != null) {
                    tj0Var.t();
                    return;
                }
                return;
            case 17:
                ((rj0) this.f29413b).D.f32474a.setVisibility(4);
                return;
            case 18:
                vj0 vj0Var = (vj0) this.f29413b;
                k61 k61Var2 = vj0Var.f33394n;
                if (k61Var2 != null) {
                    boolean z10 = k61Var2.z();
                    float o6 = ((float) vj0Var.f33394n.o()) / ((float) vj0Var.f33394n.q());
                    if (o6 < vj0Var.f33396s) {
                        vj0Var.f33394n.M(f10 * ((float) k61Var.q()), false);
                    } else if (o6 > vj0Var.v) {
                        vj0Var.setPlaying(false);
                        z10 = false;
                    }
                    if (z10) {
                        AndroidUtilities.runOnUIThread(vj0Var.f33398x, 16L);
                    }
                }
                vj0Var.invalidate();
                return;
            case 19:
                wk0 wk0Var = (wk0) this.f29413b;
                wk0Var.R1 = null;
                wk0Var.Q1 = null;
                org.telegram.ui.Cells.z zVar = wk0Var.f34287z1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = wk0Var.f34287z1;
                if (zVar2 != null && zVar2.isStateful()) {
                    wk0Var.f34287z1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                gm0 gm0Var = (gm0) this.f29413b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i9 = gm0Var.d;
                FileLoader.getInstance(i9).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(i9).getRecentLoadingFiles(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (FileLoader.getInstance(i9).getPathToMessage(arrayList.get(i10).messageOwner).exists()) {
                        arrayList3.add(arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (!FileLoader.getInstance(i9).getPathToMessage(arrayList2.get(i11).messageOwner).exists()) {
                        arrayList4.add(arrayList2.get(i11));
                    }
                }
                AndroidUtilities.runOnUIThread(new ue0(gm0Var, arrayList3, arrayList4, 2));
                return;
            case 21:
                ((im0) this.f29413b).invalidateSelf();
                return;
            case 22:
                ((sm0) this.f29413b).f32522f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.mx) this.f29413b).s();
                return;
            case 24:
                ((x60) this.f29413b).s();
                return;
            case 25:
                ((pn0) this.f29413b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((rn0) this.f29413b).f32220n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 27:
                tn0 tn0Var = (tn0) this.f29413b;
                tn0Var.f32765q = false;
                tn0Var.f32752b.run();
                return;
            case 28:
                ((rp0) ((bh.f) this.f29413b).f2025b).a1(1);
                return;
            default:
                wp0 wp0Var = (wp0) this.f29413b;
                up0[] up0VarArr = wp0Var.f34305a;
                if (wp0Var.f34306b != 1) {
                    for (up0 up0Var : up0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = up0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        up0Var.f33109e.setAlpha(0.0f);
                    }
                    wp0Var.A = false;
                    AndroidUtilities.runOnUIThread(wp0Var.C, 4000L);
                    return;
                }
                wp0Var.A = !wp0Var.A;
                for (up0 up0Var2 : up0VarArr) {
                    org.telegram.ui.ActionBar.h5 h5Var2 = up0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = up0Var2.f33109e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (wp0Var.A) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(wp0Var.C, 4000L);
                return;
        }
    }
}
