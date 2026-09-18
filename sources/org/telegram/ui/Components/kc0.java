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
    public final int f25681a;
    public final Object f25682b;

    public kc0(Object obj, int i10) {
        this.f25681a = i10;
        this.f25682b = obj;
    }

    @Override
    public final void run() {
        float f7;
        u71 u71Var;
        switch (this.f25681a) {
            case 0:
                ((lc0) this.f25682b).z();
                return;
            case 1:
                ((ci.u) this.f25682b).invalidateSelf();
                return;
            case 2:
                ((tc0) this.f25682b).invalidateSelf();
                return;
            case 3:
                ((nd0) this.f25682b).d();
                return;
            case 4:
                wd0 wd0Var = (wd0) this.f25682b;
                wd0Var.getClass();
                try {
                    wd0Var.d.I.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((je0) this.f25682b).f25312f.start();
                return;
            case 6:
                vz vzVar = ((nf0) this.f25682b).f26680c.f28146l0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                qf0 qf0Var = (qf0) this.f25682b;
                qf0Var.f27589r = false;
                qf0Var.invalidate();
                return;
            case 8:
                ((tf0) this.f25682b).h = null;
                return;
            case 9:
                tf0 tf0Var = (tf0) ((n7.z0) this.f25682b).f15368c;
                tf0Var.d.L(tf0Var.e, false);
                return;
            case 10:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.f25682b;
                if (iu0Var.f30791x) {
                    iu0Var.h("pollPosition();");
                }
                if (iu0Var.G) {
                    AndroidUtilities.runOnUIThread(iu0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f25682b).invalidate();
                return;
            case 12:
                pg0 pg0Var = (pg0) ((lg.b) this.f25682b).f14197b;
                pg0Var.d.invalidate();
                pg0Var.e.requestLayout();
                return;
            case 13:
                ((rg0) this.f25682b).f();
                return;
            case 14:
                try {
                    pi0 pi0Var = ((oi0) this.f25682b).f26953b;
                    if (pi0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) pi0Var.getParent()).removeView(pi0Var);
                    }
                    pi0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.f25682b).d();
                return;
            case 16:
                qk0 qk0Var = (qk0) this.f25682b;
                qk0Var.f27675x0 = null;
                qk0Var.j();
                pk0 pk0Var = qk0Var.f27650g0;
                if (pk0Var != null) {
                    pk0Var.p();
                    return;
                }
                return;
            case 17:
                ((nk0) this.f25682b).H.f26973a.setVisibility(4);
                return;
            case 18:
                rk0 rk0Var = (rk0) this.f25682b;
                u71 u71Var2 = rk0Var.f27918n;
                if (u71Var2 != null) {
                    boolean y3 = u71Var2.y();
                    float n10 = ((float) rk0Var.f27918n.n()) / ((float) rk0Var.f27918n.p());
                    if (n10 < rk0Var.f27920s) {
                        rk0Var.f27918n.L(f7 * ((float) u71Var.p()), false);
                    } else if (n10 > rk0Var.v) {
                        rk0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(rk0Var.f27922x, 16L);
                    }
                }
                rk0Var.invalidate();
                return;
            case 19:
                wl0 wl0Var = (wl0) this.f25682b;
                wl0Var.V1 = null;
                wl0Var.U1 = null;
                org.telegram.ui.Cells.z zVar = wl0Var.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.z zVar2 = wl0Var.D1;
                if (zVar2 != null && zVar2.isStateful()) {
                    wl0Var.D1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                jn0 jn0Var = (jn0) this.f25682b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = jn0Var.d;
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
                AndroidUtilities.runOnUIThread(new dn0((Object) jn0Var, (Object) arrayList3, (Object) arrayList4, 0));
                return;
            case 21:
                ((ln0) this.f25682b).invalidateSelf();
                return;
            case 22:
                ((vn0) this.f25682b).f29143f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.ey) this.f25682b).s();
                return;
            case 24:
                ((w70) this.f25682b).s();
                return;
            case 25:
                ((to0) this.f25682b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.u1 u1Var = ((wo0) this.f25682b).f30133n;
                if (u1Var != null) {
                    u1Var.invalidate();
                    return;
                }
                return;
            case 27:
                yo0 yo0Var = (yo0) this.f25682b;
                yo0Var.f30638q = false;
                yo0Var.f30626b.run();
                return;
            case 28:
                ((vq0) ((ci.i2) this.f25682b).f4782b).a1(1);
                return;
            default:
                ar0 ar0Var = (ar0) this.f25682b;
                yq0[] yq0VarArr = ar0Var.f22702a;
                if (ar0Var.f22703b != 1) {
                    for (yq0 yq0Var : yq0VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = yq0Var.d;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        yq0Var.e.setAlpha(0.0f);
                    }
                    ar0Var.E = false;
                    AndroidUtilities.runOnUIThread(ar0Var.G, 4000L);
                    return;
                }
                ar0Var.E = !ar0Var.E;
                for (yq0 yq0Var2 : yq0VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = yq0Var2.d;
                    org.telegram.ui.ActionBar.j5 j5Var3 = yq0Var2.e;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (ar0Var.E) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                AndroidUtilities.runOnUIThread(ar0Var.G, 4000L);
                return;
        }
    }
}
