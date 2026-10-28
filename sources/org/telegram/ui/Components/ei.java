package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ei extends u6 {
    public final int f27852b;
    public final ti f27853c;

    public ei(ti tiVar, int i10) {
        super("translation", 0);
        this.f27852b = i10;
        switch (i10) {
            case 1:
                this.f27853c = tiVar;
                super("openProgress", 0);
                return;
            default:
                this.f27853c = tiVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f27852b) {
            case 0:
                li liVar = (li) obj;
                ti tiVar = this.f27853c;
                tiVar.f32983d0 = f7;
                li liVar2 = tiVar.C0;
                if (liVar2 != null) {
                    if (!(liVar2 instanceof cn) && !(tiVar.B0 instanceof cn)) {
                        liVar2.setAlpha(f7);
                        tiVar.C0.u(f7);
                        li liVar3 = tiVar.C0;
                        go goVar = tiVar.m0;
                        int i11 = 0;
                        if (liVar3 == goVar || tiVar.B0 == goVar) {
                            if (liVar3 == goVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            tiVar.i2(i10);
                        }
                        li liVar4 = tiVar.C0;
                        go goVar2 = tiVar.f33013n0;
                        if (liVar4 == goVar2 || tiVar.B0 == goVar2) {
                            if (liVar4 == goVar2) {
                                i11 = 1;
                            }
                            tiVar.i2(i11);
                        }
                        tiVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        tiVar.B0.u(1.0f - Math.min(1.0f, f7 / 0.7f));
                        tiVar.B0.l(tiVar.f33018o2);
                    } else {
                        int max = Math.max(liVar2.getWidth(), tiVar.B0.getWidth());
                        if (tiVar.C0 instanceof cn) {
                            tiVar.B0.setTranslationX((-max) * f7);
                            tiVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            tiVar.B0.setTranslationX(max * f7);
                            tiVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (tiVar.f33044w1 != null) {
                        tiVar.i2(1);
                    }
                    viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                ti tiVar2 = (ti) obj;
                uh uhVar = this.f27853c.B1;
                int childCount = uhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = uhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = ds.f27531g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(ds.f27533j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (ds.f27532i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof oi) {
                        ((oi) childAt).f31294a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27852b) {
            case 0:
                li liVar = (li) obj;
                return Float.valueOf(this.f27853c.f32983d0);
            default:
                ti tiVar = (ti) obj;
                return Float.valueOf(0.0f);
        }
    }
}
