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
    public final int f29923a;
    public final Object f29924b;

    public rc0(Object obj, int i10) {
        this.f29923a = i10;
        this.f29924b = obj;
    }

    @Override
    public final void run() {
        float f7;
        a81 a81Var;
        switch (this.f29923a) {
            case 0:
                ((tc0) this.f29924b).a();
                return;
            case 1:
                ((ei.u) this.f29924b).invalidateSelf();
                return;
            case 2:
                ((ed0) this.f29924b).invalidateSelf();
                return;
            case 3:
                ((xd0) this.f29924b).d();
                return;
            case 4:
                ge0 ge0Var = (ge0) this.f29924b;
                ge0Var.getClass();
                try {
                    ge0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((te0) this.f29924b).f30536f.start();
                return;
            case 6:
                e00 e00Var = ((xf0) this.f29924b).f32389c.f25226l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 7:
                ag0 ag0Var = (ag0) this.f29924b;
                ag0Var.f24591r = false;
                ag0Var.invalidate();
                return;
            case 8:
                ((dg0) this.f29924b).h = null;
                return;
            case 9:
                dg0 dg0Var = (dg0) ((mi.q) this.f29924b).f16975c;
                dg0Var.d.L(dg0Var.e, false);
                return;
            case 10:
                org.telegram.ui.qt0 qt0Var = (org.telegram.ui.qt0) this.f29924b;
                if (qt0Var.f27878x) {
                    qt0Var.h("pollPosition();");
                }
                if (qt0Var.G) {
                    AndroidUtilities.runOnUIThread(qt0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f29924b).invalidate();
                return;
            case 12:
                zg0 zg0Var = (zg0) ((mg.b) this.f29924b).f16859b;
                zg0Var.d.invalidate();
                zg0Var.e.requestLayout();
                return;
            case 13:
                ((bh0) this.f29924b).f();
                return;
            case 14:
                try {
                    aj0 aj0Var = ((zi0) this.f29924b).f32942b;
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
                ((RLottieNative) this.f29924b).d();
                return;
            case 16:
                cl0 cl0Var = (cl0) this.f29924b;
                cl0Var.f25305x0 = null;
                cl0Var.j();
                bl0 bl0Var = cl0Var.f25280g0;
                if (bl0Var != null) {
                    bl0Var.q();
                    return;
                }
                return;
            case 17:
                ((zk0) this.f29924b).H.f24656a.setVisibility(4);
                return;
            case 18:
                dl0 dl0Var = (dl0) this.f29924b;
                a81 a81Var2 = dl0Var.f25620n;
                if (a81Var2 != null) {
                    boolean y3 = a81Var2.y();
                    float n10 = ((float) dl0Var.f25620n.n()) / ((float) dl0Var.f25620n.p());
                    if (n10 < dl0Var.f25622s) {
                        dl0Var.f25620n.L(f7 * ((float) a81Var.p()), false);
                    } else if (n10 > dl0Var.v) {
                        dl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(dl0Var.f25624x, 16L);
                    }
                }
                dl0Var.invalidate();
                return;
            case 19:
                im0 im0Var = (im0) this.f29924b;
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
                tn0 tn0Var = (tn0) this.f29924b;
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
                ((vn0) this.f29924b).invalidateSelf();
                return;
            case 22:
                ((fo0) this.f29924b).f26330f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.nx) this.f29924b).s();
                return;
            case 24:
                ((i80) this.f29924b).s();
                return;
            case 25:
                ((cp0) this.f29924b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((fp0) this.f29924b).f26349n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 27:
                gp0 gp0Var = (gp0) this.f29924b;
                gp0Var.f26652q = false;
                gp0Var.f26640b.run();
                return;
            case 28:
                ((dr0) ((ai.u) this.f29924b).f2234b).b1(1);
                return;
            default:
                ir0 ir0Var = (ir0) this.f29924b;
                gr0[] gr0VarArr = ir0Var.f27345a;
                if (ir0Var.f27346b != 1) {
                    for (gr0 gr0Var : gr0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = gr0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        gr0Var.e.setAlpha(0.0f);
                    }
                    ir0Var.E = false;
                    AndroidUtilities.runOnUIThread(ir0Var.G, 4000L);
                    return;
                }
                ir0Var.E = !ir0Var.E;
                for (gr0 gr0Var2 : gr0VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = gr0Var2.d;
                    org.telegram.ui.ActionBar.j5 j5Var3 = gr0Var2.e;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (ir0Var.E) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(ir0Var.G, 4000L);
                return;
        }
    }
}
