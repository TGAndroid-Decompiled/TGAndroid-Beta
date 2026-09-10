package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.bq;
import org.telegram.ui.cd;
import org.telegram.ui.cm;
import org.telegram.ui.dr;
import org.telegram.ui.ec;
import org.telegram.ui.fj;
import org.telegram.ui.il;
import org.telegram.ui.jm;
import org.telegram.ui.nc;
import org.telegram.ui.ok;
import org.telegram.ui.om;
import org.telegram.ui.pm;
import org.telegram.ui.rq;
import org.telegram.ui.wb;
import org.telegram.ui.wr;
import org.telegram.ui.zi;
public final class v5 extends AnimatorListenerAdapter {
    public final int f20547a;
    public final Object f20548b;

    public v5(Object obj, int i10) {
        this.f20547a = i10;
        this.f20548b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f20547a) {
            case 1:
                r7 r7Var = (r7) this.f20548b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    return;
                }
                return;
            case 14:
                rq rqVar = (rq) this.f20548b;
                vr vrVar = rqVar.h;
                if (rqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                vrVar.b(f7);
                rqVar.h.invalidateSelf();
                return;
            case 29:
                ((bm) this.f20548b).f21857a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f20547a) {
            case 0:
                AndroidUtilities.runOnUIThread(((w5) this.f20548b).e, 1000L);
                return;
            case 1:
                r7 r7Var = (r7) this.f20548b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    return;
                }
                return;
            case 2:
                u7 u7Var = (u7) this.f20548b;
                u7Var.f20509n.isMediaSpoilersRevealedInSharedMedia = true;
                u7Var.invalidate();
                return;
            case 3:
                super.onAnimationEnd(animator);
                ha haVar = (ha) this.f20548b;
                ((ia) haVar.f19285b).f19322a.getTransitionParams().j();
                ((ia) haVar.f19285b).f19322a.getTransitionParams().f19945g = false;
                ((ia) haVar.f19285b).f19322a.getTransitionParams().K1 = 1.0f;
                return;
            case 4:
                org.telegram.ui.j3 j3Var = (org.telegram.ui.j3) this.f20548b;
                if (animator.equals(((wb) j3Var.f33864b).V)) {
                    ((wb) j3Var.f33864b).V = null;
                    return;
                }
                return;
            case 5:
                wb wbVar = (wb) this.f20548b;
                if (animator.equals(wbVar.V)) {
                    wbVar.V = null;
                    return;
                }
                return;
            case 6:
                ((ec) this.f20548b).I.setVisibility(8);
                return;
            case 7:
                cd cdVar = (cd) this.f20548b;
                nc ncVar = cdVar.m0;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) cdVar.m0.getParent()).removeView(cdVar.m0);
                    }
                    cdVar.m0 = null;
                }
                cdVar.f31626o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 8:
                ok okVar = (ok) this.f20548b;
                okVar.setAnimatedTop(0);
                View view = okVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    okVar.F1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.F1.getLayoutParams().height) + okVar.S1);
                }
                okVar.f35509q5.f32447p9 = null;
                return;
            case 9:
                s40 s40Var = ((zi) this.f20548b).f39353b.f32309e2;
                if (s40Var != null) {
                    s40Var.setVisibility(8);
                    return;
                }
                return;
            case 10:
                cm cmVar = (cm) this.f20548b;
                if (cmVar.f31736a) {
                    cmVar.d.setTranslationY(0.0f);
                }
                if (cmVar.f31737b) {
                    cmVar.e.setTranslationY(0.0f);
                }
                if (cmVar.f31739f) {
                    cmVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = cmVar.f31738c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                cmVar.f31740n.H2[1] = null;
                return;
            case 11:
                jm jmVar = (jm) ((bi.u3) this.f20548b).f3714c;
                il ilVar = ((pm) jmVar.f34135c).Q.f32271b3;
                if (ilVar != null) {
                    ilVar.setIsMessageTransition(false);
                    ((pm) jmVar.f34135c).Q.f32271b3.h(true);
                    ((pm) jmVar.f34135c).Q.f32271b3.setVisibility(4);
                    return;
                }
                return;
            case 12:
                om omVar = (om) this.f20548b;
                pm pmVar = omVar.f35513b;
                ArrayList arrayList = pmVar.Q.f32422n6;
                t1 t1Var = omVar.f35512a;
                arrayList.remove(t1Var);
                View view2 = pmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    pmVar.Q.f32542x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f20016x0 = false;
                return;
            case 13:
                bq bqVar = (bq) this.f20548b;
                bqVar.L = 0.0f;
                bqVar.K = 1.0f;
                View view3 = bqVar.f31317a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                bqVar.T.invalidate();
                fj fjVar = bqVar.Y;
                if (fjVar != null) {
                    fjVar.run();
                    bqVar.Y = null;
                    return;
                }
                return;
            case 14:
            default:
                super.onAnimationEnd(animator);
                return;
            case 15:
                dr drVar = (dr) this.f20548b;
                View view4 = drVar.f31961b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((wr) drVar.d).f38323c.removeView(view4);
                return;
            case 16:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f20548b;
                g6Var.d = null;
                g6Var.f23250b.clear();
                return;
            case 17:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f20548b;
                animatedPhoneNumberEditText.f20810n = null;
                animatedPhoneNumberEditText.f20809f.clear();
                return;
            case 18:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f20548b;
                n6Var.c();
                n6Var.f25431k = null;
                n6Var.h = 0.0f;
                n6Var.f25433m = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.f25435o = null;
                CharSequence charSequence = n6Var.f25436p;
                if (charSequence != null) {
                    n6Var.q(charSequence, true, n6Var.f25437q);
                    n6Var.f25436p = null;
                    n6Var.f25437q = false;
                    return;
                }
                rg rgVar = n6Var.C;
                if (rgVar != null) {
                    rgVar.run();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f20548b;
                w9Var2.setVisibility(8);
                w9Var2.setImageDrawable(null);
                w9Var2.setAlpha(1.0f);
                return;
            case 20:
                org.telegram.ui.Components.d9 d9Var = ((org.telegram.ui.Components.r8) this.f20548b).f26626b;
                d9Var.f22330f = false;
                d9Var.e.setVisibility(8);
                return;
            case 21:
                org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) this.f20548b;
                if (i9Var.f23938f != null) {
                    i9Var.e = 1.0f;
                    i9Var.n();
                    if (i9Var.f23939g) {
                        i9Var.f23939g = false;
                        Runnable runnable2 = i9Var.f23941j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    i9Var.f();
                }
                i9Var.f23938f = null;
                return;
            case 22:
                ((tf) this.f20548b).f27401f.f20824b0.setVisibility(8);
                return;
            case 23:
                ((xg) this.f20548b).f29023d0 = 1.0f;
                return;
            case 24:
                ((fi) this.f20548b).f23012c.f29405s.setVisibility(8);
                return;
            case 25:
                ((hi) this.f20548b).d.v.setVisibility(8);
                return;
            case 26:
                yi yiVar = (yi) this.f20548b;
                yiVar.Z0 = null;
                if (!yiVar.f29399q1) {
                    if (yiVar.X0.getTag() == null && yiVar.Q0 == 0 && !yiVar.T0) {
                        yiVar.f29350a1.setVisibility(4);
                    }
                    yiVar.f29376i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = yiVar.f29363e1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                tk tkVar = (tk) this.f20548b;
                tkVar.f27429s.setVisibility(8);
                tkVar.f27427n = 0;
                ik ikVar = tkVar.f27428r;
                ikVar.setAlpha(1.0f);
                ikVar.setScaleX(1.0f);
                ikVar.setScaleY(1.0f);
                ikVar.setTranslationX(0.0f);
                ikVar.invalidate();
                return;
            case 28:
                sk skVar = (sk) this.f20548b;
                if (skVar.X.H.getTag() == null) {
                    skVar.X.H.setVisibility(4);
                }
                skVar.X.I = null;
                return;
            case 29:
                bm bmVar = (bm) this.f20548b;
                if (animator.equals(bmVar.f21857a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bmVar.f21857a;
                    chatAttachAlertPhotoLayout.f20992c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
        }
    }

    public v5(dr drVar, s4.o0 o0Var) {
        this.f20547a = 15;
        this.f20548b = drVar;
    }
}
