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
public final class lc0 implements Runnable {
    public final int f28440a;
    public final Object f28441b;

    public lc0(Object obj, int i10) {
        this.f28440a = i10;
        this.f28441b = obj;
    }

    @Override
    public final void run() {
        switch (this.f28440a) {
            case 0:
                ((nc0) this.f28441b).a();
                return;
            case 1:
                ((pc0) this.f28441b).z();
                return;
            case 2:
                ((ci.u) this.f28441b).invalidateSelf();
                return;
            case 3:
                ((wc0) this.f28441b).invalidateSelf();
                return;
            case 4:
                ((qd0) this.f28441b).d();
                return;
            case 5:
                zd0 zd0Var = (zd0) this.f28441b;
                zd0Var.getClass();
                try {
                    zd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((me0) this.f28441b).f28684f.start();
                return;
            case 7:
                yz yzVar = ((qf0) this.f28441b).f30046c.f31732l0;
                if (yzVar != null) {
                    yzVar.e(false, true, false);
                    return;
                }
                return;
            case 8:
                tf0 tf0Var = (tf0) this.f28441b;
                tf0Var.f31132r = false;
                tf0Var.invalidate();
                return;
            case 9:
                ((wf0) this.f28441b).h = null;
                return;
            case 10:
                wf0 wf0Var = (wf0) ((n7.z0) this.f28441b).f16857c;
                wf0Var.d.L(wf0Var.f32616e, false);
                return;
            case 11:
                org.telegram.ui.du0 du0Var = (org.telegram.ui.du0) this.f28441b;
                if (du0Var.f25784x) {
                    du0Var.h("pollPosition();");
                }
                if (du0Var.G) {
                    AndroidUtilities.runOnUIThread(du0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f28441b).invalidate();
                return;
            case 13:
                rg0 rg0Var = (rg0) ((lg.b) this.f28441b).f15510b;
                rg0Var.d.invalidate();
                rg0Var.f30474e.requestLayout();
                return;
            case 14:
                ((tg0) this.f28441b).f();
                return;
            case 15:
                try {
                    ri0 ri0Var = ((qi0) this.f28441b).f30073b;
                    if (ri0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ri0Var.getParent()).removeView(ri0Var);
                    }
                    ri0Var.Q.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 16:
                ((RLottieNative) this.f28441b).d();
                return;
            case 17:
                sk0 sk0Var = (sk0) this.f28441b;
                sk0Var.f30858x0 = null;
                sk0Var.j();
                rk0 rk0Var = sk0Var.f30833g0;
                if (rk0Var != null) {
                    rk0Var.I();
                    return;
                }
                return;
            case 18:
                ((pk0) this.f28441b).H.f30085a.setVisibility(4);
                return;
            case 19:
                tk0 tk0Var = (tk0) this.f28441b;
                e81 e81Var = tk0Var.f31174n;
                if (e81Var != null) {
                    boolean y3 = e81Var.y();
                    float n10 = ((float) tk0Var.f31174n.n()) / ((float) tk0Var.f31174n.p());
                    float f7 = tk0Var.f31176s;
                    if (n10 < f7) {
                        e81 e81Var2 = tk0Var.f31174n;
                        e81Var2.L(f7 * ((float) e81Var2.p()), false);
                    } else if (n10 > tk0Var.v) {
                        tk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(tk0Var.f31178x, 16L);
                    }
                }
                tk0Var.invalidate();
                return;
            case 20:
                zl0 zl0Var = (zl0) this.f28441b;
                zl0Var.V1 = null;
                zl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = zl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = zl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    zl0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                on0 on0Var = (on0) this.f28441b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = on0Var.d;
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
                AndroidUtilities.runOnUIThread(new in0((Object) on0Var, (Object) arrayList3, (Object) arrayList4, 0));
                return;
            case 22:
                ((qn0) this.f28441b).invalidateSelf();
                return;
            case 23:
                ((ao0) this.f28441b).f24685f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.dy) this.f28441b).s();
                return;
            case 25:
                ((b80) this.f28441b).s();
                return;
            case 26:
                ((so0) this.f28441b).setOverscrolling(false);
                return;
            case 27:
                ((zo0) this.f28441b).getClass();
                return;
            case 28:
                org.telegram.ui.Cells.u1 u1Var = ((cp0) this.f28441b).f25489n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            default:
                ep0 ep0Var = (ep0) this.f28441b;
                ep0Var.f26190q = false;
                ep0Var.f26177b.run();
                return;
        }
    }
}
