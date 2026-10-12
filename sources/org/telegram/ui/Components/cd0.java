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
    public final int f24930a;
    public final Object f24931b;

    public cd0(Object obj, int i10) {
        this.f24930a = i10;
        this.f24931b = obj;
    }

    @Override
    public final void run() {
        float f7;
        q81 q81Var;
        switch (this.f24930a) {
            case 0:
                ((ed0) this.f24931b).a();
                return;
            case 1:
                ((gd0) this.f24931b).z();
                return;
            case 2:
                ((ci.u) this.f24931b).invalidateSelf();
                return;
            case 3:
                ((od0) this.f24931b).invalidateSelf();
                return;
            case 4:
                ((ie0) this.f24931b).d();
                return;
            case 5:
                se0 se0Var = (se0) this.f24931b;
                se0Var.getClass();
                try {
                    se0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((ff0) this.f24931b).f26054f.start();
                return;
            case 7:
                o00 o00Var = ((jg0) this.f24931b).f27498c.f29191l0;
                if (o00Var != null) {
                    o00Var.e(false, true, false);
                    return;
                }
                return;
            case 8:
                mg0 mg0Var = (mg0) this.f24931b;
                mg0Var.f28548r = false;
                mg0Var.invalidate();
                return;
            case 9:
                ((pg0) this.f24931b).h = null;
                return;
            case 10:
                pg0 pg0Var = (pg0) ((n7.z0) this.f24931b).f16573c;
                pg0Var.d.L(pg0Var.f29497e, false);
                return;
            case 11:
                org.telegram.ui.lu0 lu0Var = (org.telegram.ui.lu0) this.f24931b;
                if (lu0Var.f31512x) {
                    lu0Var.h("pollPosition();");
                }
                if (lu0Var.G) {
                    AndroidUtilities.runOnUIThread(lu0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f24931b).invalidate();
                return;
            case 13:
                jh0 jh0Var = (jh0) ((lg.b) this.f24931b).f15252b;
                jh0Var.d.invalidate();
                jh0Var.f27511e.requestLayout();
                return;
            case 14:
                ((lh0) this.f24931b).f();
                return;
            case 15:
                try {
                    lj0 lj0Var = ((kj0) this.f24931b).f27884b;
                    if (lj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) lj0Var.getParent()).removeView(lj0Var);
                    }
                    lj0Var.Q.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 16:
                ((RLottieNative) this.f24931b).d();
                return;
            case 17:
                nl0 nl0Var = (nl0) this.f24931b;
                nl0Var.f28862x0 = null;
                nl0Var.j();
                ml0 ml0Var = nl0Var.f28837g0;
                if (ml0Var != null) {
                    ml0Var.p();
                    return;
                }
                return;
            case 18:
                ((kl0) this.f24931b).H.f28229a.setVisibility(4);
                return;
            case 19:
                ol0 ol0Var = (ol0) this.f24931b;
                q81 q81Var2 = ol0Var.f29240n;
                if (q81Var2 != null) {
                    boolean y3 = q81Var2.y();
                    float n10 = ((float) ol0Var.f29240n.n()) / ((float) ol0Var.f29240n.p());
                    if (n10 < ol0Var.f29242s) {
                        ol0Var.f29240n.L(f7 * ((float) q81Var.p()), false);
                    } else if (n10 > ol0Var.v) {
                        ol0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(ol0Var.f29244x, 16L);
                    }
                }
                ol0Var.invalidate();
                return;
            case 20:
                wm0 wm0Var = (wm0) this.f24931b;
                wm0Var.T1 = null;
                wm0Var.S1 = null;
                org.telegram.ui.Cells.z zVar = wm0Var.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = wm0Var.B1;
                if (zVar2 != null && zVar2.isStateful()) {
                    wm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                ho0 ho0Var = (ho0) this.f24931b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = ho0Var.d;
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
                AndroidUtilities.runOnUIThread(new mh0(ho0Var, arrayList3, arrayList4, 1));
                return;
            case 22:
                ((jo0) this.f24931b).invalidateSelf();
                return;
            case 23:
                ((to0) this.f24931b).f30909f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.fy) this.f24931b).s();
                return;
            case 25:
                ((s80) this.f24931b).s();
                return;
            case 26:
                ((qp0) this.f24931b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.u1 u1Var = ((tp0) this.f24931b).f30932n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 28:
                vp0 vp0Var = (vp0) this.f24931b;
                vp0Var.f32168q = false;
                vp0Var.f32155b.run();
                return;
            default:
                ((sr0) ((ci.h2) this.f24931b).f5154b).b1(1);
                return;
        }
    }
}
