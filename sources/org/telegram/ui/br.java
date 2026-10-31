package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class br extends s4.a0 {
    public final int I;
    public final Object J;

    public br(int i10, Object obj, boolean z10) {
        this.I = i10;
        this.J = obj;
    }

    @Override
    public void S(hf.e eVar, s4.z0 z0Var, s0.c cVar) {
        switch (this.I) {
            case 7:
                super.S(eVar, z0Var, cVar);
                if (((org.telegram.ui.Components.v71) this.J).V) {
                    cVar.p(false);
                    return;
                }
                return;
            case 8:
            default:
                super.S(eVar, z0Var, cVar);
                return;
            case 9:
                super.S(eVar, z0Var, cVar);
                if (!((zf.g0) this.J).isEnabled()) {
                    cVar.p(false);
                    return;
                }
                return;
        }
    }

    @Override
    public int W0(s4.z0 z0Var) {
        switch (this.I) {
            case 5:
                if (((org.telegram.ui.Components.u51) this.J).f30821h3) {
                    return org.telegram.messenger.i0.f16026q.y;
                }
                return super.W0(z0Var);
            case 6:
                if (((org.telegram.ui.Components.c21) this.J).f30821h3) {
                    return org.telegram.messenger.i0.f16026q.y;
                }
                return super.W0(z0Var);
            default:
                return super.W0(z0Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i10;
        switch (this.I) {
            case 2:
                super.k1(z10);
                org.telegram.ui.Components.x90 x90Var = ((org.telegram.ui.Components.y90) this.J).f32665b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                x90Var.setTranslationY(org.telegram.messenger.i0.L(6.0f) * i10);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i10, hf.e eVar, s4.z0 z0Var) {
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.z60 z60Var = ((rx) ((org.telegram.ui.Components.tz) this.J).J).f41307b.L0;
                if (z60Var != null && z60Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 2:
            default:
                return super.m0(i10, eVar, z0Var);
            case 3:
                org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.J;
                ag.b1 b1Var = mj0Var.f28500b;
                boolean z13 = false;
                if (i10 < 0 && mj0Var.B0 != 0.0f) {
                    float pullingLeftProgress = mj0Var.getPullingLeftProgress();
                    mj0Var.B0 += i10;
                    float pullingLeftProgress2 = mj0Var.getPullingLeftProgress();
                    if (pullingLeftProgress > 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (pullingLeftProgress2 > 1.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 != z12) {
                        try {
                            b1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = mj0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        mj0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    fg.i iVar = mj0Var.S;
                    if (iVar != null) {
                        iVar.invalidate();
                    }
                    b1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && b1Var.getScrollState() == 1 && mj0Var.q()) {
                    ValueAnimator valueAnimator = mj0Var.f28541y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        mj0Var.f28541y0.cancel();
                    }
                    int i11 = (mj0Var.getPullingLeftProgress() > 1.0f ? 1 : (mj0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    mj0Var.B0 = (i10 * f7) + mj0Var.B0;
                    float pullingLeftProgress3 = mj0Var.getPullingLeftProgress();
                    if (i11 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (pullingLeftProgress3 > 1.0f) {
                        z13 = true;
                    }
                    if (z10 != z13) {
                        try {
                            b1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fg.i iVar2 = mj0Var.S;
                    if (iVar2 != null) {
                        iVar2.invalidate();
                    }
                    b1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 0:
                pr prVar = (pr) this.J;
                if (!prVar.Q && prVar.N == 0 && prVar.E.size() == 0) {
                    return 0;
                }
                return super.o0(i10, eVar, z0Var);
            case 4:
                org.telegram.ui.Components.ku0 ku0Var = (org.telegram.ui.Components.ku0) this.J;
                if (i10 > 0 && ku0Var.N != null) {
                    int i11 = 0;
                    while (i11 < i10) {
                        int min = Math.min(i10 - i11, Math.max(1, Math.round((ku0Var.getHeight() - ku0Var.U) * 0.5f)));
                        float o10 = ku0Var.o();
                        if (!Float.isInfinite(o10)) {
                            min = Math.min(min, Math.max(0, Math.round(o10 - ku0Var.U)));
                        }
                        if (min != 0) {
                            int o02 = super.o0(min, eVar, z0Var);
                            i11 += o02;
                            if (o02 < min) {
                                return i11;
                            }
                        } else {
                            return i11;
                        }
                    }
                    return i11;
                }
                return super.o0(i10, eVar, z0Var);
            default:
                return super.o0(i10, eVar, z0Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.nz nzVar = new org.telegram.ui.Components.nz(this, recyclerView.getContext());
                nzVar.f48045a = i10;
                w0(nzVar);
                return;
            case 7:
                org.telegram.ui.Components.q71 q71Var = new org.telegram.ui.Components.q71(this, recyclerView.getContext());
                q71Var.f48045a = i10;
                w0(q71Var);
                return;
            default:
                super.v0(recyclerView, z0Var, i10);
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
            case 8:
                return false;
            case 9:
                return false;
            default:
                return super.y0();
        }
    }

    @Override
    public void z0(s4.z0 z0Var, int[] iArr) {
        switch (this.I) {
            case 8:
                iArr[1] = ((StickersActivity) this.J).f34046a.getHeight();
                return;
            default:
                super.z0(z0Var, iArr);
                return;
        }
    }

    public br(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    public br(Object obj, int i10) {
        super(1, false);
        this.I = i10;
        this.J = obj;
    }

    public br(org.telegram.ui.Components.u51 u51Var, int i10) {
        super(i10, false);
        this.I = 5;
        this.J = u51Var;
    }
}
