package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class hg0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f25411a;
    public final Object f25412b;

    public hg0(Object obj, int i10) {
        this.f25411a = i10;
        this.f25412b = obj;
    }

    public void b() {
        switch (this.f25411a) {
            case 0:
                lg0 lg0Var = (lg0) this.f25412b;
                WindowManager.LayoutParams layoutParams = lg0Var.f26662c;
                int t6 = (int) (lg0Var.t() * lg0Var.G);
                layoutParams.width = t6;
                lg0Var.E = t6;
                WindowManager.LayoutParams layoutParams2 = lg0Var.f26662c;
                int r10 = (int) (lg0Var.r() * lg0Var.G);
                layoutParams2.height = r10;
                lg0Var.F = r10;
                try {
                    AndroidUtilities.updateViewLayout(lg0Var.f26660b, lg0Var.d, lg0Var.f26662c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f25412b;
                WindowManager.LayoutParams layoutParams3 = g1Var.f29639c;
                int m9 = (int) (g1Var.m() * g1Var.M);
                layoutParams3.width = m9;
                g1Var.J = m9;
                WindowManager.LayoutParams layoutParams4 = g1Var.f29639c;
                int l10 = (int) (g1Var.l() * g1Var.M);
                layoutParams4.height = l10;
                g1Var.K = l10;
                AndroidUtilities.updateViewLayout(g1Var.f29638b, g1Var.d, g1Var.f29639c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        float dp2;
        int i10;
        switch (this.f25411a) {
            case 0:
                lg0 lg0Var = (lg0) this.f25412b;
                lg0Var.G = k7.n.a(scaleGestureDetector.getScaleFactor() * lg0Var.G, 0.75f, lg0Var.f26658a);
                lg0Var.E = (int) (lg0Var.t() * lg0Var.G);
                lg0Var.F = (int) (lg0Var.r() * lg0Var.G);
                AndroidUtilities.runOnUIThread(new cc0(this, 12));
                float focusX = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX >= i11 / 2.0f) {
                    dp = (i11 - lg0Var.E) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.j jVar = lg0Var.J;
                if (!jVar.f16192f) {
                    jVar.f16190b = lg0Var.H;
                    jVar.f16191c = true;
                    jVar.f16198u.f16204i = dp;
                } else {
                    jVar.f16198u.f16204i = dp;
                }
                jVar.f();
                float a2 = k7.n.a(scaleGestureDetector.getFocusY() - (lg0Var.F / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - lg0Var.F) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = lg0Var.K;
                if (!jVar2.f16192f) {
                    jVar2.f16190b = lg0Var.I;
                    jVar2.f16191c = true;
                    jVar2.f16198u.f16204i = a2;
                } else {
                    jVar2.f16198u.f16204i = a2;
                }
                jVar2.f();
                return true;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f25412b;
                g1Var.M = k7.n.a(scaleGestureDetector.getScaleFactor() * g1Var.M, 0.6f, g1Var.f29637a);
                g1Var.J = (int) (g1Var.m() * g1Var.M);
                g1Var.K = (int) (g1Var.l() * g1Var.M);
                AndroidUtilities.runOnUIThread(new nh.n5(this, 21));
                o1.j jVar3 = g1Var.P;
                jVar3.f16190b = g1Var.N;
                jVar3.f16191c = true;
                o1.k kVar = jVar3.f16198u;
                float focusX2 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i12 / 2.0f) {
                    dp2 = (i12 - g1Var.J) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                kVar.f16204i = dp2;
                o1.j jVar4 = g1Var.P;
                if (!jVar4.f16192f) {
                    jVar4.f();
                }
                o1.j jVar5 = g1Var.Q;
                jVar5.f16190b = g1Var.O;
                jVar5.f16191c = true;
                jVar5.f16198u.f16204i = k7.n.a(scaleGestureDetector.getFocusY() - (g1Var.K / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = g1Var.Q;
                if (!jVar6.f16192f) {
                    jVar6.f();
                }
                return true;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                yf.n nVar = ((yf.b) this.f25412b).f47192b;
                float focusX3 = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = nVar.f47246a;
                ImageView imageView = nVar.f47247b;
                if (!nVar.C) {
                    float f10 = nVar.I.e;
                    if (f10 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f10;
                    }
                    if (!nVar.f47251r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    yf.l.g(nVar.I, scaleFactor, yf.l.a(nVar.I) * ((focusX3 - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), yf.l.b(nVar.I) * (org.telegram.messenger.y3.a((imageView.getHeight() - nVar.f47255y) - i10, nVar.B, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    nVar.r(false);
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f25411a) {
            case 0:
                lg0 lg0Var = (lg0) this.f25412b;
                if (lg0Var.f26675w) {
                    lg0Var.f26675w = false;
                    lg0Var.f26663c0 = false;
                    lg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(lg0Var.f26665e0);
                }
                lg0Var.f26676x = true;
                lg0Var.f26662c.width = (int) (lg0Var.t() * lg0Var.f26658a);
                lg0Var.f26662c.height = (int) (lg0Var.r() * lg0Var.f26658a);
                AndroidUtilities.updateViewLayout(lg0Var.f26660b, lg0Var.d, lg0Var.f26662c);
                return true;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f25412b;
                if (g1Var.E) {
                    g1Var.E = false;
                }
                g1Var.F = true;
                g1Var.f29639c.width = (int) (g1Var.m() * g1Var.f29637a);
                g1Var.f29639c.height = (int) (g1Var.l() * g1Var.f29637a);
                AndroidUtilities.updateViewLayout(g1Var.f29638b, g1Var.d, g1Var.f29639c);
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f25411a) {
            case 0:
                lg0 lg0Var = (lg0) this.f25412b;
                if (!lg0Var.J.f16192f && !lg0Var.K.f16192f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                nh.f1 f1Var = new nh.f1(this, arrayList, 1);
                o1.j jVar = lg0Var.J;
                if (!jVar.f16192f) {
                    arrayList.add(jVar);
                } else {
                    jVar.a(f1Var);
                }
                o1.j jVar2 = lg0Var.K;
                if (!jVar2.f16192f) {
                    arrayList.add(jVar2);
                    return;
                } else {
                    jVar2.a(f1Var);
                    return;
                }
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f25412b;
                if (!g1Var.P.f16192f && !g1Var.Q.f16192f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                nh.f1 f1Var2 = new nh.f1(this, arrayList2, 2);
                o1.j jVar3 = g1Var.P;
                if (!jVar3.f16192f) {
                    arrayList2.add(jVar3);
                } else {
                    jVar3.a(f1Var2);
                }
                o1.j jVar4 = g1Var.Q;
                if (!jVar4.f16192f) {
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
