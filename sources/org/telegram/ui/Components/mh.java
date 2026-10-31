package org.telegram.ui.Components;

import android.view.View;
public final class mh extends h6 {
    public final int f28446b;
    public final bi f28447c;

    public mh(bi biVar, int i10) {
        super("translation", 0);
        this.f28446b = i10;
        switch (i10) {
            case 1:
                this.f28447c = biVar;
                super("openProgress", 0);
                return;
            default:
                this.f28447c = biVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        int i10;
        float f10;
        switch (this.f28446b) {
            case 0:
                uh uhVar = (uh) obj;
                bi biVar = this.f28447c;
                biVar.U1 = f7;
                uh uhVar2 = biVar.f24725t2;
                if (uhVar2 != null) {
                    if (!(uhVar2 instanceof jm) && !(biVar.f24721s2 instanceof jm)) {
                        uhVar2.setAlpha(f7);
                        biVar.f24725t2.u(f7);
                        uh uhVar3 = biVar.f24725t2;
                        jn jnVar = biVar.f24667d2;
                        int i11 = 0;
                        if (uhVar3 == jnVar || biVar.f24721s2 == jnVar) {
                            if (uhVar3 == jnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            biVar.O1(i10);
                        }
                        uh uhVar4 = biVar.f24725t2;
                        jn jnVar2 = biVar.f24670e2;
                        if (uhVar4 == jnVar2 || biVar.f24721s2 == jnVar2) {
                            if (uhVar4 == jnVar2) {
                                i11 = 1;
                            }
                            biVar.O1(i11);
                        }
                        biVar.f24725t2.setTranslationY(org.telegram.messenger.i0.L(78.0f) * f7);
                        biVar.f24721s2.u(1.0f - Math.min(1.0f, f7 / 0.7f));
                        biVar.f24721s2.l(biVar.f24675f4);
                    } else {
                        int max = Math.max(uhVar2.getWidth(), biVar.f24721s2.getWidth());
                        if (biVar.f24725t2 instanceof jm) {
                            biVar.f24721s2.setTranslationX((-max) * f7);
                            biVar.f24725t2.setTranslationX((1.0f - f7) * max);
                        } else {
                            biVar.f24721s2.setTranslationX(max * f7);
                            biVar.f24725t2.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (biVar.f24702n3 != null) {
                        biVar.O1(1);
                    }
                    biVar.f21586b.invalidate();
                    return;
                }
                return;
            default:
                bi biVar2 = (bi) obj;
                bh bhVar = this.f28447c.f24722s3;
                int childCount = bhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = bhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = gr.f26496g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(gr.f26498j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (gr.f26497i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof xh) {
                        ((xh) childAt).f32471a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f28446b) {
            case 0:
                uh uhVar = (uh) obj;
                return Float.valueOf(this.f28447c.U1);
            default:
                bi biVar = (bi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
