package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class l6 extends AnimatorListenerAdapter {
    public final int f26624a;
    public final Object f26625b;

    public l6(Object obj, int i10) {
        this.f26624a = i10;
        this.f26625b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26624a) {
            case 12:
                ((jm) this.f26625b).f26075a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26624a) {
            case 0:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f26625b;
                animatedPhoneNumberEditText.f22543n = null;
                animatedPhoneNumberEditText.f22542f.clear();
                return;
            case 1:
                super.onAnimationEnd(animator);
                r6 r6Var = (r6) this.f26625b;
                r6Var.b();
                r6Var.f28446o = null;
                r6Var.f28441j = 0.0f;
                r6Var.f28444m = 0.0f;
                r6Var.f28443l = 0.0f;
                r6Var.f28442k = 0.0f;
                r6Var.f28449r = 0.0f;
                r6Var.f28448q = 0.0f;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.f28436b0;
                if (runnable != null) {
                    runnable.run();
                }
                r6Var.f28451t = null;
                CharSequence charSequence = r6Var.f28452u;
                if (charSequence != null) {
                    r6Var.t(charSequence, true, r6Var.v);
                    r6Var.f28452u = null;
                    r6Var.v = false;
                    return;
                }
                qg qgVar = r6Var.I;
                if (qgVar != null) {
                    qgVar.run();
                    return;
                }
                return;
            case 2:
                z9 z9Var = (z9) this.f26625b;
                z9Var.setVisibility(8);
                z9Var.setImageDrawable(null);
                z9Var.setAlpha(1.0f);
                return;
            case 3:
                h9 h9Var = ((v8) this.f26625b).f29595b;
                h9Var.f25214f = false;
                h9Var.e.setVisibility(8);
                return;
            case 4:
                m9 m9Var = (m9) this.f26625b;
                if (m9Var.f27011f != null) {
                    m9Var.e = 1.0f;
                    m9Var.n();
                    if (m9Var.f27012g) {
                        m9Var.f27012g = false;
                        Runnable runnable2 = m9Var.f27014j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    m9Var.f();
                }
                m9Var.f27011f = null;
                return;
            case 5:
                ((tf) this.f26625b).f29054f.f22557b0.setVisibility(8);
                return;
            case 6:
                ((wg) this.f26625b).f30552d0 = 1.0f;
                return;
            case 7:
                ((vi) ((ci) this.f26625b).d).f29711s.setVisibility(8);
                return;
            case 8:
                ((ei) this.f26625b).d.v.setVisibility(8);
                return;
            case 9:
                vi viVar = (vi) this.f26625b;
                viVar.f29663c1 = null;
                if (!viVar.f29716t1) {
                    if (viVar.f29656a1.getTag() == null && viVar.T0 == 0 && !viVar.W0) {
                        viVar.f29666d1.setVisibility(4);
                    }
                    viVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = viVar.f29679h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                pk pkVar = (pk) this.f26625b;
                pkVar.f28043s.setVisibility(8);
                pkVar.f28041n = 0;
                ek ekVar = pkVar.f28042r;
                ekVar.setAlpha(1.0f);
                ekVar.setScaleX(1.0f);
                ekVar.setScaleY(1.0f);
                ekVar.setTranslationX(0.0f);
                ekVar.invalidate();
                return;
            case 11:
                ok okVar = (ok) this.f26625b;
                if (okVar.X.H.getTag() == null) {
                    okVar.X.H.setVisibility(4);
                }
                okVar.X.I = null;
                return;
            case 12:
                jm jmVar = (jm) this.f26625b;
                if (animator.equals(jmVar.f26075a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.f26075a;
                    chatAttachAlertPhotoLayout.f22727c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 13:
                dn dnVar = (dn) this.f26625b;
                en enVar = dnVar.P;
                enVar.J = null;
                enVar.K = false;
                dnVar.invalidate();
                return;
            case 14:
                zp zpVar = (zp) this.f26625b;
                di.sb sbVar = zpVar.R;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) zpVar.R.getParent()).removeView(zpVar.R);
                    }
                    zpVar.R = null;
                }
                zpVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 15:
                CheckBox checkBox = (CheckBox) this.f26625b;
                if (animator.equals(checkBox.f22775s)) {
                    checkBox.f22775s = null;
                }
                if (!checkBox.f22777x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 16:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f26625b;
                if (animator.equals(checkBoxBase.f22791p)) {
                    checkBoxBase.f22791p = null;
                }
                if (!checkBoxBase.f22792q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 17:
                zq zqVar = (zq) this.f26625b;
                if (zqVar.K == zqVar.L) {
                    zqVar.G.setVisibility(4);
                }
                zqVar.f31677y = null;
                return;
            case 18:
                ir irVar = (ir) this.f26625b;
                irVar.f25725l = 1.0f;
                irVar.f25728o = null;
                irVar.f25729p = null;
                irVar.f25730q = null;
                View view = irVar.H;
                if (view != null) {
                    if (irVar.h == 0 && irVar.G) {
                        view.setVisibility(8);
                    }
                    irVar.H.invalidate();
                }
                irVar.f25719c = -1;
                return;
            case 19:
                vu vuVar = (vu) this.f26625b;
                vuVar.O = false;
                vuVar.d.setTranslationY(0.0f);
                vuVar.d.setAlpha(0.0f);
                vuVar.c(0.0f);
                vuVar.R = 0.0f;
                vuVar.j();
                return;
            case 20:
                ((dv) this.f26625b).f24189a.O = false;
                return;
            case 21:
                super.onAnimationEnd(animator);
                ((vv) this.f26625b).d = null;
                return;
            case 22:
                ((wz) this.f26625b).W = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ez) this.f26625b).f24521n = null;
                return;
            case 24:
                ((u00) this.f26625b).a();
                return;
            case 25:
                w00 w00Var = (w00) this.f26625b;
                w00Var.U = w00Var.f30366c0;
                w00Var.f30364b0 = w00Var.f30370f0;
                w00Var.V = w00Var.f30367d0;
                w00Var.W = w00Var.f30368e0;
                w00Var.f30366c0 = -1;
                w00Var.f30367d0 = -1;
                w00Var.f30368e0 = -1;
                w00Var.f30370f0 = -1;
                return;
            case 26:
                k10 k10Var = (k10) this.f26625b;
                k10Var.f26174s = 1.0f;
                k10Var.invalidate();
                return;
            case 27:
                o60 o60Var = (o60) this.f26625b;
                if (animator == o60Var.W) {
                    o60Var.c(true);
                    o60Var.setVisibility(4);
                    return;
                }
                return;
            case 28:
                l80 l80Var = (l80) this.f26625b;
                j80 j80Var = l80Var.f26672x;
                if (j80Var != null) {
                    j80Var.setProgress(1.0f);
                    l80Var.f26672x.invalidate();
                }
                l80Var.m0 = null;
                return;
            default:
                x00 x00Var = (x00) this.f26625b;
                ((v80) x00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) x00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
        }
    }
}
