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
    public final int f23962a;
    public final Object f23963b;

    public cc0(Object obj, int i10) {
        this.f23962a = i10;
        this.f23963b = obj;
    }

    @Override
    public final void run() {
        float f10;
        i71 i71Var;
        switch (this.f23962a) {
            case 0:
                ((dc0) this.f23963b).z();
                return;
            case 1:
                ((jc0) this.f23963b).invalidateSelf();
                return;
            case 2:
                ((mc0) this.f23963b).invalidateSelf();
                return;
            case 3:
                ((fd0) this.f23963b).d();
                return;
            case 4:
                pd0 pd0Var = (pd0) this.f23963b;
                pd0Var.getClass();
                try {
                    pd0Var.d.F.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((de0) this.f23963b).f24260f.start();
                return;
            case 6:
                vz vzVar = ((if0) this.f23963b).f25703c.f27248i0;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
            case 7:
                lf0 lf0Var = (lf0) this.f23963b;
                lf0Var.f26633r = false;
                lf0Var.invalidate();
                return;
            case 8:
                ((of0) this.f23963b).h = null;
                return;
            case 9:
                of0 of0Var = (of0) ((n7.qa) this.f23963b).f14703c;
                of0Var.d.L(of0Var.e, false);
                return;
            case 10:
                org.telegram.ui.nt0 nt0Var = (org.telegram.ui.nt0) this.f23963b;
                if (nt0Var.f29456x) {
                    nt0Var.h("pollPosition();");
                }
                if (nt0Var.D) {
                    AndroidUtilities.runOnUIThread(nt0Var.I, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f23963b).invalidate();
                return;
            case 12:
                lg0 lg0Var = (lg0) ((hg0) this.f23963b).f25412b;
                lg0Var.d.invalidate();
                lg0Var.e.requestLayout();
                return;
            case 13:
                ((ng0) this.f23963b).f();
                return;
            case 14:
                try {
                    li0 li0Var = ((ki0) this.f23963b).f26279b;
                    if (li0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) li0Var.getParent()).removeView(li0Var);
                    }
                    li0Var.N.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                ((RLottieNative) this.f23963b).d();
                return;
            case 16:
                pk0 pk0Var = (pk0) this.f23963b;
                pk0Var.f27918u0 = null;
                pk0Var.j();
                ok0 ok0Var = pk0Var.f27894d0;
                if (ok0Var != null) {
                    ok0Var.o();
                    return;
                }
                return;
            case 17:
                ((mk0) this.f23963b).E.f27299a.setVisibility(4);
                return;
            case 18:
                rk0 rk0Var = (rk0) this.f23963b;
                i71 i71Var2 = rk0Var.f28485n;
                if (i71Var2 != null) {
                    boolean y10 = i71Var2.y();
                    float n10 = ((float) rk0Var.f28485n.n()) / ((float) rk0Var.f28485n.p());
                    if (n10 < rk0Var.f28487s) {
                        rk0Var.f28485n.L(f10 * ((float) i71Var.p()), false);
                    } else if (n10 > rk0Var.v) {
                        rk0Var.setPlaying(false);
                        y10 = false;
                    }
                    if (y10) {
                        AndroidUtilities.runOnUIThread(rk0Var.f28489x, 16L);
                    }
                }
                rk0Var.invalidate();
                return;
            case 19:
                sl0 sl0Var = (sl0) this.f23963b;
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
                dn0 dn0Var = (dn0) this.f23963b;
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
                AndroidUtilities.runOnUIThread(new hp(dn0Var, arrayList3, arrayList4, 14));
                return;
            case 21:
                ((fn0) this.f23963b).invalidateSelf();
                return;
            case 22:
                ((on0) this.f23963b).f27603f.setVisibility(8);
                return;
            case 23:
                ((org.telegram.ui.xx) this.f23963b).s();
                return;
            case 24:
                ((o70) this.f23963b).s();
                return;
            case 25:
                ((ko0) this.f23963b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.t1 t1Var = ((mo0) this.f23963b).f27093n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 27:
                oo0 oo0Var = (oo0) this.f23963b;
                oo0Var.f27629q = false;
                oo0Var.f27617b.run();
                return;
            case 28:
                ((lq0) ((dh.c) this.f23963b).f4886b).a1(1);
                return;
            default:
                qq0 qq0Var = (qq0) this.f23963b;
                oq0[] oq0VarArr = qq0Var.f28215a;
                if (qq0Var.f28216b != 1) {
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
