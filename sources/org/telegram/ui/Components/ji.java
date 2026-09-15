package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ji extends p6 {
    public final int f25349b;
    public final vi f25350c;

    public ji(vi viVar, int i10) {
        super("translation", 0);
        this.f25349b = i10;
        switch (i10) {
            case 1:
                this.f25350c = viVar;
                super("openProgress", 0);
                return;
            default:
                this.f25350c = viVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f25349b) {
            case 0:
                ni niVar = (ni) obj;
                vi viVar = this.f25350c;
                viVar.f28743d0 = f7;
                ni niVar2 = viVar.f28814z0;
                if (niVar2 != null) {
                    if (!(niVar2 instanceof qm) && !(viVar.f28811y0 instanceof qm)) {
                        niVar2.setAlpha(f7);
                        viVar.f28814z0.s(f7);
                        ni niVar3 = viVar.f28814z0;
                        un unVar = viVar.m0;
                        int i11 = 0;
                        if (niVar3 == unVar || viVar.f28811y0 == unVar) {
                            if (niVar3 == unVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            viVar.a2(i10);
                        }
                        ni niVar4 = viVar.f28814z0;
                        un unVar2 = viVar.f28773n0;
                        if (niVar4 == unVar2 || viVar.f28811y0 == unVar2) {
                            if (niVar4 == unVar2) {
                                i11 = 1;
                            }
                            viVar.a2(i11);
                        }
                        viVar.f28814z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        viVar.f28811y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        viVar.f28811y0.k(viVar.f28769l2);
                    } else {
                        int max = Math.max(niVar2.getWidth(), viVar.f28811y0.getWidth());
                        if (viVar.f28814z0 instanceof qm) {
                            viVar.f28811y0.setTranslationX((-max) * f7);
                            viVar.f28814z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            viVar.f28811y0.setTranslationX(max * f7);
                            viVar.f28814z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (viVar.f28794t1 != null) {
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
                yh yhVar = this.f25350c.f28812y1;
                int childCount = yhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = yhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = qr.f27424g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(qr.f27426j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (qr.f27425i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof qi) {
                        ((qi) childAt).f27361a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25349b) {
            case 0:
                ni niVar = (ni) obj;
                return Float.valueOf(this.f25350c.f28743d0);
            default:
                vi viVar = (vi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
