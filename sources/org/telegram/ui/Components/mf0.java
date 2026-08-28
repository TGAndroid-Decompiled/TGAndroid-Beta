package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class mf0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f30808a;
    public final Object f30809b;

    public mf0(Object obj, int i9) {
        this.f30808a = i9;
        this.f30809b = obj;
    }

    public void b() {
        switch (this.f30808a) {
            case 0:
                pf0 pf0Var = (pf0) this.f30809b;
                WindowManager.LayoutParams layoutParams = pf0Var.f31627c;
                int t10 = (int) (pf0Var.t() * pf0Var.F);
                layoutParams.width = t10;
                pf0Var.D = t10;
                WindowManager.LayoutParams layoutParams2 = pf0Var.f31627c;
                int r10 = (int) (pf0Var.r() * pf0Var.F);
                layoutParams2.height = r10;
                pf0Var.E = r10;
                try {
                    AndroidUtilities.updateViewLayout(pf0Var.f31625b, pf0Var.d, pf0Var.f31627c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f30809b;
                WindowManager.LayoutParams layoutParams3 = g1Var.f33519c;
                int m10 = (int) (g1Var.m() * g1Var.L);
                layoutParams3.width = m10;
                g1Var.I = m10;
                WindowManager.LayoutParams layoutParams4 = g1Var.f33519c;
                int l10 = (int) (g1Var.l() * g1Var.L);
                layoutParams4.height = l10;
                g1Var.J = l10;
                AndroidUtilities.updateViewLayout(g1Var.f33518b, g1Var.d, g1Var.f33519c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        float dp2;
        int i9;
        switch (this.f30808a) {
            case 0:
                pf0 pf0Var = (pf0) this.f30809b;
                pf0Var.F = g7.n.a(scaleGestureDetector.getScaleFactor() * pf0Var.F, 0.75f, pf0Var.f31623a);
                pf0Var.D = (int) (pf0Var.t() * pf0Var.F);
                pf0Var.E = (int) (pf0Var.r() * pf0Var.F);
                AndroidUtilities.runOnUIThread(new ib0(this, 12));
                float focusX = scaleGestureDetector.getFocusX();
                int i10 = AndroidUtilities.displaySize.x;
                if (focusX >= i10 / 2.0f) {
                    dp = (i10 - pf0Var.D) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.j jVar = pf0Var.I;
                if (!jVar.f18794f) {
                    jVar.f18791b = pf0Var.G;
                    jVar.f18792c = true;
                    jVar.f18800u.f18807i = dp;
                } else {
                    jVar.f18800u.f18807i = dp;
                }
                jVar.f();
                float a2 = g7.n.a(scaleGestureDetector.getFocusY() - (pf0Var.E / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pf0Var.E) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = pf0Var.J;
                if (!jVar2.f18794f) {
                    jVar2.f18791b = pf0Var.H;
                    jVar2.f18792c = true;
                    jVar2.f18800u.f18807i = a2;
                } else {
                    jVar2.f18800u.f18807i = a2;
                }
                jVar2.f();
                return true;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f30809b;
                g1Var.L = g7.n.a(scaleGestureDetector.getScaleFactor() * g1Var.L, 0.6f, g1Var.f33517a);
                g1Var.I = (int) (g1Var.m() * g1Var.L);
                g1Var.J = (int) (g1Var.l() * g1Var.L);
                AndroidUtilities.runOnUIThread(new mh.m2(this, 7));
                o1.j jVar3 = g1Var.O;
                jVar3.f18791b = g1Var.M;
                jVar3.f18792c = true;
                o1.k kVar = jVar3.f18800u;
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i11 / 2.0f) {
                    dp2 = (i11 - g1Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                kVar.f18807i = dp2;
                o1.j jVar4 = g1Var.O;
                if (!jVar4.f18794f) {
                    jVar4.f();
                }
                o1.j jVar5 = g1Var.P;
                jVar5.f18791b = g1Var.N;
                jVar5.f18792c = true;
                jVar5.f18800u.f18807i = g7.n.a(scaleGestureDetector.getFocusY() - (g1Var.J / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = g1Var.P;
                if (!jVar6.f18794f) {
                    jVar6.f();
                }
                return true;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                tf.n nVar = ((tf.b) this.f30809b).f47843b;
                float focusX3 = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = nVar.f47904a;
                ImageView imageView = nVar.f47905b;
                if (!nVar.B) {
                    float f10 = nVar.H.f47897e;
                    if (f10 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f10;
                    }
                    if (!nVar.f47910r) {
                        i9 = AndroidUtilities.statusBarHeight;
                    } else {
                        i9 = 0;
                    }
                    tf.l.g(nVar.H, scaleFactor, tf.l.a(nVar.H) * ((focusX3 - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), tf.l.b(nVar.H) * (org.telegram.messenger.l0.a((imageView.getHeight() - nVar.f47914y) - i9, nVar.A, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    nVar.r(false);
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f30808a) {
            case 0:
                pf0 pf0Var = (pf0) this.f30809b;
                if (pf0Var.f31640w) {
                    pf0Var.f31640w = false;
                    pf0Var.f31626b0 = false;
                    pf0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(pf0Var.f31629d0);
                }
                pf0Var.f31641x = true;
                pf0Var.f31627c.width = (int) (pf0Var.t() * pf0Var.f31623a);
                pf0Var.f31627c.height = (int) (pf0Var.r() * pf0Var.f31623a);
                AndroidUtilities.updateViewLayout(pf0Var.f31625b, pf0Var.d, pf0Var.f31627c);
                return true;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f30809b;
                if (g1Var.D) {
                    g1Var.D = false;
                }
                g1Var.E = true;
                g1Var.f33519c.width = (int) (g1Var.m() * g1Var.f33517a);
                g1Var.f33519c.height = (int) (g1Var.l() * g1Var.f33517a);
                AndroidUtilities.updateViewLayout(g1Var.f33518b, g1Var.d, g1Var.f33519c);
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f30808a) {
            case 0:
                pf0 pf0Var = (pf0) this.f30809b;
                if (!pf0Var.I.f18794f && !pf0Var.J.f18794f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ih.g1 g1Var = new ih.g1(this, arrayList, 1);
                o1.j jVar = pf0Var.I;
                if (!jVar.f18794f) {
                    arrayList.add(jVar);
                } else {
                    jVar.a(g1Var);
                }
                o1.j jVar2 = pf0Var.J;
                if (!jVar2.f18794f) {
                    arrayList.add(jVar2);
                    return;
                } else {
                    jVar2.a(g1Var);
                    return;
                }
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) this.f30809b;
                if (!g1Var2.O.f18794f && !g1Var2.P.f18794f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ih.g1 g1Var3 = new ih.g1(this, arrayList2, 2);
                o1.j jVar3 = g1Var2.O;
                if (!jVar3.f18794f) {
                    arrayList2.add(jVar3);
                } else {
                    jVar3.a(g1Var3);
                }
                o1.j jVar4 = g1Var2.P;
                if (!jVar4.f18794f) {
                    arrayList2.add(jVar4);
                    return;
                } else {
                    jVar4.a(g1Var3);
                    return;
                }
            default:
                return;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
