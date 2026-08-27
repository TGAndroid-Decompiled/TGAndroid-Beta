package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class uh extends l6 {

    public final int f33082b;

    public final gi f33083c;

    public uh(gi giVar, int i10) {
        super("translation", 0);
        this.f33082b = i10;
        switch (i10) {
            case 1:
                this.f33083c = giVar;
                super("openProgress", 0);
                break;
            default:
                this.f33083c = giVar;
                break;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        float interpolation;
        switch (this.f33082b) {
            case 0:
                gi giVar = this.f33083c;
                giVar.Z = f10;
                yh yhVar = giVar.f28699v0;
                if (yhVar != null) {
                    if ((yhVar instanceof em) || (giVar.f28696u0 instanceof em)) {
                        int iMax = Math.max(yhVar.getWidth(), giVar.f28696u0.getWidth());
                        if (giVar.f28699v0 instanceof em) {
                            giVar.f28696u0.setTranslationX((-iMax) * f10);
                            giVar.f28699v0.setTranslationX((1.0f - f10) * iMax);
                        } else {
                            giVar.f28696u0.setTranslationX(iMax * f10);
                            giVar.f28699v0.setTranslationX((1.0f - f10) * (-iMax));
                        }
                    } else {
                        yhVar.setAlpha(f10);
                        giVar.f28699v0.t(f10);
                        yh yhVar2 = giVar.f28699v0;
                        in inVar = giVar.f28659i0;
                        if (yhVar2 == inVar || giVar.f28696u0 == inVar) {
                            giVar.a2(yhVar2 == inVar ? 1 : 0);
                        }
                        yh yhVar3 = giVar.f28699v0;
                        in inVar2 = giVar.f28662j0;
                        if (yhVar3 == inVar2 || giVar.f28696u0 == inVar2) {
                            giVar.a2(yhVar3 == inVar2 ? 1 : 0);
                        }
                        giVar.f28699v0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        giVar.f28696u0.t(1.0f - Math.min(1.0f, f10 / 0.7f));
                        giVar.f28696u0.k(giVar.f28658h2);
                    }
                    if (giVar.f28680p1 != null) {
                        giVar.a2(1);
                    }
                    giVar.Z0();
                    ((org.telegram.ui.ActionBar.e3) giVar).containerView.invalidate();
                    break;
                }
                break;
            default:
                jh jhVar = this.f33083c.f28697u1;
                int childCount = jhVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    float f11 = (3 - i10) * 32.0f;
                    View childAt = jhVar.getChildAt(i10);
                    if (f10 > f11) {
                        float f12 = f10 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            interpolation = er.f28123g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(er.f28125j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            interpolation = f14 <= 100.0f ? 1.1f - (er.f28124i.getInterpolation(f14 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        interpolation = 0.0f;
                    }
                    if (childAt instanceof bi) {
                        ((bi) childAt).f27104a.setAttachScale(interpolation);
                    }
                }
                break;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f33082b) {
            case 0:
                return Float.valueOf(this.f33083c.Z);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
