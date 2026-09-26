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
    public final int f25381a;
    public final Object f25382b;

    public jc0(Object obj, int i10) {
        this.f25381a = i10;
        this.f25382b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25381a) {
            case 0:
                ((lc0) this.f25382b).a();
                return;
            case 1:
                ((nc0) this.f25382b).z();
                return;
            case 2:
                ((ci.u) this.f25382b).invalidateSelf();
                return;
            case 3:
                ((vc0) this.f25382b).invalidateSelf();
                return;
            case 4:
                ((pd0) this.f25382b).d();
                return;
            case 5:
                yd0 yd0Var = (yd0) this.f25382b;
                yd0Var.getClass();
                try {
                    yd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((le0) this.f25382b).f26061f.start();
                return;
            case 7:
                xz xzVar = ((pf0) this.f25382b).f27348c.f28785l0;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
            case 8:
                sf0 sf0Var = (sf0) this.f25382b;
                sf0Var.f28265r = false;
                sf0Var.invalidate();
                return;
            case 9:
                ((vf0) this.f25382b).h = null;
                return;
            case 10:
                vf0 vf0Var = (vf0) ((n7.z0) this.f25382b).f15411c;
                vf0Var.d.L(vf0Var.e, false);
                return;
            case 11:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.f25382b;
                if (au0Var.f23012x) {
                    au0Var.h("pollPosition();");
                }
                if (au0Var.G) {
                    AndroidUtilities.runOnUIThread(au0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f25382b).invalidate();
                return;
            case 13:
                pg0 pg0Var = (pg0) ((lg.b) this.f25382b).f14264b;
                pg0Var.d.invalidate();
                pg0Var.e.requestLayout();
                return;
            case 14:
                ((rg0) this.f25382b).f();
                return;
            case 15:
                try {
                    qi0 qi0Var = ((pi0) this.f25382b).f27396b;
                    if (qi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) qi0Var.getParent()).removeView(qi0Var);
                    }
                    qi0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.f25382b).d();
                return;
            case 17:
                rk0 rk0Var = (rk0) this.f25382b;
                rk0Var.f27989x0 = null;
                rk0Var.j();
                qk0 qk0Var = rk0Var.f27964g0;
                if (qk0Var != null) {
                    qk0Var.n();
                    return;
                }
                return;
            case 18:
                ((ok0) this.f25382b).H.f27407a.setVisibility(4);
                return;
            case 19:
                sk0 sk0Var = (sk0) this.f25382b;
                t71 t71Var = sk0Var.f28298n;
                if (t71Var != null) {
                    boolean y3 = t71Var.y();
                    float n10 = ((float) sk0Var.f28298n.n()) / ((float) sk0Var.f28298n.p());
                    float f7 = sk0Var.f28300s;
                    if (n10 < f7) {
                        t71 t71Var2 = sk0Var.f28298n;
                        t71Var2.L(f7 * ((float) t71Var2.p()), false);
                    } else if (n10 > sk0Var.v) {
                        sk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(sk0Var.f28302x, 16L);
                    }
                }
                sk0Var.invalidate();
                return;
            case 20:
                xl0 xl0Var = (xl0) this.f25382b;
                xl0Var.V1 = null;
                xl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = xl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = xl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    xl0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                jn0 jn0Var = (jn0) this.f25382b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = jn0Var.d;
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
                AndroidUtilities.runOnUIThread(new dn0((Object) jn0Var, (Object) arrayList3, (Object) arrayList4, 0));
                return;
            case 22:
                ((ln0) this.f25382b).invalidateSelf();
                return;
            case 23:
                ((vn0) this.f25382b).f29155f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.zx) this.f25382b).s();
                return;
            case 25:
                ((z70) this.f25382b).s();
                return;
            case 26:
                ((to0) this.f25382b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((wo0) this.f25382b).f30164n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                yo0 yo0Var = (yo0) this.f25382b;
                yo0Var.f30678q = false;
                yo0Var.f30666b.run();
                return;
            default:
                ((vq0) ((ci.i2) this.f25382b).f4772b).a1(1);
                return;
        }
    }
}
