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
public final class wa0 implements Runnable {
    public final int f34394a;
    public final Object f34395b;

    public wa0(Object obj, int i10) {
        this.f34394a = i10;
        this.f34395b = obj;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        float max;
        int i11;
        o1.j jVar;
        float f10;
        s81 s81Var;
        switch (this.f34394a) {
            case 0:
                final gb0 gb0Var = (gb0) this.f34395b;
                boolean z10 = gb0Var.I;
                boolean z11 = !z10;
                ig.p1 p1Var = gb0Var.e;
                fb0 fb0Var = gb0Var.f28518b;
                if (fb0Var != null && p1Var != null) {
                    if (gb0Var.L && (jVar = gb0Var.K) != null && jVar.f18963f && !z10) {
                        gb0Var.O = 0;
                        return;
                    }
                    boolean g7 = gb0Var.g();
                    if (!z10) {
                        f7 = (-gb0Var.f28523s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = fb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + gb0Var.f28523s;
                        if (computeVerticalScrollRange <= 0 && gb0Var.f28520f.K() > 0 && (i10 = gb0Var.O) < 3) {
                            gb0Var.O = i10 + 1;
                            gb0Var.o(true);
                            return;
                        }
                    }
                    gb0Var.O = 0;
                    float f11 = 0.0f;
                    float f12 = gb0Var.v;
                    if (g7) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z10 && !g7) {
                        max += fb0Var.computeVerticalScrollOffset();
                    }
                    o1.j jVar2 = gb0Var.K;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    gb0Var.L = z11;
                    final float translationY = fb0Var.getTranslationY();
                    final float f13 = gb0Var.M;
                    if (!z10) {
                        f11 = 1.0f;
                    }
                    Integer num = null;
                    if (translationY == max) {
                        gb0Var.K = null;
                        if (!z10) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        num = Integer.valueOf(i11);
                        if (gb0Var.N && !z10) {
                            gb0Var.N = false;
                            fb0Var.setLayoutManager(gb0Var.getNeededLayoutManager());
                            gb0Var.I = true;
                            gb0Var.o(true);
                        }
                    } else {
                        o1.j jVar3 = new o1.j(new ac.a(translationY));
                        o1.k kVar = new o1.k(max);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.f18969u = kVar;
                        gb0Var.K = jVar3;
                        final float f14 = max;
                        final float f15 = f11;
                        jVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                gb0 gb0Var2 = gb0.this;
                                gb0Var2.f28518b.setTranslationY(f16);
                                gb0Var2.i();
                                float f18 = translationY;
                                gb0Var2.M = AndroidUtilities.lerp(f13, f15, (f16 - f18) / (f14 - f18));
                            }
                        });
                        if (!z10) {
                            gb0Var.K.a(new fi.p4(gb0Var, z11, 2));
                        }
                        gb0Var.K.a(new Object());
                        gb0Var.K.h();
                    }
                    if (num != null && gb0Var.getVisibility() != num.intValue()) {
                        gb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                gb0Var.O = 0;
                return;
            case 1:
                ((vb0) this.f34395b).S.f28919n.l();
                return;
            case 2:
                ((rc0) this.f34395b).a();
                return;
            case 3:
                ((fi.u) this.f34395b).invalidateSelf();
                return;
            case 4:
                ((cd0) this.f34395b).invalidateSelf();
                return;
            case 5:
                ((wd0) this.f34395b).d();
                return;
            case 6:
                fe0 fe0Var = (fe0) this.f34395b;
                fe0Var.getClass();
                try {
                    fe0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                ((te0) this.f34395b).d.start();
                return;
            case 8:
                e00 e00Var = ((zf0) this.f34395b).f35319c.f27841l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 9:
                cg0 cg0Var = (cg0) this.f34395b;
                cg0Var.f27147r = false;
                cg0Var.invalidate();
                return;
            case 10:
                ((fg0) this.f34395b).h = null;
                return;
            case 11:
                fg0 fg0Var = (fg0) ((m4.w1) this.f34395b).f18294c;
                fg0Var.d.L(fg0Var.e, false);
                return;
            case 12:
                org.telegram.ui.vt0 vt0Var = (org.telegram.ui.vt0) this.f34395b;
                if (vt0Var.f30580x) {
                    vt0Var.h("pollPosition();");
                }
                if (vt0Var.G) {
                    AndroidUtilities.runOnUIThread(vt0Var.L, 500L);
                    return;
                }
                return;
            case 13:
                ((FrameLayout) this.f34395b).invalidate();
                return;
            case 14:
                ch0 ch0Var = (ch0) ((ng.b) this.f34395b).f18784b;
                ch0Var.d.invalidate();
                ch0Var.e.requestLayout();
                return;
            case 15:
                ((eh0) this.f34395b).f();
                return;
            case 16:
                try {
                    dj0 dj0Var = ((cj0) this.f34395b).f27186b;
                    if (dj0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) dj0Var.getParent()).removeView(dj0Var);
                    }
                    dj0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 17:
                ((RLottieNative) this.f34395b).d();
                return;
            case 18:
                fl0 fl0Var = (fl0) this.f34395b;
                fl0Var.f28268x0 = null;
                fl0Var.j();
                el0 el0Var = fl0Var.f28242g0;
                if (el0Var != null) {
                    el0Var.m();
                    return;
                }
                return;
            case 19:
                ((cl0) this.f34395b).H.f27548a.setVisibility(4);
                return;
            case 20:
                gl0 gl0Var = (gl0) this.f34395b;
                s81 s81Var2 = gl0Var.f28592n;
                if (s81Var2 != null) {
                    boolean y3 = s81Var2.y();
                    float n10 = ((float) gl0Var.f28592n.n()) / ((float) gl0Var.f28592n.p());
                    if (n10 < gl0Var.f28594s) {
                        gl0Var.f28592n.L(f10 * ((float) s81Var.p()), false);
                    } else if (n10 > gl0Var.v) {
                        gl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(gl0Var.f28596x, 16L);
                    }
                }
                gl0Var.invalidate();
                return;
            case 21:
                mm0 mm0Var = (mm0) this.f34395b;
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
            case 22:
                an0 an0Var = (an0) this.f34395b;
                if (an0Var.f26581r && an0Var.h() != an0Var.f26584x) {
                    an0Var.m("on screen, settled after start", true);
                    return;
                }
                return;
            case 23:
                co0 co0Var = (co0) this.f34395b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i12 = co0Var.d;
                FileLoader.getInstance(i12).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(i12).getRecentLoadingFiles(arrayList2);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (FileLoader.getInstance(i12).getPathToMessage(arrayList.get(i13).messageOwner).exists()) {
                        arrayList3.add(arrayList.get(i13));
                    }
                }
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    if (!FileLoader.getInstance(i12).getPathToMessage(arrayList2.get(i14).messageOwner).exists()) {
                        arrayList4.add(arrayList2.get(i14));
                    }
                }
                AndroidUtilities.runOnUIThread(new kg(co0Var, arrayList3, arrayList4, 19));
                return;
            case 24:
                ((eo0) this.f34395b).invalidateSelf();
                return;
            case 25:
                ((oo0) this.f34395b).f31337f.setVisibility(8);
                return;
            case 26:
                ((org.telegram.ui.jx) this.f34395b).s();
                return;
            case 27:
                ((k80) this.f34395b).s();
                return;
            case 28:
                ((gp0) this.f34395b).setOverscrolling(false);
                return;
            default:
                ((lp0) this.f34395b).getClass();
                return;
        }
    }
}
