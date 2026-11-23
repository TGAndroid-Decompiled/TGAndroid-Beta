package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class y extends AnimatorListenerAdapter {
    public final int f42275a;
    public final Object f42276b;

    public y(Object obj, int i7) {
        this.f42275a = i7;
        this.f42276b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42275a) {
            case 14:
                ((bm) this.f42276b).f33855a.P = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42275a) {
            case 0:
                z zVar = (z) this.f42276b;
                zVar.O = null;
                zVar.M = zVar.N;
                zVar.requestLayout();
                return;
            case 1:
                g6 g6Var = (g6) this.f42276b;
                g6Var.d = null;
                g6Var.f35429b.clear();
                return;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f42276b;
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
                return;
            case 3:
                super.onAnimationEnd(animator);
                n6 n6Var = (n6) this.f42276b;
                n6Var.b();
                n6Var.f37809o = null;
                n6Var.f37804j = 0.0f;
                n6Var.f37807m = 0.0f;
                n6Var.f37806l = 0.0f;
                n6Var.f37805k = 0.0f;
                n6Var.f37812r = 0.0f;
                n6Var.f37811q = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.f37799c0;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.f37814t = null;
                CharSequence charSequence = n6Var.f37815u;
                if (charSequence != null) {
                    n6Var.t(charSequence, true, n6Var.v);
                    n6Var.f37815u = null;
                    n6Var.v = false;
                    return;
                }
                og ogVar = n6Var.J;
                if (ogVar != null) {
                    ogVar.run();
                    return;
                }
                return;
            case 4:
                q9 q9Var = (q9) this.f42276b;
                q9Var.setVisibility(8);
                q9Var.setImageDrawable(null);
                q9Var.setAlpha(1.0f);
                return;
            case 5:
                y8 y8Var = (y8) ((org.telegram.messenger.c9) this.f42276b).n1;
                y8Var.f42350f = false;
                y8Var.f42349e.setVisibility(8);
                return;
            case 6:
                d9 d9Var = (d9) this.f42276b;
                if (d9Var.f34428f != null) {
                    d9Var.f34427e = 1.0f;
                    d9Var.k();
                    if (d9Var.f34429g) {
                        d9Var.f34429g = false;
                        Runnable runnable2 = d9Var.f34431j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    d9Var.d();
                }
                d9Var.f34428f = null;
                return;
            case 7:
                ((jf) this.f42276b).f36488f.f32589c0.setVisibility(8);
                return;
            case 8:
                ((ug) this.f42276b).f40338g0 = 1.0f;
                return;
            case 9:
                ((ui) ((yh) this.f42276b).d).f40432u1.setVisibility(8);
                return;
            case 10:
                ((bi) this.f42276b).d.f40436v1.setVisibility(8);
                return;
            case 11:
                ui uiVar = (ui) this.f42276b;
                uiVar.X2 = null;
                if (!uiVar.f40411o3) {
                    if (uiVar.V2.getTag() == null && uiVar.O2 == 0 && !uiVar.R2) {
                        uiVar.Y2.setVisibility(4);
                    }
                    uiVar.f40386g3.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = uiVar.f40375c3;
                if (q0Var != null) {
                    q0Var.setVisibility(4);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                mk mkVar = (mk) this.f42276b;
                mkVar.f37536s.setVisibility(8);
                mkVar.f37534n = 0;
                ak akVar = mkVar.f37535r;
                akVar.setAlpha(1.0f);
                akVar.setScaleX(1.0f);
                akVar.setScaleY(1.0f);
                akVar.setTranslationX(0.0f);
                akVar.invalidate();
                return;
            case 13:
                lk lkVar = (lk) this.f42276b;
                if (lkVar.Y.I.getTag() == null) {
                    lkVar.Y.I.setVisibility(4);
                }
                lkVar.Y.J = null;
                return;
            case 14:
                bm bmVar = (bm) this.f42276b;
                if (animator.equals(bmVar.f33855a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bmVar.f33855a;
                    chatAttachAlertPhotoLayout.f32809d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    return;
                }
                return;
            case 15:
                qm qmVar = (qm) this.f42276b;
                rm rmVar = qmVar.Q;
                rmVar.K = null;
                rmVar.L = false;
                qmVar.invalidate();
                return;
            case 16:
                om omVar = (om) this.f42276b;
                omVar.f38287b.R = true;
                omVar.O.f38637z.invalidate();
                return;
            case 17:
                np npVar = (np) this.f42276b;
                i01 i01Var = npVar.L1;
                if (i01Var != null) {
                    if (i01Var.getParent() != null) {
                        ((ViewGroup) npVar.L1.getParent()).removeView(npVar.L1);
                    }
                    npVar.L1 = null;
                }
                npVar.N1 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                i01 i01Var2 = (i01) this.f42276b;
                i01Var2.f36096c = null;
                i01Var2.f36094a.setShader(null);
                i01Var2.f36099n = null;
                i01Var2.f36100r = null;
                i01Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(i01Var2);
                return;
            case 19:
                CheckBox checkBox = (CheckBox) this.f42276b;
                if (animator.equals(checkBox.f32856s)) {
                    checkBox.f32856s = null;
                }
                if (!checkBox.f32859y) {
                    checkBox.H = null;
                    return;
                }
                return;
            case 20:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f42276b;
                if (animator.equals(checkBoxBase.f32873p)) {
                    checkBoxBase.f32873p = null;
                }
                if (!checkBoxBase.f32874q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 21:
                sq sqVar = (sq) this.f42276b;
                sqVar.f39661l = 1.0f;
                sqVar.f39664o = null;
                sqVar.f39665p = null;
                sqVar.f39666q = null;
                View view = sqVar.H;
                if (view != null) {
                    if (sqVar.h == 0 && sqVar.G) {
                        view.setVisibility(8);
                    }
                    sqVar.H.invalidate();
                }
                sqVar.f39654c = -1;
                return;
            case 22:
                yt ytVar = (yt) this.f42276b;
                ytVar.P = false;
                ytVar.d.setTranslationY(0.0f);
                ytVar.d.setAlpha(0.0f);
                ytVar.c(0.0f);
                ytVar.S = 0.0f;
                ytVar.j();
                return;
            case 23:
                ((fu) this.f42276b).f35316a.J1 = false;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((xu) this.f42276b).d = null;
                return;
            case 25:
                ((ty) this.f42276b).f40080a0 = null;
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((cy) this.f42276b).f34329n = null;
                return;
            case 27:
                ((pz) this.f42276b).a();
                return;
            case 28:
                e00 e00Var = (e00) this.f42276b;
                e00Var.f34631w = 1.0f;
                e00Var.invalidate();
                return;
            default:
                b50 b50Var = (b50) this.f42276b;
                if (animator == b50Var.f33737b0) {
                    b50Var.d(true);
                    b50Var.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
