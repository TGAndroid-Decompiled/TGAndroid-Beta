package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class li extends r6 {
    public final int f25999b;
    public final xi f26000c;

    public li(xi xiVar, int i10) {
        super("translation", 0);
        this.f25999b = i10;
        switch (i10) {
            case 1:
                this.f26000c = xiVar;
                super("openProgress", 0);
                return;
            default:
                this.f26000c = xiVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f25999b) {
            case 0:
                pi piVar = (pi) obj;
                xi xiVar = this.f26000c;
                xiVar.f30263d0 = f7;
                pi piVar2 = xiVar.f30334z0;
                if (piVar2 != null) {
                    if (!(piVar2 instanceof tm) && !(xiVar.f30331y0 instanceof tm)) {
                        piVar2.setAlpha(f7);
                        xiVar.f30334z0.s(f7);
                        pi piVar3 = xiVar.f30334z0;
                        xn xnVar = xiVar.m0;
                        int i11 = 0;
                        if (piVar3 == xnVar || xiVar.f30331y0 == xnVar) {
                            if (piVar3 == xnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            xiVar.a2(i10);
                        }
                        pi piVar4 = xiVar.f30334z0;
                        xn xnVar2 = xiVar.f30293n0;
                        if (piVar4 == xnVar2 || xiVar.f30331y0 == xnVar2) {
                            if (piVar4 == xnVar2) {
                                i11 = 1;
                            }
                            xiVar.a2(i11);
                        }
                        xiVar.f30334z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        xiVar.f30331y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        xiVar.f30331y0.k(xiVar.f30289l2);
                    } else {
                        int max = Math.max(piVar2.getWidth(), xiVar.f30331y0.getWidth());
                        if (xiVar.f30334z0 instanceof tm) {
                            xiVar.f30331y0.setTranslationX((-max) * f7);
                            xiVar.f30334z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            xiVar.f30331y0.setTranslationX(max * f7);
                            xiVar.f30334z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (xiVar.f30314t1 != null) {
                        xiVar.a2(1);
                    }
                    xiVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.e3) xiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                xi xiVar2 = (xi) obj;
                ai aiVar = this.f26000c.f30332y1;
                int childCount = aiVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = aiVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = tr.f28637g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(tr.f28639j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (tr.f28638i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof si) {
                        ((si) childAt).f28263a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25999b) {
            case 0:
                pi piVar = (pi) obj;
                return Float.valueOf(this.f26000c.f30263d0);
            default:
                xi xiVar = (xi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
