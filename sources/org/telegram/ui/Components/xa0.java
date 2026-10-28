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
public final class xa0 implements Runnable {
    public final int f34713a;
    public final Object f34714b;

    public xa0(Object obj, int i10) {
        this.f34713a = i10;
        this.f34714b = obj;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        float max;
        int i11;
        o1.j jVar;
        float f10;
        t81 t81Var;
        switch (this.f34713a) {
            case 0:
                final hb0 hb0Var = (hb0) this.f34714b;
                boolean z10 = hb0Var.I;
                boolean z11 = !z10;
                ig.p1 p1Var = hb0Var.e;
                gb0 gb0Var = hb0Var.f28941b;
                if (gb0Var != null && p1Var != null) {
                    if (hb0Var.L && (jVar = hb0Var.K) != null && jVar.f18962f && !z10) {
                        hb0Var.O = 0;
                        return;
                    }
                    boolean g7 = hb0Var.g();
                    if (!z10) {
                        f7 = (-hb0Var.f28946s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = gb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + hb0Var.f28946s;
                        if (computeVerticalScrollRange <= 0 && hb0Var.f28943f.K() > 0 && (i10 = hb0Var.O) < 3) {
                            hb0Var.O = i10 + 1;
                            hb0Var.o(true);
                            return;
                        }
                    }
                    hb0Var.O = 0;
                    float f11 = 0.0f;
                    float f12 = hb0Var.v;
                    if (g7) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z10 && !g7) {
                        max += gb0Var.computeVerticalScrollOffset();
                    }
                    o1.j jVar2 = hb0Var.K;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    hb0Var.L = z11;
                    final float translationY = gb0Var.getTranslationY();
                    final float f13 = hb0Var.M;
                    if (!z10) {
                        f11 = 1.0f;
                    }
                    Integer num = null;
                    if (translationY == max) {
                        hb0Var.K = null;
                        if (!z10) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        num = Integer.valueOf(i11);
                        if (hb0Var.N && !z10) {
                            hb0Var.N = false;
                            gb0Var.setLayoutManager(hb0Var.getNeededLayoutManager());
                            hb0Var.I = true;
                            hb0Var.o(true);
                        }
                    } else {
                        o1.j jVar3 = new o1.j(new ac.a(translationY));
                        o1.k kVar = new o1.k(max);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.f18968u = kVar;
                        hb0Var.K = jVar3;
                        final float f14 = max;
                        final float f15 = f11;
                        jVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                hb0 hb0Var2 = hb0.this;
                                hb0Var2.f28941b.setTranslationY(f16);
                                hb0Var2.i();
                                float f18 = translationY;
                                hb0Var2.M = AndroidUtilities.lerp(f13, f15, (f16 - f18) / (f14 - f18));
                            }
                        });
                        if (!z10) {
                            hb0Var.K.a(new fi.p4(hb0Var, z11, 2));
                        }
                        hb0Var.K.a(new Object());
                        hb0Var.K.h();
                    }
                    if (num != null && hb0Var.getVisibility() != num.intValue()) {
                        hb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                hb0Var.O = 0;
                return;
            case 1:
                ((wb0) this.f34714b).S.f29308n.l();
                return;
            case 2:
                ((sc0) this.f34714b).a();
                return;
            case 3:
                ((fi.u) this.f34714b).invalidateSelf();
                return;
            case 4:
                ((dd0) this.f34714b).invalidateSelf();
                return;
            case 5:
                ((xd0) this.f34714b).d();
                return;
            case 6:
                ge0 ge0Var = (ge0) this.f34714b;
                ge0Var.getClass();
                try {
                    ge0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                ((ue0) this.f34714b).d.start();
                return;
            case 8:
                e00 e00Var = ((ag0) this.f34714b).f26552c.f28136l0;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 9:
                dg0 dg0Var = (dg0) this.f34714b;
                dg0Var.f27435r = false;
                dg0Var.invalidate();
                return;
            case 10:
                ((gg0) this.f34714b).h = null;
                return;
            case 11:
                gg0 gg0Var = (gg0) ((m4.w1) this.f34714b).f18293c;
                gg0Var.d.L(gg0Var.e, false);
                return;
            case 12:
                org.telegram.ui.xt0 xt0Var = (org.telegram.ui.xt0) this.f34714b;
                if (xt0Var.f30914x) {
                    xt0Var.h("pollPosition();");
                }
                if (xt0Var.G) {
                    AndroidUtilities.runOnUIThread(xt0Var.L, 500L);
                    return;
                }
                return;
            case 13:
                ((FrameLayout) this.f34714b).invalidate();
                return;
            case 14:
                dh0 dh0Var = (dh0) ((ng.b) this.f34714b).f18783b;
                dh0Var.d.invalidate();
                dh0Var.e.requestLayout();
                return;
            case 15:
                ((fh0) this.f34714b).f();
                return;
            case 16:
                try {
                    ej0 ej0Var = ((dj0) this.f34714b).f27474b;
                    if (ej0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ej0Var.getParent()).removeView(ej0Var);
                    }
                    ej0Var.Q.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 17:
                ((RLottieNative) this.f34714b).d();
                return;
            case 18:
                gl0 gl0Var = (gl0) this.f34714b;
                gl0Var.f28648x0 = null;
                gl0Var.j();
                fl0 fl0Var = gl0Var.f28622g0;
                if (fl0Var != null) {
                    fl0Var.m();
                    return;
                }
                return;
            case 19:
                ((dl0) this.f34714b).H.f27876a.setVisibility(4);
                return;
            case 20:
                hl0 hl0Var = (hl0) this.f34714b;
                t81 t81Var2 = hl0Var.f29017n;
                if (t81Var2 != null) {
                    boolean y3 = t81Var2.y();
                    float n10 = ((float) hl0Var.f29017n.n()) / ((float) hl0Var.f29017n.p());
                    if (n10 < hl0Var.f29019s) {
                        hl0Var.f29017n.L(f10 * ((float) t81Var.p()), false);
                    } else if (n10 > hl0Var.v) {
                        hl0Var.setPlaying(false);
                        y3 = false;
                    }
                    if (y3) {
                        AndroidUtilities.runOnUIThread(hl0Var.f29021x, 16L);
                    }
                }
                hl0Var.invalidate();
                return;
            case 21:
                nm0 nm0Var = (nm0) this.f34714b;
                nm0Var.T1 = null;
                nm0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = nm0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = nm0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    nm0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 22:
                bn0 bn0Var = (bn0) this.f34714b;
                if (bn0Var.f26871r && bn0Var.m() != bn0Var.f26874x) {
                    bn0Var.r("on screen, settled after start", true);
                    return;
                }
                return;
            case 23:
                do0 do0Var = (do0) this.f34714b;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i12 = do0Var.d;
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
                AndroidUtilities.runOnUIThread(new kg(do0Var, arrayList3, arrayList4, 19));
                return;
            case 24:
                ((fo0) this.f34714b).invalidateSelf();
                return;
            case 25:
                ((po0) this.f34714b).f31686f.setVisibility(8);
                return;
            case 26:
                ((org.telegram.ui.mx) this.f34714b).s();
                return;
            case 27:
                ((l80) this.f34714b).s();
                return;
            case 28:
                ((hp0) this.f34714b).setOverscrolling(false);
                return;
            default:
                ((mp0) this.f34714b).getClass();
                return;
        }
    }
}
