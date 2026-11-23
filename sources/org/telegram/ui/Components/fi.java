package org.telegram.ui.Components;

import android.view.View;
public final class fi extends q6 {
    public final int f35240b;
    public final ui f35241c;

    public fi(ui uiVar, int i7) {
        super("translation", 0);
        this.f35240b = i7;
        switch (i7) {
            case 1:
                this.f35241c = uiVar;
                super("openProgress", 0);
                return;
            default:
                this.f35241c = uiVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        int i7;
        float f11;
        switch (this.f35240b) {
            case 0:
                mi miVar = (mi) obj;
                ui uiVar = this.f35241c;
                uiVar.Y1 = f10;
                mi miVar2 = uiVar.f40445x2;
                if (miVar2 != null) {
                    if (!(miVar2 instanceof rm) && !(uiVar.f40441w2 instanceof rm)) {
                        miVar2.setAlpha(f10);
                        uiVar.f40445x2.v(f10);
                        mi miVar3 = uiVar.f40445x2;
                        tn tnVar = uiVar.f40388h2;
                        int i10 = 0;
                        if (miVar3 == tnVar || uiVar.f40441w2 == tnVar) {
                            if (miVar3 == tnVar) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            uiVar.Q1(i7);
                        }
                        mi miVar4 = uiVar.f40445x2;
                        tn tnVar2 = uiVar.f40391i2;
                        if (miVar4 == tnVar2 || uiVar.f40441w2 == tnVar2) {
                            if (miVar4 == tnVar2) {
                                i10 = 1;
                            }
                            uiVar.Q1(i10);
                        }
                        uiVar.f40445x2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        uiVar.f40441w2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        uiVar.f40441w2.m(uiVar.f40395j4);
                    } else {
                        int max = Math.max(miVar2.getWidth(), uiVar.f40441w2.getWidth());
                        if (uiVar.f40445x2 instanceof rm) {
                            uiVar.f40441w2.setTranslationX((-max) * f10);
                            uiVar.f40445x2.setTranslationX((1.0f - f10) * max);
                        } else {
                            uiVar.f40441w2.setTranslationX(max * f10);
                            uiVar.f40445x2.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (uiVar.f40422r3 != null) {
                        uiVar.Q1(1);
                    }
                    uiVar.f30176b.invalidate();
                    return;
                }
                return;
            default:
                ui uiVar2 = (ui) obj;
                vh vhVar = this.f35241c.f40442w3;
                int childCount = vhVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    float f12 = (3 - i11) * 32.0f;
                    View childAt = vhVar.getChildAt(i11);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = nr.f37962g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(nr.f37964j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (nr.f37963i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof pi) {
                        ((pi) childAt).f38602a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f35240b) {
            case 0:
                mi miVar = (mi) obj;
                return Float.valueOf(this.f35241c.Y1);
            default:
                ui uiVar = (ui) obj;
                return Float.valueOf(0.0f);
        }
    }
}
