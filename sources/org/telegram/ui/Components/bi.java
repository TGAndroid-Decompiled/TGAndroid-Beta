package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class bi extends q6 {
    public final int f27111b;
    public final ni f27112c;

    public bi(ni niVar, int i10) {
        super("translation", 0);
        this.f27111b = i10;
        switch (i10) {
            case 1:
                this.f27112c = niVar;
                super("openProgress", 0);
                return;
            default:
                this.f27112c = niVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f9) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f27111b) {
            case 0:
                fi fiVar = (fi) obj;
                ni niVar = this.f27112c;
                niVar.Z = f9;
                fi fiVar2 = niVar.f31054v0;
                if (fiVar2 != null) {
                    if (!(fiVar2 instanceof lm) && !(niVar.f31051u0 instanceof lm)) {
                        fiVar2.setAlpha(f9);
                        niVar.f31054v0.s(f9);
                        fi fiVar3 = niVar.f31054v0;
                        on onVar = niVar.f31014i0;
                        int i11 = 0;
                        if (fiVar3 == onVar || niVar.f31051u0 == onVar) {
                            if (fiVar3 == onVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            niVar.a2(i10);
                        }
                        fi fiVar4 = niVar.f31054v0;
                        on onVar2 = niVar.f31017j0;
                        if (fiVar4 == onVar2 || niVar.f31051u0 == onVar2) {
                            if (fiVar4 == onVar2) {
                                i11 = 1;
                            }
                            niVar.a2(i11);
                        }
                        niVar.f31054v0.setTranslationY(AndroidUtilities.dp(78.0f) * f9);
                        niVar.f31051u0.s(1.0f - Math.min(1.0f, f9 / 0.7f));
                        niVar.f31051u0.k(niVar.f31013h2);
                    } else {
                        int max = Math.max(fiVar2.getWidth(), niVar.f31051u0.getWidth());
                        if (niVar.f31054v0 instanceof lm) {
                            niVar.f31051u0.setTranslationX((-max) * f9);
                            niVar.f31054v0.setTranslationX((1.0f - f9) * max);
                        } else {
                            niVar.f31051u0.setTranslationX(max * f9);
                            niVar.f31054v0.setTranslationX((1.0f - f9) * (-max));
                        }
                    }
                    if (niVar.f31035p1 != null) {
                        niVar.a2(1);
                    }
                    niVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                ni niVar2 = (ni) obj;
                qh qhVar = this.f27112c.f31052u1;
                int childCount = qhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = qhVar.getChildAt(i12);
                    if (f9 > f11) {
                        float f12 = f9 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = jr.f29801g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(jr.f29803j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (jr.f29802i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ii) {
                        ((ii) childAt).f29393a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27111b) {
            case 0:
                fi fiVar = (fi) obj;
                return Float.valueOf(this.f27112c.Z);
            default:
                ni niVar = (ni) obj;
                return Float.valueOf(0.0f);
        }
    }
}
