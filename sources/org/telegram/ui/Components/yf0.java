package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class yf0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f35059a;
    public final Object f35060b;

    public yf0(Object obj, int i10) {
        this.f35059a = i10;
        this.f35060b = obj;
    }

    public void b() {
        switch (this.f35059a) {
            case 0:
                bg0 bg0Var = (bg0) this.f35060b;
                WindowManager.LayoutParams layoutParams = bg0Var.f27081c;
                int t10 = (int) (bg0Var.t() * bg0Var.F);
                layoutParams.width = t10;
                bg0Var.D = t10;
                WindowManager.LayoutParams layoutParams2 = bg0Var.f27081c;
                int r6 = (int) (bg0Var.r() * bg0Var.F);
                layoutParams2.height = r6;
                bg0Var.E = r6;
                try {
                    AndroidUtilities.updateViewLayout(bg0Var.f27079b, bg0Var.d, bg0Var.f27081c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f35060b;
                WindowManager.LayoutParams layoutParams3 = h1Var.f33733c;
                int m10 = (int) (h1Var.m() * h1Var.L);
                layoutParams3.width = m10;
                h1Var.I = m10;
                WindowManager.LayoutParams layoutParams4 = h1Var.f33733c;
                int l10 = (int) (h1Var.l() * h1Var.L);
                layoutParams4.height = l10;
                h1Var.J = l10;
                AndroidUtilities.updateViewLayout(h1Var.f33732b, h1Var.d, h1Var.f33733c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float dp;
        float dp2;
        int i10;
        switch (this.f35059a) {
            case 0:
                bg0 bg0Var = (bg0) this.f35060b;
                bg0Var.F = i7.w.a(scaleGestureDetector.getScaleFactor() * bg0Var.F, 0.75f, bg0Var.f27077a);
                bg0Var.D = (int) (bg0Var.t() * bg0Var.F);
                bg0Var.E = (int) (bg0Var.r() * bg0Var.F);
                AndroidUtilities.runOnUIThread(new xb0(this, 12));
                float focusX = scaleGestureDetector.getFocusX();
                int i11 = AndroidUtilities.displaySize.x;
                if (focusX >= i11 / 2.0f) {
                    dp = (i11 - bg0Var.D) - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f);
                }
                o1.k kVar = bg0Var.I;
                if (!kVar.f19039f) {
                    kVar.f19036b = bg0Var.G;
                    kVar.f19037c = true;
                    kVar.f19045u.f19052i = dp;
                } else {
                    kVar.f19045u.f19052i = dp;
                }
                kVar.f();
                float a2 = i7.w.a(scaleGestureDetector.getFocusY() - (bg0Var.E / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - bg0Var.E) - AndroidUtilities.dp(16.0f));
                o1.k kVar2 = bg0Var.J;
                if (!kVar2.f19039f) {
                    kVar2.f19036b = bg0Var.H;
                    kVar2.f19037c = true;
                    kVar2.f19045u.f19052i = a2;
                } else {
                    kVar2.f19045u.f19052i = a2;
                }
                kVar2.f();
                return true;
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f35060b;
                h1Var.L = i7.w.a(scaleGestureDetector.getScaleFactor() * h1Var.L, 0.6f, h1Var.f33731a);
                h1Var.I = (int) (h1Var.m() * h1Var.L);
                h1Var.J = (int) (h1Var.l() * h1Var.L);
                AndroidUtilities.runOnUIThread(new nh.m6(this, 16));
                o1.k kVar3 = h1Var.O;
                kVar3.f19036b = h1Var.M;
                kVar3.f19037c = true;
                o1.l lVar = kVar3.f19045u;
                float focusX2 = scaleGestureDetector.getFocusX();
                int i12 = AndroidUtilities.displaySize.x;
                if (focusX2 >= i12 / 2.0f) {
                    dp2 = (i12 - h1Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                lVar.f19052i = dp2;
                o1.k kVar4 = h1Var.O;
                if (!kVar4.f19039f) {
                    kVar4.f();
                }
                o1.k kVar5 = h1Var.P;
                kVar5.f19036b = h1Var.N;
                kVar5.f19037c = true;
                kVar5.f19045u.f19052i = i7.w.a(scaleGestureDetector.getFocusY() - (h1Var.J / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.J) - AndroidUtilities.dp(16.0f));
                o1.k kVar6 = h1Var.P;
                if (!kVar6.f19039f) {
                    kVar6.f();
                }
                return true;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                wf.n nVar = ((wf.b) this.f35060b).f49892b;
                float focusX3 = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = nVar.f49953a;
                ImageView imageView = nVar.f49954b;
                if (!nVar.B) {
                    float f9 = nVar.H.f49946e;
                    if (f9 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f9;
                    }
                    if (!nVar.f49959r) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    wf.l.g(nVar.H, scaleFactor, wf.l.a(nVar.H) * ((focusX3 - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), wf.l.b(nVar.H) * (org.telegram.messenger.x3.a((imageView.getHeight() - nVar.f49963y) - i10, nVar.A, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    nVar.r(false);
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f35059a) {
            case 0:
                bg0 bg0Var = (bg0) this.f35060b;
                if (bg0Var.f27094w) {
                    bg0Var.f27094w = false;
                    bg0Var.f27080b0 = false;
                    bg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(bg0Var.f27083d0);
                }
                bg0Var.f27095x = true;
                bg0Var.f27081c.width = (int) (bg0Var.t() * bg0Var.f27077a);
                bg0Var.f27081c.height = (int) (bg0Var.r() * bg0Var.f27077a);
                AndroidUtilities.updateViewLayout(bg0Var.f27079b, bg0Var.d, bg0Var.f27081c);
                return true;
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f35060b;
                if (h1Var.D) {
                    h1Var.D = false;
                }
                h1Var.E = true;
                h1Var.f33733c.width = (int) (h1Var.m() * h1Var.f33731a);
                h1Var.f33733c.height = (int) (h1Var.l() * h1Var.f33731a);
                AndroidUtilities.updateViewLayout(h1Var.f33732b, h1Var.d, h1Var.f33733c);
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f35059a) {
            case 0:
                bg0 bg0Var = (bg0) this.f35060b;
                if (!bg0Var.I.f19039f && !bg0Var.J.f19039f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                lh.e1 e1Var = new lh.e1(this, arrayList, 1);
                o1.k kVar = bg0Var.I;
                if (!kVar.f19039f) {
                    arrayList.add(kVar);
                } else {
                    kVar.a(e1Var);
                }
                o1.k kVar2 = bg0Var.J;
                if (!kVar2.f19039f) {
                    arrayList.add(kVar2);
                    return;
                } else {
                    kVar2.a(e1Var);
                    return;
                }
            case 1:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f35060b;
                if (!h1Var.O.f19039f && !h1Var.P.f19039f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                lh.e1 e1Var2 = new lh.e1(this, arrayList2, 2);
                o1.k kVar3 = h1Var.O;
                if (!kVar3.f19039f) {
                    arrayList2.add(kVar3);
                } else {
                    kVar3.a(e1Var2);
                }
                o1.k kVar4 = h1Var.P;
                if (!kVar4.f19039f) {
                    arrayList2.add(kVar4);
                    return;
                } else {
                    kVar4.a(e1Var2);
                    return;
                }
            default:
                return;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
