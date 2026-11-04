package org.telegram.ui.Components;

import android.view.View;
public final class lh extends j6 {
    public final int f35727b;
    public final bi f35728c;

    public lh(bi biVar, int i3) {
        super("translation", 0);
        this.f35727b = i3;
        switch (i3) {
            case 1:
                this.f35728c = biVar;
                super("openProgress", 0);
                return;
            default:
                this.f35728c = biVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        int i3;
        float f11;
        switch (this.f35727b) {
            case 0:
                th thVar = (th) obj;
                bi biVar = this.f35728c;
                biVar.V1 = f10;
                th thVar2 = biVar.f32279u2;
                if (thVar2 != null) {
                    if (!(thVar2 instanceof am) && !(biVar.f32275t2 instanceof am)) {
                        thVar2.setAlpha(f10);
                        biVar.f32279u2.v(f10);
                        th thVar3 = biVar.f32279u2;
                        an anVar = biVar.f32223e2;
                        int i10 = 0;
                        if (thVar3 == anVar || biVar.f32275t2 == anVar) {
                            if (thVar3 == anVar) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            biVar.P1(i3);
                        }
                        th thVar4 = biVar.f32279u2;
                        an anVar2 = biVar.f32226f2;
                        if (thVar4 == anVar2 || biVar.f32275t2 == anVar2) {
                            if (thVar4 == anVar2) {
                                i10 = 1;
                            }
                            biVar.P1(i10);
                        }
                        biVar.f32279u2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        biVar.f32275t2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        biVar.f32275t2.m(biVar.f32231g4);
                    } else {
                        int max = Math.max(thVar2.getWidth(), biVar.f32275t2.getWidth());
                        if (biVar.f32279u2 instanceof am) {
                            biVar.f32275t2.setTranslationX((-max) * f10);
                            biVar.f32279u2.setTranslationX((1.0f - f10) * max);
                        } else {
                            biVar.f32275t2.setTranslationX(max * f10);
                            biVar.f32279u2.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (biVar.f32256o3 != null) {
                        biVar.P1(1);
                    }
                    biVar.f28586b.invalidate();
                    return;
                }
                return;
            default:
                bi biVar2 = (bi) obj;
                bh bhVar = this.f35728c.f32276t3;
                int childCount = bhVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    float f12 = (3 - i11) * 32.0f;
                    View childAt = bhVar.getChildAt(i11);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = xq.f40453g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(xq.f40455j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (xq.f40454i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof wh) {
                        ((wh) childAt).f40008a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f35727b) {
            case 0:
                th thVar = (th) obj;
                return Float.valueOf(this.f35728c.V1);
            default:
                bi biVar = (bi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
