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
public final class ac0 implements Runnable {
    public final int f22411a;
    public final Object f22412b;

    public ac0(Object obj, int i10) {
        this.f22411a = i10;
        this.f22412b = obj;
    }

    @Override
    public final void run() {
        float f7;
        f71 f71Var;
        switch (this.f22411a) {
            case 0:
                ((bc0) this.f22412b).z();
                return;
            case 1:
                ((ci.u) this.f22412b).invalidateSelf();
                return;
            case 2:
                ((jc0) this.f22412b).invalidateSelf();
                return;
            case 3:
                ((dd0) this.f22412b).d();
                return;
            case 4:
                nd0 nd0Var = (nd0) this.f22412b;
                nd0Var.getClass();
                try {
                    nd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ae0) this.f22412b).f22429f.start();
                return;
            case 6:
                wz wzVar = ((ef0) this.f22412b).f23655c.f25282l0;
                if (wzVar != null) {
                    wzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                hf0 hf0Var = (hf0) this.f22412b;
                hf0Var.f24666r = false;
                hf0Var.invalidate();
                return;
            case 8:
                ((kf0) this.f22412b).h = null;
                return;
            case 9:
                kf0 kf0Var = (kf0) ((n7.a1) this.f22412b).f15084c;
                kf0Var.d.L(kf0Var.e, false);
                return;
            case 10:
                org.telegram.ui.bu0 bu0Var = (org.telegram.ui.bu0) this.f22412b;
                if (bu0Var.f27337x) {
                    bu0Var.h("pollPosition();");
                }
                if (bu0Var.G) {
                    AndroidUtilities.runOnUIThread(bu0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f22412b).invalidate();
                return;
            case 12:
                eg0 eg0Var = (eg0) ((lg.b) this.f22412b).f14029b;
                eg0Var.d.invalidate();
                eg0Var.e.requestLayout();
                return;
            case 13:
                ((gg0) this.f22412b).f();
                return;
            case 14:
                try {
                    fi0 fi0Var = ((ei0) this.f22412b).f23701b;
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
                ((RLottieNative) this.f22412b).d();
                return;
            case 16:
                gk0 gk0Var = (gk0) this.f22412b;
                gk0Var.f24359x0 = null;
                gk0Var.j();
                fk0 fk0Var = gk0Var.f24334g0;
                if (fk0Var != null) {
                    fk0Var.o();
                    return;
                }
                return;
            case 17:
                ((dk0) this.f22412b).H.f23706a.setVisibility(4);
                return;
            case 18:
                hk0 hk0Var = (hk0) this.f22412b;
                f71 f71Var2 = hk0Var.f24711n;
                if (f71Var2 != null) {
                    boolean y3 = f71Var2.y();
                    float n10 = ((float) hk0Var.f24711n.n()) / ((float) hk0Var.f24711n.p());
                    if (n10 < hk0Var.f24713s) {
                        hk0Var.f24711n.L(f7 * ((float) f71Var.p()), false);
                    } else if (n10 > hk0Var.v) {
                        hk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hk0Var.f24715x, 16L);
                    }
                }
                hk0Var.invalidate();
                return;
            case 19:
                ml0 ml0Var = (ml0) this.f22412b;
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
                wm0 wm0Var = (wm0) this.f22412b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(wm0Var, arrayList3, arrayList4, 27));
                return;
            case 21:
                ((ym0) this.f22412b).invalidateSelf();
                return;
            case 22:
                ((in0) this.f22412b).f25007f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.ay) this.f22412b).s();
                return;
            case 24:
                ((o70) this.f22412b).s();
                return;
            case 25:
                ((fo0) this.f22412b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((io0) this.f22412b).f25027n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 27:
                ko0 ko0Var = (ko0) this.f22412b;
                ko0Var.f25656q = false;
                ko0Var.f25644b.run();
                return;
            case 28:
                ((hq0) ((ci.i2) this.f22412b).f4772b).a1(1);
                return;
            default:
                mq0 mq0Var = (mq0) this.f22412b;
                kq0[] kq0VarArr = mq0Var.f26259a;
                if (mq0Var.f26260b != 1) {
                    for (kq0 kq0Var : kq0VarArr) {
                        org.telegram.ui.ActionBar.i5 i5Var = kq0Var.d;
                        i5Var.setAlpha(1.0f);
                        i5Var.setScaleX(1.0f);
                        i5Var.setScaleY(1.0f);
                        kq0Var.e.setAlpha(0.0f);
                    }
                    mq0Var.E = false;
                    AndroidUtilities.runOnUIThread(mq0Var.G, 4000L);
                    return;
                }
                mq0Var.E = !mq0Var.E;
                for (kq0 kq0Var2 : kq0VarArr) {
                    org.telegram.ui.ActionBar.i5 i5Var2 = kq0Var2.d;
                    org.telegram.ui.ActionBar.i5 i5Var3 = kq0Var2.e;
                    i5Var2.setPivotX(0.0f);
                    i5Var3.setPivotX(0.0f);
                    if (mq0Var.E) {
                        i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        i5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        i5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(mq0Var.G, 4000L);
                return;
        }
    }
}
