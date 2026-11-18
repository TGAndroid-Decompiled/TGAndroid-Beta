package org.telegram.ui.Components;

import android.view.View;
public final class di extends p6 {
    public final int f34446b;
    public final si f34447c;

    public di(si siVar, int i7) {
        super("translation", 0);
        this.f34446b = i7;
        switch (i7) {
            case 1:
                this.f34447c = siVar;
                super("openProgress", 0);
                return;
            default:
                this.f34447c = siVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        int i7;
        float f11;
        switch (this.f34446b) {
            case 0:
                ki kiVar = (ki) obj;
                si siVar = this.f34447c;
                siVar.Y1 = f10;
                ki kiVar2 = siVar.f39736x2;
                if (kiVar2 != null) {
                    if (!(kiVar2 instanceof pm) && !(siVar.f39732w2 instanceof pm)) {
                        kiVar2.setAlpha(f10);
                        siVar.f39736x2.v(f10);
                        ki kiVar3 = siVar.f39736x2;
                        rn rnVar = siVar.f39679h2;
                        int i10 = 0;
                        if (kiVar3 == rnVar || siVar.f39732w2 == rnVar) {
                            if (kiVar3 == rnVar) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            siVar.Q1(i7);
                        }
                        ki kiVar4 = siVar.f39736x2;
                        rn rnVar2 = siVar.f39682i2;
                        if (kiVar4 == rnVar2 || siVar.f39732w2 == rnVar2) {
                            if (kiVar4 == rnVar2) {
                                i10 = 1;
                            }
                            siVar.Q1(i10);
                        }
                        siVar.f39736x2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        siVar.f39732w2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        siVar.f39732w2.m(siVar.f39686j4);
                    } else {
                        int max = Math.max(kiVar2.getWidth(), siVar.f39732w2.getWidth());
                        if (siVar.f39736x2 instanceof pm) {
                            siVar.f39732w2.setTranslationX((-max) * f10);
                            siVar.f39736x2.setTranslationX((1.0f - f10) * max);
                        } else {
                            siVar.f39732w2.setTranslationX(max * f10);
                            siVar.f39736x2.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (siVar.f39713r3 != null) {
                        siVar.Q1(1);
                    }
                    siVar.f30190b.invalidate();
                    return;
                }
                return;
            default:
                si siVar2 = (si) obj;
                th thVar = this.f34447c.f39733w3;
                int childCount = thVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    float f12 = (3 - i11) * 32.0f;
                    View childAt = thVar.getChildAt(i11);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = lr.f37209g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(lr.f37211j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (lr.f37210i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof ni) {
                        ((ni) childAt).f37793a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f34446b) {
            case 0:
                ki kiVar = (ki) obj;
                return Float.valueOf(this.f34447c.Y1);
            default:
                si siVar = (si) obj;
                return Float.valueOf(0.0f);
        }
    }
}
