package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ji extends u6 {
    public final int f26365b;
    public final vi f26366c;

    public ji(vi viVar, int i10) {
        super("translation", 0);
        this.f26365b = i10;
        switch (i10) {
            case 1:
                this.f26366c = viVar;
                super("openProgress", 0);
                return;
            default:
                this.f26366c = viVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f26365b) {
            case 0:
                ni niVar = (ni) obj;
                vi viVar = this.f26366c;
                viVar.f29994d0 = f7;
                ni niVar2 = viVar.C0;
                if (niVar2 != null) {
                    if (!(niVar2 instanceof en) && !(viVar.B0 instanceof en)) {
                        niVar2.setAlpha(f7);
                        viVar.C0.v(f7);
                        ni niVar3 = viVar.C0;
                        io ioVar = viVar.m0;
                        int i11 = 0;
                        if (niVar3 == ioVar || viVar.B0 == ioVar) {
                            if (niVar3 == ioVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            viVar.e2(i10);
                        }
                        ni niVar4 = viVar.C0;
                        io ioVar2 = viVar.f30024n0;
                        if (niVar4 == ioVar2 || viVar.B0 == ioVar2) {
                            if (niVar4 == ioVar2) {
                                i11 = 1;
                            }
                            viVar.e2(i11);
                        }
                        viVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        viVar.B0.v(1.0f - Math.min(1.0f, f7 / 0.7f));
                        viVar.B0.l(viVar.f30029o2);
                    } else {
                        int max = Math.max(niVar2.getWidth(), viVar.B0.getWidth());
                        if (viVar.C0 instanceof en) {
                            viVar.B0.setTranslationX((-max) * f7);
                            viVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            viVar.B0.setTranslationX(max * f7);
                            viVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (viVar.f30055w1 != null) {
                        viVar.e2(1);
                    }
                    viVar.b1();
                    viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                vi viVar2 = (vi) obj;
                yh yhVar = this.f26366c.B1;
                int childCount = yhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = yhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = es.f24772g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(es.f24774j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (es.f24773i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof qi) {
                        ((qi) childAt).f28613a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f26365b) {
            case 0:
                ni niVar = (ni) obj;
                return Float.valueOf(this.f26366c.f29994d0);
            default:
                vi viVar = (vi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
