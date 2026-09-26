package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ki extends r6 {
    public final int f25791b;
    public final wi f25792c;

    public ki(wi wiVar, int i10) {
        super("translation", 0);
        this.f25791b = i10;
        switch (i10) {
            case 1:
                this.f25792c = wiVar;
                super("openProgress", 0);
                return;
            default:
                this.f25792c = wiVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f25791b) {
            case 0:
                oi oiVar = (oi) obj;
                wi wiVar = this.f25792c;
                wiVar.f29998d0 = f7;
                oi oiVar2 = wiVar.f30069z0;
                if (oiVar2 != null) {
                    if (!(oiVar2 instanceof rm) && !(wiVar.f30066y0 instanceof rm)) {
                        oiVar2.setAlpha(f7);
                        wiVar.f30069z0.s(f7);
                        oi oiVar3 = wiVar.f30069z0;
                        vn vnVar = wiVar.m0;
                        int i11 = 0;
                        if (oiVar3 == vnVar || wiVar.f30066y0 == vnVar) {
                            if (oiVar3 == vnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            wiVar.a2(i10);
                        }
                        oi oiVar4 = wiVar.f30069z0;
                        vn vnVar2 = wiVar.f30028n0;
                        if (oiVar4 == vnVar2 || wiVar.f30066y0 == vnVar2) {
                            if (oiVar4 == vnVar2) {
                                i11 = 1;
                            }
                            wiVar.a2(i11);
                        }
                        wiVar.f30069z0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        wiVar.f30066y0.s(1.0f - Math.min(1.0f, f7 / 0.7f));
                        wiVar.f30066y0.k(wiVar.f30024l2);
                    } else {
                        int max = Math.max(oiVar2.getWidth(), wiVar.f30066y0.getWidth());
                        if (wiVar.f30069z0 instanceof rm) {
                            wiVar.f30066y0.setTranslationX((-max) * f7);
                            wiVar.f30069z0.setTranslationX((1.0f - f7) * max);
                        } else {
                            wiVar.f30066y0.setTranslationX(max * f7);
                            wiVar.f30069z0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (wiVar.f30049t1 != null) {
                        wiVar.a2(1);
                    }
                    wiVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                wi wiVar2 = (wi) obj;
                zh zhVar = this.f25792c.f30067y1;
                int childCount = zhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = zhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = rr.f28031g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(rr.f28033j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (rr.f28032i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof ri) {
                        ((ri) childAt).f27975a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25791b) {
            case 0:
                oi oiVar = (oi) obj;
                return Float.valueOf(this.f25792c.f29998d0);
            default:
                wi wiVar = (wi) obj;
                return Float.valueOf(0.0f);
        }
    }
}
