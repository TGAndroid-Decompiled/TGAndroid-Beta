package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class fi extends q6 {
    public final int f26325b;
    public final ri f26326c;

    public fi(ri riVar, int i10) {
        super("translation", 0);
        this.f26325b = i10;
        switch (i10) {
            case 1:
                this.f26326c = riVar;
                super("openProgress", 0);
                return;
            default:
                this.f26326c = riVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f26325b) {
            case 0:
                ji jiVar = (ji) obj;
                ri riVar = this.f26326c;
                riVar.f30139d0 = f7;
                ji jiVar2 = riVar.C0;
                if (jiVar2 != null) {
                    if (!(jiVar2 instanceof zm) && !(riVar.B0 instanceof zm)) {
                        jiVar2.setAlpha(f7);
                        riVar.C0.v(f7);
                        ji jiVar3 = riVar.C0;
                        co coVar = riVar.m0;
                        int i11 = 0;
                        if (jiVar3 == coVar || riVar.B0 == coVar) {
                            if (jiVar3 == coVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            riVar.i2(i10);
                        }
                        ji jiVar4 = riVar.C0;
                        co coVar2 = riVar.f30169n0;
                        if (jiVar4 == coVar2 || riVar.B0 == coVar2) {
                            if (jiVar4 == coVar2) {
                                i11 = 1;
                            }
                            riVar.i2(i11);
                        }
                        riVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        riVar.B0.v(1.0f - Math.min(1.0f, f7 / 0.7f));
                        riVar.B0.l(riVar.f30174o2);
                    } else {
                        int max = Math.max(jiVar2.getWidth(), riVar.B0.getWidth());
                        if (riVar.C0 instanceof zm) {
                            riVar.B0.setTranslationX((-max) * f7);
                            riVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            riVar.B0.setTranslationX(max * f7);
                            riVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (riVar.f30200w1 != null) {
                        riVar.i2(1);
                    }
                    riVar.e1();
                    viewGroup = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                ri riVar2 = (ri) obj;
                vh vhVar = this.f26326c.B1;
                int childCount = vhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = vhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = zr.f33338g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(zr.f33340j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (zr.f33339i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof mi) {
                        ((mi) childAt).f28603a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f26325b) {
            case 0:
                ji jiVar = (ji) obj;
                return Float.valueOf(this.f26326c.f30139d0);
            default:
                ri riVar = (ri) obj;
                return Float.valueOf(0.0f);
        }
    }
}
