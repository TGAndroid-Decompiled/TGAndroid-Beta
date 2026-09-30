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
public final class kc0 implements Runnable {
    public final int f25673a;
    public final Object f25674b;

    public kc0(Object obj, int i10) {
        this.f25673a = i10;
        this.f25674b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25673a) {
            case 0:
                ((mc0) this.f25674b).a();
                return;
            case 1:
                ((oc0) this.f25674b).z();
                return;
            case 2:
                ((ci.u) this.f25674b).invalidateSelf();
                return;
            case 3:
                ((wc0) this.f25674b).invalidateSelf();
                return;
            case 4:
                ((qd0) this.f25674b).d();
                return;
            case 5:
                zd0 zd0Var = (zd0) this.f25674b;
                zd0Var.getClass();
                try {
                    zd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((me0) this.f25674b).f26405f.start();
                return;
            case 7:
                xz xzVar = ((qf0) this.f25674b).f27676c.f29061l0;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
            case 8:
                tf0 tf0Var = (tf0) this.f25674b;
                tf0Var.f28548r = false;
                tf0Var.invalidate();
                return;
            case 9:
                ((wf0) this.f25674b).h = null;
                return;
            case 10:
                wf0 wf0Var = (wf0) ((n7.z0) this.f25674b).f15412c;
                wf0Var.d.L(wf0Var.e, false);
                return;
            case 11:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.f25674b;
                if (au0Var.f23299x) {
                    au0Var.h("pollPosition();");
                }
                if (au0Var.G) {
                    AndroidUtilities.runOnUIThread(au0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f25674b).invalidate();
                return;
            case 13:
                qg0 qg0Var = (qg0) ((lg.b) this.f25674b).f14265b;
                qg0Var.d.invalidate();
                qg0Var.e.requestLayout();
                return;
            case 14:
                ((sg0) this.f25674b).f();
                return;
            case 15:
                try {
                    ri0 ri0Var = ((qi0) this.f25674b).f27725b;
                    if (ri0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ri0Var.getParent()).removeView(ri0Var);
                    }
                    ri0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.f25674b).d();
                return;
            case 17:
                sk0 sk0Var = (sk0) this.f25674b;
                sk0Var.f28303x0 = null;
                sk0Var.j();
                rk0 rk0Var = sk0Var.f28278g0;
                if (rk0Var != null) {
                    rk0Var.n();
                    return;
                }
                return;
            case 18:
                ((pk0) this.f25674b).H.f27745a.setVisibility(4);
                return;
            case 19:
                tk0 tk0Var = (tk0) this.f25674b;
                u71 u71Var = tk0Var.f28579n;
                if (u71Var != null) {
                    boolean y3 = u71Var.y();
                    float n10 = ((float) tk0Var.f28579n.n()) / ((float) tk0Var.f28579n.p());
                    float f7 = tk0Var.f28581s;
                    if (n10 < f7) {
                        u71 u71Var2 = tk0Var.f28579n;
                        u71Var2.L(f7 * ((float) u71Var2.p()), false);
                    } else if (n10 > tk0Var.v) {
                        tk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(tk0Var.f28583x, 16L);
                    }
                }
                tk0Var.invalidate();
                return;
            case 20:
                yl0 yl0Var = (yl0) this.f25674b;
                yl0Var.V1 = null;
                yl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = yl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = yl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    yl0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                kn0 kn0Var = (kn0) this.f25674b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = kn0Var.d;
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
                AndroidUtilities.runOnUIThread(new en0((Object) kn0Var, (Object) arrayList3, (Object) arrayList4, 0));
                return;
            case 22:
                ((mn0) this.f25674b).invalidateSelf();
                return;
            case 23:
                ((wn0) this.f25674b).f30093f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.zx) this.f25674b).s();
                return;
            case 25:
                ((a80) this.f25674b).s();
                return;
            case 26:
                ((uo0) this.f25674b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((xo0) this.f25674b).f30425n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                zo0 zo0Var = (zo0) this.f25674b;
                zo0Var.f30935q = false;
                zo0Var.f30923b.run();
                return;
            default:
                ((wq0) ((ci.i2) this.f25674b).f4772b).a1(1);
                return;
        }
    }
}
