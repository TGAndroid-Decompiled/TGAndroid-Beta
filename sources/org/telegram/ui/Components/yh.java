package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends l6 {
    public final int f34969b;
    public final ki f34970c;

    public yh(ki kiVar, int i9) {
        super("translation", 0);
        this.f34969b = i9;
        switch (i9) {
            case 1:
                this.f34970c = kiVar;
                super("openProgress", 0);
                return;
            default:
                this.f34970c = kiVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        int i9;
        float f11;
        switch (this.f34969b) {
            case 0:
                ci ciVar = (ci) obj;
                ki kiVar = this.f34970c;
                kiVar.Z = f10;
                ci ciVar2 = kiVar.f30163v0;
                if (ciVar2 != null) {
                    if (!(ciVar2 instanceof hm) && !(kiVar.f30160u0 instanceof hm)) {
                        ciVar2.setAlpha(f10);
                        kiVar.f30163v0.s(f10);
                        ci ciVar3 = kiVar.f30163v0;
                        jn jnVar = kiVar.f30123i0;
                        int i10 = 0;
                        if (ciVar3 == jnVar || kiVar.f30160u0 == jnVar) {
                            if (ciVar3 == jnVar) {
                                i9 = 1;
                            } else {
                                i9 = 0;
                            }
                            kiVar.a2(i9);
                        }
                        ci ciVar4 = kiVar.f30163v0;
                        jn jnVar2 = kiVar.f30126j0;
                        if (ciVar4 == jnVar2 || kiVar.f30160u0 == jnVar2) {
                            if (ciVar4 == jnVar2) {
                                i10 = 1;
                            }
                            kiVar.a2(i10);
                        }
                        kiVar.f30163v0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        kiVar.f30160u0.s(1.0f - Math.min(1.0f, f10 / 0.7f));
                        kiVar.f30160u0.k(kiVar.f30122h2);
                    } else {
                        int max = Math.max(ciVar2.getWidth(), kiVar.f30160u0.getWidth());
                        if (kiVar.f30163v0 instanceof hm) {
                            kiVar.f30160u0.setTranslationX((-max) * f10);
                            kiVar.f30163v0.setTranslationX((1.0f - f10) * max);
                        } else {
                            kiVar.f30160u0.setTranslationX(max * f10);
                            kiVar.f30163v0.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (kiVar.f30144p1 != null) {
                        kiVar.a2(1);
                    }
                    kiVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                ki kiVar2 = (ki) obj;
                nh nhVar = this.f34970c.f30161u1;
                int childCount = nhVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    float f12 = (3 - i11) * 32.0f;
                    View childAt = nhVar.getChildAt(i11);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = gr.f28845g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(gr.f28847j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (gr.f28846i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof fi) {
                        ((fi) childAt).f28435a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f34969b) {
            case 0:
                ci ciVar = (ci) obj;
                return Float.valueOf(this.f34970c.Z);
            default:
                ki kiVar = (ki) obj;
                return Float.valueOf(0.0f);
        }
    }
}
