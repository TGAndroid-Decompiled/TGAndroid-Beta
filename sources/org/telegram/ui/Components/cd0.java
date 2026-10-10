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
public final class cd0 implements Runnable {
    public final int f25269a;
    public final Object f25270b;

    public cd0(Object obj, int i10) {
        this.f25269a = i10;
        this.f25270b = obj;
    }

    @Override
    public final void run() {
        float f7;
        l81 l81Var;
        switch (this.f25269a) {
            case 0:
                ((dd0) this.f25270b).z();
                return;
            case 1:
                ((ci.u) this.f25270b).invalidateSelf();
                return;
            case 2:
                ((ld0) this.f25270b).invalidateSelf();
                return;
            case 3:
                ((fe0) this.f25270b).d();
                return;
            case 4:
                pe0 pe0Var = (pe0) this.f25270b;
                pe0Var.getClass();
                try {
                    pe0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((df0) this.f25270b).f25687f.start();
                return;
            case 6:
                m00 m00Var = ((hg0) this.f25270b).f27006c.f28796l0;
                if (m00Var != null) {
                    m00Var.e(false, true, false);
                    return;
                }
                return;
            case 7:
                kg0 kg0Var = (kg0) this.f25270b;
                kg0Var.f28021r = false;
                kg0Var.invalidate();
                return;
            case 8:
                ((ng0) this.f25270b).h = null;
                return;
            case 9:
                ng0 ng0Var = (ng0) ((org.telegram.ui.ActionBar.b5) this.f25270b).f20466c;
                ng0Var.d.L(ng0Var.f29118e, false);
                return;
            case 10:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) this.f25270b;
                if (ju0Var.f31129x) {
                    ju0Var.h("pollPosition();");
                }
                if (ju0Var.G) {
                    AndroidUtilities.runOnUIThread(ju0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f25270b).invalidate();
                return;
            case 12:
                hh0 hh0Var = (hh0) ((lg.b) this.f25270b).f15510b;
                hh0Var.d.invalidate();
                hh0Var.f27019e.requestLayout();
                return;
            case 13:
                ((jh0) this.f25270b).f();
                return;
            case 14:
                try {
                    kj0 kj0Var = ((jj0) this.f25270b).f27709b;
                    if (kj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) kj0Var.getParent()).removeView(kj0Var);
                    }
                    kj0Var.Q.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 15:
                ((RLottieNative) this.f25270b).d();
                return;
            case 16:
                ll0 ll0Var = (ll0) this.f25270b;
                ll0Var.f28421x0 = null;
                ll0Var.j();
                kl0 kl0Var = ll0Var.f28396g0;
                if (kl0Var != null) {
                    kl0Var.s();
                    return;
                }
                return;
            case 17:
                ((il0) this.f25270b).H.f27717a.setVisibility(4);
                return;
            case 18:
                ml0 ml0Var = (ml0) this.f25270b;
                l81 l81Var2 = ml0Var.f28841n;
                if (l81Var2 != null) {
                    boolean y3 = l81Var2.y();
                    float n10 = ((float) ml0Var.f28841n.n()) / ((float) ml0Var.f28841n.p());
                    if (n10 < ml0Var.f28843s) {
                        ml0Var.f28841n.L(f7 * ((float) l81Var.p()), false);
                    } else if (n10 > ml0Var.v) {
                        ml0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(ml0Var.f28845x, 16L);
                    }
                }
                ml0Var.invalidate();
                return;
            case 19:
                rm0 rm0Var = (rm0) this.f25270b;
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
            case 20:
                co0 co0Var = (co0) this.f25270b;
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
                AndroidUtilities.runOnUIThread(new cf0(co0Var, arrayList3, arrayList4, 3));
                return;
            case 21:
                ((eo0) this.f25270b).invalidateSelf();
                return;
            case 22:
                ((oo0) this.f25270b).f29537f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.dy) this.f25270b).s();
                return;
            case 24:
                ((q80) this.f25270b).s();
                return;
            case 25:
                ((lp0) this.f25270b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((op0) this.f25270b).f29557n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 27:
                qp0 qp0Var = (qp0) this.f25270b;
                qp0Var.f30256q = false;
                qp0Var.f30243b.run();
                return;
            case 28:
                ((nr0) ((ci.h2) this.f25270b).f5156b).b1(1);
                return;
            default:
                sr0 sr0Var = (sr0) this.f25270b;
                qr0[] qr0VarArr = sr0Var.f30839a;
                if (sr0Var.f30840b != 1) {
                    for (qr0 qr0Var : qr0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = qr0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        qr0Var.f30280e.setAlpha(0.0f);
                    }
                    sr0Var.E = false;
                    AndroidUtilities.runOnUIThread(sr0Var.G, 4000L);
                    return;
                }
                sr0Var.E = !sr0Var.E;
                for (qr0 qr0Var2 : qr0VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = qr0Var2.d;
                    org.telegram.ui.ActionBar.j5 j5Var3 = qr0Var2.f30280e;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (sr0Var.E) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(sr0Var.G, 4000L);
                return;
        }
    }
}
