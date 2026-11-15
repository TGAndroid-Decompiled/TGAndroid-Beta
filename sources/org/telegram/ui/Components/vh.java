package org.telegram.ui.Components;

import android.view.View;
public final class vh extends j6 {
    public final int f40414b;
    public final ki f40415c;

    public vh(ki kiVar, int i7) {
        super("translation", 0);
        this.f40414b = i7;
        switch (i7) {
            case 1:
                this.f40415c = kiVar;
                super("openProgress", 0);
                return;
            default:
                this.f40415c = kiVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        int i7;
        float f11;
        switch (this.f40414b) {
            case 0:
                ci ciVar = (ci) obj;
                ki kiVar = this.f40415c;
                kiVar.Y1 = f10;
                ci ciVar2 = kiVar.f36501x2;
                if (ciVar2 != null) {
                    if (!(ciVar2 instanceof im) && !(kiVar.f36497w2 instanceof im)) {
                        ciVar2.setAlpha(f10);
                        kiVar.f36501x2.v(f10);
                        ci ciVar3 = kiVar.f36501x2;
                        jn jnVar = kiVar.f36444h2;
                        int i10 = 0;
                        if (ciVar3 == jnVar || kiVar.f36497w2 == jnVar) {
                            if (ciVar3 == jnVar) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            kiVar.P1(i7);
                        }
                        ci ciVar4 = kiVar.f36501x2;
                        jn jnVar2 = kiVar.f36447i2;
                        if (ciVar4 == jnVar2 || kiVar.f36497w2 == jnVar2) {
                            if (ciVar4 == jnVar2) {
                                i10 = 1;
                            }
                            kiVar.P1(i10);
                        }
                        kiVar.f36501x2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        kiVar.f36497w2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        kiVar.f36497w2.m(kiVar.f36451j4);
                    } else {
                        int max = Math.max(ciVar2.getWidth(), kiVar.f36497w2.getWidth());
                        if (kiVar.f36501x2 instanceof im) {
                            kiVar.f36497w2.setTranslationX((-max) * f10);
                            kiVar.f36501x2.setTranslationX((1.0f - f10) * max);
                        } else {
                            kiVar.f36497w2.setTranslationX(max * f10);
                            kiVar.f36501x2.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (kiVar.f36478r3 != null) {
                        kiVar.P1(1);
                    }
                    kiVar.f29682b.invalidate();
                    return;
                }
                return;
            default:
                ki kiVar2 = (ki) obj;
                lh lhVar = this.f40415c.f36498w3;
                int childCount = lhVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    float f12 = (3 - i11) * 32.0f;
                    View childAt = lhVar.getChildAt(i11);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = er.f34420g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(er.f34422j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (er.f34421i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof fi) {
                        ((fi) childAt).f34616a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40414b) {
            case 0:
                ci ciVar = (ci) obj;
                return Float.valueOf(this.f40415c.Y1);
            default:
                ki kiVar = (ki) obj;
                return Float.valueOf(0.0f);
        }
    }
}
