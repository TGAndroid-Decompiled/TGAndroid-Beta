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
    public final int f25965a;
    public final Object f25966b;

    public lc0(Object obj, int i10) {
        this.f25965a = i10;
        this.f25966b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25965a) {
            case 0:
                ((nc0) this.f25966b).a();
                return;
            case 1:
                ((pc0) this.f25966b).z();
                return;
            case 2:
                ((ci.u) this.f25966b).invalidateSelf();
                return;
            case 3:
                ((xc0) this.f25966b).invalidateSelf();
                return;
            case 4:
                ((rd0) this.f25966b).d();
                return;
            case 5:
                ae0 ae0Var = (ae0) this.f25966b;
                ae0Var.getClass();
                try {
                    ae0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((ne0) this.f25966b).f26692f.start();
                return;
            case 7:
                yz yzVar = ((rf0) this.f25966b).f27981c.f29917l0;
                if (yzVar != null) {
                    yzVar.e(false, true, false);
                    return;
                }
                return;
            case 8:
                uf0 uf0Var = (uf0) this.f25966b;
                uf0Var.f28850r = false;
                uf0Var.invalidate();
                return;
            case 9:
                ((xf0) this.f25966b).h = null;
                return;
            case 10:
                xf0 xf0Var = (xf0) ((n7.z0) this.f25966b).f15427c;
                xf0Var.d.L(xf0Var.e, false);
                return;
            case 11:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.f25966b;
                if (au0Var.f23637x) {
                    au0Var.h("pollPosition();");
                }
                if (au0Var.G) {
                    AndroidUtilities.runOnUIThread(au0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f25966b).invalidate();
                return;
            case 13:
                rg0 rg0Var = (rg0) ((lg.b) this.f25966b).f14280b;
                rg0Var.d.invalidate();
                rg0Var.e.requestLayout();
                return;
            case 14:
                ((tg0) this.f25966b).f();
                return;
            case 15:
                try {
                    si0 si0Var = ((ri0) this.f25966b).f28030b;
                    if (si0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) si0Var.getParent()).removeView(si0Var);
                    }
                    si0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.f25966b).d();
                return;
            case 17:
                tk0 tk0Var = (tk0) this.f25966b;
                tk0Var.f28593x0 = null;
                tk0Var.j();
                sk0 sk0Var = tk0Var.f28568g0;
                if (sk0Var != null) {
                    sk0Var.n();
                    return;
                }
                return;
            case 18:
                ((qk0) this.f25966b).H.f28050a.setVisibility(4);
                return;
            case 19:
                uk0 uk0Var = (uk0) this.f25966b;
                v71 v71Var = uk0Var.f28881n;
                if (v71Var != null) {
                    boolean y3 = v71Var.y();
                    float n10 = ((float) uk0Var.f28881n.n()) / ((float) uk0Var.f28881n.p());
                    float f7 = uk0Var.f28883s;
                    if (n10 < f7) {
                        v71 v71Var2 = uk0Var.f28881n;
                        v71Var2.L(f7 * ((float) v71Var2.p()), false);
                    } else if (n10 > uk0Var.v) {
                        uk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(uk0Var.f28885x, 16L);
                    }
                }
                uk0Var.invalidate();
                return;
            case 20:
                zl0 zl0Var = (zl0) this.f25966b;
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
                ln0 ln0Var = (ln0) this.f25966b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = ln0Var.d;
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
                AndroidUtilities.runOnUIThread(new fn0((Object) ln0Var, (Object) arrayList3, (Object) arrayList4, 0));
                return;
            case 22:
                ((nn0) this.f25966b).invalidateSelf();
                return;
            case 23:
                ((xn0) this.f25966b).f30429f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.zx) this.f25966b).s();
                return;
            case 25:
                ((b80) this.f25966b).s();
                return;
            case 26:
                ((vo0) this.f25966b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((yo0) this.f25966b).f30761n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                ap0 ap0Var = (ap0) this.f25966b;
                ap0Var.f22679q = false;
                ap0Var.f22667b.run();
                return;
            default:
                ((xq0) ((ci.i2) this.f25966b).f4780b).a1(1);
                return;
        }
    }
}
