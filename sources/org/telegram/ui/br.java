package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class br extends f2.i0 {
    public final int I;
    public final Object J;

    public br(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override
    public void S(bf.f fVar, f2.i1 i1Var, s0.e eVar) {
        switch (this.I) {
            case 5:
                super.S(fVar, i1Var, eVar);
                if (((org.telegram.ui.Components.k81) this.J).S) {
                    eVar.p(false);
                    return;
                }
                return;
            case 6:
            default:
                super.S(fVar, i1Var, eVar);
                return;
            case 7:
                super.S(fVar, i1Var, eVar);
                if (!((tf.g0) this.J).isEnabled()) {
                    eVar.p(false);
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
                org.telegram.ui.Components.oa0 oa0Var = ((org.telegram.ui.Components.pa0) this.J).f27801b;
                if (z4) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                oa0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
                return;
            default:
                super.k1(z4);
                return;
        }
    }

    @Override
    public int m0(int i10, bf.f fVar, f2.i1 i1Var) {
        float f10;
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.o70 o70Var = ((ow) ((org.telegram.ui.Components.j00) this.J).G).f36989b.I0;
                if (o70Var != null && o70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, fVar, i1Var);
            case 2:
            default:
                return super.m0(i10, fVar, i1Var);
            case 3:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) this.J;
                lh.e1 e1Var = pk0Var.f27888b;
                boolean z12 = false;
                if (i10 < 0 && pk0Var.f27925y0 != 0.0f) {
                    float pullingLeftProgress = pk0Var.getPullingLeftProgress();
                    pk0Var.f27925y0 += i10;
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
                    float f11 = pk0Var.f27925y0;
                    if (f11 < 0.0f) {
                        i10 = (int) f11;
                        pk0Var.f27925y0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ah.d dVar = pk0Var.P;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                    e1Var.invalidate();
                }
                int m0 = super.m0(i10, fVar, i1Var);
                if (i10 > 0 && m0 == 0 && e1Var.getScrollState() == 1 && pk0Var.q()) {
                    ValueAnimator valueAnimator = pk0Var.f27919v0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pk0Var.f27919v0.cancel();
                    }
                    int i11 = (pk0Var.getPullingLeftProgress() > 1.0f ? 1 : (pk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    pk0Var.f27925y0 = (i10 * f10) + pk0Var.f27925y0;
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
                    ah.d dVar2 = pk0Var.P;
                    if (dVar2 != null) {
                        dVar2.invalidate();
                    }
                    e1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, bf.f fVar, f2.i1 i1Var) {
        switch (this.I) {
            case 0:
                pr prVar = (pr) this.J;
                if (!prVar.O && prVar.L == 0 && prVar.C.size() == 0) {
                    return 0;
                }
                return super.o0(i10, fVar, i1Var);
            default:
                return super.o0(i10, fVar, i1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.d00 d00Var = new org.telegram.ui.Components.d00(this, recyclerView.getContext());
                d00Var.f5723a = i10;
                w0(d00Var);
                return;
            case 5:
                org.telegram.ui.Components.e81 e81Var = new org.telegram.ui.Components.e81(this, recyclerView.getContext());
                e81Var.f5723a = i10;
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
                iArr[1] = ((StickersActivity) this.J).f32293a.getHeight();
                return;
            default:
                super.z0(i1Var, iArr);
                return;
        }
    }

    public br(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public br(pr prVar) {
        super(1, false);
        this.I = 0;
        this.J = prVar;
    }
}
