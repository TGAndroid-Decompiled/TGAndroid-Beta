package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ig0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f25704a;
    public final Object f25705b;

    public ig0(Object obj, int i10) {
        this.f25704a = i10;
        this.f25705b = obj;
    }

    public void b() {
        switch (this.f25704a) {
            case 0:
                mg0 mg0Var = (mg0) this.f25705b;
                WindowManager.LayoutParams layoutParams = mg0Var.f27041c;
                int t6 = (int) (mg0Var.t() * mg0Var.G);
                layoutParams.width = t6;
                mg0Var.E = t6;
                WindowManager.LayoutParams layoutParams2 = mg0Var.f27041c;
                int r10 = (int) (mg0Var.r() * mg0Var.G);
                layoutParams2.height = r10;
                mg0Var.F = r10;
                try {
                    AndroidUtilities.updateViewLayout(mg0Var.f27039b, mg0Var.d, mg0Var.f27041c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f25705b;
                WindowManager.LayoutParams layoutParams3 = g1Var.f29611c;
                int m9 = (int) (g1Var.m() * g1Var.M);
                layoutParams3.width = m9;
                g1Var.J = m9;
                WindowManager.LayoutParams layoutParams4 = g1Var.f29611c;
                int l10 = (int) (g1Var.l() * g1Var.M);
                layoutParams4.height = l10;
                g1Var.K = l10;
                AndroidUtilities.updateViewLayout(g1Var.f29610b, g1Var.d, g1Var.f29611c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        float dp2;
        int i10;
        switch (this.f25704a) {
            case 0:
                mg0 mg0Var = (mg0) this.f25705b;
                mg0Var.G = k7.n.a(scaleGestureDetector.getScaleFactor() * mg0Var.G, 0.75f, mg0Var.f27037a);
                mg0Var.E = (int) (mg0Var.t() * mg0Var.G);
                mg0Var.F = (int) (mg0Var.r() * mg0Var.G);
                AndroidUtilities.runOnUIThread(new dc0(this, 12));
                float focusX = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX >= i11 / 2.0f) {
                    dp = (i11 - mg0Var.E) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.j jVar = mg0Var.J;
                if (!jVar.f16172f) {
                    jVar.f16170b = mg0Var.H;
                    jVar.f16171c = true;
                    jVar.f16178u.f16184i = dp;
                } else {
                    jVar.f16178u.f16184i = dp;
                }
                jVar.f();
                float a2 = k7.n.a(scaleGestureDetector.getFocusY() - (mg0Var.F / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - mg0Var.F) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = mg0Var.K;
                if (!jVar2.f16172f) {
                    jVar2.f16170b = mg0Var.I;
                    jVar2.f16171c = true;
                    jVar2.f16178u.f16184i = a2;
                } else {
                    jVar2.f16178u.f16184i = a2;
                }
                jVar2.f();
                return true;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f25705b;
                g1Var.M = k7.n.a(scaleGestureDetector.getScaleFactor() * g1Var.M, 0.6f, g1Var.f29609a);
                g1Var.J = (int) (g1Var.m() * g1Var.M);
                g1Var.K = (int) (g1Var.l() * g1Var.M);
                AndroidUtilities.runOnUIThread(new nh.n5(this, 21));
                o1.j jVar3 = g1Var.P;
                jVar3.f16170b = g1Var.N;
                jVar3.f16171c = true;
                o1.k kVar = jVar3.f16178u;
                float focusX2 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i12 / 2.0f) {
                    dp2 = (i12 - g1Var.J) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                kVar.f16184i = dp2;
                o1.j jVar4 = g1Var.P;
                if (!jVar4.f16172f) {
                    jVar4.f();
                }
                o1.j jVar5 = g1Var.Q;
                jVar5.f16170b = g1Var.O;
                jVar5.f16171c = true;
                jVar5.f16178u.f16184i = k7.n.a(scaleGestureDetector.getFocusY() - (g1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = g1Var.Q;
                if (!jVar6.f16172f) {
                    jVar6.f();
                }
                return true;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                yf.n nVar = ((yf.b) this.f25705b).f47256b;
                float focusX3 = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = nVar.f47310a;
                ImageView imageView = nVar.f47311b;
                if (!nVar.C) {
                    float f10 = nVar.I.e;
                    if (f10 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f10;
                    }
                    if (!nVar.f47315r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    yf.l.g(nVar.I, scaleFactor, yf.l.a(nVar.I) * ((focusX3 - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), yf.l.b(nVar.I) * (org.telegram.messenger.y3.a((imageView.getHeight() - nVar.f47319y) - i10, nVar.B, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    nVar.r(false);
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f25704a) {
            case 0:
                mg0 mg0Var = (mg0) this.f25705b;
                if (mg0Var.f27054w) {
                    mg0Var.f27054w = false;
                    mg0Var.f27042c0 = false;
                    mg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(mg0Var.f27044e0);
                }
                mg0Var.f27055x = true;
                mg0Var.f27041c.width = (int) (mg0Var.t() * mg0Var.f27037a);
                mg0Var.f27041c.height = (int) (mg0Var.r() * mg0Var.f27037a);
                AndroidUtilities.updateViewLayout(mg0Var.f27039b, mg0Var.d, mg0Var.f27041c);
                return true;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f25705b;
                if (g1Var.E) {
                    g1Var.E = false;
                }
                g1Var.F = true;
                g1Var.f29611c.width = (int) (g1Var.m() * g1Var.f29609a);
                g1Var.f29611c.height = (int) (g1Var.l() * g1Var.f29609a);
                AndroidUtilities.updateViewLayout(g1Var.f29610b, g1Var.d, g1Var.f29611c);
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f25704a) {
            case 0:
                mg0 mg0Var = (mg0) this.f25705b;
                if (!mg0Var.J.f16172f && !mg0Var.K.f16172f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                nh.f1 f1Var = new nh.f1(this, arrayList, 1);
                o1.j jVar = mg0Var.J;
                if (!jVar.f16172f) {
                    arrayList.add(jVar);
                } else {
                    jVar.a(f1Var);
                }
                o1.j jVar2 = mg0Var.K;
                if (!jVar2.f16172f) {
                    arrayList.add(jVar2);
                    return;
                } else {
                    jVar2.a(f1Var);
                    return;
                }
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f25705b;
                if (!g1Var.P.f16172f && !g1Var.Q.f16172f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                nh.f1 f1Var2 = new nh.f1(this, arrayList2, 2);
                o1.j jVar3 = g1Var.P;
                if (!jVar3.f16172f) {
                    arrayList2.add(jVar3);
                } else {
                    jVar3.a(f1Var2);
                }
                o1.j jVar4 = g1Var.Q;
                if (!jVar4.f16172f) {
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
