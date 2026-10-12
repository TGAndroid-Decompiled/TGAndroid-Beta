package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class oi extends t6 {
    public final int f29216b;
    public final aj f29217c;

    public oi(aj ajVar, int i10) {
        super("translation", 0);
        this.f29216b = i10;
        switch (i10) {
            case 1:
                this.f29217c = ajVar;
                super("openProgress", 0);
                return;
            default:
                this.f29217c = ajVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f29216b) {
            case 0:
                si siVar = (si) obj;
                aj ajVar = this.f29217c;
                ajVar.f24334d0 = f7;
                si siVar2 = ajVar.C0;
                if (siVar2 != null) {
                    if (!(siVar2 instanceof jn) && !(ajVar.B0 instanceof jn)) {
                        siVar2.setAlpha(f7);
                        ajVar.C0.v(f7);
                        si siVar3 = ajVar.C0;
                        no noVar = ajVar.m0;
                        int i11 = 0;
                        if (siVar3 == noVar || ajVar.B0 == noVar) {
                            if (siVar3 == noVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            ajVar.e2(i10);
                        }
                        si siVar4 = ajVar.C0;
                        no noVar2 = ajVar.f24365n0;
                        if (siVar4 == noVar2 || ajVar.B0 == noVar2) {
                            if (siVar4 == noVar2) {
                                i11 = 1;
                            }
                            ajVar.e2(i11);
                        }
                        ajVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        ajVar.B0.v(1.0f - Math.min(1.0f, f7 / 0.7f));
                        ajVar.B0.l(ajVar.f24370o2);
                    } else {
                        int max = Math.max(siVar2.getWidth(), ajVar.B0.getWidth());
                        if (ajVar.C0 instanceof jn) {
                            ajVar.B0.setTranslationX((-max) * f7);
                            ajVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            ajVar.B0.setTranslationX(max * f7);
                            ajVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (ajVar.f24396w1 != null) {
                        ajVar.e2(1);
                    }
                    ajVar.b1();
                    viewGroup = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                aj ajVar2 = (aj) obj;
                di diVar = this.f29217c.B1;
                int childCount = diVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = diVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = js.f27628g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(js.f27630j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (js.f27629i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof vi) {
                        ((vi) childAt).f31524a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29216b) {
            case 0:
                si siVar = (si) obj;
                return Float.valueOf(this.f29217c.f24334d0);
            default:
                aj ajVar = (aj) obj;
                return Float.valueOf(0.0f);
        }
    }
}
