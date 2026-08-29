package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.oh1;
import org.telegram.ui.sg1;
public final class ok0 extends AnimatorListenerAdapter {
    public final int f31380a;
    public final Object f31381b;
    public final Object f31382c;

    public ok0(int i10, Object obj, Object obj2) {
        this.f31380a = i10;
        this.f31382c = obj;
        this.f31381b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31380a) {
            case 12:
                ((ProfileActivity) this.f31382c).f36154y5 = null;
                return;
            case 13:
                org.telegram.ui.a21 a21Var = (org.telegram.ui.a21) this.f31382c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f31381b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, a21Var.f36406e[0], iArr[0]), i0.a.d(floatValue, a21Var.f36406e[1], iArr[1]), i0.a.d(floatValue, a21Var.f36406e[2], iArr[2]), i0.a.d(floatValue, a21Var.f36406e[3], iArr[3])}, 0, a21Var.f36406e, 0, 4);
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
        int i10 = this.f31380a;
        Object obj = this.f31381b;
        Object obj2 = this.f31382c;
        switch (i10) {
            case 0:
                p00 p00Var = (p00) obj;
                p00Var.setAlpha(1.0f);
                f2.w0.x0(p00Var);
                pk0 pk0Var = (pk0) obj2;
                pk0Var.f31700c.remove(p00Var);
                pk0Var.f31698a.removeView(p00Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                org.telegram.ui.pq pqVar = (org.telegram.ui.pq) obj2;
                ((pk0) pqVar.d).f31703g.remove((AnimatorSet) obj);
                if (((pk0) pqVar.d).f31703g.isEmpty()) {
                    ((pk0) pqVar.d).f31699b.clear();
                    pk0 pk0Var2 = (pk0) pqVar.d;
                    pk0Var2.d = true;
                    pk0Var2.f31698a.invalidate();
                    return;
                }
                return;
            case 2:
                po0 po0Var = (po0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(po0Var.B);
                } catch (Exception unused) {
                }
                ii0 ii0Var = po0Var.C;
                if (ii0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ii0Var);
                    return;
                }
                return;
            case 3:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                hv0 hv0Var = (hv0) gVar.f862c;
                hv0Var.f29239b0 = 1.0f;
                hv0Var.O.add((dv0) obj);
                ((hv0) gVar.f862c).T.setShader(null);
                ((hv0) gVar.f862c).V.setShader(null);
                ((hv0) gVar.f862c).N();
                super.onAnimationEnd(animator);
                return;
            case 4:
                vw0 vw0Var = (vw0) obj2;
                vw0Var.f34195b = 0.0f;
                vw0Var.invalidate();
                ((fm0) obj).invalidate();
                return;
            case 5:
                org.telegram.ui.Components.voip.m3 m3Var = (org.telegram.ui.Components.voip.m3) obj2;
                m3Var.d.setText((String) obj);
                m3Var.d.setTranslationY(0.0f);
                m3Var.d.setAlpha(1.0f);
                return;
            case 6:
                ((org.telegram.ui.Components.voip.m3) obj2).removeView((org.telegram.ui.Components.voip.l3) obj);
                return;
            case 7:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.fy) obj2).N3 = null;
                return;
            case 8:
                org.telegram.ui.r70 r70Var = (org.telegram.ui.r70) obj2;
                r70Var.removeView((j30) obj);
                r70Var.f41989e = null;
                r70Var.f41986a = null;
                r70Var.f41987b = false;
                return;
            case 9:
                mv0 mv0Var = (mv0) obj2;
                mv0Var.setVisibility(8);
                mv0Var.setX(0.0f);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                pe0 pe0Var = photoViewer.f35866y1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = pe0Var.f31659e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pe0Var.f31660f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = pe0Var.f31663s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = pe0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                pe0Var.h = true;
                pe0Var.f31661n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                pe0Var.f31663s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(pe0Var, pe0Var.A, 0.0f, 1.0f));
                pe0Var.f31663s.setDuration(250L);
                pe0Var.f31663s.setInterpolator(new OvershootInterpolator(1.01f));
                pe0Var.f31663s.addListener(new ne0(pe0Var, 0));
                pe0Var.f31663s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.f35848w2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f35838v2, photoViewer.Z3, 0.0f));
                photoViewer.f35848w2.setDuration(85L);
                photoViewer.f35848w2.setInterpolator(jr.f29801g);
                photoViewer.f35848w2.addListener(new org.telegram.ui.e50(this, 9));
                photoViewer.f35848w2.start();
                return;
            case 11:
                org.telegram.ui.ew0 ew0Var = (org.telegram.ui.ew0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ew0Var.f37915n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.Q.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i11);
                    if (childAt != ew0Var.f37913e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.f36154y5 != null) {
                    if (profileActivity.B5) {
                        if (profileActivity.H0) {
                            profileActivity.M0.setVisibility(8);
                        }
                        if (profileActivity.I0) {
                            profileActivity.N0.setVisibility(8);
                        }
                        if (profileActivity.J0) {
                            profileActivity.O0.setVisibility(8);
                        }
                        profileActivity.P0.setVisibility(8);
                    } else {
                        org.telegram.ui.hz0 hz0Var = profileActivity.K;
                        if (hz0Var.s0(hz0Var.f32070g0[0].B)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.K.f32083n0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.f36160z5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f36026f5, 1.0f));
                        profileActivity.f36160z5.setDuration(100L);
                        profileActivity.f36160z5.addListener(new org.telegram.ui.e50(this, 21));
                        profileActivity.f36160z5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.f36154y5 = null;
                return;
            case 13:
                org.telegram.ui.a21 a21Var = (org.telegram.ui.a21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, a21Var.f36406e, 0, 4);
                }
                a21Var.f36408n = null;
                a21Var.f36410s = null;
                yb0 yb0Var = a21Var.h;
                yb0Var.K = 1.0f;
                yb0Var.i();
                a21Var.h.s(1.0f);
                return;
            case 14:
                org.telegram.ui.h31 h31Var = (org.telegram.ui.h31) obj2;
                if (h31Var.h != null) {
                    h31Var.h = null;
                    h31Var.f38761n.unlock();
                    ((org.telegram.ui.hx) obj).onTransitionAnimationEnd(true, false);
                    h31Var.f38759e = 1.0f;
                    h31Var.g();
                    h31Var.d(false);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.zt0 zt0Var = (org.telegram.ui.zt0) obj;
                if (zt0Var != null) {
                    zt0Var.f45316a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f36222s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ky0(this, 13));
                return;
            case 16:
                ((org.telegram.ui.t51) obj).run();
                org.telegram.ui.d61 d61Var = (org.telegram.ui.d61) obj2;
                org.telegram.ui.s41 s41Var = d61Var.T0;
                if (s41Var != null) {
                    s41Var.dismiss();
                    d61Var.T0 = null;
                    return;
                }
                return;
            case 17:
                sg1 sg1Var = (sg1) obj2;
                sg1Var.removeView((j30) obj);
                sg1Var.f42389e = null;
                sg1Var.f42386a = null;
                sg1Var.f42387b = false;
                UsersSelectActivity usersSelectActivity = sg1Var.f42390f;
                usersSelectActivity.f36352c.setAllowDrawCursor(true);
                if (usersSelectActivity.K.isEmpty()) {
                    usersSelectActivity.f36352c.setHintVisible(true, true);
                    return;
                }
                return;
            case 18:
                ((Runnable) obj).run();
                oh1 oh1Var = (oh1) obj2;
                oh1Var.f41137a0.setScaleX(1.15f);
                oh1Var.f41137a0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oh1Var.f41137a0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                oh1Var.f41137a0.setVisibility(8);
                return;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.f46870a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                return;
            case 20:
                tf.g gVar2 = (tf.g) obj2;
                gVar2.f48255b.clear();
                gVar2.f48255b.add((vf.d) obj);
                return;
            case 21:
                super.onAnimationEnd(animator);
                tf.g gVar3 = (tf.g) obj2;
                gVar3.f48258c.clear();
                gVar3.f48258c.add((vf.b) obj);
                return;
            case 22:
                th.x1 x1Var = (th.x1) obj2;
                x1Var.A = false;
                x1Var.v.setAlpha(1.0f);
                x1Var.v.f26204v1.setVisibility(0);
                x1Var.f48876x.p(AndroidUtilities.dp(22.0f));
                x1Var.f48876x.setAlpha(255);
                sg.f fVar = x1Var.f48869s;
                fVar.f48051e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            default:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f26369g0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31380a) {
            case 9:
                ((mv0) this.f31381b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ok0(Object obj, View view, int i10) {
        this.f31380a = i10;
        this.f31381b = obj;
        this.f31382c = view;
    }

    public ok0(pk0 pk0Var, p00 p00Var, f2.w0 w0Var) {
        this.f31380a = 0;
        this.f31382c = pk0Var;
        this.f31381b = p00Var;
    }
}
