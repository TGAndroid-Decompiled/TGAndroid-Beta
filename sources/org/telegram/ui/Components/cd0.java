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
    public final int f25190a;
    public final Object f25191b;

    public cd0(Object obj, int i10) {
        this.f25190a = i10;
        this.f25191b = obj;
    }

    @Override
    public final void run() {
        float f7;
        m81 m81Var;
        switch (this.f25190a) {
            case 0:
                ((dd0) this.f25191b).z();
                return;
            case 1:
                ((ci.u) this.f25191b).invalidateSelf();
                return;
            case 2:
                ((ld0) this.f25191b).invalidateSelf();
                return;
            case 3:
                ((ge0) this.f25191b).d();
                return;
            case 4:
                pe0 pe0Var = (pe0) this.f25191b;
                pe0Var.getClass();
                try {
                    pe0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((df0) this.f25191b).f25587f.start();
                return;
            case 6:
                m00 m00Var = ((hg0) this.f25191b).f26989c.f28685l0;
                if (m00Var != null) {
                    m00Var.e(false, true, false);
                    return;
                }
                return;
            case 7:
                kg0 kg0Var = (kg0) this.f25191b;
                kg0Var.f27970r = false;
                kg0Var.invalidate();
                return;
            case 8:
                ((ng0) this.f25191b).h = null;
                return;
            case 9:
                ng0 ng0Var = (ng0) ((n7.z0) this.f25191b).f16870c;
                ng0Var.d.L(ng0Var.f29052e, false);
                return;
            case 10:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.f25191b;
                if (iu0Var.f31445x) {
                    iu0Var.h("pollPosition();");
                }
                if (iu0Var.G) {
                    AndroidUtilities.runOnUIThread(iu0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f25191b).invalidate();
                return;
            case 12:
                ih0 ih0Var = (ih0) ((lg.b) this.f25191b).f15509b;
                ih0Var.d.invalidate();
                ih0Var.f27333e.requestLayout();
                return;
            case 13:
                ((kh0) this.f25191b).f();
                return;
            case 14:
                try {
                    lj0 lj0Var = ((kj0) this.f25191b).f28019b;
                    if (lj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) lj0Var.getParent()).removeView(lj0Var);
                    }
                    lj0Var.Q.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 15:
                ((RLottieNative) this.f25191b).d();
                return;
            case 16:
                ml0 ml0Var = (ml0) this.f25191b;
                ml0Var.f28792x0 = null;
                ml0Var.j();
                ll0 ll0Var = ml0Var.f28767g0;
                if (ll0Var != null) {
                    ll0Var.s();
                    return;
                }
                return;
            case 17:
                ((jl0) this.f25191b).H.f28030a.setVisibility(4);
                return;
            case 18:
                nl0 nl0Var = (nl0) this.f25191b;
                m81 m81Var2 = nl0Var.f29085n;
                if (m81Var2 != null) {
                    boolean y3 = m81Var2.y();
                    float n10 = ((float) nl0Var.f29085n.n()) / ((float) nl0Var.f29085n.p());
                    if (n10 < nl0Var.f29087s) {
                        nl0Var.f29085n.L(f7 * ((float) m81Var.p()), false);
                    } else if (n10 > nl0Var.v) {
                        nl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(nl0Var.f29089x, 16L);
                    }
                }
                nl0Var.invalidate();
                return;
            case 19:
                sm0 sm0Var = (sm0) this.f25191b;
                sm0Var.T1 = null;
                sm0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = sm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = sm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    sm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                do0 do0Var = (do0) this.f25191b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = do0Var.d;
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
                AndroidUtilities.runOnUIThread(new cf0(do0Var, arrayList3, arrayList4, 3));
                return;
            case 21:
                ((fo0) this.f25191b).invalidateSelf();
                return;
            case 22:
                ((po0) this.f25191b).f29784f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.cy) this.f25191b).s();
                return;
            case 24:
                ((q80) this.f25191b).s();
                return;
            case 25:
                ((mp0) this.f25191b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((pp0) this.f25191b).f29805n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 27:
                rp0 rp0Var = (rp0) this.f25191b;
                rp0Var.f30508q = false;
                rp0Var.f30495b.run();
                return;
            case 28:
                ((or0) ((ci.h2) this.f25191b).f5155b).b1(1);
                return;
            default:
                tr0 tr0Var = (tr0) this.f25191b;
                rr0[] rr0VarArr = tr0Var.f31135a;
                if (tr0Var.f31136b != 1) {
                    for (rr0 rr0Var : rr0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = rr0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        rr0Var.f30532e.setAlpha(0.0f);
                    }
                    tr0Var.E = false;
                    AndroidUtilities.runOnUIThread(tr0Var.G, 4000L);
                    return;
                }
                tr0Var.E = !tr0Var.E;
                for (rr0 rr0Var2 : rr0VarArr) {
                    org.telegram.ui.ActionBar.h5 h5Var2 = rr0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = rr0Var2.f30532e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (tr0Var.E) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(tr0Var.G, 4000L);
                return;
        }
    }
}
