package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class mi extends t6 {
    public final int f28858b;
    public final yi f28859c;

    public mi(yi yiVar, int i10) {
        super("translation", 0);
        this.f28858b = i10;
        switch (i10) {
            case 1:
                this.f28859c = yiVar;
                super("openProgress", 0);
                return;
            default:
                this.f28859c = yiVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f28858b) {
            case 0:
                qi qiVar = (qi) obj;
                yi yiVar = this.f28859c;
                yiVar.f33281d0 = f7;
                qi qiVar2 = yiVar.C0;
                if (qiVar2 != null) {
                    if (!(qiVar2 instanceof hn) && !(yiVar.B0 instanceof hn)) {
                        qiVar2.setAlpha(f7);
                        yiVar.C0.v(f7);
                        qi qiVar3 = yiVar.C0;
                        lo loVar = yiVar.m0;
                        int i11 = 0;
                        if (qiVar3 == loVar || yiVar.B0 == loVar) {
                            if (qiVar3 == loVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            yiVar.e2(i10);
                        }
                        qi qiVar4 = yiVar.C0;
                        lo loVar2 = yiVar.f33312n0;
                        if (qiVar4 == loVar2 || yiVar.B0 == loVar2) {
                            if (qiVar4 == loVar2) {
                                i11 = 1;
                            }
                            yiVar.e2(i11);
                        }
                        yiVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        yiVar.B0.v(1.0f - Math.min(1.0f, f7 / 0.7f));
                        yiVar.B0.l(yiVar.f33317o2);
                    } else {
                        int max = Math.max(qiVar2.getWidth(), yiVar.B0.getWidth());
                        if (yiVar.C0 instanceof hn) {
                            yiVar.B0.setTranslationX((-max) * f7);
                            yiVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            yiVar.B0.setTranslationX(max * f7);
                            yiVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (yiVar.f33343w1 != null) {
                        yiVar.e2(1);
                    }
                    yiVar.b1();
                    viewGroup = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                yi yiVar2 = (yi) obj;
                bi biVar = this.f28859c.B1;
                int childCount = biVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = biVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = is.f27501g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(is.f27503j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (is.f27502i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ti) {
                        ((ti) childAt).f31265a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f28858b) {
            case 0:
                qi qiVar = (qi) obj;
                return Float.valueOf(this.f28859c.f33281d0);
            default:
                yi yiVar = (yi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
