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
public final class ic0 implements Runnable {
    public final int f24984a;
    public final Object f24985b;

    public ic0(Object obj, int i10) {
        this.f24984a = i10;
        this.f24985b = obj;
    }

    @Override
    public final void run() {
        switch (this.f24984a) {
            case 0:
                ((kc0) this.f24985b).a();
                return;
            case 1:
                ((mc0) this.f24985b).z();
                return;
            case 2:
                ((ci.u) this.f24985b).invalidateSelf();
                return;
            case 3:
                ((uc0) this.f24985b).invalidateSelf();
                return;
            case 4:
                ((od0) this.f24985b).d();
                return;
            case 5:
                xd0 xd0Var = (xd0) this.f24985b;
                xd0Var.getClass();
                try {
                    xd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((ke0) this.f24985b).f25750f.start();
                return;
            case 7:
                wz wzVar = ((of0) this.f24985b).f27039c.f28490l0;
                if (wzVar != null) {
                    wzVar.e(false, true, false);
                    return;
                }
                return;
            case 8:
                rf0 rf0Var = (rf0) this.f24985b;
                rf0Var.f27955r = false;
                rf0Var.invalidate();
                return;
            case 9:
                ((uf0) this.f24985b).h = null;
                return;
            case 10:
                uf0 uf0Var = (uf0) ((n7.z0) this.f24985b).f15396c;
                uf0Var.d.L(uf0Var.e, false);
                return;
            case 11:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.f24985b;
                if (au0Var.f22665x) {
                    au0Var.h("pollPosition();");
                }
                if (au0Var.G) {
                    AndroidUtilities.runOnUIThread(au0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f24985b).invalidate();
                return;
            case 13:
                og0 og0Var = (og0) ((lg.b) this.f24985b).f14249b;
                og0Var.d.invalidate();
                og0Var.e.requestLayout();
                return;
            case 14:
                ((qg0) this.f24985b).f();
                return;
            case 15:
                try {
                    pi0 pi0Var = ((oi0) this.f24985b).f27087b;
                    if (pi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) pi0Var.getParent()).removeView(pi0Var);
                    }
                    pi0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.f24985b).d();
                return;
            case 17:
                qk0 qk0Var = (qk0) this.f24985b;
                qk0Var.f27687x0 = null;
                qk0Var.j();
                pk0 pk0Var = qk0Var.f27662g0;
                if (pk0Var != null) {
                    pk0Var.n();
                    return;
                }
                return;
            case 18:
                ((nk0) this.f24985b).H.f27098a.setVisibility(4);
                return;
            case 19:
                rk0 rk0Var = (rk0) this.f24985b;
                s71 s71Var = rk0Var.f27981n;
                if (s71Var != null) {
                    boolean y3 = s71Var.y();
                    float n10 = ((float) rk0Var.f27981n.n()) / ((float) rk0Var.f27981n.p());
                    float f7 = rk0Var.f27983s;
                    if (n10 < f7) {
                        s71 s71Var2 = rk0Var.f27981n;
                        s71Var2.L(f7 * ((float) s71Var2.p()), false);
                    } else if (n10 > rk0Var.v) {
                        rk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(rk0Var.f27985x, 16L);
                    }
                }
                rk0Var.invalidate();
                return;
            case 20:
                wl0 wl0Var = (wl0) this.f24985b;
                wl0Var.V1 = null;
                wl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = wl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = wl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    wl0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                in0 in0Var = (in0) this.f24985b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = in0Var.d;
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
                AndroidUtilities.runOnUIThread(new cn0((Object) in0Var, (Object) arrayList3, (Object) arrayList4, 0));
                return;
            case 22:
                ((kn0) this.f24985b).invalidateSelf();
                return;
            case 23:
                ((un0) this.f24985b).f28831f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.zx) this.f24985b).s();
                return;
            case 25:
                ((y70) this.f24985b).s();
                return;
            case 26:
                ((so0) this.f24985b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((vo0) this.f24985b).f29232n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                xo0 xo0Var = (xo0) this.f24985b;
                xo0Var.f30369q = false;
                xo0Var.f30357b.run();
                return;
            default:
                ((uq0) ((ci.i2) this.f24985b).f4772b).a1(1);
                return;
        }
    }
}
