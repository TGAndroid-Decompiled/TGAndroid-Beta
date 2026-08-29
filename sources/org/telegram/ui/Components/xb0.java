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
public final class xb0 implements Runnable {
    public final int f34673a;
    public final Object f34674b;

    public xb0(Object obj, int i10) {
        this.f34673a = i10;
        this.f34674b = obj;
    }

    @Override
    public final void run() {
        float f9;
        x61 x61Var;
        switch (this.f34673a) {
            case 0:
                ((yb0) this.f34674b).z();
                return;
            case 1:
                ((nh.u) this.f34674b).invalidateSelf();
                return;
            case 2:
                ((gc0) this.f34674b).invalidateSelf();
                return;
            case 3:
                ((zc0) this.f34674b).d();
                return;
            case 4:
                id0 id0Var = (id0) this.f34674b;
                id0Var.getClass();
                try {
                    id0Var.d.E.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((vd0) this.f34674b).f33532f.start();
                return;
            case 6:
                qz qzVar = ((ze0) this.f34674b).f35332c.f28034h0;
                if (qzVar != null) {
                    qzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                cf0 cf0Var = (cf0) this.f34674b;
                cf0Var.f27472r = false;
                cf0Var.invalidate();
                return;
            case 8:
                ((ff0) this.f34674b).h = null;
                return;
            case 9:
                ff0 ff0Var = (ff0) ((oc.i) this.f34674b).f19484c;
                ff0Var.d.M(ff0Var.f28393e, false);
                return;
            case 10:
                org.telegram.ui.et0 et0Var = (org.telegram.ui.et0) this.f34674b;
                if (et0Var.f30680x) {
                    et0Var.h("pollPosition();");
                }
                if (et0Var.C) {
                    AndroidUtilities.runOnUIThread(et0Var.H, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f34674b).invalidate();
                return;
            case 12:
                bg0 bg0Var = (bg0) ((yf0) this.f34674b).f35060b;
                bg0Var.d.invalidate();
                bg0Var.f27084e.requestLayout();
                return;
            case 13:
                ((dg0) this.f34674b).f();
                return;
            case 14:
                try {
                    ai0 ai0Var = ((zh0) this.f34674b).f35351b;
                    if (ai0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ai0Var.getParent()).removeView(ai0Var);
                    }
                    ai0Var.M.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                ((RLottieNative) this.f34674b).d();
                return;
            case 16:
                fk0 fk0Var = (fk0) this.f34674b;
                fk0Var.f28463t0 = null;
                fk0Var.j();
                ek0 ek0Var = fk0Var.f28438c0;
                if (ek0Var != null) {
                    ek0Var.H();
                    return;
                }
                return;
            case 17:
                ((ck0) this.f34674b).D.f27794a.setVisibility(4);
                return;
            case 18:
                gk0 gk0Var = (gk0) this.f34674b;
                x61 x61Var2 = gk0Var.f28905n;
                if (x61Var2 != null) {
                    boolean z10 = x61Var2.z();
                    float o10 = ((float) gk0Var.f28905n.o()) / ((float) gk0Var.f28905n.q());
                    if (o10 < gk0Var.f28907s) {
                        gk0Var.f28905n.M(f9 * ((float) x61Var.q()), false);
                    } else if (o10 > gk0Var.v) {
                        gk0Var.setPlaying(false);
                        z10 = false;
                    }
                    if (z10) {
                        AndroidUtilities.runOnUIThread(gk0Var.f28909x, 16L);
                    }
                }
                gk0Var.invalidate();
                return;
            case 19:
                jl0 jl0Var = (jl0) this.f34674b;
                jl0Var.R1 = null;
                jl0Var.Q1 = null;
                org.telegram.ui.Cells.z zVar = jl0Var.f29736z1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = jl0Var.f29736z1;
                if (zVar2 != null && zVar2.isStateful()) {
                    jl0Var.f29736z1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                tm0 tm0Var = (tm0) this.f34674b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = tm0Var.d;
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
                AndroidUtilities.runOnUIThread(new g(tm0Var, arrayList3, arrayList4, 21));
                return;
            case 21:
                ((vm0) this.f34674b).invalidateSelf();
                return;
            case 22:
                ((en0) this.f34674b).f28120f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.ox) this.f34674b).s();
                return;
            case 24:
                ((j70) this.f34674b).s();
                return;
            case 25:
                ((ao0) this.f34674b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.s1 s1Var = ((co0) this.f34674b).f27534n;
                if (s1Var != null) {
                    s1Var.invalidate();
                    return;
                }
                return;
            case 27:
                eo0 eo0Var = (eo0) this.f34674b;
                eo0Var.f28146q = false;
                eo0Var.f28133b.run();
                return;
            case 28:
                ((dq0) ((bh.c) this.f34674b).f2649b).a1(1);
                return;
            default:
                iq0 iq0Var = (iq0) this.f34674b;
                gq0[] gq0VarArr = iq0Var.f29442a;
                if (iq0Var.f29443b != 1) {
                    for (gq0 gq0Var : gq0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = gq0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        gq0Var.f28960e.setAlpha(0.0f);
                    }
                    iq0Var.A = false;
                    AndroidUtilities.runOnUIThread(iq0Var.C, 4000L);
                    return;
                }
                iq0Var.A = !iq0Var.A;
                for (gq0 gq0Var2 : gq0VarArr) {
                    org.telegram.ui.ActionBar.h5 h5Var2 = gq0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = gq0Var2.f28960e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (iq0Var.A) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(iq0Var.C, 4000L);
                return;
        }
    }
}
