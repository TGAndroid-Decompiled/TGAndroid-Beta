package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;
public final class bm extends AnimatorListenerAdapter {
    public final int f36828a;
    public final Object f36829b;

    public bm(Object obj, int i10) {
        this.f36828a = i10;
        this.f36829b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f9;
        switch (this.f36828a) {
            case 2:
                dq dqVar = (dq) this.f36829b;
                org.telegram.ui.Components.ir irVar = dqVar.h;
                if (dqVar.D) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                irVar.b(f9);
                dqVar.h.invalidateSelf();
                return;
            case 17:
                ((org.telegram.ui.Components.rl) this.f36829b).f32335a.K = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f36828a) {
            case 0:
                dm dmVar = (dm) this.f36829b;
                em emVar = dmVar.f37560b;
                ArrayList arrayList = emVar.M.f42857j6;
                org.telegram.ui.Cells.s1 s1Var = dmVar.f37559a;
                arrayList.remove(s1Var);
                View view = emVar.M.fragmentView;
                if (view != null) {
                    view.invalidate();
                    emVar.M.f42973t0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f25195x0 = false;
                return;
            case 1:
                np npVar = (np) this.f36829b;
                npVar.H = 0.0f;
                npVar.G = 1.0f;
                View view2 = npVar.W;
                if (view2 != null) {
                    view2.invalidate();
                }
                npVar.P.invalidate();
                ui uiVar = npVar.U;
                if (uiVar != null) {
                    uiVar.run();
                    npVar.U = null;
                    return;
                }
                return;
            case 2:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                pq pqVar = (pq) this.f36829b;
                View view3 = pqVar.f41446b;
                view3.setAlpha(1.0f);
                f2.w0.x0(view3);
                ((jr) pqVar.d).f39624c.removeView(view3);
                return;
            case 4:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f36829b;
                g6Var.d = null;
                g6Var.f28763b.clear();
                return;
            case 5:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f36829b;
                animatedPhoneNumberEditText.f26079n = null;
                animatedPhoneNumberEditText.f26078f.clear();
                return;
            case 6:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f36829b;
                n6Var.c();
                n6Var.f30869k = null;
                n6Var.h = 0.0f;
                n6Var.f30871m = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.f30873o = null;
                CharSequence charSequence = n6Var.f30874p;
                if (charSequence != null) {
                    n6Var.q(charSequence, true, n6Var.f30875q);
                    n6Var.f30874p = null;
                    n6Var.f30875q = false;
                    return;
                }
                org.telegram.ui.Components.ig igVar = n6Var.C;
                if (igVar != null) {
                    igVar.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.f36829b;
                t9Var.setVisibility(8);
                t9Var.setImageDrawable(null);
                t9Var.setAlpha(1.0f);
                return;
            case 8:
                org.telegram.ui.Components.b9 b9Var = ((org.telegram.ui.Components.p8) this.f36829b).f31614b;
                b9Var.f27007f = false;
                b9Var.f27006e.setVisibility(8);
                return;
            case 9:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.f36829b;
                if (g9Var.f28827f != null) {
                    g9Var.f28826e = 1.0f;
                    g9Var.n();
                    if (g9Var.f28828g) {
                        g9Var.f28828g = false;
                        Runnable runnable2 = g9Var.f28830j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    g9Var.f();
                }
                g9Var.f28827f = null;
                return;
            case 10:
                ((org.telegram.ui.Components.lf) this.f36829b).f30302f.U.setVisibility(8);
                return;
            case 11:
                ((org.telegram.ui.Components.og) this.f36829b).W = 1.0f;
                return;
            case 12:
                ((org.telegram.ui.Components.vh) this.f36829b).f33561c.f31044s.setVisibility(8);
                return;
            case 13:
                ((org.telegram.ui.Components.xh) this.f36829b).d.v.setVisibility(8);
                return;
            case 14:
                org.telegram.ui.Components.ni niVar = (org.telegram.ui.Components.ni) this.f36829b;
                niVar.V0 = null;
                if (!niVar.f31025m1) {
                    if (niVar.T0.getTag() == null && niVar.M0 == 0 && !niVar.P0) {
                        niVar.W0.setVisibility(4);
                    }
                    niVar.f31002e1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = niVar.f30988a1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 15:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.f36829b;
                jkVar.f29679s.setVisibility(8);
                jkVar.f29677n = 0;
                org.telegram.ui.Components.xj xjVar = jkVar.f29678r;
                xjVar.setAlpha(1.0f);
                xjVar.setScaleX(1.0f);
                xjVar.setScaleY(1.0f);
                xjVar.setTranslationX(0.0f);
                xjVar.invalidate();
                return;
            case 16:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) this.f36829b;
                if (ikVar.T.D.getTag() == null) {
                    ikVar.T.D.setVisibility(4);
                }
                ikVar.T.E = null;
                return;
            case 17:
                org.telegram.ui.Components.rl rlVar = (org.telegram.ui.Components.rl) this.f36829b;
                if (animator.equals(rlVar.f32335a.K)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.f32335a;
                    chatAttachAlertPhotoLayout.V = true;
                    chatAttachAlertPhotoLayout.K = null;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.km kmVar = (org.telegram.ui.Components.km) this.f36829b;
                org.telegram.ui.Components.lm lmVar = kmVar.L;
                lmVar.F = null;
                lmVar.G = false;
                kmVar.invalidate();
                return;
            case 19:
                org.telegram.ui.Components.gp gpVar = (org.telegram.ui.Components.gp) this.f36829b;
                nh.pa paVar = gpVar.N;
                if (paVar != null) {
                    if (paVar.getParent() != null) {
                        ((ViewGroup) gpVar.N.getParent()).removeView(gpVar.N);
                    }
                    gpVar.N = null;
                }
                gpVar.P = null;
                super.onAnimationEnd(animator);
                return;
            case 20:
                CheckBox checkBox = (CheckBox) this.f36829b;
                if (animator.equals(checkBox.f26306s)) {
                    checkBox.f26306s = null;
                }
                if (!checkBox.f26308x) {
                    checkBox.C = null;
                    return;
                }
                return;
            case 21:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f36829b;
                if (animator.equals(checkBoxBase.f26323p)) {
                    checkBoxBase.f26323p = null;
                }
                if (!checkBoxBase.f26324q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.gq gqVar = (org.telegram.ui.Components.gq) this.f36829b;
                if (gqVar.G == gqVar.H) {
                    gqVar.C.setVisibility(4);
                }
                gqVar.f28956y = null;
                return;
            case 23:
                org.telegram.ui.Components.pq pqVar2 = (org.telegram.ui.Components.pq) this.f36829b;
                pqVar2.f31740l = 1.0f;
                pqVar2.f31743o = null;
                pqVar2.f31744p = null;
                pqVar2.f31745q = null;
                View view4 = pqVar2.H;
                if (view4 != null) {
                    if (pqVar2.h == 0 && pqVar2.G) {
                        view4.setVisibility(8);
                    }
                    pqVar2.H.invalidate();
                }
                pqVar2.f31733c = -1;
                return;
            case 24:
                org.telegram.ui.Components.au auVar = (org.telegram.ui.Components.au) this.f36829b;
                auVar.K = false;
                auVar.d.setTranslationY(0.0f);
                auVar.d.setAlpha(0.0f);
                auVar.c(0.0f);
                auVar.N = 0.0f;
                auVar.j();
                return;
            case 25:
                ((org.telegram.ui.Components.iu) this.f36829b).f29474a.K = false;
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.av) this.f36829b).d = null;
                return;
            case 27:
                ((org.telegram.ui.Components.fz) this.f36829b).S = null;
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.ny) this.f36829b).f31198n = null;
                return;
            case 29:
                ((org.telegram.ui.Components.d00) this.f36829b).a();
                return;
        }
    }

    public bm(pq pqVar, f2.w0 w0Var) {
        this.f36828a = 3;
        this.f36829b = pqVar;
    }
}
