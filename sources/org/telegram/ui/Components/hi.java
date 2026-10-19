package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class hi extends s6 {
    public final int f26882b;
    public final ti f26883c;

    public hi(ti tiVar, int i10) {
        super("translation", 0);
        this.f26882b = i10;
        switch (i10) {
            case 1:
                this.f26883c = tiVar;
                super("openProgress", 0);
                return;
            default:
                this.f26883c = tiVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        int i10;
        float f10;
        switch (this.f26882b) {
            case 0:
                li liVar = (li) obj;
                ti tiVar = this.f26883c;
                tiVar.f30529d0 = f7;
                li liVar2 = tiVar.C0;
                if (liVar2 != null) {
                    if (!(liVar2 instanceof bn) && !(tiVar.B0 instanceof bn)) {
                        liVar2.setAlpha(f7);
                        tiVar.C0.v(f7);
                        li liVar3 = tiVar.C0;
                        fo foVar = tiVar.m0;
                        int i11 = 0;
                        if (liVar3 == foVar || tiVar.B0 == foVar) {
                            if (liVar3 == foVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            tiVar.e2(i10);
                        }
                        li liVar4 = tiVar.C0;
                        fo foVar2 = tiVar.f30559n0;
                        if (liVar4 == foVar2 || tiVar.B0 == foVar2) {
                            if (liVar4 == foVar2) {
                                i11 = 1;
                            }
                            tiVar.e2(i11);
                        }
                        tiVar.C0.setTranslationY(AndroidUtilities.dp(78.0f) * f7);
                        tiVar.B0.v(1.0f - Math.min(1.0f, f7 / 0.7f));
                        tiVar.B0.l(tiVar.f30564o2);
                    } else {
                        int max = Math.max(liVar2.getWidth(), tiVar.B0.getWidth());
                        if (tiVar.C0 instanceof bn) {
                            tiVar.B0.setTranslationX((-max) * f7);
                            tiVar.C0.setTranslationX((1.0f - f7) * max);
                        } else {
                            tiVar.B0.setTranslationX(max * f7);
                            tiVar.C0.setTranslationX((1.0f - f7) * (-max));
                        }
                    }
                    if (tiVar.f30590w1 != null) {
                        tiVar.e2(1);
                    }
                    tiVar.b1();
                    viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                ti tiVar2 = (ti) obj;
                xh xhVar = this.f26883c.B1;
                int childCount = xhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f11 = (3 - i12) * 32.0f;
                    View childAt = xhVar.getChildAt(i12);
                    if (f7 > f11) {
                        float f12 = f7 - f11;
                        if (f12 <= 200.0f) {
                            float f13 = f12 / 200.0f;
                            f10 = bs.f25015g.getInterpolation(f13) * 1.1f;
                            childAt.setAlpha(bs.f25017j.getInterpolation(f13));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f14 = f12 - 200.0f;
                            if (f14 <= 100.0f) {
                                f10 = 1.1f - (bs.f25016i.getInterpolation(f14 / 100.0f) * 0.1f);
                            } else {
                                f10 = 1.0f;
                            }
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (childAt instanceof oi) {
                        ((oi) childAt).f29006a.setAttachScale(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f26882b) {
            case 0:
                li liVar = (li) obj;
                return Float.valueOf(this.f26883c.f30529d0);
            default:
                ti tiVar = (ti) obj;
                return Float.valueOf(0.0f);
        }
    }
}
