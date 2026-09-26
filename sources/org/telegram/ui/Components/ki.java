package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ki extends r6 {
    public final int f25736b;
    public final wi f25737c;

    public ki(wi wiVar, int i10) {
        super("translation", 0);
        this.f25736b = i10;
        switch (i10) {
            case 1:
                this.f25737c = wiVar;
                super("openProgress", 0);
                return;
            default:
                this.f25737c = wiVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f25736b) {
            case 0:
                oi oiVar = (oi) obj;
                wi wiVar = this.f25737c;
                wiVar.f30013d0 = f7;
                oi oiVar2 = wiVar.f30084z0;
                if (oiVar2 != null) {
                    if (!(oiVar2 instanceof sm) && !(wiVar.f30081y0 instanceof sm)) {
                        oiVar2.setAlpha(f7);
                        wiVar.f30084z0.s(f7);
                        oi oiVar3 = wiVar.f30084z0;
                        wn wnVar = wiVar.m0;
                        int i11 = 0;
                        if (oiVar3 == wnVar || wiVar.f30081y0 == wnVar) {
                            if (oiVar3 == wnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            wiVar.a2(i10);
                        }
                        oi oiVar4 = wiVar.f30084z0;
                        wn wnVar2 = wiVar.f30043n0;
                        if (oiVar4 == wnVar2 || wiVar.f30081y0 == wnVar2) {
                            if (oiVar4 == wnVar2) {
                                i11 = 1;
                            }
                            wiVar.a2(i11);
                        }
                        wiVar.f30084z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        wiVar.f30081y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        wiVar.f30081y0.k(wiVar.f30039l2);
                    } else {
                        int max = Math.max(oiVar2.getWidth(), wiVar.f30081y0.getWidth());
                        if (wiVar.f30084z0 instanceof sm) {
                            wiVar.f30081y0.setTranslationX((-max) * f7);
                            wiVar.f30084z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            wiVar.f30081y0.setTranslationX(max * f7);
                            wiVar.f30084z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (wiVar.f30064t1 != null) {
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
                zh zhVar = this.f25737c.f30082y1;
                int childCount = zhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = zhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = sr.f28340g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(sr.f28342j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (sr.f28341i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ri) {
                        ((ri) childAt).f27928a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25736b) {
            case 0:
                oi oiVar = (oi) obj;
                return Float.valueOf(this.f25737c.f30013d0);
            default:
                wi wiVar = (wi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
