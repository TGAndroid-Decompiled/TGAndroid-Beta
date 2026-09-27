package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ki1;
import org.telegram.ui.oh1;
public final class cl0 extends AnimatorListenerAdapter {
    public final int f23357a;
    public final Object f23358b;
    public final Object f23359c;

    public cl0(int i10, Object obj, Object obj2) {
        this.f23357a = i10;
        this.f23359c = obj;
        this.f23358b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23357a) {
            case 11:
                ((ProfileActivity) this.f23359c).C5 = null;
                return;
            case 12:
                org.telegram.ui.y21 y21Var = (org.telegram.ui.y21) this.f23359c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f23358b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, y21Var.e[0], iArr[0]), i0.a.d(floatValue, y21Var.e[1], iArr[1]), i0.a.d(floatValue, y21Var.e[2], iArr[2]), i0.a.d(floatValue, y21Var.e[3], iArr[3])}, 0, y21Var.e, 0, 4);
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f23357a;
        Object obj = this.f23358b;
        Object obj2 = this.f23359c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.xq xqVar = (org.telegram.ui.xq) obj2;
                ((dl0) xqVar.d).f23690g.remove((AnimatorSet) obj);
                if (((dl0) xqVar.d).f23690g.isEmpty()) {
                    ((dl0) xqVar.d).f23687b.clear();
                    dl0 dl0Var = (dl0) xqVar.d;
                    dl0Var.d = true;
                    dl0Var.f23686a.invalidate();
                    return;
                }
                return;
            case 1:
                kp0 kp0Var = (kp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(kp0Var.B);
                } catch (Exception unused) {
                }
                dp0 dp0Var = kp0Var.C;
                if (dp0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(dp0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                cw0 cw0Var = (cw0) gVar.f1884c;
                cw0Var.f23434f0 = 1.0f;
                cw0Var.S.add((yv0) obj);
                ((cw0) gVar.f1884c).f23426a0.setShader(null);
                ((cw0) gVar.f1884c).f23430c0.setShader(null);
                ((cw0) gVar.f1884c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                px0 px0Var = (px0) obj2;
                px0Var.f27481b = 0.0f;
                px0Var.invalidate();
                ((wm0) obj).invalidate();
                return;
            case 4:
                org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) obj2;
                l3Var.d.setText((String) obj);
                l3Var.d.setTranslationY(0.0f);
                l3Var.d.setAlpha(1.0f);
                return;
            case 5:
                ((org.telegram.ui.Components.voip.l3) obj2).removeView((org.telegram.ui.Components.voip.k3) obj);
                return;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.ty) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.i80 i80Var = (org.telegram.ui.i80) obj2;
                i80Var.removeView((p30) obj);
                i80Var.e = null;
                i80Var.f34388a = null;
                i80Var.f34389b = false;
                return;
            case 8:
                hw0 hw0Var = (hw0) obj2;
                hw0Var.setVisibility(8);
                hw0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ef0 ef0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ef0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ef0Var.f24056f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ef0Var.f24059s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ef0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ef0Var.h = true;
                ef0Var.f24057n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ef0Var.f24059s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ef0Var, ef0Var.E, 0.0f, 1.0f));
                ef0Var.f24059s.setDuration(250L);
                ef0Var.f24059s.setInterpolator(new OvershootInterpolator(1.01f));
                ef0Var.f24059s.addListener(new cf0(ef0Var, 0));
                ef0Var.f24059s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f31414z2, photoViewer.f31220d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(sr.f28360g);
                photoViewer.A2.addListener(new org.telegram.ui.ap0(this, 2));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.dx0 dx0Var = (org.telegram.ui.dx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.f33062n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != dx0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.C5 != null) {
                    if (profileActivity.F5) {
                        if (profileActivity.L0) {
                            profileActivity.Q0.setVisibility(8);
                        }
                        if (profileActivity.M0) {
                            profileActivity.R0.setVisibility(8);
                        }
                        if (profileActivity.N0) {
                            profileActivity.S0.setVisibility(8);
                        }
                        profileActivity.T0.setVisibility(8);
                    } else {
                        org.telegram.ui.e01 e01Var = profileActivity.O;
                        if (e01Var.s0(e01Var.f26188k0[0].F)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.O.f26202r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f31596j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.ap0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.y21 y21Var = (org.telegram.ui.y21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, y21Var.e, 0, 4);
                }
                y21Var.f40116n = null;
                y21Var.f40118s = null;
                nc0 nc0Var = y21Var.h;
                nc0Var.K = 1.0f;
                nc0Var.i();
                y21Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.f41 f41Var = (org.telegram.ui.f41) obj2;
                if (f41Var.h != null) {
                    f41Var.h = null;
                    f41Var.f33415n.unlock();
                    ((org.telegram.ui.rx) obj).onTransitionAnimationEnd(true, false);
                    f41Var.e = 1.0f;
                    f41Var.g();
                    f41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.yu0 yu0Var = (org.telegram.ui.yu0) obj;
                if (yu0Var != null) {
                    yu0Var.f40325a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f31764s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.xz0(this, 11));
                return;
            case 15:
                ((org.telegram.ui.s61) obj).run();
                org.telegram.ui.c71 c71Var = (org.telegram.ui.c71) obj2;
                org.telegram.ui.r51 r51Var = c71Var.X0;
                if (r51Var != null) {
                    r51Var.dismiss();
                    c71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                oh1 oh1Var = (oh1) obj2;
                oh1Var.removeView((p30) obj);
                oh1Var.e = null;
                oh1Var.f36211a = null;
                oh1Var.f36212b = false;
                UsersSelectActivity usersSelectActivity = oh1Var.f36214f;
                usersSelectActivity.f31898c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f31898c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ki1 ki1Var = (ki1) obj2;
                ki1Var.f35055e0.setScaleX(1.15f);
                ki1Var.f35055e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ki1Var.f35055e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ki1Var.f35055e0.setVisibility(8);
                return;
            case 18:
                qg.a2 a2Var = (qg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f41607r0.b(a2Var.f41614y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.f41615z0 = 1.0f;
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f42208a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                ((rg.x0) obj2).f42872w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                rg.k1 k1Var = (rg.k1) obj2;
                k1Var.H0 = false;
                k1Var.G0 = 1.0f;
                k1Var.f42690s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(27, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 22:
                ci.aa aaVar = (ci.aa) obj2;
                aaVar.removeView((p30) obj);
                aaVar.h.clear();
                aaVar.f4357b = null;
                aaVar.f4358c = false;
                ((xg.i) aaVar.f4360n).f46097b.setAllowDrawCursor(true);
                return;
            default:
                yh.p8 p8Var = (yh.p8) obj2;
                p8Var.f47943b.remove((yh.o8) obj);
                p8Var.a1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23357a) {
            case 8:
                ((hw0) this.f23358b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public cl0(Object obj, View view, int i10) {
        this.f23357a = i10;
        this.f23358b = obj;
        this.f23359c = view;
    }
}
