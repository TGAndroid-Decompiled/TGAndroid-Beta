package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class l6 extends AnimatorListenerAdapter {
    public final int f26944a;
    public final Object f26945b;

    public l6(Object obj, int i10) {
        this.f26944a = i10;
        this.f26945b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26944a) {
            case 12:
                ((km) this.f26945b).f26730a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26944a) {
            case 0:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f26945b;
                animatedPhoneNumberEditText.f22843n = null;
                animatedPhoneNumberEditText.f22842f.clear();
                return;
            case 1:
                super.onAnimationEnd(animator);
                r6 r6Var = (r6) this.f26945b;
                r6Var.b();
                r6Var.f28759o = null;
                r6Var.f28754j = 0.0f;
                r6Var.f28757m = 0.0f;
                r6Var.f28756l = 0.0f;
                r6Var.f28755k = 0.0f;
                r6Var.f28762r = 0.0f;
                r6Var.f28761q = 0.0f;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.f28749b0;
                if (runnable != null) {
                    runnable.run();
                }
                r6Var.f28764t = null;
                CharSequence charSequence = r6Var.f28765u;
                if (charSequence != null) {
                    r6Var.t(charSequence, true, r6Var.v);
                    r6Var.f28765u = null;
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
                z9 z9Var = (z9) this.f26945b;
                z9Var.setVisibility(8);
                z9Var.setImageDrawable(null);
                z9Var.setAlpha(1.0f);
                return;
            case 3:
                h9 h9Var = ((v8) this.f26945b).f29915b;
                h9Var.f25569f = false;
                h9Var.e.setVisibility(8);
                return;
            case 4:
                m9 m9Var = (m9) this.f26945b;
                if (m9Var.f27309f != null) {
                    m9Var.e = 1.0f;
                    m9Var.n();
                    if (m9Var.f27310g) {
                        m9Var.f27310g = false;
                        Runnable runnable2 = m9Var.f27312j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    m9Var.f();
                }
                m9Var.f27309f = null;
                return;
            case 5:
                ((tf) this.f26945b).f29367f.f22857b0.setVisibility(8);
                return;
            case 6:
                ((wg) this.f26945b).f30871d0 = 1.0f;
                return;
            case 7:
                ((vi) ((ci) this.f26945b).d).f30040s.setVisibility(8);
                return;
            case 8:
                ((ei) this.f26945b).d.v.setVisibility(8);
                return;
            case 9:
                vi viVar = (vi) this.f26945b;
                viVar.f29992c1 = null;
                if (!viVar.f30045t1) {
                    if (viVar.f29985a1.getTag() == null && viVar.T0 == 0 && !viVar.W0) {
                        viVar.f29995d1.setVisibility(4);
                    }
                    viVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = viVar.f30008h1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                pk pkVar = (pk) this.f26945b;
                pkVar.f28355s.setVisibility(8);
                pkVar.f28353n = 0;
                ek ekVar = pkVar.f28354r;
                ekVar.setAlpha(1.0f);
                ekVar.setScaleX(1.0f);
                ekVar.setScaleY(1.0f);
                ekVar.setTranslationX(0.0f);
                ekVar.invalidate();
                return;
            case 11:
                ok okVar = (ok) this.f26945b;
                if (okVar.X.H.getTag() == null) {
                    okVar.X.H.setVisibility(4);
                }
                okVar.X.I = null;
                return;
            case 12:
                km kmVar = (km) this.f26945b;
                if (animator.equals(kmVar.f26730a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kmVar.f26730a;
                    chatAttachAlertPhotoLayout.f23027c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 13:
                dn dnVar = (dn) this.f26945b;
                en enVar = dnVar.P;
                enVar.J = null;
                enVar.K = false;
                dnVar.invalidate();
                return;
            case 14:
                zp zpVar = (zp) this.f26945b;
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
                CheckBox checkBox = (CheckBox) this.f26945b;
                if (animator.equals(checkBox.f23075s)) {
                    checkBox.f23075s = null;
                }
                if (!checkBox.f23077x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 16:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f26945b;
                if (animator.equals(checkBoxBase.f23091p)) {
                    checkBoxBase.f23091p = null;
                }
                if (!checkBoxBase.f23092q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 17:
                zq zqVar = (zq) this.f26945b;
                if (zqVar.K == zqVar.L) {
                    zqVar.G.setVisibility(4);
                }
                zqVar.f31974y = null;
                return;
            case 18:
                ir irVar = (ir) this.f26945b;
                irVar.f26062l = 1.0f;
                irVar.f26065o = null;
                irVar.f26066p = null;
                irVar.f26067q = null;
                View view = irVar.H;
                if (view != null) {
                    if (irVar.h == 0 && irVar.G) {
                        view.setVisibility(8);
                    }
                    irVar.H.invalidate();
                }
                irVar.f26056c = -1;
                return;
            case 19:
                vu vuVar = (vu) this.f26945b;
                vuVar.O = false;
                vuVar.d.setTranslationY(0.0f);
                vuVar.d.setAlpha(0.0f);
                vuVar.c(0.0f);
                vuVar.R = 0.0f;
                vuVar.j();
                return;
            case 20:
                ((dv) this.f26945b).f24495a.O = false;
                return;
            case 21:
                super.onAnimationEnd(animator);
                ((vv) this.f26945b).d = null;
                return;
            case 22:
                ((wz) this.f26945b).W = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ez) this.f26945b).f24826n = null;
                return;
            case 24:
                ((u00) this.f26945b).a();
                return;
            case 25:
                w00 w00Var = (w00) this.f26945b;
                w00Var.U = w00Var.f30700c0;
                w00Var.f30698b0 = w00Var.f30704f0;
                w00Var.V = w00Var.f30701d0;
                w00Var.W = w00Var.f30702e0;
                w00Var.f30700c0 = -1;
                w00Var.f30701d0 = -1;
                w00Var.f30702e0 = -1;
                w00Var.f30704f0 = -1;
                return;
            case 26:
                k10 k10Var = (k10) this.f26945b;
                k10Var.f26539s = 1.0f;
                k10Var.invalidate();
                return;
            case 27:
                o60 o60Var = (o60) this.f26945b;
                if (animator == o60Var.W) {
                    o60Var.c(true);
                    o60Var.setVisibility(4);
                    return;
                }
                return;
            case 28:
                m80 m80Var = (m80) this.f26945b;
                k80 k80Var = m80Var.f27302x;
                if (k80Var != null) {
                    k80Var.setProgress(1.0f);
                    m80Var.f27302x.invalidate();
                }
                m80Var.m0 = null;
                return;
            default:
                x00 x00Var = (x00) this.f26945b;
                ((w80) x00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) x00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
        }
    }
}
