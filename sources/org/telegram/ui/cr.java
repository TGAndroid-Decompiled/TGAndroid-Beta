package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class cr extends f2.j0 {
    public final int I;
    public final Object J;

    public cr(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override
    public void S(bf.f fVar, f2.j1 j1Var, s0.d dVar) {
        switch (this.I) {
            case 5:
                super.S(fVar, j1Var, dVar);
                if (((org.telegram.ui.Components.l81) this.J).S) {
                    dVar.p(false);
                    return;
                }
                return;
            case 6:
            default:
                super.S(fVar, j1Var, dVar);
                return;
            case 7:
                super.S(fVar, j1Var, dVar);
                if (!((uf.g0) this.J).isEnabled()) {
                    dVar.p(false);
                    return;
                }
                return;
        }
    }

    @Override
    public int W0(f2.j1 j1Var) {
        switch (this.I) {
            case 4:
                if (((org.telegram.ui.Components.l21) this.J).X2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(j1Var);
            default:
                return super.W0(j1Var);
        }
    }

    @Override
    public void k1(boolean z4) {
        int i10;
        switch (this.I) {
            case 2:
                super.k1(z4);
                org.telegram.ui.Components.qa0 qa0Var = ((org.telegram.ui.Components.ra0) this.J).f30660b;
                if (z4) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                qa0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
                return;
            default:
                super.k1(z4);
                return;
        }
    }

    @Override
    public int m0(int i10, bf.f fVar, f2.j1 j1Var) {
        float f10;
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.q70 q70Var = ((pw) ((org.telegram.ui.Components.l00) this.J).G).f40168b.I0;
                if (q70Var != null && q70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, fVar, j1Var);
            case 2:
            default:
                return super.m0(i10, fVar, j1Var);
            case 3:
                org.telegram.ui.Components.rk0 rk0Var = (org.telegram.ui.Components.rk0) this.J;
                mh.d1 d1Var = rk0Var.f30755b;
                boolean z12 = false;
                if (i10 < 0 && rk0Var.f30793y0 != 0.0f) {
                    float pullingLeftProgress = rk0Var.getPullingLeftProgress();
                    rk0Var.f30793y0 += i10;
                    float pullingLeftProgress2 = rk0Var.getPullingLeftProgress();
                    if (pullingLeftProgress > 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (pullingLeftProgress2 > 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 != z11) {
                        try {
                            d1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f11 = rk0Var.f30793y0;
                    if (f11 < 0.0f) {
                        i10 = (int) f11;
                        rk0Var.f30793y0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ag.l lVar = rk0Var.P;
                    if (lVar != null) {
                        lVar.invalidate();
                    }
                    d1Var.invalidate();
                }
                int m0 = super.m0(i10, fVar, j1Var);
                if (i10 > 0 && m0 == 0 && d1Var.getScrollState() == 1 && rk0Var.q()) {
                    ValueAnimator valueAnimator = rk0Var.f30787v0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        rk0Var.f30787v0.cancel();
                    }
                    int i11 = (rk0Var.getPullingLeftProgress() > 1.0f ? 1 : (rk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    rk0Var.f30793y0 = (i10 * f10) + rk0Var.f30793y0;
                    float pullingLeftProgress3 = rk0Var.getPullingLeftProgress();
                    if (i11 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (pullingLeftProgress3 > 1.0f) {
                        z12 = true;
                    }
                    if (z4 != z12) {
                        try {
                            d1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ag.l lVar2 = rk0Var.P;
                    if (lVar2 != null) {
                        lVar2.invalidate();
                    }
                    d1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        switch (this.I) {
            case 0:
                qr qrVar = (qr) this.J;
                if (!qrVar.O && qrVar.L == 0 && qrVar.C.size() == 0) {
                    return 0;
                }
                return super.o0(i10, fVar, j1Var);
            default:
                return super.o0(i10, fVar, j1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(this, recyclerView.getContext());
                f00Var.f5805a = i10;
                w0(f00Var);
                return;
            case 5:
                org.telegram.ui.Components.g81 g81Var = new org.telegram.ui.Components.g81(this, recyclerView.getContext());
                g81Var.f5805a = i10;
                w0(g81Var);
                return;
            default:
                super.v0(recyclerView, j1Var, i10);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.I) {
            case 1:
                return true;
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            default:
                return super.y0();
            case 6:
                return false;
            case 7:
                return false;
        }
    }

    @Override
    public void z0(f2.j1 j1Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).f34830a.getHeight();
                return;
            default:
                super.z0(j1Var, iArr);
                return;
        }
    }

    public cr(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public cr(qr qrVar) {
        super(1, false);
        this.I = 0;
        this.J = qrVar;
    }
}
