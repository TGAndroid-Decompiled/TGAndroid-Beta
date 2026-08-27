package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

public final class pf0 implements ScaleGestureDetector.OnScaleGestureListener {

    public final int f31595a;

    public final Object f31596b;

    public pf0(Object obj, int i10) {
        this.f31595a = i10;
        this.f31596b = obj;
    }

    public void b() {
        switch (this.f31595a) {
            case 0:
                sf0 sf0Var = (sf0) this.f31596b;
                WindowManager.LayoutParams layoutParams = sf0Var.f32420c;
                int iT = (int) (sf0Var.t() * sf0Var.F);
                layoutParams.width = iT;
                sf0Var.D = iT;
                WindowManager.LayoutParams layoutParams2 = sf0Var.f32420c;
                int iR = (int) (sf0Var.r() * sf0Var.F);
                layoutParams2.height = iR;
                sf0Var.E = iR;
                try {
                    AndroidUtilities.updateViewLayout(sf0Var.f32418b, sf0Var.d, sf0Var.f32420c);
                } catch (IllegalArgumentException unused) {
                    return;
                }
                break;
            default:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f31596b;
                WindowManager.LayoutParams layoutParams3 = g1Var.f33569c;
                int iM = (int) (g1Var.m() * g1Var.L);
                layoutParams3.width = iM;
                g1Var.I = iM;
                WindowManager.LayoutParams layoutParams4 = g1Var.f33569c;
                int iL = (int) (g1Var.l() * g1Var.L);
                layoutParams4.height = iL;
                g1Var.J = iL;
                AndroidUtilities.updateViewLayout(g1Var.f33568b, g1Var.d, g1Var.f33569c);
                break;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f31595a) {
            case 0:
                sf0 sf0Var = (sf0) this.f31596b;
                sf0Var.F = h7.n.a(scaleGestureDetector.getScaleFactor() * sf0Var.F, 0.75f, sf0Var.f32416a);
                sf0Var.D = (int) (sf0Var.t() * sf0Var.F);
                sf0Var.E = (int) (sf0Var.r() * sf0Var.F);
                AndroidUtilities.runOnUIThread(new mb0(this, 12));
                float focusX = scaleGestureDetector.getFocusX();
                int i10 = AndroidUtilities.displaySize.x;
                float fDp = focusX >= ((float) i10) / 2.0f ? (i10 - sf0Var.D) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar = sf0Var.I;
                if (jVar.f19141f) {
                    jVar.f19147u.f19154i = fDp;
                } else {
                    jVar.f19138b = sf0Var.G;
                    jVar.f19139c = true;
                    jVar.f19147u.f19154i = fDp;
                }
                jVar.f();
                float fA = h7.n.a(scaleGestureDetector.getFocusY() - (sf0Var.E / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - sf0Var.E) - AndroidUtilities.dp(16.0f));
                o1.j jVar2 = sf0Var.J;
                if (jVar2.f19141f) {
                    jVar2.f19147u.f19154i = fA;
                } else {
                    jVar2.f19138b = sf0Var.H;
                    jVar2.f19139c = true;
                    jVar2.f19147u.f19154i = fA;
                }
                jVar2.f();
                return true;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f31596b;
                g1Var.L = h7.n.a(scaleGestureDetector.getScaleFactor() * g1Var.L, 0.6f, g1Var.f33567a);
                g1Var.I = (int) (g1Var.m() * g1Var.L);
                g1Var.J = (int) (g1Var.l() * g1Var.L);
                AndroidUtilities.runOnUIThread(new nh.f0(this, 13));
                o1.j jVar3 = g1Var.O;
                jVar3.f19138b = g1Var.M;
                jVar3.f19139c = true;
                o1.k kVar = jVar3.f19147u;
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                kVar.f19154i = focusX2 >= ((float) i11) / 2.0f ? (i11 - g1Var.I) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                o1.j jVar4 = g1Var.O;
                if (!jVar4.f19141f) {
                    jVar4.f();
                }
                o1.j jVar5 = g1Var.P;
                jVar5.f19138b = g1Var.N;
                jVar5.f19139c = true;
                jVar5.f19147u.f19154i = h7.n.a(scaleGestureDetector.getFocusY() - (g1Var.J / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
                o1.j jVar6 = g1Var.P;
                if (!jVar6.f19141f) {
                    jVar6.f();
                }
                return true;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                uf.n nVar = ((uf.b) this.f31596b).f48565b;
                float focusX3 = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = nVar.f48626a;
                ImageView imageView = nVar.f48627b;
                if (!nVar.B) {
                    float f10 = nVar.H.f48619e;
                    if (f10 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f10;
                    }
                    uf.l.g(nVar.H, scaleFactor, uf.l.a(nVar.H) * ((focusX3 - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), uf.l.b(nVar.H) * (org.telegram.messenger.y1.a((imageView.getHeight() - nVar.f48636y) - (!nVar.f48632r ? AndroidUtilities.statusBarHeight : 0), nVar.A, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    nVar.r(false);
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f31595a) {
            case 0:
                sf0 sf0Var = (sf0) this.f31596b;
                if (sf0Var.f32433w) {
                    sf0Var.f32433w = false;
                    sf0Var.f32419b0 = false;
                    sf0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(sf0Var.f32422d0);
                }
                sf0Var.f32434x = true;
                sf0Var.f32420c.width = (int) (sf0Var.t() * sf0Var.f32416a);
                sf0Var.f32420c.height = (int) (sf0Var.r() * sf0Var.f32416a);
                AndroidUtilities.updateViewLayout(sf0Var.f32418b, sf0Var.d, sf0Var.f32420c);
                break;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f31596b;
                if (g1Var.D) {
                    g1Var.D = false;
                }
                g1Var.E = true;
                g1Var.f33569c.width = (int) (g1Var.m() * g1Var.f33567a);
                g1Var.f33569c.height = (int) (g1Var.l() * g1Var.f33567a);
                AndroidUtilities.updateViewLayout(g1Var.f33568b, g1Var.d, g1Var.f33569c);
                break;
        }
        return true;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f31595a) {
            case 0:
                sf0 sf0Var = (sf0) this.f31596b;
                if (sf0Var.I.f19141f || sf0Var.J.f19141f) {
                    ArrayList arrayList = new ArrayList();
                    jh.e1 e1Var = new jh.e1(this, arrayList, 1);
                    o1.j jVar = sf0Var.I;
                    if (jVar.f19141f) {
                        jVar.a(e1Var);
                    } else {
                        arrayList.add(jVar);
                    }
                    o1.j jVar2 = sf0Var.J;
                    if (!jVar2.f19141f) {
                        arrayList.add(jVar2);
                    } else {
                        jVar2.a(e1Var);
                    }
                } else {
                    b();
                }
                break;
            case 1:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f31596b;
                if (g1Var.O.f19141f || g1Var.P.f19141f) {
                    ArrayList arrayList2 = new ArrayList();
                    jh.e1 e1Var2 = new jh.e1(this, arrayList2, 2);
                    o1.j jVar3 = g1Var.O;
                    if (jVar3.f19141f) {
                        jVar3.a(e1Var2);
                    } else {
                        arrayList2.add(jVar3);
                    }
                    o1.j jVar4 = g1Var.P;
                    if (!jVar4.f19141f) {
                        arrayList2.add(jVar4);
                    } else {
                        jVar4.a(e1Var2);
                    }
                } else {
                    b();
                }
                break;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
