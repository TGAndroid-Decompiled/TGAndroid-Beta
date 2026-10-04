package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ii extends r6 {
    public final int f27416b;
    public final xi f27417c;

    public ii(xi xiVar, int i10) {
        super("translation", 0);
        this.f27416b = i10;
        switch (i10) {
            case 1:
                this.f27417c = xiVar;
                super("openProgress", 0);
                return;
            default:
                this.f27417c = xiVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f27416b) {
            case 0:
                pi piVar = (pi) obj;
                xi xiVar = this.f27417c;
                xiVar.f32804d0 = f7;
                pi piVar2 = xiVar.f32876z0;
                if (piVar2 != null) {
                    if (!(piVar2 instanceof tm) && !(xiVar.f32873y0 instanceof tm)) {
                        piVar2.setAlpha(f7);
                        xiVar.f32876z0.s(f7);
                        pi piVar3 = xiVar.f32876z0;
                        xn xnVar = xiVar.m0;
                        int i11 = 0;
                        if (piVar3 == xnVar || xiVar.f32873y0 == xnVar) {
                            if (piVar3 == xnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            xiVar.X1(i10);
                        }
                        pi piVar4 = xiVar.f32876z0;
                        xn xnVar2 = xiVar.f32835n0;
                        if (piVar4 == xnVar2 || xiVar.f32873y0 == xnVar2) {
                            if (piVar4 == xnVar2) {
                                i11 = 1;
                            }
                            xiVar.X1(i11);
                        }
                        xiVar.f32876z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        xiVar.f32873y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        xiVar.f32873y0.k(xiVar.f32831l2);
                    } else {
                        int max = Math.max(piVar2.getWidth(), xiVar.f32873y0.getWidth());
                        if (xiVar.f32876z0 instanceof tm) {
                            xiVar.f32873y0.setTranslationX((-max) * f7);
                            xiVar.f32876z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            xiVar.f32873y0.setTranslationX(max * f7);
                            xiVar.f32876z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (xiVar.f32856t1 != null) {
                        xiVar.X1(1);
                    }
                    viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                xi xiVar2 = (xi) obj;
                xh xhVar = this.f27417c.f32874y1;
                int childCount = xhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = xhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = tr.f31141g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(tr.f31143j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (tr.f31142i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof si) {
                        ((si) childAt).f30731a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27416b) {
            case 0:
                pi piVar = (pi) obj;
                return Float.valueOf(this.f27417c.f32804d0);
            default:
                xi xiVar = (xi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
