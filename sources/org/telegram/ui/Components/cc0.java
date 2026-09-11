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
public final class cc0 implements Runnable {
    public final int f24967a;
    public final Object f24968b;

    public cc0(Object obj, int i10) {
        this.f24967a = i10;
        this.f24968b = obj;
    }

    @Override
    public final void run() {
        float f7;
        g71 g71Var;
        switch (this.f24967a) {
            case 0:
                ((dc0) this.f24968b).z();
                return;
            case 1:
                ((di.u) this.f24968b).invalidateSelf();
                return;
            case 2:
                ((lc0) this.f24968b).invalidateSelf();
                return;
            case 3:
                ((ed0) this.f24968b).d();
                return;
            case 4:
                nd0 nd0Var = (nd0) this.f24968b;
                nd0Var.getClass();
                try {
                    nd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ae0) this.f24968b).f24347f.start();
                return;
            case 6:
                vz vzVar = ((ef0) this.f24968b).f25672c.f27483l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                hf0 hf0Var = (hf0) this.f24968b;
                hf0Var.f26725r = false;
                hf0Var.invalidate();
                return;
            case 8:
                ((kf0) this.f24968b).h = null;
                return;
            case 9:
                kf0 kf0Var = (kf0) ((n7.z0) this.f24968b).f16704c;
                kf0Var.d.L(kf0Var.f27817e, false);
                return;
            case 10:
                org.telegram.ui.hu0 hu0Var = (org.telegram.ui.hu0) this.f24968b;
                if (hu0Var.f29716x) {
                    hu0Var.h("pollPosition();");
                }
                if (hu0Var.G) {
                    AndroidUtilities.runOnUIThread(hu0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f24968b).invalidate();
                return;
            case 12:
                eg0 eg0Var = (eg0) ((mg.b) this.f24968b).f16235b;
                eg0Var.d.invalidate();
                eg0Var.f25683e.requestLayout();
                return;
            case 13:
                ((gg0) this.f24968b).f();
                return;
            case 14:
                try {
                    ei0 ei0Var = ((di0) this.f24968b).f25401b;
                    if (ei0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ei0Var.getParent()).removeView(ei0Var);
                    }
                    ei0Var.Q.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 15:
                ((RLottieNative) this.f24968b).d();
                return;
            case 16:
                fk0 fk0Var = (fk0) this.f24968b;
                fk0Var.f26119x0 = null;
                fk0Var.j();
                ek0 ek0Var = fk0Var.f26094g0;
                if (ek0Var != null) {
                    ek0Var.J();
                    return;
                }
                return;
            case 17:
                ((ck0) this.f24968b).H.f25407a.setVisibility(4);
                return;
            case 18:
                gk0 gk0Var = (gk0) this.f24968b;
                g71 g71Var2 = gk0Var.f26422n;
                if (g71Var2 != null) {
                    boolean y3 = g71Var2.y();
                    float n10 = ((float) gk0Var.f26422n.n()) / ((float) gk0Var.f26422n.p());
                    if (n10 < gk0Var.f26424s) {
                        gk0Var.f26422n.L(f7 * ((float) g71Var.p()), false);
                    } else if (n10 > gk0Var.v) {
                        gk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(gk0Var.f26426x, 16L);
                    }
                }
                gk0Var.invalidate();
                return;
            case 19:
                ll0 ll0Var = (ll0) this.f24968b;
                ll0Var.V1 = null;
                ll0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = ll0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = ll0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    ll0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                vm0 vm0Var = (vm0) this.f24968b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = vm0Var.d;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(vm0Var, arrayList3, arrayList4, 27));
                return;
            case 21:
                ((xm0) this.f24968b).invalidateSelf();
                return;
            case 22:
                ((hn0) this.f24968b).f26766f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.ey) this.f24968b).s();
                return;
            case 24:
                ((n70) this.f24968b).s();
                return;
            case 25:
                ((fo0) this.f24968b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((io0) this.f24968b).f27219n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 27:
                ko0 ko0Var = (ko0) this.f24968b;
                ko0Var.f27875q = false;
                ko0Var.f27862b.run();
                return;
            case 28:
                ((hq0) ((di.i2) this.f24968b).f7365b).a1(1);
                return;
            default:
                mq0 mq0Var = (mq0) this.f24968b;
                kq0[] kq0VarArr = mq0Var.f28483a;
                if (mq0Var.f28484b != 1) {
                    for (kq0 kq0Var : kq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = kq0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        kq0Var.f27890e.setAlpha(0.0f);
                    }
                    mq0Var.E = false;
                    AndroidUtilities.runOnUIThread(mq0Var.G, 4000L);
                    return;
                }
                mq0Var.E = !mq0Var.E;
                for (kq0 kq0Var2 : kq0VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = kq0Var2.d;
                    org.telegram.ui.ActionBar.j5 j5Var3 = kq0Var2.f27890e;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (mq0Var.E) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(mq0Var.G, 4000L);
                return;
        }
    }
}
