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
public final class kc0 implements Runnable {
    public final int f24696a;
    public final Object f24697b;

    public kc0(Object obj, int i10) {
        this.f24696a = i10;
        this.f24697b = obj;
    }

    @Override
    public final void run() {
        float f7;
        t71 t71Var;
        switch (this.f24696a) {
            case 0:
                ((lc0) this.f24697b).z();
                return;
            case 1:
                ((bi.y) this.f24697b).invalidateSelf();
                return;
            case 2:
                ((tc0) this.f24697b).invalidateSelf();
                return;
            case 3:
                ((nd0) this.f24697b).d();
                return;
            case 4:
                wd0 wd0Var = (wd0) this.f24697b;
                wd0Var.getClass();
                try {
                    wd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((je0) this.f24697b).f24382f.start();
                return;
            case 6:
                c00 c00Var = ((nf0) this.f24697b).f25507c.f27026l0;
                if (c00Var != null) {
                    c00Var.e(false, true, false);
                    return;
                }
                return;
            case 7:
                qf0 qf0Var = (qf0) this.f24697b;
                qf0Var.f26406r = false;
                qf0Var.invalidate();
                return;
            case 8:
                ((tf0) this.f24697b).h = null;
                return;
            case 9:
                tf0 tf0Var = (tf0) ((og.u0) this.f24697b).f14498c;
                tf0Var.d.L(tf0Var.e, false);
                return;
            case 10:
                org.telegram.ui.hu0 hu0Var = (org.telegram.ui.hu0) this.f24697b;
                if (hu0Var.f29666x) {
                    hu0Var.h("pollPosition();");
                }
                if (hu0Var.G) {
                    AndroidUtilities.runOnUIThread(hu0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f24697b).invalidate();
                return;
            case 12:
                og0 og0Var = (og0) ((kg.b) this.f24697b).f12436b;
                og0Var.d.invalidate();
                og0Var.e.requestLayout();
                return;
            case 13:
                ((qg0) this.f24697b).f();
                return;
            case 14:
                try {
                    oi0 oi0Var = ((ni0) this.f24697b).f25530b;
                    if (oi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) oi0Var.getParent()).removeView(oi0Var);
                    }
                    oi0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.f24697b).d();
                return;
            case 16:
                pk0 pk0Var = (pk0) this.f24697b;
                pk0Var.f26199x0 = null;
                pk0Var.j();
                ok0 ok0Var = pk0Var.f26174g0;
                if (ok0Var != null) {
                    ok0Var.s();
                    return;
                }
                return;
            case 17:
                ((mk0) this.f24697b).H.f25540a.setVisibility(4);
                return;
            case 18:
                qk0 qk0Var = (qk0) this.f24697b;
                t71 t71Var2 = qk0Var.f26437n;
                if (t71Var2 != null) {
                    boolean y3 = t71Var2.y();
                    float n10 = ((float) qk0Var.f26437n.n()) / ((float) qk0Var.f26437n.p());
                    if (n10 < qk0Var.f26439s) {
                        qk0Var.f26437n.L(f7 * ((float) t71Var.p()), false);
                    } else if (n10 > qk0Var.v) {
                        qk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(qk0Var.f26441x, 16L);
                    }
                }
                qk0Var.invalidate();
                return;
            case 19:
                vl0 vl0Var = (vl0) this.f24697b;
                vl0Var.V1 = null;
                vl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = vl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = vl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    vl0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                fn0 fn0Var = (fn0) this.f24697b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = fn0Var.d;
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
                AndroidUtilities.runOnUIThread(new gf(fn0Var, arrayList3, arrayList4, 19));
                return;
            case 21:
                ((hn0) this.f24697b).invalidateSelf();
                return;
            case 22:
                ((rn0) this.f24697b).f26700f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.gy) this.f24697b).s();
                return;
            case 24:
                ((w70) this.f24697b).s();
                return;
            case 25:
                ((oo0) this.f24697b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((ro0) this.f24697b).f26721n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 27:
                to0 to0Var = (to0) this.f24697b;
                to0Var.f27455q = false;
                to0Var.f27443b.run();
                return;
            case 28:
                ((sq0) ((bi.u2) this.f24697b).f3711b).a1(1);
                return;
            default:
                xq0 xq0Var = (xq0) this.f24697b;
                vq0[] vq0VarArr = xq0Var.f29126a;
                if (xq0Var.f29127b != 1) {
                    for (vq0 vq0Var : vq0VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var = vq0Var.d;
                        l5Var.setAlpha(1.0f);
                        l5Var.setScaleX(1.0f);
                        l5Var.setScaleY(1.0f);
                        vq0Var.e.setAlpha(0.0f);
                    }
                    xq0Var.E = false;
                    AndroidUtilities.runOnUIThread(xq0Var.G, 4000L);
                    return;
                }
                xq0Var.E = !xq0Var.E;
                for (vq0 vq0Var2 : vq0VarArr) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = vq0Var2.d;
                    org.telegram.ui.ActionBar.l5 l5Var3 = vq0Var2.e;
                    l5Var2.setPivotX(0.0f);
                    l5Var3.setPivotX(0.0f);
                    if (xq0Var.E) {
                        l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        l5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        l5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(xq0Var.G, 4000L);
                return;
        }
    }
}
