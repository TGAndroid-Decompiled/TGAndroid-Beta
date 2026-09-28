package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ki extends r6 {
    public final int f25708b;
    public final wi f25709c;

    public ki(wi wiVar, int i10) {
        super("translation", 0);
        this.f25708b = i10;
        switch (i10) {
            case 1:
                this.f25709c = wiVar;
                super("openProgress", 0);
                return;
            default:
                this.f25709c = wiVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f25708b) {
            case 0:
                oi oiVar = (oi) obj;
                wi wiVar = this.f25709c;
                wiVar.f29936d0 = f7;
                oi oiVar2 = wiVar.f30007z0;
                if (oiVar2 != null) {
                    if (!(oiVar2 instanceof sm) && !(wiVar.f30004y0 instanceof sm)) {
                        oiVar2.setAlpha(f7);
                        wiVar.f30007z0.s(f7);
                        oi oiVar3 = wiVar.f30007z0;
                        wn wnVar = wiVar.m0;
                        int i11 = 0;
                        if (oiVar3 == wnVar || wiVar.f30004y0 == wnVar) {
                            if (oiVar3 == wnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            wiVar.a2(i10);
                        }
                        oi oiVar4 = wiVar.f30007z0;
                        wn wnVar2 = wiVar.f29966n0;
                        if (oiVar4 == wnVar2 || wiVar.f30004y0 == wnVar2) {
                            if (oiVar4 == wnVar2) {
                                i11 = 1;
                            }
                            wiVar.a2(i11);
                        }
                        wiVar.f30007z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        wiVar.f30004y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        wiVar.f30004y0.k(wiVar.f29962l2);
                    } else {
                        int max = Math.max(oiVar2.getWidth(), wiVar.f30004y0.getWidth());
                        if (wiVar.f30007z0 instanceof sm) {
                            wiVar.f30004y0.setTranslationX((-max) * f7);
                            wiVar.f30007z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            wiVar.f30004y0.setTranslationX(max * f7);
                            wiVar.f30007z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (wiVar.f29987t1 != null) {
                        wiVar.a2(1);
                    }
                    wiVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                wi wiVar2 = (wi) obj;
                zh zhVar = this.f25709c.f30005y1;
                int childCount = zhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = zhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = sr.f28350g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(sr.f28352j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (sr.f28351i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ri) {
                        ((ri) childAt).f27969a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25708b) {
            case 0:
                oi oiVar = (oi) obj;
                return Float.valueOf(this.f25709c.f29936d0);
            default:
                wi wiVar = (wi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
