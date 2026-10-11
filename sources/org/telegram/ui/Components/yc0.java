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
    public final int f33227a;
    public final Object f33228b;

    public yc0(Object obj, int i10) {
        this.f33227a = i10;
        this.f33228b = obj;
    }

    @Override
    public final void run() {
        float f7;
        l81 l81Var;
        switch (this.f33227a) {
            case 0:
                ((ad0) this.f33228b).a();
                return;
            case 1:
                ((cd0) this.f33228b).z();
                return;
            case 2:
                ((ci.u) this.f33228b).invalidateSelf();
                return;
            case 3:
                ((kd0) this.f33228b).invalidateSelf();
                return;
            case 4:
                ((fe0) this.f33228b).d();
                return;
            case 5:
                oe0 oe0Var = (oe0) this.f33228b;
                oe0Var.getClass();
                try {
                    oe0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((cf0) this.f33228b).f25338f.start();
                return;
            case 7:
                m00 m00Var = ((gg0) this.f33228b).f26745c.f28395l0;
                if (m00Var != null) {
                    m00Var.e(false, true, false);
                    return;
                }
                return;
            case 8:
                jg0 jg0Var = (jg0) this.f33228b;
                jg0Var.f27732r = false;
                jg0Var.invalidate();
                return;
            case 9:
                ((mg0) this.f33228b).h = null;
                return;
            case 10:
                mg0 mg0Var = (mg0) ((n7.z0) this.f33228b).f16906c;
                mg0Var.d.L(mg0Var.f28852e, false);
                return;
            case 11:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.f33228b;
                if (iu0Var.f31248x) {
                    iu0Var.h("pollPosition();");
                }
                if (iu0Var.G) {
                    AndroidUtilities.runOnUIThread(iu0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f33228b).invalidate();
                return;
            case 13:
                hh0 hh0Var = (hh0) ((lg.b) this.f33228b).f15545b;
                hh0Var.d.invalidate();
                hh0Var.f27109e.requestLayout();
                return;
            case 14:
                ((jh0) this.f33228b).f();
                return;
            case 15:
                try {
                    kj0 kj0Var = ((jj0) this.f33228b).f27768b;
                    if (kj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) kj0Var.getParent()).removeView(kj0Var);
                    }
                    kj0Var.Q.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 16:
                ((RLottieNative) this.f33228b).d();
                return;
            case 17:
                ll0 ll0Var = (ll0) this.f33228b;
                ll0Var.f28497x0 = null;
                ll0Var.j();
                kl0 kl0Var = ll0Var.f28472g0;
                if (kl0Var != null) {
                    kl0Var.s();
                    return;
                }
                return;
            case 18:
                ((il0) this.f33228b).H.f27776a.setVisibility(4);
                return;
            case 19:
                ml0 ml0Var = (ml0) this.f33228b;
                l81 l81Var2 = ml0Var.f28881n;
                if (l81Var2 != null) {
                    boolean y3 = l81Var2.y();
                    float n10 = ((float) ml0Var.f28881n.n()) / ((float) ml0Var.f28881n.p());
                    if (n10 < ml0Var.f28883s) {
                        ml0Var.f28881n.L(f7 * ((float) l81Var.p()), false);
                    } else if (n10 > ml0Var.v) {
                        ml0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(ml0Var.f28885x, 16L);
                    }
                }
                ml0Var.invalidate();
                return;
            case 20:
                rm0 rm0Var = (rm0) this.f33228b;
                rm0Var.T1 = null;
                rm0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = rm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = rm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    rm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                co0 co0Var = (co0) this.f33228b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = co0Var.d;
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
                AndroidUtilities.runOnUIThread(new bf0(co0Var, arrayList3, arrayList4, 3));
                return;
            case 22:
                ((eo0) this.f33228b).invalidateSelf();
                return;
            case 23:
                ((oo0) this.f33228b).f29569f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.cy) this.f33228b).s();
                return;
            case 25:
                ((p80) this.f33228b).s();
                return;
            case 26:
                ((lp0) this.f33228b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((op0) this.f33228b).f29589n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                qp0 qp0Var = (qp0) this.f33228b;
                qp0Var.f30290q = false;
                qp0Var.f30277b.run();
                return;
            default:
                ((nr0) ((ci.h2) this.f33228b).f5155b).b1(1);
                return;
        }
    }
}
