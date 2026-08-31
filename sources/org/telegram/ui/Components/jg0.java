package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class jg0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f28110a;
    public final Object f28111b;

    public jg0(Object obj, int i10) {
        this.f28110a = i10;
        this.f28111b = obj;
    }

    public void b() {
        switch (this.f28110a) {
            case 0:
                ng0 ng0Var = (ng0) this.f28111b;
                WindowManager.LayoutParams layoutParams = ng0Var.f29489c;
                int t6 = (int) (ng0Var.t() * ng0Var.G);
                layoutParams.width = t6;
                ng0Var.E = t6;
                WindowManager.LayoutParams layoutParams2 = ng0Var.f29489c;
                int r10 = (int) (ng0Var.r() * ng0Var.G);
                layoutParams2.height = r10;
                ng0Var.F = r10;
                try {
                    AndroidUtilities.updateViewLayout(ng0Var.f29487b, ng0Var.d, ng0Var.f29489c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f28111b;
                WindowManager.LayoutParams layoutParams3 = h1Var.f32069c;
                int m9 = (int) (h1Var.m() * h1Var.M);
                layoutParams3.width = m9;
                h1Var.J = m9;
                WindowManager.LayoutParams layoutParams4 = h1Var.f32069c;
                int l10 = (int) (h1Var.l() * h1Var.M);
                layoutParams4.height = l10;
                h1Var.K = l10;
                AndroidUtilities.updateViewLayout(h1Var.f32068b, h1Var.d, h1Var.f32069c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        float dp2;
        int i10;
        switch (this.f28110a) {
            case 0:
                ng0 ng0Var = (ng0) this.f28111b;
                ng0Var.G = k7.o.a(scaleGestureDetector.getScaleFactor() * ng0Var.G, 0.75f, ng0Var.f29485a);
                ng0Var.E = (int) (ng0Var.t() * ng0Var.G);
                ng0Var.F = (int) (ng0Var.r() * ng0Var.G);
                AndroidUtilities.runOnUIThread(new ec0(this, 12));
                float focusX = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX >= i11 / 2.0f) {
                    dp = (i11 - ng0Var.E) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.j jVar = ng0Var.J;
                if (!jVar.f16330f) {
                    jVar.f16327b = ng0Var.H;
                    jVar.f16328c = true;
                    jVar.f16336u.f16343i = dp;
                } else {
                    jVar.f16336u.f16343i = dp;
                }
                jVar.f();
                float a2 = k7.o.a(scaleGestureDetector.getFocusY() - (ng0Var.F / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ng0Var.F) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = ng0Var.K;
                if (!jVar2.f16330f) {
                    jVar2.f16327b = ng0Var.I;
                    jVar2.f16328c = true;
                    jVar2.f16336u.f16343i = a2;
                } else {
                    jVar2.f16336u.f16343i = a2;
                }
                jVar2.f();
                return true;
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f28111b;
                h1Var.M = k7.o.a(scaleGestureDetector.getScaleFactor() * h1Var.M, 0.6f, h1Var.f32067a);
                h1Var.J = (int) (h1Var.m() * h1Var.M);
                h1Var.K = (int) (h1Var.l() * h1Var.M);
                AndroidUtilities.runOnUIThread(new oh.t3(this, 20));
                o1.j jVar3 = h1Var.P;
                jVar3.f16327b = h1Var.N;
                jVar3.f16328c = true;
                o1.k kVar = jVar3.f16336u;
                float focusX2 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i12 / 2.0f) {
                    dp2 = (i12 - h1Var.J) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                kVar.f16343i = dp2;
                o1.j jVar4 = h1Var.P;
                if (!jVar4.f16330f) {
                    jVar4.f();
                }
                o1.j jVar5 = h1Var.Q;
                jVar5.f16327b = h1Var.O;
                jVar5.f16328c = true;
                jVar5.f16336u.f16343i = k7.o.a(scaleGestureDetector.getFocusY() - (h1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.K) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = h1Var.Q;
                if (!jVar6.f16330f) {
                    jVar6.f();
                }
                return true;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                zf.n nVar = ((zf.b) this.f28111b).f51104b;
                float focusX3 = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = nVar.f51165a;
                ImageView imageView = nVar.f51166b;
                if (!nVar.C) {
                    float f10 = nVar.I.f51158e;
                    if (f10 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f10;
                    }
                    if (!nVar.f51171r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    zf.l.g(nVar.I, scaleFactor, zf.l.a(nVar.I) * ((focusX3 - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), zf.l.b(nVar.I) * (org.telegram.messenger.y3.a((imageView.getHeight() - nVar.f51175y) - i10, nVar.B, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    nVar.r(false);
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f28110a) {
            case 0:
                ng0 ng0Var = (ng0) this.f28111b;
                if (ng0Var.f29503w) {
                    ng0Var.f29503w = false;
                    ng0Var.f29490c0 = false;
                    ng0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ng0Var.f29493e0);
                }
                ng0Var.f29504x = true;
                ng0Var.f29489c.width = (int) (ng0Var.t() * ng0Var.f29485a);
                ng0Var.f29489c.height = (int) (ng0Var.r() * ng0Var.f29485a);
                AndroidUtilities.updateViewLayout(ng0Var.f29487b, ng0Var.d, ng0Var.f29489c);
                return true;
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f28111b;
                if (h1Var.E) {
                    h1Var.E = false;
                }
                h1Var.F = true;
                h1Var.f32069c.width = (int) (h1Var.m() * h1Var.f32067a);
                h1Var.f32069c.height = (int) (h1Var.l() * h1Var.f32067a);
                AndroidUtilities.updateViewLayout(h1Var.f32068b, h1Var.d, h1Var.f32069c);
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f28110a) {
            case 0:
                ng0 ng0Var = (ng0) this.f28111b;
                if (!ng0Var.J.f16330f && !ng0Var.K.f16330f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                oh.f1 f1Var = new oh.f1(this, arrayList, 1);
                o1.j jVar = ng0Var.J;
                if (!jVar.f16330f) {
                    arrayList.add(jVar);
                } else {
                    jVar.a(f1Var);
                }
                o1.j jVar2 = ng0Var.K;
                if (!jVar2.f16330f) {
                    arrayList.add(jVar2);
                    return;
                } else {
                    jVar2.a(f1Var);
                    return;
                }
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f28111b;
                if (!h1Var.P.f16330f && !h1Var.Q.f16330f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                oh.f1 f1Var2 = new oh.f1(this, arrayList2, 2);
                o1.j jVar3 = h1Var.P;
                if (!jVar3.f16330f) {
                    arrayList2.add(jVar3);
                } else {
                    jVar3.a(f1Var2);
                }
                o1.j jVar4 = h1Var.Q;
                if (!jVar4.f16330f) {
                    arrayList2.add(jVar4);
                    return;
                } else {
                    jVar4.a(f1Var2);
                    return;
                }
            default:
                return;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
