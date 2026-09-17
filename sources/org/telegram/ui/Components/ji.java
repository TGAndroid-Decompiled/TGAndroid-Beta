package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ji extends s6 {
    public final int f27508b;
    public final vi f27509c;

    public ji(vi viVar, int i10) {
        super("translation", 0);
        this.f27508b = i10;
        switch (i10) {
            case 1:
                this.f27509c = viVar;
                super("openProgress", 0);
                return;
            default:
                this.f27509c = viVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f27508b) {
            case 0:
                ni niVar = (ni) obj;
                vi viVar = this.f27509c;
                viVar.f31272d0 = f7;
                ni niVar2 = viVar.f31344z0;
                if (niVar2 != null) {
                    if (!(niVar2 instanceof qm) && !(viVar.f31341y0 instanceof qm)) {
                        niVar2.setAlpha(f7);
                        viVar.f31344z0.s(f7);
                        ni niVar3 = viVar.f31344z0;
                        tn tnVar = viVar.m0;
                        int i11 = 0;
                        if (niVar3 == tnVar || viVar.f31341y0 == tnVar) {
                            if (niVar3 == tnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            viVar.a2(i10);
                        }
                        ni niVar4 = viVar.f31344z0;
                        tn tnVar2 = viVar.f31303n0;
                        if (niVar4 == tnVar2 || viVar.f31341y0 == tnVar2) {
                            if (niVar4 == tnVar2) {
                                i11 = 1;
                            }
                            viVar.a2(i11);
                        }
                        viVar.f31344z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        viVar.f31341y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        viVar.f31341y0.k(viVar.f31299l2);
                    } else {
                        int max = Math.max(niVar2.getWidth(), viVar.f31341y0.getWidth());
                        if (viVar.f31344z0 instanceof qm) {
                            viVar.f31341y0.setTranslationX((-max) * f7);
                            viVar.f31344z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            viVar.f31341y0.setTranslationX(max * f7);
                            viVar.f31344z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (viVar.f31324t1 != null) {
                        viVar.a2(1);
                    }
                    viVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                vi viVar2 = (vi) obj;
                yh yhVar = this.f27509c.f31342y1;
                int childCount = yhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = yhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = pr.f29468g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(pr.f29470j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (pr.f29469i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof qi) {
                        ((qi) childAt).f29741a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27508b) {
            case 0:
                ni niVar = (ni) obj;
                return Float.valueOf(this.f27509c.f31272d0);
            default:
                vi viVar = (vi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
