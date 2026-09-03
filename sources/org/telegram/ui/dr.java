package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class dr extends f2.i0 {
    public final int I;
    public final Object J;

    public dr(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override
    public void S(af.h hVar, f2.i1 i1Var, s0.d dVar) {
        switch (this.I) {
            case 5:
                super.S(hVar, i1Var, dVar);
                if (((org.telegram.ui.Components.k81) this.J).S) {
                    dVar.p(false);
                    return;
                }
                return;
            case 6:
            default:
                super.S(hVar, i1Var, dVar);
                return;
            case 7:
                super.S(hVar, i1Var, dVar);
                if (!((tf.g0) this.J).isEnabled()) {
                    dVar.p(false);
                    return;
                }
                return;
        }
    }

    @Override
    public int W0(f2.i1 i1Var) {
        switch (this.I) {
            case 4:
                if (((org.telegram.ui.Components.k21) this.J).X2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(i1Var);
            default:
                return super.W0(i1Var);
        }
    }

    @Override
    public void k1(boolean z4) {
        int i10;
        switch (this.I) {
            case 2:
                super.k1(z4);
                org.telegram.ui.Components.pa0 pa0Var = ((org.telegram.ui.Components.qa0) this.J).f28127b;
                if (z4) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                pa0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
                return;
            default:
                super.k1(z4);
                return;
        }
    }

    @Override
    public int m0(int i10, af.h hVar, f2.i1 i1Var) {
        float f10;
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.p70 p70Var = ((qw) ((org.telegram.ui.Components.k00) this.J).G).f37510b.I0;
                if (p70Var != null && p70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, hVar, i1Var);
            case 2:
            default:
                return super.m0(i10, hVar, i1Var);
            case 3:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) this.J;
                lh.e1 e1Var = pk0Var.f27883b;
                boolean z12 = false;
                if (i10 < 0 && pk0Var.f27920y0 != 0.0f) {
                    float pullingLeftProgress = pk0Var.getPullingLeftProgress();
                    pk0Var.f27920y0 += i10;
                    float pullingLeftProgress2 = pk0Var.getPullingLeftProgress();
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
                            e1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f11 = pk0Var.f27920y0;
                    if (f11 < 0.0f) {
                        i10 = (int) f11;
                        pk0Var.f27920y0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ah.e eVar = pk0Var.P;
                    if (eVar != null) {
                        eVar.invalidate();
                    }
                    e1Var.invalidate();
                }
                int m0 = super.m0(i10, hVar, i1Var);
                if (i10 > 0 && m0 == 0 && e1Var.getScrollState() == 1 && pk0Var.q()) {
                    ValueAnimator valueAnimator = pk0Var.f27914v0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pk0Var.f27914v0.cancel();
                    }
                    int i11 = (pk0Var.getPullingLeftProgress() > 1.0f ? 1 : (pk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    pk0Var.f27920y0 = (i10 * f10) + pk0Var.f27920y0;
                    float pullingLeftProgress3 = pk0Var.getPullingLeftProgress();
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
                            e1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ah.e eVar2 = pk0Var.P;
                    if (eVar2 != null) {
                        eVar2.invalidate();
                    }
                    e1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, af.h hVar, f2.i1 i1Var) {
        switch (this.I) {
            case 0:
                rr rrVar = (rr) this.J;
                if (!rrVar.O && rrVar.L == 0 && rrVar.C.size() == 0) {
                    return 0;
                }
                return super.o0(i10, hVar, i1Var);
            default:
                return super.o0(i10, hVar, i1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(this, recyclerView.getContext());
                e00Var.f5712a = i10;
                w0(e00Var);
                return;
            case 5:
                org.telegram.ui.Components.e81 e81Var = new org.telegram.ui.Components.e81(this, recyclerView.getContext());
                e81Var.f5712a = i10;
                w0(e81Var);
                return;
            default:
                super.v0(recyclerView, i1Var, i10);
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
    public void z0(f2.i1 i1Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).f32267a.getHeight();
                return;
            default:
                super.z0(i1Var, iArr);
                return;
        }
    }

    public dr(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public dr(rr rrVar) {
        super(1, false);
        this.I = 0;
        this.J = rrVar;
    }
}
