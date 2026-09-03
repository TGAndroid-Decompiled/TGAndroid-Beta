package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends m6 {
    public final int f33535b;
    public final mi f33536c;

    public yh(mi miVar, int i10) {
        super("translation", 0);
        this.f33535b = i10;
        switch (i10) {
            case 1:
                this.f33536c = miVar;
                super("openProgress", 0);
                return;
            default:
                this.f33536c = miVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        int i10;
        float f11;
        switch (this.f33535b) {
            case 0:
                ei eiVar = (ei) obj;
                mi miVar = this.f33536c;
                miVar.f29051a0 = f10;
                ei eiVar2 = miVar.f29122w0;
                if (eiVar2 != null) {
                    if (!(eiVar2 instanceof pm) && !(miVar.f29118v0 instanceof pm)) {
                        eiVar2.setAlpha(f10);
                        miVar.f29122w0.s(f10);
                        ei eiVar3 = miVar.f29122w0;
                        rn rnVar = miVar.f29081j0;
                        int i11 = 0;
                        if (eiVar3 == rnVar || miVar.f29118v0 == rnVar) {
                            if (eiVar3 == rnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            miVar.a2(i10);
                        }
                        ei eiVar4 = miVar.f29122w0;
                        rn rnVar2 = miVar.f29084k0;
                        if (eiVar4 == rnVar2 || miVar.f29118v0 == rnVar2) {
                            if (eiVar4 == rnVar2) {
                                i11 = 1;
                            }
                            miVar.a2(i11);
                        }
                        miVar.f29122w0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        miVar.f29118v0.s(1.0f - Math.min(1.0f, f10 / 0.7f));
                        miVar.f29118v0.k(miVar.f29080i2);
                    } else {
                        int max = Math.max(eiVar2.getWidth(), miVar.f29118v0.getWidth());
                        if (miVar.f29122w0 instanceof pm) {
                            miVar.f29118v0.setTranslationX((-max) * f10);
                            miVar.f29122w0.setTranslationX((1.0f - f10) * max);
                        } else {
                            miVar.f29118v0.setTranslationX(max * f10);
                            miVar.f29122w0.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (miVar.f29102q1 != null) {
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
                nh nhVar = this.f33536c.f29119v1;
                int childCount = nhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f12 = (3 - i12) * 32.0f;
                    View childAt = nhVar.getChildAt(i12);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = pr.f30169g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(pr.f30171j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (pr.f30170i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof hi) {
                        ((hi) childAt).f27509a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f33535b) {
            case 0:
                ei eiVar = (ei) obj;
                return Float.valueOf(this.f33536c.f29051a0);
            default:
                mi miVar = (mi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
