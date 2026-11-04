package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ee0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final int f33373a;
    public final Object f33374b;

    public ee0(Object obj, int i3) {
        this.f33373a = i3;
        this.f33374b = obj;
    }

    public void b() {
        switch (this.f33373a) {
            case 0:
                ie0 ie0Var = (ie0) this.f33374b;
                WindowManager.LayoutParams layoutParams = ie0Var.f34688c;
                int t10 = (int) (ie0Var.t() * ie0Var.K);
                layoutParams.width = t10;
                ie0Var.I = t10;
                WindowManager.LayoutParams layoutParams2 = ie0Var.f34688c;
                int p10 = (int) (ie0Var.p() * ie0Var.K);
                layoutParams2.height = p10;
                ie0Var.J = p10;
                try {
                    org.telegram.messenger.g0.T3(ie0Var.f34686b, ie0Var.d, ie0Var.f34688c);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f33374b;
                WindowManager.LayoutParams layoutParams3 = s0Var.f39594c;
                int f10 = (int) (s0Var.f() * s0Var.Q);
                layoutParams3.width = f10;
                s0Var.N = f10;
                WindowManager.LayoutParams layoutParams4 = s0Var.f39594c;
                int e10 = (int) (s0Var.e() * s0Var.Q);
                layoutParams4.height = e10;
                s0Var.O = e10;
                org.telegram.messenger.g0.T3(s0Var.f39592b, s0Var.d, s0Var.f39594c);
                return;
        }
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Point point;
        float L;
        Point point2;
        float L2;
        int i3;
        switch (this.f33373a) {
            case 0:
                ie0 ie0Var = (ie0) this.f33374b;
                ie0Var.K = b8.be.a(scaleGestureDetector.getScaleFactor() * ie0Var.K, 0.75f, ie0Var.f34684a);
                ie0Var.I = (int) (ie0Var.t() * ie0Var.K);
                ie0Var.J = (int) (ie0Var.p() * ie0Var.K);
                org.telegram.messenger.g0.h3(new jb0(this, 9));
                float focusX = scaleGestureDetector.getFocusX();
                int i10 = org.telegram.messenger.g0.f22608q.x;
                if (focusX >= i10 / 2.0f) {
                    L = (i10 - ie0Var.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(16.0f);
                }
                q1.g gVar = ie0Var.N;
                if (!gVar.f53647f) {
                    gVar.f53644b = ie0Var.L;
                    gVar.f53645c = true;
                    gVar.f53653m.f53661i = L;
                } else {
                    gVar.f53653m.f53661i = L;
                }
                gVar.h();
                float a10 = b8.be.a(scaleGestureDetector.getFocusY() - (ie0Var.J / 2.0f), org.telegram.messenger.g0.L(16.0f), (point.y - ie0Var.J) - org.telegram.messenger.g0.L(16.0f));
                q1.g gVar2 = ie0Var.O;
                if (!gVar2.f53647f) {
                    gVar2.f53644b = ie0Var.M;
                    gVar2.f53645c = true;
                    gVar2.f53653m.f53661i = a10;
                } else {
                    gVar2.f53653m.f53661i = a10;
                }
                gVar2.h();
                return true;
            case 1:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f33374b;
                s0Var.Q = b8.be.a(scaleGestureDetector.getScaleFactor() * s0Var.Q, 0.6f, s0Var.f39590a);
                s0Var.N = (int) (s0Var.f() * s0Var.Q);
                s0Var.O = (int) (s0Var.e() * s0Var.Q);
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.d4(this, 9));
                q1.g gVar3 = s0Var.T;
                gVar3.f53644b = s0Var.R;
                gVar3.f53645c = true;
                q1.h hVar = gVar3.f53653m;
                float focusX2 = scaleGestureDetector.getFocusX();
                int i11 = org.telegram.messenger.g0.f22608q.x;
                if (focusX2 >= i11 / 2.0f) {
                    L2 = (i11 - s0Var.N) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                hVar.f53661i = L2;
                q1.g gVar4 = s0Var.T;
                if (!gVar4.f53647f) {
                    gVar4.h();
                }
                q1.g gVar5 = s0Var.U;
                gVar5.f53644b = s0Var.S;
                gVar5.f53645c = true;
                gVar5.f53653m.f53661i = b8.be.a(scaleGestureDetector.getFocusY() - (s0Var.O / 2.0f), org.telegram.messenger.g0.L(16.0f), (point2.y - s0Var.O) - org.telegram.messenger.g0.L(16.0f));
                q1.g gVar6 = s0Var.U;
                if (!gVar6.f53647f) {
                    gVar6.h();
                }
                return true;
            default:
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                pg.m mVar = ((pg.b) this.f33374b).f53451b;
                float focusX3 = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                CropAreaView cropAreaView = mVar.f53511a;
                ImageView imageView = mVar.f53512b;
                if (!mVar.G) {
                    float f10 = mVar.M.f53504e;
                    if (f10 * scaleFactor > 30.0f) {
                        scaleFactor = 30.0f / f10;
                    }
                    if (!mVar.f53517r) {
                        i3 = org.telegram.messenger.g0.f22602m;
                    } else {
                        i3 = 0;
                    }
                    pg.k.g(mVar.M, scaleFactor, pg.k.a(mVar.M) * ((focusX3 - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth()), pg.k.b(mVar.M) * (org.telegram.messenger.k5.y((imageView.getHeight() - mVar.E) - i3, mVar.F, 2.0f, focusY) / cropAreaView.getCropHeight()));
                    mVar.r(false);
                }
                return true;
        }
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f33373a) {
            case 0:
                ie0 ie0Var = (ie0) this.f33374b;
                if (ie0Var.f34706x) {
                    ie0Var.f34706x = false;
                    ie0Var.f34695g0 = false;
                    ie0Var.a();
                    org.telegram.messenger.g0.r(ie0Var.f34697i0);
                }
                ie0Var.f34707y = true;
                ie0Var.f34688c.width = (int) (ie0Var.t() * ie0Var.f34684a);
                ie0Var.f34688c.height = (int) (ie0Var.p() * ie0Var.f34684a);
                org.telegram.messenger.g0.T3(ie0Var.f34686b, ie0Var.d, ie0Var.f34688c);
                return true;
            case 1:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f33374b;
                if (s0Var.I) {
                    s0Var.I = false;
                }
                s0Var.J = true;
                s0Var.f39594c.width = (int) (s0Var.f() * s0Var.f39590a);
                s0Var.f39594c.height = (int) (s0Var.e() * s0Var.f39590a);
                org.telegram.messenger.g0.T3(s0Var.f39592b, s0Var.d, s0Var.f39594c);
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f33373a) {
            case 0:
                ie0 ie0Var = (ie0) this.f33374b;
                if (!ie0Var.N.f53647f && !ie0Var.O.f53647f) {
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ei.h1 h1Var = new ei.h1(this, arrayList, 1);
                q1.g gVar = ie0Var.N;
                if (!gVar.f53647f) {
                    arrayList.add(gVar);
                } else {
                    gVar.a(h1Var);
                }
                q1.g gVar2 = ie0Var.O;
                if (!gVar2.f53647f) {
                    arrayList.add(gVar2);
                    return;
                } else {
                    gVar2.a(h1Var);
                    return;
                }
            case 1:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f33374b;
                if (!s0Var.T.f53647f && !s0Var.U.f53647f) {
                    b();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ei.h1 h1Var2 = new ei.h1(this, arrayList2, 2);
                q1.g gVar3 = s0Var.T;
                if (!gVar3.f53647f) {
                    arrayList2.add(gVar3);
                } else {
                    gVar3.a(h1Var2);
                }
                q1.g gVar4 = s0Var.U;
                if (!gVar4.f53647f) {
                    arrayList2.add(gVar4);
                    return;
                } else {
                    gVar4.a(h1Var2);
                    return;
                }
            default:
                return;
        }
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }
}
