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
public final class bc0 implements Runnable {
    public final int f22702a;
    public final Object f22703b;

    public bc0(Object obj, int i10) {
        this.f22702a = i10;
        this.f22703b = obj;
    }

    @Override
    public final void run() {
        float f7;
        h71 h71Var;
        switch (this.f22702a) {
            case 0:
                ((cc0) this.f22703b).z();
                return;
            case 1:
                ((ci.u) this.f22703b).invalidateSelf();
                return;
            case 2:
                ((kc0) this.f22703b).invalidateSelf();
                return;
            case 3:
                ((dd0) this.f22703b).d();
                return;
            case 4:
                nd0 nd0Var = (nd0) this.f22703b;
                nd0Var.getClass();
                try {
                    nd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ae0) this.f22703b).f22393f.start();
                return;
            case 6:
                vz vzVar = ((ef0) this.f22703b).f23552c.f25250l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                hf0 hf0Var = (hf0) this.f22703b;
                hf0Var.f24658r = false;
                hf0Var.invalidate();
                return;
            case 8:
                ((kf0) this.f22703b).h = null;
                return;
            case 9:
                kf0 kf0Var = (kf0) ((n7.a1) this.f22703b).f15119c;
                kf0Var.d.L(kf0Var.e, false);
                return;
            case 10:
                org.telegram.ui.ku0 ku0Var = (org.telegram.ui.ku0) this.f22703b;
                if (ku0Var.f27289x) {
                    ku0Var.h("pollPosition();");
                }
                if (ku0Var.G) {
                    AndroidUtilities.runOnUIThread(ku0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f22703b).invalidate();
                return;
            case 12:
                fg0 fg0Var = (fg0) ((lg.b) this.f22703b).f14051b;
                fg0Var.d.invalidate();
                fg0Var.e.requestLayout();
                return;
            case 13:
                ((hg0) this.f22703b).f();
                return;
            case 14:
                try {
                    fi0 fi0Var = ((ei0) this.f22703b).f23576b;
                    if (fi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fi0Var.getParent()).removeView(fi0Var);
                    }
                    fi0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.f22703b).d();
                return;
            case 16:
                gk0 gk0Var = (gk0) this.f22703b;
                gk0Var.f24309x0 = null;
                gk0Var.j();
                fk0 fk0Var = gk0Var.f24284g0;
                if (fk0Var != null) {
                    fk0Var.o();
                    return;
                }
                return;
            case 17:
                ((dk0) this.f22703b).H.f23583a.setVisibility(4);
                return;
            case 18:
                hk0 hk0Var = (hk0) this.f22703b;
                h71 h71Var2 = hk0Var.f24687n;
                if (h71Var2 != null) {
                    boolean y3 = h71Var2.y();
                    float n10 = ((float) hk0Var.f24687n.n()) / ((float) hk0Var.f24687n.p());
                    if (n10 < hk0Var.f24689s) {
                        hk0Var.f24687n.L(f7 * ((float) h71Var.p()), false);
                    } else if (n10 > hk0Var.v) {
                        hk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hk0Var.f24691x, 16L);
                    }
                }
                hk0Var.invalidate();
                return;
            case 19:
                ml0 ml0Var = (ml0) this.f22703b;
                ml0Var.V1 = null;
                ml0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = ml0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = ml0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    ml0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                wm0 wm0Var = (wm0) this.f22703b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = wm0Var.d;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(wm0Var, arrayList3, arrayList4, 27));
                return;
            case 21:
                ((ym0) this.f22703b).invalidateSelf();
                return;
            case 22:
                ((jn0) this.f22703b).f25361f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.gy) this.f22703b).s();
                return;
            case 24:
                ((n70) this.f22703b).s();
                return;
            case 25:
                ((go0) this.f22703b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((jo0) this.f22703b).f25388n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 27:
                lo0 lo0Var = (lo0) this.f22703b;
                lo0Var.f25950q = false;
                lo0Var.f25938b.run();
                return;
            case 28:
                ((iq0) ((ci.i2) this.f22703b).f4782b).a1(1);
                return;
            default:
                nq0 nq0Var = (nq0) this.f22703b;
                lq0[] lq0VarArr = nq0Var.f26517a;
                if (nq0Var.f26518b != 1) {
                    for (lq0 lq0Var : lq0VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var = lq0Var.d;
                        k5Var.setAlpha(1.0f);
                        k5Var.setScaleX(1.0f);
                        k5Var.setScaleY(1.0f);
                        lq0Var.e.setAlpha(0.0f);
                    }
                    nq0Var.E = false;
                    AndroidUtilities.runOnUIThread(nq0Var.G, 4000L);
                    return;
                }
                nq0Var.E = !nq0Var.E;
                for (lq0 lq0Var2 : lq0VarArr) {
                    org.telegram.ui.ActionBar.k5 k5Var2 = lq0Var2.d;
                    org.telegram.ui.ActionBar.k5 k5Var3 = lq0Var2.e;
                    k5Var2.setPivotX(0.0f);
                    k5Var3.setPivotX(0.0f);
                    if (nq0Var.E) {
                        k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        k5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        k5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(nq0Var.G, 4000L);
                return;
        }
    }
}
