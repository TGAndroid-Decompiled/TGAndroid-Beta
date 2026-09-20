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
    public final int f25338a;
    public final Object f25339b;

    public jc0(Object obj, int i10) {
        this.f25338a = i10;
        this.f25339b = obj;
    }

    @Override
    public final void run() {
        float f7;
        t71 t71Var;
        switch (this.f25338a) {
            case 0:
                ((kc0) this.f25339b).z();
                return;
            case 1:
                ((ci.u) this.f25339b).invalidateSelf();
                return;
            case 2:
                ((sc0) this.f25339b).invalidateSelf();
                return;
            case 3:
                ((md0) this.f25339b).d();
                return;
            case 4:
                vd0 vd0Var = (vd0) this.f25339b;
                vd0Var.getClass();
                try {
                    vd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ie0) this.f25339b).f25030f.start();
                return;
            case 6:
                vz vzVar = ((mf0) this.f25339b).f26398c.f27871l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                pf0 pf0Var = (pf0) this.f25339b;
                pf0Var.f27288r = false;
                pf0Var.invalidate();
                return;
            case 8:
                ((sf0) this.f25339b).h = null;
                return;
            case 9:
                sf0 sf0Var = (sf0) ((org.telegram.ui.Cells.f3) this.f25339b).f20270c;
                sf0Var.d.L(sf0Var.e, false);
                return;
            case 10:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.f25339b;
                if (iu0Var.f30521x) {
                    iu0Var.h("pollPosition();");
                }
                if (iu0Var.G) {
                    AndroidUtilities.runOnUIThread(iu0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f25339b).invalidate();
                return;
            case 12:
                og0 og0Var = (og0) ((lg.b) this.f25339b).f14233b;
                og0Var.d.invalidate();
                og0Var.e.requestLayout();
                return;
            case 13:
                ((qg0) this.f25339b).f();
                return;
            case 14:
                try {
                    oi0 oi0Var = ((ni0) this.f25339b).f26659b;
                    if (oi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) oi0Var.getParent()).removeView(oi0Var);
                    }
                    oi0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.f25339b).d();
                return;
            case 16:
                pk0 pk0Var = (pk0) this.f25339b;
                pk0Var.f27376x0 = null;
                pk0Var.j();
                ok0 ok0Var = pk0Var.f27351g0;
                if (ok0Var != null) {
                    ok0Var.o();
                    return;
                }
                return;
            case 17:
                ((mk0) this.f25339b).H.f26670a.setVisibility(4);
                return;
            case 18:
                qk0 qk0Var = (qk0) this.f25339b;
                t71 t71Var2 = qk0Var.f27597n;
                if (t71Var2 != null) {
                    boolean y3 = t71Var2.y();
                    float n10 = ((float) qk0Var.f27597n.n()) / ((float) qk0Var.f27597n.p());
                    if (n10 < qk0Var.f27599s) {
                        qk0Var.f27597n.L(f7 * ((float) t71Var.p()), false);
                    } else if (n10 > qk0Var.v) {
                        qk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(qk0Var.f27601x, 16L);
                    }
                }
                qk0Var.invalidate();
                return;
            case 19:
                vl0 vl0Var = (vl0) this.f25339b;
                vl0Var.V1 = null;
                vl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = vl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = vl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    vl0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                in0 in0Var = (in0) this.f25339b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = in0Var.d;
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
                AndroidUtilities.runOnUIThread(new cn0((Object) in0Var, (Object) arrayList3, (Object) arrayList4, 0));
                return;
            case 21:
                ((kn0) this.f25339b).invalidateSelf();
                return;
            case 22:
                ((un0) this.f25339b).f28779f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.ey) this.f25339b).s();
                return;
            case 24:
                ((v70) this.f25339b).s();
                return;
            case 25:
                ((so0) this.f25339b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((vo0) this.f25339b).f29252n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 27:
                xo0 xo0Var = (xo0) this.f25339b;
                xo0Var.f30326q = false;
                xo0Var.f30314b.run();
                return;
            case 28:
                ((uq0) ((ci.i2) this.f25339b).f4783b).a1(1);
                return;
            default:
                zq0 zq0Var = (zq0) this.f25339b;
                xq0[] xq0VarArr = zq0Var.f30901a;
                if (zq0Var.f30902b != 1) {
                    for (xq0 xq0Var : xq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = xq0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        xq0Var.e.setAlpha(0.0f);
                    }
                    zq0Var.E = false;
                    AndroidUtilities.runOnUIThread(zq0Var.G, 4000L);
                    return;
                }
                zq0Var.E = !zq0Var.E;
                for (xq0 xq0Var2 : xq0VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = xq0Var2.d;
                    org.telegram.ui.ActionBar.j5 j5Var3 = xq0Var2.e;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (zq0Var.E) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(zq0Var.G, 4000L);
                return;
        }
    }
}
