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
public final class rc0 implements Runnable {
    public final int f29916a;
    public final Object f29917b;

    public rc0(Object obj, int i10) {
        this.f29916a = i10;
        this.f29917b = obj;
    }

    @Override
    public final void run() {
        float f7;
        c81 c81Var;
        switch (this.f29916a) {
            case 0:
                ((tc0) this.f29917b).a();
                return;
            case 1:
                ((ei.u) this.f29917b).invalidateSelf();
                return;
            case 2:
                ((ed0) this.f29917b).invalidateSelf();
                return;
            case 3:
                ((xd0) this.f29917b).d();
                return;
            case 4:
                ge0 ge0Var = (ge0) this.f29917b;
                ge0Var.getClass();
                try {
                    ge0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ue0) this.f29917b).f30908f.start();
                return;
            case 6:
                e00 e00Var = ((yf0) this.f29917b).f32644c.f25479l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 7:
                bg0 bg0Var = (bg0) this.f29917b;
                bg0Var.f24937r = false;
                bg0Var.invalidate();
                return;
            case 8:
                ((eg0) this.f29917b).h = null;
                return;
            case 9:
                eg0 eg0Var = (eg0) ((mi.q) this.f29917b).f16974c;
                eg0Var.d.L(eg0Var.e, false);
                return;
            case 10:
                org.telegram.ui.ot0 ot0Var = (org.telegram.ui.ot0) this.f29917b;
                if (ot0Var.f28159x) {
                    ot0Var.h("pollPosition();");
                }
                if (ot0Var.G) {
                    AndroidUtilities.runOnUIThread(ot0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f29917b).invalidate();
                return;
            case 12:
                ah0 ah0Var = (ah0) ((mg.b) this.f29917b).f16858b;
                ah0Var.d.invalidate();
                ah0Var.e.requestLayout();
                return;
            case 13:
                ((ch0) this.f29917b).f();
                return;
            case 14:
                try {
                    bj0 bj0Var = ((aj0) this.f29917b).f24629b;
                    if (bj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) bj0Var.getParent()).removeView(bj0Var);
                    }
                    bj0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.f29917b).d();
                return;
            case 16:
                dl0 dl0Var = (dl0) this.f29917b;
                dl0Var.f25563x0 = null;
                dl0Var.j();
                cl0 cl0Var = dl0Var.f25538g0;
                if (cl0Var != null) {
                    cl0Var.v();
                    return;
                }
                return;
            case 17:
                ((al0) this.f29917b).H.f24975a.setVisibility(4);
                return;
            case 18:
                el0 el0Var = (el0) this.f29917b;
                c81 c81Var2 = el0Var.f25924n;
                if (c81Var2 != null) {
                    boolean y3 = c81Var2.y();
                    float n10 = ((float) el0Var.f25924n.n()) / ((float) el0Var.f25924n.p());
                    if (n10 < el0Var.f25926s) {
                        el0Var.f25924n.L(f7 * ((float) c81Var.p()), false);
                    } else if (n10 > el0Var.v) {
                        el0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(el0Var.f25928x, 16L);
                    }
                }
                el0Var.invalidate();
                return;
            case 19:
                jm0 jm0Var = (jm0) this.f29917b;
                jm0Var.T1 = null;
                jm0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = jm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = jm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    jm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                un0 un0Var = (un0) this.f29917b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = un0Var.d;
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
                AndroidUtilities.runOnUIThread(new lg((Object) un0Var, (Object) arrayList3, (Object) arrayList4, 18));
                return;
            case 21:
                ((wn0) this.f29917b).invalidateSelf();
                return;
            case 22:
                ((go0) this.f29917b).f26617f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.lx) this.f29917b).s();
                return;
            case 24:
                ((i80) this.f29917b).s();
                return;
            case 25:
                ((dp0) this.f29917b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((gp0) this.f29917b).f26636n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 27:
                hp0 hp0Var = (hp0) this.f29917b;
                hp0Var.f26971q = false;
                hp0Var.f26959b.run();
                return;
            case 28:
                ((fr0) ((ai.u) this.f29917b).f2236b).c1(1);
                return;
            default:
                kr0 kr0Var = (kr0) this.f29917b;
                ir0[] ir0VarArr = kr0Var.f27925a;
                if (kr0Var.f27926b != 1) {
                    for (ir0 ir0Var : ir0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = ir0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        ir0Var.e.setAlpha(0.0f);
                    }
                    kr0Var.E = false;
                    AndroidUtilities.runOnUIThread(kr0Var.G, 4000L);
                    return;
                }
                kr0Var.E = !kr0Var.E;
                for (ir0 ir0Var2 : ir0VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = ir0Var2.d;
                    org.telegram.ui.ActionBar.j5 j5Var3 = ir0Var2.e;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (kr0Var.E) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(kr0Var.G, 4000L);
                return;
        }
    }
}
