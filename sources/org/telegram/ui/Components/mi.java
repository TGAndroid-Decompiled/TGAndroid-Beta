package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class mi extends q6 {
    public final int f25237b;
    public final yi f25238c;

    public mi(yi yiVar, int i10) {
        super("translation", 0);
        this.f25237b = i10;
        switch (i10) {
            case 1:
                this.f25238c = yiVar;
                super("openProgress", 0);
                return;
            default:
                this.f25238c = yiVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f25237b) {
            case 0:
                qi qiVar = (qi) obj;
                yi yiVar = this.f25238c;
                yiVar.f29359d0 = f7;
                qi qiVar2 = yiVar.f29430z0;
                if (qiVar2 != null) {
                    if (!(qiVar2 instanceof xm) && !(yiVar.f29427y0 instanceof xm)) {
                        qiVar2.setAlpha(f7);
                        yiVar.f29430z0.s(f7);
                        qi qiVar3 = yiVar.f29430z0;
                        zn znVar = yiVar.m0;
                        int i11 = 0;
                        if (qiVar3 == znVar || yiVar.f29427y0 == znVar) {
                            if (qiVar3 == znVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            yiVar.a2(i10);
                        }
                        qi qiVar4 = yiVar.f29430z0;
                        zn znVar2 = yiVar.f29389n0;
                        if (qiVar4 == znVar2 || yiVar.f29427y0 == znVar2) {
                            if (qiVar4 == znVar2) {
                                i11 = 1;
                            }
                            yiVar.a2(i11);
                        }
                        yiVar.f29430z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        yiVar.f29427y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        yiVar.f29427y0.k(yiVar.f29385l2);
                    } else {
                        int max = Math.max(qiVar2.getWidth(), yiVar.f29427y0.getWidth());
                        if (yiVar.f29430z0 instanceof xm) {
                            yiVar.f29427y0.setTranslationX((-max) * f7);
                            yiVar.f29430z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            yiVar.f29427y0.setTranslationX(max * f7);
                            yiVar.f29430z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (yiVar.f29410t1 != null) {
                        yiVar.a2(1);
                    }
                    yiVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                yi yiVar2 = (yi) obj;
                bi biVar = this.f25238c.f29428y1;
                int childCount = biVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = biVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = wr.f28820g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(wr.f28822j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (wr.f28821i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ti) {
                        ((ti) childAt).f27412a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25237b) {
            case 0:
                qi qiVar = (qi) obj;
                return Float.valueOf(this.f25238c.f29359d0);
            default:
                yi yiVar = (yi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
