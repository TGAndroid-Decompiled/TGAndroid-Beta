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
public final class jc0 implements Runnable {
    public final int f25451a;
    public final Object f25452b;

    public jc0(Object obj, int i10) {
        this.f25451a = i10;
        this.f25452b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25451a) {
            case 0:
                ((lc0) this.f25452b).a();
                return;
            case 1:
                ((nc0) this.f25452b).z();
                return;
            case 2:
                ((ci.u) this.f25452b).invalidateSelf();
                return;
            case 3:
                ((uc0) this.f25452b).invalidateSelf();
                return;
            case 4:
                ((od0) this.f25452b).d();
                return;
            case 5:
                xd0 xd0Var = (xd0) this.f25452b;
                xd0Var.getClass();
                try {
                    xd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((ke0) this.f25452b).f25712f.start();
                return;
            case 7:
                xz xzVar = ((of0) this.f25452b).f27087c.f28571l0;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
            case 8:
                rf0 rf0Var = (rf0) this.f25452b;
                rf0Var.f27969r = false;
                rf0Var.invalidate();
                return;
            case 9:
                ((uf0) this.f25452b).h = null;
                return;
            case 10:
                uf0 uf0Var = (uf0) ((n7.z0) this.f25452b).f15446c;
                uf0Var.d.L(uf0Var.e, false);
                return;
            case 11:
                org.telegram.ui.du0 du0Var = (org.telegram.ui.du0) this.f25452b;
                if (du0Var.f23018x) {
                    du0Var.h("pollPosition();");
                }
                if (du0Var.G) {
                    AndroidUtilities.runOnUIThread(du0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f25452b).invalidate();
                return;
            case 13:
                rg0 rg0Var = (rg0) ((lg.b) this.f25452b).f14266b;
                rg0Var.d.invalidate();
                rg0Var.e.requestLayout();
                return;
            case 14:
                ((tg0) this.f25452b).f();
                return;
            case 15:
                try {
                    ri0 ri0Var = ((qi0) this.f25452b).f27747b;
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
                ((RLottieNative) this.f25452b).d();
                return;
            case 17:
                sk0 sk0Var = (sk0) this.f25452b;
                sk0Var.f28323x0 = null;
                sk0Var.j();
                rk0 rk0Var = sk0Var.f28298g0;
                if (rk0Var != null) {
                    rk0Var.p();
                    return;
                }
                return;
            case 18:
                ((pk0) this.f25452b).H.f27767a.setVisibility(4);
                return;
            case 19:
                tk0 tk0Var = (tk0) this.f25452b;
                u71 u71Var = tk0Var.f28622n;
                if (u71Var != null) {
                    boolean y3 = u71Var.y();
                    float n10 = ((float) tk0Var.f28622n.n()) / ((float) tk0Var.f28622n.p());
                    float f7 = tk0Var.f28624s;
                    if (n10 < f7) {
                        u71 u71Var2 = tk0Var.f28622n;
                        u71Var2.L(f7 * ((float) u71Var2.p()), false);
                    } else if (n10 > tk0Var.v) {
                        tk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(tk0Var.f28626x, 16L);
                    }
                }
                tk0Var.invalidate();
                return;
            case 20:
                yl0 yl0Var = (yl0) this.f25452b;
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
                kn0 kn0Var = (kn0) this.f25452b;
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
                ((mn0) this.f25452b).invalidateSelf();
                return;
            case 23:
                ((wn0) this.f25452b).f30121f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.ay) this.f25452b).s();
                return;
            case 25:
                ((a80) this.f25452b).s();
                return;
            case 26:
                ((to0) this.f25452b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((wo0) this.f25452b).f30140n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                yo0 yo0Var = (yo0) this.f25452b;
                yo0Var.f30751q = false;
                yo0Var.f30739b.run();
                return;
            default:
                ((vq0) ((ci.i2) this.f25452b).f4774b).X0(1);
                return;
        }
    }
}
