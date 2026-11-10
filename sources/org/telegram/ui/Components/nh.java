package org.telegram.ui.Components;

import android.view.View;
public final class nh extends k6 {
    public final int f36308b;
    public final ci f36309c;

    public nh(ci ciVar, int i7) {
        super("translation", 0);
        this.f36308b = i7;
        switch (i7) {
            case 1:
                this.f36309c = ciVar;
                super("openProgress", 0);
                return;
            default:
                this.f36309c = ciVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        int i7;
        float f11;
        switch (this.f36308b) {
            case 0:
                uh uhVar = (uh) obj;
                ci ciVar = this.f36309c;
                ciVar.X1 = f10;
                uh uhVar2 = ciVar.f32664w2;
                if (uhVar2 != null) {
                    if (!(uhVar2 instanceof am) && !(ciVar.f32660v2 instanceof am)) {
                        uhVar2.setAlpha(f10);
                        ciVar.f32664w2.v(f10);
                        uh uhVar3 = ciVar.f32664w2;
                        an anVar = ciVar.f32608g2;
                        int i10 = 0;
                        if (uhVar3 == anVar || ciVar.f32660v2 == anVar) {
                            if (uhVar3 == anVar) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            ciVar.P1(i7);
                        }
                        uh uhVar4 = ciVar.f32664w2;
                        an anVar2 = ciVar.f32611h2;
                        if (uhVar4 == anVar2 || ciVar.f32660v2 == anVar2) {
                            if (uhVar4 == anVar2) {
                                i10 = 1;
                            }
                            ciVar.P1(i10);
                        }
                        ciVar.f32664w2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        ciVar.f32660v2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        ciVar.f32660v2.m(ciVar.f32616i4);
                    } else {
                        int max = Math.max(uhVar2.getWidth(), ciVar.f32660v2.getWidth());
                        if (ciVar.f32664w2 instanceof am) {
                            ciVar.f32660v2.setTranslationX((-max) * f10);
                            ciVar.f32664w2.setTranslationX((1.0f - f10) * max);
                        } else {
                            ciVar.f32660v2.setTranslationX(max * f10);
                            ciVar.f32664w2.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (ciVar.f32641q3 != null) {
                        ciVar.P1(1);
                    }
                    ciVar.f28672b.invalidate();
                    return;
                }
                return;
            default:
                ci ciVar2 = (ci) obj;
                dh dhVar = this.f36309c.f32661v3;
                int childCount = dhVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    float f12 = (3 - i11) * 32.0f;
                    View childAt = dhVar.getChildAt(i11);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = wq.f40047g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(wq.f40049j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (wq.f40048i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof xh) {
                        ((xh) childAt).f40307a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36308b) {
            case 0:
                uh uhVar = (uh) obj;
                return Float.valueOf(this.f36309c.X1);
            default:
                ci ciVar = (ci) obj;
                return Float.valueOf(0.0f);
        }
    }
}
