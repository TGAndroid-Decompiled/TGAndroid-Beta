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
public final class yb0 implements Runnable {
    public final int f32865a;
    public final Object f32866b;

    public yb0(Object obj, int i10) {
        this.f32865a = i10;
        this.f32866b = obj;
    }

    @Override
    public final void run() {
        float f7;
        j81 j81Var;
        switch (this.f32865a) {
            case 0:
                ((zb0) this.f32866b).S.f28342n.l();
                return;
            case 1:
                ((vc0) this.f32866b).a();
                return;
            case 2:
                ((ei.u) this.f32866b).invalidateSelf();
                return;
            case 3:
                ((gd0) this.f32866b).invalidateSelf();
                return;
            case 4:
                ((ae0) this.f32866b).d();
                return;
            case 5:
                je0 je0Var = (je0) this.f32866b;
                je0Var.getClass();
                try {
                    je0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((xe0) this.f32866b).d.start();
                return;
            case 7:
                e00 e00Var = ((cg0) this.f32866b).f25331c.f26932l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 8:
                fg0 fg0Var = (fg0) this.f32866b;
                fg0Var.f26318r = false;
                fg0Var.invalidate();
                return;
            case 9:
                ((ig0) this.f32866b).h = null;
                return;
            case 10:
                ig0 ig0Var = (ig0) ((n2.e) this.f32866b).f17103c;
                ig0Var.d.L(ig0Var.e, false);
                return;
            case 11:
                org.telegram.ui.rt0 rt0Var = (org.telegram.ui.rt0) this.f32866b;
                if (rt0Var.f29558x) {
                    rt0Var.h("pollPosition();");
                }
                if (rt0Var.G) {
                    AndroidUtilities.runOnUIThread(rt0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f32866b).invalidate();
                return;
            case 13:
                dh0 dh0Var = (dh0) ((mg.b) this.f32866b).f16921b;
                dh0Var.d.invalidate();
                dh0Var.e.requestLayout();
                return;
            case 14:
                ((fh0) this.f32866b).f();
                return;
            case 15:
                try {
                    ej0 ej0Var = ((dj0) this.f32866b).f25663b;
                    if (ej0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ej0Var.getParent()).removeView(ej0Var);
                    }
                    ej0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.f32866b).d();
                return;
            case 17:
                gl0 gl0Var = (gl0) this.f32866b;
                gl0Var.f26670x0 = null;
                gl0Var.j();
                fl0 fl0Var = gl0Var.f26644g0;
                if (fl0Var != null) {
                    fl0Var.u();
                    return;
                }
                return;
            case 18:
                ((dl0) this.f32866b).H.f25999a.setVisibility(4);
                return;
            case 19:
                hl0 hl0Var = (hl0) this.f32866b;
                j81 j81Var2 = hl0Var.f26978n;
                if (j81Var2 != null) {
                    boolean y3 = j81Var2.y();
                    float n10 = ((float) hl0Var.f26978n.n()) / ((float) hl0Var.f26978n.p());
                    if (n10 < hl0Var.f26980s) {
                        hl0Var.f26978n.L(f7 * ((float) j81Var.p()), false);
                    } else if (n10 > hl0Var.v) {
                        hl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hl0Var.f26982x, 16L);
                    }
                }
                hl0Var.invalidate();
                return;
            case 20:
                mm0 mm0Var = (mm0) this.f32866b;
                mm0Var.T1 = null;
                mm0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = mm0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = mm0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    mm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                xn0 xn0Var = (xn0) this.f32866b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = xn0Var.d;
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
                AndroidUtilities.runOnUIThread(new lg((Object) xn0Var, (Object) arrayList3, (Object) arrayList4, 18));
                return;
            case 22:
                ((zn0) this.f32866b).invalidateSelf();
                return;
            case 23:
                ((jo0) this.f32866b).f27725f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.nx) this.f32866b).s();
                return;
            case 25:
                ((j80) this.f32866b).s();
                return;
            case 26:
                ((hp0) this.f32866b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.t1 t1Var = ((kp0) this.f32866b).f28112n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 28:
                lp0 lp0Var = (lp0) this.f32866b;
                lp0Var.f28401q = false;
                lp0Var.f28389b.run();
                return;
            default:
                ((ir0) ((ai.u) this.f32866b).f2236b).g1(1);
                return;
        }
    }
}
