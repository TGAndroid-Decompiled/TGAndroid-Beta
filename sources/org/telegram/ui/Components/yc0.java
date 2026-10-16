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
public final class yc0 implements Runnable {
    public final int f31219a;
    public final Object f31220b;

    public yc0(Object obj, int i10) {
        this.f31219a = i10;
        this.f31220b = obj;
    }

    @Override
    public final void run() {
        float f7;
        i81 i81Var;
        switch (this.f31219a) {
            case 0:
                ((ad0) this.f31220b).a();
                return;
            case 1:
                ((cd0) this.f31220b).z();
                return;
            case 2:
                ((di.u) this.f31220b).invalidateSelf();
                return;
            case 3:
                ((kd0) this.f31220b).invalidateSelf();
                return;
            case 4:
                ((de0) this.f31220b).d();
                return;
            case 5:
                me0 me0Var = (me0) this.f31220b;
                me0Var.getClass();
                try {
                    me0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((af0) this.f31220b).f23229f.start();
                return;
            case 7:
                h00 h00Var = ((eg0) this.f31220b).f24386c.f26009l0;
                if (h00Var != null) {
                    h00Var.d(false, true, false);
                    return;
                }
                return;
            case 8:
                hg0 hg0Var = (hg0) this.f31220b;
                hg0Var.f25308r = false;
                hg0Var.invalidate();
                return;
            case 9:
                ((kg0) this.f31220b).h = null;
                return;
            case 10:
                kg0 kg0Var = (kg0) ((m2.t) this.f31220b).f15111c;
                kg0Var.d.L(kg0Var.e, false);
                return;
            case 11:
                org.telegram.ui.ou0 ou0Var = (org.telegram.ui.ou0) this.f31220b;
                if (ou0Var.f28531x) {
                    ou0Var.h("pollPosition();");
                }
                if (ou0Var.G) {
                    AndroidUtilities.runOnUIThread(ou0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f31220b).invalidate();
                return;
            case 13:
                fh0 fh0Var = (fh0) ((mg.b) this.f31220b).f15500b;
                fh0Var.d.invalidate();
                fh0Var.e.requestLayout();
                return;
            case 14:
                ((hh0) this.f31220b).f();
                return;
            case 15:
                try {
                    fj0 fj0Var = ((ej0) this.f31220b).f24409b;
                    if (fj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fj0Var.getParent()).removeView(fj0Var);
                    }
                    fj0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.f31220b).d();
                return;
            case 17:
                gl0 gl0Var = (gl0) this.f31220b;
                gl0Var.f25047x0 = null;
                gl0Var.j();
                fl0 fl0Var = gl0Var.f25022g0;
                if (fl0Var != null) {
                    fl0Var.y();
                    return;
                }
                return;
            case 18:
                ((dl0) this.f31220b).H.f24416a.setVisibility(4);
                return;
            case 19:
                hl0 hl0Var = (hl0) this.f31220b;
                i81 i81Var2 = hl0Var.f25353n;
                if (i81Var2 != null) {
                    boolean y3 = i81Var2.y();
                    float n10 = ((float) hl0Var.f25353n.n()) / ((float) hl0Var.f25353n.p());
                    if (n10 < hl0Var.f25355s) {
                        hl0Var.f25353n.L(f7 * ((float) i81Var.p()), false);
                    } else if (n10 > hl0Var.v) {
                        hl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hl0Var.f25357x, 16L);
                    }
                }
                hl0Var.invalidate();
                return;
            case 20:
                mm0 mm0Var = (mm0) this.f31220b;
                mm0Var.T1 = null;
                mm0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = mm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = mm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    mm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                xn0 xn0Var = (xn0) this.f31220b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = xn0Var.d;
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
                AndroidUtilities.runOnUIThread(new ze0(xn0Var, arrayList3, arrayList4, 3));
                return;
            case 22:
                ((zn0) this.f31220b).invalidateSelf();
                return;
            case 23:
                ((ko0) this.f31220b).f26452f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.iy) this.f31220b).s();
                return;
            case 25:
                ((l80) this.f31220b).s();
                return;
            case 26:
                ((gp0) this.f31220b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((jp0) this.f31220b).f26108n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                lp0 lp0Var = (lp0) this.f31220b;
                lp0Var.f26793q = false;
                lp0Var.f26781b.run();
                return;
            default:
                ((ir0) ((di.h2) this.f31220b).f6993b).b1(1);
                return;
        }
    }
}
