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
    public final int f29924a;
    public final Object f29925b;

    public rc0(Object obj, int i10) {
        this.f29924a = i10;
        this.f29925b = obj;
    }

    @Override
    public final void run() {
        float f7;
        b81 b81Var;
        switch (this.f29924a) {
            case 0:
                ((tc0) this.f29925b).a();
                return;
            case 1:
                ((ei.u) this.f29925b).invalidateSelf();
                return;
            case 2:
                ((ed0) this.f29925b).invalidateSelf();
                return;
            case 3:
                ((xd0) this.f29925b).d();
                return;
            case 4:
                ge0 ge0Var = (ge0) this.f29925b;
                ge0Var.getClass();
                try {
                    ge0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((te0) this.f29925b).f30491f.start();
                return;
            case 6:
                e00 e00Var = ((xf0) this.f29925b).f32386c.f25197l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 7:
                ag0 ag0Var = (ag0) this.f29925b;
                ag0Var.f24566r = false;
                ag0Var.invalidate();
                return;
            case 8:
                ((dg0) this.f29925b).h = null;
                return;
            case 9:
                dg0 dg0Var = (dg0) ((mi.q) this.f29925b).f16976c;
                dg0Var.d.L(dg0Var.e, false);
                return;
            case 10:
                org.telegram.ui.ot0 ot0Var = (org.telegram.ui.ot0) this.f29925b;
                if (ot0Var.f27851x) {
                    ot0Var.h("pollPosition();");
                }
                if (ot0Var.G) {
                    AndroidUtilities.runOnUIThread(ot0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f29925b).invalidate();
                return;
            case 12:
                zg0 zg0Var = (zg0) ((mg.b) this.f29925b).f16860b;
                zg0Var.d.invalidate();
                zg0Var.e.requestLayout();
                return;
            case 13:
                ((bh0) this.f29925b).f();
                return;
            case 14:
                try {
                    aj0 aj0Var = ((zi0) this.f29925b).f32959b;
                    if (aj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) aj0Var.getParent()).removeView(aj0Var);
                    }
                    aj0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.f29925b).d();
                return;
            case 16:
                cl0 cl0Var = (cl0) this.f29925b;
                cl0Var.f25276x0 = null;
                cl0Var.j();
                bl0 bl0Var = cl0Var.f25251g0;
                if (bl0Var != null) {
                    bl0Var.v();
                    return;
                }
                return;
            case 17:
                ((zk0) this.f29925b).H.f24631a.setVisibility(4);
                return;
            case 18:
                dl0 dl0Var = (dl0) this.f29925b;
                b81 b81Var2 = dl0Var.f25586n;
                if (b81Var2 != null) {
                    boolean y3 = b81Var2.y();
                    float n10 = ((float) dl0Var.f25586n.n()) / ((float) dl0Var.f25586n.p());
                    if (n10 < dl0Var.f25588s) {
                        dl0Var.f25586n.L(f7 * ((float) b81Var.p()), false);
                    } else if (n10 > dl0Var.v) {
                        dl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(dl0Var.f25590x, 16L);
                    }
                }
                dl0Var.invalidate();
                return;
            case 19:
                im0 im0Var = (im0) this.f29925b;
                im0Var.T1 = null;
                im0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = im0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = im0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    im0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                tn0 tn0Var = (tn0) this.f29925b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = tn0Var.d;
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
                AndroidUtilities.runOnUIThread(new lg((Object) tn0Var, (Object) arrayList3, (Object) arrayList4, 18));
                return;
            case 21:
                ((vn0) this.f29925b).invalidateSelf();
                return;
            case 22:
                ((fo0) this.f29925b).f26310f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.lx) this.f29925b).s();
                return;
            case 24:
                ((i80) this.f29925b).s();
                return;
            case 25:
                ((cp0) this.f29925b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((fp0) this.f29925b).f26329n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 27:
                gp0 gp0Var = (gp0) this.f29925b;
                gp0Var.f26674q = false;
                gp0Var.f26662b.run();
                return;
            case 28:
                ((er0) ((ai.u) this.f29925b).f2232b).c1(1);
                return;
            default:
                jr0 jr0Var = (jr0) this.f29925b;
                hr0[] hr0VarArr = jr0Var.f27586a;
                if (jr0Var.f27587b != 1) {
                    for (hr0 hr0Var : hr0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = hr0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        hr0Var.e.setAlpha(0.0f);
                    }
                    jr0Var.E = false;
                    AndroidUtilities.runOnUIThread(jr0Var.G, 4000L);
                    return;
                }
                jr0Var.E = !jr0Var.E;
                for (hr0 hr0Var2 : hr0VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = hr0Var2.d;
                    org.telegram.ui.ActionBar.j5 j5Var3 = hr0Var2.e;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (jr0Var.E) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(jr0Var.G, 4000L);
                return;
        }
    }
}
