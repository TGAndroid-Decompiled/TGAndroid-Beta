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

public final class am extends AnimatorListenerAdapter {

    public final int f36561a;

    public final Object f36562b;

    public am(Object obj, int i10) {
        this.f36561a = i10;
        this.f36562b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36561a) {
            case 2:
                dq dqVar = (dq) this.f36562b;
                dqVar.h.b(dqVar.D ? 1.0f : 0.0f);
                dqVar.h.invalidateSelf();
                break;
            case 17:
                ((org.telegram.ui.Components.jl) this.f36562b).f29717a.K = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f36561a) {
            case 0:
                cm cmVar = (cm) this.f36562b;
                dm dmVar = cmVar.f37115b;
                ArrayList arrayList = dmVar.M.f42096j6;
                org.telegram.ui.Cells.s1 s1Var = cmVar.f37114a;
                arrayList.remove(s1Var);
                View view = dmVar.M.fragmentView;
                if (view != null) {
                    view.invalidate();
                    dmVar.M.f42213t0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f25190x0 = false;
                break;
            case 1:
                mp mpVar = (mp) this.f36562b;
                mpVar.H = 0.0f;
                mpVar.G = 1.0f;
                View view2 = mpVar.W;
                if (view2 != null) {
                    view2.invalidate();
                }
                mpVar.P.invalidate();
                ti tiVar = mpVar.U;
                if (tiVar != null) {
                    tiVar.run();
                    mpVar.U = null;
                }
                break;
            case 2:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                pq pqVar = (pq) this.f36562b;
                View view3 = pqVar.f41409b;
                view3.setAlpha(1.0f);
                f2.x0.x0(view3);
                ((lr) pqVar.d).f40185c.removeView(view3);
                break;
            case 4:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.f36562b;
                b6Var.d = null;
                b6Var.f26948b.clear();
                break;
            case 5:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f36562b;
                animatedPhoneNumberEditText.f26064n = null;
                animatedPhoneNumberEditText.f26063f.clear();
                break;
            case 6:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f36562b;
                i6Var.c();
                i6Var.f29246k = null;
                i6Var.h = 0.0f;
                i6Var.f29248m = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.f29250o = null;
                CharSequence charSequence = i6Var.f29251p;
                if (charSequence == null) {
                    org.telegram.ui.Components.bg bgVar = i6Var.C;
                    if (bgVar != null) {
                        bgVar.run();
                    }
                } else {
                    i6Var.q(charSequence, true, i6Var.f29252q);
                    i6Var.f29251p = null;
                    i6Var.f29252q = false;
                }
                break;
            case 7:
                org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) this.f36562b;
                n9Var.setVisibility(8);
                n9Var.setImageDrawable(null);
                n9Var.setAlpha(1.0f);
                break;
            case 8:
                org.telegram.ui.Components.v8 v8Var = ((org.telegram.ui.Components.j8) this.f36562b).f29641b;
                v8Var.f33299f = false;
                v8Var.f33298e.setVisibility(8);
                break;
            case 9:
                org.telegram.ui.Components.a9 a9Var = (org.telegram.ui.Components.a9) this.f36562b;
                if (a9Var.f26666f != null) {
                    a9Var.f26665e = 1.0f;
                    a9Var.n();
                    if (a9Var.f26667g) {
                        a9Var.f26667g = false;
                        Runnable runnable2 = a9Var.f26669j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    a9Var.f();
                }
                a9Var.f26666f = null;
                break;
            case 10:
                ((org.telegram.ui.Components.df) this.f36562b).f27736f.U.setVisibility(8);
                break;
            case 11:
                ((org.telegram.ui.Components.hg) this.f36562b).W = 1.0f;
                break;
            case 12:
                ((org.telegram.ui.Components.oh) this.f36562b).f31304c.f28689s.setVisibility(8);
                break;
            case 13:
                ((org.telegram.ui.Components.qh) this.f36562b).d.v.setVisibility(8);
                break;
            case 14:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) this.f36562b;
                giVar.V0 = null;
                if (!giVar.f28670m1) {
                    if (giVar.T0.getTag() == null && giVar.M0 == 0 && !giVar.P0) {
                        giVar.W0.setVisibility(4);
                    }
                    giVar.f28647e1.setVisibility(4);
                } else {
                    org.telegram.ui.ActionBar.v0 v0Var = giVar.f28633a1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                }
                break;
            case 15:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.bk bkVar = (org.telegram.ui.Components.bk) this.f36562b;
                bkVar.f27116s.setVisibility(8);
                bkVar.f27114n = 0;
                org.telegram.ui.Components.qj qjVar = bkVar.f27115r;
                qjVar.setAlpha(1.0f);
                qjVar.setScaleX(1.0f);
                qjVar.setScaleY(1.0f);
                qjVar.setTranslationX(0.0f);
                qjVar.invalidate();
                break;
            case 16:
                org.telegram.ui.Components.ak akVar = (org.telegram.ui.Components.ak) this.f36562b;
                if (akVar.T.D.getTag() == null) {
                    akVar.T.D.setVisibility(4);
                }
                akVar.T.E = null;
                break;
            case 17:
                org.telegram.ui.Components.jl jlVar = (org.telegram.ui.Components.jl) this.f36562b;
                if (animator.equals(jlVar.f29717a.K)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jlVar.f29717a;
                    chatAttachAlertPhotoLayout.V = true;
                    chatAttachAlertPhotoLayout.K = null;
                }
                break;
            case 18:
                org.telegram.ui.Components.dm dmVar2 = (org.telegram.ui.Components.dm) this.f36562b;
                org.telegram.ui.Components.em emVar = dmVar2.L;
                emVar.F = null;
                emVar.G = false;
                dmVar2.invalidate();
                break;
            case 19:
                org.telegram.ui.Components.ap apVar = (org.telegram.ui.Components.ap) this.f36562b;
                lh.bb bbVar = apVar.N;
                if (bbVar != null) {
                    if (bbVar.getParent() != null) {
                        ((ViewGroup) apVar.N.getParent()).removeView(apVar.N);
                    }
                    apVar.N = null;
                }
                apVar.P = null;
                super.onAnimationEnd(animator);
                break;
            case 20:
                CheckBox checkBox = (CheckBox) this.f36562b;
                if (animator.equals(checkBox.f26291s)) {
                    checkBox.f26291s = null;
                }
                if (!checkBox.f26293x) {
                    checkBox.C = null;
                }
                break;
            case 21:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f36562b;
                if (animator.equals(checkBoxBase.f26308p)) {
                    checkBoxBase.f26308p = null;
                }
                if (!checkBoxBase.f26309q) {
                    checkBoxBase.C = null;
                }
                break;
            case 22:
                org.telegram.ui.Components.aq aqVar = (org.telegram.ui.Components.aq) this.f36562b;
                if (aqVar.G == aqVar.H) {
                    aqVar.C.setVisibility(4);
                }
                aqVar.f26805y = null;
                break;
            case 23:
                org.telegram.ui.Components.jq jqVar = (org.telegram.ui.Components.jq) this.f36562b;
                jqVar.f29784l = 1.0f;
                jqVar.f29787o = null;
                jqVar.f29788p = null;
                jqVar.f29789q = null;
                View view4 = jqVar.H;
                if (view4 != null) {
                    if (jqVar.h == 0 && jqVar.G) {
                        view4.setVisibility(8);
                    }
                    jqVar.H.invalidate();
                }
                jqVar.f29777c = -1;
                break;
            case 24:
                org.telegram.ui.Components.tt ttVar = (org.telegram.ui.Components.tt) this.f36562b;
                ttVar.K = false;
                ttVar.d.setTranslationY(0.0f);
                ttVar.d.setAlpha(0.0f);
                ttVar.c(0.0f);
                ttVar.N = 0.0f;
                ttVar.j();
                break;
            case 25:
                ((org.telegram.ui.Components.bu) this.f36562b).f27212a.K = false;
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.tu) this.f36562b).d = null;
                break;
            case 27:
                ((org.telegram.ui.Components.yy) this.f36562b).S = null;
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.gy) this.f36562b).f28871n = null;
                break;
            case 29:
                ((org.telegram.ui.Components.wz) this.f36562b).a();
                break;
        }
    }

    public am(pq pqVar, f2.x0 x0Var) {
        this.f36561a = 3;
        this.f36562b = pqVar;
    }
}
