package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends m6 {
    public final int f33514b;
    public final mi f33515c;

    public yh(mi miVar, int i10) {
        super("translation", 0);
        this.f33514b = i10;
        switch (i10) {
            case 1:
                this.f33515c = miVar;
                super("openProgress", 0);
                return;
            default:
                this.f33515c = miVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        int i10;
        float f11;
        switch (this.f33514b) {
            case 0:
                ei eiVar = (ei) obj;
                mi miVar = this.f33515c;
                miVar.f29033a0 = f10;
                ei eiVar2 = miVar.f29104w0;
                if (eiVar2 != null) {
                    if (!(eiVar2 instanceof qm) && !(miVar.f29100v0 instanceof qm)) {
                        eiVar2.setAlpha(f10);
                        miVar.f29104w0.s(f10);
                        ei eiVar3 = miVar.f29104w0;
                        sn snVar = miVar.f29063j0;
                        int i11 = 0;
                        if (eiVar3 == snVar || miVar.f29100v0 == snVar) {
                            if (eiVar3 == snVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            miVar.a2(i10);
                        }
                        ei eiVar4 = miVar.f29104w0;
                        sn snVar2 = miVar.f29066k0;
                        if (eiVar4 == snVar2 || miVar.f29100v0 == snVar2) {
                            if (eiVar4 == snVar2) {
                                i11 = 1;
                            }
                            miVar.a2(i11);
                        }
                        miVar.f29104w0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        miVar.f29100v0.s(1.0f - Math.min(1.0f, f10 / 0.7f));
                        miVar.f29100v0.k(miVar.f29062i2);
                    } else {
                        int max = Math.max(eiVar2.getWidth(), miVar.f29100v0.getWidth());
                        if (miVar.f29104w0 instanceof qm) {
                            miVar.f29100v0.setTranslationX((-max) * f10);
                            miVar.f29104w0.setTranslationX((1.0f - f10) * max);
                        } else {
                            miVar.f29100v0.setTranslationX(max * f10);
                            miVar.f29104w0.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (miVar.f29084q1 != null) {
                        miVar.a2(1);
                    }
                    miVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.h3) miVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                mi miVar2 = (mi) obj;
                nh nhVar = this.f33515c.f29101v1;
                int childCount = nhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f12 = (3 - i12) * 32.0f;
                    View childAt = nhVar.getChildAt(i12);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = pr.f30184g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(pr.f30186j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (pr.f30185i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof hi) {
                        ((hi) childAt).f27492a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f33514b) {
            case 0:
                ei eiVar = (ei) obj;
                return Float.valueOf(this.f33515c.f29033a0);
            default:
                mi miVar = (mi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
