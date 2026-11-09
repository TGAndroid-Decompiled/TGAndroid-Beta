package org.telegram.ui.Components;

import android.view.View;
public final class oh extends l6 {
    public final int f36718b;
    public final di f36719c;

    public oh(di diVar, int i7) {
        super("translation", 0);
        this.f36718b = i7;
        switch (i7) {
            case 1:
                this.f36719c = diVar;
                super("openProgress", 0);
                return;
            default:
                this.f36719c = diVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        int i7;
        float f11;
        switch (this.f36718b) {
            case 0:
                vh vhVar = (vh) obj;
                di diVar = this.f36719c;
                diVar.U1 = f10;
                vh vhVar2 = diVar.f33051t2;
                if (vhVar2 != null) {
                    if (!(vhVar2 instanceof bm) && !(diVar.f33047s2 instanceof bm)) {
                        vhVar2.setAlpha(f10);
                        diVar.f33051t2.v(f10);
                        vh vhVar3 = diVar.f33051t2;
                        bn bnVar = diVar.d2;
                        int i10 = 0;
                        if (vhVar3 == bnVar || diVar.f33047s2 == bnVar) {
                            if (vhVar3 == bnVar) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            diVar.P1(i7);
                        }
                        vh vhVar4 = diVar.f33051t2;
                        bn bnVar2 = diVar.f32998e2;
                        if (vhVar4 == bnVar2 || diVar.f33047s2 == bnVar2) {
                            if (vhVar4 == bnVar2) {
                                i10 = 1;
                            }
                            diVar.P1(i10);
                        }
                        diVar.f33051t2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        diVar.f33047s2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        diVar.f33047s2.m(diVar.f33003f4);
                    } else {
                        int max = Math.max(vhVar2.getWidth(), diVar.f33047s2.getWidth());
                        if (diVar.f33051t2 instanceof bm) {
                            diVar.f33047s2.setTranslationX((-max) * f10);
                            diVar.f33051t2.setTranslationX((1.0f - f10) * max);
                        } else {
                            diVar.f33047s2.setTranslationX(max * f10);
                            diVar.f33051t2.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (diVar.f33029n3 != null) {
                        diVar.P1(1);
                    }
                    diVar.f28624b.invalidate();
                    return;
                }
                return;
            default:
                di diVar2 = (di) obj;
                eh ehVar = this.f36719c.f33048s3;
                int childCount = ehVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    float f12 = (3 - i11) * 32.0f;
                    View childAt = ehVar.getChildAt(i11);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = xq.f40459g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(xq.f40461j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (xq.f40460i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof yh) {
                        ((yh) childAt).f40720a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36718b) {
            case 0:
                vh vhVar = (vh) obj;
                return Float.valueOf(this.f36719c.U1);
            default:
                di diVar = (di) obj;
                return Float.valueOf(0.0f);
        }
    }
}
