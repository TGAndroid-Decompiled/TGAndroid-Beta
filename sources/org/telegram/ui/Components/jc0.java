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
    public final int f25353a;
    public final Object f25354b;

    public jc0(Object obj, int i10) {
        this.f25353a = i10;
        this.f25354b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25353a) {
            case 0:
                ((lc0) this.f25354b).a();
                return;
            case 1:
                ((nc0) this.f25354b).z();
                return;
            case 2:
                ((ci.u) this.f25354b).invalidateSelf();
                return;
            case 3:
                ((vc0) this.f25354b).invalidateSelf();
                return;
            case 4:
                ((pd0) this.f25354b).d();
                return;
            case 5:
                yd0 yd0Var = (yd0) this.f25354b;
                yd0Var.getClass();
                try {
                    yd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((le0) this.f25354b).f26089f.start();
                return;
            case 7:
                vz vzVar = ((pf0) this.f25354b).f27346c.f28738l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
            case 8:
                sf0 sf0Var = (sf0) this.f25354b;
                sf0Var.f28176r = false;
                sf0Var.invalidate();
                return;
            case 9:
                ((vf0) this.f25354b).h = null;
                return;
            case 10:
                vf0 vf0Var = (vf0) ((org.telegram.ui.Cells.f3) this.f25354b).f20285c;
                vf0Var.d.L(vf0Var.e, false);
                return;
            case 11:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.f25354b;
                if (iu0Var.f22991x) {
                    iu0Var.h("pollPosition();");
                }
                if (iu0Var.G) {
                    AndroidUtilities.runOnUIThread(iu0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f25354b).invalidate();
                return;
            case 13:
                rg0 rg0Var = (rg0) ((lg.b) this.f25354b).f14248b;
                rg0Var.d.invalidate();
                rg0Var.e.requestLayout();
                return;
            case 14:
                ((tg0) this.f25354b).f();
                return;
            case 15:
                try {
                    ri0 ri0Var = ((qi0) this.f25354b).f27579b;
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
                ((RLottieNative) this.f25354b).d();
                return;
            case 17:
                sk0 sk0Var = (sk0) this.f25354b;
                sk0Var.f28267x0 = null;
                sk0Var.j();
                rk0 rk0Var = sk0Var.f28242g0;
                if (rk0Var != null) {
                    rk0Var.o();
                    return;
                }
                return;
            case 18:
                ((pk0) this.f25354b).H.f27588a.setVisibility(4);
                return;
            case 19:
                tk0 tk0Var = (tk0) this.f25354b;
                v71 v71Var = tk0Var.f28489n;
                if (v71Var != null) {
                    boolean y3 = v71Var.y();
                    float n10 = ((float) tk0Var.f28489n.n()) / ((float) tk0Var.f28489n.p());
                    float f7 = tk0Var.f28491s;
                    if (n10 < f7) {
                        v71 v71Var2 = tk0Var.f28489n;
                        v71Var2.L(f7 * ((float) v71Var2.p()), false);
                    } else if (n10 > tk0Var.v) {
                        tk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(tk0Var.f28493x, 16L);
                    }
                }
                tk0Var.invalidate();
                return;
            case 20:
                yl0 yl0Var = (yl0) this.f25354b;
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
                kn0 kn0Var = (kn0) this.f25354b;
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
                ((mn0) this.f25354b).invalidateSelf();
                return;
            case 23:
                ((wn0) this.f25354b).f30077f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.ey) this.f25354b).s();
                return;
            case 25:
                ((y70) this.f25354b).s();
                return;
            case 26:
                ((uo0) this.f25354b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((xo0) this.f25354b).f30370n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                zo0 zo0Var = (zo0) this.f25354b;
                zo0Var.f30924q = false;
                zo0Var.f30912b.run();
                return;
            default:
                ((wq0) ((ci.i2) this.f25354b).f4781b).a1(1);
                return;
        }
    }
}
