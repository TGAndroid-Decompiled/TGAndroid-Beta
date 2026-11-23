package org.telegram.ui.Components;

import android.view.View;
public final class ei extends p6 {
    public final int f34724b;
    public final ti f34725c;

    public ei(ti tiVar, int i7) {
        super("translation", 0);
        this.f34724b = i7;
        switch (i7) {
            case 1:
                this.f34725c = tiVar;
                super("openProgress", 0);
                return;
            default:
                this.f34725c = tiVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        int i7;
        float f11;
        switch (this.f34724b) {
            case 0:
                li liVar = (li) obj;
                ti tiVar = this.f34725c;
                tiVar.Y1 = f10;
                li liVar2 = tiVar.f40033x2;
                if (liVar2 != null) {
                    if (!(liVar2 instanceof pm) && !(tiVar.f40029w2 instanceof pm)) {
                        liVar2.setAlpha(f10);
                        tiVar.f40033x2.v(f10);
                        li liVar3 = tiVar.f40033x2;
                        qn qnVar = tiVar.f39976h2;
                        int i10 = 0;
                        if (liVar3 == qnVar || tiVar.f40029w2 == qnVar) {
                            if (liVar3 == qnVar) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            tiVar.Q1(i7);
                        }
                        li liVar4 = tiVar.f40033x2;
                        qn qnVar2 = tiVar.f39979i2;
                        if (liVar4 == qnVar2 || tiVar.f40029w2 == qnVar2) {
                            if (liVar4 == qnVar2) {
                                i10 = 1;
                            }
                            tiVar.Q1(i10);
                        }
                        tiVar.f40033x2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        tiVar.f40029w2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        tiVar.f40029w2.m(tiVar.f39983j4);
                    } else {
                        int max = Math.max(liVar2.getWidth(), tiVar.f40029w2.getWidth());
                        if (tiVar.f40033x2 instanceof pm) {
                            tiVar.f40029w2.setTranslationX((-max) * f10);
                            tiVar.f40033x2.setTranslationX((1.0f - f10) * max);
                        } else {
                            tiVar.f40029w2.setTranslationX(max * f10);
                            tiVar.f40033x2.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (tiVar.f40010r3 != null) {
                        tiVar.Q1(1);
                    }
                    tiVar.f30226b.invalidate();
                    return;
                }
                return;
            default:
                ti tiVar2 = (ti) obj;
                uh uhVar = this.f34725c.f40030w3;
                int childCount = uhVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    float f12 = (3 - i11) * 32.0f;
                    View childAt = uhVar.getChildAt(i11);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = kr.f36859g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(kr.f36861j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (kr.f36860i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof oi) {
                        ((oi) childAt).f38160a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f34724b) {
            case 0:
                li liVar = (li) obj;
                return Float.valueOf(this.f34725c.Y1);
            default:
                ti tiVar = (ti) obj;
                return Float.valueOf(0.0f);
        }
    }
}
