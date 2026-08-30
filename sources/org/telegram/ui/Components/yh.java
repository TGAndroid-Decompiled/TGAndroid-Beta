package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends m6 {
    public final int f31021b;
    public final li f31022c;

    public yh(li liVar, int i10) {
        super("translation", 0);
        this.f31021b = i10;
        switch (i10) {
            case 1:
                this.f31022c = liVar;
                super("openProgress", 0);
                return;
            default:
                this.f31022c = liVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        int i10;
        float f11;
        switch (this.f31021b) {
            case 0:
                di diVar = (di) obj;
                li liVar = this.f31022c;
                liVar.f26682a0 = f10;
                di diVar2 = liVar.f26752w0;
                if (diVar2 != null) {
                    if (!(diVar2 instanceof om) && !(liVar.f26748v0 instanceof om)) {
                        diVar2.setAlpha(f10);
                        liVar.f26752w0.s(f10);
                        di diVar3 = liVar.f26752w0;
                        qn qnVar = liVar.f26711j0;
                        int i11 = 0;
                        if (diVar3 == qnVar || liVar.f26748v0 == qnVar) {
                            if (diVar3 == qnVar) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            liVar.a2(i10);
                        }
                        di diVar4 = liVar.f26752w0;
                        qn qnVar2 = liVar.f26714k0;
                        if (diVar4 == qnVar2 || liVar.f26748v0 == qnVar2) {
                            if (diVar4 == qnVar2) {
                                i11 = 1;
                            }
                            liVar.a2(i11);
                        }
                        liVar.f26752w0.setTranslationY(AndroidUtilities.dp(78.0f) * f10);
                        liVar.f26748v0.s(1.0f - Math.min(1.0f, f10 / 0.7f));
                        liVar.f26748v0.k(liVar.f26710i2);
                    } else {
                        int max = Math.max(diVar2.getWidth(), liVar.f26748v0.getWidth());
                        if (liVar.f26752w0 instanceof om) {
                            liVar.f26748v0.setTranslationX((-max) * f10);
                            liVar.f26752w0.setTranslationX((1.0f - f10) * max);
                        } else {
                            liVar.f26748v0.setTranslationX(max * f10);
                            liVar.f26752w0.setTranslationX((1.0f - f10) * (-max));
                        }
                    }
                    if (liVar.f26732q1 != null) {
                        liVar.a2(1);
                    }
                    liVar.Z0();
                    viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                li liVar2 = (li) obj;
                nh nhVar = this.f31022c.f26749v1;
                int childCount = nhVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    float f12 = (3 - i12) * 32.0f;
                    View childAt = nhVar.getChildAt(i12);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = nr.f27347g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(nr.f27349j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            if (f15 <= 100.0f) {
                                f11 = 1.1f - (nr.f27348i.getInterpolation(f15 / 100.0f) * 0.1f);
                            } else {
                                f11 = 1.0f;
                            }
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof gi) {
                        ((gi) childAt).f25143a.setAttachScale(f11);
                    }
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f31021b) {
            case 0:
                di diVar = (di) obj;
                return Float.valueOf(this.f31022c.f26682a0);
            default:
                li liVar = (li) obj;
                return Float.valueOf(0.0f);
        }
    }
}
