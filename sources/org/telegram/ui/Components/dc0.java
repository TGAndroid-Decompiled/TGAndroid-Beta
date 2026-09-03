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
public final class dc0 implements Runnable {
    public final int f24245a;
    public final Object f24246b;

    public dc0(Object obj, int i10) {
        this.f24245a = i10;
        this.f24246b = obj;
    }

    @Override
    public final void run() {
        float f10;
        i71 i71Var;
        switch (this.f24245a) {
            case 0:
                ((ec0) this.f24246b).z();
                return;
            case 1:
                ((kc0) this.f24246b).invalidateSelf();
                return;
            case 2:
                ((nc0) this.f24246b).invalidateSelf();
                return;
            case 3:
                ((gd0) this.f24246b).d();
                return;
            case 4:
                qd0 qd0Var = (qd0) this.f24246b;
                qd0Var.getClass();
                try {
                    qd0Var.d.F.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((ee0) this.f24246b).f24603f.start();
                return;
            case 6:
                vz vzVar = ((jf0) this.f24246b).f25956c.f27535i0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                mf0 mf0Var = (mf0) this.f24246b;
                mf0Var.f27027r = false;
                mf0Var.invalidate();
                return;
            case 8:
                ((pf0) this.f24246b).h = null;
                return;
            case 9:
                pf0 pf0Var = (pf0) ((n7.qa) this.f24246b).f14688c;
                pf0Var.d.L(pf0Var.e, false);
                return;
            case 10:
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) this.f24246b;
                if (ut0Var.f30245x) {
                    ut0Var.h("pollPosition();");
                }
                if (ut0Var.D) {
                    AndroidUtilities.runOnUIThread(ut0Var.I, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f24246b).invalidate();
                return;
            case 12:
                mg0 mg0Var = (mg0) ((ig0) this.f24246b).f25705b;
                mg0Var.d.invalidate();
                mg0Var.e.requestLayout();
                return;
            case 13:
                ((og0) this.f24246b).f();
                return;
            case 14:
                try {
                    mi0 mi0Var = ((li0) this.f24246b).f26763b;
                    if (mi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) mi0Var.getParent()).removeView(mi0Var);
                    }
                    mi0Var.N.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.f24246b).d();
                return;
            case 16:
                pk0 pk0Var = (pk0) this.f24246b;
                pk0Var.f27913u0 = null;
                pk0Var.j();
                ok0 ok0Var = pk0Var.f27889d0;
                if (ok0Var != null) {
                    ok0Var.m();
                    return;
                }
                return;
            case 17:
                ((mk0) this.f24246b).E.f27284a.setVisibility(4);
                return;
            case 18:
                qk0 qk0Var = (qk0) this.f24246b;
                i71 i71Var2 = qk0Var.f28204n;
                if (i71Var2 != null) {
                    boolean y10 = i71Var2.y();
                    float n10 = ((float) qk0Var.f28204n.n()) / ((float) qk0Var.f28204n.p());
                    if (n10 < qk0Var.f28206s) {
                        qk0Var.f28204n.L(f10 * ((float) i71Var.p()), false);
                    } else if (n10 > qk0Var.v) {
                        qk0Var.setPlaying(false);
                        y10 = false;
                    }
                    if (y10) {
                        AndroidUtilities.runOnUIThread(qk0Var.f28208x, 16L);
                    }
                }
                qk0Var.invalidate();
                return;
            case 19:
                rl0 rl0Var = (rl0) this.f24246b;
                rl0Var.S1 = null;
                rl0Var.R1 = null;
                org.telegram.ui.Cells.z zVar = rl0Var.A1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = rl0Var.A1;
                if (zVar2 != null && zVar2.isStateful()) {
                    rl0Var.A1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                cn0 cn0Var = (cn0) this.f24246b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = cn0Var.d;
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
                AndroidUtilities.runOnUIThread(new gp(cn0Var, arrayList3, arrayList4, 14));
                return;
            case 21:
                ((en0) this.f24246b).invalidateSelf();
                return;
            case 22:
                ((nn0) this.f24246b).f27311f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.zx) this.f24246b).s();
                return;
            case 24:
                ((p70) this.f24246b).s();
                return;
            case 25:
                ((jo0) this.f24246b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.s1 s1Var = ((lo0) this.f24246b).f26820n;
                if (s1Var != null) {
                    s1Var.invalidate();
                    return;
                }
                return;
            case 27:
                no0 no0Var = (no0) this.f24246b;
                no0Var.f27337q = false;
                no0Var.f27325b.run();
                return;
            case 28:
                ((lq0) ((dh.c) this.f24246b).f4892b).a1(1);
                return;
            default:
                qq0 qq0Var = (qq0) this.f24246b;
                oq0[] oq0VarArr = qq0Var.f28237a;
                if (qq0Var.f28238b != 1) {
                    for (oq0 oq0Var : oq0VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var = oq0Var.d;
                        k5Var.setAlpha(1.0f);
                        k5Var.setScaleX(1.0f);
                        k5Var.setScaleY(1.0f);
                        oq0Var.e.setAlpha(0.0f);
                    }
                    qq0Var.B = false;
                    AndroidUtilities.runOnUIThread(qq0Var.D, 4000L);
                    return;
                }
                qq0Var.B = !qq0Var.B;
                for (oq0 oq0Var2 : oq0VarArr) {
                    org.telegram.ui.ActionBar.k5 k5Var2 = oq0Var2.d;
                    org.telegram.ui.ActionBar.k5 k5Var3 = oq0Var2.e;
                    k5Var2.setPivotX(0.0f);
                    k5Var3.setPivotX(0.0f);
                    if (qq0Var.B) {
                        k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        k5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        k5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(qq0Var.D, 4000L);
                return;
        }
    }
}
