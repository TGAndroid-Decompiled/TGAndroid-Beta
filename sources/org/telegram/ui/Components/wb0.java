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
public final class wb0 implements Runnable {
    public final int f32178a;
    public final Object f32179b;

    public wb0(Object obj, int i10) {
        this.f32178a = i10;
        this.f32179b = obj;
    }

    @Override
    public final void run() {
        float f7;
        j81 j81Var;
        switch (this.f32178a) {
            case 0:
                ((xb0) this.f32179b).S.f27676n.l();
                return;
            case 1:
                ((tc0) this.f32179b).a();
                return;
            case 2:
                ((ei.u) this.f32179b).invalidateSelf();
                return;
            case 3:
                ((ed0) this.f32179b).invalidateSelf();
                return;
            case 4:
                ((yd0) this.f32179b).d();
                return;
            case 5:
                he0 he0Var = (he0) this.f32179b;
                he0Var.getClass();
                try {
                    he0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((ve0) this.f32179b).d.start();
                return;
            case 7:
                c00 c00Var = ((bg0) this.f32179b).f24999c.f26670l0;
                if (c00Var != null) {
                    c00Var.d(false, true, false);
                    return;
                }
                return;
            case 8:
                eg0 eg0Var = (eg0) this.f32179b;
                eg0Var.f26037r = false;
                eg0Var.invalidate();
                return;
            case 9:
                ((hg0) this.f32179b).h = null;
                return;
            case 10:
                hg0 hg0Var = (hg0) ((n2.e) this.f32179b).f17103c;
                hg0Var.d.L(hg0Var.e, false);
                return;
            case 11:
                org.telegram.ui.qt0 qt0Var = (org.telegram.ui.qt0) this.f32179b;
                if (qt0Var.f29277x) {
                    qt0Var.h("pollPosition();");
                }
                if (qt0Var.G) {
                    AndroidUtilities.runOnUIThread(qt0Var.L, 500L);
                    return;
                }
                return;
            case 12:
                ((FrameLayout) this.f32179b).invalidate();
                return;
            case 13:
                ch0 ch0Var = (ch0) ((mg.b) this.f32179b).f16921b;
                ch0Var.d.invalidate();
                ch0Var.e.requestLayout();
                return;
            case 14:
                ((eh0) this.f32179b).f();
                return;
            case 15:
                try {
                    dj0 dj0Var = ((cj0) this.f32179b).f25345b;
                    if (dj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) dj0Var.getParent()).removeView(dj0Var);
                    }
                    dj0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ((RLottieNative) this.f32179b).d();
                return;
            case 17:
                fl0 fl0Var = (fl0) this.f32179b;
                fl0Var.f26388x0 = null;
                fl0Var.j();
                el0 el0Var = fl0Var.f26362g0;
                if (el0Var != null) {
                    el0Var.u();
                    return;
                }
                return;
            case 18:
                ((cl0) this.f32179b).H.f25779a.setVisibility(4);
                return;
            case 19:
                gl0 gl0Var = (gl0) this.f32179b;
                j81 j81Var2 = gl0Var.f26721n;
                if (j81Var2 != null) {
                    boolean y3 = j81Var2.y();
                    float n10 = ((float) gl0Var.f26721n.n()) / ((float) gl0Var.f26721n.p());
                    if (n10 < gl0Var.f26723s) {
                        gl0Var.f26721n.L(f7 * ((float) j81Var.p()), false);
                    } else if (n10 > gl0Var.v) {
                        gl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(gl0Var.f26725x, 16L);
                    }
                }
                gl0Var.invalidate();
                return;
            case 20:
                lm0 lm0Var = (lm0) this.f32179b;
                lm0Var.T1 = null;
                lm0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = lm0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = lm0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    lm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 21:
                wn0 wn0Var = (wn0) this.f32179b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = wn0Var.d;
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
                AndroidUtilities.runOnUIThread(new jg((Object) wn0Var, (Object) arrayList3, (Object) arrayList4, 18));
                return;
            case 22:
                ((yn0) this.f32179b).invalidateSelf();
                return;
            case 23:
                ((io0) this.f32179b).f27455f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.nx) this.f32179b).s();
                return;
            case 25:
                ((h80) this.f32179b).s();
                return;
            case 26:
                ((gp0) this.f32179b).getClass();
                return;
            case 27:
                org.telegram.ui.Cells.t1 t1Var = ((jp0) this.f32179b).f27773n;
                if (t1Var != null) {
                    t1Var.invalidate();
                    return;
                }
                return;
            case 28:
                kp0 kp0Var = (kp0) this.f32179b;
                kp0Var.f28058q = false;
                kp0Var.f28046b.run();
                return;
            default:
                ((hr0) ((ai.u) this.f32179b).f2236b).g1(1);
                return;
        }
    }
}
