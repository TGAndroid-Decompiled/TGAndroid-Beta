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

public final class mb0 implements Runnable {

    public final int f30641a;

    public final Object f30642b;

    public mb0(Object obj, int i10) {
        this.f30641a = i10;
        this.f30642b = obj;
    }

    @Override
    public final void run() {
        switch (this.f30641a) {
            case 0:
                ((nb0) this.f30642b).z();
                break;
            case 1:
                ((lh.v) this.f30642b).invalidateSelf();
                break;
            case 2:
                ((vb0) this.f30642b).invalidateSelf();
                break;
            case 3:
                ((oc0) this.f30642b).d();
                break;
            case 4:
                yc0 yc0Var = (yc0) this.f30642b;
                yc0Var.getClass();
                try {
                    yc0Var.d.E.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 5:
                ((md0) this.f30642b).f30650f.start();
                break;
            case 6:
                jz jzVar = ((qe0) this.f30642b).f31900c.f33390h0;
                if (jzVar != null) {
                    jzVar.e(false, true, false);
                }
                break;
            case 7:
                te0 te0Var = (te0) this.f30642b;
                te0Var.f32756r = false;
                te0Var.invalidate();
                break;
            case 8:
                ((we0) this.f30642b).h = null;
                break;
            case 9:
                we0 we0Var = (we0) ((org.telegram.ui.i6) this.f30642b).f38985c;
                we0Var.d.M(we0Var.f34169e, false);
                break;
            case 10:
                org.telegram.ui.ht0 ht0Var = (org.telegram.ui.ht0) this.f30642b;
                if (ht0Var.f27746x) {
                    ht0Var.h("pollPosition();");
                }
                if (ht0Var.C) {
                    AndroidUtilities.runOnUIThread(ht0Var.H, 500L);
                }
                break;
            case 11:
                ((FrameLayout) this.f30642b).invalidate();
                break;
            case 12:
                sf0 sf0Var = (sf0) ((pf0) this.f30642b).f31596b;
                sf0Var.d.invalidate();
                sf0Var.f32423e.requestLayout();
                break;
            case 13:
                ((uf0) this.f30642b).f();
                break;
            case 14:
                try {
                    sh0 sh0Var = ((rh0) this.f30642b).f32170b;
                    if (sh0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) sh0Var.getParent()).removeView(sh0Var);
                    }
                    sh0Var.M.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 15:
                ((RLottieNative) this.f30642b).d();
                break;
            case 16:
                wj0 wj0Var = (wj0) this.f30642b;
                wj0Var.f34265t0 = null;
                wj0Var.j();
                vj0 vj0Var = wj0Var.f34240c0;
                if (vj0Var != null) {
                    vj0Var.s();
                }
                break;
            case 17:
                ((tj0) this.f30642b).D.f33099a.setVisibility(4);
                break;
            case 18:
                xj0 xj0Var = (xj0) this.f30642b;
                m61 m61Var = xj0Var.f34635n;
                if (m61Var != null) {
                    boolean z10 = m61Var.z();
                    float fO = xj0Var.f34635n.o() / xj0Var.f34635n.q();
                    float f10 = xj0Var.f34637s;
                    if (fO < f10) {
                        m61 m61Var2 = xj0Var.f34635n;
                        m61Var2.M((long) (f10 * m61Var2.q()), false);
                    } else if (fO > xj0Var.v) {
                        xj0Var.setPlaying(false);
                        z10 = false;
                    }
                    if (z10) {
                        AndroidUtilities.runOnUIThread(xj0Var.f34639x, 16L);
                    }
                }
                xj0Var.invalidate();
                break;
            case 19:
                zk0 zk0Var = (zk0) this.f30642b;
                zk0Var.R1 = null;
                zk0Var.Q1 = null;
                org.telegram.ui.Cells.z zVar = zk0Var.f35304z1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = zk0Var.f35304z1;
                if (zVar2 != null && zVar2.isStateful()) {
                    zk0Var.f35304z1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                jm0 jm0Var = (jm0) this.f30642b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = jm0Var.d;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(jm0Var, arrayList3, arrayList4, 26));
                break;
            case 21:
                ((lm0) this.f30642b).invalidateSelf();
                break;
            case 22:
                ((um0) this.f30642b).f33130f.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.px) this.f30642b).s();
                break;
            case 24:
                ((b70) this.f30642b).s();
                break;
            case 25:
                ((qn0) this.f30642b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.s1 s1Var = ((sn0) this.f30642b).f32501n;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
                break;
            case 27:
                un0 un0Var = (un0) this.f30642b;
                un0Var.f33154q = false;
                un0Var.f33141b.run();
                break;
            case 28:
                ((sp0) ((ch.e) this.f30642b).f2910b).a1(1);
                break;
            default:
                xp0 xp0Var = (xp0) this.f30642b;
                vp0[] vp0VarArr = xp0Var.f34667a;
                if (xp0Var.f34668b != 1) {
                    for (vp0 vp0Var : vp0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = vp0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        vp0Var.f34026e.setAlpha(0.0f);
                    }
                    xp0Var.A = false;
                    AndroidUtilities.runOnUIThread(xp0Var.C, 4000L);
                } else {
                    xp0Var.A = !xp0Var.A;
                    for (vp0 vp0Var2 : vp0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var2 = vp0Var2.d;
                        org.telegram.ui.ActionBar.h5 h5Var3 = vp0Var2.f34026e;
                        h5Var2.setPivotX(0.0f);
                        h5Var3.setPivotX(0.0f);
                        if (xp0Var.A) {
                            h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    AndroidUtilities.runOnUIThread(xp0Var.C, 4000L);
                }
                break;
        }
    }
}
