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
public final class ec0 implements Runnable {
    public final int f26547a;
    public final Object f26548b;

    public ec0(Object obj, int i10) {
        this.f26547a = i10;
        this.f26548b = obj;
    }

    @Override
    public final void run() {
        float f10;
        j71 j71Var;
        switch (this.f26547a) {
            case 0:
                ((fc0) this.f26548b).z();
                return;
            case 1:
                ((lc0) this.f26548b).invalidateSelf();
                return;
            case 2:
                ((oc0) this.f26548b).invalidateSelf();
                return;
            case 3:
                ((hd0) this.f26548b).d();
                return;
            case 4:
                rd0 rd0Var = (rd0) this.f26548b;
                rd0Var.getClass();
                try {
                    rd0Var.d.F.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((fe0) this.f26548b).f26900f.start();
                return;
            case 6:
                xz xzVar = ((kf0) this.f26548b).f28406c.f30060i0;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                nf0 nf0Var = (nf0) this.f26548b;
                nf0Var.f29445r = false;
                nf0Var.invalidate();
                return;
            case 8:
                ((qf0) this.f26548b).h = null;
                return;
            case 9:
                qf0 qf0Var = (qf0) ((n7.qa) this.f26548b).f15702c;
                qf0Var.d.L(qf0Var.f30403e, false);
                return;
            case 10:
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) this.f26548b;
                if (ut0Var.f33062x) {
                    ut0Var.h("pollPosition();");
                }
                if (ut0Var.D) {
                    AndroidUtilities.runOnUIThread(ut0Var.I, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f26548b).invalidate();
                return;
            case 12:
                ng0 ng0Var = (ng0) ((jg0) this.f26548b).f28098b;
                ng0Var.d.invalidate();
                ng0Var.f29470e.requestLayout();
                return;
            case 13:
                ((pg0) this.f26548b).f();
                return;
            case 14:
                try {
                    ni0 ni0Var = ((mi0) this.f26548b).f29137b;
                    if (ni0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ni0Var.getParent()).removeView(ni0Var);
                    }
                    ni0Var.N.run();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 15:
                ((RLottieNative) this.f26548b).d();
                return;
            case 16:
                qk0 qk0Var = (qk0) this.f26548b;
                qk0Var.f30457u0 = null;
                qk0Var.j();
                pk0 pk0Var = qk0Var.f30432d0;
                if (pk0Var != null) {
                    pk0Var.m();
                    return;
                }
                return;
            case 17:
                ((nk0) this.f26548b).E.f29791a.setVisibility(4);
                return;
            case 18:
                rk0 rk0Var = (rk0) this.f26548b;
                j71 j71Var2 = rk0Var.f30800n;
                if (j71Var2 != null) {
                    boolean y10 = j71Var2.y();
                    float n10 = ((float) rk0Var.f30800n.n()) / ((float) rk0Var.f30800n.p());
                    if (n10 < rk0Var.f30802s) {
                        rk0Var.f30800n.L(f10 * ((float) j71Var.p()), false);
                    } else if (n10 > rk0Var.v) {
                        rk0Var.setPlaying(false);
                        y10 = false;
                    }
                    if (y10) {
                        AndroidUtilities.runOnUIThread(rk0Var.f30804x, 16L);
                    }
                }
                rk0Var.invalidate();
                return;
            case 19:
                sl0 sl0Var = (sl0) this.f26548b;
                sl0Var.S1 = null;
                sl0Var.R1 = null;
                org.telegram.ui.Cells.z zVar = sl0Var.A1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = sl0Var.A1;
                if (zVar2 != null && zVar2.isStateful()) {
                    sl0Var.A1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                dn0 dn0Var = (dn0) this.f26548b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = dn0Var.d;
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
                AndroidUtilities.runOnUIThread(new jp(dn0Var, arrayList3, arrayList4, 14));
                return;
            case 21:
                ((fn0) this.f26548b).invalidateSelf();
                return;
            case 22:
                ((on0) this.f26548b).f29828f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.yx) this.f26548b).s();
                return;
            case 24:
                ((q70) this.f26548b).s();
                return;
            case 25:
                ((ko0) this.f26548b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((mo0) this.f26548b).f29196n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 27:
                oo0 oo0Var = (oo0) this.f26548b;
                oo0Var.f29855q = false;
                oo0Var.f29842b.run();
                return;
            case 28:
                ((lq0) ((eh.c) this.f26548b).f5618b).a1(1);
                return;
            default:
                qq0 qq0Var = (qq0) this.f26548b;
                oq0[] oq0VarArr = qq0Var.f30492a;
                if (qq0Var.f30493b != 1) {
                    for (oq0 oq0Var : oq0VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var = oq0Var.d;
                        l5Var.setAlpha(1.0f);
                        l5Var.setScaleX(1.0f);
                        l5Var.setScaleY(1.0f);
                        oq0Var.f29867e.setAlpha(0.0f);
                    }
                    qq0Var.B = false;
                    AndroidUtilities.runOnUIThread(qq0Var.D, 4000L);
                    return;
                }
                qq0Var.B = !qq0Var.B;
                for (oq0 oq0Var2 : oq0VarArr) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = oq0Var2.d;
                    org.telegram.ui.ActionBar.l5 l5Var3 = oq0Var2.f29867e;
                    l5Var2.setPivotX(0.0f);
                    l5Var3.setPivotX(0.0f);
                    if (qq0Var.B) {
                        l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        l5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        l5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(qq0Var.D, 4000L);
                return;
        }
    }
}
